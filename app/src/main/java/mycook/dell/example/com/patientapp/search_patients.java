package mycook.dell.example.com.patientapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.activeandroid.query.Select;

import java.util.List;

import mycook.dell.example.com.patientapp.adapters.PatientsListAdapter;
import mycook.dell.example.com.patientapp.model.Patient;

import static android.R.attr.category;

public class search_patients extends AppCompatActivity implements View.OnClickListener {
    RecyclerView mRecyclerView;
    EditText mEditText,s_date;
    ImageView mImageView,search_icon_date;
    PatientsListAdapter mPatientsListAdapter;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_patients);
        views();
        s_date=(EditText)findViewById(R.id.s_date);
search_icon_date.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        List<Patient> patients = new Select().from(Patient.class)
                .where("Patient_date = '" + s_date.getText().toString() + "'")
                .execute();
        mPatientsListAdapter = new PatientsListAdapter(patients);
        mRecyclerView.setAdapter(mPatientsListAdapter);
        mLayoutManager = new LinearLayoutManager(search_patients.this);
        mRecyclerView.setLayoutManager(mLayoutManager);

    }
});
    }

    public void views() {
        search_icon_date=(ImageView)findViewById(R.id.search_icon_date);
        mRecyclerView = (RecyclerView) findViewById(R.id.show_patients);
        mImageView = (ImageView) findViewById(R.id.search_icon);
        mEditText = (EditText) findViewById(R.id.s_name);
        mImageView.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

            List<Patient> patients = new Select().from(Patient.class)
                    .where("Patient_name = '" + mEditText.getText().toString() + "'")
                    .execute();
            mPatientsListAdapter = new PatientsListAdapter(patients);
            mRecyclerView.setAdapter(mPatientsListAdapter);
            mLayoutManager = new LinearLayoutManager(this);
            mRecyclerView.setLayoutManager(mLayoutManager);

}
}


