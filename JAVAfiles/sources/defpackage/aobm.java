package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aobm implements aobn {
    private final aobq a;
    private final /* synthetic */ int b;

    public aobm(aobq aobqVar, int i) {
        this.b = i;
        this.a = aobqVar;
    }

    @Override // defpackage.aobn
    public final Object a(String str) {
        int i = this.b;
        Exception exc = null;
        if (i != 0) {
            if (i != 1) {
                Iterator it = aobo.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
                while (it.hasNext()) {
                    try {
                        return this.a.a(str, (Provider) it.next());
                    } catch (Exception e) {
                        if (exc == null) {
                            exc = e;
                        }
                    }
                }
                throw new GeneralSecurityException("No good Provider found.", exc);
            }
            Iterator it2 = aobo.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            while (it2.hasNext()) {
                try {
                    return this.a.a(str, (Provider) it2.next());
                } catch (Exception unused) {
                }
            }
            return this.a.a(str, null);
        }
        return this.a.a(str, null);
    }
}
