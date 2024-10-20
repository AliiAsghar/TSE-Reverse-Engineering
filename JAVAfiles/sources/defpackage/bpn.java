package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpn {
    public static final zr a = zs.d(300, 0, aao.a, 2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bpn$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<bps, Boolean> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bpn$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqg<bpq> {
        final /* synthetic */ boolean a;
        final /* synthetic */ dqv b;
        final /* synthetic */ bps c;
        final /* synthetic */ arqr d;
        final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, dqv dqvVar, bps bpsVar, arqr arqrVar, boolean z2) {
            super(0);
            this.a = z;
            this.b = dqvVar;
            this.c = bpsVar;
            this.d = arqrVar;
            this.e = z2;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return new bpq(this.a, this.b, this.c, this.d, this.e);
        }
    }

    public static final bpq a(boolean z, arqr arqrVar, bps bpsVar, boolean z2, bwj bwjVar, int i, int i2) {
        arqr arqrVar2;
        bps bpsVar2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if ((i2 & 2) != 0) {
            arqrVar2 = AnonymousClass1.a;
        } else {
            arqrVar2 = arqrVar;
        }
        if ((i2 & 4) != 0) {
            bpsVar2 = bps.a;
        } else {
            bpsVar2 = bpsVar;
        }
        boolean z8 = true;
        int i3 = ((i2 & 1) ^ 1) & (z ? 1 : 0);
        if ((i2 & 8) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z9 = z3 & z2;
        if (1 != i3) {
            z4 = false;
        } else {
            z4 = true;
        }
        dqv dqvVar = (dqv) bwjVar.g(dch.d);
        Object[] objArr = {Boolean.valueOf(z4), arqrVar2, Boolean.valueOf(z9)};
        cej cejVar = new cej(bpo.a, new bpp(z4, dqvVar, arqrVar2, z9));
        if ((((i & 14) ^ 6) > 4 && bwjVar.H(z4)) || (i & 6) == 4) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean G = z5 | bwjVar.G(dqvVar);
        if ((((i & 896) ^ 384) > 256 && bwjVar.G(bpsVar2)) || (i & 384) == 256) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z10 = G | z6;
        if ((((i & 112) ^ 48) > 32 && bwjVar.G(arqrVar2)) || (i & 48) == 32) {
            z7 = true;
        } else {
            z7 = false;
        }
        boolean z11 = z10 | z7;
        if ((((i & 7168) ^ 3072) <= 2048 || !bwjVar.H(z9)) && (i & 3072) != 2048) {
            z8 = false;
        }
        boolean z12 = z11 | z8;
        Object h = bwjVar.h();
        if (z12 || h == bwj.a.a) {
            h = new AnonymousClass2(z4, dqvVar, bpsVar2, arqrVar2, z9);
            bwjVar.B(h);
        }
        return (bpq) cdy.b(objArr, cejVar, (arqg) h, bwjVar, 0, 4);
    }
}
