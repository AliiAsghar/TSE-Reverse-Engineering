package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ttd {
    public static final uuf A;
    public static final uuf B;
    public static final alhr C;
    public static final uuf D;
    public static final alhr E;
    public static final alhr F;
    public static final uuf G;
    public static final uuf H;
    private static final uac I;
    public static final xze a = xze.g("BugleEtouffee", "EtouffeeConfig");
    public static final uuf b;
    public static final uuf c;
    public static final uuf d;
    public static final uuf e;
    static final uuf f;
    public static final uuf g;
    public static final uuf h;
    public static final uuf i;
    public static final uuf j;
    public static final uuf k;
    public static final uuf l;
    static final uuf m;
    public static final uuf n;
    public static final uuf o;
    public static final uuf p;
    public static final uuf q;
    public static final uuf r;
    public static final uuf s;
    public static final uuf t;
    static final alhr u;
    static final alhr v;
    public static final uuf w;
    public static final uuf x;
    public static final uuf y;
    public static final alhr z;

    static {
        uac uacVar = new uac(uuh.a, "Etouffee__");
        I = uacVar;
        b = uacVar.q("enable_etouffee", true);
        c = uacVar.q("enable_e2ee_receive", true);
        d = uacVar.n("prekey_count", 100);
        e = uuh.t((ahtn) uacVar.b, ((String) uacVar.a).concat("scytale_experiment_config"), new byte[0]);
        f = uacVar.q("use_official_mimetypes_for_outgoing", true);
        g = uacVar.q("enable_etouffee_ui", true);
        h = uacVar.q("enable_save_etouffee_to_telephony_setting", false);
        i = uacVar.q("enable_user_toggle_for_etouffee", false);
        j = uacVar.p("user_toggle_for_etouffee_learn_more_destination", "");
        k = uacVar.q("enable_etouffee_security_key_ui", false);
        l = uacVar.p("identity_details_learn_more_destination", "https://support.google.com/messages/answer/10252671#verify");
        m = uacVar.q("add_message_prefix", true);
        n = uacVar.p("message_prefix", "Encrypted message. Learn more https://support.google.com/messages?p=messages_e2ee");
        uacVar.p("previous_message_prefix", "Encrypted message. Learn more https://support.google.com/messages?p=messages_e2ee");
        o = uacVar.q("enable_open_etouffee_conversation_growthkit", true);
        p = uacVar.p("etouffee_privacy_setting_learn_more_destination", "");
        q = uacVar.q("enable_etouffee_message_failure_to_decrypt_ui", true);
        r = uacVar.q("always_enable_etouffee_message_failure_to_decrypt_ui", false);
        uacVar.n("etouffee_failure_to_decrypt_display_garbled_length", 25);
        s = uacVar.p("etouffee_failure_to_decrypt_dialog_learn_more_destination", "https://support.google.com/messages?p=messages_e2ee");
        t = uacVar.p("etouffee_tombstone_learn_more_destination", "https://support.google.com/messages?p=messages_e2ee");
        u = albo.D(new rxm(2));
        v = albo.D(new rxm(3));
        uacVar.q("enable_receive_fully_encrypted_file_transfer_message", true);
        w = uacVar.q("enable_send_file_transfer_xml_extension", false);
        x = uacVar.n("identity_verification_max_retry", 5);
        y = uacVar.n("identity_verification_max_cache_size", 1000);
        z = uuh.z(186182985, "use_messaging_identity_in_identity_worker_parameters");
        A = uacVar.n("id_fresh_buffer", 10000);
        B = uacVar.o("rcs_group_sync_throttle_in_ms", 300000L);
        C = uuh.w("send_encrypted_display_imdn_with_control_message_source");
        D = uacVar.n("max_conversations_to_update_when_reprovisions", 20);
        E = uuh.w("enable_receive_display_imdn_xml_extension");
        uuh.w("enable_recipient_lost_encryption_status_update");
        F = uuh.w("enable_downgrade_event_metrics");
        uacVar.n("max_alpha_for_highlight_animation", 31);
        uacVar.o("highlight_animation_duration_in_milli_seconds", 1000L);
        uacVar.o("highlight_animation_delay_in_milli_seconds", 500L);
        G = uacVar.q("enable_e2ee_one_to_one_ui_v2", false);
        H = uacVar.q("enable_one_to_one_e2ee_details_page_section", false);
    }

    public static boolean a() {
        if (xyp.k() || !((Boolean) b.e()).booleanValue() || !((Boolean) vbh.c.e()).booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean b() {
        return ((Boolean) G.e()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) H.e()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d() {
        if (a() && ((Boolean) c.e()).booleanValue()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e() {
        return ((Boolean) r.e()).booleanValue();
    }

    public static boolean f() {
        if (a() && ((Boolean) g.e()).booleanValue()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g() {
        return ((Boolean) f.e()).booleanValue();
    }
}
