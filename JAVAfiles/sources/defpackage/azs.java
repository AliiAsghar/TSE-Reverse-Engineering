package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azs implements aig {
    private final /* synthetic */ aig a;
    private final cas b;
    private final cas c;

    /* compiled from: PG */
    /* renamed from: azs$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<Boolean> {
        final /* synthetic */ azv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(azv azvVar) {
            super(0);
            this.a = azvVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            boolean z;
            if (this.a.b() > brg.a) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: PG */
    /* renamed from: azs$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqg<Boolean> {
        final /* synthetic */ azv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(azv azvVar) {
            super(0);
            this.a = azvVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            boolean z;
            azv azvVar = this.a;
            if (azvVar.b() < azvVar.a()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public azs(aig aigVar, azv azvVar) {
        this.a = aigVar;
        this.b = new bxd(new AnonymousClass2(azvVar), null);
        this.c = new bxd(new AnonymousClass1(azvVar), null);
    }

    @Override // defpackage.aig
    public final float a(float f) {
        return this.a.a(f);
    }

    @Override // defpackage.aig
    public final Object e(afd afdVar, arqv arqvVar, arpe arpeVar) {
        return this.a.e(afdVar, arqvVar, arpeVar);
    }

    @Override // defpackage.aig
    public final boolean g() {
        return ((Boolean) this.c.a()).booleanValue();
    }

    @Override // defpackage.aig
    public final boolean h() {
        return ((Boolean) this.b.a()).booleanValue();
    }

    @Override // defpackage.aig
    public final boolean i() {
        return this.a.i();
    }
}
