package com.project.ShowTimeBooking.ResponseDTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.net.URL;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TheatreResponseShow {
    String theatreName;
    String locality;
    String city;
    URL theatreLocationUrl;
    List<ShowResponseTheatre> showResponseTheatreList;
}
