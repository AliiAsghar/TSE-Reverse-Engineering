package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpt extends acpq {
    public static final advp x = new advp("RcsMobileConfigurationFlags");
    private final anen A;
    private Optional B = Optional.empty();
    private Optional C = Optional.empty();
    private final AtomicLong D;
    private final Duration E;
    private final Duration F;
    private final acpp G;
    private final acpp H;
    private final acpp I;
    private final acpp J;
    private final acpp K;
    private final acpp L;
    private final acpp M;
    private final acpp N;
    private final acpp O;
    private final acpp P;
    private final acpp Q;
    private acps R;
    private acps S;
    private acps T;
    private acps U;
    private acps V;
    private acps W;
    private acps X;
    private acps Y;
    private acps Z;
    private acps aa;
    private acps ab;
    private acps ac;
    private acps ad;
    private acps ae;
    private acps af;
    private acps ag;
    private acps ah;
    private acps ai;
    private acps aj;
    private final armf y;
    private final armf z;

    public acpt(armf armfVar, armf armfVar2, anen anenVar) {
        AtomicLong atomicLong = new AtomicLong();
        this.D = atomicLong;
        this.y = armfVar;
        this.z = armfVar2;
        this.A = anenVar;
        if (acpq.a == null) {
            acpq.H(((acpo) acrk.a(acpo.class)).a());
        }
        if (acpq.a != null) {
            acpq acpqVar = acpq.a;
            this.G = acpqVar.c();
            this.H = acpqVar.e();
            this.I = acpqVar.h();
            this.J = acpqVar.i();
            this.K = acpqVar.z();
            this.L = acpqVar.k();
            this.M = acpqVar.l();
            this.N = acpqVar.A();
            this.O = acpqVar.B();
            this.P = acpqVar.D();
            this.Q = acpqVar.f();
            Duration ofMillis = Duration.ofMillis(((Long) aczv.s().a.Y.a()).longValue());
            this.E = ofMillis;
            Duration ofMillis2 = Duration.ofMillis(((Long) aczv.s().a.Z.a()).longValue());
            this.F = ofMillis2;
            atomicLong.set(Instant.now().plus(ofMillis2).minus(ofMillis).toEpochMilli());
            return;
        }
        throw new IllegalStateException("RcsFlags is not initialized!");
    }

    public static final Integer O(int i) {
        int i2 = i - 2;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    return 2;
                }
                return 3;
            }
            return 1;
        }
        return 0;
    }

    private final Optional P() {
        if (N(false)) {
            if (((Boolean) aczv.s().a.W.a()).booleanValue() && !aiut.g()) {
                M();
            } else {
                albo.bR(this.A.submit(new aaze(this, 4)), new pum(9), andi.a);
            }
        }
        return this.C;
    }

    @Override // defpackage.acpq
    public final acpp A() {
        return this.N;
    }

    @Override // defpackage.acpq
    public final acpp B() {
        return this.O;
    }

    @Override // defpackage.acpq
    public final acpp C() {
        acps acpsVar = new acps((Integer) P().map(new acnk(15)).orElse(l), "sms_port");
        this.ac = acpsVar;
        return acpsVar;
    }

    @Override // defpackage.acpq
    public final acpp D() {
        return this.P;
    }

    @Override // defpackage.acpq
    public final boolean K() {
        return false;
    }

    @Override // defpackage.acpq
    public final int L() {
        return 6;
    }

    public final void M() {
        this.B = Optional.of(((adtl) this.z.b()).g());
        String f = ((adtl) this.z.b()).f();
        if (f.isEmpty()) {
            advr.r(x, "not calling getConfiguration because simId is empty", new Object[0]);
        } else {
            this.C = ((aegz) this.y.b()).a(vaq.a(f, aoty.CONFIGURATION_TYPE_RCS_ONBOARDING_FLAGS).b()).map(new acnk(9));
        }
    }

    public final synchronized boolean N(boolean z) {
        if (Instant.now().isAfter(Instant.ofEpochMilli(this.D.get()).plus(this.E))) {
            if (z) {
                this.D.set(Instant.now().toEpochMilli());
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.acpq
    public final acpp a() {
        acps acpsVar = new acps((String) P().map(new acpr(2)).orElse(""), "acs_url");
        this.R = acpsVar;
        return acpsVar;
    }

    @Override // defpackage.acpq
    public final acpp b() {
        acps acpsVar = new acps((Boolean) P().map(new acnk(19)).orElse(p), "allow_manual_phone_number_input");
        this.ae = acpsVar;
        return acpsVar;
    }

    @Override // defpackage.acpq
    public final acpp c() {
        return this.G;
    }

    @Override // defpackage.acpq
    public final acpp d() {
        acps acpsVar = new acps((Boolean) P().map(new acnk(10)).orElse(o), "allow_seamless_authorized_provisioning");
        this.ad = acpsVar;
        return acpsVar;
    }

    @Override // defpackage.acpq
    public final acpp e() {
        return this.H;
    }

    @Override // defpackage.acpq
    public final acpp f() {
        return this.Q;
    }

    @Override // defpackage.acpq
    public final acpp g() {
        acps acpsVar = new acps((Boolean) P().map(new acnk(14)).orElse(r), "enable_instance_id_in_provisioning");
        this.ag = acpsVar;
        return acpsVar;
    }

    @Override // defpackage.acpq
    public final acpp h() {
        return this.I;
    }

    @Override // defpackage.acpq
    public final acpp i() {
        return this.J;
    }

    @Override // defpackage.acpq
    public final acpp j() {
        acps acpsVar = new acps((Long) P().map(new acnk(18)).map(new acpr(5)).orElse(Long.valueOf(w)), "provisioning_retry_max_delay_in_millis");
        this.S = acpsVar;
        return acpsVar;
    }

    @Override // defpackage.acpq
    public final acpp k() {
        return this.L;
    }

    @Override // defpackage.acpq
    public final acpp l() {
        return this.M;
    }

    @Override // defpackage.acpq
    public final acpp m() {
        acps acpsVar = new acps((String) P().map(new acpr(6)).orElse(""), "mcc_url_format");
        this.T = acpsVar;
        return acpsVar;
    }

    @Override // defpackage.acpq
    public final acpp n() {
        acps acpsVar = new acps((Long) P().map(new acpr(4)).map(new acpr(5)).orElse(Long.valueOf(v)), "provisioning_retry_min_delay_in_millis");
        this.U = acpsVar;
        return acpsVar;
    }

    @Override // defpackage.acpq
    public final acpp o() {
        acps acpsVar = new acps((Boolean) P().map(new acnk(20)).orElse(u), "notify_backend_rcs_is_unavailable");
        this.aj = acpsVar;
        return acpsVar;
    }

    @Override // defpackage.acpq
    public final acpp p() {
        acps acpsVar = new acps((String) P().map(new acnk(13)).orElse(""), "otp_pattern");
        this.V = acpsVar;
        return acpsVar;
    }

    @Override // defpackage.acpq
    public final acpp q() {
        acps acpsVar = new acps((Integer) P().map(new acnk(11)).orElse(i), "otp_wait_time_millis");
        this.W = acpsVar;
        return acpsVar;
    }

    @Override // defpackage.acpq
    public final acpp r() {
        acps acpsVar = new acps((Integer) P().map(new acnk(16)).orElse(2), "provisioning_imei_format");
        this.X = acpsVar;
        return acpsVar;
    }

    @Override // defpackage.acpq
    public final acpp s() {
        acps acpsVar = new acps((Integer) P().map(new acpr(0)).orElse(2), "provisioning_imsi_format");
        this.Y = acpsVar;
        return acpsVar;
    }

    @Override // defpackage.acpq
    public final acpp t() {
        Optional P = P();
        if (P.isEmpty()) {
            acps acpsVar = new acps("00101", "rcs_enabled_mcc_mnc");
            this.Z = acpsVar;
            return acpsVar;
        }
        int aT = a.aT(((aouh) P.get()).g);
        if (aT == 0) {
            aT = 1;
        }
        if (aT - 2 != 1) {
            acps acpsVar2 = new acps("00101", "rcs_enabled_mcc_mnc");
            this.Z = acpsVar2;
            return acpsVar2;
        }
        if (this.B.isEmpty()) {
            advr.r(x, "Unable to get cached simOperator, get it from simProvider instead.", new Object[0]);
            this.B = Optional.of(((adtl) this.z.b()).g());
        }
        return new acps(this.B.get(), "rcs_enabled_mcc_mnc");
    }

    @Override // defpackage.acpq
    public final acpp u() {
        acps acpsVar = new acps((String) P().map(new acnk(12)).orElse("UP_T"), "rcs_profile");
        this.aa = acpsVar;
        return acpsVar;
    }

    @Override // defpackage.acpq
    public final acpp v() {
        Optional P = P();
        if (P.isEmpty()) {
            acps acpsVar = new acps(t, "rcs_provisioning_enabled");
            this.ai = acpsVar;
            return acpsVar;
        }
        int aT = a.aT(((aouh) P.get()).g);
        if (aT == 0) {
            aT = 1;
        }
        int i = aT - 2;
        if (i != 1) {
            if (i != 2) {
                acps acpsVar2 = new acps(t, "rcs_provisioning_enabled");
                this.ai = acpsVar2;
                return acpsVar2;
            }
            return new acps(false, "rcs_provisioning_enabled");
        }
        return new acps(true, "rcs_provisioning_enabled");
    }

    @Override // defpackage.acpq
    public final acpp w() {
        acps acpsVar = new acps((String) P().map(new acpr(1)).orElse("5.1B"), "rcs_version");
        this.ab = acpsVar;
        return acpsVar;
    }

    @Override // defpackage.acpq
    public final acpp x() {
        acps acpsVar = new acps((Boolean) P().map(new acpr(3)).orElse(q), "show_google_tos");
        this.af = acpsVar;
        return acpsVar;
    }

    @Override // defpackage.acpq
    public final acpp y() {
        acps acpsVar = new acps((Boolean) P().map(new acnk(17)).orElse(s), "show_rcs_enabled_by_carrier_in_settings");
        this.ah = acpsVar;
        return acpsVar;
    }

    @Override // defpackage.acpq
    public final acpp z() {
        return this.K;
    }
}
