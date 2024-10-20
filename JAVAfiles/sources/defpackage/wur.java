package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wur implements wul {
    public static final /* synthetic */ int d = 0;
    private static final alwo e = alwo.o("Bugle");
    public final String a;
    public final AtomicBoolean b;
    public final ConcurrentHashMap c;
    private final wul f;
    private final wuk g;

    public wur(wul wulVar, wus wusVar, wut wutVar) {
        this.f = wulVar;
        this.g = wusVar.a;
        this.a = (String) wusVar.b.orElse("");
        this.b = wutVar.a;
        this.c = wutVar.b;
    }

    @Override // defpackage.wul
    public final apbt a(arqr arqrVar) {
        String str = this.a;
        apbt a = this.f.a(arqrVar);
        str.getClass();
        this.c.put(str, a);
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.wul
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.wum
            if (r0 == 0) goto L13
            r0 = r5
            wum r0 = (defpackage.wum) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wum r0 = new wum
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            wur r0 = r0.d
            defpackage.aqil.P(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.aqil.P(r5)
            wul r5 = r4.f
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            j$.util.concurrent.ConcurrentHashMap r5 = r0.c
            java.lang.String r0 = r0.a
            r5.remove(r0)
            arnb r5 = defpackage.arnb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wur.b(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.wul
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.wun
            if (r0 == 0) goto L13
            r0 = r5
            wun r0 = (defpackage.wun) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wun r0 = new wun
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            wur r0 = r0.d
            defpackage.aqil.P(r5)
            goto L62
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.aqil.P(r5)
            j$.util.concurrent.ConcurrentHashMap r5 = r4.c
            java.lang.String r2 = r4.a
            java.lang.Object r5 = r5.get(r2)
            apbt r5 = (defpackage.apbt) r5
            if (r5 == 0) goto L54
            alwo r0 = defpackage.wur.e
            alvw r0 = r0.m()
            wuk r1 = r4.g
            java.lang.String r2 = r4.a
            java.lang.String r2 = defpackage.yyb.bk(r2)
            java.lang.String r3 = "Reading from cache. key = %s, subkey = %s"
            r0.D(r3, r1, r2)
            return r5
        L54:
            wul r5 = r4.f
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L61
            return r1
        L61:
            r0 = r4
        L62:
            r1 = r5
            apbt r1 = (defpackage.apbt) r1
            j$.util.concurrent.ConcurrentHashMap r2 = r0.c
            java.lang.String r0 = r0.a
            r0.getClass()
            r2.put(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wur.c(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.wul
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.arqr r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.wuq
            if (r0 == 0) goto L13
            r0 = r6
            wuq r0 = (defpackage.wuq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wuq r0 = new wuq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            wur r5 = r0.d
            defpackage.aqil.P(r6)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.aqil.P(r6)
            wul r6 = r4.f
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r6.d(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r5 = r4
        L42:
            r0 = r6
            apbt r0 = (defpackage.apbt) r0
            j$.util.concurrent.ConcurrentHashMap r1 = r5.c
            java.lang.String r5 = r5.a
            r5.getClass()
            r1.put(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wur.d(arqr, arpe):java.lang.Object");
    }

    @Override // defpackage.wul
    public final asai e() {
        return this.f.e();
    }

    @Override // defpackage.wvb
    public final akul f() {
        return this.f.f().h(new wop(new uxc(this, 9), 3), andi.a);
    }

    @Override // defpackage.wvb
    public final akul g() {
        if (this.b.get()) {
            e.m().D("Reading all data from cache. key = %s, subkey = %s", this.g, yyb.bk(this.a));
            akul ag = aktp.ag(alzz.bc(this.c));
            ag.getClass();
            return ag;
        }
        return this.f.g().h(new wop(new uxc(this, 10), 7), andi.a);
    }

    @Override // defpackage.wvb
    public final akul h() {
        apbt apbtVar = (apbt) this.c.get(this.a);
        if (apbtVar != null) {
            e.m().D("Reading from cache. key = %s, subkey = %s", this.g, yyb.bk(this.a));
            akul ag = aktp.ag(apbtVar);
            ag.getClass();
            return ag;
        }
        return this.f.h().h(new wop(new uxc(this, 11), 4), andi.a);
    }

    @Override // defpackage.wvb
    public final akul i(String str) {
        return this.f.i(str).h(new wop(new wup(this, str, 0), 6), andi.a);
    }

    @Override // defpackage.wvb
    public final akul j(algk algkVar) {
        return this.f.j(algkVar).h(new wop(new uxc(this, 13), 5), andi.a);
    }

    @Override // defpackage.wvb
    public final alor k() {
        if (this.b.get()) {
            e.m().D("Reading all data from cache. key = %s, subkey = %s", this.g, yyb.bk(this.a));
            return alzz.bc(this.c);
        }
        wul wulVar = this.f;
        ConcurrentHashMap concurrentHashMap = this.c;
        alor k = wulVar.k();
        concurrentHashMap.putAll(k);
        this.b.set(true);
        return k;
    }

    @Override // defpackage.wvb
    public final apbt l() {
        apbt apbtVar = (apbt) this.c.get(this.a);
        if (apbtVar != null) {
            e.m().D("Reading from cache. key = %s, subkey = %s", this.g, yyb.bk(this.a));
            return apbtVar;
        }
        wul wulVar = this.f;
        ConcurrentHashMap concurrentHashMap = this.c;
        String str = this.a;
        apbt l = wulVar.l();
        str.getClass();
        concurrentHashMap.put(str, l);
        return l;
    }

    @Override // defpackage.wvb
    public final apbt m(algk algkVar) {
        String str = this.a;
        apbt m = this.f.m(algkVar);
        str.getClass();
        this.c.put(str, m);
        return m;
    }

    @Override // defpackage.wvb
    public final void n() {
        this.f.n();
        this.c.remove(this.a);
    }
}
