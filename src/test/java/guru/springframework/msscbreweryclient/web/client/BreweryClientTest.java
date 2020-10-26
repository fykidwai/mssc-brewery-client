package guru.springframework.msscbreweryclient.web.client;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import guru.springframework.msscbreweryclient.web.model.BeerDto;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    private BreweryClient breweryClient;

    @Test
    final void testGetBeerById() {
        final var beerDto = breweryClient.getBeerById(UUID.randomUUID());
        assertThat(beerDto).isNotNull();
    }

    @Test
    final void testCreateNewBeer() {
        final var location = breweryClient.createNewBeer(BeerDto.builder().id(UUID.randomUUID()).build());
        assertThat(location).isNotNull();
        System.out.println(location);
    }

    @Test
    final void testUpdateBeer() {
        breweryClient.updateBeer(UUID.randomUUID(), BeerDto.builder().id(UUID.randomUUID()).build());
    }

    @Test
    final void testDeleteBeer() {
        breweryClient.deleteBeer(UUID.randomUUID());
    }
}
