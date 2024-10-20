package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpt {
    public static final alhr a;

    static {
        uuh.i(uuh.b, "fix_item_disappearing_and_crashing_when_clicking_archive_or_spam", false);
        uuh.n(uuh.b, "gaia_hide_option_to_switch_to_work_profile", false);
        a = uuh.y("log_silent_feedback_on_account_error");
        uuh.y("show_search_icon_in_gaia_search_bar");
    }

    public static boolean a() {
        if (xyp.a != 108) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (a() && ((Boolean) uwg.a.e()).booleanValue()) {
            return true;
        }
        return false;
    }
}
