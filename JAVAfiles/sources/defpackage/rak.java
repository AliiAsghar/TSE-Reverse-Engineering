package defpackage;

import android.net.Uri;
import android.os.Build;
import com.google.android.apps.messaging.shared.datamodel.action.HandleIncomingRcsGroupChatInvitationAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rak implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ rak(HandleIncomingRcsGroupChatInvitationAction handleIncomingRcsGroupChatInvitationAction, ConversationIdType conversationIdType, MessageCoreData messageCoreData, tqc tqcVar, long j, int i) {
        this.f = i;
        this.d = handleIncomingRcsGroupChatInvitationAction;
        this.b = conversationIdType;
        this.e = messageCoreData;
        this.c = tqcVar;
        this.a = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        MessageIdType B;
        long n;
        Object obj;
        ParticipantsTable.BindData j;
        MessageIdType B2;
        long n2;
        int i = this.f;
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                aozy aozyVar = (aozy) this.b;
                                if (!aozyVar.b.isMutable()) {
                                    aozyVar.u();
                                }
                                anmo anmoVar = (anmo) aozyVar.b;
                                anmo anmoVar2 = anmo.a;
                                apax apaxVar = anmoVar.d;
                                if (!apaxVar.c()) {
                                    anmoVar.d = apag.mutableCopy(apaxVar);
                                }
                                Object obj2 = this.e;
                                aoyj.addAll(this.c, anmoVar.d);
                                anlx anlxVar = (anlx) obj2;
                                anmb anmbVar = anlxVar.e;
                                if (anmbVar == null) {
                                    anmbVar = anmb.a;
                                }
                                if (!aozyVar.b.isMutable()) {
                                    aozyVar.u();
                                }
                                apag apagVar = aozyVar.b;
                                anmo anmoVar3 = (anmo) apagVar;
                                anmbVar.getClass();
                                anmoVar3.h = anmbVar;
                                anmoVar3.b |= 1;
                                String str = anlxVar.d;
                                if (!apagVar.isMutable()) {
                                    aozyVar.u();
                                }
                                apag apagVar2 = aozyVar.b;
                                str.getClass();
                                ((anmo) apagVar2).g = str;
                                apax apaxVar2 = anlxVar.g;
                                if (!apagVar2.isMutable()) {
                                    aozyVar.u();
                                }
                                anmo anmoVar4 = (anmo) aozyVar.b;
                                apax apaxVar3 = anmoVar4.i;
                                if (!apaxVar3.c()) {
                                    anmoVar4.i = apag.mutableCopy(apaxVar3);
                                }
                                aoyj.addAll(apaxVar2, anmoVar4.i);
                                boolean z2 = !anlxVar.f.isEmpty();
                                if (!aozyVar.b.isMutable()) {
                                    aozyVar.u();
                                }
                                long j2 = this.a;
                                Object obj3 = this.d;
                                ((anmo) aozyVar.b).j = z2;
                                ytp ytpVar = (ytp) obj3;
                                aozn c = apdp.c(ytpVar.d.f().toEpochMilli() - j2);
                                if (!aozyVar.b.isMutable()) {
                                    aozyVar.u();
                                }
                                anmo anmoVar5 = (anmo) aozyVar.b;
                                c.getClass();
                                anmoVar5.k = c;
                                anmoVar5.b |= 2;
                                int a = ytpVar.e.a();
                                if (!aozyVar.b.isMutable()) {
                                    aozyVar.u();
                                }
                                ((anmo) aozyVar.b).e = a;
                                String str2 = yuv.a(ytpVar.f).a;
                                if (!aozyVar.b.isMutable()) {
                                    aozyVar.u();
                                }
                                anmo anmoVar6 = (anmo) aozyVar.b;
                                str2.getClass();
                                anmoVar6.l = str2;
                                String num = Integer.toString(Build.VERSION.SDK_INT);
                                if (!aozyVar.b.isMutable()) {
                                    aozyVar.u();
                                }
                                anmo anmoVar7 = (anmo) aozyVar.b;
                                num.getClass();
                                anmoVar7.m = num;
                                return;
                            }
                            Object obj4 = this.c;
                            tqc tqcVar = tqc.UNARCHIVED;
                            String str3 = (String) obj4;
                            boolean ah = albo.ah(str3);
                            Object obj5 = this.e;
                            Object obj6 = this.b;
                            if (!ah) {
                                vub vubVar = (vub) obj6;
                                tqcVar = ((rwd) vubVar.d.b()).A((ConversationIdType) obj5, str3, ((xxh) vubVar.g.b()).e(str3), true);
                            }
                            tqc tqcVar2 = tqcVar;
                            ?? r1 = this.d;
                            vub vubVar2 = (vub) obj6;
                            ruq ruqVar = (ruq) vubVar2.e.b();
                            if (r1 == 0) {
                                B2 = rvc.a;
                            } else {
                                B2 = r1.B();
                            }
                            MessageIdType messageIdType = B2;
                            if (r1 == 0) {
                                n2 = vubVar2.h.f().toEpochMilli();
                            } else {
                                n2 = r1.n();
                            }
                            ruqVar.e((ConversationIdType) obj5, messageIdType, Long.valueOf(n2), tqcVar2, this.a, 0);
                            return;
                        }
                        ArrayList<ParticipantsTable.BindData> arrayList = new ArrayList();
                        Iterator it = this.c.iterator();
                        while (true) {
                            obj = this.e;
                            if (!it.hasNext()) {
                                break;
                            }
                            arrayList.add(((vub) obj).j((String) it.next()));
                        }
                        String str4 = (String) this.b;
                        if (albo.ah(str4)) {
                            j = null;
                        } else {
                            j = ((vub) obj).j(str4);
                        }
                        long j3 = this.a;
                        Object obj7 = this.d;
                        String str5 = "com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler";
                        String str6 = "IncomingRcsGroupInvitationHandler.java";
                        if (j == null) {
                            ((alwl) vub.a.m().h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "handleIncomingInviteForNewConversation", 305, "IncomingRcsGroupInvitationHandler.java")).q("Referrer msisdn is empty. Adding participants individually");
                            for (ParticipantsTable.BindData bindData : arrayList) {
                                alvw m = vub.a.m();
                                ConversationIdType conversationIdType = (ConversationIdType) obj7;
                                m.X(ydl.o, conversationIdType.toString());
                                m.X(ydl.G, Long.valueOf(j3));
                                vub vubVar3 = (vub) obj;
                                ((alwl) m.h(str5, "insertNewConversationParticipantTombstoneNoReferrer", 373, str6)).t("%s joined", yyb.bh(((iew) vubVar3.i.b()).n(bindData, z)));
                                ((ujv) vubVar3.f.b()).f(Optional.empty(), conversationIdType, vubVar3.j.g(), bindData, new ArrayList(alog.r(bindData)), BasePaymentResult.ERROR_REQUEST_FAILED, vubVar3.h.f().toEpochMilli(), j3, null);
                                str6 = str6;
                                obj7 = obj7;
                                str5 = str5;
                                z = true;
                            }
                            return;
                        }
                        for (ParticipantsTable.BindData bindData2 : arrayList) {
                            alvw m2 = vub.a.m();
                            m2.X(ydl.o, ((ConversationIdType) obj7).toString());
                            m2.X(ydl.G, Long.valueOf(j3));
                            vub vubVar4 = (vub) obj;
                            ((alwl) m2.h("com/google/android/apps/messaging/shared/rcs/groups/invite/IncomingRcsGroupInvitationHandler", "insertNewConversationParticipantTombstoneWithReferrer", 404, "IncomingRcsGroupInvitationHandler.java")).D("%s added %s", yyb.bh(((iew) vubVar4.i.b()).n(j, true)), yyb.bh(((iew) vubVar4.i.b()).n(bindData2, true)));
                        }
                        vub vubVar5 = (vub) obj;
                        ((ujv) vubVar5.f.b()).f(Optional.empty(), (ConversationIdType) obj7, vubVar5.j.g(), j, arrayList, BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, vubVar5.h.f().toEpochMilli(), j3, null);
                        return;
                    }
                    xyl.h();
                    Object obj8 = this.c;
                    Object obj9 = this.b;
                    final long j4 = this.a;
                    Object obj10 = this.e;
                    final ruq ruqVar2 = (ruq) this.d;
                    final ConversationIdType conversationIdType2 = (ConversationIdType) obj10;
                    final MessageIdType messageIdType2 = (MessageIdType) obj9;
                    final tqc tqcVar3 = (tqc) obj8;
                    sni.j(conversationIdType2, new Consumer() { // from class: ruo
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void q(Object obj11) {
                            long u = ((smr) obj11).u();
                            long j5 = j4;
                            if (j5 > u) {
                                tqc tqcVar4 = tqcVar3;
                                MessageIdType messageIdType3 = messageIdType2;
                                ruq.this.f(conversationIdType2, messageIdType3, Long.valueOf(j5), tqcVar4, null, true);
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return;
                }
                ?? r12 = this.b;
                Object obj11 = this.e;
                if (r12.t() != null) {
                    long j5 = this.a;
                    rwd rwdVar = (rwd) ((rdi) obj11).c.b();
                    ConversationIdType z3 = r12.z();
                    MessageIdType B3 = r12.B();
                    sya syaVar = new sya();
                    syaVar.aj("updateExpiryInDb");
                    syaVar.m(j5);
                    boolean O = rwdVar.O(z3, B3, syaVar);
                    xyo d = rdi.a.d();
                    d.H("update File Transfer expiry.");
                    d.A("updated", O);
                    d.z("rcsMessageId", r12.E());
                    d.y("rcsFtSessionId", r12.m());
                    d.q();
                }
                Object obj12 = this.d;
                if (obj12 != null) {
                    ?? r7 = this.c;
                    rdi rdiVar = (rdi) obj11;
                    rxc rxcVar = (rxc) rdiVar.d.b();
                    ConversationIdType z4 = r7.z();
                    MessageIdType A = r7.A();
                    String Z = r7.Z();
                    tbt tbtVar = new tbt();
                    tbtVar.aj("updateFallbackUriInDb");
                    Uri uri = (Uri) obj12;
                    tbtVar.h(uri);
                    boolean e = rxcVar.e(z4, A, Z, tbtVar);
                    xyo d2 = rdi.a.d();
                    d2.H("update fallback Uri in DB.");
                    d2.A("updated", e);
                    d2.z("rcsMessageId", r12.E());
                    d2.y("rcsFtSessionId", r12.m());
                    d2.q();
                    if (rdiVar.g.a() && e) {
                        r7.aw(uri);
                        return;
                    }
                    return;
                }
                return;
            }
            HandleIncomingRcsGroupChatInvitationAction handleIncomingRcsGroupChatInvitationAction = (HandleIncomingRcsGroupChatInvitationAction) this.d;
            ruq ruqVar3 = (ruq) handleIncomingRcsGroupChatInvitationAction.f.b();
            ?? r3 = this.e;
            if (r3 == 0) {
                B = rvc.a;
            } else {
                B = r3.B();
            }
            MessageIdType messageIdType3 = B;
            if (r3 == 0) {
                n = handleIncomingRcsGroupChatInvitationAction.g.f().toEpochMilli();
            } else {
                n = r3.n();
            }
            ruqVar3.e((ConversationIdType) this.b, messageIdType3, Long.valueOf(n), (tqc) this.c, this.a, 0);
            return;
        }
        ?? r13 = this.b;
        r13.getClass();
        long j6 = this.a;
        Object obj13 = this.d;
        ConversationIdType conversationIdType3 = (ConversationIdType) this.c;
        r13.bS(conversationIdType3, (Uri) obj13, j6);
        r13.bc(j6);
        rat ratVar = (rat) this.e;
        ((rvw) ratVar.y.b()).a(r13);
        ((ruq) ratVar.h.b()).d(conversationIdType3, r13.B(), Long.valueOf(j6), tqc.UNARCHIVED, false);
    }

    public /* synthetic */ rak(MessageCoreData messageCoreData, ConversationIdType conversationIdType, Uri uri, long j, rat ratVar, int i) {
        this.f = i;
        this.b = messageCoreData;
        this.c = conversationIdType;
        this.d = uri;
        this.a = j;
        this.e = ratVar;
    }

    public /* synthetic */ rak(rdi rdiVar, MessageCoreData messageCoreData, long j, Uri uri, MessagePartCoreData messagePartCoreData, int i) {
        this.f = i;
        this.e = rdiVar;
        this.b = messageCoreData;
        this.a = j;
        this.d = uri;
        this.c = messagePartCoreData;
    }

    public /* synthetic */ rak(ruq ruqVar, ConversationIdType conversationIdType, long j, MessageIdType messageIdType, tqc tqcVar, int i) {
        this.f = i;
        this.d = ruqVar;
        this.e = conversationIdType;
        this.a = j;
        this.b = messageIdType;
        this.c = tqcVar;
    }

    public /* synthetic */ rak(vub vubVar, String str, ConversationIdType conversationIdType, MessageCoreData messageCoreData, long j, int i) {
        this.f = i;
        this.b = vubVar;
        this.c = str;
        this.e = conversationIdType;
        this.d = messageCoreData;
        this.a = j;
    }

    public /* synthetic */ rak(vub vubVar, List list, String str, ConversationIdType conversationIdType, long j, int i) {
        this.f = i;
        this.e = vubVar;
        this.c = list;
        this.b = str;
        this.d = conversationIdType;
        this.a = j;
    }

    public /* synthetic */ rak(ytp ytpVar, aozy aozyVar, Collection collection, long j, anlx anlxVar, int i) {
        this.f = i;
        this.d = ytpVar;
        this.b = aozyVar;
        this.c = collection;
        this.a = j;
        this.e = anlxVar;
    }
}
