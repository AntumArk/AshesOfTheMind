package zinc.aotm;

import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.multidots.fingerprintauth.AuthErrorCodes;
import com.multidots.fingerprintauth.FingerPrintAuthCallback;
import com.multidots.fingerprintauth.FingerPrintAuthHelper;

public class MainActivity extends AppCompatActivity implements FingerPrintAuthCallback {

    FingerPrintAuthHelper mFingerPrintAuthHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFingerPrintAuthHelper = FingerPrintAuthHelper.getHelper(this,this);

    }
    public void FingerPrintAuthCallback()
    {   Intent i=new Intent(this,TreeActivity.class);
        this.startActivity(i);

    }
    @Override
    protected void onResume() {
        super.onResume();
        //start finger print authentication
        mFingerPrintAuthHelper.startAuth();
    }
    @Override
    protected void onPause() {
        super.onPause();
        mFingerPrintAuthHelper.stopAuth();
    }


    @Override
    public void onNoFingerPrintHardwareFound() {

    }

    @Override
    public void onNoFingerPrintRegistered() {

    }

    @Override
    public void onBelowMarshmallow() {

    }

    @Override
    public void onAuthSuccess(FingerprintManager.CryptoObject cryptoObject) {
        //Authentication sucessful.
        Toast.makeText(this,"Toast? Yes Starting activity",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,TreeActivity.class));
      //  mFingerPrintAuthHelper.stopAuth();
    }



    @Override
    public void onAuthFailed(int errorCode, String errorMessage) {
        switch (errorCode) {    //Parse the error code for recoverable/non recoverable error.
            case AuthErrorCodes.CANNOT_RECOGNIZE_ERROR:
                //Cannot recognize the fingerprint scanned.
                break;
            case AuthErrorCodes.NON_RECOVERABLE_ERROR:
                //This is not recoverable error. Try other options for user authentication. like pin, password.
                break;
            case AuthErrorCodes.RECOVERABLE_ERROR:
                //Any recoverable error. Display message to the user.
                break;
        }
        Toast.makeText(this,"Toast? No",Toast.LENGTH_SHORT).show();
    }

}
