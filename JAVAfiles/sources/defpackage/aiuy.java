package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiuy extends aiwe {
    private final Context a;
    private final aiwd b;
    private final Object c = new Object();
    private String d;

    public aiuy(aohs aohsVar) {
        this.b = new aivb((aivk) aohsVar.a);
        this.a = (Context) aohsVar.b;
    }

    private final boolean k(Uri uri) {
        if (!TextUtils.isEmpty(uri.getAuthority()) && !this.a.getPackageName().equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    private static final void l() {
        throw new aive("Android backend cannot perform remote operations without a remote backend");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aiwe
    public final Uri a(Uri uri) {
        if (!k(uri)) {
            File c = c(uri);
            Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
            alob alobVar = new alob();
            ahmc.ai(c, path);
            return ahmc.ah(path, alobVar);
        }
        throw new aivl("Operation across authorities is not allowed.");
    }

    @Override // defpackage.aiwe
    protected final aiwd b() {
        return this.b;
    }

    @Override // defpackage.aiwe, defpackage.aiwd
    public final File c(Uri uri) {
        String str;
        Context createDeviceProtectedStorageContext;
        if (!k(uri)) {
            File aj = ahmc.aj(uri, this.a);
            if (!agqa.e(this.a)) {
                synchronized (this.c) {
                    if (this.d == null) {
                        createDeviceProtectedStorageContext = this.a.createDeviceProtectedStorageContext();
                        this.d = ahmc.ak(createDeviceProtectedStorageContext).getParentFile().getAbsolutePath();
                    }
                    str = this.d;
                }
                if (!aj.getAbsolutePath().startsWith(str)) {
                    throw new aive("Cannot access credential-protected data from direct boot");
                }
            }
            return aj;
        }
        throw new IOException("operation is not permitted in other authorities.");
    }

    @Override // defpackage.aiwe, defpackage.aiwd
    public final InputStream d(Uri uri) {
        if (!k(uri)) {
            return this.b.d(a(uri));
        }
        l();
        throw null;
    }

    @Override // defpackage.aiwd
    public final String e() {
        return "android";
    }

    @Override // defpackage.aiwe, defpackage.aiwd
    public final boolean f(Uri uri) {
        if (!k(uri)) {
            return this.b.f(a(uri));
        }
        l();
        throw null;
    }
}
