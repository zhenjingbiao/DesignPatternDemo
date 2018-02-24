package MVPTest;
/*
 * Created by jingbiaozhen on 2017/10/9.
 **/

public interface LoginInteractor {
    interface onLoginFinishedListener{
       void onUsernameError();
       void onPassWordError();
       void onSuccess();
    }
    void login(String username,String password,onLoginFinishedListener listener);
}
