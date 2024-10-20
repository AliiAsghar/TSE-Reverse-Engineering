package defpackage;

import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxu extends gap {
    final CancellationSignal c = new CancellationSignal();
    public final agmc d = new kxs(this);
    public final agmc e = new kxt(this);
    final /* synthetic */ kxx f;

    public kxu(kxx kxxVar) {
        this.f = kxxVar;
    }

    @Override // defpackage.fzz
    public final void b() {
        if (((pgj) this.f.p.b()).a() || ((pgq) this.f.q.b()).a()) {
            this.c.cancel();
        }
        kxx kxxVar = this.f;
        if (kxxVar.u == kxw.FINISHED) {
            kxxVar.u = kxw.REFRESHING;
        }
        super.b();
    }

    @Override // defpackage.gap
    public final /* synthetic */ Object d(Object obj) {
        kzd kzdVar = ((kzx) obj).a;
        return new kxk(kzdVar.l, kzdVar.L, kzdVar.Q, kzdVar.U);
    }

    @Override // defpackage.gap
    public final void g(atal atalVar, gam gamVar) {
        akrc b = this.f.f.b("ConversationListDataSources.create#loadAfter");
        try {
            qiu.h(aktp.ag(yiy.a).h(new kxr(this, atalVar, gamVar, 0), this.f.g));
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gap
    public final void h(atal atalVar, gam gamVar) {
        akrc b = this.f.f.b("ConversationListDataSources.create#loadBefore");
        try {
            qiu.h(aktp.ag(yiy.a).h(new kxr(this, atalVar, gamVar, 1), this.f.g));
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gap
    public final void i(atal atalVar, final gan ganVar) {
        final int i;
        akrc b = this.f.f.b("ConversationListDataSources.create#loadInitial");
        try {
            final kxk kxkVar = (kxk) atalVar.b;
            if (kxkVar != null) {
                this.f.t = false;
            }
            kxx kxxVar = this.f;
            if (kxxVar.t) {
                i = kxxVar.v;
            } else {
                i = atalVar.a;
            }
            akrh e = aktp.e("ConversationListDataSources#loadInitialSync");
            try {
                kxx kxxVar2 = this.f;
                if (kxxVar2.x == null) {
                    kxxVar2.x = aktp.ag(yiy.a);
                }
                kxx kxxVar3 = this.f;
                akul h = kxxVar3.x.h(new algk() { // from class: kxq
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
                    /* JADX WARN: Removed duplicated region for block: B:18:0x036c  */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x038e A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:48:0x03e9  */
                    /* JADX WARN: Removed duplicated region for block: B:61:0x04b9  */
                    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:72:0x0077  */
                    /* JADX WARN: Type inference failed for: r0v86 */
                    /* JADX WARN: Type inference failed for: r0v87 */
                    /* JADX WARN: Type inference failed for: r0v88 */
                    /* JADX WARN: Type inference failed for: r0v89 */
                    /* JADX WARN: Type inference failed for: r0v90 */
                    /* JADX WARN: Type inference failed for: r0v91, types: [int] */
                    /* JADX WARN: Type inference failed for: r0v95 */
                    /* JADX WARN: Type inference failed for: r1v75, types: [mbl] */
                    @Override // defpackage.algk
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object apply(java.lang.Object r19) {
                        /*
                            Method dump skipped, instructions count: 1383
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxq.apply(java.lang.Object):java.lang.Object");
                    }
                }, kxxVar3.g);
                e.b(h);
                qiu.h(h);
                e.close();
                b.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
