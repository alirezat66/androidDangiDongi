package greencode.ir.dongiapp.ui.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import greencode.ir.dongiapp.R;
import greencode.ir.dongiapp.utils.BaseActivity;

public class SignUpActivity extends BaseActivity {
    @BindView(R.id.img_logo)
    ImageView imgLogo;
    @BindView(R.id.txt_title)
    TextView txtTitle;
    @BindView(R.id.txt_disc)
    TextView txtDisc;
    @BindView(R.id.ly_title)
    LinearLayout lyTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);
        txtTitle.setText("Dangi Dongi");
        txtDisc.setText("dame shoma garm");
    }
}
