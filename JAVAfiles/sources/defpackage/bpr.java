package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpr extends arpw implements arqx<bsn, bsw<bps>, bps, arpe<? super arnb>, Object> {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ bpq d;
    final /* synthetic */ float e;
    final /* synthetic */ aap f;
    private /* synthetic */ Object g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bpr$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<Float, Float, arnb> {
        final /* synthetic */ bsn a;
        final /* synthetic */ arry b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bsn bsnVar, arry arryVar) {
            super(2);
            this.a = bsnVar;
            this.b = arryVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            float floatValue = ((Number) obj).floatValue();
            this.a.a(floatValue, ((Number) obj2).floatValue());
            this.b.a = floatValue;
            return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpr(bpq bpqVar, float f, aap aapVar, arpe arpeVar) {
        super(4, arpeVar);
        this.d = bpqVar;
        this.e = f;
        this.f = aapVar;
    }

    @Override // defpackage.arqx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        bpr bprVar = new bpr(this.d, this.e, this.f, (arpe) obj4);
        bprVar.g = (bsn) obj;
        bprVar.b = (bsw) obj2;
        bprVar.c = (bps) obj3;
        return bprVar.b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, bsn] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bsw, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        float a;
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            ?? r10 = this.g;
            float c = this.b.c(this.c);
            if (!Float.isNaN(c)) {
                arry arryVar = new arry();
                if (Float.isNaN(this.d.a())) {
                    a = brg.a;
                } else {
                    a = this.d.a();
                }
                float f = a;
                arryVar.a = f;
                float f2 = this.e;
                aap aapVar = this.f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(r10, arryVar);
                this.g = null;
                this.b = null;
                this.a = 1;
                if (abq.c(f, c, f2, aapVar, anonymousClass1, this) == arplVar) {
                    return arplVar;
                }
            }
        }
        return arnb.a;
    }
}
