package ProxyTest.StaticProxy;
/*
 * Created by jingbiaozhen on 2017/10/7.
 **/

public class Lawyer implements ILawsuit {
    private ILawsuit mILawsuit;
    public Lawyer(ILawsuit lawsuit){
        mILawsuit=lawsuit;
    }
    @Override
    public String submit() {
        return mILawsuit.submit();
    }

    @Override
    public String burden() {
        return mILawsuit.burden();
    }

    @Override
    public String defend() {
        return mILawsuit.defend();
    }

    @Override
    public String finish() {
        return mILawsuit.finish();
    }
}
