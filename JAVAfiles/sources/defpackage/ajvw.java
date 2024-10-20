package defpackage;

import android.util.Log;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.setupcompat.internal.TemplateLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajvw implements ajvf {
    public final TemplateLayout a;

    public ajvw(TemplateLayout templateLayout) {
        this.a = templateLayout;
    }

    public final Button a() {
        Button button = (Button) this.a.g(R.id.sud_floating_back_button);
        if (button == null) {
            Log.w("FloatingBackButtonMixin", "Can't find the back button.");
        }
        return button;
    }

    public final FrameLayout b() {
        return (FrameLayout) this.a.g(R.id.sud_layout_floating_back_button_container);
    }
}
