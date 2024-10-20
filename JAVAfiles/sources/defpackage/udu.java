package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class udu implements uco {
    public static final utz a = uuh.q(172569191);

    @Override // defpackage.uco
    public final Cursor a(Cursor cursor, ude udeVar) {
        return new udt(cursor);
    }

    @Override // defpackage.uco
    public final /* synthetic */ int e(Exception exc, int i, ude udeVar) {
        return 1;
    }

    @Override // defpackage.uco
    public final Closeable l(ude udeVar) {
        agni agniVar;
        agni agniVar2 = udeVar.a;
        if (agniVar2 != null && !((Boolean) agniVar2.a(new agnh() { // from class: uds
            @Override // defpackage.agnh
            public final Object a(String str) {
                utz utzVar = udu.a;
                boolean z = true;
                if (str != null && !str.isEmpty()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        })).booleanValue() && (agniVar = udeVar.a) != null && !agniVar.b()) {
            return (akrh) agniVar.a(new udc());
        }
        return null;
    }

    @Override // defpackage.uco
    public final boolean n() {
        return ((Boolean) a.e()).booleanValue();
    }

    @Override // defpackage.uco
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }
}
