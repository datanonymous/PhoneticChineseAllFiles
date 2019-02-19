package ko.alex.phoneticchinese;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MoneyActivity extends AppCompatActivity {

    public void convertFunction(View view){
        EditText chinaEditText = findViewById(R.id.chinaedittext);

        Double chinaAmountDouble = 0.0;

        if(chinaEditText.length()>0){
            chinaAmountDouble = Double.parseDouble(chinaEditText.getText().toString());
        } else{
            chinaAmountDouble = 0.0;
        }

        Double chinaDollarAmount = chinaAmountDouble * 0.15;

        TextView chinaDollarsTextView = findViewById(R.id.chinaDollarsTextView);

        chinaDollarsTextView.setText("Dollars $ =  " + chinaDollarAmount);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);
    }
}
