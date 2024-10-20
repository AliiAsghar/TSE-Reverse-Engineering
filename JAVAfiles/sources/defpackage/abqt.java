package defpackage;

import android.content.Context;
import android.os.Looper;
import defpackage.abqz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abqt<T extends abqz, O> extends abgj {
    public abqt() {
        super(null);
    }

    public abqz v(Context context, Looper looper, abua abuaVar, Object obj, absf absfVar, abtc abtcVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    @Deprecated
    public abqz w(Context context, Looper looper, abua abuaVar, Object obj, abre abreVar, abrf abrfVar) {
        return v(context, looper, abuaVar, obj, abreVar, abrfVar);
    }
}
