package coderslab.project.program4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // GUI Components Declaration
    Button buttonCreate,buttonInsert,buttonUpdate,buttonDelete,buttonRetrieve;

    // SQLiteDatabase Object Declaration
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get All GUI Components from XML File
        buttonCreate = findViewById(R.id.buttonCreate);
        buttonInsert = findViewById(R.id.buttonInsert);
        buttonUpdate = findViewById(R.id.buttonUpdate);
        buttonDelete = findViewById(R.id.buttonDelete);
        buttonRetrieve = findViewById(R.id.buttonRetrieve);

        // Set OnClickListener for Button to perform click action
        buttonCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for Database and Table Creation
                sqLiteDatabase = openOrCreateDatabase("myDB", MODE_PRIVATE, null);
                sqLiteDatabase.execSQL("create table if not exists Employe(id varchar, name text, address text);");
                Toast.makeText(getApplicationContext(), "Database and Table Created Successfully", Toast.LENGTH_SHORT).show();
                sqLiteDatabase.close();
            }
        });

        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Screen Navigation for Insert Activity
                Intent in = new Intent(MainActivity.this, InsertActivity.class);
                startActivity(in);
            }
        });

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Screen Navigation for Insert Activity
                Intent in = new Intent(MainActivity.this, InsertActivity.class);
                startActivity(in);
            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Screen Navigation for Insert Activity
                Intent in = new Intent(MainActivity.this, InsertActivity.class);
                startActivity(in);
            }
        });

        buttonRetrieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Screen Navigation for Retrieve Activity
                Intent in = new Intent(MainActivity.this, RetrieveActivity.class);
                startActivity(in);
            }
        });

    }
}