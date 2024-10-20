package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xah implements wzb {
    private final ajsg a;
    private final pwa b;
    private final armf c;

    public xah(ajsg ajsgVar, pwa pwaVar, armf armfVar) {
        this.a = ajsgVar;
        this.b = pwaVar;
        this.c = armfVar;
    }

    @Override // defpackage.wzb
    public final akul c(qeq qeqVar, MessageCoreData messageCoreData, aoia aoiaVar) {
        pwc pwcVar = new pwc();
        qep qepVar = qeqVar.c;
        if (qepVar == null) {
            qepVar = qep.a;
        }
        FileInformation fileInformation = (FileInformation) pwcVar.fu(qepVar);
        MessagePartCoreData G = messageCoreData.G();
        if (G != null && G.aW()) {
            ajqc c = fileInformation.c();
            c.c(Duration.ofMillis(G.k()));
            fileInformation = c.a();
        }
        arbj arbjVar = new arbj((byte[]) null, (char[]) null, (char[]) null);
        arbjVar.E(fileInformation);
        if ((qeqVar.b & 2) != 0) {
            qep qepVar2 = qeqVar.d;
            if (qepVar2 == null) {
                qepVar2 = qep.a;
            }
            arbjVar.F((FileInformation) pwcVar.fu(qepVar2));
        }
        try {
            ajrt b = this.a.b(FileTransferInformation.class).b(arbjVar.C());
            ((mbl) this.c.b()).e("Bugle.Etouffee.FileTransfer.Format.Outgoing", yyb.cV(5));
            return aktp.ag((qej) this.b.fu(b));
        } catch (ajsh e) {
            throw new wyz(e);
        }
    }
}
