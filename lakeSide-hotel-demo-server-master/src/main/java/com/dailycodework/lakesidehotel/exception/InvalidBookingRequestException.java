package com.dailycodework.lakesidehotel.exception;

/**
 * @author Simpson Alfred
 */

@SuppressWarnings("serial")
public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}
