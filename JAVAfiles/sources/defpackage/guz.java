package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guz extends gjk {
    public guz() {
        super(20, 21);
    }

    @Override // defpackage.gjk
    public final void a(gkd gkdVar) {
        gkdVar.g("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
