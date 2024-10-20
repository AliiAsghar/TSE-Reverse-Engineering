package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xcp implements rwo {
    private final xcs a;

    public xcp(xcs xcsVar) {
        this.a = xcsVar;
    }

    @Override // defpackage.rwo
    public final void c(MessageCoreData messageCoreData) {
        if (!((Boolean) xcs.l.e()).booleanValue()) {
            return;
        }
        ahka ahkaVar = new ahka("ToMessageStoredInDbRcs");
        String f = messageCoreData.E().f();
        xcs xcsVar = this.a;
        messageCoreData.bZ();
        xcsVar.i(f, ahkaVar, xcs.i);
    }

    @Override // defpackage.rwo
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.rwo
    public final void d(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.rwo
    public final void e(MessageCoreData messageCoreData) {
    }
}
