package defpackage;

import android.database.Cursor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rjv extends arpw implements arqr {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ rjx e;
    final /* synthetic */ rkc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjv(rjx rjxVar, rkc rkcVar, arpe arpeVar) {
        super(1, arpeVar);
        this.e = rjxVar;
        this.f = rkcVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new rjv(this.e, this.f, (arpe) obj).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        arpl arplVar = arpl.a;
        boolean z = true;
        if (this.d != 0) {
            obj3 = this.c;
            obj2 = this.b;
            obj4 = this.a;
            aqil.P(obj);
        } else {
            aqil.P(obj);
            obj2 = this.e;
            rkc rkcVar = this.f;
            asgm asgmVar = rjx.j;
            this.a = asgmVar;
            this.b = obj2;
            this.c = rkcVar;
            this.d = 1;
            if (asgmVar.b(this) != arplVar) {
                obj3 = rkcVar;
                obj4 = asgmVar;
            } else {
                return arplVar;
            }
        }
        try {
            alvi alviVar = rjx.a;
            ((rkb) ((rjx) obj2).i.b()).a().j().disableWriteAheadLogging();
            alvw g = rjx.a.g();
            g.X(alwp.a, "BugleBackup");
            ((alvg) g.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "clearBackupDatabase", 141, "DatabaseBackerUpper.kt")).q("Clearing Backup Database");
            Iterator<E> it = ((alor) ((rjx) obj2).b).values().iterator();
            while (it.hasNext()) {
                ((rkg) it.next()).a();
            }
            Iterator<E> it2 = ((alor) ((rjx) obj2).d).values().iterator();
            while (it2.hasNext()) {
                ((rkh) it2.next()).a();
            }
            Cursor g2 = ((rkb) ((rjx) obj2).i.b()).b().g("pragma wal_checkpoint(TRUNCATE)", null);
            try {
                g2.moveToFirst();
                alvw d = rkb.a.d();
                d.X(alwp.a, "BugleBackup");
                alvg alvgVar = (alvg) d.h("com/google/android/apps/messaging/shared/datamodel/backup/database/BackupDatabaseAttacher", "walCheckpointBugleDb", 109, "BackupDatabaseAttacher.kt");
                if (g2.getLong(0) != 0) {
                    z = false;
                }
                alvgVar.G("Checkpoint BugleDb complete: checkpointed = [%s], pages written = [%s]", z, g2.getLong(2));
                armd.i(g2, null);
            } finally {
            }
            try {
                ((agnq) ((rjx) obj2).f.b()).e("buildBackupDatabase-bugle", new rah(obj2, obj3, 12));
                ((rkb) ((rjx) obj2).i.b()).e();
                alvw g3 = rjx.a.g();
                g3.X(alwp.a, "BugleBackup");
                ((alvg) g3.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "prepareBackupDbForStorage", 147, "DatabaseBackerUpper.kt")).q("Preparing BackupDb for storage");
                long c = rjt.c("DatabaseBackerUpper::prepareBackupDbForStorage", new qtq(obj2, 3));
                alvw g4 = rjx.a.g();
                g4.X(alwp.a, "BugleBackup");
                ((alvg) g4.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "prepareBackupDbForStorage", 152, "DatabaseBackerUpper.kt")).s("Prepare BackupDb time: [%s]ms", arut.g(c));
                File dir = ((rjx) obj2).g.getDir("backup", 0);
                File c2 = ((rkb) ((rjx) obj2).i.b()).c();
                File file = new File(dir, "backup_db");
                file.delete();
                file.createNewFile();
                alvw g5 = rjx.a.g();
                g5.X(alwp.a, "BugleBackup");
                ((alvg) g5.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "copyBackupDatabase", 227, "DatabaseBackerUpper.kt")).q("Making a copy of backupDb");
                FileInputStream fileInputStream = new FileInputStream(c2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        amcp.a(fileInputStream, fileOutputStream);
                        armd.i(fileOutputStream, null);
                        armd.i(fileInputStream, null);
                        return file;
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                ((rkb) ((rjx) obj2).i.b()).e();
                throw th;
            }
        } finally {
            ((asgm) obj4).d();
        }
    }
}
