package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acrj {
    public static final Object a = new Object();
    public static acrh b;

    public static void a(Context context) {
        anfi.a = context;
        acrk.a.set(new wxx(context, 19));
    }

    public static acrh b(Context context) {
        acrh acrhVar;
        synchronized (a) {
            if (b == null) {
                a(context);
                apya apyaVar = acri.a;
                context.getClass();
                b = new acrh(context);
            }
            acrhVar = b;
            acrhVar.getClass();
        }
        return acrhVar;
    }
}
