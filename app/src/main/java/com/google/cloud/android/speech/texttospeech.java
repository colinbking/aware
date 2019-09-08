package com.google.cloud.android.speech;
//package speech.to.text.texttospeech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.EditText;

import org.w3c.dom.Text;

import java.util.Locale;
public class texttospeech extends AppCompatActivity implements TextToSpeech.OnInitListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_texttospeech);
    }


    public void onInit(int status) {
        TextToSpeech textToSpeech = new TextToSpeech(this, this);
        String text ="hello";
        if (status == TextToSpeech.SUCCESS) {
            int result = textToSpeech.setLanguage(Locale.US);
            text = "hello";
            textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
        }

    }

}
