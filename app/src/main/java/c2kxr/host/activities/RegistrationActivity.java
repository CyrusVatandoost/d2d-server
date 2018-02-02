package c2kxr.host.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import c2kxr.host.R;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public static class ProviderServiceListActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_provider_event_list);
        }
    }
}
