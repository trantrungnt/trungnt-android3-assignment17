package techkids.mad3.customer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edtName, edtEmail;
    private Button btnInsert;
    private ListView lvCustomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
    }

    private void initComponent()
    {
        edtName = (EditText) this.findViewById(R.id.edtName);
        edtEmail = (EditText) this.findViewById(R.id.edtEmail);
        btnInsert = (Button) this.findViewById(R.id.btnInsert);
        lvCustomer = (ListView) this.findViewById(R.id.lvCustomer);
        btnInsert.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id==R.id.btnInsert)
        {

        }
    }
}
