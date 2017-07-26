package mycook.dell.example.com.patientapp;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.activeandroid.query.Select;

import java.text.SimpleDateFormat;
import java.util.List;

import mycook.dell.example.com.patientapp.adapters.viewholders.PatientListViewHolder;
import mycook.dell.example.com.patientapp.model.DataDialogue;
import mycook.dell.example.com.patientapp.model.Patient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText patientName,patientDisease,patientMedication,patientDate,patientCost;
    Button InsertData,viewpatients,searchpatients;
    public Patient mPatient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        patientName = (EditText) findViewById(R.id.patient_name);
        patientDisease=(EditText)findViewById(R.id.patient_disease);
        patientMedication=(EditText)findViewById(R.id.patient_medication);
        patientDate=(EditText)findViewById(R.id.patient_date);
        patientCost=(EditText)findViewById(R.id.patient_cost);
        InsertData = (Button) findViewById(R.id.insert_Name);
        searchpatients=(Button)findViewById(R.id.search);
        viewpatients=(Button)findViewById(R.id.view);
        InsertData.setOnClickListener(this);
        viewpatients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ListPatientsActivity.class));
            }
        });

        searchpatients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,search_patients.class));
            }
        });
patientDate.setOnFocusChangeListener(new View.OnFocusChangeListener() {
    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if (hasFocus){
            DataDialogue dialogue=new DataDialogue(v);
            android.app.FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
            dialogue.show(fragmentTransaction,"DatePicker");
        }
    }
});

    }

    @Override
    public void onClick(View v) {
        mPatient = new Patient();
        String patient_name = patientName.getText().toString();
        String patient_disease =patientDisease.getText().toString();
        String patient_Med =patientMedication.getText().toString();
       String patient_date=patientDate.getText().toString();
        int cost = Integer.parseInt( patientCost.getText().toString() );

        mPatient.setPatientName(patient_name);
        mPatient.setPatientDisease(patient_disease);
        mPatient.setPatientMedician(patient_Med);
        mPatient.setPatientDate(patient_date);
        mPatient.setPatientCost(cost);
        mPatient.save();
        Toast.makeText(getApplicationContext(), "Data successfully saved to database", Toast.LENGTH_SHORT).show();
    }




}
