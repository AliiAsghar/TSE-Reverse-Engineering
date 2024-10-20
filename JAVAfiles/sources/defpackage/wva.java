package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import j$.util.Optional;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wva implements wul {
    public static final alwo a = alwo.o("Bugle");
    public final armf b;
    public final anen c;
    public final anen d;
    public final wuk e;
    public final String f;
    public final apbt g;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final wve i;
    public akul j;
    private final Executor k;
    private final Optional l;
    private final wvc m;

    public wva(armf armfVar, anen anenVar, anen anenVar2, wus wusVar) {
        this.b = armfVar;
        this.c = anenVar;
        this.d = anenVar2;
        this.k = new anew(anenVar);
        this.e = wusVar.a;
        this.f = (String) wusVar.b.orElse("");
        this.g = wusVar.c;
        this.l = wusVar.e;
        Optional optional = wusVar.d;
        optional.getClass();
        wvd wvdVar = (wvd) arsd.k(optional);
        if (wvdVar instanceof wvc) {
            this.m = (wvc) wvdVar;
            this.i = null;
        } else if (wvdVar instanceof wve) {
            this.i = (wve) wvdVar;
            this.m = new wuu(this);
        } else {
            this.m = null;
            this.i = null;
        }
    }

    private final tlf y() {
        tlg tlgVar = new tlg(tlj.a);
        tlgVar.w("getReadRowQuery");
        tlgVar.c(new wki(this, 6));
        return tlgVar.b();
    }

    @Override // defpackage.wul
    public final apbt a(arqr arqrVar) {
        if (((agnq) this.b.b()).j()) {
            try {
                apbt apbtVar = (apbt) arqrVar.a(l());
                if (v(apbtVar)) {
                    return apbtVar;
                }
            } catch (apba e) {
                ((alwl) ((alwl) a.i()).g(e)).D("Failed to update data store due to invalid data. key = %s, subkey = %s", this.e, yyb.bk(this.f));
            }
            throw new IllegalStateException("Failed to update data in settings store");
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // defpackage.wul
    public final Object b(arpe arpeVar) {
        Object F;
        akul f = f();
        if (f != null && (F = arro.F(f, arpeVar)) == arpl.a) {
            return F;
        }
        return arnb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.wul
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.wux
            if (r0 == 0) goto L13
            r0 = r5
            wux r0 = (defpackage.wux) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wux r0 = new wux
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            asai r5 = r4.e()
            r0.c = r3
            java.lang.Object r5 = defpackage.arrn.U(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wva.c(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.wul
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.arqr r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.wuz
            if (r0 == 0) goto L13
            r0 = r6
            wuz r0 = (defpackage.wuz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wuz r0 = new wuz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.aqil.P(r6)
            wop r6 = new wop
            r2 = 12
            r6.<init>(r5, r2)
            akul r5 = r4.j(r6)
            r0.c = r3
            java.lang.Object r6 = defpackage.arro.F(r5, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wva.d(arqr, arpe):java.lang.Object");
    }

    @Override // defpackage.wul
    public final asai e() {
        return armd.m(new qkk(new qkk(new asac(new agpa(y(), (arpe) null, 0)), this, 4), this, 5));
    }

    @Override // defpackage.wvb
    public final akul f() {
        return aktp.ai(new wkf(this, 3), this.k);
    }

    @Override // defpackage.wvb
    public final akul g() {
        return aktp.ai(new wkf(this, 5), this.c).h(new wop(new uxc(this, 17), 11), this.d);
    }

    @Override // defpackage.wvb
    public final akul h() {
        a.m().D("Reading row. key = %s, subkey = %s", this.e, yyb.bk(this.f));
        akul ai = aktp.ai(new wkf(this, 4), this.c);
        if (x()) {
            return ai.i(new wgb(new uxc(this, 18), 5), this.d);
        }
        return ai.h(new wop(new uxc(this, 19), 9), andi.a);
    }

    @Override // defpackage.wvb
    public final akul i(String str) {
        str.getClass();
        if (!TextUtils.isEmpty(this.f) && !TextUtils.isEmpty(str) && !this.f.equals(str)) {
            akul ai = aktp.ai(new vze(this, str, 11), this.k);
            ai.getClass();
            return ai;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.wvb
    public final akul j(algk algkVar) {
        if (x()) {
            return h().h(new wop(new wup(this, algkVar, 5), 10), this.k);
        }
        akul ai = aktp.ai(new vze(this, algkVar, 12), this.k);
        ai.getClass();
        return ai;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wvb
    public final alor k() {
        tlg tlgVar = new tlg(tlj.a);
        tlgVar.w("getAllExistingDataSync");
        tlgVar.c(new wki(this, 8));
        alog t = tlgVar.b().t();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        t.getClass();
        alur it = t.iterator();
        while (it.hasNext()) {
            tla tlaVar = (tla) it.next();
            try {
                byte[] k = tlaVar.k();
                if (k != null) {
                    String h = tlaVar.h();
                    if (h == null) {
                        h = "";
                    }
                    linkedHashMap.put(h, p(k));
                }
            } catch (apba unused) {
            }
        }
        return alzz.bc(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, apbt] */
    @Override // defpackage.wvb
    public final apbt l() {
        Optional s = s();
        if (s.isPresent()) {
            return s.get();
        }
        if (this.i != null && !this.h.get()) {
            if (this.i != null) {
                apbt r = r(new wop(new uxc(this, 20), 8));
                this.h.set(true);
                try {
                    if (!u(r)) {
                        this.i.b();
                    }
                } catch (Throwable th) {
                    ((alwl) ((alwl) a.i()).g(th)).q("Failed to clear previous data.");
                }
                r.getClass();
                s = Optional.of(r);
            } else {
                throw new IllegalStateException("Migration is not defined.");
            }
        } else if (this.m != null && !this.h.get()) {
            throw new IllegalStateException("Async migration is not done");
        }
        Object orElse = s.orElse(this.g);
        orElse.getClass();
        return (apbt) orElse;
    }

    @Override // defpackage.wvb
    public final apbt m(algk algkVar) {
        Object c = ((agnq) this.b.b()).c("SettingsStoreImpl#updateDataSync", new ubu(this, algkVar, 15));
        c.getClass();
        return (apbt) c;
    }

    @Override // defpackage.wvb
    public final void n() {
        Object apply;
        tle tleVar = new tle();
        tleVar.f("clearSync");
        apply = new wki(this, 5).apply(new tli());
        tleVar.a = new agpw((tli) apply);
        tleVar.d();
    }

    public final akul o(Optional optional) {
        boolean z = true;
        if (optional.isPresent()) {
            a.m().q("Skip migration because settings store has value.");
            this.h.set(true);
            akul ag = aktp.ag(optional.get());
            ag.getClass();
            return ag;
        }
        if (this.m != null && !this.h.get()) {
            akul akulVar = this.j;
            if (akulVar != null) {
                return akulVar;
            }
            a.m().D("Run migration. key = %s, subkey = %s", this.e, yyb.bk(this.f));
            try {
                wvc wvcVar = this.m;
                akul i = wvcVar.b().e(apba.class, new wop(new uxc(this, 15), 13), this.d).h(new wop(new wup(this, wvcVar, 3), 14), this.k).i(new wgb(new wup(this, wvcVar, 4), 6), this.d).i(new wgb(new uxc(this, 16), 7), this.c);
                this.j = i;
                i.k(new isn(this, 12), this.d);
                return i;
            } catch (Exception e) {
                ((alwl) ((alwl) a.i()).g(e)).q("Failed to call migration");
                this.j = null;
                akul af = aktp.af(e);
                af.getClass();
                return af;
            }
        }
        alwl alwlVar = (alwl) a.i();
        if (this.m != null) {
            z = false;
        }
        alwlVar.I("Migration cannot be run because it is not set or has already run. migration is null = %s, migration has run = %s", z, this.h.get());
        akul ag2 = aktp.ag(this.g);
        ag2.getClass();
        return ag2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.function.Supplier] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, apbt] */
    public final apbt p(byte[] bArr) {
        Object obj;
        if (this.l.isPresent()) {
            try {
                ?? d = this.g.getParserForType().d(bArr);
                d.getClass();
                return d;
            } catch (apba e) {
                obj = this.l.get().get();
                apba apbaVar = (apba) obj;
                apbaVar.getClass();
                armd.c(apbaVar, e);
                throw apbaVar;
            }
        }
        ?? d2 = this.g.getParserForType().d(bArr);
        d2.getClass();
        return d2;
    }

    public final apbt q() {
        Object orElse = s().orElse(this.g);
        orElse.getClass();
        return (apbt) orElse;
    }

    public final apbt r(algk algkVar) {
        return (apbt) ((agnq) this.b.b()).c("SettingsStoreImpl#updateDataSyncInternal", new ubu(this, algkVar, 16));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional s() {
        Optional optional;
        alog t = y().t();
        if (t != null && !t.isEmpty()) {
            if (((alsx) t).c <= 1) {
                byte[] k = ((tla) t.get(0)).k();
                if (k != null) {
                    optional = Optional.of(p(k));
                } else {
                    optional = null;
                }
                if (optional == null) {
                    return Optional.of(this.g);
                }
                return optional;
            }
            throw new IllegalStateException("Found more than one instance of data");
        }
        return Optional.empty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(defpackage.tlf r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.wuy
            if (r0 == 0) goto L13
            r0 = r6
            wuy r0 = (defpackage.wuy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wuy r0 = new wuy
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            wva r5 = r0.d
            defpackage.aqil.P(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.aqil.P(r6)
            akul r5 = r5.s()
            r5.getClass()
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = defpackage.arro.F(r5, r0)
            if (r6 == r1) goto L89
            r5 = r4
        L46:
            alog r6 = (defpackage.alog) r6
            r0 = 0
            if (r6 == 0) goto L88
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L52
            goto L88
        L52:
            int r1 = r6.size()
            if (r1 > r3) goto L6b
            r1 = 0
            java.lang.Object r6 = r6.get(r1)
            tla r6 = (defpackage.tla) r6
            byte[] r6 = r6.k()
            if (r6 == 0) goto L6a
            apbt r5 = r5.p(r6)
            return r5
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            int r6 = r6.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected one entry, found "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L88:
            return r0
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wva.t(tlf, arpe):java.lang.Object");
    }

    public final boolean u(apbt apbtVar) {
        if (apbtVar != null && !this.g.equals(apbtVar)) {
            return false;
        }
        return true;
    }

    public final boolean v(apbt apbtVar) {
        byte[] byteArray = apbtVar.toByteArray();
        byteArray.getClass();
        return w(byteArray);
    }

    public final boolean w(byte[] bArr) {
        Object apply;
        agnw d;
        agnw d2;
        alwo alwoVar = a;
        alwoVar.m().D("Saving row. key = %s, subkey = %s", this.e, yyb.bk(this.f));
        tlh tlhVar = new tlh();
        tlhVar.aj("SettingsStoreImpl#saveRow");
        apply = new wki(this, 9).apply(new tli());
        tlhVar.Z(new agpw((tli) apply));
        tlhVar.a.put(GroupManagementRequest.DATA_TAG, bArr);
        if (tlhVar.a().e() == 0) {
            int i = tif.a;
            tlb tlbVar = new tlb();
            tlbVar.c(this.e.a());
            tlbVar.d(this.f);
            tlbVar.b(bArr);
            tla a2 = tlbVar.a();
            d = agnc.d("$primary");
            d2 = agnc.d("$primary");
            long a3 = agnc.a(d2, "settings", a2, new tkg(d, 3), new ter(a2, 8));
            Long valueOf = Long.valueOf(a3);
            alvw m = alwoVar.m();
            valueOf.getClass();
            m.s("Inserted settings data, id = %d", a3);
            valueOf.getClass();
            if (a3 >= 0) {
                return true;
            }
            return false;
        }
        alwoVar.m().q("Updated settings data");
        return true;
    }

    public final boolean x() {
        if (this.m != null && !this.h.get()) {
            return true;
        }
        return false;
    }
}
