package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.bwj;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfc {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bfc$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ boolean a;
        final /* synthetic */ dqh b;
        final /* synthetic */ bfb c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, dqh dqhVar, bfb bfbVar, int i) {
            super(2);
            this.a = z;
            this.b = dqhVar;
            this.c = bfbVar;
            this.d = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.d | 1);
            bfc.a(this.a, this.b, this.c, (bwj) obj, a);
            return arnb.a;
        }
    }

    public static final void a(final boolean z, dqh dqhVar, final bfb bfbVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 6;
        bwj c = bwjVar.c(-1344558920);
        boolean z2 = true;
        if (i6 == 0) {
            if (true != c.H(z)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.G(dqhVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (true != c.I(bfbVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c.L()) {
            c.v();
        } else {
            if ((i2 & 14) != 4) {
                z2 = false;
            }
            boolean G = c.G(bfbVar) | z2;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (G || T == bwj.a.a) {
                T = new bfa(bfbVar, z);
                bwkVar.ad(T);
            }
            final ays aysVar = (ays) T;
            boolean I = c.I(bfbVar) | z2;
            Object T2 = bwkVar.T();
            if (I || T2 == bwj.a.a) {
                T2 = new bcv() { // from class: bfc.1
                    @Override // defpackage.bcv
                    public final long a() {
                        return bfb.this.a(z);
                    }
                };
                bwkVar.ad(T2);
            }
            bcv bcvVar = (bcv) T2;
            boolean i7 = djc.i(bfbVar.f().b);
            cga.a aVar = cga.e;
            boolean I2 = c.I(aysVar);
            Object T3 = bwkVar.T();
            if (I2 || T3 == bwj.a.a) {
                T3 = new PointerInputEventHandler() { // from class: bfc.2
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(crk crkVar, arpe<? super arnb> arpeVar) {
                        Object a = ayf.a(crkVar, ays.this, arpeVar);
                        if (a == arpl.a) {
                            return a;
                        }
                        return arnb.a;
                    }
                };
                bwkVar.ad(T3);
            }
            bcd.d(bcvVar, z, dqhVar, i7, 0L, cru.a(aVar, aysVar, (PointerInputEventHandler) T3), c, (i2 << 3) & 1008);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass3(z, dqhVar, bfbVar, i);
        }
    }

    public static final boolean b(bfb bfbVar, boolean z) {
        cti e;
        ayd aydVar = bfbVar.c;
        if (aydVar != null && (e = aydVar.e()) != null) {
            return bej.c(bej.b(e), bfbVar.a(z));
        }
        return false;
    }
}
