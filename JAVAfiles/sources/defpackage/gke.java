package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gke {
    public final int f = 23;

    public static final void c(String str) {
        int i;
        if (!arsd.x(str, ":memory:", true)) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                if (true != z) {
                    i = i2;
                } else {
                    i = length;
                }
                int a = arro.a(str.charAt(i), 32);
                if (!z) {
                    if (a > 0) {
                        z = true;
                    } else {
                        i2++;
                    }
                } else if (a > 0) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i2, length + 1).toString().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }
    }

    public abstract void a(gkd gkdVar, int i, int i2);
}
