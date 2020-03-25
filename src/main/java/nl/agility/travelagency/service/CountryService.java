package nl.agility.travelagency.service;

import lombok.RequiredArgsConstructor;
import nl.agility.travelagency.repository.CountryRepository;
import nl.agility.travelagency.domain.Country;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;

    public List<Country> retrieveCountries() {
        return this.countryRepository.findAll();
    }

}
