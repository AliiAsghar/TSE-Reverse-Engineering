package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xco implements rws {
    private final xcs a;
    private final armf b;

    public xco(xcs xcsVar, armf armfVar) {
        this.a = xcsVar;
        this.b = armfVar;
    }

    @Override // defpackage.rws
    public final akrh a() {
        return aktp.e("MessageLatencyAnalytics::onProcessSendSuccess");
    }

    @Override // defpackage.rws
    public final void b(MessageCoreData messageCoreData) {
        atok aF = messageCoreData.aF();
        if (aF == null) {
            return;
        }
        ahka a = ahka.a(new ahka("ToSent"), xcs.a(messageCoreData.d()));
        xcs xcsVar = this.a;
        String str = aF.b;
        messageCoreData.bZ();
        xcsVar.i(str, a, xcs.g);
        this.a.f(aF.b, ((Integer) xcs.a.e()).intValue(), xcs.h);
        qrm qrmVar = (qrm) this.b.b();
        MessageIdType B = messageCoreData.B();
        B.getClass();
        if (qrmVar.f != null) {
            qrmVar.a();
        }
        qrmVar.f = B;
        qrmVar.e.e(qrm.c);
        qrmVar.e.e(qrm.d);
        qrmVar.e.e(qrm.a);
        qrmVar.e.e(qrm.b);
    }
}
