package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ucd {
    public dtq b;
    public Thread d;
    public SQLiteDatabase e;
    public final rzx f;
    public final AtomicReference a = new AtomicReference();
    public final akul c = akul.g(d.m(new uqe(this, 1)));

    public ucd(rzx rzxVar) {
        this.f = rzxVar;
    }

    public static final SQLiteDatabase b(Exception exc) {
        throw new ucb("Unhandled exception during database initialization", exc);
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        Thread thread;
        this.e = sQLiteDatabase;
        if (sQLiteDatabase != null) {
            thread = Thread.currentThread();
        } else {
            thread = null;
        }
        this.d = thread;
    }
}
