package com.ugaHacksAudioTour.audio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "parks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Park {
    private String[] activities;
    private String city;
    private String stateCode;
    private String fullName;

    private String parkId;
    private String imageUrl;
    private String hours;
}
