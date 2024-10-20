package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajly {
    private static ajly e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new ajlw(this));
    public ajlx c;
    public ajlx d;

    private ajly() {
    }

    public static ajly a() {
        if (e == null) {
            e = new ajly();
        }
        return e;
    }

    public final void b(ajlx ajlxVar) {
        int i = ajlxVar.a;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            if (i == -1) {
                i = 1500;
            } else {
                i = 2750;
            }
        }
        this.b.removeCallbacksAndMessages(ajlxVar);
        Handler handler = this.b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, ajlxVar), i);
    }

    public final void c() {
        ajlx ajlxVar = this.d;
        if (ajlxVar != null) {
            this.c = ajlxVar;
            this.d = null;
            asqc asqcVar = (asqc) ((WeakReference) ajlxVar.c).get();
            if (asqcVar != null) {
                Object obj = asqcVar.a;
                Handler handler = BaseTransientBottomBar.a;
                handler.sendMessage(handler.obtainMessage(0, obj));
                return;
            }
            this.c = null;
        }
    }

    public final boolean d(ajlx ajlxVar, int i) {
        asqc asqcVar = (asqc) ((WeakReference) ajlxVar.c).get();
        if (asqcVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(ajlxVar);
        Object obj = asqcVar.a;
        Handler handler = BaseTransientBottomBar.a;
        handler.sendMessage(handler.obtainMessage(1, i, 0, obj));
        return true;
    }

    public final void e(asqc asqcVar) {
        synchronized (this.a) {
            if (g(asqcVar)) {
                ajlx ajlxVar = this.c;
                if (!ajlxVar.b) {
                    ajlxVar.b = true;
                    this.b.removeCallbacksAndMessages(ajlxVar);
                }
            }
        }
    }

    public final void f(asqc asqcVar) {
        synchronized (this.a) {
            if (g(asqcVar)) {
                ajlx ajlxVar = this.c;
                if (ajlxVar.b) {
                    ajlxVar.b = false;
                    b(ajlxVar);
                }
            }
        }
    }

    public final boolean g(asqc asqcVar) {
        ajlx ajlxVar = this.c;
        if (ajlxVar != null && ajlxVar.a(asqcVar)) {
            return true;
        }
        return false;
    }

    public final boolean h(asqc asqcVar) {
        ajlx ajlxVar = this.d;
        if (ajlxVar != null && ajlxVar.a(asqcVar)) {
            return true;
        }
        return false;
    }
}
