package com.example.miraj.sevenwonder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        imageView=findViewById(R.id.imageView);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);


        String getName=getIntent().getExtras().getString("name");
        Log.d("name",getName);
        if (getName.equals("button1")){
            imageView.setImageResource(R.drawable.greatwall);
            textView1.setText(R.string.name_1);
            textView2.setText(R.string.details_1);
        }

         if (getName.equals("button2")){
            imageView.setImageResource(R.drawable.cheresredemet);
            textView1.setText(R.string.name_2);
            textView2.setText(R.string.details_2);
        }
        if (getName.equals("button3")){
            imageView.setImageResource(R.drawable.maccupiccu);
            textView1.setText(R.string.name_3);
            textView2.setText(R.string.details_3);
        }
       if (getName.equals("button4")){
            imageView.setImageResource(R.drawable.chichanitza);
            textView1.setText(R.string.name_4);
            textView2.setText(R.string.details_4);
        }
        if (getName.equals("button5")){
            imageView.setImageResource(R.drawable.theroman);
            textView1.setText(R.string.name_5);
            textView2.setText(R.string.details_5);
        }
         if (getName.equals("button6")){
            imageView.setImageResource(R.drawable.tajmahal);
            textView1.setText(R.string.name_6);
            textView2.setText(R.string.details_6);
        }
        if (getName.equals("button7")){
            imageView.setImageResource(R.drawable.petra);
            textView1.setText(R.string.name_7);
            textView2.setText(R.string.details_7);
        }
    }
}
