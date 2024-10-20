package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cir implements ciq {
    public boolean a = true;
    public final cit b;
    public final cit c;
    public final cit d;
    public final cit e;
    public final cit f;
    public final cit g;
    public final cit h;
    public final cit i;
    public arqr j;
    public arqr k;

    /* compiled from: PG */
    /* renamed from: cir$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cib, cit> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            int i = ((cib) obj).a;
            return cit.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: cir$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<cib, cit> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            int i = ((cib) obj).a;
            return cit.a;
        }
    }

    public cir() {
        cit citVar = cit.a;
        this.b = citVar;
        this.c = citVar;
        this.d = citVar;
        this.e = citVar;
        this.f = citVar;
        this.g = citVar;
        this.h = citVar;
        this.i = citVar;
        this.j = AnonymousClass1.a;
        this.k = AnonymousClass2.a;
    }

    @Override // defpackage.ciq
    public final void a(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ciq
    public final void b(arqr arqrVar) {
        this.j = arqrVar;
    }

    @Override // defpackage.ciq
    public final void c(arqr arqrVar) {
        this.k = arqrVar;
    }

    @Override // defpackage.ciq
    public final boolean d() {
        return this.a;
    }
}
