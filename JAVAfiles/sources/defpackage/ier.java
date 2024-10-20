package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ier {
    public static final alhr a;
    public static final alhr b;
    public static final alhr c;
    public static final alhr d;
    public static final alhr e;
    public static final alhr f;
    public static final alhr g;
    public static final alhr h;
    public static final alhr i;
    public static final alhr j;

    static {
        alhr w = uuh.w("enable_birthday_nudge");
        w.getClass();
        a = w;
        alhr w2 = uuh.w("enable_birthday_suggestions");
        w2.getClass();
        b = w2;
        alhr w3 = uuh.w("enable_birthday_nudge_setting");
        w3.getClass();
        c = w3;
        alhr D = albo.D(new ezq(3));
        D.getClass();
        d = D;
        alhr D2 = albo.D(new ezq(4));
        D2.getClass();
        e = D2;
        alhr D3 = albo.D(new ezq(5));
        D3.getClass();
        f = D3;
        alhr w4 = uuh.w("enable_same_birthday_nudge_string");
        w4.getClass();
        g = w4;
        uuh.w("enable_birthday_banner_settings_button").getClass();
        uuh.m(uuh.b, "birthday_suggestion_spec", "");
        uuh.k(uuh.b, "birthday_max_suggestions", -1);
        uuh.k(uuh.b, "birthday_max_sticker_suggestions", -1);
        alhr w5 = uuh.w("enable_save_birthday_banner");
        w5.getClass();
        h = w5;
        alhr w6 = uuh.w("enable_birthday_contact_name_fix");
        w6.getClass();
        i = w6;
        uuh.k(uuh.b, "save_birthday_banner_max_impressions", 3);
        uuh.k(uuh.b, "birthday_banner_max_impressions", 3);
        alhr y = uuh.y("enable_birthday_coverage_logging");
        y.getClass();
        j = y;
    }

    public static final boolean a() {
        Object e2 = ((utz) a.get()).e();
        e2.getClass();
        return ((Boolean) e2).booleanValue();
    }
}
