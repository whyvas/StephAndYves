package com.whyvas.yammr.stephandyves;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import com.larswerkman.holocolorpicker.ColorPicker;
import com.larswerkman.holocolorpicker.OpacityBar;
import com.larswerkman.holocolorpicker.SVBar;
import com.larswerkman.holocolorpicker.SaturationBar;
import com.larswerkman.holocolorpicker.ValueBar;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWebView = new WebView(this);
        Switch table1 = findViewById(R.id.table1);
        final String eating = "/tools?cmd=CANDLE:4::85";
        final String candle = "/tools?cmd=CANDLE:3::255";


        table1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    myWebView.loadUrl("http://192.168.1.61" + eating);
                    Toast.makeText(getApplicationContext(), "Time to eat!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Time to NOT eat!", Toast.LENGTH_SHORT).show();
                    myWebView.loadUrl("http://192.168.1.61" + candle);
                }
            }
        });
        Switch table2 = findViewById(R.id.table2);
        table2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    myWebView.loadUrl("http://192.168.1.62" + eating);
                    Toast.makeText(getApplicationContext(), "Time to eat!", Toast.LENGTH_SHORT).show();
                } else {
                    myWebView.loadUrl("http://192.168.1.62" + candle);
                    Toast.makeText(getApplicationContext(), "Time to NOT eat!", Toast.LENGTH_SHORT).show();
                }// do something, the isChecked will be
                // true if the switch is in the On position
            }
        });
        Switch table3 = findViewById(R.id.table3);
        table3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    myWebView.loadUrl("http://192.168.1.63" + eating);
                    Toast.makeText(getApplicationContext(), "Time to eat!", Toast.LENGTH_SHORT).show();
                } else {
                    myWebView.loadUrl("http://192.168.1.63" + candle);
                    Toast.makeText(getApplicationContext(), "Time to NOT eat!", Toast.LENGTH_SHORT).show();
                }// do something, the isChecked will be
                // true if the switch is in the On position
            }
        });
        Switch table4 = findViewById(R.id.table4);
        table4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    myWebView.loadUrl("http://192.168.1.64" + eating);
                    Toast.makeText(getApplicationContext(), "Time to eat!", Toast.LENGTH_SHORT).show();
                } else {
                    myWebView.loadUrl("http://192.168.1.64" + candle);
                    Toast.makeText(getApplicationContext(), "Time to NOT eat!", Toast.LENGTH_SHORT).show();
                }// do something, the isChecked will be
                // true if the switch is in the On position
            }
        });
        Switch table5 = findViewById(R.id.table5);
        table5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    myWebView.loadUrl("http://192.168.1.65" + eating);
                    Toast.makeText(getApplicationContext(), "Time to eat!", Toast.LENGTH_SHORT).show();
                } else {
                    myWebView.loadUrl("http://192.168.1.65" + candle);
                    Toast.makeText(getApplicationContext(), "Time to NOT eat!", Toast.LENGTH_SHORT).show();
                }// do something, the isChecked will be
                // true if the switch is in the On position
            }
        });
        Switch table6 = findViewById(R.id.table6);
        table6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    myWebView.loadUrl("http://192.168.1.66" + eating);
                    Toast.makeText(getApplicationContext(), "Time to eat!", Toast.LENGTH_SHORT).show();
                } else {
                    myWebView.loadUrl("http://192.168.1.66" + candle);
                    Toast.makeText(getApplicationContext(), "Time to NOT eat!", Toast.LENGTH_SHORT).show();
                }// do something, the isChecked will be
                // true if the switch is in the On position
            }
        });
        Switch table7 = findViewById(R.id.table7);
        table7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    myWebView.loadUrl("http://192.168.1.67" + eating);
                    Toast.makeText(getApplicationContext(), "Time to eat!", Toast.LENGTH_SHORT).show();
                } else {
                    myWebView.loadUrl("http://192.168.1.67" + candle);
                    Toast.makeText(getApplicationContext(), "Time to NOT eat!", Toast.LENGTH_SHORT).show();
                }// do something, the isChecked will be
                // true if the switch is in the On position
            }
        });
        Switch table8 = findViewById(R.id.table8);
        table8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    myWebView.loadUrl("http://192.168.1.68" + eating);
                    Toast.makeText(getApplicationContext(), "Time to eat!", Toast.LENGTH_SHORT).show();
                } else {
                    myWebView.loadUrl("http://192.168.1.68" + candle);
                    Toast.makeText(getApplicationContext(), "Time to NOT eat!", Toast.LENGTH_SHORT).show();
                }// do something, the isChecked will be
                // true if the switch is in the On position
            }
        });
        Switch table9 = findViewById(R.id.table9);
        table9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    myWebView.loadUrl("http://192.168.1.69" + eating);
                    Toast.makeText(getApplicationContext(), "Time to eat!", Toast.LENGTH_SHORT).show();
                } else {
                    myWebView.loadUrl("http://192.168.1.69" + candle);
                    Toast.makeText(getApplicationContext(), "Time to NOT eat!", Toast.LENGTH_SHORT).show();
                }// do something, the isChecked will be
                // true if the switch is in the On position
            }
        });
        Switch table10 = findViewById(R.id.table10);
        table10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    myWebView.loadUrl("http://192.168.1.70" + eating);
                    Toast.makeText(getApplicationContext(), "Time to eat!", Toast.LENGTH_SHORT).show();
                } else {
                    myWebView.loadUrl("http://192.168.1.70" + candle);
                    Toast.makeText(getApplicationContext(), "Time to NOT eat!", Toast.LENGTH_SHORT).show();
                }// do something, the isChecked will be
                // true if the switch is in the On position
            }
        });
        Switch table11 = findViewById(R.id.table11);
        table11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    myWebView.loadUrl("http://192.168.1.71" + eating);
                    Toast.makeText(getApplicationContext(), "Time to eat!", Toast.LENGTH_SHORT).show();
                } else {
                    myWebView.loadUrl("http://192.168.1.71" + candle);
                    Toast.makeText(getApplicationContext(), "Time to NOT eat!", Toast.LENGTH_SHORT).show();
                }// do something, the isChecked will be
                // true if the switch is in the On position
            }
        });
        Switch table12 = findViewById(R.id.table12);
        table12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    myWebView.loadUrl("http://192.168.1.72" + eating);
                    Toast.makeText(getApplicationContext(), "Time to eat!", Toast.LENGTH_SHORT).show();
                } else {
                    myWebView.loadUrl("http://192.168.1.72" + candle);
                    Toast.makeText(getApplicationContext(), "Time to NOT eat!", Toast.LENGTH_SHORT).show();
                }// do something, the isChecked will be
                // true if the switch is in the On position
            }
        });

        Button setAll = (Button) findViewById(R.id.setAll);
        final SeekBar brightness = findViewById(R.id.brightness);
        final Spinner spin = (Spinner) findViewById(R.id.spinner);
        final ColorPicker picker = (ColorPicker) findViewById(R.id.picker);
        final CheckBox customColor = findViewById(R.id.customColor);
        picker.setOldCenterColor(picker.getColor());
        picker.setShowOldCenterColor(false);

        spin.setOnItemSelectedListener(this);
        setAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i = 1; i < 13; i++) {
                    int b = i + 60;
                    String color;
                    if (customColor.isChecked()) color = String.format("%06X", (0xFFFFFF & picker.getColor()));
                    else color = "";
                    final String command = "http://192.168.1." + b + "/tools?cmd=CANDLE:" + spin.getSelectedItemPosition() + ":"+color+":" + brightness.getProgress();
                    WebView webview = new WebView(MainActivity.this);
                    webview.loadUrl(command);
                    webview.setWebViewClient(new WebViewClient() {
                        @Override
                        public boolean shouldOverrideUrlLoading(WebView view, String url) {
                            view.loadUrl(url);
                            return false;
                        }

                        @Override
                        public void onPageFinished(WebView view, String url) {
                            super.onPageFinished(view, url);

                            //------>> EXIT YOUR SPLASH SCREEN HERE
                        }
                    });
                }
            }
        });

    }


    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        // Toast.makeText(getApplicationContext(), "POOP DOLLA: "+position, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}