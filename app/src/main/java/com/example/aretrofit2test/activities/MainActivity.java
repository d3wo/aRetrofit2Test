package com.example.aretrofit2test.activities;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aretrofit2test.R;
import com.example.aretrofit2test.interfaces.UserAPIService;
import com.example.aretrofit2test.models.Id;
import com.example.aretrofit2test.models.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_API_URL = "https://randomuser.me/";

    Button btnGenerate;
    TextView txtView;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btnGenerate = (Button) findViewById(R.id.btnGenerate);
        txtView = (TextView) findViewById(R.id.txtView);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGenerateClicked();
            }
        });


    }



    private void btnGenerateClicked() {
        txtView.setText("Btn Clicked");
        UserAPIService api = UserAPIService.Factory.getIstance(MainActivity.this);
        progressDialog = ProgressDialog.show(this, "","Please Wait...", true);

        api.getApi().enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(response.isSuccessful()){
                    txtView.setText(response.body().toString());
                    progressDialog.dismiss();
                }
                else{
                    Toast.makeText(MainActivity.this, "Fetching data failed", Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();
                }
            }


            @Override
            public void onFailure(Call<User> call, Throwable t) {
                progressDialog.dismiss();

            }
        });

    }

}
