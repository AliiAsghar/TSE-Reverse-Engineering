package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrz extends adpe {
    public adrz(adou adouVar, armf armfVar, String str, adwe adweVar) {
        super(adouVar.a, armfVar, str, "presence", adouVar.c, adouVar.d, adweVar);
        this.f = "";
        this.d = a(armfVar);
        this.d.x = true;
    }

    @Override // defpackage.adpe
    public final void i(aion aionVar) {
        try {
            k(aionVar);
            String s = s(aionVar);
            String h = aionVar.h();
            if (h == null) {
                t(null, new byte[0]);
            } else {
                t(h, aionVar.a.k);
            }
            e(s);
        } catch (Exception e) {
            advr.i(e, "Error while processing notify: %s", e.getMessage());
        }
    }

    @Override // defpackage.adpe
    public final void l(aion aionVar) {
        super.l(aionVar);
    }
}
