package com.example.miraj.sevenwonder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.buttonId1);
        button2=findViewById(R.id.buttonId2);
        button3=findViewById(R.id.buttonId3);
        button4=findViewById(R.id.buttonId4);
        button5=findViewById(R.id.buttonId5);
        button6=findViewById(R.id.buttonId6);
        button7=findViewById(R.id.buttonId7);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("name","button1");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Great Wall of China (China)", Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("name","button2");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Christ the Redeemer Statue (Rio de Janeiro)", Toast.LENGTH_SHORT).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("name","button3");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Machu Picchu (Peru)", Toast.LENGTH_SHORT).show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("name","button4");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Chichen Itza (Yucatan Peninsula, Mexico)", Toast.LENGTH_SHORT).show();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("name","button5");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "The Roman Colosseum (Rome)", Toast.LENGTH_SHORT).show();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("name","button6");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Taj Mahal (Agra, India)", Toast.LENGTH_SHORT).show();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("name","button7");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Petra (Jordan)", Toast.LENGTH_SHORT).show();
            }
        });





    }
}
