package net.mlgmag.springboot.CompanytimeManagement.service.genericServicesImplementation;

import net.mlgmag.springboot.CompanytimeManagement.model.Event;
import net.mlgmag.springboot.CompanytimeManagement.repository.EventRepository;
import net.mlgmag.springboot.CompanytimeManagement.service.genericServices.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public void save(Event event) {
        eventRepository.save(event);
    }

    @Override
    public void update(Event event) {
        eventRepository.saveAndFlush(event);
    }

    @Override
    public void delete(Event event) {
        eventRepository.delete(event);
    }

    @Override
    public Optional<Event> findById(UUID uuid) {
        return eventRepository.findById(uuid);
    }

    @Override
    public List<Event> findAll() {
        return eventRepository.findAll();
    }

}
