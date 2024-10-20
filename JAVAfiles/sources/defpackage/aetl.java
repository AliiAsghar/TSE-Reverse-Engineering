package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aetl extends arrp implements arqv {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aetl(aeto aetoVar, cga cgaVar, awg awgVar, boolean z, arqx arqxVar, int i, int i2, int i3) {
        super(2);
        this.h = i3;
        this.d = aetoVar;
        this.e = cgaVar;
        this.f = awgVar;
        this.a = z;
        this.g = arqxVar;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aeto, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r4v0, types: [arqx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, arqw] */
    /* JADX WARN: Type inference failed for: r4v2, types: [bsc, java.lang.Object] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                bwj bwjVar = (bwj) obj;
                ((Number) obj2).intValue();
                Object obj3 = this.g;
                afaw afawVar = (afaw) obj3;
                adom.bx(afawVar, this.e, this.f, (cit) this.d, this.a, bwjVar, bzh.a(this.b | 1), this.c);
                return arnb.a;
            }
            bwj bwjVar2 = (bwj) obj;
            ((Number) obj2).intValue();
            agkx.M(this.f, this.a, this.d, (dte) this.e, this.g, bwjVar2, bzh.a(1 | this.b), this.c);
            return arnb.a;
        }
        bwj bwjVar3 = (bwj) obj;
        ((Number) obj2).intValue();
        aetn.b(this.d, this.e, (awg) this.f, this.a, this.g, bwjVar3, bzh.a(1 | this.b), this.c);
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aetl(afaw afawVar, cga cgaVar, bsc bscVar, cit citVar, boolean z, int i, int i2, int i3) {
        super(2);
        this.h = i3;
        this.g = afawVar;
        this.e = cgaVar;
        this.f = bscVar;
        this.d = citVar;
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aetl(cga cgaVar, boolean z, arqg arqgVar, dte dteVar, arqw arqwVar, int i, int i2, int i3) {
        super(2);
        this.h = i3;
        this.f = cgaVar;
        this.a = z;
        this.d = arqgVar;
        this.e = dteVar;
        this.g = arqwVar;
        this.b = i;
        this.c = i2;
    }
}
