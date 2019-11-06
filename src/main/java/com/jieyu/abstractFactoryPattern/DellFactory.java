package com.jieyu.abstractFactoryPattern;

public class DellFactory extends PCFactory {
    @Override
    Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
