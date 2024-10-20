package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ywi {
    public static final uuf a = uuh.l(uuh.b, "conversation_page_loading_time_in_millis", 45000);
    public static final uuf b;
    public final armf c;
    public final abcw d;
    private final armf e;

    static {
        uuh.k(uuh.b, "conversation_fetch_batch_size", 20);
        uuh.k(uuh.b, "conversation_load_page_size", 6);
        uuh.k(uuh.b, "conversation_load_initial_load_factor", 3);
        uuh.k(uuh.b, "conversation_load_timeout_seconds", 5);
        uuh.k(uuh.b, "conversation_updates_cache_timeout_millis", 5000);
        uuh.i(uuh.b, "enable_load_message_from_start", true);
        uuh.i(uuh.b, "enable_loading_state_view_metrics", true);
        uuh.n(uuh.b, "enable_single_inbox_v1_for_all", false);
        uuh.n(uuh.b, "log_conversation_list_load_latency", true);
        uuh.n(uuh.b, "show_watch_conversations_on_eos", true);
        uuh.n(uuh.b, "enable_app_interactive_log", true);
        b = uuh.n(uuh.b, "remove_invalid_delete_message", true);
        uuh.n(uuh.b, "enable_scroll_to_top_click_logging", true);
        uuh.n(uuh.b, "enable_app_prerequisites_dialog_logging", true);
    }

    public ywi(@otv armf armfVar, armf armfVar2, abcw abcwVar) {
        armfVar.getClass();
        armfVar2.getClass();
        this.e = armfVar;
        this.c = armfVar2;
        this.d = abcwVar;
    }

    public final Boolean a() {
        return (Boolean) this.e.b();
    }
}
