package filestorage.androidatc.com.filestorage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    private Button writeToInternalStorage;
    private Button writeToExternalStorage;
    private Button readFromInternalStorage;
    private Button readFromExternalStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        writeToInternalStorage = (Button) findViewById(R.id.write_file_to_internal_storage);
        writeToExternalStorage = (Button) findViewById(R.id.write_file_to_external_storage);
        readFromInternalStorage = (Button) findViewById(R.id.read_file_from_internal_storage);
        readFromExternalStorage = (Button) findViewById(R.id.read_file_from_external_storage);
        writeToInternalStorage.setOnClickListener(this);
        writeToExternalStorage.setOnClickListener(this);
        readFromExternalStorage.setOnClickListener(this);
        readFromInternalStorage.setOnClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.write_file_to_internal_storage:
                Intent write_file_to_internal_storage = new Intent(v.getContext(), WriteToInternalStorage.class);
                startActivity(write_file_to_internal_storage;
                break;
            case R.id.write_file_to_external_storage:
                Intent write_file_to_external_storage = new Intent(v.getContext(), WriteToExternalStorage.class);
                startActivity(write_file_to_external_storage);
                break;
            case R.id.read_file_from_internal_storage:
                Intent read_file_from_internal_storage = new Intent(v.getContext(), ReadFromInternalStorage.class);
                startActivity(read_file_from_internal_storage);
                break;
            case R.id.read_file_from_external_storage:
                Intent read_file_from_external_storage = new Intent(v.getContext(), ReadFromExternalStorage.class);
                startActivity(read_file_from_external_storage);
                break;
        }
    }
}
