package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.util.Comparator;
import j$.util.Optional;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tzn {
    public static final xze a = xze.g("BugleDatabase", "ProtocolChangeTombstoneManager");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl");
    public final mbl c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final agnq g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    private final armf m;
    private final armf n;
    private final xca o;
    private final armf p;
    private final anen q;
    private final armf r;

    public tzn(mbl mblVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, agnq agnqVar, xca xcaVar, armf armfVar6, anen anenVar, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12) {
        this.c = mblVar;
        this.d = armfVar;
        this.m = armfVar3;
        this.f = armfVar4;
        this.e = armfVar2;
        this.n = armfVar5;
        this.g = agnqVar;
        this.o = xcaVar;
        this.p = armfVar6;
        this.q = anenVar;
        this.h = armfVar7;
        this.i = armfVar8;
        this.k = armfVar9;
        this.j = armfVar10;
        this.r = armfVar11;
        this.l = armfVar12;
    }

    public static int a(int i) {
        if (i == 40) {
            return 216;
        }
        if (i == 30) {
            return 215;
        }
        return 214;
    }

    public static int b(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                return 216;
            }
            return 215;
        }
        return 214;
    }

    public static boolean m(int i, int i2) {
        if (i == i2) {
            return true;
        }
        if (s(i) && s(i2)) {
            return true;
        }
        if (t(i) && t(i2)) {
            return true;
        }
        return false;
    }

    public static boolean n(MessageCoreData messageCoreData) {
        if (rvx.g(messageCoreData.j())) {
            return true;
        }
        return false;
    }

    private static int p(int i) {
        if (i != 215) {
            if (i != 216 && i != 219 && i != 235 && i != 237) {
                if (i != 238) {
                    return 206;
                }
                return 207;
            }
            return 213;
        }
        return 207;
    }

    private static int q(MessageCoreData messageCoreData) {
        if (messageCoreData.cI() && messageCoreData.cn()) {
            return 213;
        }
        if (messageCoreData.cI()) {
            return 207;
        }
        return 206;
    }

    private final MessageCoreData r(MessageCoreData messageCoreData, boolean z) {
        ConversationIdType z2 = messageCoreData.z();
        long n = messageCoreData.n();
        if (z) {
            return ((rwd) this.e.b()).h(z2, n);
        }
        return ((rwd) this.e.b()).g(z2, n);
    }

    private static boolean s(int i) {
        if (i != 216 && i != 219 && i != 233 && i != 237 && i != 235) {
            return false;
        }
        return true;
    }

    private static boolean t(int i) {
        if (i != 215 && i != 238 && i != 234) {
            return false;
        }
        return true;
    }

    private final boolean u(rto rtoVar) {
        if (rtoVar != null) {
            Optional n = rtoVar.n();
            if (!n.isEmpty()) {
                return v(rtoVar.S(), rtoVar.R(), (msh) n.get());
            }
            return false;
        }
        return false;
    }

    private final boolean v(boolean z, boolean z2, msh mshVar) {
        if (ttd.a() && !z && !z2 && this.o.l(mshVar.g())) {
            return true;
        }
        return false;
    }

    private static boolean w(rto rtoVar) {
        if (rtoVar != null && rtoVar.S() && rtoVar.G() == 2 && !rtoVar.R()) {
            return true;
        }
        return false;
    }

    public final akul c(ConversationIdType conversationIdType, msh mshVar, boolean z, boolean z2, int i) {
        if (!v(z, z2, mshVar)) {
            alvw d = b.d();
            d.X(alwp.a, "BugleEtouffee");
            alvg alvgVar = (alvg) d;
            alvgVar.X(ydl.p, conversationIdType);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "insertProtocolTombstoneIfDraftTypeChanged", 171, "ProtocolChangeTombstoneManagerImpl.java")).I("Skip insert protocol tombstone. Conversation not valid for protocolTombstones. isGroup: %b, hasBot: %b", z, z2);
            return aktp.ag(null);
        }
        return aktp.ai(new mjw(this, conversationIdType, i, 5), this.q);
    }

    public final akul d(ConversationIdType conversationIdType, boolean z, int i) {
        if (z) {
            return aktp.ag(null);
        }
        ((tzr) this.j.b()).a(1);
        tzc tzcVar = (tzc) this.h.b();
        xyo a2 = tzc.a.a();
        a2.H("onDraftTypeChanged");
        a2.z("conversationId", conversationIdType);
        a2.x("draftMessageType", i);
        a2.q();
        akul d = ((uie) tzcVar.c.b()).d("GroupProtocolChangeTombstoneManager#onDraftTypeChanged", new qq(tzcVar, conversationIdType, i, 17, (byte[]) null));
        d.getClass();
        return d;
    }

    public final void e(MessageCoreData messageCoreData) {
        boolean z;
        boolean z2;
        int q;
        boolean z3 = true;
        MessageCoreData r = r(messageCoreData, true);
        if (r != null) {
            MessageCoreData r2 = r(messageCoreData, false);
            if (rvx.g(r.j())) {
                if (r2 != null) {
                    messageCoreData = r2;
                }
                int j = r.j();
                if (rvx.e(messageCoreData.j())) {
                    int p = p(messageCoreData.j());
                    if (j != p) {
                        rwd rwdVar = (rwd) this.e.b();
                        ConversationIdType z4 = r.z();
                        MessageIdType B = r.B();
                        sya syaVar = new sya();
                        syaVar.aj("updateConversationCreationTombstone1");
                        syaVar.L(p(messageCoreData.j()));
                        rwdVar.O(z4, B, syaVar);
                        this.c.e("Bugle.Tombstone.Generated", p);
                        alvw d = b.d();
                        d.X(alwp.a, "BugleEtouffee");
                        alvg alvgVar = (alvg) d;
                        alvgVar.X(ydl.b, messageCoreData.B());
                        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateConversationCreationTombstone", 979, "ProtocolChangeTombstoneManagerImpl.java")).u("updateConversationCreationTombstone: if message is a tombstone. oldTombstone: %s, newTombstone: %s", j, p);
                    }
                    if (((nzt) this.l.b()).a()) {
                        j(messageCoreData, shs.s);
                    }
                    ((uzo) this.f.b()).a(messageCoreData.B());
                    return;
                }
                if (!d.z(messageCoreData.j()) && j != (q = q(messageCoreData))) {
                    rwd rwdVar2 = (rwd) this.e.b();
                    ConversationIdType z5 = r.z();
                    MessageIdType B2 = r.B();
                    sya syaVar2 = new sya();
                    syaVar2.aj("updateConversationCreationTombstone2");
                    syaVar2.L(q);
                    rwdVar2.O(z5, B2, syaVar2);
                    this.c.e("Bugle.Tombstone.Generated", q);
                    alvw d2 = b.d();
                    d2.X(alwp.a, "BugleEtouffee");
                    alvg alvgVar2 = (alvg) d2;
                    alvgVar2.X(ydl.b, messageCoreData.B());
                    ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateConversationCreationTombstone", 1005, "ProtocolChangeTombstoneManagerImpl.java")).u("updateConversationCreationTombstone: if message not a tombstone. oldTombstone: %s, newTombstone: %s", j, q);
                    return;
                }
                return;
            }
            if (rvx.e(r.j()) && r2 != null) {
                if (!d.z(r2.j())) {
                    int j2 = r.j();
                    if (r2.cI() && r2.cn() && s(j2)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (r2.cI()) {
                        if (j2 != 215) {
                            if (j2 == 238) {
                                j2 = 238;
                            }
                        }
                        z2 = true;
                        if (!r2.cI() || (j2 != 214 && j2 != 236)) {
                            z3 = false;
                        }
                        if (!z || z2 || z3) {
                            return;
                        }
                    }
                    z2 = false;
                    if (!r2.cI()) {
                    }
                    z3 = false;
                    if (!z) {
                        return;
                    } else {
                        return;
                    }
                }
                if (((nzt) this.l.b()).a()) {
                    j(r, shs.r);
                }
                alvw d3 = b.d();
                d3.X(alwp.a, "BugleEtouffee");
                alvg alvgVar3 = (alvg) d3;
                alvgVar3.X(ydl.p, r.z());
                ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "deletePreviousTombstoneIfNeeded", 936, "ProtocolChangeTombstoneManagerImpl.java")).r("Deleted previous tombstone. tombstone: %s", r.j());
                ((uzo) this.f.b()).a(r.B());
            }
        }
    }

    public final void f(ConversationIdType conversationIdType, int i, long j) {
        int i2;
        qwm d = ((ryg) this.n.b()).d();
        ParticipantsTable.BindData a2 = d.a();
        List K = ((rtz) this.m.b()).K(conversationIdType);
        long f = ((rtz) this.m.b()).f(conversationIdType);
        if (i == 216 && ((rwd) this.e.b()).i(conversationIdType) == null) {
            i2 = 219;
        } else {
            i2 = i;
        }
        ((ujv) this.p.b()).h(Optional.empty(), conversationIdType, d, a2, K, i2, j, f);
        alvw g = b.g();
        g.X(alwp.a, "BugleEtouffee");
        alvg alvgVar = (alvg) g;
        alvgVar.X(ydl.p, conversationIdType);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "insertNewTombstone", 1363, "ProtocolChangeTombstoneManagerImpl.java")).v("inserted new conversation tombstone. Tombstone: %s, time: %s", i2, j);
    }

    public final void g(MessageCoreData messageCoreData, int i, long j) {
        MessageCoreData o = ((rwd) this.e.b()).o(messageCoreData.z(), messageCoreData.B());
        if (o == null) {
            int p = p(i);
            ((ujv) this.p.b()).k(Optional.empty(), messageCoreData.z(), ((rtz) this.m.b()).K(messageCoreData.z()), p, j);
            return;
        }
        int j2 = o.j();
        if (!m(i, j2) && o.j() != 242) {
            if (rvx.e(j2)) {
                if (((nzt) this.l.b()).a()) {
                    j(o, shs.t);
                }
                ((uzo) this.f.b()).a(o.B());
                alvw d = b.d();
                d.X(alwp.a, "BugleEtouffee");
                alvg alvgVar = (alvg) d;
                alvgVar.X(ydl.p, o.z());
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "insertOrUpdateTombstoneAtConversationBottomIfNeeded", 1161, "ProtocolChangeTombstoneManagerImpl.java")).r("Deleted existing bottom tombstone. Tombstone: %s", o.j());
                o = ((rwd) this.e.b()).o(messageCoreData.z(), messageCoreData.B());
            }
            if (o != null && n(o)) {
                int q = q(messageCoreData);
                if (q != o.j()) {
                    o.bI(q);
                    ((rwd) this.e.b()).H(o);
                    this.c.e("Bugle.Tombstone.Generated", q);
                    return;
                }
                return;
            }
            if (messageCoreData == null || o == null || d.z(messageCoreData.j()) || d.z(o.j()) || messageCoreData.cI() != o.cI() || messageCoreData.cn() != o.cn()) {
                f(messageCoreData.z(), i, j);
            }
        }
    }

    public final void h(MessageCoreData messageCoreData, int i, tzk tzkVar, long j) {
        int i2;
        MessageCoreData o = ((rwd) this.e.b()).o(messageCoreData.z(), messageCoreData.B());
        if (o == null) {
            int ordinal = tzkVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        i2 = 213;
                    } else {
                        throw new IllegalStateException("Unknown tombstone protocol");
                    }
                } else {
                    i2 = 207;
                }
            } else {
                i2 = 206;
            }
            int p = p(i);
            ((ujv) this.p.b()).k(Optional.empty(), messageCoreData.z(), ((rtz) this.m.b()).K(messageCoreData.z()), p, j);
            this.c.e("Bugle.Tombstone.Generated", i2);
            return;
        }
        int j2 = o.j();
        if (rvx.e(j2)) {
            if (tzk.b(j2) != tzkVar) {
                if (((nzt) this.l.b()).a()) {
                    j(o, shs.t);
                }
                ((uzo) this.f.b()).a(o.B());
                alvw d = b.d();
                d.X(alwp.a, "BugleEtouffee");
                alvg alvgVar = (alvg) d;
                alvgVar.X(ydl.p, o.z());
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "insertOrUpdateTombstoneAtConversationBottomIfNeededV2", 1255, "ProtocolChangeTombstoneManagerImpl.java")).r("Deleted existing bottom tombstone. Tombstone: %s", o.j());
                o = ((rwd) this.e.b()).o(messageCoreData.z(), messageCoreData.B());
            } else {
                return;
            }
        }
        if (o != null) {
            if (n(o)) {
                int q = q(messageCoreData);
                if (q != o.j()) {
                    o.bI(q);
                    ((rwd) this.e.b()).H(o);
                    this.c.e("Bugle.Tombstone.Generated", q);
                    return;
                }
                return;
            }
            tzk a2 = tzk.a(o);
            if (a2 != tzkVar) {
                this.c.e("Bugle.Tombstone.Generated", tzu.a(a2, tzkVar).j);
                f(messageCoreData.z(), i, j);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r10) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tzn.i(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData):void");
    }

    public final void j(MessageCoreData messageCoreData, shs shsVar) {
        ((ukv) this.r.b()).a(messageCoreData.B().a(), shsVar);
    }

    public final void k(final MessageCoreData messageCoreData) {
        boolean z;
        rto rtoVar;
        ConversationIdType z2 = messageCoreData.z();
        boolean a2 = ttd.a();
        final boolean z3 = false;
        if (a2) {
            rtoVar = ((uac) this.d.b()).z(z2);
            boolean w = w(rtoVar);
            z = true;
            if (!u(rtoVar) && !w) {
                z = false;
            }
            z3 = w;
        } else {
            z = a2;
            rtoVar = null;
        }
        if (rtoVar != null && z) {
            alvw d = b.d();
            d.X(alwp.a, "BugleEtouffee");
            alvg alvgVar = (alvg) d;
            alvgVar.X(ydl.b, messageCoreData.B());
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateMessageWithSurroundingTombstones", 604, "ProtocolChangeTombstoneManagerImpl.java")).q("updateMessageWithSurroundingTombstones");
            this.g.e("ProtocolChangeTombstoneManagerImpl#updateMessageWithSurroundingTombstones", new Runnable() { // from class: tzl
                @Override // java.lang.Runnable
                public final void run() {
                    tzn tznVar = tzn.this;
                    boolean z4 = z3;
                    MessageCoreData messageCoreData2 = messageCoreData;
                    if (z4) {
                        ((tzr) tznVar.j.b()).a(5);
                        tzc tzcVar = (tzc) tznVar.h.b();
                        messageCoreData2.getClass();
                        tzc.a.l("Invoking updateMessageWithSurroundingTombstones");
                        tzb tzbVar = (tzb) tzcVar.f.b();
                        MessageCoreData q = ((rwd) tzbVar.b.b()).q(messageCoreData2.B());
                        if (q == null) {
                            ((tzs) tzbVar.c.b()).c(messageCoreData2);
                            return;
                        }
                        ((tzp) tzbVar.d.b()).b(q);
                        arml armlVar = tzy.a;
                        tzy a3 = tzx.a(tze.b(messageCoreData2));
                        if (a3 != null) {
                            ((tzp) tzbVar.d.b()).a(messageCoreData2, a3, messageCoreData2.n() - 1);
                        }
                        if (messageCoreData2.cv() && !messageCoreData2.I().U() && q.I().U()) {
                            xyo c = tzs.a.c();
                            c.z("messageId", messageCoreData2.B());
                            c.H("Marked message as read");
                            c.q();
                            messageCoreData2.bp(true);
                        }
                        ((tzs) tzbVar.c.b()).c(messageCoreData2);
                        return;
                    }
                    ((tzr) tznVar.j.b()).b(5);
                    MessageCoreData q2 = ((rwd) tznVar.e.b()).q(messageCoreData2.B());
                    if (q2 == null) {
                        ((rwd) tznVar.e.b()).H(messageCoreData2);
                        return;
                    }
                    messageCoreData2.B();
                    tznVar.e(q2);
                    int b2 = tzn.b(messageCoreData2.cI(), messageCoreData2.cn());
                    if (!((Boolean) ttd.G.e()).booleanValue() && !((ofu) tznVar.k.b()).a()) {
                        tznVar.g(messageCoreData2, b2, messageCoreData2.n() - 1);
                    } else {
                        tznVar.h(messageCoreData2, b2, tzk.a(messageCoreData2), messageCoreData2.n() - 1);
                    }
                    if (messageCoreData2.cv() && !messageCoreData2.I().U() && q2.I().U()) {
                        alvw d2 = tzn.b.d();
                        d2.X(alwp.a, "BugleEtouffee");
                        alvg alvgVar2 = (alvg) d2;
                        alvgVar2.X(ydl.b, messageCoreData2.B());
                        ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateReadStatusIfNeeded", 1424, "ProtocolChangeTombstoneManagerImpl.java")).q("Marked message as read");
                        messageCoreData2.bp(true);
                    }
                    ((rwd) tznVar.e.b()).H(messageCoreData2);
                    alvw d3 = tzn.b.d();
                    d3.X(alwp.a, "BugleEtouffee");
                    alvg alvgVar3 = (alvg) d3;
                    alvgVar3.X(ydl.b, messageCoreData2.B());
                    ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateMessageWithSurroundingTombstonesBody", 668, "ProtocolChangeTombstoneManagerImpl.java")).q("updated message");
                }
            });
            return;
        }
        ((rwd) this.e.b()).H(messageCoreData);
        alvw d2 = b.d();
        d2.X(alwp.a, "BugleEtouffee");
        alvg alvgVar2 = (alvg) d2;
        alvgVar2.X(ydl.p, z2);
        ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateMessageWithSurroundingTombstones", 595, "ProtocolChangeTombstoneManagerImpl.java")).q("Skip updateMessageWithSurroundingTombstones. Conversation not valid for protocolTombstones.");
    }

    public final void l(List list) {
        if (!ttd.a()) {
            return;
        }
        alvw d = b.d();
        d.X(alwp.a, "BugleEtouffee");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateTombstonesBeforeDelete", 484, "ProtocolChangeTombstoneManagerImpl.java")).q("updateTombstonesBeforeDelete");
        this.g.e("ProtocolChangeTombstoneManagementImpl#updateTombstonesBeforeDelete", new ryv(this, (MessageCoreData) Collections.max(list, Comparator.CC.comparing(new tvq(13))), 10, null));
    }

    public final boolean o(MessageCoreData messageCoreData, sya syaVar, Optional optional) {
        rto z = ((uac) this.d.b()).z(messageCoreData.z());
        if (w(z)) {
            ((tzr) this.j.b()).a(6);
            tzc tzcVar = (tzc) this.h.b();
            messageCoreData.getClass();
            xyo a2 = tzc.a.a();
            a2.H("updateMessageWithBuilderAndSurroundingTombstones");
            a2.z("messageId", messageCoreData.B());
            a2.q();
            Object c = ((agnq) tzcVar.b.b()).c("GroupProtocolChangeTombstoneManagerDelegate#updateMessageWithBuilderAndSurroundingTombstones", new rka(tzcVar, messageCoreData, syaVar, optional, 6));
            c.getClass();
            return ((Boolean) c).booleanValue();
        }
        if (z != null && ttd.a() && u(z)) {
            ((tzr) this.j.b()).b(6);
            alvw d = b.d();
            d.X(alwp.a, "BugleEtouffee");
            alvg alvgVar = (alvg) d;
            alvgVar.X(ydl.b, messageCoreData.B());
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateMessageWithBuilderAndSurroundingTombstones", 713, "ProtocolChangeTombstoneManagerImpl.java")).q("updateMessageWithBuilderAndSurroundingTombstones");
            return ((Boolean) this.g.c("ProtocolChangeTombstoneManagerImpl#updateMessageWithBuilderAndSurroundingTombstones", new rka(this, messageCoreData, syaVar, optional, 7))).booleanValue();
        }
        if (MessageData.cF(messageCoreData.j()) && ((Boolean) ((utz) mku.a.get()).e()).booleanValue()) {
            mlb mlbVar = (mlb) this.i.b();
            xze xzeVar = a;
            mkw b2 = mkz.b(syaVar, Optional.of(xzeVar));
            b2.c(messageCoreData.B());
            b2.i(Instant.ofEpochMilli(ujy.b(messageCoreData, syaVar, xzeVar)));
            b2.f = optional;
            return mlbVar.g(b2.a());
        }
        return ((rwd) this.e.b()).O(messageCoreData.z(), messageCoreData.B(), syaVar);
    }
}
