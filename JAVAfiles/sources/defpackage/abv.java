package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abv extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    float a;
    int b;
    final /* synthetic */ abt c;
    private /* synthetic */ Object d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: abv$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<Long, arnb> {
        final /* synthetic */ abt a;
        final /* synthetic */ float b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(abt abtVar, float f) {
            super(1);
            this.a = abtVar;
            this.b = f;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            boolean z;
            long longValue = ((Number) obj).longValue();
            if (!this.a.t()) {
                abt abtVar = this.a;
                float f = this.b;
                if (abtVar.c() == Long.MIN_VALUE) {
                    abtVar.j(longValue);
                }
                long c = longValue - abtVar.c();
                if (f == brg.a) {
                    z = false;
                } else {
                    z = true;
                }
                if (f != brg.a) {
                    c = arsk.h(c / f);
                }
                abtVar.l(c);
                abtVar.h(c, !z);
            }
            return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abv(abt abtVar, arpe arpeVar) {
        super(2, arpeVar);
        this.c = abtVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abv) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arwe arweVar;
        float a;
        arpl arplVar = arpl.a;
        if (this.b != 0) {
            a = this.a;
            arweVar = (arwe) this.d;
            aqil.P(obj);
        } else {
            aqil.P(obj);
            arweVar = (arwe) this.d;
            a = abq.a(arweVar.b());
        }
        while (arwi.h(arweVar)) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, a);
            this.d = arweVar;
            this.a = a;
            this.b = 1;
            if (byf.c(anonymousClass1, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        abv abvVar = new abv(this.c, arpeVar);
        abvVar.d = obj;
        return abvVar;
    }
}
