package com.codewithmosh.prototype;

public class Clip implements Component {

    @Override
    public Component duplicate() {
        Clip blah = new Clip();
        return blah;
    }
}
