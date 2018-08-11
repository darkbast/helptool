package jang.cmn.view;

import javax.swing.JFrame;

public class WndFrame<T> extends JFrame {

    public T getWnd(T t) {
        return (T) t;
    }
}
