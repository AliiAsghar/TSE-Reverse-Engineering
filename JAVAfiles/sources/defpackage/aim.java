package defpackage;

import android.os.Build;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aim {
    public static final boolean a(cqq cqqVar) {
        MotionEvent a;
        int classification;
        if (Build.VERSION.SDK_INT >= 29 && (a = cqqVar.a()) != null) {
            classification = a.getClassification();
            if (classification == 2) {
                return true;
            }
            return false;
        }
        return false;
    }
}
