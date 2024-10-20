package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsr implements hse {
    private static final Set a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final hse b;

    public hsr(hse hseVar) {
        this.b = hseVar;
    }

    @Override // defpackage.hse
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.hse
    public final /* bridge */ /* synthetic */ kkc b(Object obj, int i, int i2, hnj hnjVar) {
        return this.b.b(new hrv(((Uri) obj).toString(), hrw.a), i, i2, hnjVar);
    }
}
