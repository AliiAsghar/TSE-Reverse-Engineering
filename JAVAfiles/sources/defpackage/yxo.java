package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxo {
    private static final xze a = xze.g("BugleDataModel", "SmsTextExtractor");
    private final ryy b;
    private final psz c;
    private final psw d;

    public yxo(ryy ryyVar, psz pszVar, psw pswVar) {
        this.b = ryyVar;
        this.c = pszVar;
        this.d = pswVar;
    }

    public final String a(MessageCoreData messageCoreData, msh mshVar) {
        if (((Boolean) vof.a.e()).booleanValue() && messageCoreData.O() != null) {
            return d.aw(messageCoreData);
        }
        MessagePartCoreData G = messageCoreData.G();
        if (G == null) {
            return albo.ag(messageCoreData.am());
        }
        if (!messageCoreData.cd()) {
            if (this.d.a()) {
                return messageCoreData.aj();
            }
            try {
                Optional f = this.c.f(mshVar);
                if (f.isEmpty()) {
                    xyo e = a.e();
                    e.H("Capabilities not cached for");
                    e.j(mshVar.toString());
                    e.q();
                    return messageCoreData.aj();
                }
                if (((Boolean) f.map(new yug(15)).orElse(false)).booleanValue()) {
                    return messageCoreData.av();
                }
                xyo e2 = a.e();
                e2.H("File transfer via SMS not supported for");
                e2.j(mshVar.toString());
                e2.q();
                return messageCoreData.aj();
            } catch (psx e3) {
                xyo e4 = a.e();
                e4.H("Unable to get capabilities for");
                e4.j(mshVar.toString());
                e4.r(e3);
                return messageCoreData.aj();
            }
        }
        return this.b.a(G);
    }
}
