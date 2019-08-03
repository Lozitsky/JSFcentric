package com.kirilo.objects;

import org.springframework.stereotype.Component;

@Component
public class LexusImpl implements Car {

    private String sound = "tron-dron-dron";

    @Override
    public String getSound() {
        return sound;
    }

/*    public String getSound() {
        return null;
    }*/
}
