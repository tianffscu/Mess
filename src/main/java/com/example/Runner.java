package com.example;

import com.alibaba.fastjson.JSONObject;
import com.csvreader.CsvReader;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class Runner {

    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String START_DATE = "2010-09-20 10:05:09";

    public static void main(String[] args) throws IOException, CloneNotSupportedException, URISyntaxException, ParseException {

        HackValidOrderQueryRequest hackValidOrderQueryRequest = new HackValidOrderQueryRequest();
        hackValidOrderQueryRequest.setEndDate(new Date());
        hackValidOrderQueryRequest.setStartDate(new SimpleDateFormat(DATE_FORMAT).parse(START_DATE));
        hackValidOrderQueryRequest.setMtShopIdList(Collections.singletonList(42554528));

        System.out.println(JSONObject.toJSON(hackValidOrderQueryRequest));

    }


    private static Map<Long, Long> buildRelations(String csv) {
        Map<Long, Long> map = new HashMap<>();

        CsvReader reader = null;
        try (InputStream is = new ByteArrayInputStream(csv.getBytes())) {
            reader = new CsvReader(is, ',', Charset.forName("UTF-8"));
            while (reader.readRecord()) {
                try {
                    map.put(Long.parseLong(reader.get(0)),
                            Long.parseLong(reader.get(1)));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyMap();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

        return map;
    }
}
