package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gua extends gjk {
    public static final gua c = new gua();

    private gua() {
        super(6, 7);
    }

    @Override // defpackage.gjk
    public final void a(gkd gkdVar) {
        gkdVar.g("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
