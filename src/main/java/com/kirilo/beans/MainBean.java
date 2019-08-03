package com.kirilo.beans;

import com.kirilo.objects.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.SessionScoped;

//import javax.enterprise.context.SessionScoped;
//import javax.inject.Named;


@Component
//@Named("registration")
//@RequestScoped
@SessionScoped
//public class MainBean implements Serializable {
public class MainBean {

    @Autowired
//    @Inject
    private Car car;

    public String getSound() {
        return car.getSound();
    }

}
