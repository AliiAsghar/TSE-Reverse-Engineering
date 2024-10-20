package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nat implements mzm {
    private final mzv a;
    private final /* synthetic */ int b;
    private final agoz c;

    public nat(agnq agnqVar, hgi hgiVar, int i, byte[] bArr) {
        this.b = i;
        agnqVar.getClass();
        stj a = stl.a();
        a.w("MessageAnnotationChangeObserver");
        sti b = a.b();
        this.c = b;
        this.a = hgiVar.D("MessageAnnotationChangeObserver", b, new nap(agnqVar, 1));
    }

    @Override // defpackage.mzm
    public final mzl a() {
        if (this.b != 0) {
        }
        return this.a.a();
    }

    @Override // defpackage.mzm
    public final yga b(mjf mjfVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return this.a.b(mjfVar);
            }
            return this.a.b(mjfVar);
        }
        return this.a.b(mjfVar);
    }

    public nat(agnq agnqVar, hgi hgiVar, int i) {
        this.b = i;
        agnqVar.getClass();
        ssp c = sss.c();
        c.w("MessagePreviewChangeObserver");
        c.d(new nas(0));
        sso b = c.b();
        this.c = b;
        this.a = hgiVar.D("MessagePreviewChangeObserver", b, new nap(agnqVar, 2));
    }

    public nat(agnq agnqVar, hgi hgiVar, int i, char[] cArr) {
        this.b = i;
        agnqVar.getClass();
        tex b = tfa.b();
        b.w("MessageDeliveryReportsChangeObserver");
        b.c(new nas(9));
        tew b2 = b.b();
        this.c = b2;
        this.a = hgiVar.D("MessageDeliveryReportsChangeObserver", b2, new nap(agnqVar, 3));
    }
}
