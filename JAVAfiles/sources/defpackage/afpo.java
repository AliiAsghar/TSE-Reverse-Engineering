package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afpo {
    public static final afkg a = new afkg(afob.c);
    public static final List b;

    static {
        arml armlVar = aflr.a;
        b = aqjn.ax(afwv.S());
    }

    public static final afpn a(Context context, int i, arqr arqrVar, arqv arqvVar, int i2, arqr arqrVar2) {
        return new afps(context, i, arqrVar, new GridLayoutManager(i2), arqvVar, arqrVar2);
    }
}
