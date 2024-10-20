package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xcn implements rwr {
    private final xcs a;

    public xcn(xcs xcsVar) {
        this.a = xcsVar;
    }

    @Override // defpackage.rwr
    public final akrh a() {
        return aktp.e("MessageLatencyAnalytics::onProcessDeliverSuccess");
    }

    @Override // defpackage.rwr
    public final void b(MessageCoreData messageCoreData) {
        atok aF = messageCoreData.aF();
        if (aF == null) {
            return;
        }
        ahka a = ahka.a(new ahka("ToDelivered"), xcs.a(messageCoreData.d()));
        xcs xcsVar = this.a;
        String str = aF.b;
        messageCoreData.bZ();
        xcsVar.i(str, a, xcs.g);
    }
}
