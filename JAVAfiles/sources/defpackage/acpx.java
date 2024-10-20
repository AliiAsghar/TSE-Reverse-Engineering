package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpx {
    public static final abis a = a("enable_carrier_services_apk", true);

    static {
        a("enable_debug_info", false);
    }

    private static abis a(String str, Boolean bool) {
        return acpz.e("carrier_services_apk_flags_".concat(str), bool.booleanValue());
    }
}
