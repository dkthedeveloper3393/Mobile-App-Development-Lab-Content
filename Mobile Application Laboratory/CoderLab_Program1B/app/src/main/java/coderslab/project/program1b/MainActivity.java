package coderslab.project.program1b;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // GUI Components declaration

    TextView textView;
    Button buttonAssetFolderFont,buttonResourceFolderFont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get GUI Components from XML File

        textView = findViewById(R.id.textView);
        buttonAssetFolderFont = findViewById(R.id.buttonAssetFolderFont);
        buttonResourceFolderFont = findViewById(R.id.buttonResourceFolderFont);

        // Set OnClickListener for buttons to perform click action

        buttonAssetFolderFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Get font from Assets Folder
                Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/insomnia.ttf");

                // Set font for TextView
                textView.setTypeface(typeface);
            }
        });

        buttonResourceFolderFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Get font from Resource(Font) Folder
                Typeface typeface = ResourcesCompat.getFont(MainActivity.this, R.font.skullvetica);

                // Set font for TextView
                textView.setTypeface(typeface);
            }
        });
    }
}
