package j$.nio.file;

import java.nio.file.WatchKey;

/* loaded from: classes5.dex */
public final /* synthetic */ class J {
    public final /* synthetic */ WatchKey a;

    private /* synthetic */ J(WatchKey watchKey) {
        this.a = watchKey;
    }

    public static /* synthetic */ J a(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return new J(watchKey);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchKey watchKey = this.a;
        if (obj instanceof J) {
            obj = ((J) obj).a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
