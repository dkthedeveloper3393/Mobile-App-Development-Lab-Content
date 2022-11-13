package coderslab.project.program4;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertActivity extends AppCompatActivity {

    // GUI Components Declaration
    EditText editTextInsertId,editTextInsertName,editTextInsertAddress;
    Button buttonInsertValues,buttonUpdateValues,buttonDeleteValues;
    String strId,strName,strAddress;

    // SQLiteDatabase Object Declaration
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        //Get All GUI Components from XML File
        editTextInsertId = findViewById(R.id.editTextInsertId);
        editTextInsertName = findViewById(R.id.editTextInsertName);
        editTextInsertAddress = findViewById(R.id.editTextInsertAddress);

        buttonInsertValues = findViewById(R.id.buttonInsertValues);
        buttonUpdateValues = findViewById(R.id.buttonUpdateValues);
        buttonDeleteValues = findViewById(R.id.buttonDeleteValues);

        // Set OnClickListener for Button to perform click action
        buttonInsertValues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Code for Insert Values in Table

                strId = editTextInsertId.getText().toString();
                strName = editTextInsertName.getText().toString();
                strAddress = editTextInsertAddress.getText().toString();

                sqLiteDatabase = openOrCreateDatabase("myDB", MODE_PRIVATE, null);
                sqLiteDatabase.execSQL("insert into Employe values('"+strId+"','"+strName+"','"+strAddress+"');");
                Toast.makeText(InsertActivity.this, "Values Inserted Successfully", Toast.LENGTH_SHORT).show();
                sqLiteDatabase.close();

                editTextInsertId.setText("");
                editTextInsertName.setText("");
                editTextInsertAddress.setText("");

            }
        });

        buttonUpdateValues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Code for Update Values in Table

                strId = editTextInsertId.getText().toString();
                strName = editTextInsertName.getText().toString();
                strAddress = editTextInsertAddress.getText().toString();

                sqLiteDatabase = openOrCreateDatabase("myDB", MODE_PRIVATE, null);
                sqLiteDatabase.execSQL("update Employe set name = '"+strName+"', address = '"+strAddress+"' where id = '"+strId+"';");
                Toast.makeText(InsertActivity.this, "Values Updated Successfully", Toast.LENGTH_SHORT).show();
                sqLiteDatabase.close();

                editTextInsertId.setText("");
                editTextInsertName.setText("");
                editTextInsertAddress.setText("");

            }
        });

        buttonDeleteValues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Code for Delete Values from Table

                strId = editTextInsertId.getText().toString();

                sqLiteDatabase = openOrCreateDatabase("myDB", MODE_PRIVATE, null);
                sqLiteDatabase.execSQL("delete from Employe where id = '"+strId+"';");
                Toast.makeText(getApplicationContext(), "Value Deleted Successfully", Toast.LENGTH_SHORT).show();
                sqLiteDatabase.close();

                editTextInsertId.setText("");

            }
        });

    }
}