package feedback.hospitality.com.feedback;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    AlertDialog a1;
Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
go();

    }
public void go(){
    next=(Button)findViewById(R.id.btn_nextpage);
    next.setOnClickListener(
            new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Intent pager2=new Intent("feedback.hospitality.com.feedback.page2");
                    startActivity(pager2);
                }
            }
    );


}

}
