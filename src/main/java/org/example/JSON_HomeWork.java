package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Arrays;

public class JSON_HomeWork
{
    static final String JSON = """
        [ 
        { "name": "1.txt", "size": 1234, "type": "txt" }, 
        { "name": "2.png", "size": 456, "type": "png" } 
        ]  
    """;

    public class File {
        String name;
        int size;
        String type;

        @Override
        public String toString() {
            return "File{" +
                   "name='" + name + '\'' +
                   ", size=" + size +
                   ", type='" + type + '\'' +
                   '}';
        }
    }

    public static void main( String[] args )
    {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        File[] file1 = gson.fromJson(JSON, File[].class);
        for (File f:file1) {
            System.out.println(f);
        }

    }
}
