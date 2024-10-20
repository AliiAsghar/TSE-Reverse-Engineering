package defpackage;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgc implements ScrollCaptureCallback {
    public final dhe a;
    public final a b;
    public final dgg c;
    private final drg d;
    private final arwe e;

    /* compiled from: PG */
    /* renamed from: dgc$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ Runnable c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Runnable runnable, arpe arpeVar) {
            super(2, arpeVar);
            this.c = runnable;
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
                dgc dgcVar = dgc.this;
                this.a = 1;
                if (dgcVar.c.c(brg.a, this) == arplVar) {
                    return arplVar;
                }
            }
            ((dgk) dgc.this.b).a(false);
            this.c.run();
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass1(this.c, arpeVar);
        }
    }

    /* compiled from: PG */
    /* renamed from: dgc$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ ScrollCaptureSession c;
        final /* synthetic */ Rect d;
        final /* synthetic */ Consumer e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, arpe arpeVar) {
            super(2, arpeVar);
            this.c = scrollCaptureSession;
            this.d = rect;
            this.e = consumer;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass2) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                dgc dgcVar = dgc.this;
                ScrollCaptureSession scrollCaptureSession = this.c;
                Rect rect = this.d;
                drg drgVar = new drg(rect.left, rect.top, rect.right, rect.bottom);
                this.a = 1;
                obj = dgcVar.a(scrollCaptureSession, drgVar, this);
                if (obj == arplVar) {
                    return arplVar;
                }
            }
            this.e.accept(clv.b((drg) obj));
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass2(this.c, this.d, this.e, arpeVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dgc$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arps {
        Object a;
        int b;
        int c;
        /* synthetic */ Object d;
        int f;
        dgc g;
        drg h;

        public AnonymousClass3(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return dgc.this.a(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: dgc$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqr<Long, arnb> {
        public static final AnonymousClass4 a = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ((Number) obj).longValue();
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: dgc$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends arpw implements arqv<Float, arpe<? super Float>, Object> {
        boolean a;
        int b;
        /* synthetic */ float c;

        public AnonymousClass5(arpe arpeVar) {
            super(2, arpeVar);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass5) c(Float.valueOf(((Number) obj).floatValue()), (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            boolean z;
            float intBitsToFloat;
            arpl arplVar = arpl.a;
            if (this.b != 0) {
                z = this.a;
                aqil.P(obj);
            } else {
                aqil.P(obj);
                float f = this.c;
                arqv a = dgm.a(dgc.this.a);
                if (a != null) {
                    dgc dgcVar = dgc.this;
                    dhn dhnVar = dhh.a;
                    boolean z2 = ((dgw) dgcVar.a.c.a(dhh.r)).c;
                    if (z2) {
                        f = -f;
                    }
                    cjn cjnVar = new cjn((Float.floatToRawIntBits(brg.a) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                    this.a = z2;
                    this.b = 1;
                    obj = a.a(cjnVar, this);
                    if (obj != arplVar) {
                        z = z2;
                    } else {
                        return arplVar;
                    }
                } else {
                    csg.a("Required value was null.");
                    throw new armj();
                }
            }
            int i = (int) (((cjn) obj).a & 4294967295L);
            if (z) {
                intBitsToFloat = -Float.intBitsToFloat(i);
            } else {
                intBitsToFloat = Float.intBitsToFloat(i);
            }
            return new Float(intBitsToFloat);
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(arpeVar);
            anonymousClass5.c = ((Number) obj).floatValue();
            return anonymousClass5;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface a {
    }

    public dgc(dhe dheVar, drg drgVar, arwe arweVar, a aVar) {
        this.a = dheVar;
        this.d = drgVar;
        this.b = aVar;
        this.e = arwi.f(arweVar, dgf.b);
        this.c = new dgg(drgVar.a(), new AnonymousClass5(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.view.ScrollCaptureSession r12, defpackage.drg r13, defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgc.a(android.view.ScrollCaptureSession, drg, arpe):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        arrn.J(this.e, aryc.a, null, new AnonymousClass1(runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final arxm J = arrn.J(this.e, null, null, new AnonymousClass2(scrollCaptureSession, rect, consumer, null), 3);
        J.s(new dge(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: dgd
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                arxm.this.v(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(clv.b(this.d));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.c.b = brg.a;
        ((dgk) this.b).a(true);
        runnable.run();
    }
}
