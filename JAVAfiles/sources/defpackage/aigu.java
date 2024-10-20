package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.QosCallback;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aigu implements aigq {
    static final acyz a = acyy.b("SingleRegistrationQosHandler_enableExpandedQci");
    static final acyz b = acyy.b("SingleRegistrationQosHandler_disableQciVerification");
    public final anen c;
    public final Network d;
    public final adwp e;
    public final agrk f;
    public final asqc g;
    private QosCallback h;

    public aigu(anen anenVar, adwp adwpVar, Network network, asqc asqcVar, agrk agrkVar) {
        this.c = anenVar;
        this.e = adwpVar;
        this.d = network;
        this.g = asqcVar;
        this.f = agrkVar;
    }

    public static void c(int i) {
        if (!((Boolean) b.a()).booleanValue()) {
            if (((Boolean) a.a()).booleanValue()) {
                apao apaoVar = ((aplf) aczf.o().a.B.a()).b;
                Integer valueOf = Integer.valueOf(i);
                if (!apaoVar.contains(valueOf)) {
                    throw new IOException(String.format("Wrong QCI: expected %s, got %d.", apaoVar, valueOf));
                }
                return;
            }
            if (i == 6) {
            } else {
                throw new IOException(String.format("Wrong QCI: expected %d, got %d.", 6, Integer.valueOf(i)));
            }
        }
    }

    public static void d(List list, Socket socket) {
        if (((Boolean) aczf.o().a.z.a()).booleanValue() && !aczf.o().M() && list != null && !list.isEmpty()) {
            InetAddress inetAddress = socket.getInetAddress();
            inetAddress.getClass();
            InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, socket.getPort());
            if (!list.contains(inetSocketAddress)) {
                throw new IOException(String.format("Client socket connected to %s. QoS session set for %s.", inetSocketAddress, Arrays.toString(list.toArray())));
            }
        }
    }

    @Override // defpackage.aigq
    public final void a() {
        QosCallback qosCallback = this.h;
        if (qosCallback != null) {
            ((ConnectivityManager) this.e.a).unregisterQosCallback(qosCallback);
        }
    }

    @Override // defpackage.aigq
    public final void b(Socket socket) {
        advr.k("[SR] Setting up the dedicated bearer.", new Object[0]);
        aozy createBuilder = apgp.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        agrk agrkVar = this.f;
        apgp apgpVar = (apgp) createBuilder.b;
        apgpVar.e = 1;
        apgpVar.b |= 4;
        agrkVar.g((apgp) createBuilder.s(), 2);
        ListenableFuture m = d.m(new mfg(this, socket, 7));
        Integer num = (Integer) aczf.o().a.q.a();
        try {
            this.h = (QosCallback) m.get(num.intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException(e);
        } catch (ExecutionException e2) {
            e = e2;
            throw new IOException(e);
        } catch (TimeoutException e3) {
            advr.g("Timed out while waiting for %d seconds for the dedicated bearer setup.", num);
            agrk agrkVar2 = this.f;
            aozy createBuilder2 = apgp.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar = createBuilder2.b;
            apgp apgpVar2 = (apgp) apagVar;
            apgpVar2.c = 5;
            apgpVar2.b = 1 | apgpVar2.b;
            if (!apagVar.isMutable()) {
                createBuilder2.u();
            }
            apgp apgpVar3 = (apgp) createBuilder2.b;
            apgpVar3.e = 3;
            apgpVar3.b |= 4;
            agrkVar2.g((apgp) createBuilder2.s(), 4);
            throw new IOException(e3);
        }
    }
}
