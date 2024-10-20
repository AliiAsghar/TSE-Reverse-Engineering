package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqr {
    public static final dqv a(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        int i = drr.a;
        drq b = drr.b(f);
        if (b == null) {
            b = new drl(f);
        }
        return new dqx(f2, f, b);
    }
}
