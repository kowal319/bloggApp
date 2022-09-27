package com.example.blogg.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Article {

private static final int MIN_TITLE_LENGTH = 7;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private Long id;

@Column(name = "title")
private String title;

@Column(name = "text")
private String text;

@CreationTimestamp
@Temporal(TemporalType.TIMESTAMP)
@Column(name = "creation_date")
private Date creationDate;

    @OneToMany (mappedBy = "article", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private Collection<Comment> comments;
    }
