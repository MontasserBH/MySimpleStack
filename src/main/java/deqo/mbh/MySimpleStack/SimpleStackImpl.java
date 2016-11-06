package deqo.mbh.MySimpleStack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by MONTASSER on 05/11/2016.
 *
 */
public class SimpleStackImpl implements SimpleStack {

    Stack<Object> stack = new Stack<Object>();

    public boolean isEmpty() {

        return stack.isEmpty();
    }


    public int getSize() {

        return stack.size();
    }


    public void push(Item item) {
        stack.push(item);
    }


    public Item peek() throws EmptyStackException {

        return (Item) stack.peek();
    }


    public Item pop() throws EmptyStackException {

        return (Item) stack.pop();
    }

}
