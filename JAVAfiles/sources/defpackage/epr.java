package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import java.io.PrintWriter;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class epr {
    public int b;
    public final Context c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = true;
    public boolean g = false;
    public boolean h = false;
    public epk i;

    public epr(Context context) {
        this.c = context.getApplicationContext();
    }

    public static final String n(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            sb.append(obj.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
            sb.append("}");
        }
        return sb.toString();
    }

    @Deprecated
    public void h(String str, PrintWriter printWriter) {
        throw null;
    }

    public void i(Object obj) {
        epk epkVar = this.i;
        if (epkVar != null) {
            if (epj.c(2)) {
                Objects.toString(epkVar);
                Log.v("LoaderManager", "onLoadComplete: ".concat(epkVar.toString()));
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                epkVar.j(obj);
                return;
            }
            if (epj.c(4)) {
                Log.i("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            epkVar.h(obj);
        }
    }

    public final void j() {
        if (this.d) {
            f();
        } else {
            this.g = true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" id=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
    }

    public void g() {
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }
}
