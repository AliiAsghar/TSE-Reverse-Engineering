package defpackage;

import defpackage.bwy;
import defpackage.cga;
import defpackage.cxt;
import defpackage.czb;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxn implements bwh, cve, czc, ctn, cwl, czb.a {
    public arqr A;
    public boolean B;
    public boolean C;
    private final boolean F;
    private int G;
    private final cyi H;
    private cbh I;
    private boolean J;
    private cxn K;
    private dgy L;
    private final cbh M;
    private boolean N;
    private cxe O;
    private c P;
    private cyn Q;
    private boolean R;
    private cga S;
    private cga T;
    public int d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public boolean j;
    public cxn k;
    public czb l;
    public drx m;
    public int n;
    public boolean o;
    public cue p;
    public dqv q;
    public drk r;
    public deo s;
    public bwy t;
    public c u;
    public boolean v;
    public final cyk w;
    public final cxt x;
    public ctt y;
    public arqr z;
    private static final b D = new b() { // from class: cxn.3
        @Override // defpackage.cue
        public final /* bridge */ /* synthetic */ cuf e(cuh cuhVar, List list, long j) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    };
    public static final arqg b = AnonymousClass1.a;
    private static final deo E = new deo() { // from class: cxn.2
        @Override // defpackage.deo
        public final /* synthetic */ float a() {
            return 16.0f;
        }

        @Override // defpackage.deo
        public final /* synthetic */ float b() {
            return 2.0f;
        }

        @Override // defpackage.deo
        public final /* synthetic */ float c() {
            return Float.MAX_VALUE;
        }

        @Override // defpackage.deo
        public final float d() {
            return 16.0f;
        }

        @Override // defpackage.deo
        public final long e() {
            return 300L;
        }

        @Override // defpackage.deo
        public final long f() {
            return 400L;
        }

        @Override // defpackage.deo
        public final long g() {
            return 0L;
        }

        @Override // defpackage.deo
        public final void h() {
        }
    };
    public static final Comparator c = new Comparator() { // from class: cxm
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            cxn cxnVar = (cxn) obj;
            cxn cxnVar2 = (cxn) obj2;
            arqg arqgVar = cxn.b;
            if (cxnVar.j() == cxnVar2.j()) {
                return arro.a(cxnVar.l(), cxnVar2.l());
            }
            return Float.compare(cxnVar.j(), cxnVar2.j());
        }
    };

    /* compiled from: PG */
    /* renamed from: cxn$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<cxn> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            return new cxn(false, 3, null);
        }
    }

    /* compiled from: PG */
    /* renamed from: cxn$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqg<arnb> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            cxn.this.x.d();
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cxn$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqg<arnb> {
        final /* synthetic */ arsb b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(arsb arsbVar) {
            super(0);
            this.b = arsbVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [cga$c] */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [cga$c] */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3, types: [cbh] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6, types: [cbh] */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            cyk cykVar = cxn.this.w;
            if ((cykVar.a() & 8) != 0) {
                for (cga.c cVar = cykVar.d; cVar != null; cVar = cVar.s) {
                    if ((cVar.q & 8) != 0) {
                        cwr cwrVar = cVar;
                        ?? r3 = 0;
                        while (cwrVar != 0) {
                            if (cwrVar instanceof czk) {
                                arsb arsbVar = this.b;
                                czk czkVar = (czk) cwrVar;
                                if (czkVar.dY()) {
                                    arsbVar.a = new dgy();
                                    ((dgy) arsbVar.a).b = true;
                                }
                                if (czkVar.dZ()) {
                                    ((dgy) arsbVar.a).a = true;
                                }
                                czkVar.dM((dgy) arsbVar.a);
                            } else if ((cwrVar.q & 8) != 0 && (cwrVar instanceof cwr)) {
                                cga.c cVar2 = cwrVar.B;
                                int i = 0;
                                cwrVar = cwrVar;
                                r3 = r3;
                                while (cVar2 != null) {
                                    if ((cVar2.q & 8) != 0) {
                                        i++;
                                        r3 = r3;
                                        if (i == 1) {
                                            cwrVar = cVar2;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new cbh(new cga.c[16]);
                                            }
                                            if (cwrVar != 0) {
                                                r3.n(cwrVar);
                                            }
                                            r3.n(cVar2);
                                            cwrVar = 0;
                                        }
                                    }
                                    cVar2 = cVar2.t;
                                    cwrVar = cwrVar;
                                    r3 = r3;
                                }
                                if (i != 1) {
                                }
                            }
                            cwrVar = cwp.a(r3);
                        }
                    }
                }
            }
            return arnb.a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        private static final /* synthetic */ a[] f;

        static {
            a aVar = new a("Measuring", 0);
            a = aVar;
            a aVar2 = new a("LookaheadMeasuring", 1);
            b = aVar2;
            a aVar3 = new a("LayingOut", 2);
            c = aVar3;
            a aVar4 = new a("LookaheadLayingOut", 3);
            d = aVar4;
            a aVar5 = new a("Idle", 4);
            e = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            f = aVarArr;
            arhi.f(aVarArr);
        }

        private a(String str, int i) {
        }

        public static a[] values() {
            return (a[]) f.clone();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public abstract class b implements cue {
        private final String a;

        public b(String str) {
            this.a = str;
        }

        @Override // defpackage.cue
        public final /* bridge */ /* synthetic */ int a(ctd ctdVar, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override // defpackage.cue
        public final /* bridge */ /* synthetic */ int b(ctd ctdVar, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override // defpackage.cue
        public final /* bridge */ /* synthetic */ int c(ctd ctdVar, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override // defpackage.cue
        public final /* bridge */ /* synthetic */ int d(ctd ctdVar, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class c {
        public static final c a;
        public static final c b;
        public static final c c;
        private static final /* synthetic */ c[] d;

        static {
            c cVar = new c("InMeasureBlock", 0);
            a = cVar;
            c cVar2 = new c("InLayoutBlock", 1);
            b = cVar2;
            c cVar3 = new c("NotUsed", 2);
            c = cVar3;
            c[] cVarArr = {cVar, cVar2, cVar3};
            d = cVarArr;
            arhi.f(cVarArr);
        }

        private c(String str, int i) {
        }

        public static c[] values() {
            return (c[]) d.clone();
        }
    }

    public cxn() {
        this(false, 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00aa, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ab, code lost:
    
        if (r2 >= r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ad, code lost:
    
        if (r8 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00af, code lost:
    
        if (r5 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:
    
        r6.g(r2, r8, r9, r5, !r6.a.ah());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
    
        defpackage.csg.a("structuralUpdate requires a non-null tail");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ce, code lost:
    
        throw new defpackage.armj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cf, code lost:
    
        defpackage.csg.a("expected prior modifier list to be non-empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d7, code lost:
    
        throw new defpackage.armj();
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void aA(defpackage.cga r14) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxn.aA(cga):void");
    }

    private final void aB() {
        cxn cxnVar;
        if (this.G > 0) {
            this.J = true;
        }
        if (this.F && (cxnVar = this.K) != null) {
            cxnVar.aB();
        }
    }

    private final void aC(cxn cxnVar) {
        if (cxnVar.x.n > 0) {
            this.x.i(r0.n - 1);
        }
        if (this.l != null) {
            cxnVar.I();
        }
        cxnVar.K = null;
        cxnVar.y().v = null;
        if (cxnVar.F) {
            this.G--;
            cbh cbhVar = cxnVar.H.a;
            int i = cbhVar.b;
            if (i > 0) {
                Object[] objArr = cbhVar.a;
                int i2 = 0;
                do {
                    ((cxn) objArr[i2]).y().v = null;
                    i2++;
                } while (i2 < i);
            }
        }
        aB();
        W();
    }

    private final void aD() {
        P();
        cxn t = t();
        if (t != null) {
            t.N();
        }
        O();
    }

    private final void aE() {
        cyk cykVar = this.w;
        for (cga.c cVar = cykVar.d; cVar != null; cVar = cVar.s) {
            if (cVar.z) {
                cVar.E();
            }
        }
        cykVar.f();
        cykVar.c();
    }

    private final void aF(cxn cxnVar) {
        if (!d.F(cxnVar, this.k)) {
            this.k = cxnVar;
            if (cxnVar != null) {
                cxt cxtVar = this.x;
                if (cxtVar.s == null) {
                    cxtVar.s = new cxt.a(cxtVar);
                }
                cyn cynVar = x().u;
                for (cyn y = y(); !d.F(y, cynVar) && y != null; y = y.u) {
                    y.A();
                }
            }
            P();
        }
    }

    public static /* synthetic */ void au(cxn cxnVar, boolean z, int i) {
        boolean z2;
        cxn t;
        if (cxnVar.k == null) {
            csg.c("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        czb czbVar = cxnVar.l;
        if (czbVar != null && !cxnVar.o && !cxnVar.F) {
            int i2 = i & 2;
            int i3 = i & 1;
            int i4 = i & 4;
            boolean z3 = false;
            if (i2 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (1 == ((z ? 1 : 0) & (i3 ^ 1))) {
                z3 = true;
            }
            czbVar.u(cxnVar, true, z3, z2);
            if (i4 != 0) {
                cxt.a v = cxnVar.v();
                v.getClass();
                cxn cxnVar2 = v.x.a;
                cxn t2 = cxnVar2.t();
                c cVar = cxnVar2.u;
                if (t2 != null && cVar != c.c) {
                    while (t2.u == cVar && (t = t2.t()) != null) {
                        t2 = t;
                    }
                    a aVar = a.a;
                    int ordinal = cVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            if (t2.k != null) {
                                t2.aa(z3);
                                return;
                            } else {
                                t2.ab(z3);
                                return;
                            }
                        }
                        throw new IllegalStateException("Intrinsics isn't used by the parent");
                    }
                    if (t2.k != null) {
                        au(t2, z3, 6);
                    } else {
                        aw(t2, z3, 6);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void aw(cxn cxnVar, boolean z, int i) {
        czb czbVar;
        boolean z2;
        boolean z3;
        cxn t;
        if (!cxnVar.o && !cxnVar.F && (czbVar = cxnVar.l) != null) {
            int i2 = i & 2;
            int i3 = i & 1;
            int i4 = i & 4;
            if (i2 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (1 != ((z ? 1 : 0) & (i3 ^ 1))) {
                z3 = false;
            } else {
                z3 = true;
            }
            czbVar.u(cxnVar, false, z3, z2);
            if (i4 != 0) {
                cxn cxnVar2 = cxnVar.w().D.a;
                cxn t2 = cxnVar2.t();
                c cVar = cxnVar2.u;
                if (t2 != null && cVar != c.c) {
                    while (t2.u == cVar && (t = t2.t()) != null) {
                        t2 = t;
                    }
                    a aVar = a.a;
                    int ordinal = cVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            t2.ab(z3);
                            return;
                        }
                        throw new IllegalStateException("Intrinsics isn't used by the parent");
                    }
                    aw(t2, z3, 6);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String az(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        cbh o = o();
        int i3 = o.b;
        if (i3 > 0) {
            Object[] objArr = o.a;
            int i4 = 0;
            do {
                sb.append(((cxn) objArr[i4]).az(i + 1));
                i4++;
            } while (i4 < i3);
        }
        String sb2 = sb.toString();
        if (i == 0) {
            String substring = sb2.substring(0, sb2.length() - 1);
            substring.getClass();
            return substring;
        }
        return sb2;
    }

    public final Boolean A() {
        cxt.a v = v();
        if (v != null) {
            return Boolean.valueOf(v.p);
        }
        return null;
    }

    public final List B() {
        cxt.a v = v();
        v.getClass();
        v.x.a.D();
        if (!v.s) {
            return v.r.e();
        }
        cxt cxtVar = v.x;
        cbh cbhVar = v.r;
        cxn cxnVar = cxtVar.a;
        cbh o = cxnVar.o();
        int i = o.b;
        if (i > 0) {
            Object[] objArr = o.a;
            int i2 = 0;
            do {
                cxn cxnVar2 = (cxn) objArr[i2];
                if (cbhVar.b <= i2) {
                    cxt.a aVar = cxnVar2.x.s;
                    aVar.getClass();
                    cbhVar.n(aVar);
                } else {
                    cxt.a aVar2 = cxnVar2.x.s;
                    aVar2.getClass();
                    cbhVar.d(i2, aVar2);
                }
                i2++;
            } while (i2 < i);
        }
        cbhVar.i(cxnVar.D().size(), cbhVar.b);
        v.s = false;
        return v.r.e();
    }

    public final List C() {
        return w().o();
    }

    public final List D() {
        return o().e();
    }

    public final List E() {
        return this.H.a.e();
    }

    public final void F(czb czbVar) {
        cyn cynVar;
        int i;
        cxn cxnVar;
        czb czbVar2;
        String str;
        if (this.l != null) {
            csg.c("Cannot attach " + this + " as it already is attached.  Tree: " + az(0));
        }
        cxn cxnVar2 = this.K;
        if (cxnVar2 != null && !d.F(cxnVar2.l, czbVar)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(czbVar);
            sb.append(") than the parent's owner(");
            cxn t = t();
            if (t != null) {
                czbVar2 = t.l;
            } else {
                czbVar2 = null;
            }
            sb.append(czbVar2);
            sb.append("). This tree: ");
            sb.append(az(0));
            sb.append(" Parent tree: ");
            cxn cxnVar3 = this.K;
            if (cxnVar3 != null) {
                str = cxnVar3.az(0);
            } else {
                str = null;
            }
            sb.append(str);
            csg.c(sb.toString());
        }
        cxn t2 = t();
        if (t2 == null) {
            w().s = true;
            cxt.a v = v();
            if (v != null) {
                v.p = true;
            }
        }
        cyn y = y();
        if (t2 != null) {
            cynVar = t2.x();
        } else {
            cynVar = null;
        }
        y.v = cynVar;
        this.l = czbVar;
        if (t2 != null) {
            i = t2.n;
        } else {
            i = -1;
        }
        this.n = i + 1;
        cga cgaVar = this.T;
        if (cgaVar != null) {
            aA(cgaVar);
        }
        this.T = null;
        if (this.w.j(8)) {
            Q();
        }
        if (this.j) {
            aF(this);
        } else {
            cxn cxnVar4 = this.K;
            if (cxnVar4 == null || (cxnVar = cxnVar4.k) == null) {
                cxnVar = this.k;
            }
            aF(cxnVar);
            if (this.k == null && this.w.j(512)) {
                aF(this);
            }
        }
        if (!this.C) {
            this.w.b();
        }
        cbh cbhVar = this.H.a;
        int i2 = cbhVar.b;
        if (i2 > 0) {
            Object[] objArr = cbhVar.a;
            int i3 = 0;
            do {
                ((cxn) objArr[i3]).F(czbVar);
                i3++;
            } while (i3 < i2);
        }
        if (!this.C) {
            this.w.e();
        }
        P();
        if (t2 != null) {
            t2.P();
        }
        cyn cynVar2 = x().u;
        for (cyn y2 = y(); !d.F(y2, cynVar2) && y2 != null; y2 = y2.u) {
            y2.ap(y2.w, true);
            cyz cyzVar = y2.C;
            if (cyzVar != null) {
                cyzVar.invalidate();
            }
        }
        arqr arqrVar = this.z;
        if (arqrVar != null) {
            arqrVar.a(czbVar);
        }
        this.x.o();
    }

    public final void G() {
        this.P = this.u;
        this.u = c.c;
        cbh o = o();
        int i = o.b;
        if (i > 0) {
            Object[] objArr = o.a;
            int i2 = 0;
            do {
                cxn cxnVar = (cxn) objArr[i2];
                if (cxnVar.u != c.c) {
                    cxnVar.G();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void H() {
        this.P = this.u;
        this.u = c.c;
        cbh o = o();
        int i = o.b;
        if (i > 0) {
            Object[] objArr = o.a;
            int i2 = 0;
            do {
                cxn cxnVar = (cxn) objArr[i2];
                if (cxnVar.u == c.b) {
                    cxnVar.H();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void I() {
        cwe cweVar;
        czb czbVar = this.l;
        String str = null;
        if (czbVar == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            cxn t = t();
            if (t != null) {
                str = t.az(0);
            }
            sb.append(str);
            csg.a(sb.toString());
            throw new armj();
        }
        cxn t2 = t();
        if (t2 != null) {
            t2.N();
            t2.P();
            w().k = c.c;
            cxt.a v = v();
            if (v != null) {
                v.i = c.c;
            }
        }
        cxt cxtVar = this.x;
        cxtVar.r.u.h();
        cxt.a aVar = cxtVar.s;
        if (aVar != null && (cweVar = aVar.q) != null) {
            cweVar.h();
        }
        arqr arqrVar = this.A;
        if (arqrVar != null) {
            arqrVar.a(czbVar);
        }
        if (this.w.j(8)) {
            Q();
        }
        this.w.f();
        this.o = true;
        cbh cbhVar = this.H.a;
        int i = cbhVar.b;
        if (i > 0) {
            Object[] objArr = cbhVar.a;
            int i2 = 0;
            do {
                ((cxn) objArr[i2]).I();
                i2++;
            } while (i2 < i);
        }
        this.o = false;
        this.w.c();
        dai daiVar = (dai) czbVar;
        cyd cydVar = daiVar.v;
        cydVar.b.e(this);
        cydVar.e.a.m(this);
        daiVar.I();
        daiVar.O.e(this);
        this.l = null;
        aF(null);
        this.n = 0;
        cxt.b w = w();
        w.h = Integer.MAX_VALUE;
        w.g = Integer.MAX_VALUE;
        w.s = false;
        cxt.a v2 = v();
        if (v2 != null) {
            v2.h = Integer.MAX_VALUE;
            v2.g = Integer.MAX_VALUE;
            v2.p = false;
        }
    }

    @Override // defpackage.czc
    public final boolean J() {
        return am();
    }

    public final void K(ckr ckrVar, cof cofVar) {
        y().aa(ckrVar, cofVar);
    }

    public final void L(long j, cxa cxaVar, boolean z, boolean z2) {
        cyn y = y();
        arqr arqrVar = cyn.n;
        y().ad(cyn.p, y.as(j), cxaVar, z, z2);
    }

    public final void M(int i, cxn cxnVar) {
        String str;
        if (cxnVar.K != null) {
            StringBuilder sb = new StringBuilder("Cannot insert ");
            sb.append(cxnVar);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(az(0));
            sb.append(" Other tree: ");
            cxn cxnVar2 = cxnVar.K;
            if (cxnVar2 != null) {
                str = cxnVar2.az(0);
            } else {
                str = null;
            }
            sb.append(str);
            csg.c(sb.toString());
        }
        if (cxnVar.l != null) {
            csg.c("Cannot insert " + cxnVar + " because it already has an owner. This tree: " + az(0) + " Other tree: " + cxnVar.az(0));
        }
        cxnVar.K = this;
        this.H.b(i, cxnVar);
        W();
        if (cxnVar.F) {
            this.G++;
        }
        aB();
        czb czbVar = this.l;
        if (czbVar != null) {
            cxnVar.F(czbVar);
        }
        if (cxnVar.x.n > 0) {
            cxt cxtVar = this.x;
            cxtVar.i(cxtVar.n + 1);
        }
    }

    public final void N() {
        cyz cyzVar;
        if (this.R) {
            cyn x = x();
            cyn cynVar = y().v;
            this.Q = null;
            while (true) {
                if (d.F(x, cynVar)) {
                    break;
                }
                if (x != null) {
                    cyzVar = x.C;
                } else {
                    cyzVar = null;
                }
                if (cyzVar != null) {
                    this.Q = x;
                    break;
                } else if (x != null) {
                    x = x.v;
                } else {
                    x = null;
                }
            }
        }
        cyn cynVar2 = this.Q;
        if (cynVar2 != null && cynVar2.C == null) {
            csg.a("layer was not set");
            throw new armj();
        }
        if (cynVar2 != null) {
            cynVar2.ae();
            return;
        }
        cxn t = t();
        if (t != null) {
            t.N();
        }
    }

    public final void O() {
        cyn x = x();
        for (cyn y = y(); y != x; y = y.u) {
            y.getClass();
            cyz cyzVar = ((cxj) y).C;
            if (cyzVar != null) {
                cyzVar.invalidate();
            }
        }
        cyz cyzVar2 = x().C;
        if (cyzVar2 != null) {
            cyzVar2.invalidate();
        }
    }

    public final void P() {
        this.h = true;
        if (this.k != null) {
            au(this, false, 7);
        } else {
            aw(this, false, 7);
        }
    }

    public final void Q() {
        this.L = null;
        cxq.a(this).w();
    }

    public final void R() {
        cxn t;
        if (this.u == c.c) {
            H();
        }
        cxt.a v = v();
        v.getClass();
        try {
            v.f = true;
            if (!v.k) {
                csg.c("replace() called on item that was not placed");
            }
            v.w = false;
            boolean z = v.p;
            v.y(v.m, v.n, v.o);
            if (z && !v.w && (t = v.x.a.t()) != null) {
                t.aa(false);
            }
        } finally {
            v.f = false;
        }
    }

    public final void S() {
        this.x.e();
    }

    public final void T() {
        this.x.g = true;
    }

    public final void U() {
        this.x.g();
    }

    public final void V(int i, int i2, int i3) {
        int i4;
        if (i != i2) {
            for (int i5 = 0; i5 < i3; i5++) {
                if (i > i2) {
                    i4 = i + i5;
                } else {
                    i4 = i;
                }
                this.H.b(i > i2 ? i2 + i5 : (i2 + i3) - 2, (cxn) this.H.a(i4));
            }
            W();
            aB();
            P();
        }
    }

    public final void W() {
        if (this.F) {
            cxn t = t();
            if (t != null) {
                t.W();
                return;
            }
            return;
        }
        this.N = true;
    }

    public final void X() {
        int i = this.H.a.b;
        while (true) {
            i--;
            if (i >= 0) {
                aC((cxn) this.H.a.a[i]);
            } else {
                cyi cyiVar = this.H;
                cyiVar.a.g();
                cyiVar.b.a();
                return;
            }
        }
    }

    public final void Y(int i, int i2) {
        if (i2 < 0) {
            csg.b(defpackage.a.cb(i2, "count (", ") must be greater than 0"));
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            aC((cxn) this.H.a.a[i3]);
            if (i3 != i) {
                i3--;
            } else {
                return;
            }
        }
    }

    public final void Z() {
        cxn t;
        if (this.u == c.c) {
            H();
        }
        cxt.b w = w();
        try {
            w.f = true;
            if (!w.j) {
                csg.c("replace called on unplaced item");
            }
            boolean z = w.s;
            w.y(w.m, w.p, w.n, w.o);
            if (z && !w.y && (t = w.D.a.t()) != null) {
                t.ab(false);
            }
        } finally {
            w.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [cbh] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [cbh] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // czb.a
    public final void a() {
        cga.c cVar;
        cyn x = x();
        boolean h = cyp.h(128);
        if (h) {
            cVar = ((cxc) x).f;
        } else {
            cVar = ((cxc) x).f.s;
            if (cVar == null) {
                return;
            }
        }
        for (cga.c V = x.V(h); V != null && (V.r & 128) != 0; V = V.t) {
            if ((V.q & 128) != 0) {
                cwr cwrVar = V;
                ?? r5 = 0;
                while (cwrVar != 0) {
                    if (cwrVar instanceof cxg) {
                        ((cxg) cwrVar).dW(x());
                    } else if ((cwrVar.q & 128) != 0 && (cwrVar instanceof cwr)) {
                        cga.c cVar2 = cwrVar.B;
                        int i = 0;
                        cwrVar = cwrVar;
                        r5 = r5;
                        while (cVar2 != null) {
                            if ((cVar2.q & 128) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    cwrVar = cVar2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new cbh(new cga.c[16]);
                                    }
                                    if (cwrVar != 0) {
                                        r5.n(cwrVar);
                                    }
                                    r5.n(cVar2);
                                    cwrVar = 0;
                                }
                            }
                            cVar2 = cVar2.t;
                            cwrVar = cwrVar;
                            r5 = r5;
                        }
                        if (i != 1) {
                        }
                    }
                    cwrVar = cwp.a(r5);
                }
            }
            if (V == cVar) {
                return;
            }
        }
    }

    public final void aa(boolean z) {
        czb czbVar;
        if (!this.F && (czbVar = this.l) != null) {
            czbVar.v(this, true, z);
        }
    }

    public final void ab(boolean z) {
        czb czbVar;
        this.h = true;
        if (!this.F && (czbVar = this.l) != null) {
            czbVar.v(this, false, z);
        }
    }

    public final void ac(cxn cxnVar) {
        a q = cxnVar.q();
        a aVar = a.a;
        if (q.ordinal() == 4) {
            if (cxnVar.ak()) {
                au(cxnVar, true, 6);
                return;
            }
            if (cxnVar.aj()) {
                cxnVar.aa(true);
            }
            if (cxnVar.al()) {
                aw(cxnVar, true, 6);
                return;
            } else {
                if (cxnVar.ai()) {
                    cxnVar.ab(true);
                    return;
                }
                return;
            }
        }
        a q2 = cxnVar.q();
        Objects.toString(q2);
        throw new IllegalStateException("Unexpected state ".concat(String.valueOf(q2)));
    }

    public final void ad() {
        cbh o = o();
        int i = o.b;
        if (i > 0) {
            Object[] objArr = o.a;
            int i2 = 0;
            do {
                cxn cxnVar = (cxn) objArr[i2];
                c cVar = cxnVar.P;
                cxnVar.u = cVar;
                if (cVar != c.c) {
                    cxnVar.ad();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void ae(dqv dqvVar) {
        if (!d.F(this.q, dqvVar)) {
            this.q = dqvVar;
            aD();
            for (cga.c cVar = this.w.e; cVar != null; cVar = cVar.t) {
                if ((cVar.q & 16) != 0) {
                    ((czi) cVar).dS();
                } else if (cVar instanceof chf) {
                    ((chf) cVar).b();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [cbh] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [cbh] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void af(deo deoVar) {
        if (!d.F(this.s, deoVar)) {
            this.s = deoVar;
            cyk cykVar = this.w;
            if ((cykVar.a() & 16) != 0) {
                for (cga.c cVar = cykVar.e; cVar != null; cVar = cVar.t) {
                    if ((cVar.q & 16) != 0) {
                        cwr cwrVar = cVar;
                        ?? r3 = 0;
                        while (cwrVar != 0) {
                            if (cwrVar instanceof czi) {
                                ((czi) cwrVar).dU();
                            } else if ((cwrVar.q & 16) != 0 && (cwrVar instanceof cwr)) {
                                cga.c cVar2 = cwrVar.B;
                                int i = 0;
                                cwrVar = cwrVar;
                                r3 = r3;
                                while (cVar2 != null) {
                                    if ((cVar2.q & 16) != 0) {
                                        i++;
                                        r3 = r3;
                                        if (i == 1) {
                                            cwrVar = cVar2;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new cbh(new cga.c[16]);
                                            }
                                            if (cwrVar != 0) {
                                                r3.n(cwrVar);
                                            }
                                            r3.n(cVar2);
                                            cwrVar = 0;
                                        }
                                    }
                                    cVar2 = cVar2.t;
                                    cwrVar = cwrVar;
                                    r3 = r3;
                                }
                                if (i != 1) {
                                }
                            }
                            cwrVar = cwp.a(r3);
                        }
                    }
                    if ((cVar.r & 16) == 0) {
                        return;
                    }
                }
            }
        }
    }

    public final void ag() {
        if (this.G > 0 && this.J) {
            int i = 0;
            this.J = false;
            cbh cbhVar = this.I;
            if (cbhVar == null) {
                cbhVar = new cbh(new cxn[16]);
                this.I = cbhVar;
            }
            cbhVar.g();
            cbh cbhVar2 = this.H.a;
            int i2 = cbhVar2.b;
            if (i2 > 0) {
                Object[] objArr = cbhVar2.a;
                do {
                    cxn cxnVar = (cxn) objArr[i];
                    if (cxnVar.F) {
                        cbhVar.o(cbhVar.b, cxnVar.o());
                    } else {
                        cbhVar.n(cxnVar);
                    }
                    i++;
                } while (i < i2);
            }
            this.x.d();
        }
    }

    public final boolean ah() {
        if (this.T != null) {
            return true;
        }
        return false;
    }

    public final boolean ai() {
        return this.x.e;
    }

    public final boolean aj() {
        return this.x.h;
    }

    public final boolean ak() {
        return this.x.g;
    }

    public final boolean al() {
        return this.x.d;
    }

    public final boolean am() {
        if (this.l != null) {
            return true;
        }
        return false;
    }

    public final boolean an() {
        return w().t;
    }

    public final boolean ao(dqs dqsVar) {
        if (dqsVar != null && this.k != null) {
            cxt.a v = v();
            v.getClass();
            return v.s(dqsVar.a);
        }
        return false;
    }

    public final boolean ap(dqs dqsVar) {
        if (dqsVar != null) {
            if (this.u == c.c) {
                G();
            }
            return w().z(dqsVar.a);
        }
        return false;
    }

    public final void ar(long j, cxa cxaVar, boolean z) {
        cyn y = y();
        arqr arqrVar = cyn.n;
        y().ad(cyn.q, y.as(j), cxaVar, true, z);
    }

    public final void ax() {
        this.R = true;
    }

    public final void ay() {
        this.h = false;
    }

    @Override // defpackage.bwh
    public final void b() {
        drx drxVar = this.m;
        if (drxVar != null) {
            drxVar.b();
        }
        ctt cttVar = this.y;
        if (cttVar != null) {
            cttVar.b();
        }
        this.C = true;
        aE();
        if (am()) {
            Q();
        }
        czb czbVar = this.l;
        if (czbVar != null) {
            ((dai) czbVar).O.e(this);
        }
    }

    @Override // defpackage.bwh
    public final void c() {
        drx drxVar = this.m;
        if (drxVar != null) {
            drxVar.c();
        }
        ctt cttVar = this.y;
        if (cttVar != null) {
            cttVar.g();
        }
        cyn cynVar = x().u;
        for (cyn y = y(); !d.F(y, cynVar) && y != null; y = y.u) {
            y.aj();
        }
    }

    @Override // defpackage.bwh
    public final void d() {
        if (!am()) {
            csg.b("onReuse is only expected on attached node");
        }
        drx drxVar = this.m;
        if (drxVar != null) {
            drxVar.d();
        }
        ctt cttVar = this.y;
        if (cttVar != null) {
            cttVar.d();
        }
        if (this.C) {
            this.C = false;
            Q();
        } else {
            aE();
        }
        this.d = dhb.a();
        this.w.b();
        this.w.e();
        ac(this);
    }

    @Override // defpackage.cve
    public final void e() {
        if (this.k != null) {
            au(this, false, 5);
        } else {
            aw(this, false, 5);
        }
        dqs b2 = this.x.b();
        if (b2 != null) {
            czb czbVar = this.l;
            if (czbVar != null) {
                czbVar.r(this, b2.a);
                return;
            }
            return;
        }
        czb czbVar2 = this.l;
        if (czbVar2 != null) {
            cza.b(czbVar2);
        }
    }

    @Override // defpackage.ctn
    public final boolean ew() {
        return w().s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [cbh] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [cbh] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v3, types: [cbh] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [cbh] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.cwl
    public final void f(bwy bwyVar) {
        this.t = bwyVar;
        ae((dqv) bwyVar.b(dch.d));
        drk drkVar = (drk) bwyVar.b(dch.i);
        if (this.r != drkVar) {
            this.r = drkVar;
            aD();
            cyk cykVar = this.w;
            if ((cykVar.a() & 4) != 0) {
                for (cga.c cVar = cykVar.e; cVar != null; cVar = cVar.t) {
                    if ((cVar.q & 4) != 0) {
                        cwr cwrVar = cVar;
                        ?? r6 = 0;
                        while (cwrVar != 0) {
                            if (cwrVar instanceof cwx) {
                                cwx cwxVar = (cwx) cwrVar;
                                if (cwxVar instanceof chf) {
                                    ((chf) cwxVar).b();
                                }
                            } else if ((cwrVar.q & 4) != 0 && (cwrVar instanceof cwr)) {
                                cga.c cVar2 = cwrVar.B;
                                int i = 0;
                                cwrVar = cwrVar;
                                r6 = r6;
                                while (cVar2 != null) {
                                    if ((cVar2.q & 4) != 0) {
                                        i++;
                                        r6 = r6;
                                        if (i == 1) {
                                            cwrVar = cVar2;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new cbh(new cga.c[16]);
                                            }
                                            if (cwrVar != 0) {
                                                r6.n(cwrVar);
                                            }
                                            r6.n(cVar2);
                                            cwrVar = 0;
                                        }
                                    }
                                    cVar2 = cVar2.t;
                                    cwrVar = cwrVar;
                                    r6 = r6;
                                }
                                if (i != 1) {
                                }
                            }
                            cwrVar = cwp.a(r6);
                        }
                    }
                    if ((cVar.r & 4) == 0) {
                        break;
                    }
                }
            }
        }
        af((deo) bwyVar.b(dch.m));
        cyk cykVar2 = this.w;
        if ((cykVar2.a() & 32768) != 0) {
            for (cga.c cVar3 = cykVar2.e; cVar3 != null; cVar3 = cVar3.t) {
                if ((cVar3.q & 32768) != 0) {
                    cwr cwrVar2 = cVar3;
                    ?? r62 = 0;
                    while (cwrVar2 != 0) {
                        if (cwrVar2 instanceof cwm) {
                            cga.c A = ((cwm) cwrVar2).A();
                            if (A.z) {
                                cyp.g(A);
                            } else {
                                A.x = true;
                            }
                        } else if ((cwrVar2.q & 32768) != 0 && (cwrVar2 instanceof cwr)) {
                            cga.c cVar4 = cwrVar2.B;
                            int i2 = 0;
                            cwrVar2 = cwrVar2;
                            r62 = r62;
                            while (cVar4 != null) {
                                if ((cVar4.q & 32768) != 0) {
                                    i2++;
                                    r62 = r62;
                                    if (i2 == 1) {
                                        cwrVar2 = cVar4;
                                    } else {
                                        if (r62 == 0) {
                                            r62 = new cbh(new cga.c[16]);
                                        }
                                        if (cwrVar2 != 0) {
                                            r62.n(cwrVar2);
                                        }
                                        r62.n(cVar4);
                                        cwrVar2 = 0;
                                    }
                                }
                                cVar4 = cVar4.t;
                                cwrVar2 = cwrVar2;
                                r62 = r62;
                            }
                            if (i2 != 1) {
                            }
                        }
                        cwrVar2 = cwp.a(r62);
                    }
                }
                if ((cVar3.r & 32768) == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.cwl
    public final void g(cue cueVar) {
        if (!d.F(this.p, cueVar)) {
            this.p = cueVar;
            cxe cxeVar = this.O;
            if (cxeVar != null) {
                cxeVar.b.h(cueVar);
            }
            P();
        }
    }

    @Override // defpackage.cwl
    public final void h(cga cgaVar) {
        if (this.F && this.S != cga.e) {
            csg.b("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.C) {
            csg.b("modifier is updated when deactivated");
        }
        if (am()) {
            aA(cgaVar);
        } else {
            this.T = cgaVar;
        }
    }

    public final float j() {
        return w().x;
    }

    public final int k() {
        return this.x.r.b;
    }

    public final int l() {
        return w().h;
    }

    public final int m() {
        return this.x.r.a;
    }

    public final cbh n() {
        if (this.N) {
            this.M.g();
            cbh cbhVar = this.M;
            cbhVar.o(cbhVar.b, o());
            this.M.j(c);
            this.N = false;
        }
        return this.M;
    }

    public final cbh o() {
        ag();
        if (this.G == 0) {
            return this.H.a;
        }
        cbh cbhVar = this.I;
        cbhVar.getClass();
        return cbhVar;
    }

    public final cxe p() {
        cxe cxeVar = this.O;
        if (cxeVar == null) {
            cxe cxeVar2 = new cxe(this, this.p);
            this.O = cxeVar2;
            return cxeVar2;
        }
        return cxeVar;
    }

    public final a q() {
        return this.x.c;
    }

    public final c r() {
        return w().k;
    }

    public final c s() {
        c cVar;
        cxt.a v = v();
        if (v != null && (cVar = v.i) != null) {
            return cVar;
        }
        return c.c;
    }

    public final cxn t() {
        cxn cxnVar = this.K;
        while (cxnVar != null && cxnVar.F) {
            cxnVar = cxnVar.K;
        }
        return cxnVar;
    }

    public final String toString() {
        return ddd.a(this) + " children: " + D().size() + " measurePolicy: " + this.p;
    }

    public final cxp u() {
        return ((dai) cxq.a(this)).c;
    }

    public final cxt.a v() {
        return this.x.s;
    }

    public final cxt.b w() {
        return this.x.r;
    }

    public final cyn x() {
        return this.w.b;
    }

    public final cyn y() {
        return this.w.c;
    }

    public final dgy z() {
        if (am() && !this.C) {
            if (this.w.j(8) && this.L == null) {
                arsb arsbVar = new arsb();
                arsbVar.a = new dgy();
                cze czeVar = ((dai) cxq.a(this)).s;
                czeVar.d(this, czeVar.b, new AnonymousClass5(arsbVar));
                dgy dgyVar = (dgy) arsbVar.a;
                this.L = dgyVar;
                return dgyVar;
            }
            return this.L;
        }
        return null;
    }

    public cxn(boolean z, int i) {
        this.F = z;
        this.d = i;
        this.e = 9223372034707292159L;
        this.f = 0L;
        this.g = 9223372034707292159L;
        this.h = true;
        this.H = new cyi(new cbh(new cxn[16]), new AnonymousClass4());
        this.M = new cbh(new cxn[16]);
        this.N = true;
        this.p = D;
        this.q = cxq.a;
        this.r = drk.a;
        this.s = E;
        int i2 = bwy.eZ;
        this.t = bwy.a.a;
        this.u = c.c;
        this.P = c.c;
        this.w = new cyk(this);
        this.x = new cxt(this);
        this.R = true;
        this.S = cga.e;
    }

    public /* synthetic */ cxn(boolean z, int i, byte[] bArr) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), dhb.a());
    }

    @Override // defpackage.cwl
    public final void i() {
    }
}
