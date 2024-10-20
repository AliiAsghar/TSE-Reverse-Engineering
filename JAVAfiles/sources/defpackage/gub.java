package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gub extends gjk {
    public static final gub c = new gub();

    private gub() {
        super(7, 8);
    }

    @Override // defpackage.gjk
    public final void a(gkd gkdVar) {
        gkdVar.g("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
