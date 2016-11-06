package deqo.mbh.MySimpleStack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.omg.PortableInterceptor.Interceptor;

import static org.junit.Assert.*;

/**
 * Created by MONTASSER on 05/11/2016.
 */
public class SimpleStackImplTest {

    SimpleStack simpleStack;

    @Before
    public void setUp() throws Exception {
        simpleStack = new SimpleStackImpl();
        System.out.print("Je suis exécuté avant chaque test !");
    }

    @Test
    public void isEmpty() throws Exception {
        Assert.assertEquals(true, simpleStack.isEmpty());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        Assert.assertEquals(false, simpleStack.isEmpty());
    }

    @Test
    public void getSize() throws Exception {
        Assert.assertEquals(0, simpleStack.getSize());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        simpleStack.push(new Item(new String(element1+"2")));
        // la taille doit augmenter de 2
        Assert.assertEquals(2, simpleStack.getSize());
    }

    @Test
    public void push() throws Exception {
        Item item = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(item);
        //la pile doit etre augmenter de un item
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        //on doit retrouver l'objet initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(item.getValue(), integer);
    }

    @Test
    public void peek() throws Exception {
        Item item = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(item);
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        //on doit pas supprimer l'objet de la pile
        Assert.assertEquals(1, simpleStack.getSize());
        // on doit retrouver l'objet initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer i = (Integer)o.getValue();
        Assert.assertEquals(8, i.intValue());
        Assert.assertEquals(item.getValue(), i);
    }

    @Test
    public void pop() throws Exception {
        Item item = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(item);
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.pop();
        // l'objet doit etre supprimé de la pile
        Assert.assertEquals(0, simpleStack.getSize());
        // on doit retrouver l'objet initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer i = (Integer)o.getValue();
        Assert.assertEquals(8, i.intValue());
        Assert.assertEquals(item.getValue(), i);
    }

}