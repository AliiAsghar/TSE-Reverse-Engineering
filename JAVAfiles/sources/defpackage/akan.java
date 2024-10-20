package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akan implements akoa {
    public static final alvi a = alvi.m("com/google/apps/tiktok/cache/OrphanCacheAccountSynclet");
    public final Map b;
    private final akac c;
    private final anen d;

    public akan(Map map, akac akacVar, anen anenVar) {
        this.b = map;
        this.c = akacVar;
        this.d = anenVar;
    }

    private final ListenableFuture b(aknr aknrVar) {
        akac akacVar = this.c;
        int i = 12;
        return ancj.f(akacVar.c.submit(akto.k(new ahes(akacVar, aknrVar, i))), new ajyn(this, i), this.d);
    }

    @Override // defpackage.akoa
    public final ListenableFuture a() {
        return albo.bY(b(new aknr(1, 2)), b(new aknr(2, 2))).a(new aidu(null, 18), this.d);
    }
}
