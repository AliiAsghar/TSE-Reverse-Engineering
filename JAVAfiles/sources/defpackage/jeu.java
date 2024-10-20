package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jeu implements jcu {
    public final Context a;
    public final mlu b;
    public final asai c;
    private final arwe d;
    private final armf e;
    private final Set f;

    public jeu(Context context, arwe arweVar, mlu mluVar, asai asaiVar, asai asaiVar2, armf armfVar) {
        asai idxVar;
        context.getClass();
        arweVar.getClass();
        mluVar.getClass();
        asaiVar.getClass();
        asaiVar2.getClass();
        armfVar.getClass();
        this.a = context;
        this.d = arweVar;
        this.b = mluVar;
        this.e = armfVar;
        if (((nxl) armfVar.b()).a()) {
            idxVar = new jdn(asaiVar2, asaiVar, new idw(this, (arpe) null, 4), 17, null);
        } else {
            idxVar = new idx(asaiVar, this, 9);
        }
        this.c = idxVar;
        this.f = aqjn.e(khe.a);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.f;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.c;
    }

    public final void c(mll mllVar) {
        qjh.l(this.d, null, new jec(mllVar, this, (arpe) null, 3), 3);
    }
}
