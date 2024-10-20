package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsp implements hse {
    private static final Set a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    private final hso b;

    public hsp(hso hsoVar) {
        this.b = hsoVar;
    }

    @Override // defpackage.hse
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.hse
    public final /* bridge */ /* synthetic */ kkc b(Object obj, int i, int i2, hnj hnjVar) {
        Uri uri = (Uri) obj;
        return new kkc(new hyf(uri), this.b.a(uri));
    }
}
