package poswel.com.poswel_one;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    //Define your views
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find your views
        imageButton = (ImageButton) findViewById(R.id.image_button);

        //Assign a Listener to your button
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start your second activity
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

            }
        }


        );
    }
}
