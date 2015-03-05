package com.step.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {


    private Button alButton1;
    private Button alButton2;
    private Button alButton3;
    private Button alButton4;
    private Button alButton5;
    private Button alButton6;
    private Button alButton7;
    private Button alButton8;
    private Button alButton9;
    private Button alButton0;
    private Button alButtonAdd;
    private Button alButtonSub;
    private Button alButtonMult;
    private Button alButtonDiv;
    private Button alButtonResult;
    private Button alButtonClear;

    private EditText alTextBox;

    public boolean _result = false;
    public Integer a = null, b = null;
    public float result;
    public char znak;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alTextBox = (EditText) findViewById((R.id.alTextBox));

        alButton1 = (Button) findViewById((R.id.alButton1));
        alButton2 = (Button) findViewById((R.id.alButton2));
        alButton3 = (Button) findViewById((R.id.alButton3));
        alButton4 = (Button) findViewById((R.id.alButton4));
        alButton5 = (Button) findViewById((R.id.alButton5));
        alButton6 = (Button) findViewById((R.id.alButton6));
        alButton7 = (Button) findViewById((R.id.alButton7));
        alButton8 = (Button) findViewById((R.id.alButton8));
        alButton9 = (Button) findViewById((R.id.alButton9));
        alButton0 = (Button) findViewById((R.id.alButton0));
        alButtonAdd = (Button) findViewById((R.id.alButtonAdd));
        alButtonSub = (Button) findViewById((R.id.alButtonSub));
        alButtonMult = (Button) findViewById((R.id.alButtonMult));
        alButtonDiv = (Button) findViewById((R.id.alButtonDiv));
        alButtonResult = (Button) findViewById((R.id.alButtonResult));
        alButtonClear = (Button) findViewById((R.id.alButtonClear));


        alButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(1);
            }
        });
        alButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(2);
            }
        });
        alButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(3);
            }
        });
        alButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(4);
            }
        });
        alButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(5);
            }
        });
        alButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(6);
            }
        });
        alButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(7);
            }
        });
        alButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(8);
            }
        });
        alButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(9);
            }
        });
        alButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(0);
            }
        });


        alButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetZnak('+');
            }
        });
        alButtonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetZnak('-');
            }
        });
        alButtonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetZnak('*');
            }
        });
        alButtonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetZnak('/');
            }
        });


        alButtonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clear();
            }
        });


        alButtonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result();
            }
        });
    }

    public void SetNumber(int i)
    {
        switch (i)
        {
            case 1:
                if (_result == true)
                {
                    alTextBox.setText("");
                    _result = false;
                }
                else if(alTextBox.getText().length() < 9)
                    alTextBox.append("1");break;
            case 2:
                if (_result == true)
                {
                    alTextBox.setText("");
                    _result = false;
                }
                else if(alTextBox.getText().length() < 9)
                    alTextBox.append("2");break;
            case 3:
                if (_result == true)
                {
                    alTextBox.setText("");
                    _result = false;
                }
                else if(alTextBox.getText().length() < 9)
                    alTextBox.append("3");break;
            case 4:
                if (_result == true)
                {
                    alTextBox.setText("");
                    _result = false;
                }
                else if(alTextBox.getText().length() < 9)
                    alTextBox.append("4");break;
            case 5:
                if (_result == true)
                {
                    alTextBox.setText("");
                    _result = false;
                }
                else if(alTextBox.getText().length() < 9)
                    alTextBox.append("5");break;
            case 6:
                if (_result == true)
                {
                    alTextBox.setText("");
                    _result = false;
                }
                else if(alTextBox.getText().length() < 9)
                    alTextBox.append("6");break;
            case 7:
                if (_result == true)
                {
                    alTextBox.setText("");
                    _result = false;
                }
                else if(alTextBox.getText().length() < 9)
                    alTextBox.append("7");break;
            case 8:
                if (_result == true)
                {
                    alTextBox.setText("");
                    _result = false;
                }
                else if(alTextBox.getText().length() < 9)
                    alTextBox.append("8");break;
            case 9:
                if (_result == true)
                {
                    alTextBox.setText("");
                    _result = false;
                }
                else if(alTextBox.getText().length() < 9)
                    alTextBox.append("9");break;
            case 0:
                if (_result == true)
                {
                    alTextBox.setText("");
                    _result = false;
                }
                else if(alTextBox.getText().length() < 9)
                    alTextBox.append("0");

        }
    }
    public void Clear()
    {
        alTextBox.setText("");
        _result = false;
        a = null;
        b = null;
        znak = ' ';
        result = 0;

    }
    public void SetZnak(char znaks)
    {
        switch (znaks)
        {
            case '+':
                if(a == null)
                {
                    znak = '+';
                    a = Integer.parseInt(alTextBox.getText().toString());
                    alTextBox.setText("");
                }break;
            case '-':
                if(a == null)
                {
                    znak = '-';
                    a = Integer.parseInt(alTextBox.getText().toString());
                    alTextBox.setText("");
                }break;
            case '*':
                if(a == null)
                {
                    znak = '*';
                    a = Integer.parseInt(alTextBox.getText().toString());
                    alTextBox.setText("");
                }break;
            case '/':
                if(a == null)
                {
                    znak = '/';
                    a = Integer.parseInt(alTextBox.getText().toString());
                    alTextBox.setText("");
                }break;
        }
    }

    public void Result()
    {
        b = Integer.parseInt(alTextBox.getText().toString());

        switch (znak)
        {
            case '+':
                result = a+b;
                    alTextBox.setText(Double.toString(result));break;
            case '-':
                result = a-b;
                    alTextBox.setText(Double.toString(result));break;
            case '*':
                result = a*b;
                    alTextBox.setText(Double.toString(result));break;
            case '/':
                if(b == 0)
                    alTextBox.setText("null");
                else {
                    result = a / b;
                    alTextBox.setText(Double.toString(result));

                }break;


        }
        _result = true;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
