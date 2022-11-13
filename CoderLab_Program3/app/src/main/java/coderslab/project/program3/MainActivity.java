package coderslab.project.program3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // GUI Components Declaration
    ImageView imageViewGraphicalPrimitives;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get All GUI Components from XML File
        imageViewGraphicalPrimitives = findViewById(R.id.imageViewGraphicalPrimitives);

        //GraphicalBitmap Creation
        Bitmap bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);

        //Set GraphicalBitmap for ImageView
        imageViewGraphicalPrimitives.setBackgroundDrawable(new BitmapDrawable(bg));

        //Canvas Object Creation
        Canvas canvas = new Canvas(bg);

        //Create Paint Object and set properties for Pain Object
        Paint paintRectangle = new Paint();
        paintRectangle.setColor(Color.DKGRAY);
        paintRectangle.setTextSize(40);

        Paint paintCircle = new Paint();
        paintCircle.setColor(Color.GRAY);
        paintCircle.setTextSize(40);

        Paint paintSquare = new Paint();
        paintSquare.setColor(Color.MAGENTA);
        paintSquare.setTextSize(40);

        Paint paintLine = new Paint();
        paintLine.setColor(Color.RED);
        paintLine.setTextSize(40);

        //Draw a Rectangle
        canvas.drawText("Rectangle", 420, 150, paintRectangle);
        canvas.drawRect(400, 200, 650, 700, paintRectangle);

        //Draw a Circle
        canvas.drawText("Circle", 120, 150, paintCircle);
        canvas.drawCircle(200, 350, 150, paintCircle);

        //Draw a Square
        canvas.drawText("Square", 120, 800, paintSquare);
        canvas.drawRect(50, 850, 350, 1150, paintSquare);

        //Draw a Line
        canvas.drawText("Line", 480, 800, paintLine);
        canvas.drawLine(520, 850, 520, 1150, paintLine);
    }
}