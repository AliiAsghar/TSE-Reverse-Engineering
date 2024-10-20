package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wut {
    public final AtomicBoolean a;
    public final ConcurrentHashMap b;

    public wut() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wut)) {
            return false;
        }
        wut wutVar = (wut) obj;
        if (d.F(this.a, wutVar.a) && d.F(this.b, wutVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CacheState(allDataCached=" + this.a + ", data=" + this.b + ")";
    }

    public /* synthetic */ wut(byte[] bArr) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.a = atomicBoolean;
        this.b = concurrentHashMap;
    }
}
