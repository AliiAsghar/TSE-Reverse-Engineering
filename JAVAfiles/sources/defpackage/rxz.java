package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rxz {
    public static final alhr a = uuh.w("block_update_when_numbers_do_not_match_for_updating_participants_and_recipient");
    public static final alhr b = uuh.w("log_when_numbers_do_not_match_for_updating_participants_and_recipient");
    public static final alwo c = alwo.o("BugleDataModel");
    public static final xze d = xze.g("Bugle", "UpdateBugleParticipantAndConversations");
    public final armf e;
    public final armf f;
    public final agnq g;
    public final apwt h;
    public final apwt i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final armf o;
    private final armf p;
    private final armf q;
    private final armf r;

    public rxz(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, agnq agnqVar, armf armfVar5, apwt apwtVar, apwt apwtVar2, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11) {
        this.p = armfVar;
        this.e = armfVar2;
        this.q = armfVar3;
        this.f = armfVar4;
        this.g = agnqVar;
        this.r = armfVar5;
        this.h = apwtVar;
        this.i = apwtVar2;
        this.j = armfVar6;
        this.k = armfVar7;
        this.l = armfVar8;
        this.m = armfVar9;
        this.n = armfVar10;
        this.o = armfVar11;
    }

    public final int a(tbb tbbVar, rya ryaVar) {
        if (((Boolean) ((utz) rxr.b.get()).e()).booleanValue()) {
            return ((rxs) this.r.b()).b(tbbVar, ryaVar);
        }
        if (((Boolean) ((utz) rxr.a.get()).e()).booleanValue()) {
            return ((rxs) this.r.b()).a(tbbVar.a());
        }
        return tbbVar.a().e();
    }

    public final rxy b(ConversationIdType conversationIdType, msh mshVar) {
        List K = ((rtz) this.e.b()).K(conversationIdType);
        int i = ((alsx) K).c;
        if (i == 0) {
            alwl alwlVar = (alwl) c.g();
            alwlVar.X(ydl.o, conversationIdType.toString());
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "gatherNewAndExistingParticipantInformation", 444, "UpdateBugleParticipantAndConversations.java")).q("Expected 1 participant in conversation but found 0");
            return null;
        }
        if (i > 1) {
            alwl alwlVar2 = (alwl) c.g();
            alwlVar2.X(ydl.o, conversationIdType.toString());
            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "gatherNewAndExistingParticipantInformation", 450, "UpdateBugleParticipantAndConversations.java")).q("Expected 1 participant in conversation but found multiple");
            return null;
        }
        ParticipantsTable.BindData a2 = ((nds) this.q.b()).a(mshVar);
        return new rxy(((rxq) this.f.b()).g(a2), a2, (ParticipantsTable.BindData) K.get(0));
    }

    public final Optional c(ParticipantsTable.BindData bindData) {
        msh s = ((msk) this.p.b()).s(bindData);
        if (!s.y()) {
            ((alwl) ((alwl) c.g()).h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "createMessagingIdentityFromE164", 418, "UpdateBugleParticipantAndConversations.java")).t("Input was not E164 %s, skipping the Bugle participant update", yyb.bh(s.m()));
            return Optional.empty();
        }
        return Optional.of(s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [msh, java.lang.Object] */
    public final void d(ParticipantsTable.BindData bindData, ConversationIdType conversationIdType) {
        akrh e = aktp.e("UpdateBugleParticipantAndConversations.updateBugleParticipantToMoreCanonical");
        try {
            Optional c2 = c(bindData);
            if (!c2.isEmpty()) {
                ((alwl) ((alwl) c.g()).h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "updateBugleParticipantToMoreCanonical", BasePaymentResult.ERROR_REQUEST_FAILED, "UpdateBugleParticipantAndConversations.java")).t("Verifying whether the Bugle participant can be updated to E164 %s", yyb.bh(c2.get().m()));
                rxy b2 = b(conversationIdType, c2.get());
                if (b2 != null) {
                    e(b2, conversationIdType, bindData);
                }
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

    public final void e(final rxy rxyVar, final ConversationIdType conversationIdType, final ParticipantsTable.BindData bindData) {
        this.g.e("UpdateBugleParticipantAndConversations#updateParticipantInConversations", new Runnable() { // from class: rxw
            /* JADX WARN: Type inference failed for: r1v16, types: [apwt, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v7, types: [apwt, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                rxz rxzVar;
                rxy rxyVar2;
                ConversationIdType conversationIdType2 = conversationIdType;
                rxy rxyVar3 = rxyVar;
                ParticipantsTable.BindData bindData2 = rxyVar3.c;
                String M = bindData2.M();
                String P = bindData2.P();
                if (P == null) {
                    alwl alwlVar = (alwl) rxz.c.g();
                    alwlVar.X(ydl.o, conversationIdType2.toString());
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "updateParticipantInConversationsAndUpdateParticipantSendDestination", 249, "UpdateBugleParticipantAndConversations.java")).q("Existing participant's send destination is null.");
                    return;
                }
                String str2 = rxyVar3.a;
                final rxz rxzVar2 = rxz.this;
                if (!str2.equals(M)) {
                    alwl alwlVar2 = (alwl) rxz.c.g();
                    alwlVar2.X(ydl.m, M);
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "updateParticipantInConversationsAndUpdateParticipantSendDestination", 258, "UpdateBugleParticipantAndConversations.java")).t("Updating the Bugle participant in all conversations to participant id %s", str2);
                    if (!M.equals(str2)) {
                        akrh e = aktp.e("UpdateBugleParticipantAndConversations#updateParticipantForAlLConversations");
                        try {
                            aiut.b();
                            final long parseLong = Long.parseLong(M);
                            final long parseLong2 = Long.parseLong(str2);
                            final alpr alprVar = new alpr();
                            str = P;
                            rxzVar = rxzVar2;
                            alpt alptVar = (alpt) rxzVar2.g.c("UpdateBugleParticipantAndConversations#replaceParticipantsAndGetConversationIds", new alhr() { // from class: rxx
                                @Override // defpackage.alhr
                                public final Object get() {
                                    agnw d2;
                                    Object apply;
                                    agnw d3;
                                    smk smkVar = new smk();
                                    smkVar.f("replaceParticipantInAllGroupConversations");
                                    long j = parseLong;
                                    smkVar.b(new rum(j, 3));
                                    Object obj = smkVar.a().b;
                                    d2 = agnc.d("$primary");
                                    int i = 9;
                                    alog alogVar = (alog) d2.s("conversation_to_participants-deleteAndReturnDeletedRows-txn", new slr(obj, i));
                                    final long j2 = parseLong2;
                                    Collection.EL.forEach(alogVar, new Consumer() { // from class: rxv
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void q(Object obj2) {
                                            smh smhVar = (smh) obj2;
                                            alhr alhrVar = rxz.a;
                                            tcs c2 = smp.c();
                                            c2.k(smhVar.l());
                                            c2.m(j2);
                                            c2.l(smhVar.m());
                                            c2.n(smhVar.k());
                                            c2.j();
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    Iterable iterable = (Iterable) Collection.EL.stream(alogVar).map(new rxo(8)).collect(alls.b);
                                    alpr alprVar2 = alprVar;
                                    alprVar2.j(iterable);
                                    slb b2 = sld.b();
                                    b2.aj("replaceParticipantInAllConversations");
                                    agnc.q(b2.a, "participant_id", j2);
                                    apply = new rum(j, 2).apply(new slc());
                                    b2.Z(new agpw((slc) apply));
                                    agpr a2 = b2.a();
                                    d3 = agnc.d("$primary");
                                    alprVar2.j((alpt) Collection.EL.stream((alog) d3.s("updateAndReturnUpdatedRowsAfterUpdate-txn-conversation_participants", new skg(a2, 17))).map(new rxo(i)).collect(alls.b));
                                    alpt g = alprVar2.g();
                                    xyo a3 = rxz.d.a();
                                    a3.H("Conversations with replaced participants");
                                    a3.H(g);
                                    a3.q();
                                    return g;
                                }
                            });
                            e.close();
                            if (!alptVar.isEmpty()) {
                                ((mbl) rxzVar.m.b()).c("Bugle.Datamodel.Participant.UpdateParticipantInConversations");
                            }
                            if (alptVar.isEmpty()) {
                                alwl alwlVar3 = (alwl) rxz.c.g();
                                alwlVar3.X(ydl.m, str2);
                                ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "updateParticipantInConversationsAndUpdateParticipantSendDestination", 276, "UpdateBugleParticipantAndConversations.java")).t("No conversation ids with existing participant %s found", M);
                                return;
                            }
                            ParticipantsTable.BindData a2 = ((rxq) rxzVar.f.b()).a(str2);
                            if (a2 == null) {
                                alwl alwlVar4 = (alwl) rxz.c.g();
                                alwlVar4.X(ydl.m, str2);
                                alwlVar4.X(ydl.o, conversationIdType2.toString());
                                ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "updateParticipantInConversationsAndUpdateParticipantSendDestination", 291, "UpdateBugleParticipantAndConversations.java")).q("Found or created participant' is null.");
                                return;
                            }
                            ((rtz) rxzVar.e.b()).X(alptVar, a2);
                            ((rtz) rxzVar.e.b()).W(alptVar, str2, M);
                            for (rxj rxjVar : (Set) ((ibi) rxzVar.i.b()).a.b()) {
                                akrh b2 = rxjVar.b();
                                try {
                                    rxjVar.d();
                                    if (b2 != null) {
                                        b2.close();
                                    }
                                } finally {
                                }
                            }
                            int i = 3;
                            rxzVar.g.h(new rxa(i), "UpdateBugleParticipantAndConversations#afterParticipantInConversationChanged", new rui(rxzVar, i));
                            rxyVar2 = rxyVar3;
                        } finally {
                        }
                    } else {
                        throw new IllegalArgumentException("Old participant id cannot be the same as the new participant id");
                    }
                } else {
                    str = P;
                    rxzVar = rxzVar2;
                    rxyVar2 = rxyVar3;
                }
                if (!str.equals(rxyVar2.b.P())) {
                    String P2 = bindData.P();
                    P2.getClass();
                    rya ryaVar = rya.c;
                    tbb f = ParticipantsTable.f();
                    f.aj("updateSendDestinationForParticipantId");
                    f.F(P2);
                    f.M(new rxb(str2, 18));
                    if (rxzVar.a(f, ryaVar) == 1) {
                        ((mbl) rxzVar.m.b()).c("Bugle.Datamodel.Participant.UpdateParticipantSendDestination");
                        ((alwl) ((alwl) rxz.c.g()).h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "updateSendDestinationForParticipantId", 673, "UpdateBugleParticipantAndConversations.java")).t("Successfully updated the Bugle participant to E164 %s", yyb.bh(P2));
                    }
                    for (rxl rxlVar : (Set) ((ibi) rxzVar.h.b()).a.b()) {
                        akrh b3 = rxlVar.b();
                        try {
                            rxlVar.d();
                            if (b3 != null) {
                                b3.close();
                            }
                        } finally {
                        }
                    }
                    int i2 = 4;
                    rxzVar.g.h(new rxa(i2), "UpdateBugleParticipantAndConversations#afterParticipantSendDestinationUpdated", new rui(rxzVar, i2));
                }
            }
        });
    }
}
