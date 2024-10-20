package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtt extends gjk {
    public static final gtt c = new gtt();

    private gtt() {
        super(11, 12);
    }

    @Override // defpackage.gjk
    public final void a(gkd gkdVar) {
        gkdVar.g("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
