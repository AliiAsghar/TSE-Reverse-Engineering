package defpackage;

import android.util.LruCache;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wkd extends LruCache implements adjd, xzh {
    private final armf a;

    public wkd(armf armfVar) {
        super(2);
        this.a = armfVar;
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        return ((adje) this.a.b()).i((String) obj);
    }

    @Override // defpackage.adjd
    public final void fQ(String str, Optional optional) {
        put(str, optional);
    }

    @Override // defpackage.xzh
    public final void l(int i) {
        trimToSize(0);
    }
}
