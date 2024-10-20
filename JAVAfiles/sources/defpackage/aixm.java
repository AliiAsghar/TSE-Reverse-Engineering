package defpackage;

import android.os.CancellationSignal;
import android.util.Log;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aixm extends ance implements Runnable {
    public static final /* synthetic */ int a = 0;
    private final aixl b;

    public aixm(aixl aixlVar) {
        this.b = aixlVar;
    }

    protected abstract void d(aixl aixlVar);

    public final void e(Executor executor) {
        executor.execute(akto.j(this));
    }

    @Override // defpackage.ance
    public final String gs() {
        return "query=[" + this.b.b() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isCancelled()) {
            return;
        }
        try {
            if (Log.isLoggable("ASQLDB", 2)) {
                this.b.c();
                Log.v("ASQLDB", "The query's result is currently:");
                Log.v("ASQLDB", agrk.t(this.b.a(new CancellationSignal())));
                Log.v("ASQLDB", "NOTE(b/171271240): If another thread commits in parallel with this query, the printed debug result above might be from an earlier snapshot than this query's Future<Cursor> iterates.");
            }
            akrh e = aktp.e("Query: " + this.b.b());
            try {
                d(this.b);
                e.close();
            } finally {
            }
        } catch (Throwable th) {
            setException(th);
        }
    }
}
