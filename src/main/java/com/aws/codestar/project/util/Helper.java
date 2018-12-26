package com.aws.codestar.project.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.UUID;
import java.util.logging.Logger;

public class Helper {

    static Logger logger = Logger.getAnonymousLogger();
    static ObjectMapper mapper = new ObjectMapper();
    public static String  toJson(Object object)
    {
        String jsonInString = "";
        try {
            jsonInString =  mapper.writeValueAsString(object);
        }
        catch (Exception e)
        {
            logger.info(e.getMessage());
        }
        return jsonInString;
    }

    public static String getUUID() {
        return String.valueOf(UUID.randomUUID());
    }
}
