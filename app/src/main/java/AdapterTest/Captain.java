package AdapterTest;
/*
 * Created by jingbiaozhen on 2017/10/6.
 **/

public class Captain implements RowingBoat {
    private RowingBoat mRowingBoat;
    public Captain(){}
    public Captain(RowingBoat rowingBoat){
        mRowingBoat=rowingBoat;
    }
    public void setRowingBoat(RowingBoat boat){
        mRowingBoat=boat;
    }
    @Override
    public String row() {
       return  mRowingBoat.row();
    }
}
