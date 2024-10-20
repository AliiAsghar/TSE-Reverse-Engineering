package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.bzf;
import defpackage.cae;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cbb {
    public final int b;
    public final int c;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a extends cbb {
        public static final a a = new a();

        private a() {
            super(1, 0, 2);
        }

        @Override // defpackage.cbb
        public final String a(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "distance";
            }
            return super.a(i);
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            caeVar.x(cbcVar.a(0));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class aa extends cbb {
        public static final aa a = new aa();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private aa() {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cbb.aa.<init>():void");
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            caeVar.J();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class ab extends cbb {
        public static final ab a = new ab();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private ab() {
            /*
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cbb.ab.<init>():void");
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "scope";
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class ac extends cbb {
        public static final ac a = new ac();

        private ac() {
            super(1, 0, 2);
        }

        @Override // defpackage.cbb
        public final String a(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "count";
            }
            return super.a(i);
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            boolean z;
            int i;
            boolean z2 = false;
            int a2 = cbcVar.a(0);
            int g = caeVar.g();
            int i2 = caeVar.q;
            int n = caeVar.n(caeVar.b, caeVar.h(i2));
            int c = caeVar.c(caeVar.b, caeVar.h(i2 + 1));
            for (int max = Math.max(n, c - a2); max < c; max++) {
                Object obj = caeVar.c[caeVar.d(max)];
                if (obj instanceof bzu) {
                    int i3 = g - max;
                    bzu bzuVar = (bzu) obj;
                    bwa bwaVar = bzuVar.b;
                    int i4 = -1;
                    if (bwaVar != null && bwaVar.a()) {
                        i4 = caeVar.a(bwaVar);
                        i = caeVar.g() - caeVar.p(i4);
                    } else {
                        i = -1;
                    }
                    ((cdo) bzsVar).d(bzuVar.a, i3, i4, i);
                } else if (obj instanceof bzf) {
                    ((bzf) obj).c();
                }
            }
            if (a2 > 0) {
                z = true;
            } else {
                z = false;
            }
            bwp.m(z);
            int i5 = caeVar.q;
            int n2 = caeVar.n(caeVar.b, caeVar.h(i5));
            int c2 = caeVar.c(caeVar.b, caeVar.h(i5 + 1)) - a2;
            if (c2 >= n2) {
                z2 = true;
            }
            bwp.m(z2);
            caeVar.I(c2, a2, i5);
            int i6 = caeVar.h;
            if (i6 >= n2) {
                caeVar.h = i6 - a2;
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class ad extends cbb {
        public static final ad a = new ad();

        private ad() {
            super(1, 2);
        }

        @Override // defpackage.cbb
        public final String a(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "groupSlotIndex";
            }
            return super.a(i);
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            int i;
            Object b = cbcVar.b(0);
            bwa bwaVar = (bwa) cbcVar.b(1);
            boolean z = b instanceof bzu;
            int a2 = cbcVar.a(0);
            if (z) {
                bzsVar.a(((bzu) b).a);
            }
            int a3 = caeVar.a(bwaVar);
            Object w = caeVar.w(a3, a2, b);
            if (w instanceof bzu) {
                int g = caeVar.g() - caeVar.o(a3, a2);
                bzu bzuVar = (bzu) w;
                bwa bwaVar2 = bzuVar.b;
                int i2 = -1;
                if (bwaVar2 != null && bwaVar2.a()) {
                    i2 = caeVar.a(bwaVar2);
                    i = caeVar.g() - caeVar.p(i2);
                } else {
                    i = -1;
                }
                ((cdo) bzsVar).d(bzuVar.a, g, i2, i);
                return;
            }
            if (w instanceof bzf) {
                ((bzf) w).c();
            }
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE;
            }
            if (defpackage.a.bA(i, 1)) {
                return "anchor";
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class ae extends cbb {
        public static final ae a = new ae();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private ae() {
            /*
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cbb.ae.<init>():void");
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            caeVar.O(cbcVar.b(0));
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return GroupManagementRequest.DATA_TAG;
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class af extends cbb {
        public static final af a = new af();

        private af() {
            super(0, 2, 1);
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            bwcVar.b((arqv) cbcVar.b(1), cbcVar.b(0));
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE;
            }
            if (defpackage.a.bA(i, 1)) {
                return "block";
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class ag extends cbb {
        public static final ag a = new ag();

        private ag() {
            super(1, 1);
        }

        @Override // defpackage.cbb
        public final String a(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "groupSlotIndex";
            }
            return super.a(i);
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            Object b = cbcVar.b(0);
            boolean z = b instanceof bzu;
            int a2 = cbcVar.a(0);
            if (z) {
                bzsVar.a(((bzu) b).a);
            }
            Object w = caeVar.w(caeVar.o, a2, b);
            if (w instanceof bzu) {
                cdo cdoVar = (cdo) bzsVar;
                cdoVar.d(((bzu) w).a, caeVar.g() - caeVar.o(caeVar.o, a2), -1, -1);
            } else if (w instanceof bzf) {
                ((bzf) w).c();
            }
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE;
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class ah extends cbb {
        public static final ah a = new ah();

        private ah() {
            super(1, 0, 2);
        }

        @Override // defpackage.cbb
        public final String a(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "count";
            }
            return super.a(i);
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            int a2 = cbcVar.a(0);
            for (int i = 0; i < a2; i++) {
                bwcVar.h();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class ai extends cbb {
        public static final ai a = new ai();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private ai() {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cbb.ai.<init>():void");
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            bwcVar.g();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b extends cbb {
        public static final b a = new b();

        private b() {
            super(0, 2, 1);
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            bwa bwaVar = (bwa) cbcVar.b(0);
            Object b = cbcVar.b(1);
            if (b instanceof bzu) {
                bzsVar.a(((bzu) b).a);
            }
            if (caeVar.m != 0) {
                bwp.i("Can only append a slot if not current inserting");
            }
            int i = caeVar.h;
            int i2 = caeVar.i;
            int a2 = caeVar.a(bwaVar);
            int c = caeVar.c(caeVar.b, caeVar.h(a2 + 1));
            caeVar.h = c;
            caeVar.i = c;
            caeVar.E(1, a2);
            if (i >= c) {
                i++;
                i2++;
            }
            caeVar.c[c] = b;
            caeVar.h = i;
            caeVar.i = i2;
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "anchor";
            }
            if (defpackage.a.bA(i, 1)) {
                return BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE;
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class c extends cbb {
        public static final c a = new c();

        private c() {
            super(0, 2, 1);
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            int i;
            cdl cdlVar = (cdl) cbcVar.b(1);
            if (cdlVar != null) {
                i = cdlVar.a;
            } else {
                i = 0;
            }
            cay cayVar = (cay) cbcVar.b(0);
            if (i > 0) {
                bwcVar = new byp(bwcVar, i);
            }
            cayVar.b(bwcVar, caeVar, bzsVar);
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "changes";
            }
            if (defpackage.a.bA(i, 1)) {
                return "effectiveNodeIndex";
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class d extends cbb {
        public static final d a = new d();

        private d() {
            super(0, 2, 1);
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            int i = ((cdl) cbcVar.b(0)).a;
            List list = (List) cbcVar.b(1);
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                int i3 = i + i2;
                bwcVar.i(i3, obj);
                bwcVar.j(i3, obj);
            }
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "effectiveNodeIndex";
            }
            if (defpackage.a.bA(i, 1)) {
                return "nodes";
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class e extends cbb {
        public static final e a = new e();

        private e() {
            super(0, 4, 1);
        }

        /* JADX WARN: Type inference failed for: r6v6, types: [bzi, bxc] */
        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            boolean z;
            List a2;
            byi byiVar = (byi) cbcVar.b(2);
            byi byiVar2 = (byi) cbcVar.b(3);
            bwr bwrVar = (bwr) cbcVar.b(1);
            byh byhVar = (byh) cbcVar.b(0);
            if (byhVar == null && (byhVar = bwrVar.b(byiVar)) == null) {
                bwp.g("Could not resolve state for movable content");
                throw new armj();
            }
            if (caeVar.m <= 0 && caeVar.j(caeVar.o + 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            cab cabVar = byhVar.a;
            bwp.m(z);
            int i = caeVar.o;
            int i2 = caeVar.h;
            int i3 = caeVar.i;
            caeVar.x(1);
            caeVar.L();
            caeVar.y();
            cae c = cabVar.c();
            try {
                a2 = cae.a.a(c, 2, caeVar, false, true, true);
                c.z(true);
                caeVar.A();
                caeVar.W();
                caeVar.o = i;
                caeVar.h = i2;
                caeVar.i = i3;
                bzf.a.a(caeVar, a2, byiVar2.c);
            } catch (Throwable th) {
                c.z(false);
                throw th;
            }
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "resolvedState";
            }
            if (defpackage.a.bA(i, 1)) {
                return "resolvedCompositionContext";
            }
            if (defpackage.a.bA(i, 2)) {
                return "from";
            }
            if (defpackage.a.bA(i, 3)) {
                return "to";
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class f extends cbb {
        public static final f a = new f();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private f() {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cbb.f.<init>():void");
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            bwp.j(caeVar, bzsVar);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class g extends cbb {
        public static final g a = new g();

        private g() {
            super(0, 2, 1);
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            boolean z;
            int i;
            int k;
            boolean z2 = false;
            cdl cdlVar = (cdl) cbcVar.b(0);
            int a2 = caeVar.a((bwa) cbcVar.b(1));
            if (caeVar.o < a2) {
                z = true;
            } else {
                z = false;
            }
            bwp.m(z);
            cbe.a(caeVar, bwcVar, a2);
            int i2 = caeVar.o;
            int i3 = caeVar.q;
            while (i3 >= 0 && !caeVar.S(i3)) {
                i3 = caeVar.l(i3);
            }
            int i4 = i3 + 1;
            int i5 = 0;
            while (i4 < i2) {
                if (caeVar.R(i2, i4)) {
                    if (true == caeVar.S(i4)) {
                        i5 = 0;
                    }
                    i4++;
                } else {
                    if (caeVar.S(i4)) {
                        k = 1;
                    } else {
                        k = caeVar.k(i4);
                    }
                    i5 += k;
                    i4 += caeVar.j(i4);
                }
            }
            while (true) {
                i = caeVar.o;
                if (i >= a2) {
                    break;
                }
                if (caeVar.R(a2, i)) {
                    int i6 = caeVar.o;
                    if (i6 < caeVar.p && cad.v(caeVar.b, caeVar.h(i6))) {
                        bwcVar.d(caeVar.v(caeVar.o));
                        i5 = 0;
                    }
                    caeVar.L();
                } else {
                    i5 += caeVar.m();
                }
            }
            if (i == a2) {
                z2 = true;
            }
            bwp.m(z2);
            cdlVar.a = i5;
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "effectiveNodeIndexOut";
            }
            if (defpackage.a.bA(i, 1)) {
                return "anchor";
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class h extends cbb {
        public static final h a = new h();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private h() {
            /*
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cbb.h.<init>():void");
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            for (Object obj : (Object[]) cbcVar.b(0)) {
                bwcVar.d(obj);
            }
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "nodes";
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class i extends cbb {
        public static final i a = new i();

        private i() {
            super(0, 2, 1);
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            ((arqr) cbcVar.b(0)).a((bwq) cbcVar.b(1));
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "anchor";
            }
            if (defpackage.a.bA(i, 1)) {
                return "composition";
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class j extends cbb {
        public static final j a = new j();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private j() {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cbb.j.<init>():void");
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            caeVar.W();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class k extends cbb {
        public static final k a = new k();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private k() {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cbb.k.<init>():void");
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            cbe.a(caeVar, bwcVar, 0);
            caeVar.W();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class l extends cbb {
        public static final l a = new l();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private l() {
            /*
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cbb.l.<init>():void");
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "scope";
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class m extends cbb {
        public static final m a = new m();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private m() {
            /*
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cbb.m.<init>():void");
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            caeVar.B(caeVar.a((bwa) cbcVar.b(0)));
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "anchor";
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class n extends cbb {
        public static final n a = new n();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private n() {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cbb.n.<init>():void");
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            caeVar.B(0);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class o extends cbb {
        public static final o a = new o();

        private o() {
            super(1, 2);
        }

        @Override // defpackage.cbb
        public final String a(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "insertIndex";
            }
            return super.a(i);
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            Object a2 = ((arqg) cbcVar.b(0)).a();
            bwa bwaVar = (bwa) cbcVar.b(1);
            int a3 = cbcVar.a(0);
            caeVar.Q(caeVar.a(bwaVar), a2);
            bwcVar.j(a3, a2);
            bwcVar.d(a2);
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "factory";
            }
            if (defpackage.a.bA(i, 1)) {
                return "groupAnchor";
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class p extends cbb {
        public static final p a = new p();

        private p() {
            super(0, 2, 1);
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            cab cabVar = (cab) cbcVar.b(1);
            bwa bwaVar = (bwa) cbcVar.b(0);
            caeVar.y();
            caeVar.Y(cabVar, cabVar.a(bwaVar));
            caeVar.A();
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "anchor";
            }
            if (defpackage.a.bA(i, 1)) {
                return "from";
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class q extends cbb {
        public static final q a = new q();

        private q() {
            super(0, 3, 1);
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            cab cabVar = (cab) cbcVar.b(1);
            bwa bwaVar = (bwa) cbcVar.b(0);
            cba cbaVar = (cba) cbcVar.b(2);
            cae c = cabVar.c();
            try {
                if (!cbaVar.b.f()) {
                    bwp.i("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
                }
                cbaVar.a.c(bwcVar, c, bzsVar);
                c.z(true);
                caeVar.y();
                caeVar.Y(cabVar, cabVar.a(bwaVar));
                caeVar.A();
            } catch (Throwable th) {
                c.z(false);
                throw th;
            }
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "anchor";
            }
            if (defpackage.a.bA(i, 1)) {
                return "from";
            }
            if (defpackage.a.bA(i, 2)) {
                return "fixups";
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class r extends cbb {
        public static final r a = new r();

        private r() {
            super(1, 0, 2);
        }

        @Override // defpackage.cbb
        public final String a(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "offset";
            }
            return super.a(i);
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            bwa bwaVar;
            int a2;
            int i;
            int i2;
            int a3 = cbcVar.a(0);
            if (caeVar.m != 0) {
                bwp.i("Cannot move a group while inserting");
            }
            if (a3 < 0) {
                bwp.i("Parameter offset is out of bounds");
            }
            if (a3 != 0) {
                int i3 = caeVar.o;
                int i4 = caeVar.q;
                int i5 = caeVar.p;
                int i6 = i3;
                while (a3 > 0) {
                    i6 += cad.c(caeVar.b, caeVar.h(i6));
                    if (i6 > i5) {
                        bwp.i("Parameter offset is out of bounds");
                    }
                    a3--;
                }
                int c = cad.c(caeVar.b, caeVar.h(i6));
                int c2 = caeVar.c(caeVar.b, caeVar.h(caeVar.o));
                int c3 = caeVar.c(caeVar.b, caeVar.h(i6));
                int i7 = i6 + c;
                int c4 = caeVar.c(caeVar.b, caeVar.h(i7));
                int i8 = c4 - c3;
                caeVar.E(i8, Math.max(caeVar.o - 1, 0));
                caeVar.D(c);
                int[] iArr = caeVar.b;
                int h = caeVar.h(i7) * 5;
                aqil.x(iArr, iArr, caeVar.h(i3) * 5, h, (c * 5) + h);
                if (i8 > 0) {
                    Object[] objArr = caeVar.c;
                    aqil.y(objArr, objArr, c2, caeVar.d(c3 + i8), caeVar.d(c4 + i8));
                }
                int i9 = c3 + i8;
                int i10 = i9 - c2;
                int i11 = caeVar.j;
                int i12 = caeVar.k;
                int length = caeVar.c.length;
                int i13 = caeVar.l;
                int i14 = i3 + c;
                int i15 = i3;
                while (i15 < i14) {
                    int h2 = caeVar.h(i15);
                    int i16 = i11;
                    int c5 = caeVar.c(iArr, h2) - i10;
                    if (i13 < h2) {
                        i = i10;
                        i2 = 0;
                    } else {
                        i = i10;
                        i2 = i16;
                    }
                    cad.m(iArr, h2, cae.V(cae.V(c5, i2, i12, length), caeVar.j, caeVar.k, caeVar.c.length));
                    i15++;
                    i11 = i16;
                    i10 = i;
                    i12 = i12;
                    length = length;
                }
                int i17 = i7 + c;
                int f = caeVar.f();
                int e = cad.e(caeVar.d, i7, f);
                ArrayList arrayList = new ArrayList();
                while (e < caeVar.d.size() && (a2 = caeVar.a((bwaVar = (bwa) caeVar.d.get(e)))) >= i7 && a2 < i17) {
                    arrayList.add(bwaVar);
                    caeVar.d.remove(e);
                }
                int i18 = i3 - i7;
                int size = arrayList.size();
                for (int i19 = 0; i19 < size; i19++) {
                    bwa bwaVar2 = (bwa) arrayList.get(i19);
                    int a4 = caeVar.a(bwaVar2) + i18;
                    if (a4 >= caeVar.f) {
                        bwaVar2.a = -(f - a4);
                    } else {
                        bwaVar2.a = a4;
                    }
                    caeVar.d.add(cad.e(caeVar.d, a4, f), bwaVar2);
                }
                if (caeVar.U(i7, c)) {
                    bwp.i("Unexpectedly removed anchors");
                }
                caeVar.C(i4, caeVar.p, i3);
                if (i8 > 0) {
                    caeVar.I(i9, i8, i7 - 1);
                }
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class s extends cbb {
        public static final s a = new s();

        private s() {
            super(3, 0, 2);
        }

        @Override // defpackage.cbb
        public final String a(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "from";
            }
            if (defpackage.a.bA(i, 1)) {
                return "to";
            }
            if (defpackage.a.bA(i, 2)) {
                return "count";
            }
            return super.a(i);
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            bwcVar.k(cbcVar.a(0), cbcVar.a(1), cbcVar.a(2));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class t extends cbb {
        public static final t a = new t();

        private t() {
            super(1, 1);
        }

        @Override // defpackage.cbb
        public final String a(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "insertIndex";
            }
            return super.a(i);
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            bwa bwaVar = (bwa) cbcVar.b(0);
            int a2 = cbcVar.a(0);
            bwcVar.h();
            bwcVar.i(a2, caeVar.v(caeVar.a(bwaVar)));
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "groupAnchor";
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class u extends cbb {
        public static final u a = new u();

        private u() {
            super(0, 3, 1);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[Catch: all -> 0x0146, TryCatch #0 {all -> 0x0146, blocks: (B:9:0x0030, B:12:0x004c, B:15:0x0056, B:18:0x0074, B:21:0x008b, B:26:0x0099, B:28:0x00aa, B:31:0x00b3, B:33:0x00c0, B:38:0x00c8, B:41:0x00cf, B:43:0x00d7, B:78:0x0087), top: B:8:0x0030 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c8 A[Catch: all -> 0x0146, TryCatch #0 {all -> 0x0146, blocks: (B:9:0x0030, B:12:0x004c, B:15:0x0056, B:18:0x0074, B:21:0x008b, B:26:0x0099, B:28:0x00aa, B:31:0x00b3, B:33:0x00c0, B:38:0x00c8, B:41:0x00cf, B:43:0x00d7, B:78:0x0087), top: B:8:0x0030 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0087 A[Catch: all -> 0x0146, TryCatch #0 {all -> 0x0146, blocks: (B:9:0x0030, B:12:0x004c, B:15:0x0056, B:18:0x0074, B:21:0x008b, B:26:0x0099, B:28:0x00aa, B:31:0x00b3, B:33:0x00c0, B:38:0x00c8, B:41:0x00cf, B:43:0x00d7, B:78:0x0087), top: B:8:0x0030 }] */
        @Override // defpackage.cbb
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(defpackage.cbc r18, defpackage.bwc r19, defpackage.cae r20, defpackage.bzs r21) {
            /*
                Method dump skipped, instructions count: 332
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: cbb.u.b(cbc, bwc, cae, bzs):void");
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "composition";
            }
            if (defpackage.a.bA(i, 1)) {
                return "parentCompositionContext";
            }
            if (defpackage.a.bA(i, 2)) {
                return "reference";
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class v extends cbb {
        public static final v a = new v();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private v() {
            /*
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cbb.v.<init>():void");
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            bzsVar.a((bzt) cbcVar.b(0));
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE;
            }
            return super.c(i);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class w extends cbb {
        public static final w a = new w();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private w() {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cbb.w.<init>():void");
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            bwp.k(caeVar, bzsVar);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class x extends cbb {
        public static final x a = new x();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private x() {
            /*
                r2 = this;
                r0 = 2
                r1 = 0
                r2.<init>(r0, r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cbb.x.<init>():void");
        }

        @Override // defpackage.cbb
        public final String a(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "removeIndex";
            }
            if (defpackage.a.bA(i, 1)) {
                return "count";
            }
            return super.a(i);
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            bwcVar.l(cbcVar.a(0), cbcVar.a(1));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class y extends cbb {
        public static final y a = new y();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private y() {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cbb.y.<init>():void");
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            if (caeVar.m != 0) {
                bwp.i("Cannot reset when inserting");
            }
            caeVar.H();
            caeVar.o = 0;
            caeVar.p = caeVar.e() - caeVar.g;
            caeVar.h = 0;
            caeVar.i = 0;
            caeVar.n = 0;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class z extends cbb {
        public static final z a = new z();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private z() {
            /*
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cbb.z.<init>():void");
        }

        @Override // defpackage.cbb
        public final void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar) {
            ((cdo) bzsVar).a.add((arqg) cbcVar.b(0));
        }

        @Override // defpackage.cbb
        public final String c(int i) {
            if (defpackage.a.bA(i, 0)) {
                return "effect";
            }
            return super.c(i);
        }
    }

    public cbb(int i2, int i3) {
        this.b = i2;
        this.c = i3;
    }

    public String a(int i2) {
        return "IntParameter(" + i2 + ')';
    }

    public abstract void b(cbc cbcVar, bwc bwcVar, cae caeVar, bzs bzsVar);

    public String c(int i2) {
        return "ObjectParameter(" + i2 + ')';
    }

    public final String toString() {
        int i2 = arsc.a;
        String c2 = new arrh(getClass()).c();
        if (c2 == null) {
            return "";
        }
        return c2;
    }

    public /* synthetic */ cbb(int i2, int i3, int i4) {
        this(1 == (i4 & 1) ? 0 : i2, (i4 & 2) != 0 ? 0 : i3);
    }
}
