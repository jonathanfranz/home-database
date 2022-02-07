package com.home.management.database.home;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Data
@Builder
@Entity
public class Home {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;
    String address;
    List<Room> rooms;
}
