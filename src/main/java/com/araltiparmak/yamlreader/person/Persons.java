package com.araltiparmak.yamlreader.person;

import java.util.Map;

public class Persons {

    public Persons(Map<String, Object> personMap) {
        this.personMap = personMap;
    }

    private Map<String, Object> personMap;

    public Map<String, Object> getPersonMap() {
        return personMap;
    }

}
