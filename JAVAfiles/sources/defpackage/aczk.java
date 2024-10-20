package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczk {
    public final acza a;
    public final acza b;
    public final acza c;
    public final acza d;
    public final acza e;
    public final acza f;
    public final acza g;
    public final acza h;
    public final acza i;
    public final acza j;

    public aczk(aczl aczlVar) {
        this.a = aczlVar.i("enable_cema", false);
        this.b = aczlVar.f("wait_for_failure_response_timeout_seconds", 30);
        this.c = aczlVar.f("connection_init_timeout_seconds", 15);
        this.d = aczlVar.i("enable_discard_duplicate_messages", false);
        this.e = aczlVar.i("outgoing_chat_is_active_passive", false);
        this.f = aczlVar.i("enable_rfc6135_compliance", false);
        this.g = aczlVar.i("enable_report_to_imdn_translation", false);
        this.h = aczlVar.f("max_content_per_msrp_chunk_size", 61536);
        this.i = aczlVar.f("slm_max_content_per_msrp_chunk_size", 1048576);
        this.j = aczlVar.i("enable_recording_io_streams", false);
    }
}
