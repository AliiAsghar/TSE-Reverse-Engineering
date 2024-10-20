package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xdl implements psz {
    public static final alwo a = alwo.o("BugleTachygram");
    public final xyd b;
    public final xds c;
    public final anen d;
    public final xnv e;
    public final lgg f;
    private final xdq g;
    private final xdt h;

    public xdl(xyd xydVar, xds xdsVar, anen anenVar, xdq xdqVar, xnv xnvVar, xdt xdtVar, lgg lggVar) {
        this.b = xydVar;
        this.c = xdsVar;
        this.d = anenVar;
        this.g = xdqVar;
        this.e = xnvVar;
        this.h = xdtVar;
        this.f = lggVar;
    }

    public final akul a(msh mshVar) {
        xdq xdqVar = this.g;
        byte[] bArr = null;
        akbj akbjVar = new akbj(new uvj(xdqVar, mshVar, 17, bArr), xdqVar.f);
        akbj akbjVar2 = (akbj) xdqVar.e.putIfAbsent(mshVar, akbjVar);
        if (akbjVar2 != null) {
            akbjVar = akbjVar2;
        }
        ((alwl) ((alwl) xdq.a.g()).h("com/google/android/apps/messaging/shared/tachygram/capabilities/TachygramUserTransportAdapter", "fetchCapabilities", 151, "TachygramUserTransportAdapter.java")).q("Reusing capabilities request due to concurrent outgoing requests.");
        return akul.g(akbjVar.c()).i(new wkh(this, mshVar, 5, bArr), this.d);
    }

    @Override // defpackage.psz
    public final akul b(msh mshVar) {
        if (mshVar.g() == null) {
            return aktp.af(new psx("Failed to get Rcs Capabilities from tachygram library as remoteUserId is null."));
        }
        return this.c.a(mshVar).i(new wkh(this, mshVar, 4, null), this.d).h(new xdh(2), this.d);
    }

    @Override // defpackage.psz
    public final akul c(msh mshVar) {
        xdq xdqVar = this.g;
        byte[] bArr = null;
        return xdqVar.b(new uvj(xdqVar, mshVar, 18, bArr), "Failed to get user's online state from tachygram library.", 250, mshVar).h(new whh(this, mshVar, 10), this.d).i(new wkh(this, mshVar, 6, bArr), this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x01f2, code lost:
    
        if (((defpackage.psv) r12.get()).f() == false) goto L69;
     */
    @Override // defpackage.psz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ammd d(defpackage.msh r12) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xdl.d(msh):ammd");
    }

    @Override // defpackage.psz
    public final Optional f(msh mshVar) {
        Optional map = this.c.c(mshVar).map(new wmi(19)).map(new wmi(20));
        if (map.isPresent()) {
            alvw n = a.n();
            n.X(ptc.a, (psv) map.get());
            ((alwl) n.h("com/google/android/apps/messaging/shared/tachygram/capabilities/RcsContactsTachygramAdapter", "logCachedRecipientRcsAvailabilities", 332, "RcsContactsTachygramAdapter.java")).q("Returning cached capabilities.");
        } else {
            ((alwl) a.n().h("com/google/android/apps/messaging/shared/tachygram/capabilities/RcsContactsTachygramAdapter", "logCachedRecipientRcsAvailabilities", 334, "RcsContactsTachygramAdapter.java")).q("No cached Rcs capabilities found.");
        }
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (((defpackage.pto) r1.get()).f(r0.d.f()) == false) goto L8;
     */
    @Override // defpackage.psz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.util.Optional g(defpackage.msh r7) {
        /*
            r6 = this;
            xds r0 = r6.c
            j$.util.Optional r1 = r0.c(r7)
            boolean r2 = r1.isPresent()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.get()
            xnv r3 = r0.d
            j$.time.Instant r3 = r3.f()
            pto r2 = (defpackage.pto) r2
            boolean r2 = r2.f(r3)
            if (r2 != 0) goto L1f
            goto L23
        L1f:
            j$.util.Optional r1 = r0.d(r7)
        L23:
            wmi r7 = new wmi
            r0 = 19
            r7.<init>(r0)
            j$.util.Optional r7 = r1.map(r7)
            wmi r0 = new wmi
            r1 = 20
            r0.<init>(r1)
            j$.util.Optional r7 = r7.map(r0)
            boolean r0 = r7.isPresent()
            java.lang.String r1 = "getCachedCapabilitiesFromLocalCache"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/tachygram/capabilities/RcsContactsTachygramAdapter"
            java.lang.String r3 = "RcsContactsTachygramAdapter.java"
            if (r0 == 0) goto L66
            alwo r0 = defpackage.xdl.a
            alvw r0 = r0.g()
            alwl r0 = (defpackage.alwl) r0
            alvz r4 = defpackage.ptc.a
            java.lang.Object r5 = r7.get()
            psv r5 = (defpackage.psv) r5
            r0.X(r4, r5)
            r4 = 107(0x6b, float:1.5E-43)
            alvw r0 = r0.h(r2, r1, r4, r3)
            alwl r0 = (defpackage.alwl) r0
            java.lang.String r1 = "Returning cached capabilities."
            r0.q(r1)
            goto L7b
        L66:
            alwo r0 = defpackage.xdl.a
            alvw r0 = r0.g()
            alwl r0 = (defpackage.alwl) r0
            r4 = 109(0x6d, float:1.53E-43)
            alvw r0 = r0.h(r2, r1, r4, r3)
            alwl r0 = (defpackage.alwl) r0
            java.lang.String r1 = "No cached capabilities found."
            r0.q(r1)
        L7b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xdl.g(msh):j$.util.Optional");
    }
}
