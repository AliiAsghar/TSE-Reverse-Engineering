package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afvp {
    public static final /* synthetic */ int c = 0;
    private static final Duration d;
    public boolean a;
    public final arml b = armd.a(afrg.g);

    static {
        Duration ofMillis = Duration.ofMillis(150L);
        ofMillis.getClass();
        d = ofMillis;
    }

    public static final void a(View view, TextView textView, float f, float f2, arqg arqgVar) {
        textView.setVisibility(0);
        ViewPropertyAnimator animate = view.animate();
        Duration duration = d;
        animate.setDuration(duration.toMillis());
        animate.scaleX(f);
        animate.scaleY(f);
        if (arqgVar != null) {
            animate.withEndAction(new aefw(arqgVar, 6));
        }
        animate.start();
        ViewPropertyAnimator animate2 = textView.animate();
        animate2.setDuration(duration.toMillis());
        animate2.alpha(f2);
        animate2.start();
    }

    public static final void b(TextView textView, int i) {
        String string = textView.getResources().getString(R.string.selection_position_text, Integer.valueOf(i + 1));
        string.getClass();
        textView.setText(string);
    }

    public static final void c(View view, TextView textView, float f, float f2) {
        view.setScaleX(f);
        view.setScaleY(f);
        textView.setAlpha(f2);
    }
}
