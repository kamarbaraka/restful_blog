package json_reader;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * a json file reader.
 * @author kamar baraka.*/

public class JsonFileReader {

    public void jsonReader() throws UnsupportedEncodingException {

        /*create a stream of the json resource*/
        InputStream jsonFileStream = getClass().getResourceAsStream("/json_files/employees.json");

        /*construct a reader for the stream*/
        Reader jsonStreamReader = new InputStreamReader(jsonFileStream, StandardCharsets.UTF_8);

        /*construct a json reader*/
        JsonReader jsonReader = Json.createReader(jsonStreamReader);

        /*convert it to a json array type*/
        JsonArray jsonArray = jsonReader.readArray();

        System.out.println(jsonArray.toString());

    }

    public static void main(String[] args) throws UnsupportedEncodingException {

        JsonFileReader jsonFileReader = new JsonFileReader();
        jsonFileReader.jsonReader();
    }
}
