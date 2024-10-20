package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbp {
    public static final uuf a;
    public static final uuf b;
    public static final alhr c;
    public static final alhr d;

    static {
        uuh.e(uuh.b, "conversation_default_label", SuperSortLabel.ALL.i);
        a = uuh.n(uuh.b, "conversation_labels_enabled", false);
        uuh.d(uuh.b, "processed_messages_threshold", 0.5f);
        uuh.d(uuh.b, "processed_messages_max_sorting_notice", 0.8f);
        uuh.h(uuh.b, "supersort_mapping_strategy", "contactsToPersonalDefaultToMore");
        uuh.h(uuh.b, "supersort_model_id", "");
        uuh.h(uuh.b, "supersort_intent_label_mapping", "");
        b = uuh.n(uuh.b, "enable_home_screen_banner", false);
        uuh.i(uuh.b, "supersort_enable_update_donation_banner", false);
        uuh.x(185831101, "supersort_enable_primary_view_banner");
        c = uuh.y("supersort_enable_otp_banner_in_business_updates");
        uuh.e(uuh.b, "supersort_hide_category_scheme", 0);
        alok alokVar = new alok();
        alokVar.h(SuperSortLabel.BUSINESS_UPDATE, 16);
        alokVar.h(SuperSortLabel.TRANSACTION, 1);
        alokVar.h(SuperSortLabel.UPDATE, 2);
        alokVar.h(SuperSortLabel.OTP, 4);
        alokVar.h(SuperSortLabel.PROMOTION, 8);
        alokVar.b();
        uuh.x(187727046, "supersort_default_to_all_if_personal_is_empty");
        uuh.i(uuh.b, "supersort_enable_attaching_psd", false);
        uuh.h(uuh.b, "supersort_grammars_mdd_group_name", "supersort_india_grammars");
        d = uuh.w("enable_report_spam_conversation_banner");
        uuh.y("supersort_badge_all_filter");
        uuh.y("chip_width_adjustments");
    }

    public static boolean a() {
        return ((Boolean) a.e()).booleanValue();
    }

    public static boolean b() {
        return ((Boolean) ((utz) c.get()).e()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) ((utz) d.get()).e()).booleanValue();
    }
}
