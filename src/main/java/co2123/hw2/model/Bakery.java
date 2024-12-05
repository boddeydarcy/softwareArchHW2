package co2123.hw2.model;

import java.util.List;

public class Bakery {
    private int id;
    private String address;
    private List<Bread> breads;
    private Bread newest;

    public void setID(int id){
        this.id = id;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setBreads(List<Bread> breads){
        this.breads = breads;
    }

    public void setNewest(Bread newest){
        this.newest = newest;
    }

    public int getID(){
        return id;
    }

    public String getAddress(){
        return address;
    }

    public List<Bread> getBreads(){
        return breads;
    }

    public Bread getNewest(){
        return newest;
    }
}
