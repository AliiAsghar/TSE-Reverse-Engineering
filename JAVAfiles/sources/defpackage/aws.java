package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aws {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aws$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        final /* synthetic */ agi a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(agi agiVar) {
            super(0);
            this.a = agiVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            agj.a(this.a);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aws$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bfb a;
        final /* synthetic */ arqv b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(bfb bfbVar, arqv arqvVar, int i) {
            super(2);
            this.a = bfbVar;
            this.b = arqvVar;
            this.c = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.c | 1);
            aws.b(this.a, this.b, (bwj) obj, a);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aws$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqg<arnb> {
        final /* synthetic */ agi a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(agi agiVar) {
            super(0);
            this.a = agiVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            agj.a(this.a);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aws$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bdy a;
        final /* synthetic */ arqv b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(bdy bdyVar, arqv arqvVar, int i) {
            super(2);
            this.a = bdyVar;
            this.b = arqvVar;
            this.c = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.c | 1);
            aws.a(this.a, this.b, (bwj) obj, a);
            return arnb.a;
        }
    }

    public static final void a(bdy bdyVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 6;
        bwj c = bwjVar.c(605522716);
        if (i5 == 0) {
            if (true != c.I(bdyVar)) {
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
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new agi(null);
                bwkVar.ad(T);
            }
            agi agiVar = (agi) T;
            Object T2 = bwkVar.T();
            if (T2 == bwj.a.a) {
                T2 = new AnonymousClass3(agiVar);
                bwkVar.ad(T2);
            }
            afx.a(agiVar, (arqg) T2, new bem(agiVar, bdyVar), null, false, arqvVar, c, ((i2 << 12) & 458752) | 54, 24);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass4(bdyVar, arqvVar, i);
        }
    }

    public static final void b(bfb bfbVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 6;
        bwj c = bwjVar.c(-1985516685);
        if (i5 == 0) {
            if (true != c.I(bfbVar)) {
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
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new agi(null);
                bwkVar.ad(T);
            }
            agi agiVar = (agi) T;
            Object T2 = bwkVar.T();
            if (T2 == bwj.a.a) {
                T2 = new AnonymousClass1(agiVar);
                bwkVar.ad(T2);
            }
            afx.a(agiVar, (arqg) T2, new bfh(bfbVar, agiVar), null, bfbVar.w(), arqvVar, c, ((i2 << 12) & 458752) | 54, 8);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(bfbVar, arqvVar, i);
        }
    }
}
