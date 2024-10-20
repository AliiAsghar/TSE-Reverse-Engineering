package defpackage;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aspt extends aspx {
    public static final boolean a;
    private final List c;
    private final asqe d;

    static {
        boolean z = false;
        if (aotl.Z() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        a = z;
    }

    public aspt() {
        asqd asqdVar;
        Method method;
        Method method2;
        Method method3;
        asqg[] asqgVarArr = new asqg[2];
        try {
            Class<?> cls = Class.forName(hht.h("com.android.org.conscrypt", ".OpenSSLSocketImpl"));
            cls.getClass();
            Class.forName(hht.h("com.android.org.conscrypt", ".OpenSSLSocketFactoryImpl")).getClass();
            Class.forName(hht.h("com.android.org.conscrypt", ".SSLParametersImpl")).getClass();
            asqdVar = new asqd(cls, null);
        } catch (Exception e) {
            aspx.b.k("unable to load android socket classes", 5, e);
            asqdVar = null;
        }
        asqgVarArr[0] = asqdVar;
        asqgVarArr[1] = new asqf(asqd.a);
        List o = aqil.o(asqgVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : o) {
            if (((asqg) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            method3 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
        } catch (Exception unused) {
            method = null;
            method2 = null;
            method3 = null;
        }
        this.d = new asqe(method3, method2, method, null);
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

    @Override // defpackage.aspx
    public final asqn e(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            declaredMethod.getClass();
            return new asps(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.e(x509TrustManager);
        }
    }

    @Override // defpackage.aspx
    public final void f(String str, Object obj) {
        asqe asqeVar = this.d;
        if (obj != null) {
            try {
                Object obj2 = asqeVar.c;
                obj2.getClass();
                ((Method) obj2).invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        aspx.l(this, str, 5, 4);
    }

    @Override // defpackage.aspx
    public final Object g() {
        asqe asqeVar = this.d;
        Object obj = asqeVar.a;
        if (obj == null) {
            return null;
        }
        try {
            Object invoke = ((Method) obj).invoke(null, null);
            Object obj2 = asqeVar.b;
            obj2.getClass();
            ((Method) obj2).invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.aspx
    public final void h(Socket socket, InetSocketAddress inetSocketAddress) {
        socket.getClass();
        try {
            socket.connect(inetSocketAddress, 10000);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }
}
