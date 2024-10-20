package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vof {
    public static final uuf a = uuh.n(uuh.b, "enable_google_photos_integration", false);
    public static final uuf b = uuh.n(uuh.b, "enable_replace_google_photos_attachment_with_link_and_preview_on_send", false);
    public static final uuf c = uuh.n(uuh.b, "enable_google_photos_image_by_link", false);

    static {
        uuh.k(uuh.b, "max_onboarding_promo_shown_time", 6);
        uuh.m(uuh.b, "photos_onboarding_learn_more_link", "https://support.google.com/messages/answer/6159880");
        uuh.e(uuh.b, "google_photos_link_preview_initial_delay_millis", 3000);
        uuh.w("enable_google_photos_picker_send_event_after_resume");
        uuh.n(uuh.b, "enable_google_photos_picker_for_signed_out_user", true);
    }
}
