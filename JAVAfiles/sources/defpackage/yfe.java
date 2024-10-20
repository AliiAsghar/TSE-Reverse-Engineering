package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yfe {
    public static final uuf a;
    public static final uuf b;
    public static final uuf c;
    public static final uuf d;
    public static final uuf e;
    public static final uuf f;
    public static final uuf g;
    public static final uuf h;
    public static final uuf i;
    public static final uuf j;
    public static final uuf k;
    public static final uuf l;
    public static final utz m;
    public static final utz n;
    public static final utz o;
    public static final utz p;
    public static final uuf q;
    public static final uuf r;
    public static final uuf s;
    public static final uuf t;
    public static final uuf u;
    public static final uuf v;
    public static final uuf w;
    public static final uuf x;
    public static final uuf y;

    static {
        uuh.i(uuh.b, "use_hats_next", false);
        a = uuh.q(161943181);
        b = uuh.h(uuh.b, "hats_api_key", "AIzaSyA-5SiTMe9aF3aGRp_pR87QxwCox6x0bpo");
        c = uuh.h(uuh.b, "general_survey_site_id", "pHL5GbnNZ0n5ZCStzjH0UAKXnZHt");
        d = uuh.c(uuh.b, "general_frequency", 0.04d);
        e = uuh.h(uuh.b, "smart_replies_survey_site_id", "9QuBEJKqA0n5ZCStzjH0WKid1hmT");
        f = uuh.c(uuh.b, "smart_replies_frequency", 0.04d);
        g = uuh.h(uuh.b, "sticker_gif_survey_site_id", "WCMJEuvXy0n5ZCStzjH0R6Sp9Qym");
        h = uuh.c(uuh.b, "sticker_gif_frequency", 0.08d);
        i = uuh.h(uuh.b, "mms_groups_survey_site_id", "Q5Mnx7rkD0n5ZCStzjH0SiBaeUsY");
        j = uuh.c(uuh.b, "mms_groups_frequency", 0.04d);
        k = uuh.h(uuh.b, "rcs_groups_survey_site_id", "bKKqjxVPi0n5ZCStzjH0TJ8bP6Et");
        l = uuh.c(uuh.b, "rcs_groups_frequency", 0.2d);
        m = uuh.f(uuh.b, "delay_between_prompts_millis", TimeUnit.DAYS.toMillis(90L));
        n = uuh.e(uuh.b, "versions_between_prompts", 1);
        o = uuh.f(uuh.b, "min_time_since_install_millis", TimeUnit.DAYS.toMillis(7L));
        p = uuh.e(uuh.b, "cycle_length", 90);
        q = uuh.i(uuh.b, "use_proof_mode", false);
        r = uuh.i(uuh.b, "bypass_hats_reasons", false);
        s = uuh.i(uuh.b, "provide_first_eligible_survey", false);
        t = uuh.h(uuh.b, "voice_message_transcription_survey_site_id", "CNZbj7VVy0n5ZCStzjH0W2HJaysm");
        u = uuh.c(uuh.b, "voice_message_transcription_survey_frequency", 0.04d);
        uuh.h(uuh.b, "penpal_conversation_survey_site_id", "s1yYC4h130n5ZCStzjH0YNGdvq9B");
        uuh.c(uuh.b, "penpal_conversation_survey_frequency", 0.04d);
        v = uuh.h(uuh.b, "rcs_disabled_survey_site_id", "VnJHhhSmW0n5ZCStzjH0VB9ag1op");
        w = uuh.c(uuh.b, "rcs_disabled_survey_frequency", 0.32d);
        x = uuh.f(uuh.b, "rcs_disabled_survey_eligibility_days", 14L);
        uuh.h(uuh.b, "rcs_disabled__v2_survey_site_id", "bzEzFFZYH0n5ZCStzjH0Q6NzrHhk");
        y = uuh.c(uuh.b, "rcs_disabled_v2_survey_frequency", 0.04d);
    }
}
