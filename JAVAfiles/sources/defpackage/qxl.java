package defpackage;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qxl implements DatabaseErrorHandler {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qxl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        if (this.b != 0) {
            sQLiteDatabase.getClass();
            gkj bp = gvf.bp((mka) this.a, sQLiteDatabase);
            Log.e("SupportSQLite", a.cc(bp, "Corruption reported by sqlite on database: ", ".path"));
            if (!bp.j()) {
                String c = bp.c();
                if (c != null) {
                    gke.c(c);
                    return;
                }
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = bp.d.getAttachedDbs();
                } catch (SQLiteException unused) {
                }
                try {
                    bp.close();
                } catch (IOException unused2) {
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            obj.getClass();
                            gke.c((String) obj);
                        }
                        return;
                    }
                    String c2 = bp.c();
                    if (c2 != null) {
                        gke.c(c2);
                    }
                }
            } catch (Throwable th) {
                if (list != null) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        Object obj2 = ((Pair) it2.next()).second;
                        obj2.getClass();
                        gke.c((String) obj2);
                    }
                } else {
                    String c3 = bp.c();
                    if (c3 != null) {
                        gke.c(c3);
                    }
                }
                throw th;
            }
        } else {
            qxn qxnVar = (qxn) this.a;
            ((mbl) qxnVar.f.b()).c("Bugle.Datamodel.DatabaseCorrupted.Counts");
            ((mbl) qxnVar.f.b()).a();
            qxnVar.m.onCorruption(sQLiteDatabase);
            qxnVar.c();
        }
    }
}
