package defpackage;

import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aifx extends aigp {
    public final int a;
    public final ahjj b;

    public aifx(int i, ahjj ahjjVar) {
        this.a = i;
        this.b = ahjjVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aigp
    public final ServerSocket a(ServerSocket serverSocket) {
        return new aigd(serverSocket);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aigp
    public final Socket b(Socket socket) {
        aigf aigfVar = new aigf(socket, aigg.l);
        aigfVar.e(new aifw(this, aigfVar, 0));
        return aigfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aigp
    public final SSLSocket d(SSLSocket sSLSocket) {
        aigc aigcVar = new aigc(sSLSocket);
        aigcVar.e(new aifw(this, aigcVar, 1));
        return aigcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aigp
    public final SSLServerSocket c(SSLServerSocket sSLServerSocket) {
        return sSLServerSocket;
    }
}
