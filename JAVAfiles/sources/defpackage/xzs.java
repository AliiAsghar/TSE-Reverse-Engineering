package defpackage;

import android.os.AsyncTask;
import android.text.TextUtils;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public abstract class xzs extends AsyncTask implements xzo {
    public static final alvi d = alvi.m("com/google/android/apps/messaging/shared/util/common/SafeAsyncTask");
    private final algk a;
    private final algk b;
    public final String g;
    public final long h;
    public final boolean i;
    public boolean j;

    public xzs(String str) {
        this(str, e, false);
    }

    public abstract Object a(Object... objArr);

    public abstract void d(Object obj);

    @Override // android.os.AsyncTask
    protected final Object doInBackground(Object... objArr) {
        return this.a.apply(objArr);
    }

    public final void e(Object... objArr) {
        xyl.g();
        this.j = true;
        try {
            synchronized (f) {
                f.put(this, Long.valueOf(System.currentTimeMillis()));
            }
            executeOnExecutor(xzl.a(), objArr);
        } catch (RejectedExecutionException e) {
            xzl.b(this, e);
            throw e;
        }
    }

    @Override // android.os.AsyncTask
    protected final void onPostExecute(Object obj) {
    }

    public final String toString() {
        String str = this.g;
        String obj = super.toString();
        if (!TextUtils.isEmpty(str)) {
            return obj + " (" + this.g + ")";
        }
        return obj;
    }

    public xzs(String str, byte[] bArr) {
        this(str, 2147483647L, false);
    }

    public xzs(String str, long j, boolean z) {
        xyl.g();
        this.g = str;
        this.h = j;
        this.i = z;
        this.a = akto.a(new xqi(this, 17));
        this.b = akto.a(new xqi(this, 18));
    }
}
