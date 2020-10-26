package guru.springframework.msscbreweryclient.web.client;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import guru.springframework.msscbreweryclient.web.model.CustomerDto;

@SpringBootTest
class CustomerClientTest {

    @Autowired
    private CustomerClient customerClient;

    @Test
    final void testGetBeerById() {
        final var customerDto = customerClient.getBeerById(UUID.randomUUID());
        assertThat(customerDto).isNotNull();
    }

    @Test
    final void testCreateNewCustomer() {
        final var location = customerClient.createNewCustomer(CustomerDto.builder().id(UUID.randomUUID()).build());
        assertThat(location).isNotNull();
        System.out.println(location);
    }

    @Test
    final void testUpdateCustomer() {
        customerClient.updateCustomer(UUID.randomUUID(), CustomerDto.builder().id(UUID.randomUUID()).build());
    }

    @Test
    final void testDeleteCustomer() {
        customerClient.deleteCustomer(UUID.randomUUID());
    }
}
