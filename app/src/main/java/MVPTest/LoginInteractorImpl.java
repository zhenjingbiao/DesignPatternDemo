package MVPTest;
/*
 * Created by jingbiaozhen on 2017/10/9.
 **/

import android.os.Handler;
import android.text.TextUtils;

public class LoginInteractorImpl implements LoginInteractor {
    @Override
    public void login(final String username, final String password, final onLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error=false;
                if(TextUtils.isEmpty(username)){
                    listener.onUsernameError();
                    error=true;
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    listener.onPassWordError();
                    error=true;
                    return;
                }
                if(!error){
                    listener.onSuccess();
                }

            }
        },2000);
    }
}
