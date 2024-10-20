package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class arkd {
    public final Provider c;
    public static final Logger a = Logger.getLogger(arkd.class.getName());
    private static final String[] d = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
    public static final arkd b = f();

    public arkd(Provider provider) {
        this.c = provider;
    }

    public static byte[] e(List list) {
        asqu asquVar = new asqu();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arke arkeVar = (arke) list.get(i);
            if (arkeVar != arke.HTTP_1_0) {
                asquVar.M(arkeVar.e.length());
                asquVar.Z(arkeVar.e);
            }
        }
        return asquVar.E();
    }

    private static arkd f() {
        Provider provider;
        int i;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i2 = 0;
        loop0: while (true) {
            if (i2 < length) {
                Provider provider2 = providers[i2];
                String[] strArr = d;
                int length2 = strArr.length;
                for (int i3 = 0; i3 < 5; i3++) {
                    String str = strArr[i3];
                    if (str.equals(provider2.getClass().getName())) {
                        a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                        provider = provider2;
                        break loop0;
                    }
                }
                i2++;
            } else {
                provider = null;
                break;
            }
        }
        if (provider != null) {
            asqe asqeVar = new asqe((Class) null, "setUseSessionTickets", Boolean.TYPE);
            asqe asqeVar2 = new asqe((Class) null, "setHostname", String.class);
            asqe asqeVar3 = new asqe(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            asqe asqeVar4 = new asqe((Class) null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    arkd.class.getClassLoader().loadClass("android.net.Network");
                } catch (ClassNotFoundException e) {
                    a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", (Throwable) e);
                    try {
                        arkd.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        i = 2;
                    } catch (ClassNotFoundException e2) {
                        a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", (Throwable) e2);
                        i = 3;
                    }
                }
            }
            i = 1;
            return new arjz(asqeVar, asqeVar2, asqeVar3, asqeVar4, provider, i);
        }
        try {
            Provider provider3 = SSLContext.getDefault().getProvider();
            try {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider3);
                    sSLContext.init(null, null, null);
                    SSLEngine.class.getMethod("getApplicationProtocol", null).invoke(sSLContext.createSSLEngine(), null);
                    return new arka(provider3, SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException unused2) {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    return new arkb(cls2.getMethod("put", SSLSocket.class, Class.forName(hht.h("org.eclipse.jetty.alpn.ALPN", "$Provider"))), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName(hht.h("org.eclipse.jetty.alpn.ALPN", "$ClientProvider")), Class.forName(hht.h("org.eclipse.jetty.alpn.ALPN", "$ServerProvider")), provider3);
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                return new arkd(provider3);
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        }
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public int c() {
        return 3;
    }

    public void d(SSLSocket sSLSocket) {
    }

    public void b(SSLSocket sSLSocket, String str, List list) {
    }
}
