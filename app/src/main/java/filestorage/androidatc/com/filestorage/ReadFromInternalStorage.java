package filestorage.androidatc.com.filestorage;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class ReadFromInternalStorage extends Activity {
    private TextView internalFileContent;
    private String fileName = "testFile.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_from_internal_storage);
        internalFileContent = (TextView) findViewById(R.id.file_content);
        String fileContent = readFileInternalStorage(fileName,this);
        internalFileContent.setText(fileContent);
    }

        public static String readFileInternalStorage(String fileName, Context context) {
        String stringToReturn = " ";
            try{
                String sfilename = fileName;
                InputStream inputStream = context.openFileInput(sfilename);
            }
    }
}
