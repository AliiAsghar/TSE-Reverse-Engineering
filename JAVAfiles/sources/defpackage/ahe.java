package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.agx;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahe implements PointerInputEventHandler {
    final /* synthetic */ ahf a;

    /* compiled from: PG */
    /* renamed from: ahe$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ ahf b;
        final /* synthetic */ crk c;
        final /* synthetic */ arqw d;
        final /* synthetic */ arqr e;
        final /* synthetic */ arqg f;
        final /* synthetic */ arqg g;
        final /* synthetic */ arqv h;
        final /* synthetic */ arqv i;
        private /* synthetic */ Object j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ahf ahfVar, crk crkVar, arqw arqwVar, arqr arqrVar, arqg arqgVar, arqg arqgVar2, arqv arqvVar, arqv arqvVar2, arpe arpeVar) {
            super(2, arpeVar);
            this.b = ahfVar;
            this.c = crkVar;
            this.d = arqwVar;
            this.e = arqrVar;
            this.f = arqgVar;
            this.g = arqgVar2;
            this.h = arqvVar;
            this.i = arqvVar2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        @Override // defpackage.arpq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(java.lang.Object r12) {
            /*
                r11 = this;
                arpl r0 = defpackage.arpl.a
                int r1 = r11.a
                if (r1 == 0) goto L10
                java.lang.Object r0 = r11.j
                arwe r0 = (defpackage.arwe) r0
                defpackage.aqil.P(r12)     // Catch: java.util.concurrent.CancellationException -> Le
                goto L49
            Le:
                r12 = move-exception
                goto L38
            L10:
                defpackage.aqil.P(r12)
                java.lang.Object r12 = r11.j
                arwe r12 = (defpackage.arwe) r12
                ahf r1 = r11.b     // Catch: java.util.concurrent.CancellationException -> L34
                ahp r7 = r1.a     // Catch: java.util.concurrent.CancellationException -> L34
                crk r2 = r11.c     // Catch: java.util.concurrent.CancellationException -> L34
                arqw r3 = r11.d     // Catch: java.util.concurrent.CancellationException -> L34
                arqr r4 = r11.e     // Catch: java.util.concurrent.CancellationException -> L34
                arqg r5 = r11.f     // Catch: java.util.concurrent.CancellationException -> L34
                arqg r6 = r11.g     // Catch: java.util.concurrent.CancellationException -> L34
                arqv r8 = r11.h     // Catch: java.util.concurrent.CancellationException -> L34
                r11.j = r12     // Catch: java.util.concurrent.CancellationException -> L34
                r1 = 1
                r11.a = r1     // Catch: java.util.concurrent.CancellationException -> L34
                r9 = r11
                java.lang.Object r12 = defpackage.agy.e(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L34
                if (r12 != r0) goto L49
                return r0
            L34:
                r0 = move-exception
                r10 = r0
                r0 = r12
                r12 = r10
            L38:
                ahf r1 = r11.b
                arzj r1 = r1.d
                if (r1 == 0) goto L43
                agx$a r2 = agx.a.a
                r1.c(r2)
            L43:
                boolean r0 = defpackage.arwi.h(r0)
                if (r0 == 0) goto L4c
            L49:
                arnb r12 = defpackage.arnb.a
                return r12
            L4c:
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ahe.AnonymousClass1.b(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, arpeVar);
            anonymousClass1.j = obj;
            return anonymousClass1;
        }
    }

    /* compiled from: PG */
    /* renamed from: ahe$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqv<crc, cjn, arnb> {
        final /* synthetic */ csb a;
        final /* synthetic */ ahf b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(csb csbVar, ahf ahfVar) {
            super(2);
            this.a = csbVar;
            this.b = ahfVar;
        }

        @Override // defpackage.arqv
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            long j = ((cjn) obj2).a;
            csc.b(this.a, (crc) obj);
            arzj arzjVar = this.b.d;
            if (arzjVar != null) {
                arzjVar.c(new agx.b(j));
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: ahe$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqg<arnb> {
        final /* synthetic */ ahf a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ahf ahfVar) {
            super(0);
            this.a = ahfVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            arzj arzjVar = this.a.d;
            if (arzjVar != null) {
                arzjVar.c(agx.a.a);
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: ahe$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqr<crc, arnb> {
        final /* synthetic */ csb a;
        final /* synthetic */ ahf b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(csb csbVar, ahf ahfVar) {
            super(1);
            this.a = csbVar;
            this.b = ahfVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            float a;
            csc.b(this.a, (crc) obj);
            float c = ((deo) cwn.a(this.b, dch.m)).c();
            long z = a.z(c, c);
            float a2 = drp.a(z);
            float f = brg.a;
            if (a2 <= brg.a || drp.b(z) <= brg.a) {
                String d = drp.d(z);
                Objects.toString(d);
                csg.c("maximumVelocity should be a positive value. You specified=".concat(d));
            }
            csb csbVar = this.a;
            long z2 = a.z(csbVar.a.a(drp.a(z)), csbVar.b.a(drp.b(z)));
            this.a.b();
            arzj arzjVar = this.b.d;
            if (arzjVar != null) {
                if (Float.isNaN(drp.a(z2))) {
                    a = 0.0f;
                } else {
                    a = drp.a(z2);
                }
                if (!Float.isNaN(drp.b(z2))) {
                    f = drp.b(z2);
                }
                arzjVar.c(new agx.d(a.z(a, f)));
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: ahe$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends arrp implements arqw<crc, crc, cjn, arnb> {
        final /* synthetic */ ahf a;
        final /* synthetic */ csb b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ahf ahfVar, csb csbVar) {
            super(3);
            this.a = ahfVar;
            this.b = csbVar;
        }

        @Override // defpackage.arqw
        public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            crc crcVar = (crc) obj;
            crc crcVar2 = (crc) obj2;
            long j = ((cjn) obj3).a;
            if (((Boolean) this.a.b.a(crcVar)).booleanValue()) {
                ahf ahfVar = this.a;
                if (!ahfVar.e) {
                    if (ahfVar.d == null) {
                        ahfVar.d = arhi.t(Integer.MAX_VALUE, 0, 6);
                    }
                    this.a.r();
                }
                csc.b(this.b, crcVar);
                long Q = a.Q(crcVar2.c, j);
                arzj arzjVar = this.a.d;
                if (arzjVar != null) {
                    arzjVar.c(new agx.c(Q));
                }
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: ahe$6, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass6 extends arrp implements arqv<crc, cjn, arnb> {
        final /* synthetic */ ahf a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(ahf ahfVar) {
            super(2);
            this.a = ahfVar;
        }

        @Override // defpackage.arqv
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            crc crcVar = (crc) obj;
            long j = ((cjn) obj2).a;
            if (((Boolean) this.a.b.a(crcVar)).booleanValue()) {
                ahf ahfVar = this.a;
                if (!ahfVar.e) {
                    if (ahfVar.d == null) {
                        ahfVar.d = arhi.t(Integer.MAX_VALUE, 0, 6);
                    }
                    this.a.r();
                }
                float signum = Math.signum(Float.intBitsToFloat((int) (crcVar.c >> 32)));
                float signum2 = Math.signum(Float.intBitsToFloat((int) (crcVar.c & 4294967295L)));
                long j2 = crcVar.c;
                float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * signum;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * signum2;
                long Q = a.Q(j2, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
                arzj arzjVar = this.a.d;
                if (arzjVar != null) {
                    arzjVar.c(new agx.c(Q));
                }
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: ahe$7, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass7 extends arrp implements arqg<Boolean> {
        final /* synthetic */ ahf a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(ahf ahfVar) {
            super(0);
            this.a = ahfVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return Boolean.valueOf(!this.a.z());
        }
    }

    public ahe(ahf ahfVar) {
        this.a = ahfVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(crk crkVar, arpe<? super arnb> arpeVar) {
        csb csbVar = new csb();
        ahf ahfVar = this.a;
        Object d = arwi.d(new AnonymousClass1(ahfVar, crkVar, new AnonymousClass5(ahfVar, csbVar), new AnonymousClass4(csbVar, ahfVar), new AnonymousClass3(ahfVar), new AnonymousClass7(ahfVar), new AnonymousClass2(csbVar, ahfVar), new AnonymousClass6(ahfVar), null), arpeVar);
        if (d == arpl.a) {
            return d;
        }
        return arnb.a;
    }
}
