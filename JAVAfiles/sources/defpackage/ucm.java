package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ucm {
    public static boolean a() {
        if (xyp.j() && !xyp.a()) {
            int i = xyp.a;
            if (i != 0) {
                if (i != 7 && !xyp.b() && !xyp.f() && !xyp.i()) {
                    return true;
                }
                return false;
            }
            throw null;
        }
        return false;
    }

    public static tfh b(String str, Uri uri, String str2, int i, int i2, long j) {
        String[] strArr = tfp.a;
        int i3 = tdb.a;
        tfi tfiVar = new tfi();
        tfiVar.f(str);
        tfiVar.c(uri);
        tfiVar.b(str2);
        tfiVar.g(i);
        tfiVar.d(i2);
        tfiVar.e(j);
        return tfiVar.a();
    }

    public static int c(int i) {
        return i - 1;
    }

    public static agmh[] d() {
        return PartsTable.d.Z;
    }
}
