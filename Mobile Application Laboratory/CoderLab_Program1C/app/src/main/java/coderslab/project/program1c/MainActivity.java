package coderslab.project.program1c;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    // GUI Components Declaration

    TextView textView;
    Button buttonUsingColorCode,buttonColorFromColorResourceFile;
    int clickCountForButton=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get All GUI Components from XML File

        textView = findViewById(R.id.textView);
        buttonUsingColorCode = findViewById(R.id.buttonUsingColorCode);
        buttonColorFromColorResourceFile = findViewById(R.id.buttonColorFromColorResourceFile);

        // Set OnClickListener for Buttons to perform click action

        buttonUsingColorCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // Create Color Using Color Code
                int deepColor = Color.parseColor("#FFE91E63");
                int lightColor = Color.parseColor("#FFE91E63");

                // Set Color for TextView

                textView.setTextColor(deepColor);
                //textView.setTextColor(lightColor);
            }
        });

        buttonColorFromColorResourceFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Get Color from Color Resource File
                int blueColor = getResources().getColor(R.color.colorPrimaryDark);
                int lightBlueColor = getResources().getColor(R.color.colorAccent);

                // Set Color for TextView
                textView.setTextColor(blueColor);
                //textView.setTextColor(lightBlueColor);

            }
        });
    }
}
