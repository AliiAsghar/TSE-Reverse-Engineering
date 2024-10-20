package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahck {
    public final Context a;
    public final anen b;
    public final armf c;
    abnr d;
    abnr e;
    public volatile aquq f;

    public ahck() {
        throw null;
    }

    public final synchronized abnr a(ahcc ahccVar) {
        int i = ahccVar.b - 1;
        if (i != 0 && i != 1) {
            if (i != 2) {
                return null;
            }
            if (this.e == null) {
                this.e = abnr.i(this.a, "NOOP_LOG_SOURCE_NAME");
            }
            return this.e;
        }
        if (this.d == null) {
            this.d = new abnm(this.a, "NOOP_LOG_SOURCE_NAME").a();
        }
        return this.d;
    }

    public final ListenableFuture b(ahcj ahcjVar, ListenableFuture listenableFuture) {
        return ancd.g(ancj.g(listenableFuture, new yui(this, ahcjVar, 19, null), this.b), abra.class, new xdg(19), andi.a);
    }

    public ahck(Context context, armf armfVar, anen anenVar) {
        this.a = context;
        this.c = armfVar;
        this.b = anenVar;
    }
}
