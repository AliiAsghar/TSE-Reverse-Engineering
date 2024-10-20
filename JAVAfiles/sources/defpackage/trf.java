package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class trf {
    public static final uuf a = uuh.f(uuh.b, "gaia_pairing_verification_timeout_millis", TimeUnit.MINUTES.toMillis(5));
    public static final uuf b;
    public static final utz c;
    public static final utz d;
    public static final utz e;
    public static final utz f;
    public static final utz g;
    public static final alhr h;
    public static final alhr i;
    public static final alhr j;

    static {
        uuh.f(uuh.b, "message_repush_time_mills_buffer", 1000L);
        b = uuh.e(uuh.b, "ditto_max_messages_per_repush", 100);
        uuh.e(uuh.b, "ditto_max_messages_per_request", 100);
        uuh.e(uuh.b, "ditto_max_contacts_per_request", Integer.MAX_VALUE);
        uuh.e(uuh.b, "ditto_default_alarm_retry_interval_secs", 30);
        c = uuh.e(uuh.b, "ditto_max_conversations_per_request", 25);
        d = uuh.e(uuh.b, "ditto_blob_lifespan_days", 28);
        uuh.h(uuh.b, "ditto_display_url", "https://messages.google.com/web");
        uuh.h(uuh.b, "ditto_server_timestamp_url", "https://messages.google.com/web/timesource");
        e = uuh.e(uuh.b, "ditto_max_hours_before_challenge", 2);
        f = uuh.e(uuh.b, "ditto_max_minutes_after_challenge_cutoff", 10);
        g = uuh.e(uuh.b, "ditto_max_attachments_per_pre_upload_batch", 30);
        h = uuh.w("enable_keychain_pairing_debug_menu");
        i = uuh.w("only_get_conversation_populates_participant_group_e2ee");
        uuh.w("enable_get_conversation_by_conversation_id");
        uuh.w("enable_keychain_pairing_lskf");
        j = uuh.w("limit_list_conversations_query");
    }
}
