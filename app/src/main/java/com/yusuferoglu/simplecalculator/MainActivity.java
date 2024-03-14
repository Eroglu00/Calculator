package com.yusuferoglu.simplecalculator;

import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

// GLOBAL OLARAK tanımladık burda

    EditText input01;
    EditText input02;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // görünümün sınıfı yazıldı ilk
        input01 = findViewById(R.id.Input01);

        input02 = findViewById(R.id.Input02);

        resultText = findViewById(R.id.Result01);


    }

    /*
    Ayrıca kullanıcı sadece number girebilsin diye alanların input tipini number yaptık layout kısmından

     */

    // burda view  bu fonksiyonun görünümdeb çağrılacağını
    // belirtmek için kullanılır.
    public void sum(View view) {

        // kullanıcının boş bırakma ihtimaline karşın böyle bi kontrol yaptık
        // gelenn değeri string yaptık ve boş mu kontrol edildi

        //stringler matches() ifadesi ile kontrol edilir == gibi

        if (input01.getText().toString().matches("") || input02.getText().toString().matches("")) {

            resultText.setText("Please enter a value!");
        } else {

            // ilk başta bu ekrandan gelen değer ne stringtir ne integer
            // bu gelen değeri stringe çevirebiliriz
            // sonrasında bu stringi de  Integer.parseInt ile tam sayıya çevirdi

            int number1 = Integer.parseInt(input01.getText().toString());
            int number2 = Integer.parseInt(input02.getText().toString());

            int result = number1 + number2;

            // sonrasında çıkan sonucu ekrana setText ile verir
            // ama bunun için bu gönderilenin string olmasu gerekir
            // normalde result değer int ama başına string ifade yazınca
            // onu string olarak algıalr burda
            resultText.setText("Result: " + result);
        }
    }

    public void subtract(View view) {

        if (input01.getText().toString().matches("") || input02.getText().toString().matches("")) {

            resultText.setText("Please enter a value!");
        } else {


            int number1 = Integer.parseInt(input01.getText().toString());
            int number2 = Integer.parseInt(input02.getText().toString());

            int result = number1 - number2;

            resultText.setText("Result: " + result);
        }
    }

    public void multiply(View view) {

        if (input01.getText().toString().matches("") || input02.getText().toString().matches("")) {

            resultText.setText("Please enter a value!");
        } else {

            int number1 = Integer.parseInt(input01.getText().toString());
            int number2 = Integer.parseInt(input02.getText().toString());

            int result = number1 * number2;

            resultText.setText("Result: " + result);

        }
    }

    public void divide(View view) {


        if (input01.getText().toString().matches("") || input02.getText().toString().matches("")) {

            resultText.setText("Please enter a value!");
        } else {
            int number1 = Integer.parseInt(input01.getText().toString());
            int number2 = Integer.parseInt(input02.getText().toString());

            if( number1 == 0 || number2 == 0) {

                resultText.setText("I cannot perform division if one of the numbers is 0");

            }else if(number1 < number2){
                resultText.setText("First number less than second. So cannnot do it since I can only show integer results");



            }else{   int result = number1 / number2;
                resultText.setText("Result: " + result);   }




        }

    }
}


