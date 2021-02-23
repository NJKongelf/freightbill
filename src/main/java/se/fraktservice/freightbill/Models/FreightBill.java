package se.fraktservice.freightbill.Models;

import javax.persistence.*;


@Entity
public class FreightBill {
    @Id
    @GeneratedValue
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }
}
