package com.vinternship.mcmsbackend.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "language")
public class Language {
    @Id
    private String id;
    private String name;
    @CreatedDate
    private Date created;

    public Language(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }



    public String getName() {
        return name;
    }



    public Date getCreated() {
        return created;
    }


}
