package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asqd implements asqg {
    public static final asqc a = new asqc();
    private final Class b;
    private final Method c;
    private final Method d;
    private final Method e;
    private final Method f;

    public asqd(Class cls) {
        this.b = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.c = declaredMethod;
        this.d = cls.getMethod("setHostname", String.class);
        this.e = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.asqg
    public final String a(SSLSocket sSLSocket) {
        if (!d(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.e.invoke(sSLSocket, null);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, arul.a);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && d.F(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.asqg
    public final void b(SSLSocket sSLSocket, String str, List list) {
        if (d(sSLSocket)) {
            try {
                this.c.invoke(sSLSocket, true);
                this.d.invoke(sSLSocket, str);
                Method method = this.f;
                aspx aspxVar = aspx.b;
                asqu asquVar = new asqu();
                for (String str2 : aotl.Y(list)) {
                    asquVar.M(str2.length());
                    asquVar.Z(str2);
                }
                method.invoke(sSLSocket, asquVar.E());
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // defpackage.asqg
    public final boolean c() {
        return aspt.a;
    }

    @Override // defpackage.asqg
    public final boolean d(SSLSocket sSLSocket) {
        return this.b.isInstance(sSLSocket);
    }

    public asqd(Class cls, byte[] bArr) {
        this(cls);
    }
}
