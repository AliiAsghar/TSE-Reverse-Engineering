package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xai implements wzd {
    private final /* synthetic */ int a;
    private final Object b;
    private final algf c;

    public xai(ajsg ajsgVar, pwa pwaVar, int i) {
        this.a = i;
        this.b = ajsgVar;
        this.c = pwaVar;
    }

    @Override // defpackage.wzd
    public final qej a(int i, rve rveVar, Instant instant) {
        ajqu ajquVar;
        if (this.a != 0) {
            aozy createBuilder = qej.a.createBuilder();
            qel qelVar = (qel) ((pwb) this.c).m().fu(ContentType.d(((wya) this.b).a));
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qej qejVar = (qej) createBuilder.b;
            qelVar.getClass();
            qejVar.c = qelVar;
            qejVar.b |= 1;
            aozb w = aozb.w(((wya) this.b).b);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qej qejVar2 = (qej) createBuilder.b;
            qejVar2.b |= 2;
            qejVar2.d = w;
            return (qej) createBuilder.s();
        }
        if (i != 2) {
            ajquVar = ajqu.DISPLAY;
        } else {
            ajquVar = ajqu.DELIVERY;
        }
        asmg asmgVar = new asmg((byte[]) null, (byte[]) null);
        asmgVar.t(ajquVar);
        asmgVar.q(rve.e(rveVar));
        asmgVar.s(instant);
        asmgVar.r(ajquVar.f);
        try {
            return (qej) this.c.fu(((ajsg) this.b).b(MessageReceipt.class).b(asmgVar.m()));
        } catch (ajsh e) {
            throw new wyz(e);
        }
    }

    @Override // defpackage.wzd
    public final akul b(int i, MessageCoreData messageCoreData, aoia aoiaVar) {
        if (this.a != 0) {
            return aktp.af(new UnsupportedOperationException("this converter only supports returning receipts to blocked senders"));
        }
        return aktp.ag(a(i, messageCoreData.E(), Instant.ofEpochMilli(messageCoreData.q())));
    }

    public xai(String str, byte[] bArr, int i) {
        this.a = i;
        this.c = new pwb();
        this.b = new wya(str, bArr);
    }
}
