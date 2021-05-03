package com.example.myringcaptchaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.thrivecom.ringcaptcha.RingcaptchaApplication;
import com.thrivecom.ringcaptcha.RingcaptchaApplicationHandler;
import com.thrivecom.ringcaptcha.RingcaptchaVerification;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RingcaptchaApplication.verifyPhoneNumber(getApplicationContext(),"uta9u6i7ozybyqoga9ac", "a2ane1i9ohi4u9o3e3uf", new RingcaptchaApplicationHandler() {
            @Override
            public void onSuccess(RingcaptchaVerification ringcaptchaVerification) {
                //Verification successful
                Log.d("SUCCESS_OF_MINE", "Ringcaptcha Success");
            }
            @Override
            public void onCancel() {
                //Decide what to do if user cancelled operation
                Log.d("SUCCESS_OF_MINE", "Ringcaptcha Cancallation");
            }
        });
    }
}