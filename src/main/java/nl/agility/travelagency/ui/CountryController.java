package nl.agility.travelagency.ui;

import lombok.RequiredArgsConstructor;
import nl.agility.travelagency.domain.Country;
import nl.agility.travelagency.service.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping("/countries")
    public List<Country> retrieveCountries() {
        return this.countryService.retrieveCountries();
    }

}
