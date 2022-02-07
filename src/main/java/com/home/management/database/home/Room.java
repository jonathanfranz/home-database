package com.home.management.database.home;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Room {
    String name;
    double height;
    double width;
}
