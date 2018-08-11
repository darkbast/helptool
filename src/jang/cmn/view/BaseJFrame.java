package jang.cmn.view;

import java.awt.Dimension;

import javax.swing.JFrame;

import jang.cmn.CommonDisplay;
import jang.cmn.if_part.BaseIf;

public class BaseJFrame extends JFrame implements BaseIf {

    public BaseJFrame() {
        start();
    }

    @Override
    public void start() {
        init();
        display();
    }

    public void init() {
    }

    public void display() {
    }

    @Override
    public void destroy() {

    }

    class Wnd<T> {
        public T getWnd(T t) {
            return null;
        }
    }

}
