package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tzj {
    private static final xze a = xze.g("BugleDatabase", "OnDraftTypeChangedGroupProcessor");
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;

    public tzj(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
    }

    private final void b(int i, tzg tzgVar) {
        xyo a2 = a.a();
        a2.H("Setting new conversation creation tombstone");
        a2.x("DraftMessageType", i);
        a2.q();
        tzw c = tzgVar.c(tze.a(i));
        if (c != null) {
            ((tzs) this.d.b()).d(tzgVar.a, c.g);
        }
    }

    public final void a(ConversationIdType conversationIdType, int i) {
        tzi tziVar;
        MessageCoreData l = ((rwd) this.b.b()).l(conversationIdType);
        if (l == null) {
            tzr tzrVar = (tzr) this.c.b();
            xyo a2 = tzr.a.a();
            a2.H("setConversationCreationTombstone skip insert, no messages in conversation");
            a2.z("conversationId", conversationIdType);
            a2.q();
            tzrVar.b.c("Bugle.Etouffee.UI.PredictiveTombstone.Found.Empty.GroupConversation");
            return;
        }
        tzq g = ((izc) this.e.b()).g(l);
        xze xzeVar = a;
        xyo a3 = xzeVar.a();
        a3.H("current last message");
        Class<?> cls = g.getClass();
        int i2 = arsc.a;
        a3.z(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, new arrh(cls).c());
        a3.x("status", g.a().j());
        a3.z("protocol", g.b());
        a3.q();
        if (g instanceof tzg) {
            tzg tzgVar = (tzg) g;
            if (i != 30) {
                if (i != 40) {
                    xyo a4 = xzeVar.a();
                    a4.H("setConversationCreationTombstone skip insert, non-RCS conversation");
                    a4.z("conversationId", tzgVar.a.z());
                    a4.q();
                    return;
                }
                if (tte.h()) {
                    b(i, tzgVar);
                    return;
                }
                return;
            }
            b(i, tzgVar);
            return;
        }
        arml armlVar = tzy.a;
        tzy a5 = tzx.a(tze.a(i));
        if (a5 == null) {
            xyo a6 = xzeVar.a();
            a6.H("draftMessageType is not supported");
            a6.x("draftMessageType", i);
            a6.z("conversationId", g.a().z());
            a6.q();
            return;
        }
        if (a5 != tzy.e || tte.h()) {
            if (!(g instanceof tzh) && !(g instanceof tza) && !(g instanceof tzd)) {
                if (g instanceof tzo) {
                    tzo tzoVar = (tzo) g;
                    if (a5.a() == tzoVar.b()) {
                        tziVar = tzi.a;
                    } else {
                        MessageCoreData n = ((rwd) this.b.b()).n(tzoVar.a.z());
                        if (n == null) {
                            tziVar = tzi.b;
                        } else if (a5.a() == new tzh(n).b()) {
                            tziVar = tzi.c;
                        } else {
                            tziVar = tzi.d;
                        }
                    }
                    xyo a7 = xzeVar.a();
                    a7.H("insertOrUpdateProtocolSwitchTombstone");
                    a7.z("scenario", tziVar);
                    a7.q();
                    int ordinal = tziVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    ((tzs) this.d.b()).d(tzoVar.a, a5.h);
                                    return;
                                }
                                throw new armm();
                            }
                            ((tzs) this.d.b()).a(tzoVar.a);
                            return;
                        }
                        xyo a8 = xzeVar.a();
                        a8.H("setProtocolChangeTombstone found no messages before last tombstone; updating tombstone");
                        a8.x("newTombstoneStatus", a5.h);
                        a8.q();
                        ((tzs) this.d.b()).d(tzoVar.a, a5.h);
                        return;
                    }
                    return;
                }
                return;
            }
            if (a5.a() == g.b()) {
                xyo a9 = xzeVar.a();
                a9.H("Skipping tombstone insertion, both current and new tombstones are equal");
                a9.z("current message protocol", g.b());
                a9.x("newTombstone", a5.h);
                a9.q();
                return;
            }
            xyo a10 = xzeVar.a();
            a10.H("Inserting new tombstone, last message is different from current draft type");
            a10.z("current message protocol", g.b());
            a10.x("newTombstone", a5.h);
            a10.q();
            tzs tzsVar = (tzs) this.d.b();
            ConversationIdType z = g.a().z();
            z.getClass();
            tzsVar.b(z, a5.h, g.a().n() + 1, null);
        }
    }
}
