package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akao implements akoa {
    public static final alvi a = alvi.m("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet");
    public final Context b;
    public final Map c;
    public final aohs d;
    private final anen e;

    public akao(Context context, Map map, anen anenVar, aohs aohsVar) {
        this.b = context;
        this.c = map;
        this.e = anenVar;
        this.d = aohsVar;
    }

    private final ListenableFuture b(aknr aknrVar) {
        return this.e.submit(akto.j(new ajnt(this, aknrVar, 7, (byte[]) null)));
    }

    @Override // defpackage.akoa
    public final ListenableFuture a() {
        byte[] bArr = null;
        return albo.bY(this.e.submit(akto.j(new ajir(this, 15, bArr))), b(new aknr(1, 2)), b(new aknr(2, 2))).a(new aidu(bArr, 18), this.e);
    }
}
