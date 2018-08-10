package com.example.alan.series;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends Activity {

    private ImageView imagem;
    private SeekBar seekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBarId);
        imagem = (ImageView) findViewById(R.id.imagemId);

      seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
          @Override
          public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
           int valorProgresso = progress;

              if (valorProgresso == 1){
                  imagem.setImageResource(R.drawable.pouco);

              }else if(valorProgresso == 2){
                 imagem.setImageResource(R.drawable.medio);
              }else if (valorProgresso==3){
                 imagem.setImageResource(R.drawable.muito);
              }




          }

          @Override
          public void onStartTrackingTouch(SeekBar seekBar) {

          }

          @Override
          public void onStopTrackingTouch(SeekBar seekBar) {

          }
      });

    }
}
