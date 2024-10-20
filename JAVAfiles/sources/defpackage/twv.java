package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class twv implements rwo {
    public static final xze a = xze.g("BugleEtouffee", "EncryptedRetryMessageListener");
    public final armf b;
    private final armf c;

    public twv(armf armfVar, armf armfVar2) {
        this.c = armfVar;
        this.b = armfVar2;
    }

    private static void a(MessageCoreData messageCoreData, Optional optional) {
        optional.ifPresent(new ter(messageCoreData, 14));
    }

    @Override // defpackage.rwo
    public final void c(MessageCoreData messageCoreData) {
        if (messageCoreData.cn()) {
            rve E = messageCoreData.E();
            E.getClass();
            tcb tcbVar = new tcb();
            tcbVar.f("deleteSavedDecryptResult");
            tcbVar.b(new ttr(E, 18));
            int d = tcbVar.d();
            xze xzeVar = a;
            xyo a2 = xzeVar.a();
            a2.H("Deleted the saved decrypt result");
            a2.g(messageCoreData.E());
            a2.x("count", d);
            a2.q();
            if (tte.g()) {
                Optional a3 = ((twu) this.c.b()).a(messageCoreData.V());
                xyo a4 = xzeVar.a();
                a4.H("Received an encrypted message.");
                a4.A("IsRetry", a3.isPresent());
                a4.q();
                a3.ifPresent(new ter(this, 15));
            }
        }
    }

    @Override // defpackage.rwo
    public final void d(MessageCoreData messageCoreData) {
        if (!messageCoreData.cn()) {
            return;
        }
        a(messageCoreData, ((twu) this.c.b()).a(messageCoreData.V()));
        a(messageCoreData, wam.i(messageCoreData.V(), vxt.ETOUFFEE_NAMESPACE, "original-rcs-message-id").map(new tvq(3)));
    }

    @Override // defpackage.rwo
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.rwo
    public final void e(MessageCoreData messageCoreData) {
    }
}
