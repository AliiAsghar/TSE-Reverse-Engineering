package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adkd {
    private static final advp b = new advp("RcsDefaultOnConsentCacheImpl");
    public final adnk a;
    private final aegu c;

    public adkd(adnk adnkVar, aegu aeguVar) {
        this.a = adnkVar;
        this.c = aeguVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (defpackage.aotl.l(r2).plusMillis(((java.lang.Long) defpackage.aczv.s().a.aq.a()).longValue()).isBefore(r1) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.whk a() {
        /*
            r5 = this;
            adnk r0 = r5.a
            whm r0 = r0.e()
            int r1 = r0.h
            whk r1 = defpackage.whk.b(r1)
            if (r1 != 0) goto L10
            whk r1 = defpackage.whk.UNRECOGNIZED
        L10:
            whk r2 = defpackage.whk.OOB_CONSENT
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L19
            goto L5c
        L19:
            adnk r1 = r5.a
            j$.util.Optional r1 = r1.g()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L26
            goto L52
        L26:
            aegu r1 = r5.c
            j$.time.Instant r1 = r1.f()
            apct r2 = r0.g
            if (r2 != 0) goto L32
            apct r2 = defpackage.apct.a
        L32:
            j$.time.Instant r2 = defpackage.aotl.l(r2)
            aczv r3 = defpackage.aczv.s()
            aczu r3 = r3.a
            acza r3 = r3.aq
            java.lang.Object r3 = r3.a()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            j$.time.Instant r2 = r2.plusMillis(r3)
            boolean r1 = r2.isBefore(r1)
            if (r1 == 0) goto L5c
        L52:
            adnk r0 = r5.a
            whm r1 = defpackage.whm.a
            r0.w(r1)
            whk r0 = defpackage.whk.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED
            return r0
        L5c:
            int r0 = r0.h
            whk r0 = defpackage.whk.b(r0)
            if (r0 != 0) goto L66
            whk r0 = defpackage.whk.UNRECOGNIZED
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adkd.a():whk");
    }

    public final void b() {
        advr.d(b, "cleanUpRcsDefaultOnConsentCache", new Object[0]);
        this.a.w(whm.a);
        this.a.p(null);
    }

    public final synchronized void c(whm whmVar) {
        whk b2 = whk.b(whmVar.h);
        if (b2 == null) {
            b2 = whk.UNRECOGNIZED;
        }
        whk a = a();
        if ((b2.equals(whk.OOB_CONSENT) || b2.equals(whk.NO_OOB_CONSENT)) && a.equals(whk.LEGAL_FYI_SEEN)) {
            advr.d(b, "setRcsDefaultOnConfiguration: skipped setting OOB-provided consent as user already saw Legal FYI.", new Object[0]);
        } else {
            advr.d(b, "setRcsDefaultOnConfiguration", new Object[0]);
            this.a.w(whmVar);
        }
    }

    public final void d() {
        Instant f = this.c.f();
        aozy createBuilder = apct.a.createBuilder();
        long epochSecond = f.getEpochSecond();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((apct) createBuilder.b).b = epochSecond;
        int nano = f.getNano();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((apct) createBuilder.b).c = nano;
        apct apctVar = (apct) createBuilder.s();
        try {
            this.a.b.p("rcs_provisioning_rcs_default_on_server_update_time_key", apctVar);
            advr.l(adnk.a, "putRcsProvisioningRcsDefaultOnServerUpdateTime %s", apctVar);
        } catch (adux e) {
            advr.j(e, adnk.a, "Error while putting RCS Default On server update time in bugle storage", new Object[0]);
        }
    }

    public final boolean e() {
        whk a = a();
        if (!a.equals(whk.LEGAL_FYI_SEEN) && !a.equals(whk.OOB_CONSENT)) {
            return false;
        }
        return true;
    }
}
