package com.quizmenia.quizmeniaserver.model;

import javax.persistence.*;

@Entity
@Table(name = "userRole")
public class userRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userRoleId;

    @ManyToOne(fetch = FetchType.EAGER)
    private user user;

    @ManyToOne
    private role role;

    public userRole() {
    }

    public userRole(Long userRoleId, com.quizmenia.quizmeniaserver.model.user user,
            com.quizmenia.quizmeniaserver.model.role role) {
        this.userRoleId = userRoleId;
        this.user = user;
        this.role = role;
    }

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }

    public role getRole() {
        return role;
    }

    public void setRole(role role) {
        this.role = role;
    }

}
