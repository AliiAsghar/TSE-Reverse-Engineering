package j$.nio.file;

import java.io.Closeable;
import java.nio.file.WatchService;

/* loaded from: classes5.dex */
public final /* synthetic */ class K implements Closeable {
    public final /* synthetic */ WatchService a;

    private /* synthetic */ K(WatchService watchService) {
        this.a = watchService;
    }

    public static /* synthetic */ K i(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return new K(watchService);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.a;
        if (obj instanceof K) {
            obj = ((K) obj).a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
