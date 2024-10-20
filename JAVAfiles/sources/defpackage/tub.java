package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tub implements wzd {
    public static final xze a = xze.g("BugleRcs", "EncryptedRcsMessageReceiptConverter");
    public final ttz b;
    public final msk c;
    private final xai d;

    @Deprecated
    private final vbu e;
    private final pvz f;
    private final pwb g = new pwb();
    private final anen h;
    private final armf i;
    private final iji j;

    public tub(xai xaiVar, iji ijiVar, ttz ttzVar, vbu vbuVar, pvz pvzVar, msk mskVar, armf armfVar, anen anenVar) {
        this.d = xaiVar;
        this.j = ijiVar;
        this.b = ttzVar;
        this.e = vbuVar;
        this.f = pvzVar;
        this.c = mskVar;
        this.i = armfVar;
        this.h = anenVar;
    }

    @Override // defpackage.wzd
    public final qej a(int i, rve rveVar, Instant instant) {
        xyo c = a.c();
        c.H("Sending IMDN plaintext receipt because the message is missing");
        c.g(rveVar);
        c.q();
        return this.d.a(2, rveVar, instant);
    }

    @Override // defpackage.wzd
    public final akul b(int i, MessageCoreData messageCoreData, aoia aoiaVar) {
        qei qeiVar;
        String k;
        d.t(messageCoreData.cn(), "Message receipt should not be encrypted");
        if (i != 2) {
            if (aoiaVar.e() && !tte.i()) {
                xyo e = a.e();
                e.H("Sending IMDN plaintext display receipt for an etouffee group message");
                e.c(messageCoreData.B());
                e.g(messageCoreData.E());
                e.q();
                return this.d.b(3, messageCoreData, aoiaVar);
            }
            if (((okg) this.i.b()).a()) {
                qeiVar = messageCoreData.w();
            } else {
                qeiVar = null;
            }
            qei qeiVar2 = qeiVar;
            rve E = messageCoreData.E();
            apwq V = messageCoreData.V();
            Instant ofEpochMilli = Instant.ofEpochMilli(messageCoreData.q());
            aozy createBuilder = apwn.a.createBuilder();
            String e2 = rve.e(E);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            apwn apwnVar = (apwn) apagVar;
            apwnVar.b |= 1;
            apwnVar.c = e2;
            apwm apwmVar = apwm.READ;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apwn apwnVar2 = (apwn) createBuilder.b;
            apwnVar2.d = apwmVar.f;
            apwnVar2.b |= 2;
            byte[] byteArray = ((apwn) createBuilder.s()).toByteArray();
            if (qeiVar2 != null) {
                k = qeiVar2.d;
            } else {
                k = this.e.k();
            }
            return this.j.j(k).i(new tua(this, E, V, ofEpochMilli, aoiaVar, byteArray, qeiVar2, 0), this.h).h(new ttu(5), this.h).e(IllegalStateException.class, new ttu(6), this.h);
        }
        if (messageCoreData.ah() == null) {
            xyo e3 = a.e();
            e3.H("Sending IMDN plaintext delivery receipt for an etouffee 1 to 1 message");
            e3.c(messageCoreData.B());
            e3.g(messageCoreData.E());
            e3.q();
            return this.d.b(2, messageCoreData, aoiaVar);
        }
        aozy createBuilder2 = qej.a.createBuilder();
        qel qelVar = (qel) this.g.m().fu(ContentType.d(messageCoreData.ah()));
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        qej qejVar = (qej) createBuilder2.b;
        qelVar.getClass();
        qejVar.c = qelVar;
        qejVar.b |= 1;
        aozb w = aozb.w(messageCoreData.cV());
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        qej qejVar2 = (qej) createBuilder2.b;
        qejVar2.b = 2 | qejVar2.b;
        qejVar2.d = w;
        return aktp.ag((qej) createBuilder2.s());
    }
}
