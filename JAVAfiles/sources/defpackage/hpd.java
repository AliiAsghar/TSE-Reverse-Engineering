package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpd {
    private volatile hqp a;
    private final hgi b;

    public hpd(hgi hgiVar) {
        this.b = hgiVar;
    }

    public final hqp a() {
        File file;
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    Object obj = this.b.a;
                    File cacheDir = ((Context) ((hqs) obj).a).getCacheDir();
                    hqr hqrVar = null;
                    if (cacheDir == null) {
                        file = null;
                    } else {
                        file = new File(cacheDir, (String) ((hqs) obj).b);
                    }
                    if (file != null && (file.isDirectory() || file.mkdirs())) {
                        hqrVar = new hqr(file);
                    }
                    this.a = hqrVar;
                }
                if (this.a == null) {
                    this.a = new hqq();
                }
            }
        }
        return this.a;
    }
}
