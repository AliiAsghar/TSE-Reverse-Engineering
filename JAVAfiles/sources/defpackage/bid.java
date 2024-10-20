package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bid {
    private static final bzc a = new bxj(cav.a, AnonymousClass1.a);

    /* compiled from: PG */
    /* renamed from: bid$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<dje> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            return bif.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bid$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ dje a;
        final /* synthetic */ arqv b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(dje djeVar, arqv arqvVar, int i) {
            super(2);
            this.a = djeVar;
            this.b = arqvVar;
            this.c = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.c | 1);
            bid.a(this.a, this.b, (bwj) obj, a);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bid$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ String a;
        final /* synthetic */ cga b;
        final /* synthetic */ long c;
        final /* synthetic */ long d;
        final /* synthetic */ long e;
        final /* synthetic */ long f;
        final /* synthetic */ int g;
        final /* synthetic */ boolean h;
        final /* synthetic */ int i;
        final /* synthetic */ int j;
        final /* synthetic */ dje k;
        final /* synthetic */ int l;
        final /* synthetic */ int m;
        final /* synthetic */ int n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, cga cgaVar, long j, long j2, long j3, long j4, int i, boolean z, int i2, int i3, dje djeVar, int i4, int i5, int i6) {
            super(2);
            this.a = str;
            this.b = cgaVar;
            this.c = j;
            this.d = j2;
            this.e = j3;
            this.f = j4;
            this.g = i;
            this.h = z;
            this.i = i2;
            this.j = i3;
            this.k = djeVar;
            this.l = i4;
            this.m = i5;
            this.n = i6;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int i = this.l;
            int i2 = this.m;
            int a = bzh.a(i | 1);
            int a2 = bzh.a(i2);
            int i3 = this.n;
            bid.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (bwj) obj, a, a2, i3);
            return arnb.a;
        }
    }

    public static final void a(dje djeVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 6;
        bwj c = bwjVar.c(1772272796);
        if (i5 == 0) {
            if (true != c.G(djeVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c.L()) {
            c.v();
        } else {
            bzc bzcVar = a;
            bwx.a(bzcVar.c(((dje) c.g(bzcVar)).m(djeVar)), arqvVar, c, (i2 & 112) | 8);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(djeVar, arqvVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r26, defpackage.cga r27, long r28, long r30, long r32, long r34, int r36, boolean r37, int r38, int r39, defpackage.dje r40, defpackage.bwj r41, int r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bid.b(java.lang.String, cga, long, long, long, long, int, boolean, int, int, dje, bwj, int, int, int):void");
    }
}
