package AdapterTest;
/*
 * Created by jingbiaozhen on 2017/10/6.
 **/

public class FinshingAdapter implements RowingBoat
{
    private FinshBoat mFinshBoat;

    public FinshingAdapter()
    {
        mFinshBoat = new FinshBoat();
    }

    @Override
    public String row()
    {
       return mFinshBoat.sail();
    }
}
