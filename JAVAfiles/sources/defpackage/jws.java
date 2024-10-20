package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jws implements jcu {
    public final Context a;
    public final asai b;
    public final lre c;
    public final jwt d;
    private final asai e;
    private final Set f;

    public jws(asai asaiVar, Context context, lre lreVar, jwt jwtVar) {
        asaiVar.getClass();
        context.getClass();
        lreVar.getClass();
        jwtVar.getClass();
        this.a = context;
        this.c = lreVar;
        this.d = jwtVar;
        asai a = asar.a(new jtf(asaiVar, 18));
        this.e = a;
        this.b = new idx(a, this, 18);
        this.f = aqjn.e(khe.a);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.f;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.b;
    }
}
