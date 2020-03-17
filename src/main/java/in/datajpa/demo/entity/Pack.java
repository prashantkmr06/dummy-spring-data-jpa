package in.datajpa.demo.entity;

import javax.persistence.*;

@Entity
public class Pack {
    @Id
    private Long id;
    private String name;
    private long packId;
}
