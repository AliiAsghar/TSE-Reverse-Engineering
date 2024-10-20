package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kij implements aemc {
    public final arqg a;
    public final arqg b;
    public final arqg c;
    private final boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kij() {
        /*
            r2 = this;
            r0 = 0
            r1 = 15
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kij.<init>():void");
    }

    @Override // defpackage.aemc
    public final /* bridge */ /* synthetic */ aemc a(arqg arqgVar) {
        return new kij(arqgVar, this.d, this.b, this.c);
    }

    @Override // defpackage.aemc
    public final arqg b() {
        return this.a;
    }

    @Override // defpackage.aemc
    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kij)) {
            return false;
        }
        kij kijVar = (kij) obj;
        if (d.F(this.a, kijVar.a) && this.d == kijVar.d && d.F(this.b, kijVar.b) && d.F(this.c, kijVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + a.v(this.d)) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DogfoodInformationUiData(onDismiss=" + this.a + ", includeScrim=" + this.d + ", onSendFeedback=" + this.b + ", onOptOut=" + this.c + ")";
    }

    public kij(arqg arqgVar, boolean z, arqg arqgVar2, arqg arqgVar3) {
        arqgVar.getClass();
        arqgVar2.getClass();
        arqgVar3.getClass();
        this.a = arqgVar;
        this.d = z;
        this.b = arqgVar2;
        this.c = arqgVar3;
    }

    public /* synthetic */ kij(arqg arqgVar, arqg arqgVar2, int i) {
        this((i & 1) != 0 ? kek.f : null, (i & 2) != 0, (i & 4) != 0 ? kek.g : arqgVar, (i & 8) != 0 ? kek.h : arqgVar2);
    }
}
