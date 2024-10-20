package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tte {
    public static final uuf a;
    public static final uuf b;
    public static final uuf c;
    public static final uuf d;
    public static final uuf e;
    public static final uuf f;
    public static final uuf g;
    public static final uuf h;
    public static final alhr i;
    public static final uuf j;
    public static final uuf k;
    public static final uuf l;
    public static int m;
    private static final uuf n;
    private static final uac o;

    static {
        uac uacVar = new uac(uuh.a, "Etouffee__");
        o = uacVar;
        a = uacVar.q("enable_group_etouffee", false);
        b = uacVar.n("group_etouffee_size_limit", 100);
        c = uacVar.q("enable_message_resending_full", true);
        d = uacVar.q("enable_message_resending_full_receiver", true);
        e = uacVar.q("enable_message_resending_otk", true);
        f = uacVar.q("enable_message_resending_otk_receiver", true);
        g = uacVar.q("enable_message_otkh_sender", true);
        h = uacVar.q("enable_message_otkh_receiver", false);
        i = albo.D(new rxm(4));
        j = uacVar.n("max_otk_time_span_days", 3);
        k = uacVar.n("max_pending_message_life_span_days", 5);
        l = uacVar.n("max_pending_decrypted_message_life_span_days", 3);
        uuh.w("enable_group_downgrade_e2ee_on_plaintext");
        m = 1;
        n = uacVar.n("max_ftd_retry_count_group", 3);
    }

    public static int a(int i2, boolean z) {
        if (!h() || m == 1 || z || !xyp.e() || i2 <= 1) {
            return 1;
        }
        return Math.max(Math.min(m, 250 / i2), 1);
    }

    public static int b() {
        return ((Integer) n.e()).intValue();
    }

    public static boolean c() {
        if (h() && ((Boolean) g.e()).booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        if (h() && ((Boolean) h.e()).booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if (h() && ((Boolean) c.e()).booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        if (h() && ((Boolean) e.e()).booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        if (h() && ((Boolean) f.e()).booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean h() {
        if (((Boolean) a.e()).booleanValue() && ttd.a()) {
            return true;
        }
        return false;
    }

    public static boolean i() {
        if (((Boolean) a.e()).booleanValue() && ttd.a()) {
            return true;
        }
        return false;
    }
}
