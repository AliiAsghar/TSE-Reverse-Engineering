package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwi {
    public static final AnonymousClass1 a = new cwb() { // from class: cwi.1
        @Override // defpackage.cwb
        public final Object q(cvt cvtVar) {
            return cvtVar.a.a();
        }
    };
    public static final arqr b = AnonymousClass2.a;
    public static final arqr c = AnonymousClass3.a;

    /* compiled from: PG */
    /* renamed from: cwi$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<cwg, arnb> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            cwg cwgVar = (cwg) obj;
            cwgVar.b = true;
            cwy.a(cwgVar);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: cwi$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<cwg, arnb> {
        public static final AnonymousClass3 a = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            ((cwg) obj).z();
            return arnb.a;
        }
    }

    public static final boolean a(cwg cwgVar) {
        cga.c cVar = cwp.e(cwgVar).w.d;
        cVar.getClass();
        return ((czn) cVar).a;
    }
}
