package defpackage;

import android.net.Network;
import j$.util.Objects;
import j$.util.Optional;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aioy implements aihd {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aioy(aipa aipaVar, Network network, int i) {
        this.c = i;
        this.a = aipaVar;
        this.b = network;
    }

    @Override // defpackage.aihd
    public final InetAddress a(Socket socket, String str) {
        if (this.c != 0) {
            Object obj = this.b;
            Optional optional = (Optional) obj;
            if (optional.isPresent()) {
                advr.c("Binding MSRP socket to local address %s", advq.IP_ADDRESS.c(obj));
                socket.bind((SocketAddress) optional.get());
            }
            Object obj2 = this.a;
            Optional optional2 = (Optional) obj2;
            if (optional2.isPresent()) {
                advr.c("Bind socket to network %s", obj2);
                ((Network) optional2.get()).bindSocket(socket);
                if (Objects.nonNull(str)) {
                    return ((Network) optional2.get()).getByName(str);
                }
            }
            return null;
        }
        Object obj3 = this.b;
        aipa aipaVar = (aipa) this.a;
        advr.l(aipaVar.b, "Binding socket to network [%s]", obj3);
        try {
            ((Network) obj3).bindSocket(socket);
            if (str == null) {
                return null;
            }
            try {
                return ((Network) obj3).getByName(str);
            } catch (IOException e) {
                advr.j(e, aipaVar.b, "error resolving static PCSCF host [%s] while connecting SIP transport", str);
                throw e;
            }
        } catch (IOException e2) {
            advr.j(e2, aipaVar.b, "error binding socket to network [%s]", obj3);
            throw e2;
        }
    }

    public /* synthetic */ aioy(Optional optional, Optional optional2, int i) {
        this.c = i;
        this.b = optional;
        this.a = optional2;
    }
}
