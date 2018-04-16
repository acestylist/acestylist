package www.newproj.com.newpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignupActivity extends AppCompatActivity {
    Button Signup2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Signup2 = (Button) findViewById(R.id.login);
        Signup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signupactivity = new Intent(SignupActivity.this, SecondActivity.class);
                startActivity(signupactivity);
            }
        });

    }
}
