package nl.agility.travelagency.repository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.agility.travelagency.domain.Country;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class CountryRepository {

    private final CountryServiceClient client;

    public List<Country> findAll() {
        List<Country> countries = client.findAll();

        log.info("Fetched {} countries", countries == null ? 0 : countries.size());

        return countries;
    }

}
