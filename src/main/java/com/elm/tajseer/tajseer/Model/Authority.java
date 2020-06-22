package com.elm.tajseer.tajseer.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table
@Entity
public class Authority {

    @Id
    private  int authorityId ;
    @Column
    private  String authority ;


//
//
//    @ManyToMany(cascade = {CascadeType.ALL})
//    @JoinTable(
//            name = "authority_users",
//            joinColumns = {@JoinColumn(name = "authorityId")},
//            inverseJoinColumns = {@JoinColumn(name = "userId")}
//    )
//    private List<Users> users = new ArrayList<>();

public Authority(){

}

    public Authority(int authorityId, String authority) {
        this.authorityId = authorityId;
        this.authority = authority;
    }

    public int getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(int authorityId) {
        this.authorityId = authorityId;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

}
