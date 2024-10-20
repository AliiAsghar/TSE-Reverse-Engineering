package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arjj extends arjk {
    private static final Method d;
    private static final Method e;
    private static final Method f;
    private static final Method g;
    private static final Method h;
    private static final Method i;
    private static final Constructor j;
    private static final asqe k = new asqe((Class) null, "setUseSessionTickets", Boolean.TYPE);
    private static final asqe l = new asqe((Class) null, "setHostname", String.class);
    private static final asqe m = new asqe(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
    private static final asqe n = new asqe((Class) null, "setAlpnProtocols", byte[].class);
    private static final asqe o = new asqe(byte[].class, "getNpnSelectedProtocol", new Class[0]);
    private static final asqe p = new asqe((Class) null, "setNpnProtocols", byte[].class);

    static {
        NoSuchMethodException e2;
        Method method;
        Method method2;
        Method method3;
        ClassNotFoundException e3;
        Method method4;
        NoSuchMethodException noSuchMethodException;
        ClassNotFoundException classNotFoundException;
        Method method5;
        Method method6;
        Method method7;
        NoSuchMethodException noSuchMethodException2;
        Method method8;
        ClassNotFoundException classNotFoundException2;
        Constructor<?> constructor = null;
        try {
            method2 = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            try {
                method = SSLParameters.class.getMethod("getApplicationProtocols", null);
            } catch (ClassNotFoundException e4) {
                e3 = e4;
                method = null;
                method3 = null;
            } catch (NoSuchMethodException e5) {
                e2 = e5;
                method = null;
                method3 = null;
            }
            try {
                method6 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                try {
                    Class<?> cls = Class.forName("android.net.ssl.SSLSockets");
                    method7 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                    try {
                        method5 = cls.getMethod("setUseSessionTickets", SSLSocket.class, Boolean.TYPE);
                    } catch (ClassNotFoundException e6) {
                        classNotFoundException = e6;
                        method3 = method6;
                        method4 = method7;
                        arjk.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
                        method5 = null;
                        method6 = method3;
                        method7 = method4;
                        f = method2;
                        g = method;
                        h = method6;
                        d = method7;
                        e = method5;
                        method8 = SSLParameters.class.getMethod("setServerNames", List.class);
                        try {
                            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        } catch (ClassNotFoundException e7) {
                            classNotFoundException2 = e7;
                            arjk.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable) classNotFoundException2);
                            i = method8;
                            j = constructor;
                        } catch (NoSuchMethodException e8) {
                            noSuchMethodException2 = e8;
                            arjk.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable) noSuchMethodException2);
                            i = method8;
                            j = constructor;
                        }
                        i = method8;
                        j = constructor;
                    } catch (NoSuchMethodException e9) {
                        noSuchMethodException = e9;
                        method3 = method6;
                        method4 = method7;
                        arjk.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
                        method5 = null;
                        method6 = method3;
                        method7 = method4;
                        f = method2;
                        g = method;
                        h = method6;
                        d = method7;
                        e = method5;
                        method8 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        i = method8;
                        j = constructor;
                    }
                } catch (ClassNotFoundException e10) {
                    method4 = null;
                    classNotFoundException = e10;
                    method3 = method6;
                } catch (NoSuchMethodException e11) {
                    method4 = null;
                    noSuchMethodException = e11;
                    method3 = method6;
                }
            } catch (ClassNotFoundException e12) {
                e3 = e12;
                method3 = null;
                method4 = method3;
                classNotFoundException = e3;
                arjk.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
                method5 = null;
                method6 = method3;
                method7 = method4;
                f = method2;
                g = method;
                h = method6;
                d = method7;
                e = method5;
                method8 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                i = method8;
                j = constructor;
            } catch (NoSuchMethodException e13) {
                e2 = e13;
                method3 = null;
                method4 = method3;
                noSuchMethodException = e2;
                arjk.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
                method5 = null;
                method6 = method3;
                method7 = method4;
                f = method2;
                g = method;
                h = method6;
                d = method7;
                e = method5;
                method8 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                i = method8;
                j = constructor;
            }
        } catch (ClassNotFoundException e14) {
            e3 = e14;
            method = null;
            method2 = null;
            method3 = null;
        } catch (NoSuchMethodException e15) {
            e2 = e15;
            method = null;
            method2 = null;
            method3 = null;
        }
        f = method2;
        g = method;
        h = method6;
        d = method7;
        e = method5;
        try {
            method8 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
        } catch (ClassNotFoundException e16) {
            classNotFoundException2 = e16;
            method8 = null;
        } catch (NoSuchMethodException e17) {
            noSuchMethodException2 = e17;
            method8 = null;
        }
        i = method8;
        j = constructor;
    }

    public arjj(arkd arkdVar) {
        super(arkdVar);
    }

    @Override // defpackage.arjk
    public final String a(SSLSocket sSLSocket) {
        Method method = h;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                if (e3.getTargetException() instanceof UnsupportedOperationException) {
                    arjk.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
                } else {
                    throw new RuntimeException(e3);
                }
            }
        }
        if (this.c.c() == 1) {
            try {
                byte[] bArr = (byte[]) m.a(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, arkg.b);
                }
            } catch (Exception e4) {
                arjk.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (Throwable) e4);
            }
        }
        if (this.c.c() != 3) {
            try {
                byte[] bArr2 = (byte[]) o.a(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, arkg.b);
                }
            } catch (Exception e5) {
                arjk.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (Throwable) e5);
            }
        }
        return null;
    }

    @Override // defpackage.arjk
    public final String b(SSLSocket sSLSocket, String str, List list) {
        String a = a(sSLSocket);
        if (a == null) {
            return super.b(sSLSocket, str, list);
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0110  */
    @Override // defpackage.arjk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void c(javax.net.ssl.SSLSocket r10, java.lang.String r11, java.util.List r12) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arjj.c(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
    }
}
