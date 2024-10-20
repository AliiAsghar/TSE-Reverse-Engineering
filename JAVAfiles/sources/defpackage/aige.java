package defpackage;

import java.net.Socket;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aige implements aipb {
    public final /* synthetic */ SocketAddress a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Socket c;
    private final /* synthetic */ int d;

    public /* synthetic */ aige(Socket socket, SocketAddress socketAddress, int i, int i2) {
        this.d = i2;
        this.c = socket;
        this.a = socketAddress;
        this.b = i;
    }

    @Override // defpackage.aipb
    public final void a() {
        if (this.d != 0) {
            ((aifm) this.c).a.connect(this.a, this.b);
        } else {
            ((aifn) this.c).a.connect(this.a, this.b);
        }
    }
}
