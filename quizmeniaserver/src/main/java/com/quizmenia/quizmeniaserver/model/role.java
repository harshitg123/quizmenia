package com.quizmenia.quizmeniaserver.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="roles")
public class role {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roleId;

    @Column(name="role_name")
    private String roleName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "role")
    private Set<userRole> userRoles = new HashSet<>(); 
    

    public role() {
    }

    public role(Long roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public Set<userRole> getUserRole() {
        return userRoles;
    }

    public void setUserRole(Set<userRole> userRoles) {
        this.userRoles = userRoles;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<userRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<userRole> userRoles) {
        this.userRoles = userRoles;
    }

    
}
