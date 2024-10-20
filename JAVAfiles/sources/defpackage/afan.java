package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afan extends arrp implements arqv {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ int c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afan(aehz aehzVar, boolean z, boolean z2, int i, int i2) {
        super(2);
        this.e = i2;
        this.d = aehzVar;
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, arqv] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            ((Number) obj2).intValue();
            zfu.a(this.b, this.a, this.d, (bwj) obj, bzh.a(this.c | 1));
            return arnb.a;
        }
        ((Number) obj2).intValue();
        Object obj3 = this.d;
        aehz aehzVar = (aehz) obj3;
        adom.bI(aehzVar, this.a, this.b, (bwj) obj, bzh.a(this.c | 1));
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afan(boolean z, boolean z2, arqv arqvVar, int i, int i2) {
        super(2);
        this.e = i2;
        this.b = z;
        this.a = z2;
        this.d = arqvVar;
        this.c = i;
    }
}
