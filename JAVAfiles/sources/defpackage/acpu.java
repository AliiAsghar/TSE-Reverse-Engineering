package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpu {
    final acpv A;
    final acpp B;
    final acpp C;
    final acpp D;
    final acpv a;
    final acpv b;
    final acpv c;
    final acpv d;
    final acpv e;
    final acpv f;
    final acpv g;
    final acpv h;
    final acpv i;
    final acpv j;
    final acpv k;
    final acpv l;
    final acpv m;
    final acpv n;
    final acpv o;
    final acpv p;
    final acpv q;
    final acpv r;
    final acpv s;
    final acpv t;
    final acpv u;
    final acpv v;
    final acpv w;
    final acpv x;
    final acpv y;
    final acpv z;

    /* JADX INFO: Access modifiers changed from: protected */
    public acpu(ahtn ahtnVar) {
        this.a = new acpv(new ahti(ahtnVar, "acs_url", "", false));
        acpq.c.booleanValue();
        this.b = new acpv(ahtnVar.g("allow_overrides", true));
        acpq.d.booleanValue();
        this.c = new acpv(ahtnVar.g("clear_sip_register_auth_digest", true));
        this.e = new acpv(ahtnVar.f("initial_message_revocation_delay_in_millis", acpq.e.longValue()));
        this.f = new acpv(ahtnVar.f("max_message_revocation_delay_in_millis", acpq.f.longValue()));
        acpq.g.intValue();
        this.g = new acpv(ahtnVar.e("max_thumbnail_download_size_bytes", 102400));
        acpq.h.intValue();
        this.h = new acpv(ahtnVar.e("max_thumbnail_download_size_pre_up_bytes", 10240));
        this.i = new acpv(new ahti(ahtnVar, "mcc_mnc", "00101", false));
        this.j = new acpv(new ahti(ahtnVar, "mcc_url_format", "", false));
        this.k = new acpv(new ahti(ahtnVar, "otp_pattern", "", false));
        this.l = new acpv(new ahti(ahtnVar, "sms_ignore_pattern", "Google is verifying your number for Chat features \\d+|Google Chat features code [a-zA-Z0-9_-]+ \\d+", false));
        this.m = new acpv(ahtnVar.e("otp_wait_timeout_ms", acpq.i.intValue()));
        this.n = new acpv(ahtnVar.e("provisioning_imei_format", 2));
        this.o = new acpv(ahtnVar.e("provisioning_imsi_format", 2));
        this.p = new acpv(new ahti(ahtnVar, "provisioning_rcs_profile", "UP_T", false));
        this.q = new acpv(new ahti(ahtnVar, "provisioning_rcs_version", "5.1B", false));
        this.r = new acpv(ahtnVar.f("provisioning_retry_max_delay_in_millis", acpq.w));
        this.s = new acpv(ahtnVar.f("provisioning_retry_min_delay_in_millis", acpq.v));
        this.t = new acpv(ahtnVar.f("sip_register_retry_max_delay_in_seconds", acpq.j.longValue()));
        acpq.k.longValue();
        this.u = new acpv(ahtnVar.f("sip_register_retry_min_delay_in_seconds", 5L));
        acpq.l.intValue();
        this.v = new acpv(ahtnVar.e("sms_port", -1));
        acpq.o.booleanValue();
        this.x = new acpv(ahtnVar.g("allow_seamless_authorized_provisioning", false));
        acpq.p.booleanValue();
        this.y = new acpv(ahtnVar.g("allow_manual_phone_number_input", false));
        acpq.q.booleanValue();
        this.z = new acpv(ahtnVar.g("show_google_tos", false));
        acpq.r.booleanValue();
        this.A = new acpv(ahtnVar.g("enable_instance_id_in_provisioning", false));
        acpq.s.booleanValue();
        this.B = new acpv(ahtnVar.g("show_rcs_enabled_by_carrier_in_settings", false));
        acpq.t.booleanValue();
        this.C = new acpv(ahtnVar.g("rcs_provisioning_enabled", true));
        acpq.u.booleanValue();
        this.D = new acpv(ahtnVar.g("notify_backend_rcs_is_unavailable", false));
        acpq.n.booleanValue();
        this.d = new acpv(ahtnVar.g("enable_analytics", true));
        acpq.m.intValue();
        this.w = new acpv(ahtnVar.e("testing_device_id", -1));
    }
}
