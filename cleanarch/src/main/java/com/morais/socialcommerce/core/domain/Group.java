package com.morais.socialcommerce.core.domain;

public class Group {
    private String id;
    private String groupName;

    public Group() {
    }

    public Group(String id, String groupName) {
        this.id = id;
        this.groupName = groupName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
