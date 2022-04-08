package com.kylerdeggs.nonprofitapi;

import com.kylerdeggs.nonprofitapi.domain.Adoption;
import com.kylerdeggs.nonprofitapi.domain.Donation;
import com.kylerdeggs.nonprofitapi.domain.Event;
import com.kylerdeggs.nonprofitapi.repository.AdoptionRepository;
import com.kylerdeggs.nonprofitapi.repository.DonationRepository;
import com.kylerdeggs.nonprofitapi.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NonprofitService {
    private final AdoptionRepository adoptionRepository;
    private final DonationRepository donationRepository;
    private final EventRepository eventRepository;

    @Autowired
    public NonprofitService(AdoptionRepository adoptionRepository, DonationRepository donationRepository,
                            EventRepository eventRepository) {
        this.adoptionRepository = adoptionRepository;
        this.donationRepository = donationRepository;
        this.eventRepository = eventRepository;
    }

    public List<Adoption> allAdoptions() {
        return adoptionRepository.findAll();
    }

    public List<Donation> allDonations() {
        return donationRepository.findAll();
    }

    public List<Event> allEvents() {
        return eventRepository.findAll();
    }

    public Adoption getAdoption(int id) {
        return adoptionRepository.getById(id);
    }

    public Donation getDonation(int id) {
        return donationRepository.getById(id);
    }

    public Event getEvent(int id) {
        return eventRepository.getById(id);
    }

    public Adoption saveAdoption(Adoption adoption) {
        return adoptionRepository.save(adoption);
    }

    public Donation saveDonation(Donation donation) {
        return donationRepository.save(donation);
    }

    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }

    public void deleteAdoption(int id) {
        adoptionRepository.deleteById(id);
    }

    public void deleteDonation(int id) {
        donationRepository.deleteById(id);
    }

    public void deleteEvent(int id) {
        eventRepository.deleteById(id);
    }
}
