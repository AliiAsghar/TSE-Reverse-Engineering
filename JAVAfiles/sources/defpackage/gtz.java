package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtz extends gjk {
    public static final gtz c = new gtz();

    private gtz() {
        super(4, 5);
    }

    @Override // defpackage.gjk
    public final void a(gkd gkdVar) {
        gkdVar.g("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        gkdVar.g("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
