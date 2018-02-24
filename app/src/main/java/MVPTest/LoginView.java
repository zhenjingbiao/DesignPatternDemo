package MVPTest;
/*
 * Created by jingbiaozhen on 2017/10/9.
 **/

public interface LoginView
{
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();

}
