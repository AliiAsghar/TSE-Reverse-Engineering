package defpackage;

import android.util.LruCache;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xii implements xzh {
    public static final /* synthetic */ int g = 0;
    private static final alpt h = alpt.v(' ', '@', '.', ',', ':', '-', '(', ')', '+', '[', ']', '{', '}', '<', '>');
    public final armf a;
    public final LruCache b;
    public final LruCache c;
    public final LruCache d;
    public final LruCache e;
    public final LruCache f;
    private final LruCache i;
    private final LruCache j;
    private final alvi k;
    private final uac l;

    public xii(uac uacVar, armf armfVar) {
        uacVar.getClass();
        armfVar.getClass();
        this.l = uacVar;
        this.a = armfVar;
        Object e = wzp.b.e();
        e.getClass();
        this.b = new LruCache(((Number) e).intValue());
        Object e2 = wzp.b.e();
        e2.getClass();
        this.c = new LruCache(((Number) e2).intValue());
        Object e3 = wzp.b.e();
        e3.getClass();
        this.d = new LruCache(((Number) e3).intValue());
        Object e4 = wzp.b.e();
        e4.getClass();
        this.i = new LruCache(((Number) e4).intValue());
        Object e5 = wzp.b.e();
        e5.getClass();
        this.e = new LruCache(((Number) e5).intValue());
        Object e6 = wzp.b.e();
        e6.getClass();
        this.f = new LruCache(((Number) e6).intValue());
        Object e7 = wzp.b.e();
        e7.getClass();
        this.j = new LruCache(((Number) e7).intValue());
        this.k = alvi.m("com/google/android/apps/messaging/shared/telephony/forwardsync/ForwardSyncCache");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object d(xii xiiVar, LruCache lruCache, Object obj, armf armfVar, String str, arqr arqrVar, arqr arqrVar2, int i) {
        if ((i & 16) != 0) {
            arqrVar = vnk.u;
        }
        arqr arqrVar3 = arqrVar;
        if ((i & 32) != 0) {
            arqrVar2 = xih.b;
        }
        arqr arqrVar4 = arqrVar2;
        if ((i & 8) != 0) {
            str = "";
        }
        return xiiVar.e(lruCache, obj, armfVar, str, arqrVar3, arqrVar4);
    }

    private final Object e(LruCache lruCache, Object obj, armf armfVar, String str, arqr arqrVar, arqr arqrVar2) {
        Object obj2;
        synchronized (lruCache) {
            obj2 = lruCache.get(obj);
            if (obj2 == null) {
                obj2 = armfVar.b();
                lruCache.put(obj, obj2);
                String str2 = (String) arqrVar.a(obj);
                obj2.getClass();
                ((alvg) this.k.f().h("com/google/android/apps/messaging/shared/telephony/forwardsync/ForwardSyncCache", "getOrCreateFromCache", 187, "ForwardSyncCache.kt")).J("cache update [%s]: [%s] -> [%s]", str, str2, (String) arqrVar2.a(obj2));
            }
        }
        return obj2;
    }

    public final msh a(String str, int i, armf armfVar) {
        return (msh) e(this.i, i + "::" + str, armfVar, "miCache", new wyk(this, 5), new wyk(this, 6));
    }

    public final xaz b(xhv xhvVar, armf armfVar) {
        return (xaz) d(this, this.j, xhvVar, armfVar, "threadDataCache", null, xih.a, 16);
    }

    public final String c(String str) {
        ArrayList arrayList = new ArrayList(str.length());
        for (int i = 0; i < str.length(); i++) {
            arrayList.add(Character.valueOf(this.l.H(h).h(str.charAt(i))));
        }
        return aqjn.aK(arrayList, "", null, null, null, 62);
    }

    @Override // defpackage.xzh
    public final void l(int i) {
        ((alvg) this.k.g().h("com/google/android/apps/messaging/shared/telephony/forwardsync/ForwardSyncCache", "reclaimMemory", 196, "ForwardSyncCache.kt")).q("reclaimMemory: Clearing caches");
        this.b.evictAll();
        this.c.evictAll();
        this.d.evictAll();
        this.i.evictAll();
        this.e.evictAll();
        this.j.evictAll();
        this.f.evictAll();
    }
}
