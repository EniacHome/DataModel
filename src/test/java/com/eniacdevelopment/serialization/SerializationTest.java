package com.eniacdevelopment.serialization;

import com.eniacdevelopment.serialization.DataModel.EventNotification;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by larsg on 10/5/2016.
 */
public class SerializationTest {
    private static ObjectMapper objectMapper;
    private static Serialization serializer;

    @BeforeClass
    public static void setup(){
        objectMapper = new ObjectMapper();
        serializer = new Serialization(objectMapper);
    }

    @Test
    public void SerializerShouldSerializeAbstractPackage()  {
        EventNotification testEventNotification = new EventNotification(){{
            Id = "Hello";
            Location = "Kitchen";
        }};

        byte[] resultSerializeBytes = new byte[0];
        String resultSerializeString = null;
        EventNotification resultDeserialize = null;
        try {
            resultSerializeBytes = serializer.Serialize(testEventNotification);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        try {
            resultSerializeString = objectMapper.writeValueAsString(testEventNotification);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        try {
            resultDeserialize = (EventNotification) serializer.Deserialize(resultSerializeBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(testEventNotification, resultDeserialize);
    }
}
