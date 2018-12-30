package com.aws.codestar.project.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

    public static String getCurrentLocalDateTimeStamp() {
        return LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
    }


}
