
package com.ps.spring.jwt.mongodb.models.admin;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cinemaHall"
})
public class PlaysAt {

    @JsonProperty("cinemaHall")
    @NotBlank
    private CinemaHall cinemaHall;

    @JsonProperty("cinemaHall")
    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    @JsonProperty("cinemaHall")
    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }


}
