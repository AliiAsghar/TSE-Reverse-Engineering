package defpackage;

import android.view.KeyEvent;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aec {
    public static final long a = ViewConfiguration.getTapTimeout();

    public static final boolean a(KeyEvent keyEvent) {
        int a2 = cpx.a(cpt.b(keyEvent));
        if (a2 != 23 && a2 != 62 && a2 != 66 && a2 != 160) {
            return false;
        }
        return true;
    }
}
