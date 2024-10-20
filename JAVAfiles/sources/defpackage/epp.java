package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class epp extends epr {
    public volatile epo a;
    private Executor j;
    private volatile epo k;

    public epp(Context context) {
        super(context);
    }

    public abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public Object b() {
        return a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(epo epoVar, Object obj) {
        e(obj);
        if (this.k == epoVar) {
            if (this.h) {
                j();
            }
            SystemClock.uptimeMillis();
            this.k = null;
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (this.k == null && this.a != null) {
            boolean z = this.a.a;
            if (this.j == null) {
                this.j = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            epo epoVar = this.a;
            Executor executor = this.j;
            if (epoVar.f != 1) {
                int i = epoVar.f;
                int i2 = i - 1;
                if (i != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("We should never reach this state");
                        }
                        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                    }
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                }
                throw null;
            }
            epoVar.f = 2;
            executor.execute(epoVar.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.epr
    public final void f() {
        g();
        this.a = new epo(this);
        d();
    }

    @Override // defpackage.epr
    public final void g() {
        if (this.a != null) {
            if (!this.d) {
                j();
            }
            if (this.k != null) {
                boolean z = this.a.a;
            } else {
                boolean z2 = this.a.a;
                epo epoVar = this.a;
                epoVar.d.set(true);
                if (epoVar.c.cancel(false)) {
                    this.k = this.a;
                }
            }
            this.a = null;
        }
    }

    @Override // defpackage.epr
    @Deprecated
    public final void h(String str, PrintWriter printWriter) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.b);
        printWriter.print(" mListener=");
        printWriter.println(this.i);
        if (this.d || this.g || this.h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.h);
        }
        if (this.e || this.f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.e);
            printWriter.print(" mReset=");
            printWriter.println(this.f);
        }
        if (this.a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.a);
            printWriter.print(" waiting=");
            boolean z = this.a.a;
            printWriter.println(false);
        }
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.k);
            printWriter.print(" waiting=");
            boolean z2 = this.k.a;
            printWriter.println(false);
        }
    }

    public void e(Object obj) {
    }
}
