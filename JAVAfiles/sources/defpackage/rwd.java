package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rwd {
    public static final xze a = xze.g("BugleDataModel", "MessageDatabaseOperations");
    public static final alhr b = uuh.x(206679830, "refactor_get_latest_message_by_conversation_and_sender");
    static final alhr c = uuh.x(209309856, "new_read_user_reference_data");
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    private final armf l;
    private final armf m;
    private final armf n;
    private final armf o;
    private final armf p;
    private final armf q;
    private final armf r;

    public rwd(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15) {
        this.l = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.m = armfVar4;
        this.n = armfVar5;
        this.g = armfVar6;
        this.o = armfVar7;
        this.h = armfVar8;
        this.p = armfVar9;
        this.d = armfVar10;
        this.q = armfVar11;
        this.i = armfVar12;
        this.j = armfVar13;
        this.r = armfVar14;
        this.k = armfVar15;
    }

    public static void P(MessageCoreData messageCoreData, sng sngVar, String str) {
        MessagePartCoreData messagePartCoreData;
        akrh e = aktp.e("MessageDatabaseOperations#addSnippetTextAndPreviewToContentValues");
        try {
            sngVar.Q(false);
            if (yig.a() && str != null) {
                sngVar.S(str);
            } else {
                sngVar.S(messageCoreData.am());
            }
            agnc.r(sngVar.a, "subject_text", yta.a(messageCoreData.ap()));
            Iterator it = ((MessageData) messageCoreData).i.iterator();
            while (true) {
                if (it.hasNext()) {
                    messagePartCoreData = (MessagePartCoreData) it.next();
                    if (gh.p(messagePartCoreData.U())) {
                        break;
                    }
                } else {
                    messagePartCoreData = null;
                    break;
                }
            }
            if (messagePartCoreData != null) {
                rwx B = messagePartCoreData.B();
                sngVar.G(B.a);
                sngVar.H(B.b);
            } else {
                sngVar.G(null);
                sngVar.H(null);
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final MessageCoreData U(syb sybVar, boolean z) {
        String str;
        akrh e = aktp.e("MessageDatabaseOperations#getEarliestOrLatestMessage");
        if (z) {
            str = "earliest";
        } else {
            str = "latest";
        }
        try {
            alog V = V(sybVar, 1, z);
            MessageCoreData messageCoreData = null;
            if (V == null) {
                a.m(a.bW(str, "The returned list of ", " messages is null."));
            } else if (V.size() != 1) {
                xyo e2 = a.e();
                e2.H("Unexpected list of");
                e2.K(str, V);
                e2.H("is returned.");
                e2.q();
            } else {
                messageCoreData = (MessageCoreData) V.get(0);
            }
            e.close();
            return messageCoreData;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final alog V(syb sybVar, int i, boolean z) {
        atkn atknVar;
        akrh e = aktp.e("MessageDatabaseOperations#getEarliestOrLatestMessages");
        try {
            String num = Integer.toString(i);
            sxy d = MessagesTable.d();
            d.w("getEarliestOrLatestMessages");
            d.k(sybVar);
            atkn[] atknVarArr = new atkn[1];
            if (z) {
                atknVar = new atkn((Object) MessagesTable.c.i, true);
            } else {
                atknVar = new atkn((Object) MessagesTable.c.i, false);
            }
            atknVarArr[0] = atknVar;
            d.h(atknVarArr);
            d.v(num);
            alog D = D(d.b());
            e.close();
            return D;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int a(ConversationIdType conversationIdType) {
        akrh e = aktp.e("MessageDatabaseOperations#getCountOfAllMessagesInConversation");
        try {
            syc sycVar = new syc();
            sycVar.f(conversationIdType);
            sycVar.b(new rwc(11), new rvy(0));
            int c2 = c(new syb(sycVar));
            e.close();
            return c2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int b(ConversationIdType conversationIdType) {
        akrh e = aktp.e("MessageDatabaseOperations#getCountOfOutgoingMessagesInConversation");
        try {
            syc sycVar = new syc();
            sycVar.f(conversationIdType);
            sycVar.Q(1, 22);
            int c2 = c(new syb(sycVar));
            e.close();
            return c2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int c(syb sybVar) {
        akrh e = aktp.e("MessageDatabaseOperations#getMessageCount");
        try {
            xyl.h();
            sxy d = MessagesTable.d();
            d.w("MessageDatabaseOperations#getMessageCount");
            d.k(sybVar);
            int i = d.b().i();
            e.close();
            return i;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static sya w(MessageIdType messageIdType, int i, long j, Uri uri) {
        sya syaVar = new sya();
        syaVar.aj("getUpdateBuilderForResending");
        syaVar.s(i);
        syaVar.B(j);
        syaVar.P(new ruw(messageIdType, 10));
        if (uri != null) {
            syaVar.K(uri);
        }
        syaVar.v(0);
        return syaVar;
    }

    public static syc x(ConversationIdType conversationIdType, boolean z) {
        syc sycVar = new syc();
        sycVar.f(conversationIdType);
        sycVar.S(qkv.b);
        if (!z) {
            sycVar.q(false);
        }
        return sycVar;
    }

    public static syc y(ConversationIdType conversationIdType) {
        syc x = x(conversationIdType, false);
        x.b(new rvy(17), new rvy(18));
        return x;
    }

    public final tqc A(ConversationIdType conversationIdType, String str, boolean z, boolean z2) {
        boolean z3;
        tqc tqcVar;
        akrh e = aktp.e("MessageDatabaseOperations#getArchiveStatusForIncomingMessage");
        try {
            aiut.b();
            ParticipantsTable.BindData c2 = ((rxq) this.n.b()).c(str);
            boolean z4 = true;
            if (c2 != null && c2.T() && yyb.G(c2.m()).c()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!conversationIdType.b()) {
                if (m(conversationIdType) != null) {
                    z4 = false;
                }
                z3 &= z4;
            }
            if (z3) {
                tqcVar = tqc.SPAM_FOLDER;
            } else if (z) {
                if (z2) {
                    tqcVar = tqc.ARCHIVED;
                } else {
                    tqcVar = tqc.BLOCKED_FOLDER;
                }
            } else {
                tqcVar = tqc.UNARCHIVED;
            }
            e.close();
            return tqcVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final alog B(ConversationIdType conversationIdType, int i) {
        akrh e = aktp.e("MessageDatabaseOperations#getLatestIncomingMessagesForConversation");
        try {
            syc sycVar = new syc();
            sycVar.f(conversationIdType);
            sycVar.Q(100, 115);
            alog C = C(new syb(sycVar), i);
            e.close();
            return C;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final alog C(syb sybVar, int i) {
        akrh e = aktp.e("MessageDatabaseOperations#getLatestMessages");
        try {
            alog V = V(sybVar, i, false);
            e.close();
            return V;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final alog D(sxx sxxVar) {
        akrh e = aktp.e("MessageDatabaseOperations#getMessages");
        try {
            xyl.h();
            ArrayList arrayList = new ArrayList();
            sxt sxtVar = (sxt) sxxVar.n();
            while (sxtVar.moveToNext()) {
                try {
                    MessageCoreData a2 = ((tqx) this.e.b()).a();
                    a2.cX(sxtVar);
                    ((rxc) this.f.b()).b(a2, false);
                    G(a2);
                    arrayList.add(a2);
                } finally {
                }
            }
            sxtVar.close();
            alog n = alog.n(arrayList);
            e.close();
            return n;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final alog E(List list) {
        akrh e = aktp.e("MessageDatabaseOperations#getMessagesByIds");
        try {
            sxy d = MessagesTable.d();
            d.w("+getMessagesByIds");
            d.g(new ruw(list, 5));
            alog D = D(d.b());
            e.close();
            return D;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final List F(ConversationIdType conversationIdType, int i) {
        akrh e = aktp.e("MessageDatabaseOperations#getLatestVisibleMessagesForConversation");
        try {
            alog C = C(new syb(y(conversationIdType)), i);
            if (C == null) {
                int i2 = alog.d;
                C = alsx.a;
            }
            e.close();
            return C;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void G(MessageCoreData messageCoreData) {
        Object apply;
        Object apply2;
        String str;
        boolean z;
        ParticipantColor participantColor;
        boolean z2;
        ((Boolean) ((utz) c.get()).e()).booleanValue();
        akrh e = aktp.e("MessageDatabaseOperations#readUserReferenceData");
        try {
            if (d.z(messageCoreData.j())) {
                String aw = messageCoreData.aw();
                aw.getClass();
                ParticipantsTable.BindData a2 = ParticipantsTable.a(aw);
                a2.getClass();
                MessageIdType B = messageCoreData.B();
                taz e2 = ParticipantsTable.e();
                e2.d(new rvy(5));
                tay b2 = e2.b();
                if (((Boolean) this.q.b()).booleanValue()) {
                    taz e3 = ParticipantsTable.e();
                    e3.d(new rvy(6));
                    b2 = e3.b();
                }
                tok tokVar = new tok(tom.a);
                tokVar.w("queryUserRefs");
                boolean z3 = true;
                boolean z4 = false;
                tokVar.t((agmh) tom.e.b);
                apply = new rvy(7).apply(tom.e);
                tog[] togVarArr = (tog[]) apply;
                int c2 = a.bp().c();
                Integer.valueOf(c2).getClass();
                for (tog togVar : togVarArr) {
                    if (((Integer) tom.b.getOrDefault(togVar.toString(), -1)).intValue() > c2) {
                        agnc.t("columnReference.toString()", c2);
                    }
                }
                tokVar.m(togVarArr);
                apply2 = new ruw(B, 9).apply(new tol());
                tokVar.k(new agpw((tol) apply2));
                int i = 3;
                tokVar.z((String) DesugarArrays.stream(new atkn[]{new atkn(tom.e.e, false)}).map(new tgn(i)).collect(Collectors.joining(", ")));
                tokVar.D(agoh.b(b2, ParticipantsTable.c.a, (agmh) tom.e.c).a());
                tod todVar = (tod) ((toh) tokVar.b().n()).cO();
                if (todVar != null) {
                    String n = ((iew) this.m.b()).n(a2, false);
                    armf armfVar = this.l;
                    armf armfVar2 = this.d;
                    xvc xvcVar = (xvc) armfVar.b();
                    ArrayList arrayList = new ArrayList();
                    ParticipantsTable.BindData[] bindDataArr = (ParticipantsTable.BindData[]) todVar.au("participants", new ParticipantsTable.BindData[0]);
                    int length = bindDataArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        ParticipantsTable.BindData bindData = bindDataArr[i2];
                        String K = bindData.K();
                        if (K == null) {
                            K = bindData.L();
                        }
                        if (K == null) {
                            K = bindData.J();
                        }
                        String str2 = "";
                        if (K == null) {
                            str = "";
                        } else {
                            str = K;
                        }
                        Uri v = bindData.v();
                        if (oez.a()) {
                            bindData.C();
                        }
                        if (v != null) {
                            str2 = v.toString();
                        }
                        String ag = albo.ag(bindData.L());
                        if (bindData.n() == i) {
                            z = z3;
                        } else {
                            z = z4;
                        }
                        long parseLong = Long.parseLong(bindData.M());
                        Uri d = rtw.d(str2);
                        String g = rtw.g(ag);
                        msh q = ((msk) armfVar2.b()).q(bindData);
                        armf armfVar3 = armfVar2;
                        int h = bindData.h();
                        ParticipantsTable.BindData[] bindDataArr2 = bindDataArr;
                        int k = bindData.k();
                        int i3 = length;
                        if (k != 1) {
                            if (k != 2) {
                                participantColor = new ParticipantColor(0, h, 0);
                            } else {
                                participantColor = new ParticipantColor(2, -1, bindData.l());
                            }
                            z2 = true;
                        } else {
                            z2 = true;
                            participantColor = new ParticipantColor(1, h, 0);
                        }
                        Uri w = xvcVar.w(d, g, q, participantColor);
                        todVar.ao(3, "user_ref_datetime");
                        arrayList.add(new rtw(parseLong, str, z, w, todVar.d));
                        i2++;
                        i = 3;
                        z3 = z2;
                        armfVar2 = armfVar3;
                        bindDataArr = bindDataArr2;
                        length = i3;
                        z4 = false;
                    }
                    Collections.sort(arrayList);
                    messageCoreData.bL(n, arrayList);
                } else {
                    a.p("Tombstone user reference list is empty");
                    messageCoreData.bL(((iew) this.m.b()).n(a2, false), new ArrayList());
                }
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void H(MessageCoreData messageCoreData) {
        xyl.h();
        ((agnq) this.o.b()).e("MessageDatabaseOperations#updateMessage", new rah(this, messageCoreData, 18, null));
    }

    public final void I(MessageCoreData messageCoreData, List list) {
        xyl.h();
        ((agnq) this.o.b()).e("MessageDatabaseOperations#updateMessageAndParts", new rvz(this, list, messageCoreData, 0));
    }

    public final void J(ConversationIdType conversationIdType, MessageIdType messageIdType, sya syaVar) {
        akrh e = aktp.e("MessageDatabaseOperations#updateMessageRow");
        try {
            xyl.h();
            boolean O = O(conversationIdType, messageIdType, syaVar);
            if (!((ocs) this.r.b()).a()) {
                xyl.k(O);
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean K(ConversationIdType conversationIdType) {
        akrh e = aktp.e("MessageDatabaseOperations#hasUnreadMessagesForConversation");
        try {
            sxy d = MessagesTable.d();
            d.w("hasUnreadMessagesForConversation1");
            d.g(new ruw(conversationIdType, 18));
            boolean K = d.b().K();
            e.close();
            return K;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean L(MessageCoreData messageCoreData, int i, long j, Uri uri) {
        akrh e = aktp.e("MessageDatabaseOperations#markMessageAsResent");
        try {
            ConversationIdType z = messageCoreData.z();
            MessageIdType B = messageCoreData.B();
            sya w = w(B, i, j, uri);
            w.L(1);
            boolean M = M(w.a(), z, B);
            e.close();
            return M;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean M(sxz sxzVar, ConversationIdType conversationIdType, MessageIdType messageIdType) {
        if (sxzVar.e() > 0) {
            ((uhj) this.h.b()).j(conversationIdType, messageIdType, sxzVar.n());
            return true;
        }
        return false;
    }

    public final boolean N(MessageCoreData messageCoreData) {
        akrh e = aktp.e("MessageDatabaseOperationsImpl#updateMessageMetadata");
        try {
            ConversationIdType z = messageCoreData.z();
            MessageIdType B = messageCoreData.B();
            sya syaVar = new sya();
            syaVar.aj("updateMessageMetadata");
            syaVar.L(messageCoreData.j());
            syaVar.y(messageCoreData.cA());
            syaVar.o(messageCoreData.cz());
            syaVar.z(messageCoreData.n());
            syaVar.G(messageCoreData.q());
            syaVar.J(messageCoreData.r());
            syaVar.m(messageCoreData.k());
            syaVar.w(messageCoreData.m());
            boolean O = O(z, B, syaVar);
            e.close();
            return O;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean O(ConversationIdType conversationIdType, MessageIdType messageIdType, sya syaVar) {
        xyl.h();
        return ((Boolean) ((agnq) this.o.b()).c("MessageDatabaseOperationsImpl#updateMessageRowIfExists", new rka(this, syaVar, messageIdType, conversationIdType, 4))).booleanValue();
    }

    public final alog Q(ConversationIdType conversationIdType, String str) {
        akrh e = aktp.e("MessageDatabaseOperations#getEarliestOrLatestIncomingMessagesByConversationAndSender");
        try {
            syc sycVar = new syc();
            sycVar.f(conversationIdType);
            sycVar.F(str);
            sycVar.Q(100, 115);
            alog V = V(new syb(sycVar), 1, false);
            e.close();
            return V;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final alog R(ConversationIdType conversationIdType, int i) {
        akrh e = aktp.e("MessageDatabaseOperations#getLatestIncomingMessagesPerProtocolForConversation");
        try {
            syc sycVar = new syc();
            sycVar.f(conversationIdType);
            sycVar.Q(100, 115);
            sycVar.w(i);
            alog C = C(new syb(sycVar), 1);
            if (C == null) {
                int i2 = alog.d;
                C = alsx.a;
            }
            e.close();
            return C;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void S(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        akrh e = aktp.e("MessageDatabaseOperations#markUndeliveredAsFallbackReady");
        try {
            sya syaVar = new sya();
            syaVar.aj("markUndeliveredAsFallbackReady");
            syaVar.L(14);
            syaVar.P(new rwb(messageIdType, 0));
            if (syaVar.a().e() > 0) {
                ((uhj) this.h.b()).j(conversationIdType, messageIdType, "message_status");
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void T(final ConversationIdType conversationIdType, final MessageCoreData messageCoreData, final int i, final boolean z) {
        akrh e = aktp.e("MessageDatabaseOperations#updateDraftMessageData");
        try {
            xyl.h();
            xyl.d(i, 1, 2);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData d(ConversationIdType conversationIdType) {
        akrh e = aktp.e("MessageDatabaseOperations#getEarliestIncomingMessageForConversation");
        try {
            syc sycVar = new syc();
            sycVar.f(conversationIdType);
            sycVar.Q(100, 115);
            MessageCoreData e2 = e(new syb(sycVar));
            e.close();
            return e2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData e(syb sybVar) {
        akrh e = aktp.e("MessageDatabaseOperations#getEarliestMessage");
        try {
            MessageCoreData U = U(sybVar, true);
            e.close();
            return U;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData f(ConversationIdType conversationIdType) {
        akrh e = aktp.e("MessageDatabaseOperations#getEarliestVisibleMessageForConversation");
        try {
            MessageCoreData e2 = e(new syb(y(conversationIdType)));
            e.close();
            return e2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData g(ConversationIdType conversationIdType, long j) {
        akrh e = aktp.e("MessageDatabaseOperations#getFirstVisibleMessageOrTombstoneAfterTimestamp");
        try {
            syc x = x(conversationIdType, false);
            x.B(j);
            MessageCoreData e2 = e(new syb(x));
            e.close();
            return e2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData h(ConversationIdType conversationIdType, long j) {
        akrh e = aktp.e("MessageDatabaseOperations#getLastVisibleMessageOrTombstoneBeforeTimestamp");
        try {
            syc x = x(conversationIdType, false);
            x.C(j);
            MessageCoreData j2 = j(new syb(x));
            e.close();
            return j2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData i(ConversationIdType conversationIdType) {
        akrh e = aktp.e("MessageDatabaseOperations#getLatestInitializingEtouffeeTombstoneForConversation");
        try {
            syc sycVar = new syc();
            sycVar.f(conversationIdType);
            sycVar.q(false);
            sycVar.P(213, 219, 226, 229);
            MessageCoreData j = j(new syb(sycVar));
            e.close();
            return j;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData j(syb sybVar) {
        akrh e = aktp.e("MessageDatabaseOperations#getLatestMessage");
        try {
            MessageCoreData U = U(sybVar, false);
            e.close();
            return U;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData k(ConversationIdType conversationIdType) {
        akrh e = aktp.e("MessageDatabaseOperations#getLatestMessageForConversation");
        try {
            syc sycVar = new syc();
            sycVar.f(conversationIdType);
            MessageCoreData j = j(new syb(sycVar));
            e.close();
            return j;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData l(ConversationIdType conversationIdType) {
        akrh e = aktp.e("MessageDatabaseOperations#getLatestProtocoledMessageForConversation");
        try {
            syc sycVar = new syc();
            sycVar.f(conversationIdType);
            sycVar.S(qkv.b);
            sycVar.q(false);
            MessageCoreData j = j(new syb(sycVar));
            e.close();
            return j;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData m(ConversationIdType conversationIdType) {
        akrh e = aktp.e("MessageDatabaseOperations#getLatestOutgoingMessageForConversation");
        try {
            syc sycVar = new syc();
            sycVar.f(conversationIdType);
            sycVar.Q(1, 22);
            sycVar.S(qkv.b);
            MessageCoreData j = j(new syb(sycVar));
            e.close();
            return j;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData n(ConversationIdType conversationIdType) {
        akrh e = aktp.e("MessageDatabaseOperations#getLatestVisibleMessageForConversation");
        try {
            MessageCoreData j = j(new syb(y(conversationIdType)));
            e.close();
            return j;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData o(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        akrh e = aktp.e("MessageDatabaseOperations#getLatestVisibleMessageOrEtouffeeTombstoneExcludingMessage");
        try {
            syc sycVar = new syc();
            sycVar.f(conversationIdType);
            sycVar.p(messageIdType);
            sycVar.S(qkv.b);
            sycVar.q(false);
            if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue()) {
                sycVar.b(new rwc(4), new rwc(5), new rwc(6), new rwc(7));
            } else {
                sycVar.b(new rwc(8), new rwc(9), new rwc(10));
            }
            MessageCoreData j = j(new syb(sycVar));
            e.close();
            return j;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData p(String str) {
        akrh e = aktp.e("MessageDatabaseOperations#readCloudSyncMessageData");
        try {
            syc sycVar = new syc();
            sycVar.d(str);
            MessageCoreData v = v(new syb(sycVar));
            e.close();
            return v;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData q(MessageIdType messageIdType) {
        akrh e = aktp.e("MessageDatabaseOperations#readMessageAndParts");
        try {
            xyl.h();
            MessageCoreData u = u(messageIdType);
            if (u != null) {
                ((rxc) this.f.b()).b(u, false);
                G(u);
            }
            e.close();
            return u;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData r(rve rveVar) {
        akrh e = aktp.e("MessageDatabaseOperations#readMessageByRcsId");
        try {
            xyl.h();
            MessageCoreData s = s(rveVar);
            if (s != null) {
                ((rxc) this.f.b()).b(s, false);
                G(s);
            }
            e.close();
            return s;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData s(rve rveVar) {
        MessageCoreData messageCoreData;
        boolean z;
        aozy a2;
        akrh e = aktp.e("MessageDatabaseOperations#readMessageDataByRcsId");
        try {
            syc sycVar = new syc();
            sycVar.z(rveVar);
            syb sybVar = new syb(sycVar);
            sxy d = MessagesTable.d();
            d.w("readMessageDataByRcsId");
            d.k(sybVar);
            Stream map = Collection.EL.stream(d.b().t()).filter(new rsi(11)).map(new rwb(this, 2));
            int i = alog.d;
            alog alogVar = (alog) map.collect(alls.a);
            if (alogVar.size() > 1) {
                if (alogVar.size() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                albo.A(z, "Violation of the unique rcs_message_id_and_seen_index on the MessagesTable", new Object[0]);
                xho xhoVar = (xho) this.p.b();
                MessageCoreData messageCoreData2 = (MessageCoreData) alogVar.get(0);
                MessageCoreData messageCoreData3 = (MessageCoreData) alogVar.get(1);
                d.s(messageCoreData2.E().equals(messageCoreData3.E()));
                if (messageCoreData2.B().a < messageCoreData3.B().a) {
                    a2 = xho.a(messageCoreData2, messageCoreData3);
                } else {
                    a2 = xho.a(messageCoreData3, messageCoreData2);
                }
                maq maqVar = (maq) xhoVar.b.b();
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.DUPLICATE_RCS_MESSAGE_ID_EVENT;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.i = amfpVar.dg;
                amfrVar.b = 1 | amfrVar.b;
                if (!a2.b.isMutable()) {
                    a2.u();
                }
                amuz amuzVar = (amuz) a2.b;
                amuz amuzVar2 = amuz.a;
                amuzVar.g = 2;
                amuzVar.b |= 16;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar2 = (amfr) amfqVar.b;
                amuz amuzVar3 = (amuz) a2.s();
                amuzVar3.getClass();
                amfrVar2.aX = amuzVar3;
                amfrVar2.f |= 131072;
                maqVar.j(amfqVar);
                throw new IllegalStateException("Expected 1 message but found 2 with the same RCS message ID");
            }
            if (alogVar.isEmpty()) {
                messageCoreData = null;
            } else {
                messageCoreData = (MessageCoreData) alogVar.get(0);
            }
            e.close();
            return messageCoreData;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData t(Uri uri) {
        MessageCoreData messageCoreData;
        akrh e = aktp.e("MessageDatabaseOperations#readMessageNoParts Uri");
        try {
            xyl.h();
            sxy d = MessagesTable.d();
            d.w("readMessageData1");
            d.g(new ruw(uri, 6));
            MessagesTable.BindData bindData = (MessagesTable.BindData) ((sxt) d.b().n()).cO();
            if (bindData != null) {
                messageCoreData = ((tqx) this.e.b()).a();
                messageCoreData.aI(bindData);
            } else {
                messageCoreData = null;
            }
            e.close();
            return messageCoreData;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData u(MessageIdType messageIdType) {
        akrh e = aktp.e("MessageDatabaseOperations#readMessageNoParts messageId");
        try {
            syc sycVar = new syc();
            sycVar.i(messageIdType);
            MessageCoreData v = v(new syb(sycVar));
            e.close();
            return v;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData v(syb sybVar) {
        MessageCoreData messageCoreData;
        akrh e = aktp.e("MessageDatabaseOperations#readMessageNoParts where");
        try {
            xyl.h();
            sxy d = MessagesTable.d();
            d.w("+readMessageData2");
            d.k(sybVar);
            MessagesTable.BindData bindData = (MessagesTable.BindData) ((sxt) d.b().n()).cO();
            if (bindData != null) {
                messageCoreData = ((tqx) this.e.b()).a();
                messageCoreData.aI(bindData);
            } else {
                messageCoreData = null;
            }
            e.close();
            return messageCoreData;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final tqc z(long j, String str, boolean z, boolean z2) {
        return A(((rtz) this.g.b()).l(j), str, z, z2);
    }
}
