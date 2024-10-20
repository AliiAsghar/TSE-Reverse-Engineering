package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jef implements jcu {
    public final Context a;
    public final mjg b;
    public final yti c;
    public final abco d;
    public final nei e;
    private final asai f;
    private final Set g;

    public jef(Context context, khb khbVar, mjg mjgVar, nei neiVar, yti ytiVar, abco abcoVar) {
        context.getClass();
        khbVar.getClass();
        mjgVar.getClass();
        neiVar.getClass();
        ytiVar.getClass();
        abcoVar.getClass();
        this.a = context;
        this.b = mjgVar;
        this.e = neiVar;
        this.c = ytiVar;
        this.d = abcoVar;
        this.f = new idx(khbVar.a(), this, 7);
        this.g = aqjn.e(khe.b);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.g;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.f;
    }
}
