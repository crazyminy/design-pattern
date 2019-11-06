package com.jieyu.abstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        PCFactory hpfactory = new HpFactory();
        Mouse mouse = hpfactory.createMouse();
        Keyboard keyboard = hpfactory.createKeyboard();
        mouse.showBrand();
        keyboard.showBrand();
        PCFactory dellFactory = new DellFactory();
        dellFactory.createMouse().showBrand();
        dellFactory.createKeyboard().showBrand();

    }
}
