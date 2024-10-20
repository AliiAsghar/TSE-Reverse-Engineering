package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ucv implements uco, uvn {
    public static final uuf a = uuh.e(uuh.b, "d26r_max_history_length", 1);
    public final Set b;
    private final anen e;
    private final armf f;
    public final Object d = new Object();
    public alms c = new alms(((Integer) a.e()).intValue());

    public ucv(anen anenVar, Set set, armf armfVar) {
        this.e = anenVar;
        this.b = set;
        this.f = armfVar;
    }

    public static String f(AtomicLong atomicLong) {
        long j = atomicLong.get();
        if (j == -1) {
            return "null";
        }
        return String.valueOf(j);
    }

    public static void g(StringBuilder sb, String str, String str2) {
        sb.append("  ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        sb.append("\n");
    }

    @Override // defpackage.uvn
    public final akul b() {
        return aktp.ai(new rbg(this, 12), this.e);
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul c() {
        return uvl.c();
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul d() {
        return uvl.d();
    }

    @Override // defpackage.uco
    public final /* synthetic */ int e(Exception exc, int i, ude udeVar) {
        return 1;
    }

    @Override // defpackage.uco
    public final Closeable l(ude udeVar) {
        if (udeVar.b.ordinal() != 1) {
            synchronized (this.d) {
                this.c.add(udeVar);
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.uco
    public final void m(SQLiteDatabase sQLiteDatabase) {
        this.c = new alms(((Integer) a.e()).intValue());
    }

    @Override // defpackage.uco
    public final boolean n() {
        return ((oeg) this.f.b()).a();
    }

    @Override // defpackage.uco
    public final /* synthetic */ Cursor a(Cursor cursor, ude udeVar) {
        return cursor;
    }
}
