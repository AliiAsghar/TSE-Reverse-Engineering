package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class den {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: den$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        final /* synthetic */ enh a;
        final /* synthetic */ enk b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(enh enhVar, enk enkVar) {
            super(0);
            this.a = enhVar;
            this.b = enkVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            this.a.d(this.b);
            return arnb.a;
        }
    }

    public static final arqg a(final czt cztVar, enh enhVar) {
        if (enhVar.a().compareTo(eng.DESTROYED) > 0) {
            enk enkVar = new enk() { // from class: dem
                @Override // defpackage.enk
                public final void dH(enm enmVar, enf enfVar) {
                    if (enfVar == enf.ON_DESTROY) {
                        czt.this.f();
                    }
                }
            };
            enhVar.c(enkVar);
            return new AnonymousClass1(enhVar, enkVar);
        }
        throw new IllegalStateException(a.ce(enhVar, cztVar, "Cannot configure ", " to disposeComposition at Lifecycle ON_DESTROY: ", "is already destroyed"));
    }
}
