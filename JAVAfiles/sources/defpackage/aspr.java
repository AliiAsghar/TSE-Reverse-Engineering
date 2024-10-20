package defpackage;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aspr extends aspx {
    public static final boolean a;
    private final List c;

    static {
        boolean z = false;
        if (aotl.Z() && Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        a = z;
    }

    public aspr() {
        aspy aspyVar;
        asqg[] asqgVarArr = new asqg[2];
        if (aotl.X()) {
            aspyVar = new aspy();
        } else {
            aspyVar = null;
        }
        asqgVarArr[0] = aspyVar;
        asqgVarArr[1] = new asqf(asqd.a);
        List o = aqil.o(asqgVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : o) {
            if (((asqg) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override // defpackage.aspx
    public final String a(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((asqg) obj).d(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        asqg asqgVar = (asqg) obj;
        if (asqgVar == null) {
            return null;
        }
        return asqgVar.a(sSLSocket);
    }

    @Override // defpackage.aspx
    public final asql b(X509TrustManager x509TrustManager) {
        aspz W = aotl.W(x509TrustManager);
        if (W != null) {
            return W;
        }
        return super.b(x509TrustManager);
    }

    @Override // defpackage.aspx
    public final void c(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((asqg) obj).d(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        asqg asqgVar = (asqg) obj;
        if (asqgVar != null) {
            asqgVar.b(sSLSocket, str, list);
        }
    }

    @Override // defpackage.aspx
    public final boolean d(String str) {
        boolean isCleartextTrafficPermitted;
        isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        return isCleartextTrafficPermitted;
    }
}
