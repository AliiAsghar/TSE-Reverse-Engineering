package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ucu implements uco {
    private final List a = new ArrayList();
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private final List d = new ArrayList();
    private final List e = new ArrayList();

    @Override // defpackage.uco
    public final Cursor a(Cursor cursor, ude udeVar) {
        boolean test;
        Object apply;
        for (ucs ucsVar : this.c) {
            test = ucsVar.b().test(udeVar);
            if (test) {
                apply = ucsVar.a().apply(cursor);
                return (Cursor) apply;
            }
        }
        return cursor;
    }

    @Override // defpackage.uco
    public final /* synthetic */ int e(Exception exc, int i, ude udeVar) {
        return 1;
    }

    @Override // defpackage.uco
    public final Closeable l(ude udeVar) {
        boolean test;
        boolean test2;
        boolean test3;
        Object apply;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            fo$$ExternalSyntheticApiModelOutline0.m393m(it.next()).accept(udeVar);
        }
        for (uct uctVar : this.a) {
            test3 = uctVar.b().test(udeVar);
            if (test3) {
                apply = uctVar.a().apply(udeVar);
                throw new ucp(apply);
            }
        }
        for (ucr ucrVar : this.d) {
            test2 = ucrVar.b().test(udeVar);
            if (test2) {
                throw ucrVar.a();
            }
        }
        for (ucq ucqVar : this.e) {
            test = ucqVar.b().test(udeVar);
            if (test) {
                throw ucqVar.a();
            }
        }
        return null;
    }

    @Override // defpackage.uco
    public final boolean n() {
        return ucm.a();
    }

    @Override // defpackage.uco
    public final void m(SQLiteDatabase sQLiteDatabase) {
    }
}
