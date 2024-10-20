package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uwq {
    static final /* synthetic */ artm[] a;
    public final armf b;
    public final armf c;
    public Intent d;
    public final arsn e;
    public boolean f;
    private final armf g;

    static {
        arrr arrrVar = new arrr(uwq.class, "entryPointKey", "getEntryPointKey()I", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar};
    }

    public uwq(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.b = armfVar;
        this.g = armfVar3;
        this.c = armfVar4;
        this.e = new arsl();
    }

    public final void a(String str) {
        mbl mblVar = (mbl) this.g.b();
        artm artmVar = a[0];
        artmVar.getClass();
        Object obj = ((arsl) this.e).a;
        if (obj != null) {
            mblVar.e(str, ((Number) obj).intValue());
            return;
        }
        throw new IllegalStateException("Property " + artmVar.c() + " should be initialized before get.");
    }
}
