package com.kylerdeggs.nonprofitapi;

import com.kylerdeggs.nonprofitapi.domain.Adoption;
import com.kylerdeggs.nonprofitapi.domain.Donation;
import com.kylerdeggs.nonprofitapi.domain.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("v1")
public class Controller {
    private final NonprofitService nonprofitService;

    @Autowired
    public Controller(NonprofitService nonprofitService) {
        this.nonprofitService = nonprofitService;
    }

    @GetMapping("/adoptions")
    public List<Adoption> getAllAdoptions() {
        return nonprofitService.allAdoptions();
    }

    @PostMapping("/adoptions")
    public Adoption createAdoption(@RequestBody @Validated Adoption adoption) {
        return nonprofitService.saveAdoption(adoption);
    }

    @GetMapping("/adoptions/{id}")
    public Adoption getAdoption(@PathVariable("id") int adoptionId) {
        return nonprofitService.getAdoption(adoptionId);
    }

    @DeleteMapping("/adoptions/{id}")
    public void deleteAdoption(@PathVariable("id") int adoptionId) {
        nonprofitService.deleteAdoption(adoptionId);
    }

    @GetMapping("/donations")
    public List<Donation> getAllDonations() {
        return nonprofitService.allDonations();
    }

    @PostMapping("/donations")
    public Donation createDonation(@RequestBody @Validated Donation donation) {
        return nonprofitService.saveDonation(donation);
    }

    @GetMapping("/donations/{id}")
    public Donation getDonations(@PathVariable("id") int donationId) {
        return nonprofitService.getDonation(donationId);
    }

    @DeleteMapping("/donations/{id}")
    public void deleteDonations(@PathVariable("id") int donationId) {
        nonprofitService.deleteDonation(donationId);
    }

    @GetMapping("/events")
    public List<Event> getAllEvents() {
        return nonprofitService.allEvents();
    }

    @PostMapping("/events")
    public Event createEvent(@RequestBody @Validated Event event) {
        return nonprofitService.saveEvent(event);
    }

    @GetMapping("/events/{id}")
    public Event getEvent(@PathVariable("id") int eventId) {
        return nonprofitService.getEvent(eventId);
    }

    @DeleteMapping("/events/{id}")
    public void deleteEvent(@PathVariable("id") int eventId) {
        nonprofitService.deleteEvent(eventId);
    }
}
