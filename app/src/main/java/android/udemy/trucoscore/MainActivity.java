package android.udemy.trucoscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button left1Btn;
    private Button left3Btn;
    private Button left6Btn;
    private Button left9Btn;

    private Button right1Btn;
    private Button right3Btn;
    private Button right6Btn;
    private Button right9Btn;

    private Button resetBtn;

    private TextView scoreUsTv;
    private TextView scoreThemTv;

    private int scoreUs;
    private int scoreThem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        left1Btn = findViewById(R.id.left_1_button);
        left1Btn.setOnClickListener(this);
        left3Btn = findViewById(R.id.left_3_button);
        left3Btn.setOnClickListener(this);
        left6Btn = findViewById(R.id.left_6_button);
        left6Btn.setOnClickListener(this);
        left9Btn = findViewById(R.id.left_9_button);
        left9Btn.setOnClickListener(this);

        right1Btn = findViewById(R.id.right_1_button);
        right1Btn.setOnClickListener(this);
        right3Btn = findViewById(R.id.right_3_button);
        right3Btn.setOnClickListener(this);
        right6Btn = findViewById(R.id.right_6_button);
        right6Btn.setOnClickListener(this);
        right9Btn = findViewById(R.id.right_9_button);
        right9Btn.setOnClickListener(this);

        resetBtn = findViewById(R.id.reset_button);
        resetBtn.setOnClickListener(this);

        scoreUsTv = findViewById(R.id.score_us_tv);
        scoreThemTv = findViewById(R.id.score_them_tv);

        scoreUs = 0;
        scoreThem = 0;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.left_1_button:
                scoreUs += 1;
                break;
            case R.id.left_3_button:
                scoreUs += 3;
                break;
            case R.id.left_6_button:
                scoreUs += 6;
                break;
            case R.id.left_9_button:
                scoreUs += 9;
                break;
            case R.id.right_1_button:
                scoreThem += 1;
                break;
            case R.id.right_3_button:
                scoreThem += 3;
                break;
            case R.id.right_6_button:
                scoreThem += 7;
                break;
            case R.id.right_9_button:
                scoreThem += 9;
                break;
            case R.id.reset_button:
                scoreThem = 0;
                scoreUs = 0;
            default:
                break;
        }

        scoreUsTv.setText(""+scoreUs);
        scoreThemTv.setText(""+scoreThem);
    }
}
