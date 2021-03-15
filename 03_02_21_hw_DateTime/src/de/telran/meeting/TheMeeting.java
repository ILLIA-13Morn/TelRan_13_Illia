package de.telran.meeting;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TheMeeting {

    public int intersectWorkingTime(
            int start1,
            int hours1,
            String zone1,
            int start2,
            int hours2,
            String zone2){

        ZonedDateTime  startTime1 = ZonedDateTime.of(LocalDate.now(),LocalTime.of(start1,0),ZoneId.of(zone1));
        ZonedDateTime  hoursZone1 = ZonedDateTime.of(LocalDate.now(),LocalTime.of(hours1,0),ZoneId.of(zone1));
        ZonedDateTime  startTime2 = ZonedDateTime.of(LocalDate.now(),LocalTime.of(start2,0),ZoneId.of(zone1));
        ZonedDateTime  hoursZone2 = ZonedDateTime.of(LocalDate.now(),LocalTime.of(hours2,0),ZoneId.of(zone1));

        

    }

}
