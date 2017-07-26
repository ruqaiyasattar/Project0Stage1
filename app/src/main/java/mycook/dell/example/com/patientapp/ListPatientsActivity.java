package mycook.dell.example.com.patientapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.activeandroid.query.Select;

import java.util.List;

import mycook.dell.example.com.patientapp.adapters.PatientsListAdapter;
import mycook.dell.example.com.patientapp.model.Patient;

public class ListPatientsActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    PatientsListAdapter mPatientsListAdapter;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_patients);
        setupViews();
    }

    private void setupViews(){
        mRecyclerView = (RecyclerView)findViewById(R.id.patientsList);
        setupRecycler();
    }

    private void setupRecycler(){
        List<Patient> patients = new Select().from(Patient.class).execute();


        mPatientsListAdapter = new PatientsListAdapter(patients);
        mRecyclerView.setAdapter(mPatientsListAdapter);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
    }
}
