package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import io.grpc.Status;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mhw implements algk {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ mhw(mic micVar, amjk amjkVar, MessageCoreData messageCoreData, Integer num, int i, amgc amgcVar, int i2) {
        this.g = i2;
        this.b = micVar;
        this.c = amjkVar;
        this.d = messageCoreData;
        this.e = num;
        this.a = i;
        this.f = amgcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        ahqp ahqpVar;
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                int i2 = 3;
                if (i != 2) {
                    Object obj2 = this.c;
                    rzb rzbVar = (rzb) this.f;
                    rzbVar.j((ahqq) obj2, ahqp.ERROR);
                    Status.Code code = Status.Code.OK;
                    int ordinal = ((aqwb) obj).a.getCode().ordinal();
                    int i3 = this.a;
                    Object obj3 = this.d;
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            if (ordinal != 14) {
                                xyo c = rzb.a.c();
                                c.H("Unknown failure:");
                                MessageIdType messageIdType = (MessageIdType) obj3;
                                c.c(messageIdType);
                                c.q();
                                rzbVar.m(messageIdType, 1, i3);
                            } else {
                                xyo c2 = rzb.a.c();
                                c2.H("Server unavailable:");
                                MessageIdType messageIdType2 = (MessageIdType) obj3;
                                c2.c(messageIdType2);
                                c2.q();
                                rzbVar.m(messageIdType2, 5, i3);
                            }
                        } else {
                            xyo c3 = rzb.a.c();
                            c3.H("Preview not found:");
                            MessageIdType messageIdType3 = (MessageIdType) obj3;
                            c3.c(messageIdType3);
                            c3.q();
                            rzbVar.m(messageIdType3, 4, i3);
                        }
                    } else {
                        xyo c4 = rzb.a.c();
                        c4.H("RPC timeout:");
                        MessageIdType messageIdType4 = (MessageIdType) obj3;
                        c4.c(messageIdType4);
                        c4.q();
                        rzbVar.m(messageIdType4, 3, i3);
                    }
                    Object obj4 = this.b;
                    MessageIdType messageIdType5 = (MessageIdType) obj3;
                    if (rzbVar.l(messageIdType5)) {
                        rzbVar.k((ConversationIdType) obj4, messageIdType5, (String) this.e);
                    }
                    uhj uhjVar = rzbVar.g;
                    String[] strArr = sss.a;
                    uhjVar.j((ConversationIdType) obj4, messageIdType5, "link_preview");
                    return Optional.empty();
                }
                apzp apzpVar = (apzp) obj;
                if (apzpVar == null) {
                    ahqpVar = ahqp.ERROR;
                } else if (ryx.b(apzpVar)) {
                    ahqpVar = ahqp.SUCCESS;
                } else {
                    ahqpVar = ahqp.UNKNOWN;
                }
                Object obj5 = this.c;
                rzb rzbVar2 = (rzb) this.f;
                rzbVar2.j((ahqq) obj5, ahqpVar);
                if (apzpVar == null) {
                    return Optional.empty();
                }
                Object obj6 = this.d;
                Object obj7 = this.e;
                if (!ryx.b(apzpVar)) {
                    int i4 = this.a;
                    xyo c5 = rzb.a.c();
                    c5.H("Empty preview found:");
                    MessageIdType messageIdType6 = (MessageIdType) obj6;
                    c5.c(messageIdType6);
                    c5.q();
                    if (((Boolean) rzb.b.e()).booleanValue() && i4 == 3) {
                        rzbVar2.k((ConversationIdType) this.b, messageIdType6, (String) obj7);
                    } else {
                        i2 = i4;
                    }
                    rzbVar2.m(messageIdType6, 12, i2);
                    return Optional.empty();
                }
                ssj a = sss.a();
                a.l((MessageIdType) obj6);
                a.m((String) obj7);
                a.d(rzbVar2.f.f().toEpochMilli() + ryx.a);
                a.k(apzpVar.c);
                a.f(apzpVar.d);
                a.h(apzpVar.e);
                a.g(apzpVar.f);
                a.e(apzpVar.g);
                return Optional.of(a.a());
            }
            Object obj8 = this.c;
            Object obj9 = this.f;
            int i5 = this.a;
            Object obj10 = this.e;
            ?? r8 = this.d;
            mic micVar = (mic) this.b;
            micVar.bl(r8, (Integer) obj10, i5, (amgc) obj9, (amgl) obj8);
            micVar.D.e(r8);
            return null;
        }
        Object obj11 = this.c;
        ?? r0 = this.d;
        if (obj11 != null) {
            aozy createBuilder = amjk.a.createBuilder();
            amjk l = r0.y().l();
            if (l != null) {
                createBuilder.w(l);
            }
            r0.y().p((amjk) createBuilder.s());
        }
        Object obj12 = this.f;
        int i6 = this.a;
        Object obj13 = this.e;
        Object obj14 = this.b;
        mic micVar2 = (mic) obj14;
        micVar2.bl(r0, (Integer) obj13, i6, (amgc) obj12, (amgl) amgu.a.createBuilder());
        micVar2.D.e(r0);
        return null;
    }

    public /* synthetic */ mhw(mic micVar, MessageCoreData messageCoreData, Integer num, int i, amgc amgcVar, amgl amglVar, int i2) {
        this.g = i2;
        this.b = micVar;
        this.d = messageCoreData;
        this.e = num;
        this.a = i;
        this.f = amgcVar;
        this.c = amglVar;
    }

    public /* synthetic */ mhw(rzb rzbVar, ahqq ahqqVar, String str, ConversationIdType conversationIdType, MessageIdType messageIdType, int i, int i2) {
        this.g = i2;
        this.f = rzbVar;
        this.c = ahqqVar;
        this.e = str;
        this.b = conversationIdType;
        this.d = messageIdType;
        this.a = i;
    }
}
