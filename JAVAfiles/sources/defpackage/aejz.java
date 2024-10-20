package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aejz extends arrp implements arqv {
    final /* synthetic */ int a;
    final /* synthetic */ long b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aejz(aerb aerbVar, int i, long j, int i2) {
        super(2);
        this.d = i2;
        this.c = aerbVar;
        this.a = i;
        this.b = j;
    }

    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r3v1, types: [amt, java.lang.Object] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        cga b;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ((Number) obj2).intValue();
                    ahji.W(this.c, this.b, (bwj) obj, bzh.a(1 | this.a));
                    return arnb.a;
                }
                ((Number) obj2).intValue();
                Object obj3 = this.c;
                aezf aezfVar = (aezf) obj3;
                adom.cm(aezfVar, this.b, (bwj) obj, bzh.a(1 | this.a));
                return arnb.a;
            }
            ((Number) obj2).intValue();
            int i2 = this.a;
            long j = this.b;
            aeke.f(this.c, j, (bwj) obj, bzh.a(i2 | 1));
            return arnb.a;
        }
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !bwjVar.L()) {
            b = amv.b(cga.e, 1.0f);
            ahji.N(aeke.bg((aerb) this.c, bwjVar), dga.a(this.a, bwjVar), aeke.bh(b, (drk) bwjVar.g(dch.i)), this.b, bwjVar, 8, 0);
        } else {
            bwjVar.v();
        }
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aejz(Object obj, long j, int i, int i2) {
        super(2);
        this.d = i2;
        this.c = obj;
        this.b = j;
        this.a = i;
    }
}
