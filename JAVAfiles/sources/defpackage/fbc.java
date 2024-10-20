package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbc extends fgk {
    private final ery c;

    public fbc(erz erzVar) {
        super(erzVar);
        this.c = new ery();
    }

    @Override // defpackage.fgk, defpackage.erz
    public final erx d(int i, erx erxVar, boolean z) {
        erx d = super.d(i, erxVar, z);
        if (super.p(d.c, this.c).c()) {
            d.k(erxVar.a, erxVar.b, erxVar.c, erxVar.d, erxVar.e, epy.a, true);
        } else {
            d.f = true;
        }
        return d;
    }
}
