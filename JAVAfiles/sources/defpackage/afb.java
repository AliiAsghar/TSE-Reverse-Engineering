package defpackage;

import android.view.View;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afb extends cga.c implements cwz, cwx, czk, cyu {
    private cas A;
    private dri B;
    public arqr a;
    public arqr b;
    public afn i;
    public View j;
    public dqv k;
    public afm l;
    public arzj o;
    public float c = Float.NaN;
    public boolean d = true;
    public long e = 9205357640488583168L;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public boolean h = true;
    public final byn m = new byu(null, byo.a);
    public long n = 9205357640488583168L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: afb$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqg<cjn> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            long j;
            cti ctiVar = (cti) afb.this.m.a();
            if (ctiVar != null) {
                j = ctj.a(ctiVar);
            } else {
                j = 9205357640488583168L;
            }
            return new cjn(j);
        }
    }

    /* compiled from: PG */
    /* renamed from: afb$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqg<cjn> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            return new cjn(afb.this.n);
        }
    }

    /* compiled from: PG */
    /* renamed from: afb$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: afb$3$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends arrp implements arqr<Long, arnb> {
            public static final AnonymousClass1 a = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // defpackage.arqr
            public final /* bridge */ /* synthetic */ Object a(Object obj) {
                ((Number) obj).longValue();
                return arnb.a;
            }
        }

        public AnonymousClass3(arpe arpeVar) {
            super(2, arpeVar);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass3) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0013  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0011 -> B:4:0x001d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0019 -> B:4:0x001d). Please report as a decompilation issue!!! */
        @Override // defpackage.arpq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(java.lang.Object r4) {
            /*
                r3 = this;
                arpl r0 = defpackage.arpl.a
                int r1 = r3.a
                r2 = 1
                defpackage.aqil.P(r4)
                if (r1 == 0) goto Ld
                if (r1 == r2) goto L1d
                goto L2f
            Ld:
                afb r4 = defpackage.afb.this
                arzj r4 = r4.o
                if (r4 == 0) goto L1d
                r3.a = r2
                java.lang.Object r4 = r4.i(r3)
                if (r4 == r0) goto L1c
                goto L1d
            L1c:
                return r0
            L1d:
                afb r4 = defpackage.afb.this
                afm r4 = r4.l
                if (r4 == 0) goto Ld
                afb$3$1 r4 = defpackage.afb.AnonymousClass3.AnonymousClass1.a
                r1 = 2
                r3.a = r1
                java.lang.Object r4 = defpackage.byf.b(r4, r3)
                if (r4 != r0) goto L2f
                return r0
            L2f:
                afb r4 = defpackage.afb.this
                afm r4 = r4.l
                if (r4 == 0) goto Ld
                r4.c()
                goto Ld
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.afb.AnonymousClass3.b(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass3(arpeVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: afb$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqg<arnb> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            afb.this.d();
            return arnb.a;
        }
    }

    public afb(arqr arqrVar, arqr arqrVar2, afn afnVar) {
        this.a = arqrVar;
        this.b = arqrVar2;
        this.i = afnVar;
    }

    private final long e() {
        if (this.A == null) {
            this.A = new bxd(new AnonymousClass1(), null);
        }
        cas casVar = this.A;
        if (casVar != null) {
            return ((cjn) casVar.a()).a;
        }
        return 9205357640488583168L;
    }

    private final void g() {
        dqv dqvVar;
        afm afmVar = this.l;
        if (afmVar != null && (dqvVar = this.k) != null && !dri.d(afmVar.a(), this.B)) {
            arqr arqrVar = this.b;
            if (arqrVar != null) {
                arqrVar.a(new dra(dqvVar.ep(drj.c(afmVar.a()))));
            }
            this.B = new dri(afmVar.a());
        }
    }

    @Override // defpackage.cyu
    public final void a() {
        cyv.a(this, new AnonymousClass4());
    }

    public final void b() {
        afm afmVar = this.l;
        if (afmVar != null) {
            afmVar.b();
        }
        View view = this.j;
        if (view == null) {
            view = cwq.a(this);
        }
        View view2 = view;
        this.j = view2;
        dqv dqvVar = this.k;
        if (dqvVar == null) {
            dqvVar = cwp.h(this);
        }
        dqv dqvVar2 = dqvVar;
        this.k = dqvVar2;
        this.l = this.i.a(view2, this.d, this.e, this.f, this.g, this.h, dqvVar2, this.c);
        g();
    }

    public final void d() {
        dqv dqvVar = this.k;
        if (dqvVar == null) {
            dqvVar = cwp.h(this);
            this.k = dqvVar;
        }
        long j = ((cjn) this.a.a(dqvVar)).a;
        if ((j & 9223372034707292159L) != 9205357640488583168L && (9223372034707292159L & e()) != 9205357640488583168L) {
            this.n = d.aH(e(), j);
            if (this.l == null) {
                b();
            }
            afm afmVar = this.l;
            if (afmVar != null) {
                afmVar.d(this.n, this.c);
            }
            g();
            return;
        }
        this.n = 9205357640488583168L;
        afm afmVar2 = this.l;
        if (afmVar2 != null) {
            afmVar2.b();
        }
    }

    @Override // defpackage.czk
    public final void dM(dho dhoVar) {
        dhoVar.c(afc.a, new AnonymousClass2());
    }

    @Override // cga.c
    public final void dQ() {
        a();
        this.o = arhi.t(0, 0, 7);
        arrn.J(B(), null, null, new AnonymousClass3(null), 3);
    }

    @Override // defpackage.czk
    public final /* synthetic */ boolean dY() {
        return false;
    }

    @Override // defpackage.czk
    public final /* synthetic */ boolean dZ() {
        return false;
    }

    @Override // defpackage.cwz
    public final void i(cti ctiVar) {
        this.m.h(ctiVar);
    }

    @Override // defpackage.cwx
    public final void r(cnt cntVar) {
        cntVar.p();
        arzj arzjVar = this.o;
        if (arzjVar != null) {
            arzjVar.c(arnb.a);
        }
    }

    @Override // cga.c
    public final void s() {
        afm afmVar = this.l;
        if (afmVar != null) {
            afmVar.b();
        }
        this.l = null;
    }

    @Override // defpackage.cwx
    public final /* synthetic */ void t() {
    }
}
