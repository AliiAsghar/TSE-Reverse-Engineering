package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tzp {
    private static final xze a = xze.g("BugleDatabase", "SurroundingTombstoneUpdater");
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;

    public tzp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.g = armfVar6;
        this.h = armfVar7;
    }

    private final MessageCoreData d(MessageCoreData messageCoreData) {
        return ((rwd) this.b.b()).g(messageCoreData.z(), messageCoreData.n());
    }

    private static final xyo e() {
        return a.c();
    }

    public final void a(MessageCoreData messageCoreData, tzy tzyVar, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        xze xzeVar = a;
        xyo a2 = xzeVar.a();
        a2.H("insertOrUpdateTombstoneAtConversationBottomIfNeeded");
        a2.x("protocolSwitchTombstone status", tzyVar.h);
        a2.z("protocol", tzyVar.a());
        a2.q();
        if (tzyVar.a() != tzf.d || tte.h()) {
            MessageCoreData a3 = ((tsa) this.c.b()).a(messageCoreData.z(), messageCoreData.B());
            boolean z4 = true;
            if (a3 == null) {
                xyo a4 = xzeVar.a();
                a4.H("Found a conversation with no latest message");
                a4.z("conversationId", messageCoreData.z());
                a4.q();
                xyo e = e();
                e.H("inserting a new group tombstone");
                e.z("conversationId", messageCoreData.z());
                e.q();
                arml armlVar = tzw.a;
                tzf b = tze.b(messageCoreData);
                b.getClass();
                int ordinal = b.ordinal();
                tzw tzwVar = null;
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            tzwVar = tzw.c;
                        } else {
                            throw new armm();
                        }
                    } else {
                        tzwVar = tzw.b;
                    }
                }
                if (tzwVar != null) {
                    List K = ((rtz) this.d.b()).K(messageCoreData.z());
                    K.getClass();
                    ((ujv) this.e.b()).k(Optional.empty(), messageCoreData.z(), K, tzwVar.g, messageCoreData.n() - 1);
                    return;
                }
                return;
            }
            tzq g = ((izc) this.g.b()).g(a3);
            xyo a5 = xzeVar.a();
            a5.H("latest message found");
            Class<?> cls = g.getClass();
            int i = arsc.a;
            a5.z(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, new arrh(cls).c());
            a5.x("status", g.a().j());
            a5.z("protocol", g.b());
            a5.q();
            if (g.b() == tzyVar.a() && !(g instanceof tzg)) {
                xyo a6 = xzeVar.a();
                a6.H("protocols are matching. returning");
                a6.q();
                return;
            }
            if (g instanceof tzo) {
                tzo tzoVar = (tzo) g;
                if (tzoVar.b() == tzf.d) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xyo e2 = e();
                e2.H("latest message is protocol switch tombstone. Deleting and updating current latest message.");
                e2.q();
                ((tzs) this.f.b()).a(tzoVar.a);
                z = z3;
                a3 = ((tsa) this.c.b()).a(messageCoreData.z(), messageCoreData.B());
            } else {
                z = false;
            }
            if (a3 == null) {
                xyo e3 = e();
                e3.H("Couldn't find latest message. Inserting a new protocol switch tombstone");
                e3.z("tombstone status", tzyVar.a());
                e3.q();
                tzs tzsVar = (tzs) this.f.b();
                ConversationIdType z5 = messageCoreData.z();
                z5.getClass();
                tzsVar.b(z5, tzyVar.h, j, Boolean.valueOf(z));
                return;
            }
            tzq g2 = ((izc) this.g.b()).g(a3);
            xyo a7 = xzeVar.a();
            a7.H("current latest message");
            a7.z(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, new arrh(g2.getClass()).c());
            a7.x("status", g2.a().j());
            a7.z("protocol", g2.b());
            a7.q();
            if (g2 instanceof tzg) {
                xyo e4 = e();
                e4.H("current latest message is new conversation tombstone. Attempting to update the tombstone");
                e4.q();
                tzg tzgVar = (tzg) g2;
                tzw c = tzgVar.c(tze.b(messageCoreData));
                if (c != null) {
                    ((tzs) this.f.b()).d(tzgVar.a, c.g);
                }
                if (((oib) this.h.b()).a() && tzyVar.a() == tzf.b && tzgVar.b() == tzf.d) {
                    tzs tzsVar2 = (tzs) this.f.b();
                    ConversationIdType z6 = messageCoreData.z();
                    z6.getClass();
                    tzsVar2.b(z6, tzyVar.h, j, Boolean.valueOf(z));
                    return;
                }
                return;
            }
            if (((oib) this.h.b()).a()) {
                tzf b2 = g2.b();
                tzf a8 = tzyVar.a();
                tzf tzfVar = tzf.b;
                if (b2 == tzfVar && a8 == tzf.c) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (b2 != tzf.c || a8 != tzfVar) {
                    z4 = false;
                }
                if (!z2 && !z4 && b2 != a8) {
                    xyo e5 = e();
                    e5.H("current latest message protocol is different from the target protocol");
                    e5.z("latest message protocol", g2.b());
                    e5.z("target tombstone status", tzyVar.a());
                    e5.q();
                    tzs tzsVar3 = (tzs) this.f.b();
                    ConversationIdType z7 = messageCoreData.z();
                    z7.getClass();
                    tzsVar3.b(z7, tzyVar.h, j, Boolean.valueOf(z));
                    return;
                }
                return;
            }
            if (g2.b() != tzyVar.a()) {
                xyo e6 = e();
                e6.H("current latest message protocol is different from the target protocol");
                e6.z("latest message protocol", g2.b());
                e6.z("target tombstone status", tzyVar.a());
                e6.q();
                tzs tzsVar4 = (tzs) this.f.b();
                ConversationIdType z8 = messageCoreData.z();
                z8.getClass();
                tzsVar4.b(z8, tzyVar.h, j, Boolean.valueOf(z));
            }
        }
    }

    public final void b(MessageCoreData messageCoreData) {
        xyo e = e();
        e.H("Update previous tombstone");
        e.q();
        MessageCoreData h = ((rwd) this.b.b()).h(messageCoreData.z(), messageCoreData.n());
        if (h != null) {
            tzq g = ((izc) this.g.b()).g(h);
            xyo e2 = e();
            e2.H("updatePreviousTombstone: tombstone");
            Class<?> cls = g.getClass();
            int i = arsc.a;
            e2.z(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, new arrh(cls).c());
            e2.x("status", g.a().j());
            e2.z("protocol", g.b());
            e2.q();
            if (g instanceof tzg) {
                tzg tzgVar = (tzg) g;
                a.l("updateNewConversationTombstoneBasedOnCurrentOrNextMessage");
                izc izcVar = (izc) this.g.b();
                MessageCoreData d = d(messageCoreData);
                if (d != null) {
                    messageCoreData = d;
                }
                tzq g2 = izcVar.g(messageCoreData);
                if (g2.b() != tzf.d || tte.h()) {
                    if (g2 instanceof tzo) {
                        tzo tzoVar = (tzo) g2;
                        xyo e3 = e();
                        e3.H("updateProtocolForNewConversationTombstoneToMatchProtocolSwitchTombstone");
                        e3.z("protocolSwitchTombstone protocol", tzoVar.b());
                        e3.z("newConversationTombstone protocol", tzgVar.b());
                        e3.q();
                        tzw c = tzgVar.c(tzoVar.b());
                        if (c != null) {
                            ((tzs) this.f.b()).d(tzgVar.a, c.g);
                        }
                        ((tzs) this.f.b()).a(tzoVar.a);
                        return;
                    }
                    if (g2 instanceof tzh) {
                        tzh tzhVar = (tzh) g2;
                        xyo e4 = e();
                        e4.H("updateProtocolForNewConversationTombstoneToMatchNonTombstoneMessage");
                        e4.z("nonTombstone protocol", tzhVar.b());
                        e4.z("newConversationTombstone protocol", tzgVar.b());
                        e4.q();
                        tzw c2 = tzgVar.c(tze.b(tzhVar.a));
                        if (c2 != null && tzgVar.b() != c2.a()) {
                            ((tzs) this.f.b()).d(tzgVar.a, c2.g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (g instanceof tzo) {
                tzo tzoVar2 = (tzo) g;
                MessageCoreData d2 = d(messageCoreData);
                if (d2 != null) {
                    if (tzx.b(d2.j()) || tzoVar2.b() != tze.b(d2)) {
                        ((tzs) this.f.b()).a(tzoVar2.a);
                    }
                }
            }
        }
    }
}
