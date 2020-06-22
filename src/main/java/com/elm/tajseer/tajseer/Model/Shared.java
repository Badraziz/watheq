package com.elm.tajseer.tajseer.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Shared {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int shareId ;
    @Column
    private Date shareDate ;
   @Column
   private String shareURL ;



    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserID")
    private Users userShareds;

    @ManyToMany(mappedBy = "shareds", cascade = {CascadeType.ALL})
    private Set<Certificates> certificates = new HashSet<Certificates>();

    public Shared() {
    }

    public int getSharedId() {
        return shareId;
    }

    public void setSharedId(int sharedId) {
        this.shareId = sharedId;
    }

    public Date getShareDate() {
        return shareDate;
    }

    public void setShareDate(Date shareDate) {
        this.shareDate = shareDate;
    }

    public String getURL() {
        return shareURL;
    }

    public void setURL(String URL) {
        this.shareURL = URL;
    }
}
