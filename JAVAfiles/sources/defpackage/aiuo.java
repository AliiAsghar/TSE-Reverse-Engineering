package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiuo extends SSLSocketFactory {
    public static aiul a = null;
    private static final String b = "aiuo";
    private final KeyManager[] c;
    private final TrustManager[] d;
    private final SecureRandom e;

    public aiuo(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom) {
        this.c = keyManagerArr;
        this.d = trustManagerArr;
        this.e = secureRandom;
    }

    private final SSLSocketFactory a() {
        String str;
        atal atalVar = atal.c;
        int i = atalVar.a;
        a.a(atalVar);
        SSLSocketFactory b2 = b();
        if (b2 instanceof aiuo) {
            String str2 = "[";
            for (Provider provider : Security.getProviders()) {
                String concat = str2.concat(String.valueOf(provider.toString()));
                if (provider.stringPropertyNames().contains("SSLContext.Default")) {
                    str = "(true), ";
                } else {
                    str = "(false), ";
                }
                str2 = concat.concat(str);
            }
            Log.e(b, str2.concat("]"));
            throw new RuntimeException("Unable to find a default SSL provider.");
        }
        return b2;
    }

    private final SSLSocketFactory b() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            TrustManager[] trustManagerArr = this.d;
            if (trustManagerArr != null && trustManagerArr.length > 0 && (trustManagerArr[0] instanceof aiup)) {
                sSLContext.init(null, null, null);
            } else {
                sSLContext.init(this.c, trustManagerArr, this.e);
            }
            return sSLContext.getSocketFactory();
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return a().createSocket();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        try {
            return a().getDefaultCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        try {
            return a().getSupportedCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return a().createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return a().createSocket(str, i, inetAddress, i2);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return a().createSocket(inetAddress, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return a().createSocket(inetAddress, i, inetAddress2, i2);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return a().createSocket(socket, str, i, z);
    }
}
