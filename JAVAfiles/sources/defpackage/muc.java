package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.ims.rcsservice.events.Event;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class muc implements alhr {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ muc(DefaultConversation defaultConversation, mto mtoVar, BugleConversationId bugleConversationId, mtc mtcVar, boolean z, int i) {
        this.f = i;
        this.b = defaultConversation;
        this.e = mtoVar;
        this.d = bugleConversationId;
        this.c = mtcVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [mto, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, mtc] */
    /* JADX WARN: Type inference failed for: r8v0, types: [mzt, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        atok aF;
        int i;
        int i2 = this.f;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    Object obj = this.b;
                    Object obj2 = this.c;
                    final boolean z = this.a;
                    Object obj3 = this.d;
                    Object obj4 = this.e;
                    akrh e = aktp.e("RcsDeliveryReportProcessor.processInternal");
                    try {
                        if (((vxz) obj).g.s) {
                            xyo a = vxz.a.a();
                            a.H("Ignoring received RCS IMDN for debugging");
                            a.q();
                        } else {
                            final long epochMilli = ((vxz) obj).c.f().toEpochMilli();
                            final MessageCoreData s = ((rwd) ((vxz) obj).d.b()).s(rve.a(((ChatSessionMessageEvent) obj2).c));
                            if (s == null) {
                                aF = null;
                            } else {
                                aF = s.aF();
                            }
                            if (s == null) {
                                ((mbl) ((vxz) obj).e.b()).c("Bugle.Rcs.Chat.Message.DeliveryReport.Nonexistent.Counts");
                            }
                            if (((Boolean) xct.d.e()).booleanValue()) {
                                String f = ((rvf) obj3).f();
                                if (aF != null) {
                                    String str = aF.b;
                                    ((xcs) ((vxz) obj).j.b()).d(f, str);
                                    ((xcs) ((vxz) obj).j.b()).f(str, 10, xcs.i);
                                }
                            }
                            int i3 = ((Event) obj2).h;
                            if (i3 != 50032) {
                                if (i3 != 50035) {
                                    ((vxz) obj).b(aF, (ChatSessionMessageEvent) obj2, asgt.BUGLE_SENDING_INTERNAL_STATUS_DELIVERY_EVENT_UNHANDLED);
                                    xyo e2 = vxz.a.e();
                                    e2.H("Unhandled delivery event");
                                    e2.H(obj2);
                                    e2.q();
                                } else {
                                    ((vxz) obj).b(aF, (ChatSessionMessageEvent) obj2, asgt.BUGLE_SENDING_INTERNAL_STATUS_DELIVERED);
                                    i = 2;
                                }
                            } else {
                                ((vxz) obj).b(aF, (ChatSessionMessageEvent) obj2, asgt.BUGLE_SENDING_INTERNAL_STATUS_DISPLAYED);
                                i = 11;
                            }
                            if (s == null) {
                                xyo b = vxz.a.b();
                                b.H("cannot find");
                                b.c(rvc.b(((ChatSessionMessageEvent) obj2).c));
                                b.q();
                            } else {
                                final amgu amguVar = (amgu) obj4;
                                final ChatSessionMessageEvent chatSessionMessageEvent = (ChatSessionMessageEvent) obj2;
                                final vxz vxzVar = (vxz) obj;
                                final int i4 = i;
                                int i5 = i;
                                ((vxz) obj).f.e("RcsDeliveryReportProcessor#executeAction", new Runnable() { // from class: vxy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        MessageCoreData q;
                                        vxz vxzVar2 = vxz.this;
                                        MessageCoreData messageCoreData = s;
                                        ChatSessionMessageEvent chatSessionMessageEvent2 = chatSessionMessageEvent;
                                        boolean z2 = z;
                                        long j = epochMilli;
                                        int i6 = i4;
                                        amgu amguVar2 = amguVar;
                                        vxzVar2.c(messageCoreData, chatSessionMessageEvent2, z2, j, i6, amguVar2);
                                        if (!messageCoreData.C().b()) {
                                            MessageIdType C = messageCoreData.C();
                                            if (!C.b() && (q = ((rwd) vxzVar2.d.b()).q(C)) != null) {
                                                vxzVar2.c(q, chatSessionMessageEvent2, z2, j, i6, amguVar2);
                                            }
                                        }
                                    }
                                });
                                ((uhj) ((vxz) obj).i.b()).h(s.z(), s.B());
                                if (i5 == 2) {
                                    uie uieVar = (uie) ((vxz) obj).h.b();
                                    akrh e3 = aktp.e("OnMessageUpdatedCompositeListener.onProcessDeliveredSuccess");
                                    try {
                                        for (rwr rwrVar : (Set) uieVar.a.b()) {
                                            akrh a2 = rwrVar.a();
                                            try {
                                                rwrVar.b(s);
                                                armd.i(a2, null);
                                            } catch (Throwable th) {
                                                try {
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    armd.i(a2, th);
                                                    throw th2;
                                                }
                                            }
                                        }
                                        armd.i(e3, null);
                                    } finally {
                                    }
                                }
                            }
                        }
                        e.close();
                        return null;
                    } finally {
                    }
                } else {
                    alor alorVar = (alor) this.c;
                    aluq listIterator = alorVar.keySet().listIterator();
                    while (listIterator.hasNext()) {
                        boolean z2 = this.a;
                        Object obj5 = this.b;
                        Object obj6 = this.e;
                        Object obj7 = this.d;
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) listIterator.next();
                        if (!((rul) obj7).Z((Optional) obj6, bindData, (rux) Optional.ofNullable((rux) alorVar.get(bindData)).orElse(new rux(qfe.JOINED)), (ConversationIdType) obj5, false, z2)) {
                            return false;
                        }
                    }
                    return true;
                }
            } else {
                boolean z3 = this.a;
                ?? r7 = this.c;
                Object obj8 = this.d;
                ?? r2 = this.e;
                DefaultConversation defaultConversation = (DefaultConversation) this.b;
                ncq ncqVar = defaultConversation.d;
                return r2.a((BugleConversationId) obj8, defaultConversation.e, defaultConversation.c, ncqVar, r7, z3, false);
            }
        } else {
            nej nejVar = (nej) this.c.b();
            anen anenVar = (anen) nejVar.c.b();
            anenVar.getClass();
            anen anenVar2 = (anen) nejVar.b.b();
            anenVar2.getClass();
            lfl lflVar = (lfl) nejVar.a.b();
            lflVar.getClass();
            ?? r8 = this.b;
            mzs mzsVar = new mzs(anenVar, anenVar2, lflVar, r8);
            boolean booleanValue = ((Boolean) muv.b.e()).booleanValue();
            Object obj9 = this.d;
            if (booleanValue && this.a) {
                ?? r0 = this.e;
                alvw g = mui.a.g();
                g.X(alwp.a, "BugleMapi");
                alvg alvgVar = (alvg) g;
                alvgVar.X(ydl.q, obj9);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "<init>", 338, "CoreBugleMessageRepository.java")).q("Creating optimistic message pager.");
                lfl lflVar2 = (lfl) r0.b();
                arpi arpiVar = (arpi) lflVar2.b.b();
                arpiVar.getClass();
                hmk hmkVar = (hmk) lflVar2.d.b();
                hmkVar.getClass();
                lfl lflVar3 = (lfl) lflVar2.a.b();
                lflVar3.getClass();
                ((arwe) lflVar2.c.b()).getClass();
                return new nad(arpiVar, hmkVar, lflVar3, mzsVar, r8);
            }
            alvw g2 = mui.a.g();
            g2.X(alwp.a, "BugleMapi");
            alvg alvgVar2 = (alvg) g2;
            alvgVar2.X(ydl.q, obj9);
            ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "<init>", 333, "CoreBugleMessageRepository.java")).q("Not using optimistic message pager.");
            return mzsVar;
        }
    }

    public /* synthetic */ muc(Object obj, Object obj2, boolean z, Object obj3, Object obj4, int i) {
        this.f = i;
        this.b = obj;
        this.c = obj2;
        this.a = z;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ muc(rul rulVar, alor alorVar, Optional optional, ConversationIdType conversationIdType, boolean z, int i) {
        this.f = i;
        this.d = rulVar;
        this.c = alorVar;
        this.e = optional;
        this.b = conversationIdType;
        this.a = z;
    }
}
