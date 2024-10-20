package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtu extends gjk {
    public static final gtu c = new gtu();

    private gtu() {
        super(12, 13);
    }

    @Override // defpackage.gjk
    public final void a(gkd gkdVar) {
        gkdVar.g("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        gkdVar.g("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
