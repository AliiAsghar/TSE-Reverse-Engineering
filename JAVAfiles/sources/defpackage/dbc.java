package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbc {
    public static final dbc a = new dbc();

    private dbc() {
    }

    public final void a(View view, boolean z) {
        if (z) {
            view.setContentSensitivity(1);
        } else {
            view.setContentSensitivity(0);
        }
    }
}
