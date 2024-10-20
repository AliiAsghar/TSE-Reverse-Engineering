package defpackage;

import defpackage.abt;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aby {

    /* compiled from: PG */
    /* renamed from: aby$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<cfc> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            cfc cfcVar = new cfc(abx.a);
            cfcVar.d();
            return cfcVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aby$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr<bxi, bxh> {
        final /* synthetic */ abt a;
        final /* synthetic */ abt b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(abt abtVar, abt abtVar2) {
            super(1);
            this.a = abtVar;
            this.b = abtVar2;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            this.a.d.add(this.b);
            return new abz(this.a, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aby$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqr<bxi, bxh> {
        final /* synthetic */ abt a;
        final /* synthetic */ abt.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(abt abtVar, abt.a aVar) {
            super(1);
            this.a = abtVar;
            this.b = aVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return new aca(this.a, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aby$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqr<bxi, bxh> {
        final /* synthetic */ abt a;
        final /* synthetic */ abt.d b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(abt abtVar, abt.d dVar) {
            super(1);
            this.a = abtVar;
            this.b = dVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            this.a.u(this.b);
            return new acb(this.a, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aby$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqr<bxi, bxh> {
        final /* synthetic */ abt a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(abt abtVar) {
            super(1);
            this.a = abtVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return new acc(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aby$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqr<bxi, bxh> {
        final /* synthetic */ abt a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(abt abtVar) {
            super(1);
            this.a = abtVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return new acd(this.a);
        }
    }

    static {
        armd.b(3, AnonymousClass1.a);
    }

    public static final abt a(abt abtVar, Object obj, Object obj2, String str, bwj bwjVar, int i) {
        boolean z;
        int i2 = (i & 14) ^ 6;
        boolean z2 = true;
        if ((i2 > 4 && bwjVar.G(abtVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object h = bwjVar.h();
        if (z || h == bwj.a.a) {
            h = new abt(new abd(obj), abtVar, abtVar.b + " > " + str);
            bwjVar.B(h);
        }
        abt abtVar2 = (abt) h;
        if ((i2 <= 4 || !bwjVar.G(abtVar)) && (i & 6) != 4) {
            z2 = false;
        }
        boolean G = bwjVar.G(abtVar2) | z2;
        Object h2 = bwjVar.h();
        if (G || h2 == bwj.a.a) {
            h2 = new AnonymousClass2(abtVar, abtVar2);
            bwjVar.B(h2);
        }
        bxl.c(abtVar2, (arqr) h2, bwjVar);
        if (abtVar.t()) {
            long j = abtVar.e;
            abtVar2.v(obj, obj2);
        } else {
            abtVar2.q(obj2);
            abtVar2.m(false);
        }
        return abtVar2;
    }

    public static final abt b(ace aceVar, String str, bwj bwjVar, int i, int i2) {
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !bwjVar.G(aceVar)) && (i & 6) != 4) {
            z = false;
        }
        Object h = bwjVar.h();
        if (z || h == bwj.a.a) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            h = new abt(aceVar, null, str);
            bwjVar.B(h);
        }
        abt abtVar = (abt) h;
        bwjVar.y(1031122203);
        abtVar.g(aceVar.b(), bwjVar, 0);
        bwjVar.q();
        boolean G = bwjVar.G(abtVar);
        Object h2 = bwjVar.h();
        if (G || h2 == bwj.a.a) {
            h2 = new AnonymousClass5(abtVar);
            bwjVar.B(h2);
        }
        bxl.c(abtVar, (arqr) h2, bwjVar);
        return abtVar;
    }

    @armg
    public static final abt c(abd abdVar, String str, bwj bwjVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return b(abdVar, str, bwjVar, i & 126, 0);
    }

    public static final abt d(Object obj, String str, bwj bwjVar, int i, int i2) {
        bwk bwkVar = (bwk) bwjVar;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            abt abtVar = new abt(new abd(obj), null, str);
            bwkVar.ad(abtVar);
            T = abtVar;
        }
        abt abtVar2 = (abt) T;
        abtVar2.g(obj, bwjVar, (i & 8) | 48 | (i & 14));
        Object T2 = bwkVar.T();
        if (T2 == bwj.a.a) {
            T2 = new AnonymousClass6(abtVar2);
            bwkVar.ad(T2);
        }
        bxl.c(abtVar2, (arqr) T2, bwjVar);
        return abtVar2;
    }

    public static final cas e(abt abtVar, Object obj, Object obj2, aap aapVar, acg acgVar, bwj bwjVar, int i) {
        boolean z;
        int i2 = (i & 14) ^ 6;
        boolean z2 = false;
        if ((i2 > 4 && bwjVar.G(abtVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object h = bwjVar.h();
        if (z || h == bwj.a.a) {
            h = new abt.d(obj, zu.a(acgVar, obj2), acgVar);
            bwjVar.B(h);
        }
        abt.d dVar = (abt.d) h;
        if (abtVar.t()) {
            dVar.j(obj, obj2, aapVar);
        } else {
            dVar.k(obj2, aapVar);
        }
        if ((i2 > 4 && bwjVar.G(abtVar)) || (i & 6) == 4) {
            z2 = true;
        }
        boolean G = bwjVar.G(dVar) | z2;
        Object h2 = bwjVar.h();
        if (G || h2 == bwj.a.a) {
            h2 = new AnonymousClass4(abtVar, dVar);
            bwjVar.B(h2);
        }
        bxl.c(dVar, (arqr) h2, bwjVar);
        return dVar;
    }

    public static final abt.a f(abt abtVar, acg acgVar, bwj bwjVar, int i) {
        boolean z;
        abt.a.C0001a a;
        int i2 = (i & 14) ^ 6;
        boolean z2 = false;
        if ((i2 > 4 && bwjVar.G(abtVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object h = bwjVar.h();
        if (z || h == bwj.a.a) {
            h = new abt.a(acgVar);
            bwjVar.B(h);
        }
        abt.a aVar = (abt.a) h;
        if ((i2 > 4 && bwjVar.G(abtVar)) || (i & 6) == 4) {
            z2 = true;
        }
        boolean I = bwjVar.I(aVar) | z2;
        Object h2 = bwjVar.h();
        if (I || h2 == bwj.a.a) {
            h2 = new AnonymousClass3(abtVar, aVar);
            bwjVar.B(h2);
        }
        bxl.c(aVar, (arqr) h2, bwjVar);
        if (abtVar.t() && (a = aVar.a()) != null) {
            abt abtVar2 = abt.this;
            a.a.j(a.c.a(abtVar2.d().a()), a.c.a(abtVar2.d().b()), (aap) a.b.a(abtVar2.d()));
        }
        return aVar;
    }
}
