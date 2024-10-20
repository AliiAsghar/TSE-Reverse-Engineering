package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdd implements jcu {
    public final Context a;
    public final arwe b;
    public final miw c;
    public final xzu d;
    public final lkd e;
    private final asai f;
    private final Set g;

    public jdd(Context context, arwe arweVar, miw miwVar, xzu xzuVar, lkd lkdVar, asai asaiVar) {
        context.getClass();
        arweVar.getClass();
        miwVar.getClass();
        xzuVar.getClass();
        lkdVar.getClass();
        asaiVar.getClass();
        this.a = context;
        this.b = arweVar;
        this.c = miwVar;
        this.d = xzuVar;
        this.e = lkdVar;
        this.f = new idx(asaiVar, this, 4);
        this.g = aqjn.e(khe.a);
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
