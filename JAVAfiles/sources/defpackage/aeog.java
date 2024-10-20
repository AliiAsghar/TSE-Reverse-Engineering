package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeog extends arrp implements arqv {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ int c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeog(amt amtVar, boolean z, boolean z2, arqw arqwVar, int i, int i2) {
        super(2);
        this.f = i2;
        this.d = amtVar;
        this.a = z;
        this.b = z2;
        this.e = arqwVar;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [amt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, arqw] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            bwj bwjVar = (bwj) obj;
            ((Number) obj2).intValue();
            int i = this.c;
            ?? r4 = this.e;
            boolean z = this.b;
            aeke.an(this.d, this.a, z, r4, bwjVar, bzh.a(i | 1));
            return arnb.a;
        }
        bwj bwjVar2 = (bwj) obj;
        ((Number) obj2).intValue();
        int i2 = this.c;
        Object obj3 = this.e;
        ?? r2 = this.d;
        adom.aB(this.a, this.b, r2, (aepi) obj3, bwjVar2, bzh.a(i2 | 1));
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeog(boolean z, boolean z2, cga cgaVar, aepi aepiVar, int i, int i2) {
        super(2);
        this.f = i2;
        this.a = z;
        this.b = z2;
        this.d = cgaVar;
        this.e = aepiVar;
        this.c = i;
    }
}
