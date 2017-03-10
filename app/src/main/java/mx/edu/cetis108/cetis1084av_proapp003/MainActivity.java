package mx.edu.cetis108.cetis1084av_proapp003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txtView;
    EditText edText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edText = (EditText) findViewById(R.id.editText2);
        btn = (Button) findViewById(R.id.button2);
        txtView = (TextView) findViewById(R.id.textView4);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String dato = edText.getText().toString();
        txtView.setText(dato);
    }
}
