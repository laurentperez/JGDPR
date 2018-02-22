package eu.jgdpr.user;

import javax.management.relation.Role;
import javax.management.relation.RoleStatus;

/**
 * The Data PRotection Officer
 */
public final class GDPRDPO extends RoleStatus {

    // TODO realm, tc spring/shiva sec role

    private String name;
    private String surName;

    public GDPRDPO(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "GDPRDPO{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
