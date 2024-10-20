package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqd {
    public static final utz a = uuh.i(uuh.b, "enable_otp_auto_deletion", false);

    static {
        uuh.f(uuh.b, "delay_otp_auto_deletion_in_millis", TimeUnit.HOURS.toMillis(24L));
        uuh.e(uuh.b, "max_otp_deletion_promo_banner_impression", 5);
        uuh.i(uuh.b, "otp_auto_delete_requires_device_idle", true);
    }
}
