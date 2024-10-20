package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.cvc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class drx extends ViewGroup implements edf, bwh, czc, edh {
    public static final arqr a = AnonymousClass2.a;
    public final cqa b;
    public final View c;
    public final czb d;
    public arqg e;
    public boolean f;
    public final arqg g;
    public arqg h;
    public cga i;
    public final arqr j;
    public dqv k;
    public final arqr l;
    public enm m;
    public gjz n;
    public final int[] o;
    public long p;
    public final arqg q;
    public final arqr r;
    public int s;
    public int t;
    public boolean u;
    public final cxn v;
    private final arqg w;
    private final int[] x;
    private final edg y;

    /* compiled from: PG */
    /* renamed from: drx$10, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass10 extends arrp implements arqr<cti, arnb> {
        final /* synthetic */ cxn b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(cxn cxnVar) {
            super(1);
            this.b = cxnVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            drz.d(drx.this, this.b);
            drx.this.d.z();
            drx drxVar = drx.this;
            View view = drxVar.c;
            int[] iArr = drxVar.o;
            int i = iArr[0];
            int i2 = iArr[1];
            view.getLocationOnScreen(iArr);
            drx drxVar2 = drx.this;
            long j = drxVar2.p;
            drxVar2.p = ((cti) obj).g();
            drx drxVar3 = drx.this;
            int[] iArr2 = drxVar3.o;
            if (i != iArr2[0] || i2 != iArr2[1] || !a.bB(j, drxVar3.p)) {
                drxVar3.c.requestApplyInsets();
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: drx$11, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass11 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ boolean b;
        final /* synthetic */ drx c;
        final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(boolean z, drx drxVar, long j, arpe arpeVar) {
            super(2, arpeVar);
            this.b = z;
            this.c = drxVar;
            this.d = j;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass11) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        
            if (r10.b.d(r2, 0, r9) == r0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
        
            if (r10.b.d(0, r6, r9) == r0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
        
            return r0;
         */
        @Override // defpackage.arpq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(java.lang.Object r10) {
            /*
                r9 = this;
                arpl r0 = defpackage.arpl.a
                int r1 = r9.a
                r2 = 1
                defpackage.aqil.P(r10)
                if (r1 == 0) goto Lb
                goto L34
            Lb:
                boolean r10 = r9.b
                if (r10 != 0) goto L21
                drx r10 = r9.c
                long r6 = r9.d
                r9.a = r2
                cqa r3 = r10.b
                r4 = 0
                r8 = r9
                java.lang.Object r10 = r3.d(r4, r6, r8)
                if (r10 != r0) goto L34
                goto L33
            L21:
                drx r10 = r9.c
                long r2 = r9.d
                r1 = 2
                r9.a = r1
                cqa r1 = r10.b
                r4 = 0
                r6 = r9
                java.lang.Object r10 = r1.d(r2, r4, r6)
                if (r10 != r0) goto L34
            L33:
                return r0
            L34:
                arnb r10 = defpackage.arnb.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.drx.AnonymousClass11.b(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass11(this.b, this.c, this.d, arpeVar);
        }
    }

    /* compiled from: PG */
    /* renamed from: drx$12, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass12 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(long j, arpe arpeVar) {
            super(2, arpeVar);
            this.c = j;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass12) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                drx drxVar = drx.this;
                long j = this.c;
                this.a = 1;
                if (drxVar.b.e(j, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass12(this.c, arpeVar);
        }
    }

    /* compiled from: PG */
    /* renamed from: drx$13, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass13 extends arrp implements arqg<arnb> {
        public static final AnonymousClass13 a = new AnonymousClass13();

        public AnonymousClass13() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: drx$14, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass14 extends arrp implements arqg<arnb> {
        public static final AnonymousClass14 a = new AnonymousClass14();

        public AnonymousClass14() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: drx$15, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass15 extends arrp implements arqg<arnb> {
        public AnonymousClass15() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            drx.this.v.N();
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: drx$16, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass16 extends arrp implements arqg<arnb> {
        public AnonymousClass16() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            drx drxVar = drx.this;
            if (drxVar.f && drxVar.isAttachedToWindow()) {
                drx drxVar2 = drx.this;
                if (drxVar2.c.getParent() == drxVar2) {
                    cze j = drxVar2.j();
                    drx drxVar3 = drx.this;
                    j.d(drxVar3, drx.a, drxVar3.e);
                }
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: drx$17, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass17 extends arrp implements arqg<arnb> {
        public static final AnonymousClass17 a = new AnonymousClass17();

        public AnonymousClass17() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: drx$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<drx, arnb> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            drx drxVar = (drx) obj;
            Handler handler = drxVar.getHandler();
            final arqg arqgVar = drxVar.q;
            handler.post(new Runnable() { // from class: dry
                @Override // java.lang.Runnable
                public final void run() {
                    arqg.this.a();
                }
            });
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: drx$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<cga, arnb> {
        final /* synthetic */ cxn a;
        final /* synthetic */ cga b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(cxn cxnVar, cga cgaVar) {
            super(1);
            this.a = cxnVar;
            this.b = cgaVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            this.a.h(((cga) obj).a(this.b));
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: drx$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqr<dqv, arnb> {
        final /* synthetic */ cxn a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(cxn cxnVar) {
            super(1);
            this.a = cxnVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            this.a.ae((dqv) obj);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: drx$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends arrp implements arqr<czb, arnb> {
        final /* synthetic */ cxn b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(cxn cxnVar) {
            super(1);
            this.b = cxnVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            dai daiVar;
            czb czbVar = (czb) obj;
            if (czbVar instanceof dai) {
                daiVar = (dai) czbVar;
            } else {
                daiVar = null;
            }
            if (daiVar != null) {
                drx drxVar = drx.this;
                cxn cxnVar = this.b;
                daiVar.D().a.put(drxVar, cxnVar);
                daiVar.D().addView(drxVar);
                daiVar.D().b.put(cxnVar, drxVar);
                drxVar.setImportantForAccessibility(1);
                eek.n(drxVar, new daj(daiVar, cxnVar, daiVar));
            }
            drx drxVar2 = drx.this;
            if (drxVar2.c.getParent() != drxVar2) {
                drxVar2.addView(drxVar2.c);
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: drx$6, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass6 extends arrp implements arqr<czb, arnb> {
        public AnonymousClass6() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            dai daiVar;
            czb czbVar = (czb) obj;
            if (czbVar instanceof dai) {
                daiVar = (dai) czbVar;
            } else {
                daiVar = null;
            }
            if (daiVar != null) {
                daiVar.x(new dam(daiVar, drx.this));
            }
            drx.this.removeAllViewsInLayout();
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: drx$8, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass8 extends arrp implements arqr<dho, arnb> {
        public static final AnonymousClass8 a = new AnonymousClass8();

        public AnonymousClass8() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: drx$9, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass9 extends arrp implements arqr<cny, arnb> {
        final /* synthetic */ cxn b;
        final /* synthetic */ drx c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(cxn cxnVar, drx drxVar) {
            super(1);
            this.b = cxnVar;
            this.c = drxVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ckr b = ((cny) obj).q().b();
            drx drxVar = drx.this;
            if (drxVar.c.getVisibility() != 8) {
                cxn cxnVar = this.b;
                drxVar.u = true;
                czb czbVar = cxnVar.l;
                if (true != (czbVar instanceof dai)) {
                    czbVar = null;
                }
                if (czbVar != null) {
                    drx drxVar2 = this.c;
                    Canvas a = cjx.a(b);
                    ((dai) czbVar).D();
                    drxVar2.draw(a);
                }
                drxVar.u = false;
            }
            return arnb.a;
        }
    }

    public drx(Context context, bwr bwrVar, cqa cqaVar, View view, czb czbVar) {
        super(context);
        this.b = cqaVar;
        this.c = view;
        this.d = czbVar;
        dfd.b(this, bwrVar);
        setSaveFromParentEnabled(false);
        addView(view);
        mka.i(this, new eeu() { // from class: drx.1
            {
                super(1);
            }

            @Override // defpackage.eeu
            public final efo b(efo efoVar, List list) {
                return drx.this.k(efoVar);
            }

            @Override // defpackage.eeu
            public final eet d(eet eetVar) {
                cyn x = drx.this.v.x();
                if (!x.r()) {
                    return eetVar;
                }
                long c = drf.c(ctj.a(x));
                int a2 = dre.a(c);
                if (a2 < 0) {
                    a2 = 0;
                }
                int b = dre.b(c);
                if (b < 0) {
                    b = 0;
                }
                long g = ctj.f(x).g();
                long j = g >> 32;
                long j2 = g & 4294967295L;
                long j3 = x.c;
                long c2 = drf.c(x.i((Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (4294967295L & Float.floatToRawIntBits((int) (j3 & 4294967295L)))));
                int a3 = ((int) j) - dre.a(c2);
                if (a3 < 0) {
                    a3 = 0;
                }
                int b2 = ((int) j2) - dre.b(c2);
                if (b2 < 0) {
                    b2 = 0;
                }
                if (a2 == 0 && b == 0 && a3 == 0 && b2 == 0) {
                    return eetVar;
                }
                return new eet(drx.m(eetVar.a, a2, b, a3, b2), drx.m(eetVar.b, a2, b, a3, b2));
            }
        });
        edz.k(this, this);
        this.e = AnonymousClass17.a;
        this.g = AnonymousClass14.a;
        this.h = AnonymousClass13.a;
        this.i = cga.e;
        this.k = new dqw(1.0f);
        this.o = new int[2];
        this.p = 0L;
        this.q = new AnonymousClass16();
        this.w = new AnonymousClass15();
        this.x = new int[2];
        this.s = Integer.MIN_VALUE;
        this.t = Integer.MIN_VALUE;
        this.y = new edg();
        final cxn cxnVar = new cxn(false, 3, null);
        cxnVar.i = true;
        cxnVar.m = this;
        cga c = dhb.c(cqb.a(cga.e, drz.a, cqaVar), true, AnonymousClass8.a);
        crl crlVar = new crl();
        crlVar.a = new cro(this);
        crt crtVar = new crt();
        crlVar.f(crtVar);
        this.r = crtVar;
        cga a2 = cur.a(cho.a(cld.b(c.a(crlVar), brg.a, brg.a, brg.a, brg.a, brg.a, brg.a, brg.a, null, false, 0, 131071), new AnonymousClass9(cxnVar, this)), new AnonymousClass10(cxnVar));
        cxnVar.h(this.i.a(a2));
        this.j = new AnonymousClass3(cxnVar, a2);
        cxnVar.ae(this.k);
        this.l = new AnonymousClass4(cxnVar);
        cxnVar.z = new AnonymousClass5(cxnVar);
        cxnVar.A = new AnonymousClass6();
        cxnVar.g(new cue() { // from class: drx.7

            /* compiled from: PG */
            /* renamed from: drx$7$1, reason: invalid class name */
            /* loaded from: classes.dex */
            static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
                public static final AnonymousClass1 a = new AnonymousClass1();

                public AnonymousClass1() {
                    super(1);
                }

                @Override // defpackage.arqr
                public final /* bridge */ /* synthetic */ Object a(Object obj) {
                    return a.bF(obj);
                }
            }

            /* compiled from: PG */
            /* renamed from: drx$7$2, reason: invalid class name */
            /* loaded from: classes.dex */
            static final class AnonymousClass2 extends arrp implements arqr<cvc.a, arnb> {
                final /* synthetic */ drx a;
                final /* synthetic */ cxn b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(drx drxVar, cxn cxnVar) {
                    super(1);
                    this.a = drxVar;
                    this.b = cxnVar;
                }

                @Override // defpackage.arqr
                public final /* bridge */ /* synthetic */ Object a(Object obj) {
                    drz.d(this.a, this.b);
                    return arnb.a;
                }
            }

            private final int f(int i) {
                drx drxVar = drx.this;
                drxVar.measure(drx.n(0, i, drxVar.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return drx.this.getMeasuredHeight();
            }

            private final int g(int i) {
                drx.this.measure(View.MeasureSpec.makeMeasureSpec(0, 0), drx.n(0, i, drx.this.getLayoutParams().height));
                return drx.this.getMeasuredWidth();
            }

            @Override // defpackage.cue
            public final int a(ctd ctdVar, List list, int i) {
                return f(i);
            }

            @Override // defpackage.cue
            public final int b(ctd ctdVar, List list, int i) {
                return g(i);
            }

            @Override // defpackage.cue
            public final int c(ctd ctdVar, List list, int i) {
                return f(i);
            }

            @Override // defpackage.cue
            public final int d(ctd ctdVar, List list, int i) {
                return g(i);
            }

            @Override // defpackage.cue
            public final cuf e(cuh cuhVar, List list, long j) {
                if (drx.this.getChildCount() == 0) {
                    return cug.b(cuhVar, dqs.d(j), dqs.c(j), AnonymousClass1.a);
                }
                if (dqs.d(j) != 0) {
                    drx.this.getChildAt(0).setMinimumWidth(dqs.d(j));
                }
                if (dqs.c(j) != 0) {
                    drx.this.getChildAt(0).setMinimumHeight(dqs.c(j));
                }
                drx drxVar = drx.this;
                drxVar.measure(drx.n(dqs.d(j), dqs.b(j), drxVar.getLayoutParams().width), drx.n(dqs.c(j), dqs.a(j), drx.this.getLayoutParams().height));
                drx drxVar2 = drx.this;
                return cug.b(cuhVar, drxVar2.getMeasuredWidth(), drxVar2.getMeasuredHeight(), new AnonymousClass2(drxVar2, cxnVar));
            }
        });
        this.v = cxnVar;
    }

    public static final eaq m(eaq eaqVar, int i, int i2, int i3, int i4) {
        int i5 = eaqVar.b - i;
        int i6 = eaqVar.c - i2;
        int i7 = eaqVar.d - i3;
        int i8 = eaqVar.e - i4;
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        if (i7 < 0) {
            i7 = 0;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        return eaq.d(i5, i6, i7, i8);
    }

    public static final int n(int i, int i2, int i3) {
        if (i3 < 0 && i != i2) {
            if (i3 == -2) {
                if (i2 != Integer.MAX_VALUE) {
                    return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
                }
            } else if (i3 == -1 && i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            }
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(arrn.u(i3, i, i2), 1073741824);
    }

    @Override // defpackage.czc
    public final boolean J() {
        return isAttachedToWindow();
    }

    @Override // defpackage.bwh
    public final void b() {
        removeAllViewsInLayout();
    }

    @Override // defpackage.bwh
    public final void c() {
        this.h.a();
    }

    @Override // defpackage.bwh
    public final void d() {
        if (this.c.getParent() != this) {
            addView(this.c);
        }
    }

    @Override // defpackage.ede
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
        if (!isNestedScrollingEnabled()) {
            return;
        }
        cqa cqaVar = this.b;
        float a2 = drz.a(i);
        float a3 = drz.a(i2);
        long b = cqaVar.b((Float.floatToRawIntBits(a3) & 4294967295L) | (Float.floatToRawIntBits(a2) << 32), drz.c(i3));
        iArr[0] = ddj.a(Float.intBitsToFloat((int) (b >> 32)));
        iArr[1] = ddj.a(Float.intBitsToFloat((int) (b & 4294967295L)));
    }

    @Override // defpackage.edh
    public final efo ez(View view, efo efoVar) {
        return k(efoVar);
    }

    @Override // defpackage.ede
    public final void f(View view, int i, int i2, int i3, int i4, int i5) {
        if (!isNestedScrollingEnabled()) {
            return;
        }
        cqa cqaVar = this.b;
        float a2 = drz.a(i);
        float a3 = drz.a(i2);
        long floatToRawIntBits = Float.floatToRawIntBits(a2);
        long floatToRawIntBits2 = Float.floatToRawIntBits(a3);
        float a4 = drz.a(i3);
        float a5 = drz.a(i4);
        cqaVar.a((floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), (Float.floatToRawIntBits(a4) << 32) | (Float.floatToRawIntBits(a5) & 4294967295L), drz.c(i5));
    }

    @Override // defpackage.edf
    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!isNestedScrollingEnabled()) {
            return;
        }
        cqa cqaVar = this.b;
        float a2 = drz.a(i);
        float a3 = drz.a(i2);
        long floatToRawIntBits = Float.floatToRawIntBits(a2);
        long floatToRawIntBits2 = Float.floatToRawIntBits(a3);
        float a4 = drz.a(i3);
        float a5 = drz.a(i4);
        long a6 = cqaVar.a((floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), (Float.floatToRawIntBits(a4) << 32) | (Float.floatToRawIntBits(a5) & 4294967295L), drz.c(i5));
        iArr[0] = ddj.a(Float.intBitsToFloat((int) (a6 >> 32)));
        iArr[1] = ddj.a(Float.intBitsToFloat((int) (a6 & 4294967295L)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.x);
        int[] iArr = this.x;
        int i = iArr[0];
        region.op(i, iArr[1], i + getWidth(), this.x[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // android.view.View
    public final ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        if (layoutParams == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.y.a();
    }

    @Override // defpackage.ede
    public final void h(View view, View view2, int i, int i2) {
        this.y.b(i, i2);
    }

    @Override // defpackage.ede
    public final void i(View view, int i) {
        this.y.c(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        l();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.c.isNestedScrollingEnabled();
    }

    public final cze j() {
        if (!isAttachedToWindow()) {
            csg.c("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.d.j();
    }

    public final efo k(efo efoVar) {
        if (efoVar.f(-1).equals(eaq.a) && efoVar.g(-9).equals(eaq.a) && efoVar.j() == null) {
            return efoVar;
        }
        cyn x = this.v.x();
        if (!x.r()) {
            return efoVar;
        }
        long c = drf.c(ctj.a(x));
        int a2 = dre.a(c);
        if (a2 < 0) {
            a2 = 0;
        }
        int b = dre.b(c);
        if (b < 0) {
            b = 0;
        }
        long g = ctj.f(x).g();
        long j = g >> 32;
        long j2 = g & 4294967295L;
        long j3 = x.c;
        long c2 = drf.c(x.i((Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (4294967295L & Float.floatToRawIntBits((int) (j3 & 4294967295L)))));
        int a3 = ((int) j) - dre.a(c2);
        if (a3 < 0) {
            a3 = 0;
        }
        int b2 = ((int) j2) - dre.b(c2);
        if (b2 < 0) {
            b2 = 0;
        }
        if (a2 == 0 && b == 0 && a3 == 0 && b2 == 0) {
            return efoVar;
        }
        return efoVar.n(a2, b, a3, b2);
    }

    public final void l() {
        if (this.u) {
            View view = this.c;
            final arqg arqgVar = this.w;
            view.postOnAnimation(new Runnable() { // from class: drw
                @Override // java.lang.Runnable
                public final void run() {
                    arqg.this.a();
                }
            });
            return;
        }
        this.v.N();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q.a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.c.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (this.c.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.c.measure(i, i2);
        View view = this.c;
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.s = i;
        this.t = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        float b = drz.b(f);
        float b2 = drz.b(f2);
        arrn.J(this.b.f(), null, null, new AnonymousClass11(z, this, a.z(b, b2), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        float b = drz.b(f);
        float b2 = drz.b(f2);
        arrn.J(this.b.f(), null, null, new AnonymousClass12(a.z(b, b2), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        arqr arqrVar = this.r;
        if (arqrVar != null) {
            arqrVar.a(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // defpackage.ede
    public final boolean u(View view, View view2, int i, int i2) {
        if ((i & 2) != 0 || (i & 1) != 0) {
            return true;
        }
        return false;
    }
}
