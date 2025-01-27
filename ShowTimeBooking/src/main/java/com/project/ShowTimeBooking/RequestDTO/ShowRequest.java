package com.project.ShowTimeBooking.RequestDTO;

import com.project.ShowTimeBooking.Enums.FormatEnum;
import com.project.ShowTimeBooking.Enums.LanguageEnum;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShowRequest {
    String movieCode;
    LocalDateTime startTime;
    LocalTime ticketCancellationTimeLimit;
    LanguageEnum language;
    FormatEnum formatEnum;
    String theatreCode;
    String screenNumber;
    ShowSeatRequest showSeatRequest;
}
