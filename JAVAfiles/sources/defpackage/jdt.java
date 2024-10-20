package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdt implements jcu {
    public final Context a;
    public final arwe b;
    public final miw c;
    public final yti d;
    public final xzu e;
    public final abco f;
    public final aksr g;
    public final armf h;
    public final lre i;
    public final lkd j;
    private final asai k;
    private final Set l;

    public jdt(Context context, arwe arweVar, miw miwVar, lre lreVar, yti ytiVar, xzu xzuVar, abco abcoVar, aksr aksrVar, lkd lkdVar, asai asaiVar, armf armfVar) {
        context.getClass();
        arweVar.getClass();
        miwVar.getClass();
        lreVar.getClass();
        ytiVar.getClass();
        xzuVar.getClass();
        abcoVar.getClass();
        aksrVar.getClass();
        lkdVar.getClass();
        asaiVar.getClass();
        armfVar.getClass();
        this.a = context;
        this.b = arweVar;
        this.c = miwVar;
        this.i = lreVar;
        this.d = ytiVar;
        this.e = xzuVar;
        this.f = abcoVar;
        this.g = aksrVar;
        this.j = lkdVar;
        this.h = armfVar;
        this.k = new idx(asaiVar, this, 5);
        this.l = aqjn.e(khe.a);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.l;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.k;
    }
}
