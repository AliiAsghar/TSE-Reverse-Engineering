package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crn {

    /* compiled from: PG */
    /* renamed from: crn$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqw<cga, bwj, Integer, cga> {
        final /* synthetic */ arqr a;
        final /* synthetic */ crt b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arqr arqrVar, crt crtVar) {
            super(3);
            this.a = arqrVar;
            this.b = crtVar;
        }

        @Override // defpackage.arqw
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            bwj bwjVar = (bwj) obj2;
            ((Number) obj3).intValue();
            bwjVar.y(374375707);
            Object h = bwjVar.h();
            if (h == bwj.a.a) {
                h = new crl();
                bwjVar.B(h);
            }
            crl crlVar = (crl) h;
            crlVar.a = this.a;
            crlVar.f(this.b);
            bwjVar.q();
            return crlVar;
        }
    }

    public static final cga a(cga cgaVar, crt crtVar, arqr arqrVar) {
        return cfv.g(cgaVar, new AnonymousClass1(arqrVar, crtVar));
    }
}
