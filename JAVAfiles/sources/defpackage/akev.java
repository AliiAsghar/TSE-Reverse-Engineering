package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akev implements akfb {
    public final /* synthetic */ atsg a;
    private final Uri b;
    private final String[] c;
    private final akfc d;

    public akev(atsg atsgVar, Uri uri, String[] strArr) {
        this.a = atsgVar;
        this.b = uri;
        this.c = strArr;
        this.d = new akex(atsgVar, uri).a;
    }

    @Override // defpackage.akfb
    public final andc a() {
        return this.a.h(this.b, this.c, null, null, null).d(akto.g(new lpx(this, 11)), andi.a);
    }

    @Override // defpackage.akfb
    public final ListenableFuture b() {
        return albo.bI(null);
    }

    @Override // defpackage.akfb
    public final /* synthetic */ Object c() {
        return this.d;
    }
}
