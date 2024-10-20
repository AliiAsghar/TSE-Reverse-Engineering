package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.datamodel.etouffee.info.DetailsPageE2eeInfoRequest;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class txw implements akfb {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final DetailsPageE2eeInfoRequest f;
    private final arwe g;
    private final arpi h;
    private final arpi i;
    private final xnv j;
    private final armf k;

    public txw(arwe arweVar, arpi arpiVar, arpi arpiVar2, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, xnv xnvVar, armf armfVar5, armf armfVar6, DetailsPageE2eeInfoRequest detailsPageE2eeInfoRequest) {
        this.g = arweVar;
        this.h = arpiVar;
        this.i = arpiVar2;
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.j = xnvVar;
        this.k = armfVar5;
        this.e = armfVar6;
        this.f = detailsPageE2eeInfoRequest;
    }

    private final Object i(Conversation conversation, arpe arpeVar) {
        return arro.q(this.i, new txt(conversation, (arpe) null, 0), arpeVar);
    }

    private final Object j(arpe arpeVar) {
        return arro.q(this.h, new txt(this, (arpe) null, 3), arpeVar);
    }

    @Override // defpackage.akfb
    public final andc a() {
        return qjh.k(this.g, new lfn(this, (arpe) null, 8));
    }

    @Override // defpackage.akfb
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        akul c;
        c = qjh.c(this.g, arpj.a, arwf.a, new jks(this, (arpe) null, 17));
        return c;
    }

    @Override // defpackage.akfb
    public final /* bridge */ /* synthetic */ Object c() {
        int i = uaq.e;
        akfc akfcVar = uap.b;
        akfcVar.getClass();
        return akfcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f3, code lost:
    
        if (r5.y(r4, r2, r6, r0) != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd A[LOOP:0: B:20:0x00c7->B:22:0x00cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.arpe r11) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txw.d(arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (r4.x(r2, r5, r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[LOOP:0: B:18:0x0069->B:20:0x006f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @defpackage.armg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.arpe r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.txr
            if (r0 == 0) goto L13
            r0 = r9
            txr r0 = (defpackage.txr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            txr r0 = new txr
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r9)
            goto L97
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            amkd r2 = r0.d
            zai r4 = r0.e
            defpackage.aqil.P(r9)
            goto L58
        L3a:
            defpackage.aqil.P(r9)
            armf r9 = r8.c
            java.lang.Object r9 = r9.b()
            zai r9 = (defpackage.zai) r9
            com.google.android.apps.messaging.shared.datamodel.etouffee.info.DetailsPageE2eeInfoRequest r2 = r8.f
            r0.e = r9
            amkd r2 = r2.c
            r0.d = r2
            r0.c = r4
            java.lang.Object r4 = r8.j(r0)
            if (r4 == r1) goto L9a
            r7 = r4
            r4 = r9
            r9 = r7
        L58:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.aqjn.J(r9, r6)
            r5.<init>(r6)
            java.util.Iterator r9 = r9.iterator()
        L69:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L89
            java.lang.Object r6 = r9.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r6 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r6
            msh r6 = r6.f()
            j$.util.Optional r6 = r6.e()
            java.lang.Object r6 = r6.get()
            qei r6 = (defpackage.qei) r6
            java.lang.String r6 = r6.d
            r5.add(r6)
            goto L69
        L89:
            r9 = 0
            r0.e = r9
            r0.d = r9
            r0.c = r3
            java.lang.Object r9 = r4.x(r2, r5, r0)
            if (r9 != r1) goto L97
            goto L9a
        L97:
            arnb r9 = defpackage.arnb.a
            return r9
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txw.e(arpe):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0028. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x021b A[LOOP:0: B:13:0x0215->B:15:0x021b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0159 A[LOOP:1: B:25:0x0153->B:27:0x0159, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r1v24, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.arwe r20, defpackage.arpe r21) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txw.f(arwe, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[LOOP:0: B:13:0x007e->B:15:0x0084, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(com.google.android.apps.messaging.shared.api.messaging.Conversation r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.txu
            if (r0 == 0) goto L13
            r0 = r7
            txu r0 = (defpackage.txu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            txu r0 = new txu
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L36
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            defpackage.aqil.P(r7)
            goto L63
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.aqil.P(r7)
            goto L4f
        L36:
            defpackage.aqil.P(r7)
            armf r7 = r5.e
            java.lang.Object r7 = r7.b()
            okg r7 = (defpackage.okg) r7
            boolean r7 = r7.a()
            if (r7 == 0) goto L53
            r0.c = r3
            java.lang.Object r7 = r5.j(r0)
            if (r7 == r1) goto L52
        L4f:
            java.util.List r7 = (java.util.List) r7
            goto L65
        L52:
            return r1
        L53:
            arpi r7 = r5.h
            txt r2 = new txt
            r3 = 0
            r2.<init>(r6, r3, r4, r3)
            r0.c = r4
            java.lang.Object r7 = defpackage.arro.q(r7, r2, r0)
            if (r7 == r1) goto La3
        L63:
            java.util.List r7 = (java.util.List) r7
        L65:
            r6 = 10
            int r6 = defpackage.aqjn.J(r7, r6)
            int r6 = defpackage.aqjn.i(r6)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 16
            int r6 = defpackage.arrn.r(r6, r1)
            r0.<init>(r6)
            java.util.Iterator r6 = r7.iterator()
        L7e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto La2
            java.lang.Object r7 = r6.next()
            r1 = r7
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r1
            msh r1 = r1.f()
            j$.util.Optional r1 = r1.e()
            java.lang.Object r1 = r1.get()
            qei r1 = (defpackage.qei) r1
            java.lang.String r1 = r1.d
            r1.getClass()
            r0.put(r1, r7)
            goto L7e
        La2:
            return r0
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txw.g(com.google.android.apps.messaging.shared.api.messaging.Conversation, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.txv
            if (r0 == 0) goto L13
            r0 = r7
            txv r0 = (defpackage.txv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            txv r0 = new txv
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r7)
            goto L4b
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.aqil.P(r7)
            com.google.android.apps.messaging.shared.datamodel.etouffee.info.DetailsPageE2eeInfoRequest r7 = r6.f
            com.google.android.apps.messaging.shared.api.messaging.Conversation r7 = r7.b
            if (r7 == 0) goto L39
            goto L50
        L39:
            arpi r7 = r6.i
            pze r2 = new pze
            r4 = 0
            r5 = 14
            r2.<init>(r6, r4, r5)
            r0.c = r3
            java.lang.Object r7 = defpackage.arro.q(r7, r2, r0)
            if (r7 == r1) goto L51
        L4b:
            r7.getClass()
            com.google.android.apps.messaging.shared.api.messaging.Conversation r7 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r7
        L50:
            return r7
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txw.h(arpe):java.lang.Object");
    }
}
