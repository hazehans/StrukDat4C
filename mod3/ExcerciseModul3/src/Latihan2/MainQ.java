package Latihan2;

import javax.imageio.stream.ImageInputStream;
import java.util.LinkedList;
import java.util.Queue;

public class MainQ {
    public void qExample(){
        Queue q = new LinkedList();
        q.add("Java");
        q.add("DotNet");
        q.offer("FHF");
        q.offer("HTML");
        System.out.println("remove : " + q.remove());
        System.out.println("element : " + q.element());
        System.out.println("poll : " + q.poll());
        System.out.println("peek : " + q.peek());
        System.out.println(q.peek());
    }

    public static void main(String[] args) {
        new MainQ().qExample();
    }
}

/*
Output :

remove : Java
element : DotNet
poll : DotNet
peek : FHF
 */
