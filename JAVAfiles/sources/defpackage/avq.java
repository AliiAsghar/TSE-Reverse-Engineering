package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class avq {

    /* compiled from: PG */
    /* renamed from: avq$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<cjp> {
        final /* synthetic */ cjp a;
        final /* synthetic */ cti b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cjp cjpVar, cti ctiVar) {
            super(0);
            this.a = cjpVar;
            this.b = ctiVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            cjp cjpVar = this.a;
            if (cjpVar == null) {
                cti ctiVar = this.b;
                if (true != ctiVar.r()) {
                    ctiVar = null;
                }
                if (ctiVar == null) {
                    return null;
                }
                return cju.b(drj.c(ctiVar.g()));
            }
            return cjpVar;
        }
    }

    public static final Object a(avi aviVar, cti ctiVar, cjp cjpVar, arpe arpeVar) {
        Object a;
        if (ctiVar.r() && (a = aviVar.a(ctiVar, new AnonymousClass1(cjpVar, ctiVar), arpeVar)) == arpl.a) {
            return a;
        }
        return arnb.a;
    }
}
