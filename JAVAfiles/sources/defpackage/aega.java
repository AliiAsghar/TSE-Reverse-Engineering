package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aega extends aefp {
    public aega() {
        super(abjr.EXEC_SQL_FIX, 10L);
    }

    private static void c(SQLiteDatabase sQLiteDatabase, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                sQLiteDatabase.execSQL(str);
            } catch (SQLiteException e) {
                Log.e("EXEC_SQL_FIX", "Unable to execute query ".concat(String.valueOf(str)));
                throw e;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    @Override // defpackage.aefp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aefu a(defpackage.aefu r6, defpackage.algw r7) {
        /*
            r5 = this;
            boolean r0 = r7.f()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r7.b()
            abke r0 = (defpackage.abke) r0
            int r0 = r0.b
            r1 = 2
            if (r0 != r1) goto L9c
            android.content.Context r0 = r6.b
            java.lang.Object r7 = r7.b()
            abke r7 = (defpackage.abke) r7
            int r2 = r7.b
            if (r2 != r1) goto L22
            java.lang.Object r7 = r7.c
            abjv r7 = (defpackage.abjv) r7
            goto L24
        L22:
            abjv r7 = defpackage.abjv.a
        L24:
            boolean r2 = r7.f
            if (r2 == 0) goto L2c
            android.content.Context r0 = defpackage.d$$ExternalSyntheticApiModelOutline0.m(r0)
        L2c:
            java.lang.String r2 = r7.c
            java.io.File r2 = r0.getDatabasePath(r2)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L39
            goto L8f
        L39:
            java.lang.String r2 = r2.getPath()
            r3 = 0
            r4 = 0
            android.database.sqlite.SQLiteDatabase r2 = android.database.sqlite.SQLiteDatabase.openDatabase(r2, r3, r4)
            int r3 = r2.getVersion()     // Catch: java.lang.Throwable -> L90
            int r4 = r7.d     // Catch: java.lang.Throwable -> L90
            if (r4 != 0) goto L4c
            goto L4f
        L4c:
            if (r4 == r3) goto L4f
            goto L8a
        L4f:
            int r3 = r7.b     // Catch: java.lang.Throwable -> L90
            int r3 = defpackage.a.aT(r3)     // Catch: java.lang.Throwable -> L90
            r4 = 1
            if (r3 != 0) goto L59
            r3 = r4
        L59:
            int r3 = r3 + (-2)
            if (r3 == r4) goto L6d
            if (r3 != r1) goto L65
            java.lang.String r7 = r7.c     // Catch: java.lang.Throwable -> L90
            r0.deleteDatabase(r7)     // Catch: java.lang.Throwable -> L90
            goto L8a
        L65:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L90
            java.lang.String r7 = "This command type is not supported"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L90
            throw r6     // Catch: java.lang.Throwable -> L90
        L6d:
            boolean r0 = r7.g     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L85
            apax r7 = r7.e     // Catch: java.lang.Throwable -> L90
            r2.beginTransaction()     // Catch: java.lang.Throwable -> L90
            c(r2, r7)     // Catch: java.lang.Throwable -> L80
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L80
            r2.endTransaction()     // Catch: java.lang.Throwable -> L90
            goto L8a
        L80:
            r6 = move-exception
            r2.endTransaction()     // Catch: java.lang.Throwable -> L90
            throw r6     // Catch: java.lang.Throwable -> L90
        L85:
            apax r7 = r7.e     // Catch: java.lang.Throwable -> L90
            c(r2, r7)     // Catch: java.lang.Throwable -> L90
        L8a:
            if (r2 == 0) goto L8f
            r2.close()
        L8f:
            return r6
        L90:
            r6 = move-exception
            if (r2 == 0) goto L9b
            r2.close()     // Catch: java.lang.Throwable -> L97
            goto L9b
        L97:
            r7 = move-exception
            r6.addSuppressed(r7)
        L9b:
            throw r6
        L9c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aega.a(aefu, algw):aefu");
    }

    @Override // defpackage.aefp
    public final String b() {
        return "EXEC_SQL_FIX";
    }
}
