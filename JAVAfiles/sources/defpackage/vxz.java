package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vxz {
    public static final xze a = xze.g("BugleDataModel", "RcsDeliveryReportProcessor");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/rcs/incoming/RcsDeliveryReportProcessor");
    private final armf A;
    private final anen B;
    private final anen C;
    private final armf D;
    private final armf E;
    private final armf F;
    private final armf G;
    public final xnv c;
    public final armf d;
    public final armf e;
    public final agnq f;
    public final yck g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final lgg m;
    private final yxx n;
    private final mho o;
    private final armf p;
    private final armf q;
    private final armf r;
    private final mbl s;
    private final Optional t;
    private final qdx u;
    private final armf v;
    private final armf w;
    private final armf x;
    private final armf y;
    private final armf z;

    public vxz(yxx yxxVar, mho mhoVar, xnv xnvVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, mbl mblVar, agnq agnqVar, yck yckVar, Optional optional, qdx qdxVar, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, anen anenVar, anen anenVar2, armf armfVar16, lgg lggVar, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20) {
        this.n = yxxVar;
        this.o = mhoVar;
        this.c = xnvVar;
        this.d = armfVar3;
        this.r = armfVar4;
        this.z = armfVar5;
        this.s = mblVar;
        this.f = agnqVar;
        this.g = yckVar;
        this.t = optional;
        this.u = qdxVar;
        this.v = armfVar6;
        this.w = armfVar7;
        this.x = armfVar8;
        this.y = armfVar9;
        this.h = armfVar10;
        this.i = armfVar11;
        this.p = armfVar;
        this.q = armfVar2;
        this.A = armfVar12;
        this.j = armfVar13;
        this.e = armfVar14;
        this.k = armfVar15;
        this.B = anenVar;
        this.C = anenVar2;
        this.l = armfVar16;
        this.m = lggVar;
        this.D = armfVar17;
        this.E = armfVar18;
        this.F = armfVar19;
        this.G = armfVar20;
    }

    private final String d(ChatSessionMessageEvent chatSessionMessageEvent) {
        String str = chatSessionMessageEvent.a;
        if (str != null) {
            ParticipantsTable.BindData b2 = ((rxq) this.r.b()).b(str);
            if (b2 != null) {
                String M = b2.M();
                M.getClass();
                return M;
            }
            return ((rxq) this.r.b()).h(rxn.g(str));
        }
        throw new IllegalStateException("RcsDeliveryReportProcessor: User ID of sender was null.");
    }

    private final void e(ConversationIdType conversationIdType, qei qeiVar, qei qeiVar2, boolean z) {
        alvg h = a.h();
        h.X(ydl.D, qeiVar.d);
        ((alvg) h.h("com/google/android/apps/messaging/shared/rcs/incoming/RcsDeliveryReportProcessor", "logAndDisableEncryptionForRemoteRegistration", 701, "RcsDeliveryReportProcessor.java")).t("Disable [isGroup=%s] encryption on the remote instance.", Boolean.valueOf(z));
        ((rsw) this.F.b()).a(qeiVar2, conversationIdType).d(qeiVar, z, amkd.RECEIVED_PLAINTEXT_DELIVERY_RECEIPT);
    }

    private final void f(MessageCoreData messageCoreData, ConversationIdType conversationIdType, amxo amxoVar) {
        mbh L = lgb.L(this.c);
        Optional empty = Optional.empty();
        rto z = ((uac) this.p.b()).z(conversationIdType);
        if (z != null) {
            empty = Optional.of(Integer.valueOf(z.G()));
        }
        this.o.aq(messageCoreData, empty, amxoVar, L);
    }

    public final akul a(ChatSessionMessageEvent chatSessionMessageEvent, boolean z, rve rveVar, amgu amguVar) {
        return ((vyt) this.E.b()).a(vys.DELIVERED).i(new vwx(this, rve.a(chatSessionMessageEvent.c), chatSessionMessageEvent, 3), this.C).h(new tvs(this, chatSessionMessageEvent, z, rveVar, amguVar, 2), this.B);
    }

    public final void b(atok atokVar, ChatSessionMessageEvent chatSessionMessageEvent, asgt asgtVar) {
        ((uac) this.v.b()).x(atokVar, rve.a(chatSessionMessageEvent.c), 7, Optional.of(asgtVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x028b, code lost:
    
        if (r24.d() == 3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0284, code lost:
    
        if (r2 == 2) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02f3  */
    /* JADX WARN: Type inference failed for: r2v10, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r24, com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent r25, boolean r26, long r27, int r29, defpackage.amgu r30) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vxz.c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent, boolean, long, int, amgu):void");
    }
}
