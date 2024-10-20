package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agf {
    public final cez a = new cez();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: agf$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ afy b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(afy afyVar, int i) {
            super(2);
            this.b = afyVar;
            this.c = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.c | 1);
            agf.this.a(this.b, (bwj) obj, a);
            return arnb.a;
        }
    }

    public final void a(afy afyVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 6;
        bwj c = bwjVar.c(1320309496);
        if (i5 == 0) {
            if (true != c.G(afyVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.G(this)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c.L()) {
            c.v();
        } else {
            cez cezVar = this.a;
            int a = cezVar.a();
            for (int i6 = 0; i6 < a; i6++) {
                ((arqw) cezVar.get(i6)).a(afyVar, c, Integer.valueOf(i2 & 14));
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass1(afyVar, i);
        }
    }
}
