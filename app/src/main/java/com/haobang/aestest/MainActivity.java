package com.haobang.aestest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aesHelper();
        aes();
    }

    private void aes() {
        String data = "123";
        String key = "abcd000000000000";
        Log.i("2aes", "data----" + data);

        String mAesEncryptResult = null;
        try {
            mAesEncryptResult = Aes.encrypt(data, key);

            Log.i("2aes", "data----" + mAesEncryptResult);

            String aesDecryptResult = Aes.decrypt(mAesEncryptResult, key);

            Log.i("2aes", "data----" + aesDecryptResult);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void aesHelper() {
        String data = "M571C;5.1;1080*1920;99000645482509;460110416499057;;54:14:73:92:b9:26;81CEBMC23LWT;8122b5a884ba3144";
        String key = "abcd";
        Log.i("2aesHelper",key.length()+"");
        Log.i("2aesHelper", "data----" + data);
//        key=AesHelper.getMD5Str(key);
        String mAesEncryptResult = null;
        try {
            mAesEncryptResult = AesHelper.encrypt(data, key);

            Log.i("2aesHelper", "data----" + mAesEncryptResult);

            String aesDecryptResult = AesHelper.decrypt(mAesEncryptResult, key);

            Log.i("2aesHelper", "data----" + aesDecryptResult);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
