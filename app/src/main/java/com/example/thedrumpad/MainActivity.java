package com.example.thedrumpad;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import java.io.IOException;

//class LoopMediaPlayer {
//
//    public static final String TAG = LoopMediaPlayer.class.getSimpleName();
//
//    private final Context mContext;
//    private final int mResId;
//    private int mCounter = 1;
//
//    private MediaPlayer mCurrentPlayer;
//    private MediaPlayer mNextPlayer = null;
//
//    public static LoopMediaPlayer create(Context context, int resId) {
//        return new LoopMediaPlayer(context, resId);
//    }
//
//    private LoopMediaPlayer(Context context, int resId) {
//        mContext = context;
//        mResId = resId;
//        mCurrentPlayer = MediaPlayer.create(mContext, mResId);
//        mCurrentPlayer.setOnPreparedListener(mediaPlayer -> mCurrentPlayer.start());
//
//        createNextMediaPlayer();
//    }
//
//    private void createNextMediaPlayer() {
//        mNextPlayer = MediaPlayer.create(mContext, mResId);
//        mCurrentPlayer.setNextMediaPlayer(mNextPlayer);
//        mCurrentPlayer.setOnCompletionListener(onCompletionListener);
//    }
//
//    private final MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() {
//        @Override
//        public void onCompletion(MediaPlayer mediaPlayer) {
//            mediaPlayer.release();
//            mCurrentPlayer = mNextPlayer;
//
//            createNextMediaPlayer();
//
//            Log.d(TAG, String.format("Loop #%d", ++mCounter));
//        }
//    };
//}
//LoopMediaPlayer.create(this, R.raw.sound1);

public class MainActivity extends AppCompatActivity {
//    SoundPool sp;
//    int sound1;
//    int sound2;
//    int sound3;
//    int sound4;
//    int sound5;
//    int sound6;
//    int sound7;
//    int sound8;
//    int sound9;
//    int sound10;
//    int sound11;
//    int sound12;

//    int s1 = 0;
//    int s2 = 0;
//    int s3 = 0;
//    int s4 = 0;
//    int s5 = 0;
//    int s6 = 0;
//    int s7 = 0;
//    int s8 = 0;
//    int s9 = 0;
//    int s10 = 0;
//    int s11 = 0;
//    int s12 = 0;

