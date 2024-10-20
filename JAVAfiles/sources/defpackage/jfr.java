package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfr implements jcu {
    public final Context a;
    public final arwe b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final ascd f;
    public final asai g;
    public final wfh h;
    private final armf i;
    private final armf j;
    private final asai k;
    private final Set l;

    public jfr(Context context, arwe arweVar, armf armfVar, asai asaiVar, asai asaiVar2, asai asaiVar3, asai asaiVar4, armf armfVar2, wfh wfhVar, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        asai qjrVar;
        context.getClass();
        arweVar.getClass();
        armfVar.getClass();
        asaiVar.getClass();
        asaiVar2.getClass();
        asaiVar3.getClass();
        asaiVar4.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        this.a = context;
        this.b = arweVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.h = wfhVar;
        this.e = armfVar3;
        this.i = armfVar5;
        this.j = armfVar6;
        ascd a = ascy.a(false);
        this.f = a;
        if (((odl) armfVar5.b()).a()) {
            qjrVar = ((wpm) armfVar6.b()).b;
        } else {
            qjrVar = new qjr(ipf.r);
        }
        asai asaiVar5 = qjrVar;
        this.k = asaiVar5;
        c();
        this.g = qkf.c(asaiVar, asaiVar2, asaiVar3, a, asaiVar4, asaiVar5, new jfp(this, null));
        this.l = aqjn.e(khe.a);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.l;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.g;
    }

    public final void c() {
        qjh.l(this.b, null, new jks(this, (arpe) null, 1), 3);
    }
}
