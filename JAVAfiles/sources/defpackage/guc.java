package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guc extends gjk {
    public static final guc c = new guc();

    private guc() {
        super(8, 9);
    }

    @Override // defpackage.gjk
    public final void a(gkd gkdVar) {
        gkdVar.g("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
