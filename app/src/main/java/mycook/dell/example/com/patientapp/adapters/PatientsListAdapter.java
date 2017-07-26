package mycook.dell.example.com.patientapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import mycook.dell.example.com.patientapp.R;
import mycook.dell.example.com.patientapp.adapters.viewholders.PatientListViewHolder;
import mycook.dell.example.com.patientapp.model.Patient;

/**
 * Created by DELL on 7/20/2017.
 */

public class PatientsListAdapter extends RecyclerView.Adapter<PatientListViewHolder> {
    private List<Patient> mPatientList;

    public PatientsListAdapter(List<Patient> mPatientList){
        this.mPatientList = mPatientList;
    }

    @Override
    public PatientListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PatientListViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.patient_list_item_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(PatientListViewHolder holder, int position) {
        Patient patient = mPatientList.get(position);

        holder.patientName.setText(patient.getPatientName());
        holder.patientDisease.setText(patient.getPatientDisease());
        holder.patientMed.setText(patient.getPatientMedician());
        holder.patientDate.setText(patient.getPatientDate());
        holder.patientCost.setText(String.valueOf(patient.getPatientCost()));
    }

    @Override
    public int getItemCount() {
        return mPatientList.size();
    }
}
