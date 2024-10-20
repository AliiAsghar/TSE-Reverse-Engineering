package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rph {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/backup/restore/BatchedRestoreTableWriter");
    public final String b;
    public final armf c;
    public final rpi d;

    public rph(String str, armf armfVar, rpi rpiVar) {
        this.b = str;
        this.c = armfVar;
        this.d = rpiVar;
    }

    public final void a(String str, long j) {
        alvw f = a.f();
        f.X(alwp.a, "BugleBackup");
        ((alvg) f.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/BatchedRestoreTableWriter", "logDuration-HG0u8IE", 92, "BatchedRestoreTableWriter.kt")).J("[%s] [%s] duration [%s]ms", this.b, str, Long.valueOf(arut.g(j)));
    }

    public final void b() {
        ((agnq) this.c.b()).e("BatchedRestoreTableWriter.preRestore", new nau(this, 19));
    }

    public final void c(int i) {
        int i2;
        int a2 = this.d.a();
        int i3 = a2 / i;
        int i4 = 1;
        if (a2 % i > 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i5 = i3 + i2;
        if (i5 <= 0) {
            return;
        }
        while (true) {
            alvi alviVar = a;
            alvw g = alviVar.g();
            g.X(alwp.a, "BugleBackup");
            ((alvg) g.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/BatchedRestoreTableWriter", "restoreTable", 58, "BatchedRestoreTableWriter.kt")).J("[%s] Processing batch [%s]/[%s]", this.b, Integer.valueOf(i4), Integer.valueOf(i5));
            a(a.cb(i4, "batch ", " txn time"), rjt.c("BatchedRestoreTableWriter::restoreTable#txnTime", new rpg(this, i4, i, 0)));
            alvw g2 = alviVar.g();
            g2.X(alwp.a, "BugleBackup");
            ((alvg) g2.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/BatchedRestoreTableWriter", "restoreTable", 86, "BatchedRestoreTableWriter.kt")).B("[%s] Executing post batch work [%s]", this.b, i4);
            int i6 = aruw.a;
            rpi rpiVar = this.d;
            long b = aruw.b();
            rpiVar.e();
            a("postBatchWork", arux.b(b));
            if (i4 != i5) {
                i4++;
            } else {
                return;
            }
        }
    }
}
