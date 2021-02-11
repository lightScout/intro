import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

git initpackage com.brithbroadcast.intro;

public class MainActivity extends AppCompatActivity {

    private TextView mainTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainTextView = findViewById(R.id.main_textview);
        mainTextView.setText("Love");
    }

}