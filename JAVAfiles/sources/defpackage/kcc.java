package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcc {
    private static final alvi e = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/content/MessageBubbleContentUiAdapterImpl");
    public final Context a;
    public final arwe b;
    public final arwe c;
    public final mjg d;
    private final kbc f;
    private final kcr g;
    private final ked h;
    private final ken i;
    private final kdn j;
    private final apwt k;
    private final armf l;
    private final armf m;
    private final kcg n;
    private final oja o;
    private final armf p;
    private final armf q;
    private final pkg r;
    private final wpm s;
    private final kcg t;
    private final lfx u;
    private final iji v;
    private final hmk w;
    private final lga x;

    public kcc(Context context, arwe arweVar, arwe arweVar2, mjg mjgVar, kbc kbcVar, kcg kcgVar, kcr kcrVar, lga lgaVar, ked kedVar, lfx lfxVar, ken kenVar, kdn kdnVar, hmk hmkVar, apwt apwtVar, armf armfVar, armf armfVar2, kcg kcgVar2, iji ijiVar, oja ojaVar, obk obkVar, wpm wpmVar, armf armfVar3, armf armfVar4, pkg pkgVar) {
        context.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        mjgVar.getClass();
        kbcVar.getClass();
        kcrVar.getClass();
        kenVar.getClass();
        apwtVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        obkVar.getClass();
        wpmVar.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.a = context;
        this.b = arweVar;
        this.c = arweVar2;
        this.d = mjgVar;
        this.f = kbcVar;
        this.t = kcgVar;
        this.g = kcrVar;
        this.x = lgaVar;
        this.h = kedVar;
        this.u = lfxVar;
        this.i = kenVar;
        this.j = kdnVar;
        this.w = hmkVar;
        this.k = apwtVar;
        this.l = armfVar;
        this.m = armfVar2;
        this.n = kcgVar2;
        this.v = ijiVar;
        this.o = ojaVar;
        this.s = wpmVar;
        this.p = armfVar3;
        this.q = armfVar4;
        this.r = pkgVar;
    }

    private static final boolean e(myt mytVar) {
        String j = mytVar.j();
        j.getClass();
        return arsd.z(j, "image", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x021f, code lost:
    
        if (r7 == null) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.qkg a(defpackage.arwe r55, defpackage.kbv r56) {
        /*
            Method dump skipped, instructions count: 1969
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcc.a(arwe, kbv):qkg");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b4, code lost:
    
        if (defpackage.arro.F(r10, r0) != r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.miz r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.kbz
            if (r0 == 0) goto L13
            r0 = r10
            kbz r0 = (defpackage.kbz) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            kbz r0 = new kbz
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            arpl r1 = defpackage.arpl.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r9 = r0.a
            miz r9 = (defpackage.miz) r9
            defpackage.aqil.P(r10)
            goto Lb6
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            java.lang.Object r9 = r0.b
            java.lang.Object r2 = r0.a
            kcc r2 = (defpackage.kcc) r2
            defpackage.aqil.P(r10)
            goto L7a
        L41:
            defpackage.aqil.P(r10)
            int r10 = r9.r()
            if (r10 == r4) goto Lc3
            apwt r10 = r8.k
            java.lang.Object r10 = r10.b()
            mdt r10 = (defpackage.mdt) r10
            aiwu r10 = r10.c
            com.google.common.util.concurrent.ListenableFuture r10 = r10.a()
            its r2 = new its
            r5 = 20
            r2.<init>(r5)
            andi r5 = defpackage.andi.a
            com.google.common.util.concurrent.ListenableFuture r10 = defpackage.aktp.Y(r10, r2, r5)
            akul r10 = defpackage.akul.g(r10)
            r10.getClass()
            r0.a = r8
            r0.b = r9
            r0.e = r4
            java.lang.Object r10 = defpackage.arro.F(r10, r0)
            if (r10 != r1) goto L79
            goto Lc2
        L79:
            r2 = r8
        L7a:
            java.lang.Long r10 = (java.lang.Long) r10
            long r4 = defpackage.lga.bI(r9)
            long r6 = r10.longValue()
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 < 0) goto L89
            goto Lc3
        L89:
            apwt r10 = r2.k
            java.lang.Object r10 = r10.b()
            mdt r10 = (defpackage.mdt) r10
            aiwu r10 = r10.c
            mdq r2 = new mdq
            r2.<init>(r4, r3)
            algk r2 = defpackage.akto.a(r2)
            andi r4 = defpackage.andi.a
            com.google.common.util.concurrent.ListenableFuture r10 = r10.b(r2, r4)
            akul r10 = defpackage.akul.g(r10)
            r10.getClass()
            r0.a = r9
            r2 = 0
            r0.b = r2
            r0.e = r3
            java.lang.Object r10 = defpackage.arro.F(r10, r0)
            if (r10 == r1) goto Lc2
        Lb6:
            boolean r9 = defpackage.lga.bV(r9)
            if (r9 == 0) goto Lbf
            aadm r9 = defpackage.aadm.c
            return r9
        Lbf:
            aadm r9 = defpackage.aadm.b
            return r9
        Lc2:
            return r1
        Lc3:
            aadm r9 = defpackage.aadm.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcc.b(miz, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.miz r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.kcb
            if (r0 == 0) goto L13
            r0 = r6
            kcb r0 = (defpackage.kcb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kcb r0 = new kcb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kcc r5 = r0.d
            defpackage.aqil.P(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.aqil.P(r6)
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 == r1) goto L77
            r5 = r4
        L3f:
            aadm r6 = (defpackage.aadm) r6
            aadm r0 = defpackage.aadm.b
            if (r6 != r0) goto L5b
            armf r5 = r5.l
            java.lang.Object r5 = r5.b()
            zng r5 = (defpackage.zng) r5
            java.lang.Object r5 = r5.a
            java.lang.Object r5 = r5.b()
            mbl r5 = (defpackage.mbl) r5
            java.lang.String r6 = "Bugle.MessageAnimatedEmojis.Received.Count"
            r5.c(r6)
            goto L74
        L5b:
            aadm r0 = defpackage.aadm.c
            if (r6 != r0) goto L74
            armf r5 = r5.l
            java.lang.Object r5 = r5.b()
            zng r5 = (defpackage.zng) r5
            java.lang.Object r5 = r5.a
            java.lang.Object r5 = r5.b()
            mbl r5 = (defpackage.mbl) r5
            java.lang.String r6 = "Bugle.MessageAnimatedEmojis.Sent.Count"
            r5.c(r6)
        L74:
            arnb r5 = defpackage.arnb.a
            return r5
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcc.c(miz, arpe):java.lang.Object");
    }

    public final void d(MessageId messageId) {
        qjh.l(this.b, null, new kca(this, messageId, (arpe) null, 0), 3);
    }
}
