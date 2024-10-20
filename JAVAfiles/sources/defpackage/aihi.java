package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.List;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aihi extends aigp {
    static final acyz a = aczd.a(174303680);
    private final Optional b;

    public aihi(Optional optional) {
        this.b = optional;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, acyz] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, acyz] */
    private static final String[] e(String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            HashSet K = alzz.K(strArr);
            List c = anna.e(',').i().d().c((CharSequence) adac.c().a.b.a());
            if (!c.isEmpty()) {
                K.retainAll(c);
            }
            List c2 = anna.e(',').i().d().c((CharSequence) adac.c().a.a.a());
            K.removeAll(c2);
            if (!K.isEmpty()) {
                return (String[]) K.toArray(new String[0]);
            }
            throw new IllegalStateException(String.format("No protocols enabled after filtering: (\"%s\" ∩ \"%s\") - \"%s\" = ∅", TextUtils.join(",", strArr), TextUtils.join(",", c), TextUtils.join(",", c2)));
        }
        throw new IllegalArgumentException("At least one protocol needs to be available.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aigp
    public final SSLServerSocket c(SSLServerSocket sSLServerSocket) {
        if (((Boolean) a.a()).booleanValue()) {
            sSLServerSocket.setEnabledProtocols(e(sSLServerSocket.getEnabledProtocols()));
        }
        return sSLServerSocket;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aigp
    public final SSLSocket d(SSLSocket sSLSocket) {
        if (((Boolean) a.a()).booleanValue()) {
            sSLSocket.setEnabledProtocols(e(sSLSocket.getEnabledProtocols()));
        }
        return sSLSocket;
    }

    @Override // defpackage.aigp
    protected final Optional f() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aigp
    public final ServerSocket a(ServerSocket serverSocket) {
        return serverSocket;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aigp
    public final Socket b(Socket socket) {
        return socket;
    }
}
