package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xim {
    public static final utz a = uuh.e(uuh.b, "forward_sync_max_attempts_per_batch", 3);
    public static final alhr b = uuh.w("skip_prior_messages_in_sync_check_before_sync_configured");
    public static final utz c = uuh.l(uuh.b, "sync_batch_target_time_millis", 100);
    public static final utz d = uuh.l(uuh.b, "sync_start_time_adjustment_millis", -1000);
    public static final utz e = uuh.k(uuh.b, "forward_sync_max_messages_to_scan_per_batch", 4000);
    public static final utz f = uuh.k(uuh.b, "forward_sync_max_messages_to_update_per_batch", 1000);
    public static final utz g = uuh.k(uuh.b, "forward_sync_min_messages_to_update_per_batch", 80);
    public static final alhr h = uuh.w("forward_sync_restores_rcs_as_rcs_not_mms");
    public static final utz i = uuh.k(uuh.b, "forward_sync_keep_alive_strategy", 0);
    public static final utz j = uuh.l(uuh.b, "forward_sync_engine_delay_millis", 60000);

    public static unv a() {
        int intValue = ((Integer) i.e()).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    return unv.WORKMANAGER_ONLY;
                }
                throw new AssertionError(a.bV(intValue, "Unexpected forward sync keep alive strategy: "));
            }
            return unv.WAKELOCK;
        }
        return unv.FOREGROUND_SERVICE;
    }

    public static Duration b() {
        return Duration.ofMillis(((Long) d.e()).longValue());
    }
}
