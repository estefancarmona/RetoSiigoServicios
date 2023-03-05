package co.com.certificacion.models;

import java.util.HashMap;
import java.util.Map;

public class TestData {

    private static Map<String, Object> map = new HashMap<>();

    private TestData () throws IllegalAccessException {
        throw new IllegalAccessException("Utility Class");
    }

    public static Map<String, Object> getData(){
        return map;
    }


    public static void setMap(Map<String, Object> testData){
        map=testData;
    }

    public static String getThe(String getData){
        return (String) getData().get(getData);
    }
}
