package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ipe {
    public static final uuf a = uuh.n(uuh.b, "enable_compose_gifs_in_emotive_button", false);
    public static final uuf b = uuh.n(uuh.b, "enable_compose_stickers_in_emotive_button", false);
    public static final uuf c = uuh.n(uuh.b, "enable_gifs_stickers_shortcuts", false);
    public static final uuf d = uuh.n(uuh.b, "enable_compose_sending_webp_over_rcs", false);
    public static final uuf e = uuh.n(uuh.b, "enable_compose_shortcuts_screen", false);
    public static final uuf f = uuh.m(uuh.b, "emoji_preferences_strategy", afmr.b.name());
    public static final uuf g = uuh.n(uuh.b, "enable_compose_camera_gallery_screen", false);
    public static final uuf h = uuh.n(uuh.b, "enable_compose_camera_in_gallery_screen", false);
    public static final uuf i = uuh.n(uuh.b, "force_mini_camera_simple_viewfinder", false);
    public static final uuf j = uuh.n(uuh.b, "expand_compose_camera_gallery_to_max_height_on_header", true);
    public static final uuf k = uuh.n(uuh.b, "enable_system_picker_tile_in_gallery_screen", false);
    public static final uuf l = uuh.n(uuh.b, "enable_compose_header_in_gallery_screen", false);
    public static final uuf m = uuh.n(uuh.b, "enable_compose_tracing", false);
    public static final uue n;
    public static final alhr o;
    public static final uuf p;
    public static final alhr q;
    public static final utz r;

    static {
        ahtn ahtnVar = uuh.b;
        ahil ahilVar = ahil.a;
        ahilVar.getClass();
        n = uuh.s(ahtnVar, "emoji_search_manifest_file_flag", new ezp(ahilVar, 14));
        o = uuh.w("enable_emotive_container_tooltip");
        uuh.x(220339402, "enable_catch_sticker_api_ioexception");
        p = uuh.i(uuh.b, "follow_keyboard_transient_heights_on_programmatical_close", true);
        q = uuh.y("enable_voice_input_redesign");
        r = uuh.e(uuh.b, "max_video_record_duration_seconds", 30);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [int, boolean] */
    public static int a() {
        ?? booleanValue = ((Boolean) utw.ag.e()).booleanValue();
        int i2 = booleanValue;
        if (((Boolean) e.e()).booleanValue()) {
            i2 = booleanValue + 1;
        }
        int i3 = i2;
        if (((Boolean) g.e()).booleanValue()) {
            i3 = i2 + 1;
        }
        if (((Boolean) ((utz) q.get()).e()).booleanValue()) {
            return i3 + 1;
        }
        return i3;
    }

    public static boolean b() {
        if (((Boolean) utw.g.e()).booleanValue() && ((Boolean) utw.ag.e()).booleanValue() && ((Boolean) a.e()).booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if (((Boolean) utw.g.e()).booleanValue() && ((Boolean) utw.ag.e()).booleanValue() && ((Boolean) b.e()).booleanValue()) {
            return true;
        }
        return false;
    }
}
