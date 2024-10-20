package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ubt implements uce {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ubt(uci uciVar, Object obj, Object obj2, int i) {
        this.d = i;
        this.b = uciVar;
        this.c = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [uce, java.lang.Object] */
    @Override // defpackage.uce
    public final Object a() {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return Long.valueOf(((uci) this.b).k().insertOrThrow((String) this.c, null, (ContentValues) this.a));
                    }
                    Object obj = this.a;
                    try {
                        return Long.valueOf(((uci) this.b).k().insertWithOnConflict((String) this.c, null, (ContentValues) obj, 0));
                    } catch (SQLiteException e) {
                        alvw h = uci.a.h();
                        h.X(alwp.a, "BugleDatabase");
                        ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "insert", (char) 1393, "DatabaseInterfaceImpl.java")).q("Error inserting ");
                        return -1L;
                    }
                }
                return ((uci) this.a).k().rawQuery((String) this.b, (String[]) this.c);
            }
            Object obj2 = this.b;
            ((uci) obj2).w();
            Object obj3 = this.c;
            ?? r2 = this.a;
            try {
                uci uciVar = (uci) obj2;
                Closeable p = ((uci) obj2).p(new uel(uciVar, ((ude) obj3).a));
                try {
                    Object a = r2.a();
                    p.close();
                    return a;
                } finally {
                }
            } catch (IOException e2) {
                throw new alia(e2);
            }
        }
        return ((uci) this.a).k().rawQuery((String) this.b, (String[]) this.c);
    }

    public /* synthetic */ ubt(uci uciVar, String str, String[] strArr, int i) {
        this.d = i;
        this.a = uciVar;
        this.b = str;
        this.c = strArr;
    }
}
