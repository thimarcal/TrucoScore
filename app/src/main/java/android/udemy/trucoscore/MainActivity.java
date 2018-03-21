package android.udemy.trucoscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mLeft1Btn;
    private Button mLeft3Btn;
    private Button mLeft6Btn;
    private Button mLeft9Btn;

    private Button mRight1Btn;
    private Button mRight3Btn;
    private Button mRight6Btn;
    private Button mRight9Btn;

    private Button mResetBtn;

    private TextView mScoreUsTv;
    private TextView mScoreThemTv;

    private int scoreUs;
    private int scoreThem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLeft1Btn = findViewById(R.id.left_1_button);
        mLeft1Btn.setOnClickListener(this);
        mLeft3Btn = findViewById(R.id.left_3_button);
        mLeft3Btn.setOnClickListener(this);
        mLeft6Btn = findViewById(R.id.left_6_button);
        mLeft6Btn.setOnClickListener(this);
        mLeft9Btn = findViewById(R.id.left_9_button);
        mLeft9Btn.setOnClickListener(this);

        mRight1Btn = findViewById(R.id.right_1_button);
        mRight1Btn.setOnClickListener(this);
        mRight3Btn = findViewById(R.id.right_3_button);
        mRight3Btn.setOnClickListener(this);
        mRight6Btn = findViewById(R.id.right_6_button);
        mRight6Btn.setOnClickListener(this);
        mRight9Btn = findViewById(R.id.right_9_button);
        mRight9Btn.setOnClickListener(this);

        mResetBtn = findViewById(R.id.reset_button);
        mResetBtn.setOnClickListener(this);

        mScoreUsTv = findViewById(R.id.score_us_tv);
        mScoreThemTv = findViewById(R.id.score_them_tv);

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
                scoreThem += 6;
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

        mScoreUsTv.setText(""+scoreUs);
        mScoreThemTv.setText(""+scoreThem);
    }
}
