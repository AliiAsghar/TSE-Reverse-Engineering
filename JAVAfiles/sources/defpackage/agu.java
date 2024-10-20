package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agu implements ahl {
    public aag a;
    public int b;
    private final cge c;

    /* compiled from: PG */
    /* renamed from: agu$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super Float>, Object> {
        Object a;
        Object b;
        int c;
        final /* synthetic */ float d;
        final /* synthetic */ agu e;
        final /* synthetic */ ahv f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: agu$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00071 extends arrp implements arqr<zq<Float, zv>, arnb> {
            final /* synthetic */ arry a;
            final /* synthetic */ ahv b;
            final /* synthetic */ arry c;
            final /* synthetic */ agu d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00071(arry arryVar, ahv ahvVar, arry arryVar2, agu aguVar) {
                super(1);
                this.a = arryVar;
                this.b = ahvVar;
                this.c = arryVar2;
                this.d = aguVar;
            }

            @Override // defpackage.arqr
            public final /* bridge */ /* synthetic */ Object a(Object obj) {
                zq zqVar = (zq) obj;
                float floatValue = ((Number) zqVar.a()).floatValue() - this.a.a;
                float a = this.b.a(floatValue);
                this.a.a = ((Number) zqVar.a()).floatValue();
                this.c.a = ((Number) zqVar.b()).floatValue();
                if (Math.abs(floatValue - a) > 0.5f) {
                    zqVar.c();
                }
                this.d.b++;
                return arnb.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, agu aguVar, ahv ahvVar, arpe arpeVar) {
            super(2, arpeVar);
            this.d = f;
            this.e = aguVar;
            this.f = ahvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [arry, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
        @Override // defpackage.arpq
        public final Object b(Object obj) {
            float f;
            arry arryVar;
            Object obj2;
            Object d;
            arry arryVar2;
            arpl arplVar = arpl.a;
            if (this.c != 0) {
                obj2 = this.b;
                arryVar = this.a;
                try {
                    aqil.P(obj);
                    arryVar2 = arryVar;
                } catch (CancellationException unused) {
                    arryVar.a = ((Number) ((zt) obj2).b()).floatValue();
                    arryVar2 = arryVar;
                    f = arryVar2.a;
                    return new Float(f);
                }
            } else {
                aqil.P(obj);
                if (Math.abs(this.d) > 1.0f) {
                    arryVar = new arry();
                    arryVar.a = this.d;
                    arry arryVar3 = new arry();
                    zt b = zu.b(brg.a, this.d, 28);
                    try {
                        agu aguVar = this.e;
                        aag aagVar = aguVar.a;
                        C00071 c00071 = new C00071(arryVar3, this.f, arryVar, aguVar);
                        this.a = arryVar;
                        this.b = b;
                        this.c = 1;
                        d = abq.d(b, aagVar, false, c00071, this);
                        arryVar2 = arryVar;
                        if (d == arplVar) {
                            return arplVar;
                        }
                    } catch (CancellationException unused2) {
                        obj2 = b;
                        arryVar.a = ((Number) ((zt) obj2).b()).floatValue();
                        arryVar2 = arryVar;
                        f = arryVar2.a;
                        return new Float(f);
                    }
                } else {
                    f = this.d;
                    return new Float(f);
                }
            }
            f = arryVar2.a;
            return new Float(f);
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass1(this.d, this.e, this.f, arpeVar);
        }
    }

    public /* synthetic */ agu(aag aagVar) {
        cge cgeVar = ahy.c;
        this.a = aagVar;
        this.c = cgeVar;
    }

    @Override // defpackage.ahl
    public final Object a(ahv ahvVar, float f, arpe arpeVar) {
        this.b = 0;
        return arro.q(this.c, new AnonymousClass1(f, this, ahvVar, null), arpeVar);
    }
}
