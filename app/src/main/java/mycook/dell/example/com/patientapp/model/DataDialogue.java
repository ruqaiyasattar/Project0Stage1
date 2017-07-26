package mycook.dell.example.com.patientapp.model;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

/**
 * Created by DELL on 7/26/2017.
 */

public class DataDialogue extends DialogFragment implements DatePickerDialog.OnDateSetListener {
EditText p_date;
    public DataDialogue(View view) {
        p_date=(EditText)view;

    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar mCalender=Calendar.getInstance();
        int year = mCalender.get(Calendar.YEAR);
        int month=mCalender.get(Calendar.YEAR);;
        int dayOfMonth=mCalender.get(Calendar.DAY_OF_MONTH);
        return new DatePickerDialog(getActivity(),this,year,month,dayOfMonth);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
String date=dayOfMonth+"-"+(month+1)+"-"+year;
        p_date.setText(date);
    }
}
