package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acqb {
    public static final abis a;
    public static final abis b;
    public static final abis c;
    public static final abis d;

    static {
        Boolean bool = false;
        bool.getClass();
        a = acpz.e("carrier_services_sip_flags_update_local_port_from_rport", false);
        b = a("retry_count_on_service_unavailable");
        c = acpz.d("carrier_services_sip_flags_avoid_checking_duplicate_for_request_methods", "CANCEL,");
        d = a("resend_200ok_max_times");
    }

    private static abis a(String str) {
        return acpz.c("carrier_services_sip_flags_".concat(str), 1);
    }
}
