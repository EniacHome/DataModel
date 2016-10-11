package com.eniacdevelopment.serialization;

import com.eniacdevelopment.serialization.DataModel.AbstractPackage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by larsg on 10/5/2016.
 */
public class Serialization {
    private final ObjectMapper objectMapper;

    public Serialization(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public byte[] Serialize(AbstractPackage abstractPackage) throws JsonProcessingException {
        return this.objectMapper.writeValueAsBytes(abstractPackage);
    }

    public AbstractPackage Deserialize(byte[] jsonBytes) throws IOException {
        return this.objectMapper.readValue(jsonBytes, AbstractPackage.class);
    }
}
