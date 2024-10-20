package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxa implements mxe {
    public static final alwo a = alwo.o("BugleTyping");
    public final arwe b;
    public final ncq c;
    public final ncq d;
    public final long f;
    public arxm g;
    public final AtomicReference h;
    public final AtomicBoolean i;
    public final zap j;
    private final arpi k;
    private final xnv l;
    private final wew m;
    private final BugleConversationId n;
    private yga p;
    private final Duration q;
    private final qnu r;
    private final Object o = new Object();
    public Instant e = Instant.EPOCH;

    public mxa(zap zapVar, qnu qnuVar, arwe arweVar, arpi arpiVar, xnv xnvVar, wew wewVar, BugleConversationId bugleConversationId, ncq ncqVar, ncq ncqVar2) {
        this.j = zapVar;
        this.r = qnuVar;
        this.b = arweVar;
        this.k = arpiVar;
        this.l = xnvVar;
        this.m = wewVar;
        this.n = bugleConversationId;
        this.c = ncqVar;
        this.d = ncqVar2;
        long j = arut.a;
        Duration ofSeconds = Duration.ofSeconds(arut.h(arsd.p(aqmd.a(), aruv.c)), arut.d(r1));
        ofSeconds.getClass();
        this.q = ofSeconds;
        this.f = arsd.p(aqmd.b(), aruv.c);
        this.h = new AtomicReference(null);
        this.i = new AtomicBoolean(false);
    }

    @Override // defpackage.mxe
    public final akul a() {
        this.i.set(true);
        yga ygaVar = this.p;
        if (ygaVar != null) {
            ygaVar.a();
        }
        if (this.g == null) {
            akul ag = aktp.ag(null);
            ag.getClass();
            return ag;
        }
        h();
        return c();
    }

    @Override // defpackage.mxe
    public final akul b() {
        akul c;
        qjh.l(this.b, null, new mwv(this, (arpe) null, 0), 3);
        arxm arxmVar = this.g;
        if (arxmVar != null) {
            arxmVar.v(null);
        }
        this.g = null;
        Instant f = this.l.f();
        if (Duration.between(this.e, f).compareTo(this.q) < 0) {
            i();
            akul ag = aktp.ag(null);
            ag.getClass();
            return ag;
        }
        synchronized (this.o) {
            if (this.p == null) {
                yga a2 = this.d.a(new mlq(this, 9));
                a2.getClass();
                this.p = a2;
            }
        }
        c = qjh.c(this.b, arpj.a, arwf.a, new iqi(this, f, (arpe) null, 5));
        return yyb.aN(c);
    }

    public final akul c() {
        akul c;
        c = qjh.c(this.b, arpj.a, arwf.a, new mww(this, (arpe) null, 0));
        return yyb.aN(c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.wzk r9, j$.time.Instant r10, defpackage.mll r11, defpackage.mwc r12, defpackage.nfw r13, defpackage.arpe r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof defpackage.mwu
            if (r0 == 0) goto L13
            r0 = r14
            mwu r0 = (defpackage.mwu) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            mwu r0 = new mwu
            r0.<init>(r8, r14)
        L18:
            r7 = r0
            java.lang.Object r14 = r7.c
            arpl r0 = defpackage.arpl.a
            int r1 = r7.e
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L47
            if (r1 == r4) goto L36
            if (r1 != r3) goto L2e
            defpackage.aqil.P(r14)
            goto La2
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            java.lang.Object r13 = r7.b
            mwc r12 = r7.i
            java.lang.Object r11 = r7.a
            j$.time.Instant r10 = r7.h
            wzk r9 = r7.g
            mxa r1 = r7.f
            defpackage.aqil.P(r14)
        L45:
            r6 = r10
            goto L79
        L47:
            defpackage.aqil.P(r14)
            mjq r14 = r12.c
            boolean r14 = r14.g
            if (r14 == 0) goto Lbd
            mis r14 = r12.e
            mis r1 = defpackage.mis.NONE
            if (r14 == r1) goto L57
            goto Lbd
        L57:
            if (r13 == 0) goto Lb5
            arpi r14 = r8.k
            kca r1 = new kca
            r6 = 20
            r1.<init>(r8, r13, r5, r6)
            r7.f = r8
            r7.g = r9
            r7.h = r10
            r7.a = r11
            r7.i = r12
            r7.b = r13
            r7.e = r4
            java.lang.Object r14 = defpackage.arro.q(r14, r1, r7)
            if (r14 != r0) goto L77
            return r0
        L77:
            r1 = r8
            goto L45
        L79:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r10 = r14.booleanValue()
            if (r10 == 0) goto La3
            alog r4 = r12.k
            r4.getClass()
            int r10 = r13.b()
            r7.f = r5
            r7.g = r5
            r7.h = r5
            r7.a = r5
            r7.i = r5
            r7.b = r5
            r7.e = r3
            r2 = r9
            r3 = r11
            r5 = r10
            java.lang.Object r14 = r1.e(r2, r3, r4, r5, r6, r7)
            if (r14 != r0) goto La2
            return r0
        La2:
            return r14
        La3:
            alwo r9 = defpackage.mxa.a
            alvw r9 = r9.d()
            alwl r9 = (defpackage.alwl) r9
            java.lang.String r10 = "Not sending a typing indicator because we should not share our typing status"
            r9.q(r10)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            return r9
        Lb5:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Required value was null."
            r9.<init>(r10)
            throw r9
        Lbd:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mxa.d(wzk, j$.time.Instant, mll, mwc, nfw, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.wzk r8, defpackage.mll r9, java.util.List r10, int r11, j$.time.Instant r12, defpackage.arpe r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mxa.e(wzk, mll, java.util.List, int, j$.time.Instant, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.mwy
            if (r0 == 0) goto L13
            r0 = r5
            mwy r0 = (defpackage.mwy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mwy r0 = new mwy
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            mxa r0 = r0.d
            defpackage.aqil.P(r5)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.aqil.P(r5)
            ncq r5 = r4.d
            akul r5 = r5.b()
            r5.getClass()
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = defpackage.arro.F(r5, r0)
            if (r5 == r1) goto L8b
            r0 = r4
        L48:
            mwc r5 = (defpackage.mwc) r5
            mit r1 = r5.n
            mit r2 = defpackage.mit.ONE_ON_ONE
            if (r1 != r2) goto L88
            mjq r1 = r5.c
            boolean r1 = r1.g
            if (r1 == 0) goto L88
            mis r1 = r5.e
            mis r2 = defpackage.mis.NONE
            if (r1 == r2) goto L5d
            goto L88
        L5d:
            alog r1 = r5.k
            r1.getClass()
            java.lang.Object r1 = defpackage.aqjn.ag(r1)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r1
            msh r1 = r1.f()
            nfw r5 = r5.j
            if (r5 != 0) goto L80
            alwo r5 = defpackage.mxa.a
            alvw r5 = r5.i()
            alwl r5 = (defpackage.alwl) r5
            java.lang.String r0 = "Self identity is not present while sending a typing pre-warm."
            r5.q(r0)
            arnb r5 = defpackage.arnb.a
            return r5
        L80:
            wew r0 = r0.m
            r0.c(r5, r1)
            arnb r5 = defpackage.arnb.a
            return r5
        L88:
            arnb r5 = defpackage.arnb.a
            return r5
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mxa.f(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.mwc r12, defpackage.mll r13, defpackage.arpe r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.mwz
            if (r0 == 0) goto L13
            r0 = r14
            mwz r0 = (defpackage.mwz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            mwz r0 = new mwz
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r12 = r0.a
            mwc r13 = r0.f
            mxa r0 = r0.e
            defpackage.aqil.P(r14)
            r10 = r13
            r13 = r12
            r12 = r10
            goto L85
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            defpackage.aqil.P(r14)
            java.util.concurrent.atomic.AtomicReference r14 = r11.h
            java.lang.Object r14 = r14.get()
            mxd r14 = (defpackage.mxd) r14
            if (r14 != 0) goto L46
            goto L94
        L46:
            nfw r2 = r12.j
            mwc r4 = r14.a
            nfw r4 = r4.j
            if (r4 == 0) goto L94
            if (r2 == 0) goto L5d
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r2 = r2.f()
            boolean r2 = r4.r(r2)
            if (r2 != 0) goto L5b
            goto L5d
        L5b:
            r0 = r11
            goto L87
        L5d:
            mll r6 = r14.b
            mwc r7 = r14.a
            arwe r14 = r11.b
            jyw r2 = new jyw
            r8 = 0
            r9 = 18
            r4 = r2
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            akul r14 = defpackage.qjh.i(r14, r2)
            akul r14 = defpackage.yyb.aN(r14)
            r0.e = r11
            r0.f = r12
            r0.a = r13
            r0.d = r3
            java.lang.Object r14 = defpackage.arro.F(r14, r0)
            if (r14 != r1) goto L84
            return r1
        L84:
            r0 = r11
        L85:
            java.lang.Void r14 = (java.lang.Void) r14
        L87:
            java.util.concurrent.atomic.AtomicReference r14 = r0.h
            mxd r0 = new mxd
            r0.<init>(r12, r13)
            r14.set(r0)
            arnb r12 = defpackage.arnb.a
            return r12
        L94:
            arnb r12 = defpackage.arnb.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mxa.g(mwc, mll, arpe):java.lang.Object");
    }

    @Override // defpackage.mxe
    public final void h() {
        arxm arxmVar = this.g;
        if (arxmVar != null) {
            arxmVar.v(null);
        }
        this.g = null;
    }

    public final void i() {
        this.g = qjh.l(this.b, null, new mwv(this, (arpe) null, 2, (byte[]) null), 3);
    }
}
