package defpackage;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiik {
    public static final advp a = new advp("MsrpConnection");
    public aiiv d;
    public final Context e;
    public final int f;
    public aijb g;
    public final aohs h;
    private OutputStream i = null;
    public InputStream b = null;
    public final Object c = new Object();

    public aiik(Context context, aohs aohsVar, int i) {
        this.e = context;
        this.h = aohsVar;
        this.f = i;
    }

    public final OutputStream a() {
        OutputStream outputStream = this.i;
        if (outputStream != null) {
            return outputStream;
        }
        throw new IllegalStateException("expected outputStream to be non-null");
    }

    public final void b() {
        this.h.H();
        synchronized (this.c) {
            this.b = new BufferedInputStream(this.h.E(), 4096);
            this.i = this.h.F();
            this.c.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        int i = this.f;
        if (i == 1 || i == 3) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        int i = this.f;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "SECURE_SERVER_CONNECTION";
                } else {
                    str = "SECURE_CLIENT_CONNECTION";
                }
            } else {
                str = "INSECURE_SERVER_CONNECTION";
            }
        } else {
            str = "INSECURE_CLIENT_CONNECTION";
        }
        return "MsrpConnection of type ".concat(str);
    }
}
