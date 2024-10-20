package defpackage;

import android.content.Context;
import android.os.Build;
import defpackage.dli;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlm {
    public static final dli.a a(Context context) {
        int i;
        dky dkyVar = new dky(context);
        if (Build.VERSION.SDK_INT >= 31) {
            i = dly.a.a(context);
        } else {
            i = 0;
        }
        return new dlk(dkyVar, new dlb(i), dll.a, new dlq(dll.b, 2), new dmb());
    }
}
