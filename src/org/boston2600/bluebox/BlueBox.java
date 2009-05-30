package org.boston2600.bluebox;

import java.io.IOException;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class BlueBox extends Activity {
  private static final String TAG = "BlueBox";
  
  
  public void playSound(int resid) {
    try {
      AssetFileDescriptor afd = getResources().openRawResourceFd(resid);

      if (afd != null) {
        MediaPlayer mp = new MediaPlayer();
        mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
        afd.close();
        mp.prepare();

        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setOnCompletionListener(new OnCompletionListener() {
          @Override
          public void onCompletion(MediaPlayer mp) {
            mp.release();
          }
        });
        mp.start();
      }
    } catch (IOException ex) {
      Log.d(TAG, "create failed:", ex);
    } catch (IllegalArgumentException ex) {
      Log.d(TAG, "create failed:", ex);
    } catch (SecurityException ex) {
      Log.d(TAG, "create failed:", ex);
    }
  }

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.main);
    
    Button zeroButton = (Button) findViewById(R.id.zero);
    zeroButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        playSound(R.raw.blue_0);
      }
    });

    Button oneButton = (Button) findViewById(R.id.one);
    oneButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        playSound(R.raw.blue_1);
      }
    });

    Button twoButton = (Button) findViewById(R.id.two);
    twoButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        playSound(R.raw.blue_2);
      }
    });

    Button threeButton = (Button) findViewById(R.id.three);
    threeButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        playSound(R.raw.blue_3);
      }
    });

    Button fourButton = (Button) findViewById(R.id.four);
    fourButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        playSound(R.raw.blue_4);
      }
    });

    Button fiveButton = (Button) findViewById(R.id.five);
    fiveButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        playSound(R.raw.blue_5);
      }
    });

    Button sixButton = (Button) findViewById(R.id.six);
    sixButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        playSound(R.raw.blue_6);
      }
    });

    Button sevenButton = (Button) findViewById(R.id.seven);
    sevenButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        playSound(R.raw.blue_7);
      }
    });
    
    Button eightButton = (Button) findViewById(R.id.eight);
    eightButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        playSound(R.raw.blue_8);
      }
    });

    Button nineButton = (Button) findViewById(R.id.nine);
    nineButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        playSound(R.raw.blue_9);
      }
    });

    Button startButton = (Button) findViewById(R.id.start);
    startButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        playSound(R.raw.blue_st);
      }
    });

    Button keypulseButton = (Button) findViewById(R.id.keypulse);
    keypulseButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        playSound(R.raw.blue_kp);
      }
    });
    
    Button trunkButton = (Button) findViewById(R.id.trunk);
    trunkButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        playSound(R.raw.blue_2600);
      }
    });
  }
}
