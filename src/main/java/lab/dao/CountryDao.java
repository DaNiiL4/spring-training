package lab.dao;

import lab.model.Country;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface CountryDao {

    void save(Country country);

    List<Country> getAllCountries();

    Optional<Country> getCountryByCodeName(String codeName);

    Optional<Country> getCountryByName(String name);

    void attach(Country country);

    void update(Country country);

    void detach(Country country);

    Stream<Country> getAll();
}