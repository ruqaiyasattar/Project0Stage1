package mycook.dell.example.com.patientapp.config;

import android.app.Application;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.Model;

import mycook.dell.example.com.patientapp.model.Patient;

/**
 * Created by DELL on 7/20/2017.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        com.activeandroid.Configuration.Builder config = new  com.activeandroid.Configuration.Builder(this);
        config.addModelClasses(Model.class, Patient.class);
        ActiveAndroid.initialize(config.create());
       // ActiveAndroid.initialize(this);
    }
}
