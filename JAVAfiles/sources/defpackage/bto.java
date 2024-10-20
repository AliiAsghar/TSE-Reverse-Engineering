package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bto {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bto$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ long a;
        final /* synthetic */ dje b;
        final /* synthetic */ arqv c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, dje djeVar, arqv arqvVar, int i) {
            super(2);
            this.a = j;
            this.b = djeVar;
            this.c = arqvVar;
            this.d = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bto.a(this.a, this.b, this.c, (bwj) obj, bzh.a(this.d | 1));
            return arnb.a;
        }
    }

    public static final void a(long j, dje djeVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 6;
        bwj c = bwjVar.c(-716124955);
        if (i6 == 0) {
            if (true != c.F(j)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.G(djeVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c.L()) {
            c.v();
        } else {
            bwx.b(new bzd[]{blp.a.c(new cku(j)), brx.a.c(((dje) c.g(brx.a)).m(djeVar))}, arqvVar, c, ((i2 >> 3) & 112) | 8);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass1(j, djeVar, arqvVar, i);
        }
    }
}
