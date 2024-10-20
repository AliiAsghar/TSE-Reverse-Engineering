package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahix implements Closeable {
    public final AtomicLong a = new AtomicLong();
    final /* synthetic */ ahiy b;
    public final uix c;
    private final Uri d;
    private long e;

    public ahix(ahiy ahiyVar, Uri uri, uix uixVar) {
        this.b = ahiyVar;
        this.d = uri;
        this.c = uixVar;
        this.e = ((adwv) ahiyVar.c).e();
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void a(int i) {
        long j = i;
        if (((adwv) this.b.c).e() - this.e < 1000) {
            this.a.getAndAdd(j);
            ahiu.g("DownloadProgressMonitor", this.d, Long.valueOf(j), Long.valueOf(this.a.get()));
            return;
        }
        synchronized (ahiy.class) {
            this.e = ((adwv) this.b.c).e();
            this.a.getAndAdd(j);
            ahiu.g("DownloadProgressMonitor", this.d, Long.valueOf(j), Long.valueOf(this.a.get()));
            if (((HashMap) this.b.b).containsKey(this.d)) {
                this.b.a.execute(new agqd(this, 15));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }
}
