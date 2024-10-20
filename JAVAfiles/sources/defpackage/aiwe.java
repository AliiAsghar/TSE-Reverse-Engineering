package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aiwe implements aiwd {
    /* JADX INFO: Access modifiers changed from: protected */
    public Uri a(Uri uri) {
        throw null;
    }

    protected abstract aiwd b();

    @Override // defpackage.aiwd
    public /* synthetic */ File c(Uri uri) {
        throw null;
    }

    @Override // defpackage.aiwd
    public InputStream d(Uri uri) {
        throw null;
    }

    @Override // defpackage.aiwd
    public boolean f(Uri uri) {
        throw null;
    }

    @Override // defpackage.aiwd
    public final OutputStream g(Uri uri) {
        return b().g(a(uri));
    }

    @Override // defpackage.aiwd
    public final OutputStream h(Uri uri) {
        return b().h(a(uri));
    }

    @Override // defpackage.aiwd
    public final void i(Uri uri) {
        b().i(a(uri));
    }

    @Override // defpackage.aiwd
    public final void j(Uri uri, Uri uri2) {
        b().j(a(uri), a(uri2));
    }

    @Override // defpackage.aiwd
    public final long m(Uri uri) {
        return b().m(a(uri));
    }

    @Override // defpackage.aiwd
    public final aivk n() {
        return ((aivb) b()).a;
    }
}
