package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rpg extends arrp implements arqg {
    final /* synthetic */ rph a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpg(rph rphVar, int i, int i2, int i3) {
        super(0);
        this.d = i3;
        this.a = rphVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        if (this.d != 0) {
            int i = aruw.a;
            int i2 = this.c;
            rpi rpiVar = this.a.d;
            long b = aruw.b();
            rpiVar.g(i2, null);
            this.a.a("updateNextBatchStatusToPreparing", arux.b(b));
            alvw g = rph.a.g();
            g.X(alwp.a, "BugleBackup");
            ((alvg) g.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/BatchedRestoreTableWriter$restoreTable$1$1$1", "invoke", 70, "BatchedRestoreTableWriter.kt")).t("[%s] Checking for duplicates", this.a.b);
            rpi rpiVar2 = this.a.d;
            long b2 = aruw.b();
            rpiVar2.c();
            this.a.a("findAndMarkDuplicates", arux.b(b2));
            alvw g2 = rph.a.g();
            g2.X(alwp.a, "BugleBackup");
            ((alvg) g2.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/BatchedRestoreTableWriter$restoreTable$1$1$1", "invoke", 74, "BatchedRestoreTableWriter.kt")).t("[%s] Inserting to Bugle", this.a.b);
            rpi rpiVar3 = this.a.d;
            long b3 = aruw.b();
            rpiVar3.d();
            this.a.a("performBugleInsert", arux.b(b3));
            alvw g3 = rph.a.g();
            g3.X(alwp.a, "BugleBackup");
            ((alvg) g3.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/BatchedRestoreTableWriter$restoreTable$1$1$1", "invoke", 78, "BatchedRestoreTableWriter.kt")).B("[%s] Finalizing batch [%s]", this.a.b, this.b);
            rpi rpiVar4 = this.a.d;
            long b4 = aruw.b();
            rpiVar4.f();
            this.a.a("updateBatchStatusToWritten", arux.b(b4));
            return arnb.a;
        }
        agnq agnqVar = (agnq) this.a.c.b();
        int i3 = this.c;
        agnqVar.e("BatchedRestoreTableWriter.restoreTable", new eyr(this.a, this.b, i3, 3));
        return arnb.a;
    }
}
