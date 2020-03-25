package nl.agility.travelagency.repository;

import nl.agility.travelagency.domain.Country;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "country-service", url = "${country-service.url}")
public interface CountryServiceClient {

    @GetMapping("/api/countries")
    List<Country> findAll();

}
