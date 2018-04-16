package www.newproj.com.newpro;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
       Button Signup, learnmore, login;

    DatabaseHandler db;
    private EditText inputName, inputEmail, inputMobile, inputPass;
    String name,lastname,email,mobile,password;

    SharedPreferences sharedpreferences;
    SharedPreferences.Editor editor;
    public static final String MyPREFERENCES = "MyPrefs";

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_secondactivity);

        db = new DatabaseHandler(this);

         /*to store key-value pairs through out the app*/
        sharedpreferences = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);
        editor = sharedpreferences.edit();

        inputName = (EditText) findViewById(R.id.username);
        inputEmail = (EditText) findViewById(R.id.email);
        inputMobile = (EditText) findViewById(R.id.emob);
        inputPass = (EditText) findViewById(R.id.epass);
       // inputDate = (EditText) findViewById(R.id.edate);

                 count++;

                Log.v("added","");
                name = inputName.getText().toString();
                email = inputEmail.getText().toString().trim();
                mobile = inputMobile.getText().toString().trim();
                password = inputPass.getText().toString().trim();
                lastname = "test";

                System.out.println("name : "+name+"\n"+"lastname : "+lastname+"\n"+"email: "+email+"\n"+"mobile : "+mobile+"\n"+"password : "+password);

                db.addClient(new Clientdata(name,lastname,email,mobile,password));

                /*Add data to sharedpref*/

                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("id", String.valueOf(count));
                editor.putString("name", name);
                editor.putString("lastname", lastname);
                editor.putString("email", email);
                editor.putString("mobile", mobile);
                editor.putString("password", password);

                editor.commit();


                Intent third= new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(third);


                Signup = (Button) findViewById(R.id.signup);
                Signup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent signupactivity = new Intent(SecondActivity.this, SignupActivity.class);
                        startActivity(signupactivity);
                    }
                });
                learnmore = (Button) findViewById(R.id.learn);
                learnmore.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent learnmore = new Intent(SecondActivity.this, LearnmoreActivity.class);
                        startActivity(learnmore);
                    }
                });

                login = (Button) findViewById(R.id.login);
                login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent loginact = new Intent(SecondActivity.this, LoginActivity.class);
                        startActivity(loginact);
                    }
                });

        }

}



