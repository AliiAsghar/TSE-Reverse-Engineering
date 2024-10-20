package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class accm {
    private static final ThreadLocal a = new accl();

    public static SharedPreferences a(Context context, String str) {
        acck acckVar;
        abmt abmtVar = accg.a;
        if (str.equals("")) {
            acckVar = new acck();
        } else {
            acckVar = null;
        }
        if (acckVar != null) {
            return acckVar;
        }
        ThreadLocal threadLocal = a;
        d.s(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th) {
            a.set(Boolean.TRUE);
            throw th;
        }
    }
}
