package admin_user.service;
import admin_user.dto.BookingDto;
import admin_user.model.Booking;
import admin_user.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
public class BookingService {
    private BookingRepository bookingRepository;

    public Booking createBooking(BookingDto bookingDto) {
        Booking booking = new Booking();
        booking.setName(bookingDto.getName());
        booking.setEmail(bookingDto.getEmail());
        booking.setTrainerName(bookingDto.getTrainerName());
        booking.setTimeSlot(bookingDto.getTimeSlot());
        booking.setStartDate(bookingDto.getStartDate());
        booking.setEndDate(bookingDto.getEndDate());
        return bookingRepository.save(booking);
    }

    // Additional service methods can be added here
}

