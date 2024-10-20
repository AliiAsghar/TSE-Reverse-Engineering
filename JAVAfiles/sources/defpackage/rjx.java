package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rjx {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper");
    public static final asgm j = new asgm();
    public final Map b;
    public final armf c;
    public final Map d;
    public final armf e;
    public final armf f;
    public final Context g;
    public final arwe h;
    public final armf i;
    private final lrf k;

    public rjx(Map map, armf armfVar, Map map2, armf armfVar2, armf armfVar3, Context context, arwe arweVar, armf armfVar4, lrf lrfVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        context.getClass();
        arweVar.getClass();
        armfVar4.getClass();
        this.b = map;
        this.c = armfVar;
        this.d = map2;
        this.e = armfVar2;
        this.f = armfVar3;
        this.g = context;
        this.h = arweVar;
        this.i = armfVar4;
        this.k = lrfVar;
    }

    public static final void c(rkd rkdVar, rkc rkcVar, boolean z, String str) {
        alvi alviVar = a;
        alvw g = alviVar.g();
        g.X(alwp.a, "BugleBackup");
        ((alvg) g.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "writeSingleBackupTable", 195, "DatabaseBackerUpper.kt")).t("[%s]: Writing Backup", str);
        long c = rjt.c("DatabaseBackerUpper::writeSingleBackupTable", new rjw(rkdVar, rkcVar, z, str));
        alvw g2 = alviVar.g();
        g2.X(alwp.a, "BugleBackup");
        ((alvg) g2.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "writeSingleBackupTable", 210, "DatabaseBackerUpper.kt")).C("[%s]: Backup time: [%s]ms", str, arut.g(c));
    }

    public final File a() {
        File file = new File(this.g.getDir("backup", 0), "backup_db");
        if (file.exists()) {
            return file;
        }
        alvw i = a.i();
        i.X(alwp.a, "BugleBackup");
        ((alvg) i.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "getBackupDatabaseFile", 118, "DatabaseBackerUpper.kt")).q("Backup database file not found");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v6, types: [arwe, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.rkc r13, java.util.UUID r14, defpackage.arpe r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.rju
            if (r0 == 0) goto L13
            r0 = r15
            rju r0 = (defpackage.rju) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rju r0 = new rju
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            r4 = 3
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.util.UUID r14 = r0.e
            rjx r13 = r0.d
            defpackage.aqil.P(r15)     // Catch: java.lang.Exception -> L2d
            goto L61
        L2d:
            r15 = move-exception
            goto L8c
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            defpackage.aqil.P(r15)
            lrf r15 = r12.k
            java.lang.Object r15 = r15.b
            rdx r2 = new rdx
            rjz r15 = (defpackage.rjz) r15
            r6 = 4
            r2.<init>(r15, r14, r5, r6)
            arwe r15 = r15.b
            defpackage.qjh.l(r15, r5, r2, r4)
            rjt r15 = defpackage.rjt.a     // Catch: java.lang.Exception -> L89
            java.lang.String r2 = "DatabaseBackerUpper#backup"
            rjv r6 = new rjv     // Catch: java.lang.Exception -> L89
            r6.<init>(r12, r13, r5)     // Catch: java.lang.Exception -> L89
            r0.d = r12     // Catch: java.lang.Exception -> L89
            r0.e = r14     // Catch: java.lang.Exception -> L89
            r0.c = r3     // Catch: java.lang.Exception -> L89
            java.lang.Object r15 = r15.b(r2, r6, r0)     // Catch: java.lang.Exception -> L89
            if (r15 == r1) goto L88
            r13 = r12
        L61:
            arva r15 = (defpackage.arva) r15     // Catch: java.lang.Exception -> L2d
            lrf r7 = r13.k     // Catch: java.lang.Exception -> L2d
            long r0 = r15.b     // Catch: java.lang.Exception -> L2d
            long r8 = defpackage.arut.h(r0)     // Catch: java.lang.Exception -> L2d
            int r0 = defpackage.arut.d(r0)     // Catch: java.lang.Exception -> L2d
            long r0 = (long) r0     // Catch: java.lang.Exception -> L2d
            j$.time.Duration r9 = j$.time.Duration.ofSeconds(r8, r0)     // Catch: java.lang.Exception -> L2d
            r9.getClass()     // Catch: java.lang.Exception -> L2d
            java.lang.Object r0 = r7.c     // Catch: java.lang.Exception -> L2d
            qka r1 = new qka     // Catch: java.lang.Exception -> L2d
            r10 = 0
            r11 = 3
            r6 = r1
            r8 = r14
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L2d
            defpackage.qjh.l(r0, r5, r1, r4)     // Catch: java.lang.Exception -> L2d
            java.lang.Object r13 = r15.a     // Catch: java.lang.Exception -> L2d
            return r13
        L88:
            return r1
        L89:
            r13 = move-exception
            r15 = r13
            r13 = r12
        L8c:
            r9 = r14
            lrf r13 = r13.k
            boolean r14 = r15 instanceof java.lang.IllegalStateException
            if (r3 == r14) goto L96
            r14 = 2
            r8 = r14
            goto L97
        L96:
            r8 = r4
        L97:
            java.lang.Object r13 = r13.b
            psl r14 = new psl
            rjz r13 = (defpackage.rjz) r13
            r10 = 0
            r11 = 2
            r6 = r14
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            arwe r13 = r13.b
            defpackage.qjh.l(r13, r5, r14, r4)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjx.b(rkc, java.util.UUID, arpe):java.lang.Object");
    }
}
