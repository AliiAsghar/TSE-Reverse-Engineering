package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class psc {
    public static final alhr a = uuh.w("set_media_download_error_retryable");
    public static final utz b = uuh.e(uuh.b, "max_retries_for_business_info_download", 1);
    public static final uuf c;
    public static final alhr d;
    public static final alhr e;
    public static final alhr f;
    public static final utz g;
    public static final alhr h;

    static {
        ahtn ahtnVar = uuh.b;
        aozy createBuilder = aplg.a.createBuilder();
        createBuilder.bz("wallet.google.com");
        createBuilder.bz("pay.google.com");
        c = uuh.u(ahtnVar, "bugle_phenotype__rbm_wallet_url_list", (aplg) createBuilder.s(), new mdd(5));
        d = uuh.w("use_exponential_backoff_instead_for_business_info");
        e = uuh.w("log_cronet_errors_for_business_info");
        f = uuh.w("use_bot_info_dimain_from_rcs_config");
        g = uuh.h(uuh.b, "business_info_bot_domain_override", "");
        h = uuh.w("support_paths_in_bot_domain");
    }
}
