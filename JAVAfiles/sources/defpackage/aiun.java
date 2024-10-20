package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiun extends SSLServerSocketFactory {
    public static aiul a;
    private static final String b = "aiuo";

    private static final SSLServerSocketFactory a() {
        try {
            return SSLContext.getInstance("Default").getServerSocketFactory();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static final SSLServerSocketFactory b() {
        String str;
        atal atalVar = atal.c;
        int i = atalVar.a;
        a.a(atalVar);
        SSLServerSocketFactory a2 = a();
        if (a2 instanceof aiun) {
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
        return a2;
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i) {
        return b().createServerSocket(i);
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public final String[] getDefaultCipherSuites() {
        try {
            return b().getDefaultCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public final String[] getSupportedCipherSuites() {
        try {
            return b().getSupportedCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2) {
        return b().createServerSocket(i, i2);
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) {
        return b().createServerSocket(i, i2, inetAddress);
    }
}
