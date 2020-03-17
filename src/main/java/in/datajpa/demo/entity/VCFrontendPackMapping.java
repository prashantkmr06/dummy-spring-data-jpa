package in.datajpa.demo.entity;

import javax.persistence.*;

@Entity
public class VCFrontendPackMapping {
    @Id
    private long id;
    private long vcId;
    private long frontendId;
    private long packsId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="packsId",referencedColumnName = "packId",insertable = false, updatable = false)
    private Pack pack;
}
