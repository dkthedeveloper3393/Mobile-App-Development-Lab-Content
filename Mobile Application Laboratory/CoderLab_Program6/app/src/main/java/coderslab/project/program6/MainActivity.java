package coderslab.project.program6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // GUI Components Declaration
    TextView textViewTimer;
    Button buttonClickMe;

    //Handler Object Declaration
    Handler hand = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClickMe = findViewById(R.id.buttonClickMe);
        textViewTimer = findViewById(R.id.textViewTimer);
        hand.postDelayed(run, 1000);
        buttonClickMe.setVisibility(View.GONE);
    }

    Runnable run = new Runnable()
    {
        @Override
        public void run()
        {
            updateTime();
        }
    };

    public void updateTime()
    {
        textViewTimer.setText("" + (Integer.parseInt(textViewTimer.getText().toString()) - 1));
        if (Integer.parseInt(textViewTimer.getText().toString()) == 0)
        {
            buttonClickMe.setVisibility(View.VISIBLE);
        }
        else {
            hand.postDelayed(run, 1000);
        }
    }


}