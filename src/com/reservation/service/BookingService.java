package com.reservation.service;

import java.util.List;

import com.reservation.beans.HistoryBean;
import com.reservation.beans.TrainException;

public interface BookingService {

	public List<HistoryBean> getAllBookingsByCustomerId(String customerEmailId) throws TrainException;

	public HistoryBean createHistory(HistoryBean bookingDetails) throws TrainException;

}
