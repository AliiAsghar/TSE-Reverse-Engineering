package defpackage;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arbo extends aqve {
    private static final boolean a = aqae.s(arbo.class.getClassLoader());

    @Override // defpackage.aqva
    public final aqvd a(URI uri, aquy aquyVar) {
        if ("dns".equals(uri.getScheme())) {
            String path = uri.getPath();
            path.getClass();
            albo.Q(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
            String substring = path.substring(1);
            uri.getAuthority();
            return new arbn(substring, aquyVar, arcb.n, new alhp(), a);
        }
        return null;
    }

    @Override // defpackage.aqva
    public final String b() {
        return "dns";
    }

    @Override // defpackage.aqve
    public final Collection c() {
        return Collections.singleton(InetSocketAddress.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqve
    public final void d() {
    }

    @Override // defpackage.aqve
    public final void e() {
    }
}
