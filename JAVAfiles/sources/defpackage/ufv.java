package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ufv extends LruCache {
    private static final alwo b = alwo.o("BugleImage");
    public final String a;

    public ufv(int i, String str) {
        super(i);
        this.a = str;
    }

    public synchronized ugg a(String str, ugg uggVar) {
        uggVar.p();
        return (ugg) put(str, uggVar);
    }

    public final synchronized ugg b(String str) {
        ugg uggVar;
        uggVar = (ugg) get(str);
        if (uggVar != null) {
            uggVar.p();
        }
        alvw n = b.n();
        n.X(ugl.d, this.a);
        n.X(ugl.g, str);
        n.X(ugl.e, Integer.valueOf(hitCount()));
        n.X(ugl.f, Integer.valueOf(missCount()));
        ((alwl) n.h("com/google/android/apps/messaging/shared/datamodel/media/common/MediaCache", "fetchResourceFromCache", 84, "MediaCache.java")).q("Fetching resource from cache.");
        return uggVar;
    }

    public final synchronized void c() {
        try {
            evictAll();
        } catch (IllegalStateException e) {
            ((alwl) ((alwl) ((alwl) b.h()).g(e)).h("com/google/android/apps/messaging/shared/datamodel/media/common/MediaCache", "destroy", 56, "MediaCache.java")).o();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.util.LruCache
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public synchronized void entryRemoved(boolean z, String str, ugg uggVar, ugg uggVar2) {
        uggVar.q();
    }

    public final synchronized void e(String str) {
        for (String str2 : snapshot().keySet()) {
            if (str2.startsWith(str)) {
                remove(str2);
            }
        }
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        int a = ((ugg) obj2).a() / 1024;
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
