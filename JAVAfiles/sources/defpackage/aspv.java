package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aspv extends aspx {
    private final Method a;
    private final Method c;
    private final Method d;
    private final Class e;
    private final Class f;

    public aspv(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.a = method;
        this.c = method2;
        this.d = method3;
        this.e = cls;
        this.f = cls2;
    }

    @Override // defpackage.aspx
    public final String a(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.c.invoke(null, sSLSocket));
            invocationHandler.getClass();
            aspu aspuVar = (aspu) invocationHandler;
            if (aspuVar.a) {
                return null;
            }
            String str = aspuVar.b;
            if (str != null) {
                return str;
            }
            aspx.l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }

    @Override // defpackage.aspx
    public final void c(SSLSocket sSLSocket, String str, List list) {
        try {
            this.a.invoke(null, sSLSocket, Proxy.newProxyInstance(aspx.class.getClassLoader(), new Class[]{this.e, this.f}, new aspu(aotl.Y(list))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // defpackage.aspx
    public final void i(SSLSocket sSLSocket) {
        try {
            this.d.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }
}
