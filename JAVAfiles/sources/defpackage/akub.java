package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akub<T> {
    final Object a;
    final Object b;
    Object c;

    public akub(aktp aktpVar, Object obj) {
        this.b = aktpVar;
        this.a = obj;
    }

    public final File a() {
        Object obj;
        File dataDir;
        synchronized (this.a) {
            if (this.c == null) {
                dataDir = ((Context) this.b).getDataDir();
                this.c = dataDir;
            }
            obj = this.c;
        }
        return (File) obj;
    }

    public akub(Context context) {
        this.a = new Object();
        this.b = context.getApplicationContext();
    }
}
