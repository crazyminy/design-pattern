package com.jieyu.abstractFactoryPattern;

public class HpFactory extends PCFactory {

    @Override
    Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    Keyboard createKeyboard() {
        return new HpKeyboard();
    }


}
