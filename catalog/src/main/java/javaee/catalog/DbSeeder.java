package javaee.catalog;


import javaee.catalog.models.Item;
import javaee.catalog.repositories.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbSeeder {

    @Bean
    CommandLineRunner initDatabase(ItemRepository itemRepository) {
        return args -> {
            itemRepository.save(new Item("Item 1", "Description 1", 123.32));
            itemRepository.save(new Item("Item 2", "Description 3", 132.32));
        };
    }
}
