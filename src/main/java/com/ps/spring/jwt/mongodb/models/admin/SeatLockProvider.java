package com.ps.spring.jwt.mongodb.models.admin;

import java.util.List;

public interface SeatLockProvider {


    abstract void lockSeats(Show show, List<Seat> seat, String user);
    void unlockSeats(Show show, List<Seat> seat, String user);
    boolean validateLock(Show show, Seat seat, String user);

    List<Seat> getLockedSeats(Show show);
}
