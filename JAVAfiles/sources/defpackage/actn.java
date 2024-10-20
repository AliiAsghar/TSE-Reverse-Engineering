package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class actn implements acsv {
    private final /* synthetic */ int a;
    private final aduu b;

    public actn(aduu aduuVar, int i) {
        this.a = i;
        this.b = aduuVar;
    }

    @Override // defpackage.acsv
    public final String a() {
        if (this.a != 0) {
            return this.b.A();
        }
        if (aczf.J()) {
            return this.b.z();
        }
        return this.b.A();
    }

    @Override // defpackage.acsv
    public final String b() {
        if (this.a != 0) {
            return this.b.A();
        }
        if (aczf.I()) {
            return this.b.z();
        }
        return this.b.A();
    }
}
