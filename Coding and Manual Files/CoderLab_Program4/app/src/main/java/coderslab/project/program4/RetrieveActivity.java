package coderslab.project.program4;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RetrieveActivity extends AppCompatActivity {

    // GUI Components Declaration
    EditText editTextRetrieve;
    Button buttonRetrieveValues;
    TextView textViewDisplayValues;
    String stringEdit,strId,strName,strAddress;

    // SQLiteDatabase Object  and Cursor Object Declaration
    SQLiteDatabase sqLiteDatabase;
    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve);

        //Get All GUI Components from XML File
        editTextRetrieve = findViewById(R.id.editTextRetrieve);
        buttonRetrieveValues = findViewById(R.id.buttonRetrieveValues);
        textViewDisplayValues = findViewById(R.id.textViewDisplayValues);

        // Set OnClickListener for Button to perform click action
        buttonRetrieveValues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Code for Retrieve Values from Table

                stringEdit = editTextRetrieve.getText().toString();

                sqLiteDatabase = openOrCreateDatabase("myDB", MODE_PRIVATE, null);
                cursor = sqLiteDatabase.rawQuery("select * from Employe where id = '"+stringEdit+"'", null);

                while (cursor.moveToNext())
                {
                    strId = cursor.getString(0);
                    strName = cursor.getString(1);
                    strAddress = cursor.getString(2);
                    textViewDisplayValues.setText(strId + ":" + strName + ":" +strAddress);
                }
                cursor.close();
                sqLiteDatabase.close();


            }
        });

    }
}