package co2123.hw2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Bakery {
    @Id // primary key of id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // automatic id generation
    private int id;

    private String address;

    // many bakeries can have many breads
    @ManyToMany(mappedBy = "bakeries", cascade = CascadeType.ALL)
    private List<Bread> breads;

    // many bakeries will have one newest bread
    @ManyToOne
    private Bread newest;

    //getters and setters
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

    // this will be the data displayed by the jsp
    @Override
    public String toString() {
        return "Bakery{id="+ id +
                ", address='"+ address + '\'' +
                ", breads='"+ breads + '\'' +
                ", newest='"+ newest + '\'' +
                '}';
    }
}
