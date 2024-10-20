package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rjw extends arrp implements arqg {
    final /* synthetic */ rkd a;
    final /* synthetic */ rkc b;
    final /* synthetic */ boolean c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjw(rkd rkdVar, rkc rkcVar, boolean z, String str) {
        super(0);
        this.a = rkdVar;
        this.b = rkcVar;
        this.c = z;
        this.d = str;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        try {
            this.a.b(this.b);
        } catch (Exception e) {
            if (this.c) {
                alvw i = rjx.a.i();
                i.X(alwp.a, "BugleBackup");
                ((alvg) ((alvg) i).g(e).h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper$writeSingleBackupTable$1", "invoke", 204, "DatabaseBackerUpper.kt")).t("[%s]: Failed to write to Backup, continuing.", this.d);
            } else {
                throw e;
            }
        }
        return arnb.a;
    }
}
