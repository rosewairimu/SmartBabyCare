package com.example.smartbabycare.ui.about;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.smartbabycare.R;

public class AboutFragment extends Fragment {
    private ImageView btn_backHome;
    private ProgressBar progressBar;
    private TextView mail_Contact;
    private  TextView Phone;

    private AboutViewModel mViewModel;

    public static AboutFragment newInstance() {

        return new AboutFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_nav_about, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AboutViewModel.class);
        // TODO: Use the ViewModel
    }

}


//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.ProgressBar;
//import android.widget.TextView;
//
//import androidx.appcompat.app.ActionBar;
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.example.smartbabycare.R;
//import com.example.smartbabycare.SmartBaby;
////import com.example.smartbabycare.ui.home.HomeFragment;
//
//
//import java.util.Objects;
//
//public class AboutFragment extends AppCompatActivity {
//    private ImageView btn_backHome;
//    private ProgressBar progressBar;
//    private TextView mail_Contact;
//    private  TextView Phone;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_nav_about);
//
//        btn_backHome= findViewById(R.id.iv_back);
//        progressBar= findViewById(R.id.simpleProgressBar);
//        mail_Contact  = findViewById(R.id.cont_email);
//        Phone = findViewById(R.id.phone);
//
//        ActionBar actionBar = getSupportActionBar();
//        Objects.requireNonNull(actionBar).hide();
//
//        btn_backHome.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                progressBar.setVisibility(View.VISIBLE);
//                Intent intent = new Intent(getApplicationContext(), SmartBaby.class);
//                startActivity(intent);
//                finish();
//                return;
////
////                startActivity(new Intent(getApplicationContext(), HomeFragment.class));
////                finish();
//            }
//        });
//    }
