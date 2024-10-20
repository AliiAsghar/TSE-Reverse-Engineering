package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tvh {
    private static final xze a = xze.g("BugleEtouffee", "IncomingFailedToDecryptReceiptProcessor");
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final qdx i;
    private final armf j;
    private final iji k;
    private final iew l;

    public tvh(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, iew iewVar, armf armfVar5, armf armfVar6, armf armfVar7, qdx qdxVar, iji ijiVar, armf armfVar8) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.l = iewVar;
        this.f = armfVar5;
        this.g = armfVar6;
        this.h = armfVar7;
        this.i = qdxVar;
        this.k = ijiVar;
        this.j = armfVar8;
    }

    private final void e(rve rveVar, MessageCoreData messageCoreData, boolean z) {
        xze xzeVar = a;
        xyo e = xzeVar.e();
        e.H("Message was already sent over MAX_FTD_RETRY_COUNT times.");
        e.y("getSendCounter", messageCoreData.p());
        e.q();
        mkw a2 = mkz.a();
        a2.c(messageCoreData.B());
        a2.h(19);
        a2.f(this.i.a());
        if (z) {
            a2.d = Optional.of(false);
            a2.b(false);
        }
        a2.e = Optional.of(1);
        if (!((mlb) this.j.b()).f(a2.a())) {
            xyo e2 = xzeVar.e();
            e2.H("Unable to update message id, counter, and state of the message when trying to resend the message. User won't be able to successfully resend the message.");
            e2.z("rcsMessageId", rveVar);
            e2.y("originalMessageCounter", messageCoreData.p());
            e2.q();
        }
    }

    public final boolean a(apwl apwlVar, rve rveVar, qei qeiVar, qei qeiVar2) {
        return b(apwlVar, rveVar, qeiVar.d, qeiVar2.d);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [armf, java.lang.Object] */
    @Deprecated
    public final boolean b(apwl apwlVar, rve rveVar, String str, String str2) {
        MessageCoreData messageCoreData;
        int b;
        String h;
        MessageCoreData r = ((rwd) this.c.b()).r(rveVar);
        if (r == null) {
            ((mbl) this.g.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 10);
            xyo e = a.e();
            e.H("Message not found.");
            e.g(rveVar);
            e.q();
            return false;
        }
        MessageIdType C = r.C();
        if (!C.b()) {
            messageCoreData = ((rwd) this.c.b()).q(C);
        } else {
            messageCoreData = null;
        }
        rto z = ((uac) this.b.b()).z(r.z());
        if (z == null) {
            ((mbl) this.g.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 11);
            xyo e2 = a.e();
            e2.H("Reencrypting message in a deleted conversation is not possible");
            e2.g(r.E());
            e2.z("conversationId", r.z());
            e2.q();
            return false;
        }
        int G = z.G();
        long p = r.p();
        if (G == 0) {
            b = 5;
        } else {
            b = tte.b();
        }
        if (p >= b) {
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            amfp amfpVar = amfp.BUGLE_E2EE_MESSAGE_RETRY_LIMIT_EXCEEDED;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amfrVar.i = amfpVar.dg;
            amfrVar.b |= 1;
            aozy createBuilder = amkh.a.createBuilder();
            String f = r.D().f();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amkh amkhVar = (amkh) createBuilder.b;
            amkhVar.b |= 1;
            amkhVar.c = f;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            amkh amkhVar2 = (amkh) createBuilder.s();
            amkhVar2.getClass();
            amfrVar2.R = amkhVar2;
            amfrVar2.c |= 2097152;
            ((maq) this.f.b()).j(amfqVar);
            ((mbl) this.g.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 16);
            e(rveVar, r, false);
            if (messageCoreData != null) {
                if (G == 0) {
                    e(rveVar, messageCoreData, true);
                }
                wpp wppVar = (wpp) this.d.b();
                ConversationIdType z2 = messageCoreData.z();
                MessageIdType B = messageCoreData.B();
                ParticipantsTable.BindData b2 = ((rxq) this.e.b()).b(str);
                if (b2 != null) {
                    h = b2.M();
                    h.getClass();
                } else {
                    h = ((rxq) this.e.b()).h(rxn.g(str));
                }
                wppVar.ag(z2, B, h, ((xnv) this.h.b()).f());
            }
            return false;
        }
        iew iewVar = this.l;
        aozy createBuilder2 = apld.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        apld apldVar = (apld) apagVar;
        apwlVar.getClass();
        apldVar.c = apwlVar;
        apldVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        apld apldVar2 = (apld) apagVar2;
        str2.getClass();
        apldVar2.b |= 2;
        apldVar2.d = str2;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        apld apldVar3 = (apld) createBuilder2.b;
        str.getClass();
        apldVar3.b |= 4;
        apldVar3.e = str;
        ((uof) iewVar.a.b()).a(upk.a("FtdHandlerWorkItem", (apld) createBuilder2.s()));
        xyo c = a.c();
        c.H("Scheduled a work item to resend a message that resulted in an FTD receipt.");
        c.z("Original RCS message ID", rveVar.b);
        c.q();
        return true;
    }

    public final boolean c(String str, String str2, qei qeiVar, qei qeiVar2) {
        if (!adah.d(str2)) {
            return false;
        }
        try {
            apwl G = wcm.G(str);
            if (!G.d.isEmpty()) {
                try {
                    rve a2 = rve.a(tvm.a(G.c).getMessageId());
                    this.k.m(a2);
                    return a(G, a2, qeiVar, qeiVar2);
                } catch (apba e) {
                    ((mbl) this.g.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 9);
                    a.n("Invalid receipt message", e);
                    return false;
                }
            }
            ((mbl) this.g.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 8);
            throw new IllegalStateException("Empty senderDeviceIds retrieved while decrypting");
        } catch (apba e2) {
            ((mbl) this.g.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 7);
            xyo e3 = a.e();
            e3.H("Failed to parse the MessageEnvelope.");
            e3.z("errorMessage", e2.getMessage());
            e3.q();
            throw new IllegalArgumentException(e2);
        }
    }

    @Deprecated
    public final boolean d(String str, String str2, String str3, String str4) {
        if (!adah.d(str2)) {
            return false;
        }
        try {
            apwl G = wcm.G(str);
            if (!G.d.isEmpty()) {
                try {
                    rve a2 = rve.a(tvm.a(G.c).getMessageId());
                    this.k.m(a2);
                    return b(G, a2, str3, str4);
                } catch (apba e) {
                    ((mbl) this.g.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 9);
                    a.n("Invalid receipt message", e);
                    return false;
                }
            }
            ((mbl) this.g.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 8);
            throw new IllegalStateException("Empty senderDeviceIds retrieved while decrypting");
        } catch (apba e2) {
            ((mbl) this.g.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 7);
            xyo e3 = a.e();
            e3.H("Failed to parse the MessageEnvelope.");
            e3.z("errorMessage", e2.getMessage());
            e3.q();
            throw new IllegalArgumentException(e2);
        }
    }
}
