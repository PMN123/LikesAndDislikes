package com.example.likesanddislikes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void saladFunction(View view) {

        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);

        Toast.makeText(this, editTextTextPersonName.getText().toString() + ", you should eat a salad today!", Toast.LENGTH_LONG).show();

    }

    public void chickenFunction(View view) {

        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);

        Toast.makeText(this, editTextTextPersonName.getText().toString() + ", you should eat a chicken today!", Toast.LENGTH_LONG).show();

    }

    public void cheeseFunction(View view) {

        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);

        Toast.makeText(this, editTextTextPersonName.getText().toString() + ", you should eat some cheese today!", Toast.LENGTH_LONG).show();

    }

    public void riceFunction(View view) {

        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);

        Toast.makeText(this, editTextTextPersonName.getText().toString() + ", you should eat some rice today!", Toast.LENGTH_LONG).show();

    }

    public void teaFunction(View view) {

        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);

        Toast.makeText(this, editTextTextPersonName.getText().toString() + ", you should drink some tea today!", Toast.LENGTH_LONG).show();

    }

    public void coffeeFunction(View view) {

        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);

        Toast.makeText(this, editTextTextPersonName.getText().toString() + ", you should drink some coffee today!", Toast.LENGTH_LONG).show();

    }

    public void milkFunction(View view) {

        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);

        Toast.makeText(this, editTextTextPersonName.getText().toString() + ", you should drink some milk today!", Toast.LENGTH_LONG).show();

    }

    public void eggsFunction(View view) {

        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);

        Toast.makeText(this, editTextTextPersonName.getText().toString() + ", you should eat some eggs today!", Toast.LENGTH_LONG).show();

    }

    public void applesFunction(View view) {

        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);

        Toast.makeText(this, editTextTextPersonName.getText().toString() + ", you should eat some apples today!", Toast.LENGTH_LONG).show();

    }

    public void breadFunction(View view) {

        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);

        Toast.makeText(this, editTextTextPersonName.getText().toString() + ", you should eat some bread today!", Toast.LENGTH_LONG).show();

    }

    public void soupFunction(View view) {

        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);

        Toast.makeText(this, editTextTextPersonName.getText().toString() + ", you should drink some soup today!", Toast.LENGTH_LONG).show();

    }

    public void yogurtFunction(View view) {

        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);

        Toast.makeText(this, editTextTextPersonName.getText().toString() + ", you should drink some yogurt today!", Toast.LENGTH_LONG).show();

    }

    public void enterFunction(View view) {

        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);

        EditText editTextFavoriteFood = (EditText) findViewById(R.id.editTextFavoriteFood);

        Toast.makeText(this, editTextTextPersonName.getText().toString() + ", you should eat some " + editTextFavoriteFood.getText().toString() +" today!", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}