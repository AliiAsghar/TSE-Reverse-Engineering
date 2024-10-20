package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cam {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cam$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ arqv b;
        final /* synthetic */ byn c;
        private /* synthetic */ Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arqv arqvVar, byn bynVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = arqvVar;
            this.c = bynVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                arwe arweVar = (arwe) this.d;
                arqv arqvVar = this.b;
                bzb bzbVar = new bzb(this.c, arweVar.b());
                this.a = 1;
                if (arqvVar.a(bzbVar, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, arpeVar);
            anonymousClass1.d = obj;
            return anonymousClass1;
        }
    }

    public static final cas a(Object obj, arqv arqvVar, bwj bwjVar) {
        bwk bwkVar = (bwk) bwjVar;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            byu byuVar = new byu(obj, cav.a);
            bwkVar.ad(byuVar);
            T = byuVar;
        }
        byn bynVar = (byn) T;
        arnb arnbVar = arnb.a;
        boolean I = bwjVar.I(arqvVar);
        Object T2 = bwkVar.T();
        if (I || T2 == bwj.a.a) {
            T2 = new AnonymousClass1(arqvVar, bynVar, null);
            bwkVar.ad(T2);
        }
        bxl.g(arnbVar, (arqv) T2, bwjVar);
        return bynVar;
    }
}
