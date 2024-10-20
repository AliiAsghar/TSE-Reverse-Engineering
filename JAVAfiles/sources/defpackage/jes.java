package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jes implements jcu {
    public final Context a;
    public final armf b;
    public final asai c;
    public final lkd d;
    private final Set e;

    public jes(Context context, lkd lkdVar, armf armfVar, asai asaiVar, asai asaiVar2) {
        context.getClass();
        lkdVar.getClass();
        armfVar.getClass();
        asaiVar.getClass();
        asaiVar2.getClass();
        this.a = context;
        this.d = lkdVar;
        this.b = armfVar;
        this.c = new jdn(asaiVar2, asaiVar, new igb(this, (arpe) null, 5), 17, null);
        this.e = aqjn.e(khe.a);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.e;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.c;
    }
}
