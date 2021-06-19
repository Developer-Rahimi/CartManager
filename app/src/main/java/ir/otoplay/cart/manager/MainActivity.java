package ir.otoplay.cart.manager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONObject;

import ir.otoplay.cart.cartmanager.CartManger;

public class MainActivity extends AppCompatActivity {
    CartManger cartManger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cartManger=new CartManger(this);
        cartManger.SetAmount("00000010");
        cartManger.SetTerminalID("00000005");
        cartManger.setOnCartListener(new CartManger.OnCartListener() {
            @Override
            public void Detect(String Action, JSONObject data) {
                Log.i("TestModule",Action+"-->"+data.toString());
            }
        });
    }
}