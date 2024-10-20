package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ubi implements alhr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ ubi(Context context, String str, aazm aazmVar, agcp agcpVar, arqr arqrVar, String str2, int i) {
        this.g = i;
        this.f = context;
        this.c = str;
        this.a = aazmVar;
        this.b = agcpVar;
        this.e = arqrVar;
        this.d = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, ncq] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, ncq] */
    /* JADX WARN: Type inference failed for: r3v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r6v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        Optional empty;
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    int i2 = 3;
                    if (i != 3) {
                        Object obj = this.c;
                        obj.getClass();
                        Object obj2 = this.d;
                        ?? r6 = this.e;
                        return asqe.r((String) obj, (aazm) this.a, (agcp) this.b, r6, (String) obj2, akis.a);
                    }
                    sya syaVar = new sya();
                    syaVar.aj("updateMessageVerificationStatus");
                    tqr tqrVar = (tqr) this.b;
                    syaVar.M(tqrVar);
                    MessageIdType messageIdType = (MessageIdType) this.a;
                    boolean e = syaVar.e(messageIdType);
                    Object obj3 = this.f;
                    Object obj4 = this.e;
                    Object obj5 = this.d;
                    boolean z = false;
                    if (e) {
                        xyo c = ukg.a.c();
                        c.H("notifying a message change for conversation");
                        c.e((String) obj4);
                        c.c(messageIdType);
                        ConversationIdType conversationIdType = (ConversationIdType) obj3;
                        c.b(conversationIdType);
                        c.q();
                        ((ukg) obj5).h.j(conversationIdType, messageIdType, new String[0]);
                    }
                    ukg ukgVar = (ukg) obj5;
                    akrh e2 = aktp.e("MessageDatabaseOperations#getLatestIncomingMessageId");
                    try {
                        xyl.h();
                        sxy d = MessagesTable.d();
                        d.w("getLatestIncomingMessageId");
                        d.g(new rwb(obj3, 10));
                        d.e(new rwc(i2));
                        sxo sxoVar = MessagesTable.c;
                        d.h(new atkn((Object) sxoVar.i, false), new atkn((Object) sxoVar.a, false));
                        d.u(1);
                        sxt sxtVar = (sxt) d.b().n();
                        try {
                            if (sxtVar.moveToFirst()) {
                                empty = Optional.of(sxtVar.E());
                                sxtVar.close();
                            } else {
                                sxtVar.close();
                                empty = Optional.empty();
                            }
                            e2.close();
                            if (empty.isPresent()) {
                                Object obj6 = empty.get();
                                if (!messageIdType.equals(obj6)) {
                                    xyo c2 = ukg.a.c();
                                    c2.H("not updating participant status for vsms: not the last message");
                                    c2.e((String) obj4);
                                    c2.c(messageIdType);
                                    c2.b((ConversationIdType) obj3);
                                    c2.z("latestMessageId", obj6);
                                    c2.q();
                                    return false;
                                }
                                Object obj7 = this.c;
                                xyo c3 = ukg.a.c();
                                c3.H("Updating participant for Verified SMS result");
                                c3.q();
                                xyo a = ukg.a.a();
                                a.z("Participant verification status", tqrVar.name());
                                a.q();
                                tbb f = ParticipantsTable.f();
                                f.aj("UpdateMessageVerificationStatusWorkHelper#updateParticipant");
                                f.v(tqrVar);
                                if (tqrVar.a()) {
                                    f.D(ukgVar.m.b(((ukf) obj7).c, tqrVar));
                                }
                                int ordinal = tqrVar.ordinal();
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        f.p();
                                        f.r();
                                    }
                                } else {
                                    String str = ((ukf) obj7).a.c;
                                    if (!TextUtils.isEmpty(str)) {
                                        f.o(str);
                                        f.q(str);
                                    }
                                }
                                z = f.d((String) obj4);
                            }
                            xyo c4 = ukg.a.c();
                            c4.A("participant was updated", z);
                            c4.q();
                            return Boolean.valueOf(z);
                        } finally {
                        }
                    } finally {
                    }
                } else {
                    Object obj8 = this.f;
                    Object obj9 = this.b;
                    Object obj10 = this.e;
                    ((uis) this.c).a(this.a, (String) this.d, (String) obj10, (tql) obj9, (Action) obj8);
                    return null;
                }
            } else {
                kor korVar = (kor) this.c.b();
                lig ligVar = (lig) this.d.b();
                mwq mwqVar = (mwq) this.e.b();
                wfh wfhVar = (wfh) ligVar.l.b();
                wfhVar.getClass();
                anen anenVar = (anen) ligVar.f.b();
                anenVar.getClass();
                anen anenVar2 = (anen) ligVar.k.b();
                anenVar2.getClass();
                ?? r8 = ligVar.e;
                ?? r9 = ligVar.h;
                yep yepVar = (yep) ligVar.c.b();
                yepVar.getClass();
                ?? r11 = ligVar.g;
                kor korVar2 = (kor) ligVar.a.b();
                korVar2.getClass();
                ?? r13 = ligVar.d;
                ?? r14 = ligVar.i;
                ?? r15 = ligVar.j;
                ?? b = ligVar.b.b();
                b.getClass();
                mwqVar.getClass();
                return korVar.u(new mwf(wfhVar, anenVar, anenVar2, r8, r9, yepVar, r11, korVar2, r13, r14, r15, b, (BugleConversationId) this.f, this.a, this.b, mwqVar));
            }
        } else {
            return new kkg(new mtz(this.b, this.c, this.d, this.e, 5), this.f);
        }
    }

    public /* synthetic */ ubi(apwt apwtVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, anen anenVar, int i) {
        this.g = i;
        this.a = apwtVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = anenVar;
    }

    public /* synthetic */ ubi(armf armfVar, armf armfVar2, BugleConversationId bugleConversationId, ncq ncqVar, ncq ncqVar2, armf armfVar3, int i) {
        this.g = i;
        this.c = armfVar;
        this.d = armfVar2;
        this.f = bugleConversationId;
        this.a = ncqVar;
        this.b = ncqVar2;
        this.e = armfVar3;
    }

    public /* synthetic */ ubi(uis uisVar, MessagePartCoreData messagePartCoreData, String str, String str2, tql tqlVar, Action action, int i) {
        this.g = i;
        this.c = uisVar;
        this.a = messagePartCoreData;
        this.d = str;
        this.e = str2;
        this.b = tqlVar;
        this.f = action;
    }

    public /* synthetic */ ubi(ukg ukgVar, tqr tqrVar, MessageIdType messageIdType, String str, ConversationIdType conversationIdType, ukf ukfVar, int i) {
        this.g = i;
        this.d = ukgVar;
        this.b = tqrVar;
        this.a = messageIdType;
        this.e = str;
        this.f = conversationIdType;
        this.c = ukfVar;
    }
}
