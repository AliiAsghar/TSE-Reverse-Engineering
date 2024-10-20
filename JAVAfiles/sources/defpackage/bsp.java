package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsp extends arpw implements arqw<arwe, Float, arpe<? super arnb>, Object> {
    /* synthetic */ float a;
    final /* synthetic */ bsr b;
    private /* synthetic */ Object c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bsp$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ bsr b;
        final /* synthetic */ float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bsr bsrVar, float f, arpe arpeVar) {
            super(2, arpeVar);
            this.b = bsrVar;
            this.c = f;
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
                bsr bsrVar = this.b;
                float f = this.c;
                this.a = 1;
                if (bsrVar.m(f, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass1(this.b, this.c, arpeVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsp(bsr bsrVar, arpe arpeVar) {
        super(3, arpeVar);
        this.b = bsrVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        bsp bspVar = new bsp(this.b, (arpe) obj3);
        bspVar.c = (arwe) obj;
        bspVar.a = floatValue;
        return bspVar.b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [arwe, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        arrn.J(this.c, null, null, new AnonymousClass1(this.b, this.a, null), 3);
        return arnb.a;
    }
}
