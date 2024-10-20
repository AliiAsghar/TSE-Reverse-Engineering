package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gva extends gjk {
    public gva() {
        super(22, 23);
    }

    @Override // defpackage.gjk
    public final void a(gkd gkdVar) {
        gkdVar.g("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
