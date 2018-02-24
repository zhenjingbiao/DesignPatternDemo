package MVPTest;
/*
 * Created by jingbiaozhen on 2017/10/9.
 **/

public class LoginPresenterImpl implements LoginPresenter, LoginInteractor.onLoginFinishedListener
{
    private LoginView mLoginView;

    private LoginInteractor mLoginInteractor;

    public LoginPresenterImpl(LoginView loginView)
    {
        mLoginView = loginView;
        mLoginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void validateCredentials(String username, String password)
    {
        // 验证登录信息
        if (mLoginView != null)
        {
            mLoginView.showProgress();
        }
        mLoginInteractor.login(username, password, this);

    }

    @Override
    public void destory()
    {
        mLoginView = null;

    }

    @Override
    public void onUsernameError()
    {
        if (mLoginView != null)
        {
            mLoginView.setUsernameError();
            mLoginView.hideProgress();
        }

    }

    @Override
    public void onPassWordError()
    {
        if (mLoginView != null)
        {
            mLoginView.setPasswordError();
            mLoginView.hideProgress();
        }

    }

    @Override
    public void onSuccess()
    {
        if (mLoginView != null)
        {
            mLoginView.navigateToHome();
        }

    }
}
