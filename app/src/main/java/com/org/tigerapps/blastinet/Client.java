package com.org.tigerapps.blastinet;

public class Client {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEvents(String events) {
        this.events = events;
    }

    public int getId() {
        return id;

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getEvents() {
        return events;
    }

    private String email;
    private String events;
        public Client(int id,String name,String email,String events){
            this.id=id;
            this.name=name;
            this.email=email;
            this.events=events;

        }

}
