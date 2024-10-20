package defpackage;

import android.util.Pair;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rkb {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/backup/database/BackupDatabaseAttacher");
    public final armf b;
    public final armf c;
    public final xnv d;

    public rkb(armf armfVar, armf armfVar2, xnv xnvVar) {
        armfVar.getClass();
        armfVar2.getClass();
        xnvVar.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.d = xnvVar;
    }

    public static final void f(agnw agnwVar, agnw agnwVar2, String str) {
        String g = g(agnwVar);
        String g2 = g(agnwVar2);
        if (h(agnwVar, str)) {
            alvi alviVar = a;
            alvw g3 = alviVar.g();
            g3.X(alwp.a, "BugleBackup");
            ((alvg) g3.h("com/google/android/apps/messaging/shared/datamodel/backup/database/BackupDatabaseAttacher", "detachDatabase", 229, "BackupDatabaseAttacher.kt")).J("Attempting to detach database [%s](alias: [%s]) from [%s]", g2, str, g);
            agnwVar.z("DETACH DATABASE ".concat(str));
            alvw g4 = alviVar.g();
            g4.X(alwp.a, "BugleBackup");
            ((alvg) g4.h("com/google/android/apps/messaging/shared/datamodel/backup/database/BackupDatabaseAttacher", "detachDatabase", 238, "BackupDatabaseAttacher.kt")).J("Successfully detached database [%s](alias: [%s]) from [%s]", g2, str, g);
            return;
        }
        alvw g5 = a.g();
        g5.X(alwp.a, "BugleBackup");
        ((alvg) g5.h("com/google/android/apps/messaging/shared/datamodel/backup/database/BackupDatabaseAttacher", "detachDatabase", 247, "BackupDatabaseAttacher.kt")).J("Skipping SQL execution: Database [%s](alias: [%s]) is already detached from [%s].", g2, str, g);
    }

    private static final String g(agnw agnwVar) {
        return agnwVar.j().getPath();
    }

    private static final boolean h(agnw agnwVar, String str) {
        List<Pair<String, String>> attachedDbs = agnwVar.j().getAttachedDbs();
        attachedDbs.getClass();
        if (attachedDbs.isEmpty()) {
            return false;
        }
        Iterator<T> it = attachedDbs.iterator();
        while (it.hasNext()) {
            if (d.F(((Pair) it.next()).first, str)) {
                return true;
            }
        }
        return false;
    }

    public final agnw a() {
        agnw d = agnc.d(uvl.q().b);
        d.getClass();
        return d;
    }

    public final agnw b() {
        agnw d = agnc.d(wam.F().b);
        d.getClass();
        return d;
    }

    public final File c() {
        return new File(g(a()));
    }

    public final void d(agnw agnwVar, agnw agnwVar2, String str) {
        String g = g(agnwVar);
        String g2 = g(agnwVar2);
        if (!h(agnwVar, str)) {
            alvi alviVar = a;
            alvw g3 = alviVar.g();
            g3.X(alwp.a, "BugleBackup");
            ((alvg) g3.h("com/google/android/apps/messaging/shared/datamodel/backup/database/BackupDatabaseAttacher", "attachDatabase", 137, "BackupDatabaseAttacher.kt")).J("Attempting to attach database [%s](alias: [%s]) to [%s]", g2, str, g);
            agni agniVar = new agni("backup-database-attacher-attach-db");
            rka rkaVar = new rka(this, agnwVar, g2, str, 0);
            ajpj a2 = agnv.a();
            a2.d(true);
            agnwVar.t(agniVar, rkaVar, a2.c());
            alvw g4 = alviVar.g();
            g4.X(alwp.a, "BugleBackup");
            ((alvg) g4.h("com/google/android/apps/messaging/shared/datamodel/backup/database/BackupDatabaseAttacher", "attachDatabase", 157, "BackupDatabaseAttacher.kt")).J("Successfully attached database [%s](alias: [%s]) to [%s]", g2, str, g);
            return;
        }
        alvw g5 = a.g();
        g5.X(alwp.a, "BugleBackup");
        ((alvg) g5.h("com/google/android/apps/messaging/shared/datamodel/backup/database/BackupDatabaseAttacher", "attachDatabase", 166, "BackupDatabaseAttacher.kt")).J("Skipping SQL execution: Database [%s](alias: [%s]) is already attached to [%s]", g2, str, g);
    }

    public final void e() {
        f(a(), b(), "bugleDb");
    }
}
