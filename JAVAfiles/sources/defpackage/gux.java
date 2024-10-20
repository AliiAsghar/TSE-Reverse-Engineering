package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gux extends gjk {
    public gux() {
        super(18, 19);
    }

    @Override // defpackage.gjk
    public final void a(gkd gkdVar) {
        gkdVar.g("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
