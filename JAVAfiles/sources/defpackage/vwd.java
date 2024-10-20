package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vwd implements akoa {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/MmsGroupUpgradeSynclet");
    public final armf b;
    public final mbl c;
    public final yjv d;
    public final xnv e;
    public final armf f;
    public final armf g;
    public final arml h;
    public final aiwu i;
    private final arwe j;
    private final arpi k;
    private final vvg l;
    private final ojq m;
    private final ojr n;
    private final nfx o;
    private final armf p;
    private final xym q;

    public vwd(arwe arweVar, arpi arpiVar, xym xymVar, vvg vvgVar, armf armfVar, ojq ojqVar, ojr ojrVar, Context context, mbl mblVar, yjv yjvVar, nfx nfxVar, aiwu aiwuVar, xnv xnvVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        arweVar.getClass();
        arpiVar.getClass();
        xymVar.getClass();
        vvgVar.getClass();
        armfVar.getClass();
        ojqVar.getClass();
        context.getClass();
        mblVar.getClass();
        yjvVar.getClass();
        nfxVar.getClass();
        aiwuVar.getClass();
        xnvVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.j = arweVar;
        this.k = arpiVar;
        this.q = xymVar;
        this.l = vvgVar;
        this.b = armfVar;
        this.m = ojqVar;
        this.n = ojrVar;
        this.c = mblVar;
        this.d = yjvVar;
        this.o = nfxVar;
        this.i = aiwuVar;
        this.e = xnvVar;
        this.p = armfVar2;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = armd.a(new vnq(context, 4));
    }

    @Override // defpackage.akoa
    public final /* bridge */ /* synthetic */ ListenableFuture a() {
        akul c;
        if (!this.m.a() && !this.n.a()) {
            akul ag = aktp.ag(null);
            ag.getClass();
            return ag;
        }
        akrh e = aktp.e("MmsGroupUpgradeSynclet#sync");
        try {
            c = qjh.c(this.j, arpj.a, arwf.a, new gcb(this, (arpe) null, 3));
            armd.i(e, null);
            return c;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(e, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x013b, code lost:
    
        if (r13 == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f4, code lost:
    
        if (r13 != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
    
        if (r13 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r13) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vwd.b(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.vwa
            if (r0 == 0) goto L13
            r0 = r5
            vwa r0 = (defpackage.vwa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vwa r0 = new vwa
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vwd r0 = r0.d
            defpackage.aqil.P(r5)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.aqil.P(r5)
            aiwu r5 = r4.i
            com.google.common.util.concurrent.ListenableFuture r5 = r5.a()
            r5.getClass()
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = defpackage.arro.F(r5, r0)
            if (r5 == r1) goto L7d
            r0 = r4
        L48:
            vwe r5 = (defpackage.vwe) r5
            apct r5 = r5.d
            if (r5 != 0) goto L50
            apct r5 = defpackage.apct.a
        L50:
            r5.getClass()
            j$.time.Instant r5 = defpackage.aoue.m(r5)
            armf r1 = r0.p
            java.lang.Object r1 = r1.b()
            r1.getClass()
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            j$.time.Duration r1 = defpackage.albo.cc(r1)
            j$.time.Instant r5 = r5.plus(r1)
            xnv r0 = r0.e
            j$.time.Instant r0 = r0.f()
            boolean r5 = r5.isBefore(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vwd.c(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.vwb
            if (r0 == 0) goto L13
            r0 = r7
            vwb r0 = (defpackage.vwb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            vwb r0 = new vwb
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            int r0 = r0.a
            defpackage.aqil.P(r7)
            goto L6c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            vwd r2 = r0.e
            defpackage.aqil.P(r7)
            goto L51
        L3a:
            defpackage.aqil.P(r7)
            aiwu r7 = r6.i
            com.google.common.util.concurrent.ListenableFuture r7 = r7.a()
            r7.getClass()
            r0.e = r6
            r0.d = r4
            java.lang.Object r7 = defpackage.arro.F(r7, r0)
            if (r7 == r1) goto L72
            r2 = r6
        L51:
            vwe r7 = (defpackage.vwe) r7
            int r7 = r7.c
            int r7 = r7 + r4
            aiwu r2 = r2.i
            iim r4 = new iim
            r5 = 7
            r4.<init>(r7, r5)
            r5 = 0
            r0.e = r5
            r0.a = r7
            r0.d = r3
            java.lang.Object r0 = defpackage.yyb.al(r2, r4, r0)
            if (r0 == r1) goto L72
            r0 = r7
        L6c:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r0)
            return r7
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vwd.d(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0088 -> B:11:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.vwc
            if (r0 == 0) goto L13
            r0 = r7
            vwc r0 = (defpackage.vwc) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            vwc r0 = new vwc
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r2 = r0.a
            defpackage.aqil.P(r7)
            goto L8a
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            defpackage.aqil.P(r7)
            goto L51
        L39:
            defpackage.aqil.P(r7)
            nfx r7 = r6.o
            ncq r7 = r7.a()
            akul r7 = r7.b()
            r7.getClass()
            r0.d = r5
            java.lang.Object r7 = defpackage.arro.F(r7, r0)
            if (r7 == r1) goto L9a
        L51:
            r7.getClass()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r2 = r7 instanceof java.util.Collection
            if (r2 == 0) goto L64
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L64
            goto L95
        L64:
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
        L69:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L95
            java.lang.Object r7 = r2.next()
            nfw r7 = (defpackage.nfw) r7
            ncq r7 = r7.d()
            akul r7 = r7.b()
            r7.getClass()
            r0.a = r2
            r0.d = r4
            java.lang.Object r7 = defpackage.arro.F(r7, r0)
            if (r7 == r1) goto L94
        L8a:
            ngh r7 = (defpackage.ngh) r7
            boolean r7 = r7.a()
            if (r7 == 0) goto L69
            r3 = r5
            goto L95
        L94:
            return r1
        L95:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vwd.e(arpe):java.lang.Object");
    }
}
