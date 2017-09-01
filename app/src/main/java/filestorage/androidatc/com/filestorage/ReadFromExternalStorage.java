package filestorage.androidatc.com.filestorage;


import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromExternalStorage extends Activity {
    private TextView externalFileContent;
    private String fileName = "testFile.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_to_external_storage);
        externalFileContent = (TextView) findViewById(R.id.file_content);
        String fileContent = readFileExternalStorage(fileName);
        externalFileContent.setText(fileContent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.read_from_external_storage, menu);
        return true;
    }

    public static String readFileExternalStorage(String fileName) {
        StringBuilder text = new StringBuilder();
        try {
            if (CommonUtil.isSdReadable()) {
                File sdcard = Environment.getExternalStorageDirectory();
                File file = new File(sdcard, fileName);
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while ((line = br.readLine()) != null){
                    text.append(line);
                    System.out.println("text: " + text + " : end");
                    text.append("\n");
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println("Hello");
        }
        return text.toString();
    }
}
