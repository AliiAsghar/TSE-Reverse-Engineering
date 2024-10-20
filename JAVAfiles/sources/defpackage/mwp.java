package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mwp implements mwq {
    public static final alwo a = alwo.o("BugleConversation");
    public final anen b;
    public final armf c;
    private final anen d;
    private final armf e;
    private final mws f;

    public mwp(anen anenVar, anen anenVar2, mws mwsVar, armf armfVar, armf armfVar2) {
        this.b = anenVar;
        this.d = anenVar2;
        this.f = mwsVar;
        this.c = armfVar;
        this.e = armfVar2;
    }

    @Override // defpackage.mwq
    public final akul a(mll mllVar, alog alogVar) {
        anen anenVar;
        akul b = this.f.b();
        ahmn an = aktp.an(b);
        mtz mtzVar = new mtz((Object) this, b, (Object) alogVar, (Object) mllVar, 3);
        if (((oiz) this.e.b()).a() && Build.VERSION.SDK_INT <= 26) {
            anenVar = this.d;
        } else {
            anenVar = this.b;
        }
        return an.i(mtzVar, anenVar);
    }
}
