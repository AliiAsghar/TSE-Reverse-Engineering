package defpackage;

import defpackage.zz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zj<T, V extends zz> {
    public final acg a;
    public final zt b;
    public final byn c;
    private final Object d;
    private final byn e;
    private final abg f;
    private final abm g;
    private final zz h;
    private final zz i;
    private zz j;
    private zz k;

    /* compiled from: PG */
    /* renamed from: zj$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqr<arpe<? super arnb>, Object> {
        final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, arpe arpeVar) {
            super(1, arpeVar);
            this.b = obj;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return new AnonymousClass1(this.b, (arpe) obj).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            aqil.P(obj);
            zj.this.g();
            zj zjVar = zj.this;
            Object obj2 = this.b;
            zt ztVar = zjVar.b;
            Object b = zjVar.b(obj2);
            ztVar.c(b);
            zj.this.i(b);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: zj$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arpw implements arqr<arpe<? super arnb>, Object> {
        public AnonymousClass2(arpe arpeVar) {
            super(1, arpeVar);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return new AnonymousClass2((arpe) obj).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            aqil.P(obj);
            zj.this.g();
            return arnb.a;
        }
    }

    public zj(Object obj, acg acgVar, Object obj2) {
        this.a = acgVar;
        this.d = obj2;
        this.b = new zt(acgVar, obj, null, 60);
        this.c = new byu(false, cav.a);
        this.e = new byu(obj, cav.a);
        this.f = new abg();
        this.g = new abm(obj2, 3);
        zz a = a();
        zz zzVar = a instanceof zv ? zk.e : a instanceof zw ? zk.f : a instanceof zx ? zk.g : zk.h;
        this.h = zzVar;
        zz a2 = a();
        zz zzVar2 = a2 instanceof zv ? zk.a : a2 instanceof zw ? zk.b : a2 instanceof zx ? zk.c : zk.d;
        this.i = zzVar2;
        this.j = zzVar;
        this.k = zzVar2;
    }

    public static /* synthetic */ Object j(zj zjVar, Object obj, zr zrVar, arpe arpeVar, int i) {
        if ((i & 2) != 0) {
            zrVar = zjVar.g;
        }
        zr zrVar2 = zrVar;
        Object a = zjVar.a.a().a(zjVar.a());
        Object d = zjVar.d();
        acg acgVar = zjVar.a;
        return abg.a(zjVar.f, new zi(zjVar, a, new abs(zrVar2, acgVar, d, obj, (zz) acgVar.b().a(a)), zjVar.b.c, null), arpeVar);
    }

    public final zz a() {
        return this.b.b;
    }

    public final Object b(Object obj) {
        if (!d.F(this.j, this.h) || !d.F(this.k, this.i)) {
            zz zzVar = (zz) this.a.b().a(obj);
            int b = zzVar.b();
            boolean z = false;
            for (int i = 0; i < b; i++) {
                if (zzVar.a(i) < this.j.a(i) || zzVar.a(i) > this.k.a(i)) {
                    zzVar.e(i, arrn.q(zzVar.a(i), this.j.a(i), this.k.a(i)));
                    z = true;
                }
            }
            if (z) {
                return this.a.a().a(zzVar);
            }
            return obj;
        }
        return obj;
    }

    public final Object c() {
        return this.e.a();
    }

    public final Object d() {
        return this.b.a();
    }

    public final Object e(Object obj, arpe arpeVar) {
        Object a = abg.a(this.f, new AnonymousClass1(obj, null), arpeVar);
        if (a == arpl.a) {
            return a;
        }
        return arnb.a;
    }

    public final Object f(arpe arpeVar) {
        Object a = abg.a(this.f, new AnonymousClass2(null), arpeVar);
        if (a == arpl.a) {
            return a;
        }
        return arnb.a;
    }

    public final void g() {
        zt ztVar = this.b;
        ztVar.b.d();
        ztVar.c = Long.MIN_VALUE;
        h(false);
    }

    public final void h(boolean z) {
        this.c.h(Boolean.valueOf(z));
    }

    public final void i(Object obj) {
        this.e.h(obj);
    }

    public /* synthetic */ zj(Object obj, acg acgVar, Object obj2, int i) {
        this(obj, acgVar, (i & 4) != 0 ? null : obj2);
    }
}
