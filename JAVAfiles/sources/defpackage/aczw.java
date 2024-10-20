package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczw {
    public final acza a;
    public final acza b;
    public final acza c;
    public final acza d;
    public final acza e;
    public final acza f;
    public final acza g;
    public final acza h;
    public final acza i;
    public final acza j;
    public final acza k;
    public final acza l;
    public final acza m;
    public final acza n;
    public final acza o;
    public final acza p;
    public final acza q;
    public final acza r;
    public final acza s;
    public final acza t;
    public final acza u;
    public final acza v;
    public final acza w;
    public final acza x;
    public final acza y;

    public aczw(aczx aczxVar) {
        this.a = aczxVar.i("enable_capdiscovery_via_presence", true);
        this.b = aczxVar.i("enable_request_interworking_imdn", false);
        this.c = aczxVar.h("msrp_cert_fingerprint_algorithm", "SHA-1");
        this.d = aczxVar.i("poll_sim_loaded_status_on_init", false);
        this.e = aczxVar.i("enable_fi_network_selector", false);
        this.f = aczxVar.i("deprioritize_vpns_in_network_selector", false);
        this.g = aczxVar.i("enable_realtime_socket_monitoring", false);
        this.h = aczxVar.i("delay_gc_transport_error_handling", false);
        this.i = aczxVar.i("inform_bugle_of_sessionid_reset_in_runtime", true);
        this.j = aczxVar.g("revoke_message_timeout_seconds", 32L);
        this.k = aczxVar.g("group_management_response_timeout_seconds", 32L);
        this.l = aczxVar.i("enable_enhanced_error_handling", false);
        this.m = aczxVar.i("use_network_capabilities_for_availability_check", false);
        this.n = aczxVar.i("enable_rcs_engine_initialization_by_bugle", false);
        this.o = aczxVar.i("enable_fake_capabilities_discovery", false);
        this.p = aczxVar.i("enable_bind_msrp_socket_local_address", false);
        this.q = aczxVar.i("enable_active_msrp_port_selection", false);
        this.r = aczxVar.i("enable_unsubscribe_to_cep", false);
        this.s = aczxVar.i("deregister_on_sim_removal", false);
        this.t = aczxVar.i("enable_sip_transport_event_logging", false);
        this.u = aczxVar.i("enable_replace_conference_own_user_with_preferred_uri", false);
        this.v = aczxVar.i("enable_msg_revoke_in_originating_invite", false);
        this.w = aczxVar.i("enable_msg_revoke_in_originating_invite_for_e2ee", false);
        this.x = aczxVar.i("enable_check_not_suspended_network_capability", false);
        this.y = aczxVar.i("enable_encryption_tag_in_invite", false);
    }
}
