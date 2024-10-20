package defpackage;

import j$.util.DesugarDate;
import j$.util.Optional;
import java.util.Date;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uqo implements upp {
    private static final xze e = xze.g("BugleWorkQueue", "WorkQueueWorkManagerScheduler");
    public final uop a;
    public final uqr b;
    public final pqu c;
    public final aogy d;
    private final xnv f;
    private final armf g;
    private final armf h;
    private final agnq i;
    private final armf j;
    private final arwe k;
    private final arwe l;
    private final otw m;
    private final uie n;

    public uqo(uie uieVar, xnv xnvVar, uop uopVar, armf armfVar, armf armfVar2, aogy aogyVar, agnq agnqVar, uqr uqrVar, umz umzVar, pqu pquVar, armf armfVar3, arwe arweVar, arwe arweVar2, otw otwVar) {
        uieVar.getClass();
        xnvVar.getClass();
        uopVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        aogyVar.getClass();
        agnqVar.getClass();
        uqrVar.getClass();
        umzVar.getClass();
        armfVar3.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        this.n = uieVar;
        this.f = xnvVar;
        this.a = uopVar;
        this.g = armfVar;
        this.h = armfVar2;
        this.d = aogyVar;
        this.i = agnqVar;
        this.b = uqrVar;
        this.c = pquVar;
        this.j = armfVar3;
        this.k = arweVar;
        this.l = arweVar2;
        this.m = otwVar;
    }

    @Override // defpackage.upp
    public final akul a(upr uprVar) {
        akul c;
        c = qjh.c(j(), arpj.a, arwf.a, new iqi(uprVar, this, (arpe) null, 19));
        return c;
    }

    @Override // defpackage.upp
    public final akul b(upr uprVar) {
        akul c;
        c = qjh.c(j(), arpj.a, arwf.a, new tyi(this, uprVar, (arpe) null, 17, (byte[]) null));
        return c;
    }

    @Override // defpackage.upp
    public final Optional c(upr uprVar) {
        return Optional.of(arrn.I(j(), null, arwf.b, new uqm(k(uprVar), this, uprVar, (arpe) null, 0), 1));
    }

    @Override // defpackage.upp
    public final boolean d(String str, upo upoVar, UUID uuid) {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|24|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        defpackage.uqo.e.p("Queue " + r9.o() + " is already eagerly evaluating");
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.upr r9, defpackage.arwl r10, java.lang.Runnable r11, defpackage.unf r12, defpackage.arpe r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.uqi
            if (r0 == 0) goto L13
            r0 = r13
            uqi r0 = (defpackage.uqi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            uqi r0 = new uqi
            r0.<init>(r8, r13)
        L18:
            r7 = r0
            java.lang.Object r13 = r7.a
            arpl r0 = defpackage.arpl.a
            int r1 = r7.c
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            upr r9 = r7.d
            defpackage.aqil.P(r13)     // Catch: defpackage.urs -> L59
            goto L56
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            defpackage.aqil.P(r13)
            armf r13 = r8.g     // Catch: defpackage.urs -> L59
            java.lang.Object r13 = r13.b()     // Catch: defpackage.urs -> L59
            r1 = r13
            usb r1 = (defpackage.usb) r1     // Catch: defpackage.urs -> L59
            java.lang.String r13 = r9.o()     // Catch: defpackage.urs -> L59
            r13.getClass()     // Catch: defpackage.urs -> L59
            urt r3 = defpackage.urt.b     // Catch: defpackage.urs -> L59
            r7.d = r9     // Catch: defpackage.urs -> L59
            r7.c = r2     // Catch: defpackage.urs -> L59
            r2 = r13
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.Object r13 = r1.e(r2, r3, r4, r5, r6, r7)     // Catch: defpackage.urs -> L59
            if (r13 != r0) goto L56
            return r0
        L56:
            gvf r13 = (defpackage.gvf) r13     // Catch: defpackage.urs -> L59
            goto L75
        L59:
            xze r10 = defpackage.uqo.e
            java.lang.String r9 = r9.o()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Queue "
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r9 = " is already eagerly evaluating"
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.p(r9)
        L75:
            arnb r9 = defpackage.arnb.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqo.e(upr, arwl, java.lang.Runnable, unf, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        if (r10.n(r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r9v0, types: [upr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [andv] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.upr r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.uqj
            if (r0 == 0) goto L13
            r0 = r10
            uqj r0 = (defpackage.uqj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            uqj r0 = new uqj
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.a
            arwl r9 = (defpackage.arwl) r9
            defpackage.aqil.P(r10)     // Catch: java.util.concurrent.CancellationException -> L2e
            goto L83
        L2e:
            r10 = move-exception
            goto L76
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.a
            akul r9 = (defpackage.akul) r9
            defpackage.aqil.P(r10)     // Catch: java.util.concurrent.CancellationException -> L7c
            goto L63
        L40:
            defpackage.aqil.P(r10)
            if (r9 == 0) goto L83
            uie r10 = r8.n
            ubu r2 = new ubu
            r5 = 10
            r6 = 0
            r2.<init>(r8, r9, r5, r6)
            java.lang.String r9 = "launchToWorkManager"
            akul r9 = r10.c(r9, r2)
            r9.getClass()     // Catch: java.util.concurrent.CancellationException -> L7c
            r0.a = r9     // Catch: java.util.concurrent.CancellationException -> L7c
            r0.d = r4     // Catch: java.util.concurrent.CancellationException -> L7c
            java.lang.Object r10 = defpackage.arro.F(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L7c
            if (r10 != r1) goto L63
            goto L71
        L63:
            arwl r10 = (defpackage.arwl) r10     // Catch: java.util.concurrent.CancellationException -> L7c
            if (r10 == 0) goto L83
            r0.a = r10     // Catch: java.util.concurrent.CancellationException -> L72
            r0.d = r3     // Catch: java.util.concurrent.CancellationException -> L72
            java.lang.Object r9 = r10.n(r0)     // Catch: java.util.concurrent.CancellationException -> L72
            if (r9 != r1) goto L83
        L71:
            return r1
        L72:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L76:
            if (r9 == 0) goto L83
            r9.v(r10)
            goto L83
        L7c:
            r10 = 0
            r9.cancel(r10)
            gtc r9 = defpackage.gtd.a
            return r9
        L83:
            gtc r9 = defpackage.gtd.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqo.f(upr, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.String r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.uqk
            if (r0 == 0) goto L13
            r0 = r7
            uqk r0 = (defpackage.uqk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            uqk r0 = new uqk
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            uqo r6 = r0.d
            defpackage.aqil.P(r7)
            goto L52
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.aqil.P(r7)
            uie r7 = r5.n
            rui r2 = new rui
            r4 = 20
            r2.<init>(r6, r4)
            java.lang.String r6 = "WorkQueueWorkManagerScheduler#removeQueueAssociation"
            akul r6 = r7.d(r6, r2)
            r6.getClass()
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.arro.F(r6, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r6 = r5
        L52:
            armf r6 = r6.j
            java.lang.Object r6 = r6.b()
            mbl r6 = (defpackage.mbl) r6
            java.lang.String r7 = "Bugle.Pwq.ScheduledWorkManagerItems.Count"
            int r0 = defpackage.ush.c()
            r6.e(r7, r0)
            arnb r6 = defpackage.arnb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqo.g(java.lang.String, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01db A[Catch: all -> 0x0042, TryCatch #2 {all -> 0x0042, blocks: (B:15:0x003d, B:16:0x01d7, B:18:0x01db, B:19:0x01f3, B:20:0x01f5), top: B:14:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0204 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #3 {all -> 0x0063, blocks: (B:40:0x005e, B:41:0x017f, B:53:0x01be, B:45:0x01fa, B:47:0x0204, B:51:0x0237), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0237 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0063, blocks: (B:40:0x005e, B:41:0x017f, B:53:0x01be, B:45:0x01fa, B:47:0x0204, B:51:0x0237), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017a A[Catch: all -> 0x0076, Exception -> 0x007a, unc -> 0x007e, TRY_LEAVE, TryCatch #10 {unc -> 0x007e, Exception -> 0x007a, all -> 0x0076, blocks: (B:58:0x0071, B:59:0x0145, B:61:0x017a), top: B:57:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r0v36, types: [agnq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [agnq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [agnq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v11, types: [upr] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15, types: [upr] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25, types: [upr] */
    /* JADX WARN: Type inference failed for: r4v26, types: [upr] */
    /* JADX WARN: Type inference failed for: r4v28, types: [upr] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.upr r20, defpackage.unx r21, defpackage.arpe r22) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqo.h(upr, unx, arpe):java.lang.Object");
    }

    public final Object i(unx unxVar, upr uprVar, unv unvVar, arpe arpeVar) {
        Object e2 = ((utz) xxy.l.get()).e();
        e2.getClass();
        boolean z = false;
        if (((Boolean) e2).booleanValue()) {
            if (uprVar.q().getTime() <= this.f.f().toEpochMilli() && unvVar != unv.WORKMANAGER_ONLY) {
                uoj uojVar = (uoj) this.h.b();
                gsf gsfVar = unxVar.a().b;
                if (gsfVar == null) {
                    gsfVar = gsf.a;
                }
                gsfVar.getClass();
                return uojVar.a(gsfVar, arpeVar);
            }
        } else if (uprVar.q().getTime() <= this.f.f().toEpochMilli()) {
            gsf gsfVar2 = unxVar.a().b;
            if (gsfVar2 == null) {
                gsfVar2 = gsf.a;
            }
            if (d.F(gsfVar2, gsf.a)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public final arwe j() {
        if (this.m.a()) {
            return this.l;
        }
        return this.k;
    }

    public final arwl k(upr uprVar) {
        agnw d;
        agnw d2;
        int i;
        if (this.i.j()) {
            unx c = this.a.c(uprVar.p());
            gsf gsfVar = c.a().b;
            String o = uprVar.o();
            o.getClass();
            Date q = uprVar.q();
            ura uraVar = new ura(urd.a);
            uraVar.w("work_queue_work_manager_ids.queryOnQueue");
            urc urcVar = new urc();
            urcVar.b(o);
            uraVar.k(new agpw(urcVar));
            if (((uqs) agnc.b(uraVar.b())) != null) {
                i = 2;
            } else if (this.i.j()) {
                int i2 = tyr.a;
                uqt uqtVar = new uqt();
                uqtVar.c(o);
                uqtVar.j(Optional.empty());
                uqtVar.i(DesugarDate.from(this.f.f()));
                if (q != null) {
                    uqtVar.b(q);
                }
                if (gsfVar != null) {
                    uqtVar.g(gsfVar.j - 1);
                    uqtVar.e(gsfVar.c);
                    uqtVar.f(gsfVar.d);
                    uqtVar.d(gsfVar.e);
                    uqtVar.h(gsfVar.f);
                }
                uqs a = uqtVar.a(new tyr(17));
                d = agnc.d("$primary");
                d2 = agnc.d("$primary");
                agnc.a(d2, "work_queue_work_manager_ids", a, new uol(d, 9), new uhb(5));
                ((mbl) this.j.b()).e("Bugle.Pwq.ScheduledWorkManagerItems.Count", ush.c());
                uqr uqrVar = this.b;
                synchronized (uqrVar.a) {
                    if (uqrVar.b.isEmpty()) {
                        arwl arwlVar = uqrVar.c;
                        if (arwlVar != null) {
                            arwlVar.v(null);
                        }
                        uqrVar.c = null;
                    }
                    uqrVar.b.add(o);
                }
                i = 1;
            } else {
                throw new IllegalStateException("Check failed.");
            }
            if (i - 1 != 0) {
                xyo d3 = e.d();
                d3.H("Not launching WM work: Queue already has a scheduled task");
                d3.z("queue", uprVar.o());
                d3.q();
                return null;
            }
            return arrn.I(j(), null, arwf.b, new qka(this, uprVar, c, (arpe) null, 11), 1);
        }
        throw new IllegalStateException("launchToWorkManagerInTransaction called outside a transaction");
    }
}
