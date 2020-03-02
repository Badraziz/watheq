package com.elm.tajseer.tajseer.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Table
@Entity
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int authorityId ;
    @Column
    private  String username ;
    @Column
    private  String authority ;



    @OneToMany(mappedBy = "authority", cascade = CascadeType.ALL)
    private List<Users> users = new ArrayList<>();

//
//
//    @ManyToMany(cascade = {CascadeType.ALL})
//    @JoinTable(
//            name = "authority_users",
//            joinColumns = {@JoinColumn(name = "authorityId")},
//            inverseJoinColumns = {@JoinColumn(name = "userId")}
//    )
//    private List<Users> users = new ArrayList<>();

    public Authority() {
    }

    public Authority(int authorityId, String username, String authority) {
        this.authorityId = authorityId;
        this.username = username;
        this.authority = authority;
    }

    public int getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(int authorityId) {
        this.authorityId = authorityId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }
}
