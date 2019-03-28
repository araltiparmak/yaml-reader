package com.araltiparmak.yamlreader.config;

import com.araltiparmak.yamlreader.person.Persons;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

@Configuration
public class PersonReader {

    @Bean
    public Persons getPersons() throws IOException {
        Yaml yaml = new Yaml();
        File file = ResourceUtils.getFile("classpath:persons.yml");
        System.out.println("file has been read");
        InputStream in = new FileInputStream(file);
        Persons persons = new Persons((Map<String, Object>) yaml.load(in));
        return persons;
    }
}
