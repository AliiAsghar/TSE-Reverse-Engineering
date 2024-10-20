package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xtc implements ancx {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ xtc(mkg mkgVar, String str, ycg ycgVar, int i) {
        this.d = i;
        this.c = mkgVar;
        this.a = str;
        this.b = ycgVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [xte, java.lang.Object] */
    @Override // defpackage.ancx
    public final Object a(ahmn ahmnVar) {
        if (this.d != 0) {
            mkg mkgVar = (mkg) this.c;
            ych a = ((qnu) mkgVar.e.b()).a((String) this.a, (ycg) this.b);
            ahmnVar.x(a, mkgVar.a);
            return a;
        }
        xtf xtfVar = (xtf) this.a;
        anen anenVar = xtfVar.a;
        apus a2 = this.b.a(xtfVar.c, (xrz) this.c);
        ahmnVar.x(a2, anenVar);
        return a2;
    }

    public /* synthetic */ xtc(xtf xtfVar, xte xteVar, xrz xrzVar, int i) {
        this.d = i;
        this.a = xtfVar;
        this.b = xteVar;
        this.c = xrzVar;
    }
}
