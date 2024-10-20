package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aizw extends LinearLayout {
    public final Button a;
    public final Button b;

    public aizw(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.survey_invitation, (ViewGroup) this, true);
        Button button = (Button) findViewById(R.id.survey_prompt_take_survey_button);
        this.a = button;
        Button button2 = (Button) findViewById(R.id.survey_prompt_no_thanks_button);
        this.b = button2;
        a(button);
        a(button2);
    }

    private final void a(Button button) {
        aizj.e(findViewById(R.id.survey_prompt_buttons), button, 0, R.dimen.survey_button_accessibility_padding);
    }
}
