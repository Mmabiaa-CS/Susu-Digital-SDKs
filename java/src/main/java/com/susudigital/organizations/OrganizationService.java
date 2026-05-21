package com.susudigital.organizations;

import java.util.HashMap;
import java.util.Map;

public class OrganizationService {
    private Map<String, Organization> organizations = new HashMap<>();

    public Organization createOrganization(String id, String name) {
        Organization organization = new Organization(id, name);
        organizations.put(id, organization);
        return organization;
    }

    public Organization getOrganization(String id) {
        return organizations.get(id);
    }

    public Organization updateOrganization(String id, String newName) {
        Organization organization = organizations.get(id);
        if (organization != null) {
            organization.setName(newName);
        }
        return organization;
    }

    // Additional methods for organization management can be added here
}

class Organization {
    private String id;
    private String name;

    public Organization(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}