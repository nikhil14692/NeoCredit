package rutherfordit.com.instasalary.activities.privatelimited;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import rutherfordit.com.instasalary.R;
import rutherfordit.com.instasalary.activities.sp.SoleProprietorshipBankDetailsActivity;

public class PlCreditRequirementsActivity extends AppCompatActivity {

    RelativeLayout submitPLCreditReq;
    ImageView back_credit_req;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pl_credit_requirements);

        submitPLCreditReq = findViewById(R.id.submitPLCreditReq);
        back_credit_req = findViewById(R.id.back_credit_req);

        back_credit_req.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        submitPLCreditReq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PrivateLimitedBankDetailsActivity.class);
                startActivity(intent);
                submitPLCreditReq.setBackground(getDrawable(R.drawable.gradient_neocredit));

            }
        });
    }
}