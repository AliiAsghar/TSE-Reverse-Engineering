package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abdh {
    public static final uuf a = uuh.i(uuh.b, "enable_external_video_trimmer", false);
    public static final uuf b;
    public static final uuf c;
    public static final uuf d;
    public static final utz e;

    static {
        uuh.f(uuh.b, "trimming_threshold_ms", 30000L);
        b = uuh.e(uuh.b, "trimming_output_width", -1);
        c = uuh.e(uuh.b, "trimming_output_height", -1);
        d = uuh.e(uuh.b, "trimming_output_max_size", 4224);
        e = uuh.i(uuh.b, "video_trimmer_intent_logging", false);
        uuh.i(uuh.b, "video_trimmer_file_info_logging", false);
    }
}
