package mk.ukim.finki.wp.lab.Data;


import mk.ukim.finki.wp.lab.model.Balloon;
import mk.ukim.finki.wp.lab.model.Manufacturer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class DataHolder {
    public static List<Balloon> balloons = new ArrayList<>();
    public static List<Manufacturer> manufacturers = new ArrayList<>();

    @PostConstruct
    public void init(){
        balloons.add(new Balloon("Balloon1","blue", new Manufacturer("Manufacturer1","country1","adress1")));
        balloons.add(new Balloon("Balloon2","red",new Manufacturer("Manufacturer2","country2","adress2")));
        balloons.add(new Balloon("Balloon3","green",new Manufacturer("Manufacturer3","country3","adress3")));
        balloons.add(new Balloon("Balloon4","yellow",new Manufacturer("Manufacturer4","country4","adress4")));
        balloons.add(new Balloon("Balloon5","magenta",new Manufacturer("Manufacturer5","country5","adress5")));


        manufacturers.add(new Manufacturer("Manufacturer1","country1","adress1"));
        manufacturers.add(new Manufacturer("Manufacturer2","country2","adress2"));
        manufacturers.add(new Manufacturer("Manufacturer3","country3","adress3"));
        manufacturers.add(new Manufacturer("Manufacturer4","country4","adress4"));
        manufacturers.add(new Manufacturer("Manufacturer5","country5","adress5"));
    }

    public static Long generateId(){
        Random rand = new Random();

        long id = rand.nextLong(10000);

        for (Balloon b : balloons){
            if (b.getId() == id)
                generateId();
        }
        return id;
    }
}
