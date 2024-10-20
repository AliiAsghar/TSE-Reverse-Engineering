package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abal {
    public static final utz a = uuh.i(uuh.b, "enable_message_reminder", false);
    public static final alhr b = uuh.y("enable_updated_message_reminder_feature");
    public static final alhr c = uuh.y("enable_reminder_expiration");
    public static final utz d;
    public static final utz e;
    public static final utz f;
    public static final utz g;
    public static final utz h;
    public static final utz i;

    static {
        uuh.f(uuh.b, "reminder_expiration_millis", 259200000L);
        d = uuh.i(uuh.b, "enable_incoming_message_notification_reminder", false);
        uuh.f(uuh.b, "debug_reminder_snooze_override_in_seconds", -1L);
        uuh.f(uuh.b, "debug_reminder_override_expiration_in_seconds", -1L);
        e = uuh.i(uuh.b, "reminder_scroll_flash", false);
        f = uuh.e(uuh.b, "reminder_scroll_flash_delay", 400);
        g = uuh.e(uuh.b, "reminder_scroll_flash_duration", 300);
        h = uuh.e(uuh.b, "reminder_scroll_flash_fade_out_duration", 5);
        i = uuh.i(uuh.b, "enable_one_hour_default_smart_action_reminder", false);
    }

    public static boolean a() {
        if (((Boolean) a.e()).booleanValue() && !c()) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (obg.a() && anfi.a("bugle.disable_reminders_with_conversation_2", "bugle")) {
            return false;
        }
        if (!((Boolean) a.e()).booleanValue() && !c()) {
            return false;
        }
        return true;
    }

    public static boolean c() {
        return ((Boolean) ((utz) b.get()).e()).booleanValue();
    }
}
