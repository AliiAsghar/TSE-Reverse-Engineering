package defpackage;

import defpackage.bwj;
import defpackage.cee;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class asw implements cee, cea {
    public final cee a;
    public final byn b = new byu(null, cav.a);
    public final vh c = new vh((byte[]) null);

    /* compiled from: PG */
    /* renamed from: asw$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<Object, Boolean> {
        final /* synthetic */ cee a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cee ceeVar) {
            super(1);
            this.a = ceeVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            boolean z;
            cee ceeVar = this.a;
            if (ceeVar != null) {
                z = ceeVar.g(obj);
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: asw$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr<bxi, bxh> {
        final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Object obj) {
            super(1);
            this.b = obj;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            asw.this.c.e(this.b);
            return new asz(asw.this, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: asw$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ Object b;
        final /* synthetic */ arqv c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Object obj, arqv arqvVar, int i) {
            super(2);
            this.b = obj;
            this.c = arqvVar;
            this.d = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.d | 1);
            asw.this.e(this.b, this.c, (bwj) obj, a);
            return arnb.a;
        }
    }

    public asw(cee ceeVar, Map map) {
        this.a = new cef(map, new AnonymousClass1(ceeVar));
    }

    public final cea a() {
        return (cea) this.b.a();
    }

    @Override // defpackage.cee
    public final cee.a b(String str, arqg arqgVar) {
        return this.a.b(str, arqgVar);
    }

    @Override // defpackage.cee
    public final Object c(String str) {
        return this.a.c(str);
    }

    @Override // defpackage.cee
    public final Map d() {
        throw null;
    }

    @Override // defpackage.cea
    public final void e(Object obj, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 6;
        bwj c = bwjVar.c(-697180401);
        if (i6 == 0) {
            if (true != c.I(obj)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(arqvVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (true != c.I(this)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c.L()) {
            c.v();
        } else {
            cea a = a();
            if (a != null) {
                a.e(obj, arqvVar, c, i2 & 126);
                boolean I = c.I(this) | c.I(obj);
                bwk bwkVar = (bwk) c;
                Object T = bwkVar.T();
                if (I || T == bwj.a.a) {
                    T = new AnonymousClass2(obj);
                    bwkVar.ad(T);
                }
                bxl.c(obj, (arqr) T, c);
            } else {
                aju.a("null wrappedHolder");
                throw new armj();
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass3(obj, arqvVar, i);
        }
    }

    @Override // defpackage.cea
    public final void f(Object obj) {
        cea a = a();
        if (a != null) {
            a.f(obj);
        } else {
            aju.a("null wrappedHolder");
            throw new armj();
        }
    }

    @Override // defpackage.cee
    public final boolean g(Object obj) {
        return this.a.g(obj);
    }
}
