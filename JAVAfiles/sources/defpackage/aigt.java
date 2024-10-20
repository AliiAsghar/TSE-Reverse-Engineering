package defpackage;

import android.net.QosCallback;
import android.net.QosCallbackException;
import android.net.QosSession;
import android.net.QosSessionAttributes;
import android.telephony.data.EpsBearerQosSessionAttributes;
import android.telephony.data.NrQosSessionAttributes;
import j$.util.Collection;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aigt extends QosCallback {
    final /* synthetic */ dtq a;
    final /* synthetic */ Socket b;
    final /* synthetic */ aigu c;

    public aigt(aigu aiguVar, dtq dtqVar, Socket socket) {
        this.a = dtqVar;
        this.b = socket;
        this.c = aiguVar;
    }

    public final void onError(QosCallbackException qosCallbackException) {
        this.a.d(qosCallbackException);
        this.c.f.e(qosCallbackException);
    }

    public final void onQosSessionAvailable(QosSession qosSession, QosSessionAttributes qosSessionAttributes) {
        advr.k("[SR] QoS session available.", new Object[0]);
        aozy createBuilder = apgq.a.createBuilder();
        try {
            if (qosSession.getSessionType() == 1) {
                EpsBearerQosSessionAttributes epsBearerQosSessionAttributes = (EpsBearerQosSessionAttributes) qosSessionAttributes;
                int qosIdentifier = epsBearerQosSessionAttributes.getQosIdentifier();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apgq apgqVar = (apgq) createBuilder.b;
                apgqVar.b |= 4;
                apgqVar.e = qosIdentifier;
                long guaranteedUplinkBitRateKbps = epsBearerQosSessionAttributes.getGuaranteedUplinkBitRateKbps();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apgq apgqVar2 = (apgq) createBuilder.b;
                apgqVar2.b |= 8;
                apgqVar2.f = guaranteedUplinkBitRateKbps;
                long guaranteedDownlinkBitRateKbps = epsBearerQosSessionAttributes.getGuaranteedDownlinkBitRateKbps();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apgq apgqVar3 = (apgq) createBuilder.b;
                apgqVar3.b |= 16;
                apgqVar3.g = guaranteedDownlinkBitRateKbps;
                Collection.EL.stream(epsBearerQosSessionAttributes.getRemoteAddresses()).forEach(new aidg(createBuilder, 6));
            } else if (qosSession.getSessionType() == 2) {
                NrQosSessionAttributes nrQosSessionAttributes = (NrQosSessionAttributes) qosSessionAttributes;
                int qosIdentifier2 = nrQosSessionAttributes.getQosIdentifier();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apgq apgqVar4 = (apgq) createBuilder.b;
                apgqVar4.b |= 4;
                apgqVar4.e = qosIdentifier2;
                long guaranteedUplinkBitRateKbps2 = nrQosSessionAttributes.getGuaranteedUplinkBitRateKbps();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apgq apgqVar5 = (apgq) createBuilder.b;
                apgqVar5.b |= 8;
                apgqVar5.f = guaranteedUplinkBitRateKbps2;
                long guaranteedDownlinkBitRateKbps2 = nrQosSessionAttributes.getGuaranteedDownlinkBitRateKbps();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apgq apgqVar6 = (apgq) createBuilder.b;
                apgqVar6.b |= 16;
                apgqVar6.g = guaranteedDownlinkBitRateKbps2;
                Collection.EL.stream(nrQosSessionAttributes.getRemoteAddresses()).forEach(new aidg(createBuilder, 7));
            }
        } catch (ClassCastException unused) {
            advr.d(advr.b, "Could not cast QosSessionAttributes", new Object[0]);
        }
        aozy createBuilder2 = apgp.a.createBuilder();
        int sessionId = qosSession.getSessionId();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apgq apgqVar7 = (apgq) createBuilder.b;
        apgqVar7.b |= 1;
        apgqVar7.c = sessionId;
        int h = agrk.h(qosSession.getSessionType());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apgq apgqVar8 = (apgq) createBuilder.b;
        apgqVar8.d = h - 1;
        apgqVar8.b |= 2;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apgp apgpVar = (apgp) createBuilder2.b;
        apgq apgqVar9 = (apgq) createBuilder.s();
        apgqVar9.getClass();
        apgpVar.d = apgqVar9;
        apgpVar.b |= 2;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aigu aiguVar = this.c;
        apgp apgpVar2 = (apgp) createBuilder2.b;
        apgpVar2.e = 2;
        apgpVar2.b |= 4;
        aiguVar.f.g((apgp) createBuilder2.s(), 3);
        try {
            if (qosSession.getSessionType() == 1) {
                EpsBearerQosSessionAttributes epsBearerQosSessionAttributes2 = (EpsBearerQosSessionAttributes) qosSessionAttributes;
                int qosIdentifier3 = epsBearerQosSessionAttributes2.getQosIdentifier();
                List remoteAddresses = epsBearerQosSessionAttributes2.getRemoteAddresses();
                advr.c("[SR] EpsBearerQosSessionAttributes: [ qosIdentifier = %d, remoteAddresses = %s]", Integer.valueOf(qosIdentifier3), Arrays.toString(alzz.as(remoteAddresses, new ahnx(12)).toArray()));
                aigu.c(qosIdentifier3);
                aigu.d(remoteAddresses, this.b);
            } else if (qosSession.getSessionType() == 2) {
                NrQosSessionAttributes nrQosSessionAttributes2 = (NrQosSessionAttributes) qosSessionAttributes;
                int qosIdentifier4 = nrQosSessionAttributes2.getQosIdentifier();
                List remoteAddresses2 = nrQosSessionAttributes2.getRemoteAddresses();
                advr.c("[SR] NrQosSessionAttributes: [ qosIdentifier = %d, remoteAddresses = %s]", Integer.valueOf(qosIdentifier4), Arrays.toString(alzz.as(remoteAddresses2, new ahnx(12)).toArray()));
                aigu.c(qosIdentifier4);
                aigu.d(remoteAddresses2, this.b);
            } else {
                throw new IOException("Unknown QoS session type.");
            }
        } catch (IOException | ClassCastException e) {
            this.a.d(e);
            this.c.f.e(e);
        }
        this.a.b(this);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [aiio, java.lang.Object] */
    public final void onQosSessionLost(QosSession qosSession) {
        advr.q("[SR] QoS session lost.", new Object[0]);
        this.c.g.a.aN();
        aozy createBuilder = apgp.a.createBuilder();
        aozy createBuilder2 = apgq.a.createBuilder();
        int sessionId = qosSession.getSessionId();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apgq apgqVar = (apgq) createBuilder2.b;
        apgqVar.b |= 1;
        apgqVar.c = sessionId;
        int h = agrk.h(qosSession.getSessionType());
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apgq apgqVar2 = (apgq) createBuilder2.b;
        apgqVar2.d = h - 1;
        apgqVar2.b |= 2;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apgp apgpVar = (apgp) createBuilder.b;
        apgq apgqVar3 = (apgq) createBuilder2.s();
        apgqVar3.getClass();
        apgpVar.d = apgqVar3;
        apgpVar.b |= 2;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aigu aiguVar = this.c;
        apgp apgpVar2 = (apgp) createBuilder.b;
        apgpVar2.e = 3;
        apgpVar2.b |= 4;
        aiguVar.f.g((apgp) createBuilder.s(), 3);
    }
}
