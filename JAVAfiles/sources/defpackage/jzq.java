package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzq extends LruCache {
    private final arqv a;

    public jzq(int i, arqv arqvVar) {
        super(i);
        this.a = arqvVar;
    }

    @Override // android.util.LruCache
    protected final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        this.a.a(obj, obj2);
    }
}
