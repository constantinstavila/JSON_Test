package org.example;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Arrays;

public class JSON_HomeWorkCount {

    static final String JSON = """
        { 
        "count": 2, 
        "files": 
        [ { "name": "1.txt", "size": 1234, "type": "txt" }, 
        { "name": "2.png", "size": 456, "type": "png" } 
        ] 
        }
    """;

    public class FileData {
        String name;
        int size;
        String type;

        @Override
        public String toString() {
            return "FileData{" +
                   "name='" + name + '\'' +
                   ", size=" + size +
                   ", type='" + type + '\'' +
                   '}';
        }
    }

    public class FileInfo {
        int count;
        FileData [] files;

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("FilesInfo{\n");
            sb.append("count=").append(count).append(",\n");
            for (FileData file : files) {
                sb.append(file).append("\n");
            }
            sb.append("}");
            return sb.toString();
        }
    }


    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileInfo info = gson.fromJson(JSON, FileInfo.class);

        System.out.println(info);


    }
}
