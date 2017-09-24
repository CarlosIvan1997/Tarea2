package poclin.carlos.tarea2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityCrear extends AppCompatActivity {

    ArrayList <Usuario> users  = new ArrayList <Usuario>();
    private static final String TAG = "ActivityCrear";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear);

        Spinner spinner = (Spinner) findViewById(R.id.spinner_sexo);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.sa_sexo, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        Button mBtnGuardar =  (Button) findViewById(R.id.btn_guardar);

        mBtnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mSname, mSap, mSam, mSedad, mSsexo, mScorreo, mSuser, mSpass;

                EditText mEtName = (EditText) findViewById(R.id.et_names);
                EditText mEtAp = (EditText) findViewById(R.id.et_apellido_paterno);
                EditText mEtAm = (EditText) findViewById(R.id.et_apellido_materno);
                EditText mEtEdad = (EditText) findViewById(R.id.et_edad);
                Spinner mSpinSexo = (Spinner) findViewById(R.id.spinner_sexo);
                EditText mEtCorreo = (EditText) findViewById(R.id.et_correo);
                EditText mEtUser = (EditText) findViewById(R.id.et_user);
                EditText mEtPass = (EditText) findViewById(R.id.et_password);

                mSname = mEtName.getText().toString().trim();
                mSap = mEtAp.getText().toString().trim();
                mSam = mEtAm.getText().toString().trim();
                mSedad = mEtEdad.getText().toString().trim();
                mSsexo = mSpinSexo.getSelectedItem().toString();
                mScorreo = mEtCorreo.getText().toString().trim();
                mSuser = mEtUser.getText().toString().trim();
                mSpass = mEtPass.getText().toString();

                int correcto = 0;

                if(mSname.equals("")){correcto++;}
                if(mSap.equals("")){correcto++;}
                if(mSam.equals("")){correcto++;}
                if(mSedad.equals("")){correcto++;}
                if(mScorreo.equals("")){correcto++;}
                if(mSuser.equals("")){correcto++;}
                if(mSpass.equals("")){correcto++;}

                if(correcto!=0){

                    Log.i(TAG,"Error");
                    Toast.makeText(ActivityCrear.this, "Complete todos los datos correctamente", Toast.LENGTH_SHORT).show();

                }else{

                    Toast.makeText(ActivityCrear.this, "Se creó la cuenta satisfactoriamente", Toast.LENGTH_SHORT).show();

                    add(users, mSname, mSap, mSam, mSedad, mSsexo, mScorreo, mSuser, mSpass);
                    Log.i(TAG,"Usuario Creado\t" + mSname);

                    Intent intent = new Intent(ActivityCrear.this, Activity1.class);

                    startActivity(intent);

                    mEtName.setText("");
                    mEtAp.setText("");
                    mEtAm.setText("");
                    mEtEdad.setText("");
                    mEtCorreo.setText("");
                    mEtUser.setText("");
                    mEtPass.setText("");
                }
            }
        });
    }

    public void add(ArrayList <Usuario> users, String u_name, String u_ap, String u_am, String u_edad, String u_sexo, String u_correo, String u_user, String u_pass){

        users.add(new Usuario(u_name, u_ap, u_am, u_edad, u_sexo, u_correo, u_user, u_pass));

    }

}
