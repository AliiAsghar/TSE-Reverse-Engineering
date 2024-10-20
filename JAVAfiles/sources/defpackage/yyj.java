package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yyj {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final yyk g;
    public ev h;
    private final arwe i;

    static {
        new akgc("SAFE_URL_DIALOG_FRAGMENT_DATA_SOURCE_KEY");
    }

    public yyj(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, arwe arweVar, armf armfVar7, yyk yykVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        arweVar.getClass();
        armfVar7.getClass();
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar4;
        this.d = armfVar5;
        this.e = armfVar6;
        this.i = arweVar;
        this.f = armfVar7;
        this.g = yykVar;
    }

    public final DialogInterface.OnClickListener a() {
        return new aabt((aksr) this.b.b(), "SafeUrlDialogFragmentPeer#dismissClickListener", new iws(5), 8);
    }

    public final void b(boolean z) {
        qjh.l(this.i, null, new yyi(this, z, (arpe) null, 0), 3);
    }
}
