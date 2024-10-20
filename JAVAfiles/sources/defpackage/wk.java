package defpackage;

import defpackage.abt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wk {
    public final abt a;
    public final byn b;
    public final byn c;
    private final yg e;
    public aap d = wl.a;
    private final byn f = new byu(null, cav.a);

    /* compiled from: PG */
    /* renamed from: wk$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<abt.b<Boolean>, aap<cjp>> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return wk.this.d;
        }
    }

    /* compiled from: PG */
    /* renamed from: wk$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<Boolean, cjp> {
        final /* synthetic */ cjp b;
        final /* synthetic */ cjp c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(cjp cjpVar, cjp cjpVar2) {
            super(1);
            this.b = cjpVar;
            this.c = cjpVar2;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            if (((Boolean) obj).booleanValue() == ((Boolean) wk.this.a.f()).booleanValue()) {
                return this.b;
            }
            return this.c;
        }
    }

    public wk(yg ygVar, abt abtVar, abt.a aVar, wm wmVar) {
        this.e = ygVar;
        this.a = abtVar;
        this.b = new byu(aVar, cav.a);
        this.c = new byu(wmVar, cav.a);
    }

    public final abt.a a() {
        return (abt.a) this.b.a();
    }

    public final cas b() {
        return (cas) this.f.a();
    }

    public final cjp c() {
        cas b;
        if (this.e.a() && (b = b()) != null) {
            return (cjp) b.a();
        }
        return null;
    }

    public final void d(cjp cjpVar, cjp cjpVar2) {
        if (this.e.a()) {
            if (b() == null) {
                this.d = ((wm) this.c.a()).a();
            }
            e(a().b(new AnonymousClass1(), new AnonymousClass2(cjpVar2, cjpVar)));
        }
    }

    public final void e(cas casVar) {
        this.f.h(casVar);
    }

    public final boolean f() {
        return ((Boolean) this.a.f()).booleanValue();
    }
}
