package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
@armg
/* loaded from: classes3.dex */
public final class mgr {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/analytics/statistics/MessageStatusEventLogger");
    public final armf b;
    public final armf c;
    private final arwe d;
    private final arpi e;
    private final xnv f;
    private final armf g;

    public mgr(arwe arweVar, arpi arpiVar, xnv xnvVar, armf armfVar, armf armfVar2, armf armfVar3) {
        arweVar.getClass();
        arpiVar.getClass();
        xnvVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.d = arweVar;
        this.e = arpiVar;
        this.f = xnvVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.g = armfVar3;
    }

    public final akul a(MessageIdType messageIdType, int i) {
        akul c;
        c = qjh.c(this.d, arpj.a, arwf.a, new mgq(this, messageIdType, i, lgb.L(this.f), (arpe) null, 0));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r11, int r12, defpackage.mbh r13, defpackage.arpe r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.mgp
            if (r0 == 0) goto L13
            r0 = r14
            mgp r0 = (defpackage.mgp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mgp r0 = new mgp
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            mbh r13 = r0.e
            mgr r11 = r0.d
            defpackage.aqil.P(r14)
            goto L50
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            defpackage.aqil.P(r14)
            r0.d = r10
            r0.e = r13
            r0.c = r3
            arpi r14 = r10.e
            psl r2 = new psl
            r8 = 0
            r9 = 1
            r4 = r2
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r14 = defpackage.arro.q(r14, r2, r0)
            if (r14 == r1) goto L9f
            r11 = r10
        L50:
            amfr r14 = (defpackage.amfr) r14
            if (r14 == 0) goto L9c
            aozy r12 = r14.toBuilder()
            amfq r12 = (defpackage.amfq) r12
            if (r12 != 0) goto L5d
            goto L9c
        L5d:
            armf r11 = r11.g
            java.lang.Object r11 = r11.b()
            mbb r11 = (defpackage.mbb) r11
            mar r11 = r11.a()
            r11.g(r13)
            amrs r14 = defpackage.amrs.BUGLE_MESSAGE
            r11.e(r14)
            mbt r14 = defpackage.mbt.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS
            r11.b(r12, r14)
            apag r11 = r12.b
            amfr r11 = (defpackage.amfr) r11
            amgu r11 = r11.k
            if (r11 != 0) goto L80
            amgu r11 = defpackage.amgu.a
        L80:
            long r0 = r11.n
            apag r11 = r12.b
            amfr r11 = (defpackage.amfr) r11
            amgu r11 = r11.k
            if (r11 != 0) goto L8c
            amgu r11 = defpackage.amgu.a
        L8c:
            int r11 = r11.h
            int r11 = defpackage.akec.aL(r11)
            if (r11 != 0) goto L95
            goto L96
        L95:
            r3 = r11
        L96:
            defpackage.lgb.y(r0, r3, r13)
            arnb r11 = defpackage.arnb.a
            return r11
        L9c:
            arnb r11 = defpackage.arnb.a
            return r11
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgr.b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, int, mbh, arpe):java.lang.Object");
    }
}
