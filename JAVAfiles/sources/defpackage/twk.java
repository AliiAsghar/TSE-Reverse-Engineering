package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class twk {
    public static final xze a = xze.g("BugleEtouffee", "EncryptedMessageDeletionHandlerImpl");
    public final armf b;
    public final armf c;
    public final arwe d;
    private final armf e;

    public twk(armf armfVar, armf armfVar2, armf armfVar3, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        arweVar.getClass();
        this.b = armfVar;
        this.e = armfVar2;
        this.c = armfVar3;
        this.d = arweVar;
    }

    public final List a(sxx sxxVar) {
        alog<MessageCoreData> D = ((rwd) this.e.b()).D(sxxVar);
        D.getClass();
        ArrayList arrayList = new ArrayList(aqjn.J(D, 10));
        for (MessageCoreData messageCoreData : D) {
            aozy createBuilder = twl.a.createBuilder();
            createBuilder.getClass();
            qei qeiVar = (qei) messageCoreData.ab().orElse(null);
            qeiVar.getClass();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            twl twlVar = (twl) createBuilder.b;
            twlVar.c = qeiVar;
            twlVar.b |= 1;
            String f = messageCoreData.E().f();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            twl twlVar2 = (twl) createBuilder.b;
            twlVar2.b |= 2;
            twlVar2.d = f;
            apag s = createBuilder.s();
            s.getClass();
            arrayList.add((twl) s);
        }
        return aqjn.ax(arrayList);
    }
}
