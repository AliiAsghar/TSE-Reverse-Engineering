package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nhr {
    public static final uuf a;
    public static final utz b;
    public static final utz c;
    public static final utz d;
    public static final utz e;
    public static final uuf f;
    public static final uuf g;
    public static final utz h;
    public static final uuf i;

    static {
        uuh.n(uuh.b, "enable_audio_attachment_refactor", false);
        a = uuh.n(uuh.b, "enable_audio_quality_improvements", false);
        b = uuh.e(uuh.b, "improved_audio_limit_seconds", 120);
        c = uuh.e(uuh.b, "rcs_audio_limit_seconds", 600);
        d = uuh.e(uuh.b, "improved_audio_samples_per_second", 16000);
        e = uuh.e(uuh.b, "improved_audio_bits_per_second", 28000);
        uuh.n(uuh.b, "enable_multiplexed_metadata_validation", false);
        f = uuh.n(uuh.b, "enable_voice_moods", false);
        g = uuh.u(uuh.b, "voice_moods_config", nhs.a, new mdd(4));
        h = uuh.k(uuh.b, "audio_level_poll_interval", 100);
        i = uuh.k(uuh.b, "voice_button_background_value", 0);
    }
}
