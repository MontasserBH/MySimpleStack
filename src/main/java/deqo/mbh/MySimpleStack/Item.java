package deqo.mbh.MySimpleStack;

/**
 * Created by MONTASSER on 05/11/2016.
 */
public class Item {

    private Object value;

    Item(Object value){
        setValue(value);
    }

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
