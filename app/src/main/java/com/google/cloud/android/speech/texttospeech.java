package com.google.cloud.android.speech;
//package speech.to.text.texttospeech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.EditText;

import org.w3c.dom.Text;

import java.util.Locale;
public class texttospeech extends AppCompatActivity implements TextToSpeech.OnInitListener {

    TextToSpeech textToSpeech;
    String speakTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texttospeech);
    }

    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {
            int result = textToSpeech.setLanguage(Locale.US);
            String text = speakText.getText().toString();
            textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null, null)
        }
        MainActivity respond = new MainActivity();
        if (respond.recieved() == "True"){

        }

    }

}
