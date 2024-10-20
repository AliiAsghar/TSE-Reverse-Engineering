package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avy extends aeb {
    public boolean i;
    public arqr j;
    public final arqg k;

    /* compiled from: PG */
    /* renamed from: avy$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        final /* synthetic */ arqr a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arqr arqrVar, boolean z) {
            super(0);
            this.a = arqrVar;
            this.b = z;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            this.a.a(Boolean.valueOf(!this.b));
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: avy$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqg<arnb> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            avy.this.j.a(Boolean.valueOf(!r0.i));
            return arnb.a;
        }
    }

    public avy(boolean z, ajr ajrVar, afa afaVar, dgv dgvVar, arqr arqrVar) {
        super(ajrVar, afaVar, true, null, dgvVar, new AnonymousClass1(arqrVar, z));
        this.i = z;
        this.j = arqrVar;
        this.k = new AnonymousClass2();
    }

    @Override // defpackage.ada
    public final void e(dho dhoVar) {
        dhl.s(dhoVar, dht.a(this.i));
    }
}
