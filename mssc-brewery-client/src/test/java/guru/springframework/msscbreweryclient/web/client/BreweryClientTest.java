package guru.springframework.msscbreweryclient.web.client;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    private BreweryClient breweryClient;

    @Test
    final void testGetBeerById() {
        final var beerDto = breweryClient.getBeerById(UUID.randomUUID());
        assertThat(beerDto).isNotNull();
    }

}
