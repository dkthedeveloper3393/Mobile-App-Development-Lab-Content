package coderslab.project.program2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // GUI Components Declaration
    SeekBar seekBar;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //Get All GUI Components from XML File
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        seekBar = findViewById(R.id.seekBar);

        // Set OnClickListener for Button to perform click action

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // At the time of click action if you want to perform anything, Please Add you code here
                Toast.makeText(MainActivity.this,"Click Action Performed",Toast.LENGTH_SHORT).show();
            }
        });

        // Set addTextChangedListener for EditText to perform text change action

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Before Text Changed if you want to perform anything, Please Add you code here
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // At the time of Text Changed if you want to perform anything, Please Add you code here
            }

            @Override
            public void afterTextChanged(Editable s) {
                // After Text Changed if you want to perform anything, Please Add you code here
                Toast.makeText(MainActivity.this,"Text Change Completed",Toast.LENGTH_SHORT).show();
            }
        });

        // Set setOnSeekBarChangeListener for SeekBar to perform seekbar change action

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // At the time of progress change if you want to perform anything, Please Add you code here
                Toast.makeText(MainActivity.this,"Progress Value : "+ String.valueOf(progress),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Before SeekBar start tracking if you want to perform anything, Please Add you code here
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // After SeekBar Stop tracking if you want to perform anything, Please Add you code here
            }
        });

    }
}
