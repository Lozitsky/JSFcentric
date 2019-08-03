package com.kirilo.beans;

import com.kirilo.objects.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import javax.enterprise.context.SessionScoped;
//import javax.inject.Named;

import javax.faces.bean.SessionScoped;


@Component
@SessionScoped
public class MainBean {

    @Autowired
    private Car car;

    public String getSound() {
        return car.getSound();
    }

}
