package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gty extends gjk {
    public static final gty c = new gty();

    private gty() {
        super(3, 4);
    }

    @Override // defpackage.gjk
    public final void a(gkd gkdVar) {
        gkdVar.g("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
