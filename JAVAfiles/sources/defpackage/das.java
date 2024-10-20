package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class das extends ecl {
    public static final tv a;
    public final tx A;
    public tz B;
    public tt C;
    public tt D;
    public tx E;
    private long H;
    private a I;
    private final to J;
    private final arzj K;
    private tx L;
    private final dpt M;
    private final Comparator[] N;
    private final arqr O;
    public final dai b;
    public final AccessibilityManager d;
    public final AccessibilityManager.AccessibilityStateChangeListener e;
    public final AccessibilityManager.TouchExplorationStateChangeListener f;
    public List g;
    public final Handler h;
    public int i;
    public int j;
    public efx k;
    public efx l;
    public boolean m;
    public vm n;
    public vm o;
    public int p;
    public Integer q;
    public boolean r;
    public b s;
    public final String t;
    public final String u;
    public ddv v;
    public boolean w;
    public final Runnable x;
    public final List y;
    public final tx z;
    public int c = Integer.MIN_VALUE;
    private arqr G = new AnonymousClass3();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: das$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arps {
        /* synthetic */ Object a;
        int c;
        das d;
        tz e;
        aryz f;

        public AnonymousClass2(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return das.this.r(this);
        }
    }

    /* compiled from: PG */
    /* renamed from: das$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<AccessibilityEvent, Boolean> {
        public AnonymousClass3() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            dai daiVar = das.this.b;
            return Boolean.valueOf(daiVar.getParent().requestSendAccessibilityEvent(daiVar, (AccessibilityEvent) obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: das$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqg<arnb> {
        final /* synthetic */ ddu a;
        final /* synthetic */ das b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ddu dduVar, das dasVar) {
            super(0);
            this.a = dduVar;
            this.b = dasVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            float f;
            float f2;
            dhe dheVar;
            cxn cxnVar;
            ddu dduVar = this.a;
            dgw dgwVar = dduVar.d;
            dgw dgwVar2 = dduVar.e;
            Float f3 = dduVar.b;
            Float f4 = dduVar.c;
            if (dgwVar != null && f3 != null) {
                f = ((Number) dgwVar.a.a()).floatValue() - f3.floatValue();
            } else {
                f = 0.0f;
            }
            if (dgwVar2 != null && f4 != null) {
                f2 = ((Number) dgwVar2.a.a()).floatValue() - f4.floatValue();
            } else {
                f2 = 0.0f;
            }
            if (f != brg.a || f2 != brg.a) {
                int m = this.b.m(this.a.a);
                das dasVar = this.b;
                ddw ddwVar = (ddw) dasVar.q().a(dasVar.i);
                if (ddwVar != null) {
                    das dasVar2 = this.b;
                    try {
                        efx efxVar = dasVar2.k;
                        if (efxVar != null) {
                            efxVar.n(dasVar2.n(ddwVar));
                        }
                    } catch (IllegalStateException unused) {
                    }
                }
                das dasVar3 = this.b;
                ddw ddwVar2 = (ddw) dasVar3.q().a(dasVar3.j);
                if (ddwVar2 != null) {
                    das dasVar4 = this.b;
                    try {
                        efx efxVar2 = dasVar4.l;
                        if (efxVar2 != null) {
                            efxVar2.n(dasVar4.n(ddwVar2));
                        }
                    } catch (IllegalStateException unused2) {
                    }
                }
                this.b.b.invalidate();
                ddw ddwVar3 = (ddw) this.b.q().a(m);
                if (ddwVar3 != null && (dheVar = ddwVar3.a) != null && (cxnVar = dheVar.b) != null) {
                    das dasVar5 = this.b;
                    if (dgwVar != null) {
                        dasVar5.z.f(m, dgwVar);
                    }
                    if (dgwVar2 != null) {
                        dasVar5.A.f(m, dgwVar2);
                    }
                    dasVar5.u(cxnVar);
                }
            }
            if (dgwVar != null) {
                this.a.b = (Float) dgwVar.a.a();
            }
            if (dgwVar2 != null) {
                this.a.c = (Float) dgwVar2.a.a();
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: das$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends arrp implements arqr<ddu, arnb> {
        public AnonymousClass5() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            das.this.v((ddu) obj);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class a extends ega {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x09cd  */
        @Override // defpackage.ega
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final defpackage.efx a(int r20) {
            /*
                Method dump skipped, instructions count: 2541
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: das.a.a(int):efx");
        }

        @Override // defpackage.ega
        public final efx b(int i) {
            if (i != 1) {
                if (i == 2) {
                    return a(das.this.i);
                }
                throw new IllegalArgumentException(defpackage.a.bV(i, "Unknown focus type: "));
            }
            int i2 = das.this.j;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i2);
        }

        @Override // defpackage.ega
        public final void c(int i, efx efxVar, String str, Bundle bundle) {
            das.this.t(i, efxVar, str, bundle);
        }

        /* JADX WARN: Code restructure failed: missing block: B:142:0x018c, code lost:
        
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:400:0x0666, code lost:
        
            if (r10 != 16) goto L411;
         */
        /* JADX WARN: Removed duplicated region for block: B:458:0x0774  */
        /* JADX WARN: Removed duplicated region for block: B:462:0x0777  */
        @Override // defpackage.ega
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean d(int r18, int r19, android.os.Bundle r20) {
            /*
                Method dump skipped, instructions count: 2064
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: das.a.d(int, int, android.os.Bundle):boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b {
        public final dhe a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final long f;

        public b(dhe dheVar, int i, int i2, int i3, int i4, long j) {
            this.a = dheVar;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = j;
        }
    }

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        tv tvVar = new tv(32);
        int i = tvVar.b;
        if (i < 0) {
            defpackage.a.bJ("");
        }
        tvVar.d(tvVar.b + 32);
        int[] iArr2 = tvVar.a;
        int i2 = tvVar.b;
        if (i != i2) {
            aqil.x(iArr2, iArr2, i + 32, i, i2);
        }
        aqil.A(iArr, iArr2, i, 0, 12);
        tvVar.b += 32;
        a = tvVar;
    }

    public das(dai daiVar) {
        final Comparator comparator;
        this.b = daiVar;
        Object systemService = daiVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.d = accessibilityManager;
        this.H = 100L;
        this.e = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: dap
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                List<AccessibilityServiceInfo> list;
                das dasVar = das.this;
                if (z) {
                    list = dasVar.d.getEnabledAccessibilityServiceList(-1);
                } else {
                    list = arnv.a;
                }
                dasVar.g = list;
            }
        };
        this.f = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: daq
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                das dasVar = das.this;
                dasVar.g = dasVar.d.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.g = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.h = new Handler(Looper.getMainLooper());
        this.I = new a();
        this.i = Integer.MIN_VALUE;
        this.j = Integer.MIN_VALUE;
        this.z = new tx((byte[]) null);
        this.A = new tx((byte[]) null);
        this.n = new vm(null);
        this.o = new vm(null);
        this.p = -1;
        this.J = new to((byte[]) null);
        this.K = arhi.t(1, 0, 6);
        this.r = true;
        this.L = ty.a();
        this.B = new tz((byte[]) null);
        this.C = new tt(null);
        this.D = new tt(null);
        this.t = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.u = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.M = new dpt();
        this.E = new tx((byte[]) null);
        this.v = new ddv(daiVar.j.a(), ty.a());
        daiVar.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: das.1
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                das dasVar = das.this;
                AccessibilityManager accessibilityManager2 = dasVar.d;
                accessibilityManager2.addAccessibilityStateChangeListener(dasVar.e);
                accessibilityManager2.addTouchExplorationStateChangeListener(dasVar.f);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                das dasVar = das.this;
                dasVar.h.removeCallbacks(dasVar.x);
                das dasVar2 = das.this;
                AccessibilityManager accessibilityManager2 = dasVar2.d;
                accessibilityManager2.removeAccessibilityStateChangeListener(dasVar2.e);
                accessibilityManager2.removeTouchExplorationStateChangeListener(dasVar2.f);
            }
        });
        Comparator[] comparatorArr = new Comparator[2];
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                comparator = ddt.a;
            } else {
                comparator = ddf.a;
            }
            final Comparator comparator2 = cxn.c;
            final Comparator comparator3 = new Comparator() { // from class: das.6
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compare = comparator.compare(obj, obj2);
                    if (compare != 0) {
                        return compare;
                    }
                    return comparator2.compare(((dhe) obj).b, ((dhe) obj2).b);
                }
            };
            comparatorArr[i] = new Comparator() { // from class: das.7
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compare = comparator3.compare(obj, obj2);
                    if (compare != 0) {
                        return compare;
                    }
                    return arrj.q(Integer.valueOf(((dhe) obj).e), Integer.valueOf(((dhe) obj2).e));
                }
            };
        }
        this.N = comparatorArr;
        this.x = new Runnable() { // from class: dar
            /* JADX WARN: Code restructure failed: missing block: B:101:0x029c, code lost:
            
                r15 = "";
             */
            /* JADX WARN: Code restructure failed: missing block: B:102:0x029e, code lost:
            
                if (defpackage.d.F(r6, defpackage.dhh.A) == false) goto L144;
             */
            /* JADX WARN: Code restructure failed: missing block: B:103:0x02a0, code lost:
            
                r4 = r5.c;
                r6 = defpackage.dgx.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:104:0x02aa, code lost:
            
                if (r4.d(defpackage.dgx.i) == false) goto L143;
             */
            /* JADX WARN: Code restructure failed: missing block: B:105:0x02ac, code lost:
            
                r4 = defpackage.das.M(r2.a);
             */
            /* JADX WARN: Code restructure failed: missing block: B:106:0x02b2, code lost:
            
                if (r4 != null) goto L105;
             */
            /* JADX WARN: Code restructure failed: missing block: B:107:0x02b4, code lost:
            
                r4 = "";
             */
            /* JADX WARN: Code restructure failed: missing block: B:108:0x02b5, code lost:
            
                r6 = defpackage.das.M(r5.c);
             */
            /* JADX WARN: Code restructure failed: missing block: B:109:0x02bb, code lost:
            
                if (r6 != 0) goto L108;
             */
            /* JADX WARN: Code restructure failed: missing block: B:111:0x02bf, code lost:
            
                r8 = defpackage.das.O(r15);
                r6 = r4.length();
                r7 = r15.length();
                r9 = defpackage.arrn.s(r6, r7);
                r42 = r1;
                r1 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:112:0x02d2, code lost:
            
                if (r1 >= r9) goto L361;
             */
            /* JADX WARN: Code restructure failed: missing block: B:113:0x02d4, code lost:
            
                r43 = r10;
                r44 = r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:114:0x02e0, code lost:
            
                if (r4.charAt(r1) == r15.charAt(r1)) goto L114;
             */
            /* JADX WARN: Code restructure failed: missing block: B:115:0x02e3, code lost:
            
                r1 = r1 + 1;
                r10 = r43;
                r13 = r44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:118:0x02ee, code lost:
            
                r10 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:120:0x02f1, code lost:
            
                if (r10 >= (r9 - r1)) goto L362;
             */
            /* JADX WARN: Code restructure failed: missing block: B:121:0x02f3, code lost:
            
                r46 = r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:122:0x0304, code lost:
            
                if (r4.charAt((r6 - 1) - r10) == r15.charAt((r7 - 1) - r10)) goto L122;
             */
            /* JADX WARN: Code restructure failed: missing block: B:123:0x0307, code lost:
            
                r10 = r10 + 1;
                r9 = r46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:126:0x030c, code lost:
            
                r6 = (r6 - r10) - r1;
                r9 = (r7 - r10) - r1;
                r10 = r2.a.d(defpackage.dhh.F);
                r13 = r5.c.d(defpackage.dhh.F);
                r45 = r2;
                r2 = r2.a.d(defpackage.dhh.A);
             */
            /* JADX WARN: Code restructure failed: missing block: B:127:0x032b, code lost:
            
                if (r2 == false) goto L128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:128:0x032d, code lost:
            
                if (r10 != false) goto L128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:129:0x032f, code lost:
            
                if (r13 == false) goto L128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:130:0x0331, code lost:
            
                r15 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:131:0x0335, code lost:
            
                if (r2 == false) goto L133;
             */
            /* JADX WARN: Code restructure failed: missing block: B:132:0x0337, code lost:
            
                if (r10 == false) goto L133;
             */
            /* JADX WARN: Code restructure failed: missing block: B:133:0x0339, code lost:
            
                if (r13 != false) goto L133;
             */
            /* JADX WARN: Code restructure failed: missing block: B:135:0x033e, code lost:
            
                if (r15 != false) goto L138;
             */
            /* JADX WARN: Code restructure failed: missing block: B:136:0x0340, code lost:
            
                if (r38 == false) goto L137;
             */
            /* JADX WARN: Code restructure failed: missing block: B:138:0x0343, code lost:
            
                r2 = r0.o(r0.m(r3), 16);
                r2.setFromIndex(r1);
                r2.setRemovedCount(r6);
                r2.setAddedCount(r9);
                r2.setBeforeText(r4);
                r2.getText().add(r8);
                r13 = r3;
                r1 = r5;
                r21 = r35;
                r22 = r36;
                r10 = r45;
                r9 = '\b';
             */
            /* JADX WARN: Code restructure failed: missing block: B:139:0x0392, code lost:
            
                r2.setClassName("android.widget.EditText");
                r0.Q(r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:140:0x039a, code lost:
            
                if (r15 != false) goto L142;
             */
            /* JADX WARN: Code restructure failed: missing block: B:141:0x039c, code lost:
            
                if (r38 == false) goto L96;
             */
            /* JADX WARN: Code restructure failed: missing block: B:142:0x039e, code lost:
            
                r3 = ((defpackage.djc) r1.c.a(defpackage.dhh.B)).b;
                r2.setFromIndex(defpackage.djc.e(r3));
                r2.setToIndex(defpackage.djc.a(r3));
                r0.Q(r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:143:0x036d, code lost:
            
                r10 = r45;
                r13 = r3;
                r1 = r5;
                r21 = r35;
                r9 = '\b';
                r22 = r36;
                r2 = r0.p(r0.m(r3), 0, 0, java.lang.Integer.valueOf(r7), r8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:144:0x033c, code lost:
            
                r38 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:145:0x0334, code lost:
            
                r15 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:148:0x02ea, code lost:
            
                r43 = r10;
                r44 = r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:149:0x02be, code lost:
            
                r15 = r6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:150:0x03bd, code lost:
            
                r42 = r1;
                r1 = r5;
                r43 = r10;
                r44 = r13;
                r21 = r35;
                r22 = r36;
                r10 = r2;
                r13 = r3;
                defpackage.das.L(r0, r0.m(r13), 2048, 2, 8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:151:0x03dc, code lost:
            
                r42 = r1;
                r1 = r5;
                r43 = r10;
                r44 = r13;
                r21 = r35;
                r22 = r36;
                r10 = r2;
                r13 = r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:152:0x03f1, code lost:
            
                if (defpackage.d.F(r6, defpackage.dhh.B) == false) goto L153;
             */
            /* JADX WARN: Code restructure failed: missing block: B:153:0x03f3, code lost:
            
                r2 = defpackage.das.M(r1.c);
             */
            /* JADX WARN: Code restructure failed: missing block: B:154:0x03f9, code lost:
            
                if (r2 == null) goto L152;
             */
            /* JADX WARN: Code restructure failed: missing block: B:155:0x03fb, code lost:
            
                r2 = r2.b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:156:0x03fd, code lost:
            
                if (r2 != null) goto L151;
             */
            /* JADX WARN: Code restructure failed: missing block: B:158:0x0400, code lost:
            
                r15 = r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:159:0x0401, code lost:
            
                r2 = ((defpackage.djc) r1.c.a(defpackage.dhh.B)).b;
                r0.Q(r0.p(r0.m(r13), java.lang.Integer.valueOf(defpackage.djc.e(r2)), java.lang.Integer.valueOf(defpackage.djc.a(r2)), java.lang.Integer.valueOf(r15.length()), defpackage.das.O(r15)));
                r0.y(r1.e);
             */
            /* JADX WARN: Code restructure failed: missing block: B:161:0x0447, code lost:
            
                if (defpackage.d.F(r6, defpackage.dhh.q) == false) goto L156;
             */
            /* JADX WARN: Code restructure failed: missing block: B:163:0x0526, code lost:
            
                r0.u(r1.b);
                r2 = defpackage.ddx.c(r0.y, r13);
                r2.getClass();
                r2.d = (defpackage.dgw) defpackage.dgz.a(r1.c, defpackage.dhh.q);
                r2.e = (defpackage.dgw) defpackage.dgz.a(r1.c, defpackage.dhh.r);
                r0.v(r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:165:0x0451, code lost:
            
                if (defpackage.d.F(r6, defpackage.dhh.r) != false) goto L202;
             */
            /* JADX WARN: Code restructure failed: missing block: B:167:0x0459, code lost:
            
                if (defpackage.d.F(r6, defpackage.dhh.k) == false) goto L164;
             */
            /* JADX WARN: Code restructure failed: missing block: B:168:0x045b, code lost:
            
                r4.getClass();
             */
            /* JADX WARN: Code restructure failed: missing block: B:169:0x0464, code lost:
            
                if (((java.lang.Boolean) r4).booleanValue() == false) goto L163;
             */
            /* JADX WARN: Code restructure failed: missing block: B:170:0x0466, code lost:
            
                r0.Q(r0.o(r0.m(r1.e), 8));
             */
            /* JADX WARN: Code restructure failed: missing block: B:171:0x0473, code lost:
            
                defpackage.das.L(r0, r0.m(r1.e), 2048, 0, 8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:172:0x0484, code lost:
            
                r2 = defpackage.dgx.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:173:0x048c, code lost:
            
                if (defpackage.d.F(r6, defpackage.dgx.v) == false) goto L182;
             */
            /* JADX WARN: Code restructure failed: missing block: B:174:0x048e, code lost:
            
                r2 = (java.util.List) r1.c.a(defpackage.dgx.v);
                r3 = (java.util.List) defpackage.dgz.a(r10.a, defpackage.dgx.v);
             */
            /* JADX WARN: Code restructure failed: missing block: B:175:0x04a2, code lost:
            
                if (r3 == null) goto L179;
             */
            /* JADX WARN: Code restructure failed: missing block: B:176:0x04a4, code lost:
            
                r4 = new java.util.LinkedHashSet();
                r5 = r2.size();
                r6 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:177:0x04af, code lost:
            
                if (r6 >= r5) goto L364;
             */
            /* JADX WARN: Code restructure failed: missing block: B:178:0x04b1, code lost:
            
                r4.add(((defpackage.dgr) r2.get(r6)).a);
                r6 = r6 + 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:180:0x04bf, code lost:
            
                r2 = new java.util.LinkedHashSet();
                r5 = r3.size();
                r6 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:181:0x04ca, code lost:
            
                if (r6 >= r5) goto L365;
             */
            /* JADX WARN: Code restructure failed: missing block: B:182:0x04cc, code lost:
            
                r2.add(((defpackage.dgr) r3.get(r6)).a);
                r6 = r6 + 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:185:0x04de, code lost:
            
                if (r4.containsAll(r2) == false) goto L201;
             */
            /* JADX WARN: Code restructure failed: missing block: B:187:0x04e4, code lost:
            
                if (r2.containsAll(r4) != false) goto L186;
             */
            /* JADX WARN: Code restructure failed: missing block: B:189:0x04fc, code lost:
            
                r2 = '\b';
                r29 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:191:0x0522, code lost:
            
                r2 = '\b';
                r29 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:194:0x04eb, code lost:
            
                if (r2.isEmpty() != false) goto L96;
             */
            /* JADX WARN: Code restructure failed: missing block: B:197:0x04f0, code lost:
            
                if ((r4 instanceof defpackage.dgn) == false) goto L201;
             */
            /* JADX WARN: Code restructure failed: missing block: B:198:0x04f2, code lost:
            
                r4 = (defpackage.dgn) r4;
                r2 = defpackage.dgz.a(r10.a, r6);
             */
            /* JADX WARN: Code restructure failed: missing block: B:199:0x04fa, code lost:
            
                if (r4 != r2) goto L187;
             */
            /* JADX WARN: Code restructure failed: missing block: B:201:0x0503, code lost:
            
                if ((r2 instanceof defpackage.dgn) != false) goto L190;
             */
            /* JADX WARN: Code restructure failed: missing block: B:203:0x0506, code lost:
            
                r2 = (defpackage.dgn) r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:204:0x0510, code lost:
            
                if (defpackage.d.F(r4.a, r2.a) != false) goto L193;
             */
            /* JADX WARN: Code restructure failed: missing block: B:206:0x0513, code lost:
            
                r3 = r4.b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:207:0x0515, code lost:
            
                if (r3 != null) goto L198;
             */
            /* JADX WARN: Code restructure failed: missing block: B:209:0x0519, code lost:
            
                if (r2.b == null) goto L198;
             */
            /* JADX WARN: Code restructure failed: missing block: B:211:0x051c, code lost:
            
                if (r3 == null) goto L186;
             */
            /* JADX WARN: Code restructure failed: missing block: B:213:0x0520, code lost:
            
                if (r2.b != null) goto L186;
             */
            /* JADX WARN: Code restructure failed: missing block: B:218:0x0126, code lost:
            
                if (r9 == false) goto L48;
             */
            /* JADX WARN: Code restructure failed: missing block: B:246:0x063a, code lost:
            
                defpackage.csg.a("no value for specified key");
             */
            /* JADX WARN: Code restructure failed: missing block: B:247:0x0644, code lost:
            
                throw new defpackage.armj();
             */
            /* JADX WARN: Code restructure failed: missing block: B:317:0x07d5, code lost:
            
                r31 = r12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:318:0x07df, code lost:
            
                if (((r0 & ((~r0) << 6)) & (-9187201950435737472L)) == 0) goto L283;
             */
            /* JADX WARN: Code restructure failed: missing block: B:321:0x07e1, code lost:
            
                r2 = -1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:374:0x08f1, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:376:0x08f5, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:380:0x08fb, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:382:0x08ff, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0132, code lost:
            
                if (defpackage.d.F(r4, defpackage.dgz.a(r2.a, r6)) != false) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0134, code lost:
            
                r42 = r1;
                r1 = r5;
                r41 = r8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0139, code lost:
            
                r43 = r10;
                r44 = r13;
                r21 = r35;
                r22 = r36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0149, code lost:
            
                if (defpackage.d.F(r6, defpackage.dhh.d) == false) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
            
                r4.getClass();
                r4 = (java.lang.String) r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x0158, code lost:
            
                if (r2.a.d(defpackage.dhh.d) == false) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x015a, code lost:
            
                r0.x(r3, 8, r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x0168, code lost:
            
                if (defpackage.d.F(r6, defpackage.dhh.b) == false) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x016a, code lost:
            
                r42 = r1;
                r1 = r5;
                r41 = r8;
                r43 = r10;
                r44 = r13;
                r21 = r35;
                r22 = r36;
                r10 = r2;
                r13 = r3;
                r2 = '\b';
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x0551, code lost:
            
                defpackage.das.L(r0, r0.m(r13), 2048, 64, 8);
                defpackage.das.L(r0, r0.m(r13), 2048, 0, 8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x0185, code lost:
            
                if (defpackage.d.F(r6, defpackage.dhh.E) != false) goto L59;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x018d, code lost:
            
                if (defpackage.d.F(r6, defpackage.dhh.c) == false) goto L65;
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x018f, code lost:
            
                defpackage.das.L(r0, r0.m(r3), 2048, 64, 8);
                defpackage.das.L(r0, r0.m(r3), 2048, 0, 8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x01b2, code lost:
            
                if (defpackage.d.F(r6, defpackage.dhh.D) == false) goto L92;
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:0x01b4, code lost:
            
                r4 = (defpackage.dgv) defpackage.dgz.a(r5.c, defpackage.dhh.u);
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x01be, code lost:
            
                if (r4 != null) goto L70;
             */
            /* JADX WARN: Code restructure failed: missing block: B:71:0x01c0, code lost:
            
                r41 = r8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x0249, code lost:
            
                r9 = '\b';
                defpackage.das.L(r0, r0.m(r3), 2048, 64, 8);
                defpackage.das.L(r0, r0.m(r3), 2048, 0, 8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x0284, code lost:
            
                r42 = r1;
                r1 = r5;
                r43 = r10;
                r44 = r13;
                r21 = r35;
                r22 = r36;
                r10 = r2;
                r13 = r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x0293, code lost:
            
                r2 = r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x01cb, code lost:
            
                if (defpackage.a.bA(r4.a, 4) == false) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:0x01dd, code lost:
            
                if (defpackage.d.F(defpackage.dgz.a(r5.c, defpackage.dhh.D), true) == false) goto L89;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x01df, code lost:
            
                r4 = r0.o(r0.m(r3), 4);
                r6 = r5.f();
                r7 = (java.util.List) defpackage.dgz.a(r6.e(), defpackage.dhh.a);
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x01fb, code lost:
            
                if (r7 == null) goto L79;
             */
            /* JADX WARN: Code restructure failed: missing block: B:83:0x01fd, code lost:
            
                r41 = r8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x0200, code lost:
            
                r8 = defpackage.dru.d(r7, ",", null, 62);
             */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x0209, code lost:
            
                r6 = (java.util.List) defpackage.dgz.a(r6.e(), defpackage.dhh.x);
             */
            /* JADX WARN: Code restructure failed: missing block: B:86:0x0215, code lost:
            
                if (r6 == null) goto L83;
             */
            /* JADX WARN: Code restructure failed: missing block: B:87:0x0217, code lost:
            
                r6 = defpackage.dru.d(r6, ",", null, 62);
             */
            /* JADX WARN: Code restructure failed: missing block: B:88:0x021f, code lost:
            
                if (r8 == null) goto L86;
             */
            /* JADX WARN: Code restructure failed: missing block: B:89:0x0221, code lost:
            
                r4.setContentDescription(r8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:90:0x0224, code lost:
            
                if (r6 == null) goto L88;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x0226, code lost:
            
                r4.getText().add(r6);
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x022d, code lost:
            
                r0.Q(r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x0244, code lost:
            
                r42 = r1;
                r1 = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x021d, code lost:
            
                r6 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x0206, code lost:
            
                r41 = r8;
                r8 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x0231, code lost:
            
                r41 = r8;
                defpackage.das.L(r0, r0.m(r3), 2048, 0, 8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x0265, code lost:
            
                r41 = r8;
                r9 = '\b';
             */
            /* JADX WARN: Code restructure failed: missing block: B:98:0x0270, code lost:
            
                if (defpackage.d.F(r6, defpackage.dhh.a) == false) goto L97;
             */
            /* JADX WARN: Code restructure failed: missing block: B:99:0x0272, code lost:
            
                r6 = r0.m(r3);
                r4.getClass();
                r0.N(r6, 2048, 4, (java.util.List) r4);
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v75, types: [java.util.Collection, java.util.Set, java.util.LinkedHashSet] */
            /* JADX WARN: Type inference failed for: r4v44, types: [java.util.Collection, java.util.Set, java.util.LinkedHashSet] */
            /* JADX WARN: Type inference failed for: r6v34, types: [dhv] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 2309
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dar.run():void");
            }
        };
        this.y = new ArrayList();
        this.O = new AnonymousClass5();
    }

    public static final boolean G(dgw dgwVar, float f) {
        if (f < brg.a && ((Number) dgwVar.a.a()).floatValue() > brg.a) {
            return true;
        }
        if (f > brg.a && ((Number) dgwVar.a.a()).floatValue() < ((Number) dgwVar.b.a()).floatValue()) {
            return true;
        }
        return false;
    }

    public static final boolean H(dgw dgwVar) {
        if (((Number) dgwVar.a.a()).floatValue() > brg.a && !dgwVar.c) {
            return true;
        }
        if (((Number) dgwVar.a.a()).floatValue() < ((Number) dgwVar.b.a()).floatValue() && dgwVar.c) {
            return true;
        }
        return false;
    }

    public static final boolean I(dgw dgwVar) {
        if (((Number) dgwVar.a.a()).floatValue() < ((Number) dgwVar.b.a()).floatValue() && !dgwVar.c) {
            return true;
        }
        if (((Number) dgwVar.a.a()).floatValue() > brg.a && dgwVar.c) {
            return true;
        }
        return false;
    }

    public static final boolean K(dhe dheVar) {
        boolean z;
        dhn dhnVar = dhh.a;
        dhs dhsVar = (dhs) dgz.a(dheVar.c, dhh.E);
        dgv dgvVar = (dgv) dgz.a(dheVar.c, dhh.u);
        Boolean bool = (Boolean) dgz.a(dheVar.c, dhh.D);
        if (dhsVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (bool != null) {
            bool.booleanValue();
            if (dgvVar == null || !defpackage.a.bA(dgvVar.a, 4)) {
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void L(das dasVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        dasVar.N(i, i2, num, null);
    }

    public static final dhv M(dgy dgyVar) {
        dhn dhnVar = dhh.a;
        return (dhv) dgz.a(dgyVar, dhh.A);
    }

    public static final CharSequence O(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
            return charSequence;
        }
        return charSequence;
    }

    public static final String P(dhe dheVar) {
        List list;
        dhv dhvVar;
        if (dheVar != null) {
            dhn dhnVar = dhh.a;
            if (!dheVar.c.d(dhh.a)) {
                if (!dheVar.c.d(dhh.A) ? !((list = (List) dgz.a(dheVar.c, dhh.x)) == null || (dhvVar = (dhv) aqjn.Z(list)) == null) : (dhvVar = M(dheVar.c)) != null) {
                    return dhvVar.b;
                }
            } else {
                return dru.d((List) dheVar.c.a(dhh.a), ",", null, 62);
            }
        }
        return null;
    }

    private final List S(boolean z, List list) {
        int i;
        tx txVar = new tx((byte[]) null);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            T((dhe) list.get(i2), arrayList, txVar);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int z2 = aqjn.z(arrayList);
        if (z2 >= 0) {
            int i3 = 0;
            while (true) {
                dhe dheVar = (dhe) arrayList.get(i3);
                if (i3 != 0) {
                    float f = dheVar.c().c;
                    float f2 = dheVar.c().e;
                    int z3 = aqjn.z(arrayList2);
                    if (z3 >= 0) {
                        int i4 = 0;
                        while (true) {
                            cjp cjpVar = (cjp) ((armo) arrayList2.get(i4)).a;
                            float f3 = cjpVar.c;
                            float f4 = cjpVar.e;
                            if (f < f2 && f3 < f4 && Math.max(f, f3) < Math.min(f2, cjpVar.e)) {
                                arrayList2.set(i4, new armo(new cjp(Math.max(cjpVar.b, brg.a), Math.max(cjpVar.c, f), Math.min(cjpVar.d, Float.POSITIVE_INFINITY), Math.min(cjpVar.e, f2)), ((armo) arrayList2.get(i4)).b));
                                ((List) ((armo) arrayList2.get(i4)).b).add(dheVar);
                                i = 0;
                                break;
                            }
                            if (i4 == z3) {
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    i3 = 0;
                }
                i = 0;
                arrayList2.add(new armo(dheVar.c(), aqjn.D(dheVar)));
                if (i3 == z2) {
                    break;
                }
                i3++;
            }
        } else {
            i = 0;
        }
        aqjn.M(arrayList2, dee.a);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = this.N[!z ? 1 : 0];
        int size2 = arrayList2.size();
        for (int i5 = i; i5 < size2; i5++) {
            armo armoVar = (armo) arrayList2.get(i5);
            aqjn.M((List) armoVar.b, comparator);
            arrayList3.addAll((Collection) armoVar.b);
        }
        final arqv arqvVar = day.a;
        aqjn.M(arrayList3, new Comparator() { // from class: dao
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                tv tvVar = das.a;
                return ((Number) arqv.this.a(obj, obj2)).intValue();
            }
        });
        int i6 = i;
        while (i6 <= aqjn.z(arrayList3)) {
            List list2 = (List) txVar.a(((dhe) arrayList3.get(i6)).e);
            if (list2 != null) {
                if (!E((dhe) arrayList3.get(i6))) {
                    arrayList3.remove(i6);
                } else {
                    i6++;
                }
                arrayList3.addAll(i6, list2);
                i6 += list2.size();
            } else {
                i6++;
            }
        }
        return arrayList3;
    }

    private final void T(dhe dheVar, ArrayList arrayList, tx txVar) {
        boolean b2 = day.b(dheVar);
        dhn dhnVar = dhh.a;
        boolean booleanValue = ((Boolean) dheVar.c.b(dhh.m, dat.a)).booleanValue();
        if (booleanValue || E(dheVar)) {
            if (q().b(dheVar.e)) {
                arrayList.add(dheVar);
            }
            if (booleanValue) {
                txVar.f(dheVar.e, S(b2, dheVar.h()));
                return;
            }
        }
        List h = dheVar.h();
        int size = h.size();
        for (int i = 0; i < size; i++) {
            T((dhe) h.get(i), arrayList, txVar);
        }
    }

    private static final dhv U(dhe dheVar) {
        dhv dhvVar;
        dhv M = M(dheVar.c);
        dhn dhnVar = dhh.a;
        List list = (List) dgz.a(dheVar.c, dhh.x);
        if (list != null) {
            dhvVar = (dhv) aqjn.Z(list);
        } else {
            dhvVar = null;
        }
        if (M == null) {
            return dhvVar;
        }
        return M;
    }

    public static final float j(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            if (Math.abs(f) < Math.abs(f2)) {
                return f;
            }
            return f2;
        }
        return brg.a;
    }

    public final void A(int i) {
        int i2 = this.c;
        if (i2 == i) {
            return;
        }
        this.c = i;
        L(this, i, 128, null, 12);
        L(this, i2, 256, null, 12);
    }

    public final boolean B(boolean z, int i, long j) {
        dhn dhnVar;
        int i2;
        char c;
        dgw dgwVar;
        int i3;
        int i4 = 0;
        if (!d.F(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        tx q = q();
        if (!defpackage.a.bB(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
            if (z) {
                dhn dhnVar2 = dhh.a;
                dhnVar = dhh.r;
            } else {
                dhn dhnVar3 = dhh.a;
                dhnVar = dhh.q;
            }
            Object[] objArr = q.c;
            long[] jArr = q.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                boolean z2 = false;
                while (true) {
                    long j2 = jArr[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = i5 - length;
                        int i7 = i4;
                        while (true) {
                            i2 = 8 - ((~i6) >>> 31);
                            if (i7 >= i2) {
                                break;
                            }
                            if ((j2 & 255) < 128) {
                                ddw ddwVar = (ddw) objArr[(i5 << 3) + i7];
                                if (clv.d(ddwVar.b).g(j) && (dgwVar = (dgw) dgz.a(ddwVar.a.c, dhnVar)) != null) {
                                    boolean z3 = dgwVar.c;
                                    if (z3) {
                                        i3 = -i;
                                    } else {
                                        i3 = i;
                                    }
                                    if ((i != 0 || !z3) && i3 >= 0 ? ((Number) dgwVar.a.a()).floatValue() < ((Number) dgwVar.b.a()).floatValue() : ((Number) dgwVar.a.a()).floatValue() > brg.a) {
                                        c = '\b';
                                        z2 = true;
                                        j2 >>= c;
                                        i7++;
                                    }
                                }
                            }
                            c = '\b';
                            j2 >>= c;
                            i7++;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    i4 = 0;
                }
                return z2;
            }
        }
        return false;
    }

    public final boolean C(int i) {
        if (this.i == i) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        if (this.d.isEnabled() && !this.g.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean E(dhe dheVar) {
        String str;
        boolean z;
        dhn dhnVar = dhh.a;
        List list = (List) dgz.a(dheVar.c, dhh.a);
        if (list != null) {
            str = (String) aqjn.Z(list);
        } else {
            str = null;
        }
        if (str == null && U(dheVar) == null && s(dheVar) == null && !K(dheVar)) {
            z = false;
        } else {
            z = true;
        }
        if (ddx.f(dheVar)) {
            return false;
        }
        if (dheVar.c.a) {
            return true;
        }
        if (!dheVar.k() || !z) {
            return false;
        }
        return true;
    }

    public final boolean F() {
        if (!this.d.isEnabled() || !this.d.isTouchExplorationEnabled()) {
            return false;
        }
        return true;
    }

    public final boolean J(dhe dheVar, int i, int i2, boolean z) {
        String P;
        Integer num;
        Integer num2;
        dhn dhnVar = dgx.a;
        boolean z2 = false;
        if (dheVar.c.d(dgx.h) && day.a(dheVar)) {
            arqw arqwVar = (arqw) ((dgn) dheVar.c.a(dgx.h)).b;
            if (arqwVar != null) {
                return ((Boolean) arqwVar.a(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.p) && (P = P(dheVar)) != null) {
            if (i < 0 || i != i2 || i2 > P.length()) {
                i = -1;
            }
            this.p = i;
            if (P.length() > 0) {
                z2 = true;
            }
            int m = m(dheVar.e);
            Integer num3 = null;
            if (z2) {
                num = Integer.valueOf(this.p);
            } else {
                num = null;
            }
            if (z2) {
                num2 = Integer.valueOf(this.p);
            } else {
                num2 = null;
            }
            if (z2) {
                num3 = Integer.valueOf(P.length());
            }
            Q(p(m, num, num2, num3, P));
            y(dheVar.e);
            return true;
        }
        return false;
    }

    public final void N(int i, int i2, Integer num, List list) {
        if (i != Integer.MIN_VALUE && D()) {
            AccessibilityEvent o = o(i, i2);
            if (num != null) {
                o.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                o.setContentDescription(dru.d(list, ",", null, 62));
            }
            Q(o);
        }
    }

    public final void Q(AccessibilityEvent accessibilityEvent) {
        if (!D()) {
            return;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.m = true;
        }
        try {
            ((Boolean) this.G.a(accessibilityEvent)).booleanValue();
        } finally {
            this.m = false;
        }
    }

    @Override // defpackage.ecl
    public final ega a(View view) {
        return this.I;
    }

    public final int k(dhe dheVar) {
        dhn dhnVar = dhh.a;
        if (!dheVar.c.d(dhh.a) && dheVar.c.d(dhh.B)) {
            return djc.a(((djc) dheVar.c.a(dhh.B)).b);
        }
        return this.p;
    }

    public final int l(dhe dheVar) {
        dhn dhnVar = dhh.a;
        if (!dheVar.c.d(dhh.a) && dheVar.c.d(dhh.B)) {
            return djc.e(((djc) dheVar.c.a(dhh.B)).b);
        }
        return this.p;
    }

    public final int m(int i) {
        if (i == this.b.j.a().e) {
            return -1;
        }
        return i;
    }

    public final Rect n(ddw ddwVar) {
        Rect rect = ddwVar.b;
        float f = rect.left;
        float f2 = rect.top;
        long b2 = this.b.b((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        float f3 = rect.right;
        float f4 = rect.bottom;
        long b3 = this.b.b((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        return new Rect((int) Math.floor(Float.intBitsToFloat((int) (b2 >> 32))), (int) Math.floor(Float.intBitsToFloat((int) (b2 & 4294967295L))), (int) Math.ceil(Float.intBitsToFloat((int) (b3 >> 32))), (int) Math.ceil(Float.intBitsToFloat((int) (b3 & 4294967295L))));
    }

    public final AccessibilityEvent o(int i, int i2) {
        ddw ddwVar;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.b.getContext().getPackageName());
        obtain.setSource(this.b, i);
        if (D() && (ddwVar = (ddw) q().a(i)) != null) {
            dhn dhnVar = dhh.a;
            obtain.setPassword(ddwVar.a.c.d(dhh.F));
        }
        return obtain;
    }

    public final AccessibilityEvent p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent o = o(i, 8192);
        if (num != null) {
            o.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            o.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            o.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            o.getText().add(charSequence);
        }
        return o;
    }

    public final tx q() {
        dhe dheVar;
        if (this.r) {
            this.r = false;
            this.L = ddx.b(this.b.j);
            if (D()) {
                this.C.c();
                this.D.c();
                ddw ddwVar = (ddw) q().a(-1);
                if (ddwVar != null) {
                    dheVar = ddwVar.a;
                } else {
                    dheVar = null;
                }
                dheVar.getClass();
                List S = S(day.b(dheVar), aqjn.y(dheVar));
                int z = aqjn.z(S);
                if (z > 0) {
                    int i = 1;
                    while (true) {
                        int i2 = ((dhe) S.get(i - 1)).e;
                        int i3 = ((dhe) S.get(i)).e;
                        this.C.d(i2, i3);
                        this.D.d(i3, i2);
                        if (i == z) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:13:0x0055, B:17:0x0064, B:19:0x006c, B:21:0x0075, B:23:0x007c, B:25:0x008a, B:27:0x0098, B:31:0x00ac, B:34:0x00b3, B:36:0x00b7, B:40:0x00c2, B:42:0x00ca, B:43:0x00a4, B:44:0x00d7, B:48:0x014f, B:49:0x00de, B:51:0x00ec, B:55:0x0102, B:57:0x010a, B:59:0x012c, B:60:0x014c, B:64:0x0153, B:66:0x015a, B:67:0x0163, B:76:0x0041), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0180 -> B:13:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.das.r(arpe):java.lang.Object");
    }

    public final String s(dhe dheVar) {
        Collection collection;
        CharSequence charSequence;
        float floatValue;
        int u;
        dhn dhnVar = dhh.a;
        Object a2 = dgz.a(dheVar.c, dhh.b);
        dhs dhsVar = (dhs) dgz.a(dheVar.c, dhh.E);
        dgv dgvVar = (dgv) dgz.a(dheVar.c, dhh.u);
        Object obj = null;
        if (dhsVar != null) {
            int ordinal = dhsVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2 && a2 == null) {
                        a2 = this.b.getContext().getResources().getString(R.string.indeterminate);
                    }
                } else {
                    if (dgvVar != null) {
                        if (defpackage.a.bA(dgvVar.a, 2) && a2 == null) {
                            a2 = this.b.getContext().getResources().getString(R.string.state_off);
                        }
                    }
                    dgvVar = null;
                }
            } else {
                if (dgvVar != null) {
                    if (defpackage.a.bA(dgvVar.a, 2) && a2 == null) {
                        a2 = this.b.getContext().getResources().getString(R.string.state_on);
                    }
                }
                dgvVar = null;
            }
        }
        Boolean bool = (Boolean) dgz.a(dheVar.c, dhh.D);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((dgvVar == null || !defpackage.a.bA(dgvVar.a, 4)) && a2 == null) {
                if (booleanValue) {
                    a2 = this.b.getContext().getResources().getString(R.string.selected);
                } else {
                    a2 = this.b.getContext().getResources().getString(R.string.not_selected);
                }
            }
        }
        dgu dguVar = (dgu) dgz.a(dheVar.c, dhh.c);
        if (dguVar != null) {
            if (dguVar != dgu.a) {
                if (a2 == null) {
                    arsy arsyVar = dguVar.c;
                    if (((Number) arsyVar.b()).floatValue() - ((Number) arsyVar.c()).floatValue() == brg.a) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = (dguVar.b - ((Number) arsyVar.c()).floatValue()) / (((Number) arsyVar.b()).floatValue() - ((Number) arsyVar.c()).floatValue());
                    }
                    if (floatValue < brg.a) {
                        floatValue = 0.0f;
                    }
                    if (floatValue > 1.0f) {
                        floatValue = 1.0f;
                    }
                    if (floatValue == brg.a) {
                        u = 0;
                    } else if (floatValue == 1.0f) {
                        u = 100;
                    } else {
                        u = arrn.u(Math.round(floatValue * 100.0f), 1, 99);
                    }
                    a2 = this.b.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(u));
                }
            } else if (a2 == null) {
                a2 = this.b.getContext().getResources().getString(R.string.in_progress);
            }
        }
        if (dheVar.c.d(dhh.A)) {
            dgy e = dheVar.f().e();
            Collection collection2 = (Collection) dgz.a(e, dhh.a);
            if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) dgz.a(e, dhh.x)) == null || collection.isEmpty()) && ((charSequence = (CharSequence) dgz.a(e, dhh.A)) == null || charSequence.length() == 0))) {
                obj = this.b.getContext().getResources().getString(R.string.state_empty);
            }
        } else {
            obj = a2;
        }
        return (String) obj;
    }

    public final void t(int i, efx efxVar, String str, Bundle bundle) {
        dhe dheVar;
        int i2;
        cjp cjpVar;
        int i3;
        int i4;
        dhe dheVar2;
        das dasVar = this;
        ddw ddwVar = (ddw) q().a(i);
        if (ddwVar != null && (dheVar = ddwVar.a) != null) {
            String str2 = dasVar.t;
            String P = P(dheVar);
            if (d.F(str, str2)) {
                int e = dasVar.C.e(i);
                if (e != -1) {
                    efxVar.a().putInt(str, e);
                    return;
                }
                return;
            }
            if (d.F(str, dasVar.u)) {
                int e2 = dasVar.D.e(i);
                if (e2 != -1) {
                    efxVar.a().putInt(str, e2);
                    return;
                }
                return;
            }
            dgy dgyVar = dheVar.c;
            dhn dhnVar = dgx.a;
            if (dgyVar.d(dgx.a) && bundle != null && d.F(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i6 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i6 > 0 && i5 >= 0) {
                    if (P != null) {
                        i2 = P.length();
                    } else {
                        i2 = Integer.MAX_VALUE;
                    }
                    if (i5 < i2) {
                        diy d = ddx.d(dheVar.c);
                        if (d != null) {
                            ArrayList arrayList = new ArrayList();
                            int i7 = 0;
                            while (i7 < i6) {
                                int i8 = i5 + i7;
                                RectF rectF = null;
                                if (i8 >= d.a.a.a()) {
                                    arrayList.add(null);
                                    i3 = i5;
                                    i4 = i6;
                                    dheVar2 = dheVar;
                                } else {
                                    cjp f = d.l(i8).f(dheVar.a());
                                    cjp b2 = dheVar.b();
                                    if (f.h(b2)) {
                                        cjpVar = f.d(b2);
                                    } else {
                                        cjpVar = null;
                                    }
                                    if (cjpVar != null) {
                                        dai daiVar = dasVar.b;
                                        long floatToRawIntBits = Float.floatToRawIntBits(cjpVar.b);
                                        long floatToRawIntBits2 = Float.floatToRawIntBits(cjpVar.c);
                                        dai daiVar2 = dasVar.b;
                                        float f2 = cjpVar.d;
                                        long b3 = daiVar.b((floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L));
                                        long floatToRawIntBits3 = Float.floatToRawIntBits(f2);
                                        int floatToRawIntBits4 = Float.floatToRawIntBits(cjpVar.e);
                                        i3 = i5;
                                        long j = floatToRawIntBits4;
                                        i4 = i6;
                                        dheVar2 = dheVar;
                                        long b4 = daiVar2.b((j & 4294967295L) | (floatToRawIntBits3 << 32));
                                        rectF = new RectF(Float.intBitsToFloat((int) (b3 >> 32)), Float.intBitsToFloat((int) (b3 & 4294967295L)), Float.intBitsToFloat((int) (b4 >> 32)), Float.intBitsToFloat((int) (b4 & 4294967295L)));
                                    } else {
                                        i3 = i5;
                                        i4 = i6;
                                        dheVar2 = dheVar;
                                    }
                                    arrayList.add(rectF);
                                }
                                i7++;
                                dasVar = this;
                                i6 = i4;
                                dheVar = dheVar2;
                                i5 = i3;
                            }
                            efxVar.a().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                            return;
                        }
                        return;
                    }
                }
                Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                return;
            }
            dgy dgyVar2 = dheVar.c;
            dhn dhnVar2 = dhh.a;
            if (dgyVar2.d(dhh.v) && bundle != null && d.F(str, "androidx.compose.ui.semantics.testTag")) {
                String str3 = (String) dgz.a(dheVar.c, dhh.v);
                if (str3 != null) {
                    efxVar.a().putCharSequence(str, str3);
                    return;
                }
                return;
            }
            if (d.F(str, "androidx.compose.ui.semantics.id")) {
                efxVar.a().putInt(str, dheVar.e);
            }
        }
    }

    public final void u(cxn cxnVar) {
        if (this.J.add(cxnVar)) {
            this.K.c(arnb.a);
        }
    }

    public final void v(ddu dduVar) {
        if (!dduVar.J()) {
            return;
        }
        dai daiVar = this.b;
        daiVar.s.d(dduVar, this.O, new AnonymousClass4(dduVar, this));
    }

    public final void w(dhe dheVar, ddv ddvVar) {
        tz tzVar = new tz((byte[]) null);
        List i = dheVar.i();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            dhe dheVar2 = (dhe) i.get(i2);
            if (q().b(dheVar2.e)) {
                if (!ddvVar.b.a(dheVar2.e)) {
                    u(dheVar.b);
                    return;
                }
                tzVar.d(dheVar2.e);
            }
        }
        tz tzVar2 = ddvVar.b;
        int[] iArr = tzVar2.b;
        long[] jArr = tzVar2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 < i6) {
                            if ((255 & j) < 128 && !tzVar.a(iArr[(i3 << 3) + i5])) {
                                u(dheVar.b);
                                return;
                            } else {
                                j >>= 8;
                                i5++;
                            }
                        } else if (i6 != 8) {
                            break;
                        }
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List i7 = dheVar.i();
        int size2 = i7.size();
        for (int i8 = 0; i8 < size2; i8++) {
            dhe dheVar3 = (dhe) i7.get(i8);
            if (q().b(dheVar3.e)) {
                Object a2 = this.E.a(dheVar3.e);
                a2.getClass();
                w(dheVar3, (ddv) a2);
            }
        }
    }

    public final void x(int i, int i2, String str) {
        AccessibilityEvent o = o(m(i), 32);
        o.setContentChangeTypes(i2);
        if (str != null) {
            o.getText().add(str);
        }
        Q(o);
    }

    public final void y(int i) {
        b bVar = this.s;
        if (bVar != null) {
            if (i != bVar.a.e) {
                return;
            }
            if (SystemClock.uptimeMillis() - bVar.f <= 1000) {
                AccessibilityEvent o = o(m(bVar.a.e), 131072);
                o.setFromIndex(bVar.d);
                o.setToIndex(bVar.e);
                o.setAction(bVar.b);
                o.setMovementGranularity(bVar.c);
                o.getText().add(P(bVar.a));
                Q(o);
            }
        }
        this.s = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0162 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(defpackage.dhe r47, defpackage.efx r48) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.das.z(dhe, efx):void");
    }
}
