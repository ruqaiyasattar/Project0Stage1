package mycook.dell.example.com.patientapp.adapters.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import mycook.dell.example.com.patientapp.R;

/**
 * Created by DELL on 7/20/2017.
 */

public class PatientListViewHolder extends RecyclerView.ViewHolder {
    public TextView patientName;
    public TextView patientDisease;
    public TextView patientMed;
    public TextView patientDate;
    public TextView patientCost;
    public PatientListViewHolder(View itemView) {
        super(itemView);
        patientName = (TextView)itemView.findViewById(R.id.patientName);
        patientDisease=(TextView)itemView.findViewById(R.id.patientdisease);
        patientMed=(TextView)itemView.findViewById(R.id.patientMed);
        patientDate = (TextView)itemView.findViewById(R.id.patientDate);
        patientCost=(TextView)itemView.findViewById(R.id.patientCost);

    }
}
