package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusTargetNode;
import defpackage.agx;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aia extends ahf implements cyu, cwm, cpv, czk {
    private ahs C;
    public afl f;
    public ahl g;
    public final cqa h;
    public final ahw i;
    public final agu j;
    public final aii k;
    public final ahz l;
    public final ags m;
    public arqv n;
    public arqv o;

    /* compiled from: PG */
    /* renamed from: aia$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cti, arnb> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            aia.this.m.f = (cti) obj;
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: aia$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arpw implements arqv<aho, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ arqv b;
        final /* synthetic */ aii c;
        private /* synthetic */ Object d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: aia$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends arrp implements arqr<agx.b, arnb> {
            final /* synthetic */ aho a;
            final /* synthetic */ aii b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(aho ahoVar, aii aiiVar) {
                super(1);
                this.a = ahoVar;
                this.b = aiiVar;
            }

            @Override // defpackage.arqr
            public final /* bridge */ /* synthetic */ Object a(Object obj) {
                this.a.a(this.b.e(((agx.b) obj).a), 1);
                return arnb.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(arqv arqvVar, aii aiiVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = arqvVar;
            this.c = aiiVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass2) c((aho) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                aho ahoVar = (aho) this.d;
                arqv arqvVar = this.b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ahoVar, this.c);
                this.a = 1;
                if (arqvVar.a(anonymousClass1, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.b, this.c, arpeVar);
            anonymousClass2.d = obj;
            return anonymousClass2;
        }
    }

    /* compiled from: PG */
    /* renamed from: aia$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(long j, arpe arpeVar) {
            super(2, arpeVar);
            this.c = j;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass3) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            Object a;
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                aia aiaVar = aia.this;
                long j = this.c;
                int i2 = 1;
                this.a = 1;
                aii aiiVar = aiaVar.k;
                if (aiiVar.d != ahp.b) {
                    i2 = 2;
                }
                long e = drp.e(j, brg.a, brg.a, i2);
                aij aijVar = new aij(aiiVar, null);
                afl aflVar = aiiVar.b;
                if (aflVar == null || !aiiVar.i() ? (a = aijVar.a(new drp(e), this)) != arpl.a : (a = aflVar.d(e, aijVar, this)) != arpl.a) {
                    a = arnb.a;
                }
                if (a == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass3(this.c, arpeVar);
        }
    }

    /* compiled from: PG */
    /* renamed from: aia$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ long c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: aia$4$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends arpw implements arqv<aho, arpe<? super arnb>, Object> {
            final /* synthetic */ long a;
            private /* synthetic */ Object b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(long j, arpe arpeVar) {
                super(2, arpeVar);
                this.a = j;
            }

            @Override // defpackage.arqv
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return ((AnonymousClass1) c((aho) obj, (arpe) obj2)).b(arnb.a);
            }

            @Override // defpackage.arpq
            public final Object b(Object obj) {
                aqil.P(obj);
                ((aho) this.b).b(this.a);
                return arnb.a;
            }

            @Override // defpackage.arpq
            public final arpe c(Object obj, arpe arpeVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.a, arpeVar);
                anonymousClass1.b = obj;
                return anonymousClass1;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(long j, arpe arpeVar) {
            super(2, arpeVar);
            this.c = j;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass4) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                aia aiaVar = aia.this;
                long j = this.c;
                afd afdVar = afd.b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(j, null);
                this.a = 1;
                if (aiaVar.k.h(afdVar, anonymousClass1, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass4(this.c, arpeVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aia$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqg<arnb> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            aia.this.j.a = ze.a((dqv) cwn.a(aia.this, dch.d));
            return arnb.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [aia, cwr] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ahl] */
    public aia(aig aigVar, afl aflVar, ahl ahlVar, ahp ahpVar, boolean z, boolean z2, ajr ajrVar, agq agqVar) {
        super(ahy.a, z, ajrVar, ahpVar);
        agu aguVar;
        this.f = aflVar;
        this.g = ahlVar;
        cqa cqaVar = new cqa();
        this.h = cqaVar;
        ahw ahwVar = new ahw(z);
        K(ahwVar);
        this.i = ahwVar;
        agu aguVar2 = new agu(ze.a(ahy.d));
        this.j = aguVar2;
        afl aflVar2 = this.f;
        ?? r2 = this.g;
        if (r2 == 0) {
            aguVar = aguVar2;
        } else {
            aguVar = r2;
        }
        aii aiiVar = new aii(aigVar, aflVar2, aguVar, ahpVar, z2, cqaVar);
        this.k = aiiVar;
        ahz ahzVar = new ahz(aiiVar, z);
        this.l = ahzVar;
        ags agsVar = new ags(ahpVar, aiiVar, z2, agqVar);
        K(agsVar);
        this.m = agsVar;
        K(new cqc(ahzVar, cqaVar));
        K(new FocusTargetNode(2, (arqv) null));
        K(new avo(agsVar));
        K(new aep(new AnonymousClass1()));
    }

    private final void L() {
        cyv.a(this, new AnonymousClass5());
    }

    @Override // defpackage.cyu
    public final void a() {
        L();
    }

    @Override // defpackage.ahf
    public final Object b(arqv arqvVar, arpe arpeVar) {
        aii aiiVar = this.k;
        Object h = aiiVar.h(afd.b, new AnonymousClass2(arqvVar, aiiVar, null), arpeVar);
        if (h == arpl.a) {
            return h;
        }
        return arnb.a;
    }

    @Override // cga.c
    public final boolean dL() {
        return false;
    }

    @Override // defpackage.czk
    public final void dM(dho dhoVar) {
        if (((ahf) this).c && (this.n == null || this.o == null)) {
            this.n = new aid(this);
            this.o = new aie(this, null);
        }
        arqv arqvVar = this.n;
        if (arqvVar != null) {
            artm[] artmVarArr = dhl.a;
            dhn dhnVar = dgx.a;
            dhoVar.c(dgx.d, new dgn(null, arqvVar));
        }
        arqv arqvVar2 = this.o;
        if (arqvVar2 != null) {
            artm[] artmVarArr2 = dhl.a;
            dhn dhnVar2 = dgx.a;
            dhoVar.c(dgx.e, arqvVar2);
        }
    }

    @Override // cga.c
    public final void dQ() {
        L();
        this.C = agm.a;
    }

    @Override // defpackage.ahf, defpackage.czi
    public final void dT(cqq cqqVar, cqs cqsVar, long j) {
        List list = cqqVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((Boolean) ((ahf) this).b.a((crc) list.get(i))).booleanValue()) {
                super.dT(cqqVar, cqsVar, j);
                break;
            }
            i++;
        }
        if (cqsVar == cqs.b && a.bA(cqqVar.d, 6)) {
            List list2 = cqqVar.a;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (((crc) list2.get(i2)).c()) {
                    return;
                }
            }
            this.C.getClass();
            dqv h = cwp.h(this);
            cjn cjnVar = new cjn(0L);
            List list3 = cqqVar.a;
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                cjnVar = new cjn(d.aH(cjnVar.a, ((crc) list3.get(i3)).j));
            }
            arrn.J(B(), null, null, new aib(this, cjn.e(cjnVar.a, -h.em(64.0f)), null), 3);
            List list4 = cqqVar.a;
            int size4 = list4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((crc) list4.get(i4)).b();
            }
        }
    }

    @Override // defpackage.czk
    public final /* synthetic */ boolean dY() {
        return false;
    }

    @Override // defpackage.czk
    public final /* synthetic */ boolean dZ() {
        return false;
    }

    @Override // defpackage.ahf
    public final void n(long j) {
        if (!this.z) {
            return;
        }
        arrn.J(B(), null, null, new AnonymousClass3(j, null), 3);
    }

    @Override // defpackage.cpv
    public final boolean t(KeyEvent keyEvent) {
        long floatToRawIntBits;
        int floatToRawIntBits2;
        if (!((ahf) this).c) {
            return false;
        }
        if ((!a.bB(cpt.b(keyEvent), cpr.l) && !a.bB(cpt.b(keyEvent), cpr.k)) || !a.bA(cpt.a(keyEvent), 2) || keyEvent.isCtrlPressed()) {
            return false;
        }
        if (this.k.j()) {
            float f = (int) (this.m.h & 4294967295L);
            if (!a.bB(cpt.b(keyEvent), cpr.k)) {
                f = -f;
            }
            floatToRawIntBits = Float.floatToRawIntBits(brg.a);
            floatToRawIntBits2 = Float.floatToRawIntBits(f);
        } else {
            float f2 = (int) (this.m.h >> 32);
            if (!a.bB(cpt.b(keyEvent), cpr.k)) {
                f2 = -f2;
            }
            floatToRawIntBits = Float.floatToRawIntBits(f2);
            floatToRawIntBits2 = Float.floatToRawIntBits(brg.a);
        }
        arrn.J(B(), null, null, new AnonymousClass4((floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32), null), 3);
        return true;
    }

    @Override // defpackage.cpv
    public final boolean v(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ahf
    public final boolean z() {
        aii aiiVar = this.k;
        if (aiiVar.a.i()) {
            return true;
        }
        afl aflVar = aiiVar.b;
        if (aflVar != null && aflVar.g()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ahf
    public final void i(long j) {
    }
}
