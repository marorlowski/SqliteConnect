package Entiti;

import javax.persistence.*;

@Entity(name="tbl1")
public class Tbl1 {


    private String one;
    private Double two;
    private Double id;

    @Override
    public String toString() {
        return "Tbl1{" +
                "one='" + one + '\'' +
                ", two=" + two +
                ", id='" + id + '\'' +
                '}';
    }


    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public Tbl1() {
    }

    public Tbl1(String one, Double two) {
        this.setOne(one);
        this.setTwo(two);
    }

    public Double getTwo() {
        return two;
    }

    public void setTwo(Double two) {
        this.two = two;
    }

    @Id

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }
}

