package com.example.model;

public class MemberWithBLOBs extends Member {
    private String relations;

    private String ticket;

    public String getRelations() {
        return relations;
    }

    public void setRelations(String relations) {
        this.relations = relations == null ? null : relations.trim();
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket == null ? null : ticket.trim();
    }
}