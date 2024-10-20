package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class reb {
    public final armf A;
    public final armf B;
    public final armf C;
    public final armf D;
    public final armf E;
    public final arwe F;
    public final arpi G;
    public final arpi H;
    public final armf I;
    public final armf J;
    public final wyq K;
    public final yck L;
    public final armf M;
    public final armf N;
    public final armf O;
    public final armf P;
    public final armf Q;
    public final tzn R;
    public final zai S;
    private final armf V;
    private final xnv W;
    private final yjy X;
    private final armf Y;
    private final xbf Z;
    private final armf aa;
    private final armf ab;
    private final armf ac;
    private final arwe ad;
    private final arpi ae;
    private final armf af;
    private final armf ag;
    private final armf ah;
    private final vjs ai;
    private final uie aj;
    public final Action c;
    public final Context d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final ryg j;
    public final wzs k;
    public final xbi l;
    public final armf m;
    public final wys n;
    public final armf o;
    public final wyp p;
    public final qyn q;
    public final rjj r;
    public final uhj s;
    public final rys t;
    public final vak u;
    public final uhg v;
    public final armf w;
    public final Optional x;
    public final armf y;
    public final armf z;
    public static final xze a = xze.g("BugleDataModel", "ReceiveMmsMessageAction");
    private static final alwo T = alwo.o("BugleDataModel");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/ReceiveMmsMessageAsyncAction");
    private static final alwo U = alwo.o("BugleNotifications");

    public reb(Action action, Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, ryg rygVar, xnv xnvVar, wzs wzsVar, yjy yjyVar, xbi xbiVar, armf armfVar7, armf armfVar8, wys wysVar, xbf xbfVar, armf armfVar9, zai zaiVar, wyp wypVar, qyn qynVar, rjj rjjVar, vjs vjsVar, uhj uhjVar, rys rysVar, vak vakVar, uhg uhgVar, uie uieVar, tzn tznVar, armf armfVar10, Optional optional, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, arwe arweVar, arpi arpiVar, arwe arweVar2, arpi arpiVar2, arpi arpiVar3, armf armfVar21, armf armfVar22, armf armfVar23, wyq wyqVar, yck yckVar, armf armfVar24, armf armfVar25, armf armfVar26, armf armfVar27, armf armfVar28, armf armfVar29, armf armfVar30) {
        this.c = action;
        this.d = context;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = armfVar4;
        this.i = armfVar5;
        this.V = armfVar6;
        this.j = rygVar;
        this.W = xnvVar;
        this.k = wzsVar;
        this.X = yjyVar;
        this.l = xbiVar;
        this.m = armfVar7;
        this.Y = armfVar8;
        this.n = wysVar;
        this.Z = xbfVar;
        this.o = armfVar9;
        this.S = zaiVar;
        this.p = wypVar;
        this.q = qynVar;
        this.r = rjjVar;
        this.ai = vjsVar;
        this.s = uhjVar;
        this.t = rysVar;
        this.u = vakVar;
        this.v = uhgVar;
        this.aj = uieVar;
        this.R = tznVar;
        this.w = armfVar10;
        this.x = optional;
        this.y = armfVar11;
        this.z = armfVar12;
        this.A = armfVar13;
        this.aa = armfVar14;
        this.ab = armfVar15;
        this.B = armfVar16;
        this.C = armfVar17;
        this.D = armfVar18;
        this.E = armfVar19;
        this.ac = armfVar20;
        this.F = arweVar;
        this.G = arpiVar;
        this.ad = arweVar2;
        this.H = arpiVar2;
        this.ae = arpiVar3;
        this.af = armfVar21;
        this.I = armfVar22;
        this.J = armfVar23;
        this.K = wyqVar;
        this.L = yckVar;
        this.M = armfVar24;
        this.N = armfVar25;
        this.O = armfVar26;
        this.P = armfVar27;
        this.ag = armfVar28;
        this.Q = armfVar29;
        this.ah = armfVar30;
    }

    private final Object G(byte[] bArr, arpe arpeVar) {
        Object q = arro.q(this.ae, new rdx(this, bArr, (arpe) null, 3), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(defpackage.msh r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.rdr
            if (r0 == 0) goto L13
            r0 = r7
            rdr r0 = (defpackage.rdr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            rdr r0 = new rdr
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            reb r6 = r0.e
            java.lang.Object r0 = r0.a
            defpackage.aqil.P(r7)
            r4 = r7
            r7 = r6
            r6 = r0
            r0 = r4
            goto L58
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            defpackage.aqil.P(r7)
            armf r7 = r5.ab
            java.lang.Object r7 = r7.b()
            qpj r7 = (defpackage.qpj) r7
            akul r7 = r7.e(r6)
            r7.getClass()
            r0.a = r6
            r0.e = r5
            r0.d = r3
            java.lang.Object r7 = defpackage.arro.F(r7, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            r0 = r7
            r7 = r5
        L58:
            r0.getClass()
            j$.util.Optional r0 = (j$.util.Optional) r0
            alog r6 = defpackage.alog.r(r6)
            r6.getClass()
            rdq r1 = new rdq
            r1.<init>(r7, r0, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.reb.m(msh, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.util.List r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.rds
            if (r0 == 0) goto L13
            r0 = r6
            rds r0 = (defpackage.rds) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rds r0 = new rds
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            reb r5 = r0.d
            alsx r0 = r0.e
            defpackage.aqil.P(r6)
            goto L77
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.aqil.P(r6)
            artx r5 = defpackage.aqjn.aF(r5)
            qnc r6 = defpackage.qnc.g
            artt r2 = new artt
            r2.<init>(r5, r3, r6)
            alog r5 = defpackage.alzz.ba(r2)
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L5a
            rdq r5 = new rdq
            j$.util.Optional r6 = j$.util.Optional.empty()
            alog r0 = defpackage.alsx.a
            r0.getClass()
            r5.<init>(r4, r6, r0)
            goto L86
        L5a:
            armf r6 = r4.ab
            java.lang.Object r6 = r6.b()
            qpj r6 = (defpackage.qpj) r6
            akul r6 = r6.i(r5)
            r2 = r5
            alsx r2 = (defpackage.alsx) r2
            r0.e = r2
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = defpackage.arro.F(r6, r0)
            if (r6 == r1) goto L87
            r0 = r5
            r5 = r4
        L77:
            r6.getClass()
            j$.util.Optional r6 = (j$.util.Optional) r6
            alog r0 = defpackage.alzz.aZ(r0)
            rdq r1 = new rdq
            r1.<init>(r5, r6, r0)
            r5 = r1
        L86:
            return r5
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.reb.n(java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.rdt
            if (r0 == 0) goto L13
            r0 = r7
            rdt r0 = (defpackage.rdt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rdt r0 = new rdt
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.aqil.P(r7)
            arpi r7 = r6.ae
            pze r2 = new pze
            r4 = 0
            r5 = 10
            r2.<init>(r6, r4, r5)
            r0.c = r3
            java.lang.Object r7 = defpackage.arro.q(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r7 = r7 ^ r3
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.reb.o(arpe):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0227 A[Catch: gl -> 0x023e, TryCatch #1 {gl -> 0x023e, blocks: (B:33:0x0223, B:35:0x0227, B:38:0x0235, B:39:0x023c, B:57:0x01f6), top: B:56:0x01f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0235 A[Catch: gl -> 0x023e, TryCatch #1 {gl -> 0x023e, blocks: (B:33:0x0223, B:35:0x0227, B:38:0x0235, B:39:0x023c, B:57:0x01f6), top: B:56:0x01f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0271 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(android.content.Context r26, byte[] r27, int r28, java.lang.String r29, defpackage.arpe r30) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.reb.p(android.content.Context, byte[], int, java.lang.String, arpe):java.lang.Object");
    }
}
