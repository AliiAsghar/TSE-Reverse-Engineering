package defpackage;

import defpackage.aje;
import defpackage.bwj;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avf {
    public static final auv a = new auv(arnv.a, 0, 0, 0, ahp.b, 0, 0, aje.a.a, new cuf() { // from class: avf.1
        private final Map a = arnw.a;

        @Override // defpackage.cuf
        public final int j() {
            return 0;
        }

        @Override // defpackage.cuf
        public final int k() {
            return 0;
        }

        @Override // defpackage.cuf
        public final Map m() {
            return this.a;
        }

        @Override // defpackage.cuf
        public final /* synthetic */ arqr n() {
            return null;
        }

        @Override // defpackage.cuf
        public final void o() {
        }
    }, arwi.e(arpj.a));
    public static final AnonymousClass2 b = new dqv() { // from class: avf.2
        @Override // defpackage.dqv
        public final float ec() {
            return 1.0f;
        }

        @Override // defpackage.drc
        public final float ed() {
            return 1.0f;
        }

        @Override // defpackage.drc
        public final /* synthetic */ float ef(long j) {
            return drb.a(this, j);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ float eg(float f) {
            return dqu.a(this, f);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ float eh(int i) {
            return dqu.b(this, i);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ float el(long j) {
            return dqu.c(this, j);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ float em(float f) {
            return dqu.d(this, f);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ int en(long j) {
            return dqu.e(this, j);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ int eo(float f) {
            return dqu.f(this, f);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ long ep(long j) {
            return dqu.g(this, j);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ long eq(long j) {
            return dqu.h(this, j);
        }

        @Override // defpackage.drc
        public final /* synthetic */ long er(float f) {
            return drb.b(this, f);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ long es(float f) {
            return dqu.i(this, f);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: avf$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqg<atp> {
        final /* synthetic */ int a;
        final /* synthetic */ arqg b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i, arqg arqgVar) {
            super(0);
            this.a = i;
            this.b = arqgVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return new atp(this.a, brg.a, this.b);
        }
    }

    public static final long a(auk aukVar, int i) {
        long e;
        int d = aukVar.d() + aukVar.c();
        long b2 = aukVar.b();
        long a2 = aukVar.a();
        if (aukVar.f() == ahp.b) {
            e = aukVar.e() >> 32;
        } else {
            e = aukVar.e() & 4294967295L;
        }
        int i2 = (int) e;
        long j = i;
        aukVar.i();
        aukVar.c();
        aukVar.b();
        aukVar.a();
        return arrn.v((((j * d) + b2) + a2) - (i2 - arrn.u(0, 0, i2)), 0L);
    }

    public static final avc b(int i, arqg arqgVar, bwj bwjVar, int i2) {
        if (1 == (i2 & 1)) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        ceh cehVar = atp.a;
        boolean E = bwjVar.E(i) | bwjVar.D(brg.a) | bwjVar.G(arqgVar);
        bwk bwkVar = (bwk) bwjVar;
        Object T = bwkVar.T();
        if (E || T == bwj.a.a) {
            T = new AnonymousClass3(i, arqgVar);
            bwkVar.ad(T);
        }
        atp atpVar = (atp) cdy.b(objArr, cehVar, (arqg) T, bwjVar, 0, 4);
        atpVar.b.h(arqgVar);
        return atpVar;
    }
}
