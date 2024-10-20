package defpackage;

import io.grpc.Status;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vbq extends vby {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider");
    public static final utz b = uuh.r(159662717, "new_rcs_token_resets_otp_backoff");
    public static final utz c = uuh.f(uuh.b, "tachyon_otp_retry_multiplier_in_millis", 3600000);
    public static final utz d = uuh.c(uuh.b, "tachyon_otp_retry_backoff_base", 2.0d);
    public static final utz e = uuh.e(uuh.b, "tachyon_otp_retry_max_exponent", 7);
    static final utz f = uuh.e(uuh.b, "tachyon_otp_wait_seconds", (int) TimeUnit.MINUTES.toSeconds(30));
    private vel A;
    private final rtb B;
    private final ahmv C;
    public final vcs g;
    public final vgm h;
    public final aneo i;
    public final armf j;
    public final Object k;
    public dtq l;
    private final armf u;
    private final yjy v;
    private final yjr w;
    private final armf x;
    private final anen y;
    private final Object z;

    public vbq(anen anenVar, aneo aneoVar, veo veoVar, wpp wppVar, xnv xnvVar, Optional optional, rtb rtbVar, ahmv ahmvVar, vcs vcsVar, armf armfVar, yjy yjyVar, yjr yjrVar, armf armfVar2, armf armfVar3, aneo aneoVar2, vgm vgmVar) {
        super(anenVar, aneoVar, veoVar, xnvVar, wppVar, optional);
        this.k = new Object();
        this.z = new Object();
        this.g = vcsVar;
        this.B = rtbVar;
        this.C = ahmvVar;
        this.u = armfVar;
        this.h = vgmVar;
        this.i = aneoVar;
        this.v = yjyVar;
        this.w = yjrVar;
        this.j = armfVar2;
        this.x = armfVar3;
        this.y = aneoVar2;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    @Override // defpackage.vby
    protected final vfc a(long j) {
        alvw d2 = a.d();
        d2.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "createRegisterRefreshRpcHandler", 192, "PhoneRegistrationProvider.java")).q("Creating phone register refresh RPC handler");
        Optional of = Optional.of(this.h.a);
        uvp uvpVar = new uvp(this, 13);
        uea ueaVar = new uea(this, 7);
        ahmv ahmvVar = this.C;
        wpp wppVar = (wpp) ahmvVar.c.b();
        wppVar.getClass();
        wyp wypVar = (wyp) ahmvVar.d.b();
        wypVar.getClass();
        wpp wppVar2 = (wpp) ahmvVar.b.b();
        wppVar2.getClass();
        msk mskVar = (msk) ahmvVar.g.b();
        mskVar.getClass();
        nib nibVar = (nib) ahmvVar.f.b();
        nibVar.getClass();
        anen anenVar = (anen) ahmvVar.h.b();
        anenVar.getClass();
        return new vew(wppVar, wypVar, wppVar2, mskVar, ahmvVar.e, nibVar, ahmvVar.i, ahmvVar.a, anenVar, j, of, uvpVar, ueaVar, this.h);
    }

    @Override // defpackage.vby
    public final /* synthetic */ vgp b() {
        return this.h;
    }

    @Override // defpackage.vby
    public final synchronized akul c() {
        return m().h();
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    @Override // defpackage.vby
    public final akul d() {
        alvi alviVar = a;
        alvw g = alviVar.g();
        g.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "doFirstTimeTachyonRegistration", 223, "PhoneRegistrationProvider.java")).q("doing first time phone tachyon registration");
        if (!this.v.q()) {
            alvw g2 = alviVar.g();
            g2.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "doFirstTimeTachyonRegistration", 226, "PhoneRegistrationProvider.java")).q("SIM is not present. Do not perform first-time Tachyon phone registration.");
            return aktp.af(new aqwb(Status.k.d(new IllegalStateException("SIM is not present"))));
        }
        if (!this.w.y()) {
            alvw g3 = alviVar.g();
            g3.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "doFirstTimeTachyonRegistration", 235, "PhoneRegistrationProvider.java")).q("Not default SMS app. Do not perform first-time Tachyon phone registration.");
            return aktp.af(new aqwb(Status.k.d(new IllegalStateException("Not default SMS app"))));
        }
        rtb rtbVar = this.B;
        vgm vgmVar = this.h;
        vti vtiVar = (vti) rtbVar.k.b();
        vtiVar.getClass();
        vcs vcsVar = (vcs) rtbVar.h.b();
        vcsVar.getClass();
        anen anenVar = (anen) rtbVar.g.b();
        anenVar.getClass();
        ((anen) rtbVar.m.b()).getClass();
        wpp wppVar = (wpp) rtbVar.i.b();
        wppVar.getClass();
        wyp wypVar = (wyp) rtbVar.c.b();
        wypVar.getClass();
        msk mskVar = (msk) rtbVar.d.b();
        mskVar.getClass();
        ((oua) rtbVar.j.b()).getClass();
        vfa vfaVar = new vfa(vtiVar, vcsVar, anenVar, wppVar, wypVar, mskVar, rtbVar.f, rtbVar.b, rtbVar.e, rtbVar.l, rtbVar.a, vgmVar);
        byte[] bArr = null;
        return m().h().i(new uwa(this, 17), this.y).i(new vbl(this, vfaVar, 5, bArr), this.n).i(new uwa(this, 18), this.o).i(new vbl(this, vfaVar, 6, bArr), this.o).i(new uwa(vfaVar, 19), this.o).h(new vbj(3), this.o).i(new uwa(this, 20), this.o).i(new vbn(this, 1), this.n);
    }

    @Override // defpackage.vby
    protected final akul e() {
        return m().d();
    }

    @Override // defpackage.vby
    public final akul f() {
        return m().c();
    }

    @Override // defpackage.vby
    protected final akul g(byte[] bArr) {
        return m().b.j(new veg(bArr, 0)).h(new vdx(13), andi.a);
    }

    @Override // defpackage.vby
    protected final akul h(long j) {
        return m().b.j(new mdq(j, 13)).h(new vej(11), andi.a);
    }

    @Override // defpackage.vby
    protected final akul i(aqer aqerVar) {
        aqfg aqfgVar = aqerVar.d;
        if (aqfgVar == null) {
            aqfgVar = aqfg.a;
        }
        return akul.g(aktp.as(v(aqfgVar), p(aqerVar.h)).n(new vbo(this, 1), andi.a));
    }

    @Override // defpackage.vba
    public final String j() {
        return "RCS";
    }

    public final vel m() {
        vel velVar;
        synchronized (this.z) {
            if (this.A == null) {
                this.A = ((wyp) this.u.b()).D(this.h.a);
            }
            velVar = this.A;
        }
        return velVar;
    }

    @Override // defpackage.vby
    protected final akul n(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return aktp.ag(bArr);
        }
        alvw g = a.g();
        g.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "checkAlternativeIfNeeded", 291, "PhoneRegistrationProvider.java")).q("Check if data exists for alternative.");
        vel m = m();
        return m.b.g().i(new vek(m, 0), m.c).h(new uzs(bArr, 11), this.o);
    }

    public final akul o(String str) {
        alvw g = a.g();
        g.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider", "provideOtpCode", 564, "PhoneRegistrationProvider.java")).q("Received OTP code");
        return akul.g(m().f()).i(new vbl(this, new vfo(((kru) ((qdq) this.x.b()).a).a.cF, this.h, str), 4, null), this.n);
    }

    public final akul p(aozb aozbVar) {
        return m().b.j(new veg(aozbVar.D(), 1)).h(new vdx(16), andi.a);
    }
}
