package pt.ulp.ei.projeto_21701916;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class CalculoIUCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_iuc);
    }



    public void Calcular( ) {

        RadioGroup radioGroupCilindrada = (RadioGroup) findViewById(R.id.radioGroupCilindrada);
        RadioGroup radioGroupEmissoes  = (RadioGroup) findViewById(R.id.radioGroupEmissoes);


        int op = radioGroupCilindrada.getCheckedRadioButtonId();

        switch () {
            case R.id.radioButton1:

                break;
            case R.id.radioButton2:

                break;

            case R.id.radioButton3:

                break;

            case R.id.radioButton4: 

                break;

        }

        switch () {
            case R.id.radioButton5:

                break;
            case R.id.radioButton6:

                break;

            case R.id.radioButton7:

                break;

            case R.id.radioButton8:

                break;

        }





    }


}
