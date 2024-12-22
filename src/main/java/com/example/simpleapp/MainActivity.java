package src.com.example.simpleapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.simpleapp.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item); // Reference your layout file

        EditText userInput = findViewById(R.id.userInput);
        Button submitButton = findViewById(R.id.submitButton);
        TextView displayText = findViewById(R.id.displayText);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = userInput.getText().toString();
                displayText.setText(input);
            }
        });
    }
}
