package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahfw extends arrp implements arqv {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ Object g;
    final /* synthetic */ Object h;
    private final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahfw(ascv ascvVar, arqv arqvVar, boolean z, arqr arqrVar, boolean z2, arqv arqvVar2, int i, int i2, int i3) {
        super(2);
        this.i = i3;
        this.e = ascvVar;
        this.f = arqvVar;
        this.b = z;
        this.h = arqrVar;
        this.a = z2;
        this.g = arqvVar2;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ascv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r5v0, types: [ajr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, arqv] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.i != 0) {
            ((Number) obj2).intValue();
            yzc.t(this.e, this.f, this.b, this.h, this.a, this.g, (bwj) obj, bzh.a(this.c | 1), this.d);
            return arnb.a;
        }
        bwj bwjVar = (bwj) obj;
        ((Number) obj2).intValue();
        ahji.ae(this.a, this.e, this.f, this.b, (blb) this.g, this.h, bwjVar, bzh.a(this.c | 1), this.d);
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahfw(boolean z, arqr arqrVar, cga cgaVar, boolean z2, blb blbVar, ajr ajrVar, int i, int i2, int i3) {
        super(2);
        this.i = i3;
        this.a = z;
        this.e = arqrVar;
        this.f = cgaVar;
        this.b = z2;
        this.g = blbVar;
        this.h = ajrVar;
        this.c = i;
        this.d = i2;
    }
}
