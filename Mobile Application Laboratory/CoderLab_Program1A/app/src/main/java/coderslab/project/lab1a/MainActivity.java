package coderslab.project.lab1a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    // GUI Components declaration

    EditText editText;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get All GUI Components from XML file

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        // Set OnClickListener for Button to perform Click Operation

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Get Text from EditText
                String strName = editText.getText().toString();

                // Set Text or Display Text in TextView
                textView.setText(strName);

            }
        });


    }
}