    int b1 = 0;
    int b2 = 0;
    int b3 = 0;
    int b4 = 0;
    int b5 = 0;
    int b6 = 0;
    int b7 = 0;
    int b8 = 0;
    int b9 = 0;
    int b10 = 0;
    int b11 = 0;
    int b12 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final MediaPlayer sound1 = MediaPlayer.create(this, R.raw.sound1);
        Button btn1 = findViewById(R.id.Btn1);
//        sound1.setLooping(true);
        btn1.setOnClickListener(v -> {
            if(b1 == 0){
                sound1.start();
                b1++;
            }else{
                sound1.stop();
                try {
                    sound1.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                b1 = 0;
            }
        });


        final MediaPlayer sound2 = MediaPlayer.create(this, R.raw.sound2);
        Button btn2 = findViewById(R.id.Btn2);
//        sound2.setLooping(true);
        btn2.setOnClickListener(v -> {
            if(b2 == 0){
                sound2.start();
                b2++;
            }else{
                sound2.stop();
                try {
                    sound2.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                b2 = 0;
            }
        });


        final MediaPlayer sound3 = MediaPlayer.create(this, R.raw.sound3);
        Button btn3 = findViewById(R.id.Btn3);
//        sound3.setLooping(true);
        btn3.setOnClickListener(v -> {
            if(b3 == 0){
                sound3.start();
                b3++;
            }else{
                sound3.stop();
                try {
                    sound3.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                b3 = 0;
            }
        });


        final MediaPlayer sound4 = MediaPlayer.create(this, R.raw.sound4);
        Button btn4 = findViewById(R.id.Btn4);
//        sound4.setLooping(true);
        btn4.setOnClickListener(v -> {
            if(b4 == 0){
                sound4.start();
                b4++;
            }else{
                sound4.stop();
                try {
                    sound4.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                b4 = 0;
            }
        });


        final MediaPlayer sound5 = MediaPlayer.create(this, R.raw.sound5);
        Button btn5 = findViewById(R.id.Btn5);
//        sound5.setLooping(true);
        btn5.setOnClickListener(v -> {
            if(b5 == 0){
                sound5.start();
                b5++;
            }else{
                sound5.stop();
                try {
                    sound5.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                b5 = 0;
            }
        });


        final MediaPlayer sound6 = MediaPlayer.create(this, R.raw.sound6);
        Button btn6 = findViewById(R.id.Btn6);
//        sound6.setLooping(true);
        btn6.setOnClickListener(v -> {
            if(b6 == 0){
                sound6.start();
                b6++;
            }else{
                sound6.stop();
                try {
                    sound6.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                b6 = 0;
            }
        });


        final MediaPlayer sound7 = MediaPlayer.create(this, R.raw.sound7);
        Button btn7 = findViewById(R.id.Btn7);
//        sound7.setLooping(true);
        btn7.setOnClickListener(v -> {
            if(b7 == 0){
                sound7.start();
                b7++;
            }else{
                sound7.stop();
                try {
                    sound7.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                b7 = 0;
            }
        });


        final MediaPlayer sound8 = MediaPlayer.create(this, R.raw.sound8);
        Button btn8 = findViewById(R.id.Btn8);
//        sound8.setLooping(true);
        btn8.setOnClickListener(v -> {
            if(b8 == 0){
                sound8.start();
                b8++;
            }else{
                sound8.stop();
                try {
                    sound8.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                b8 = 0;
            }
        });


        final MediaPlayer sound9 = MediaPlayer.create(this, R.raw.sound9);
        Button btn9 = findViewById(R.id.Btn9);
//        sound9.setLooping(true);
        btn9.setOnClickListener(v -> {
            if(b9 == 0){
                sound9.start();
                b9++;
            }else{
                sound9.stop();
                try {
                    sound9.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                b9 = 0;
            }
        });


        final MediaPlayer sound10 = MediaPlayer.create(this, R.raw.sound10);
        Button btn10 = findViewById(R.id.Btn10);
//        sound10.setLooping(true);
        btn10.setOnClickListener(v -> {
            if(b10 == 0){
                sound10.start();
                b10++;
            }else{
                sound10.stop();
                try {
                    sound10.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                b10 = 0;
            }
        });


        final MediaPlayer sound11 = MediaPlayer.create(this, R.raw.sound11);
        Button btn11 = findViewById(R.id.Btn11);
//        sound11.setLooping(true);
        btn11.setOnClickListener(v -> {
            if(b11 == 0){
                sound11.start();
                b11++;
            }else{
                sound11.stop();
                try {
                    sound11.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                b11 = 0;
            }
        });


        final MediaPlayer sound12 = MediaPlayer.create(this, R.raw.sound12);
        Button btn12 = findViewById(R.id.Btn12);
//        sound12.setLooping(true);
        btn12.setOnClickListener(v -> {
            if(b12 == 0){
                sound12.start();
                b12++;
            }else{
                sound12.stop();
                try {
                    sound12.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                b12 = 0;
            }
        });

        ImageButton plybtn = findViewById(R.id.playButton);
        plybtn.setOnClickListener(v -> {
                sound1.start();
                b1 = 0;

                sound2.start();
                b2 = 0;

                sound3.start();
                b3 = 0;

                sound7.start();
                b7 = 0;
//            sound4.start();
//            b4 = 0;
//
//            sound5.start();
//            b5 = 0;
//
//            sound6.start();
//            b6 = 0;
//
//            sound8.start();
//            b8 = 0;
//
//            sound9.start();
//            b9 = 0;
//
//            sound10.start();
//            b10 = 0;
//
//            sound11.start();
//            b11 = 0;
//
//            sound12.start();
//            b12 = 0;

        });

        ImageButton stpbtn = findViewById(R.id.stopButton);
        stpbtn.setOnClickListener(v -> {

            sound1.stop();
            try {
                sound1.prepare();
            } catch (IOException e) {
                e.printStackTrace();
            }
            b1 = 0;

            sound2.stop();
            try {
                sound2.prepare();
            } catch (IOException e) {
                e.printStackTrace();
            }
            b2 = 0;

            sound3.stop();
            try {
                sound3.prepare();
            } catch (IOException e) {
                e.printStackTrace();
            }
            b3 = 0;

            sound4.stop();
            try {
                sound4.prepare();
            } catch (IOException e) {
                e.printStackTrace();
            }
            b4 = 0;

            sound5.stop();
            try {
                sound5.prepare();
            } catch (IOException e) {
                e.printStackTrace();
            }
            b5 = 0;

            sound6.stop();
            try {
                sound6.prepare();
            } catch (IOException e) {
                e.printStackTrace();
            }
            b6 = 0;

            sound7.stop();
            try {
                sound7.prepare();
            } catch (IOException e) {
                e.printStackTrace();
            }
            b7 = 0;

            sound8.stop();
            try {
                sound8.prepare();
            } catch (IOException e) {
                e.printStackTrace();
            }
            b8 = 0;

            sound9.stop();
            try {
                sound9.prepare();
            } catch (IOException e) {
                e.printStackTrace();
            }
            b9 = 0;

            sound10.stop();
            try {
                sound10.prepare();
            } catch (IOException e) {
                e.printStackTrace();
            }
            b10 = 0;

            sound11.stop();
            try {
                sound11.prepare();
            } catch (IOException e) {
                e.printStackTrace();
            }
            b11 = 0;

            sound12.stop();
            try {
                sound12.prepare();
            } catch (IOException e) {
                e.printStackTrace();
            }
            b12 = 0;
        });

//        AudioAttributes audioAttributes = new AudioAttributes.Builder()
//                .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
//                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
//                .build();
//        sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
//
//        sp = new SoundPool.Builder()
//                .setMaxStreams(12)
//                .setAudioAttributes(audioAttributes)
//                .build();
//
//        sound1 = sp.load(getApplicationContext(), R.raw.sound1,1);
//        sound2 = sp.load(getApplicationContext(), R.raw.sound2,1);
//        sound3 = sp.load(getApplicationContext(), R.raw.sound3,1);
//        sound4 = sp.load(getApplicationContext(), R.raw.sound4,1);
//        sound5 = sp.load(getApplicationContext(), R.raw.sound5,1);
//        sound6 = sp.load(getApplicationContext(), R.raw.sound6,1);
//        sound7 = sp.load(getApplicationContext(), R.raw.sound7,1);
//        sound8 = sp.load(getApplicationContext(), R.raw.sound8,1);
//        sound9 = sp.load(getApplicationContext(), R.raw.sound9,1);
//        sound10 = sp.load(getApplicationContext(), R.raw.sound10,1);
//        sound11 = sp.load(getApplicationContext(), R.raw.sound11,1);
//        sound12 = sp.load(getApplicationContext(), R.raw.sound12,1);
    }

//    public void playSound1(View v) {
//        sp.play(sound1,1.0f,1.0f,0,0,10f);
//    }
//    public void playSound2(View view) {
//        sp.play(sound2,1.0f,1.0f,0,0,10f);
//    }
//    public void playSound3(View view) {
//        sp.play(sound3,1.0f,1.0f,0,0,10f);
//    }
//    public void playSound4(View view) {
//        sp.play(sound4,1.0f,1.0f,0,0,10f);
//    }
//    public void playSound5(View view) {
//        sp.play(sound5,1.0f,1.0f,0,0,10f);
//    }
//    public void playSound6(View view) {
//        sp.play(sound6,1.0f,1.0f,0,0,10f);
//    }
//    public void playSound7(View view) {
//        sp.play(sound7,1.0f,1.0f,0,0,10f);
//    }
//    public void playSound8(View view) {
//        sp.play(sound8,1.0f,1.0f,0,0,10f);
//    }
//    public void playSound9(View view) {
//        sp.play(sound9,1.0f,1.0f,0,0,10f);
//    }
//    public void playSound10(View view) {
//        sp.play(sound10,1.0f,1.0f,0,0,10f);
//    }
//    public void playSound11(View view) {
//        sp.play(sound11,1.0f,1.0f,0,0,10f);
//    }
//    public void playSound12(View view) {
//        sp.play(sound12,1.0f,1.0f,0,0,10f);
//    }
}