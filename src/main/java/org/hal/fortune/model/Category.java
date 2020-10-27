package org.hal.fortune.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {
    private @Id @GeneratedValue Long id;
    private String title;
}
