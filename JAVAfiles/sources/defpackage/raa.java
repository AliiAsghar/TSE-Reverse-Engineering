package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.InsertNewMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateRbmBotParticipantAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class raa implements alhr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ raa(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, okf] */
    /* JADX WARN: Type inference failed for: r7v3, types: [armf, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        akrh e;
        List K;
        List list;
        Integer valueOf;
        Integer valueOf2;
        agnw d;
        boolean z;
        String str;
        boolean z2;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        Integer valueOf8;
        agnw d2;
        boolean z3;
        int i = this.d;
        if (i != 0) {
            int i2 = 20;
            int i3 = 17;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                sjt sjtVar = new sjt();
                                Object obj = this.a;
                                aglz aglzVar = (aglz) obj;
                                aglzVar.ao(1, "conversation_id");
                                sjn sjnVar = (sjn) obj;
                                ConversationIdType conversationIdType = sjnVar.b;
                                if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
                                    sjtVar.a.put("conversation_id", Long.valueOf(ruy.a(conversationIdType)));
                                } else {
                                    sjtVar.a.putNull("conversation_id");
                                }
                                qhy h = sjnVar.h();
                                if (h == null) {
                                    sjtVar.a.putNull("classification_type");
                                } else {
                                    sjtVar.a.put("classification_type", Integer.valueOf(h.a()));
                                }
                                aglzVar.ao(3, "classification_state");
                                qhx qhxVar = sjnVar.d;
                                valueOf3 = Integer.valueOf(a.bp().c());
                                int intValue = valueOf3.intValue();
                                valueOf4 = Integer.valueOf(a.bp().c());
                                int intValue2 = valueOf4.intValue();
                                if (intValue2 < 58690) {
                                    agnc.t("classification_state", intValue2);
                                }
                                if (intValue >= 58690) {
                                    if (qhxVar == null) {
                                        sjtVar.a.putNull("classification_state");
                                    } else {
                                        sjtVar.a.put("classification_state", Integer.valueOf(qhxVar.a()));
                                    }
                                }
                                agnc.r(sjtVar.a, "date", sjnVar.k());
                                aglzVar.ao(5, "impression_count");
                                long j = sjnVar.f;
                                valueOf5 = Integer.valueOf(a.bp().c());
                                int intValue3 = valueOf5.intValue();
                                valueOf6 = Integer.valueOf(a.bp().c());
                                int intValue4 = valueOf6.intValue();
                                if (intValue4 < 58840) {
                                    agnc.t("impression_count", intValue4);
                                }
                                if (intValue3 >= 58840) {
                                    sjtVar.a.put("impression_count", Long.valueOf(j));
                                }
                                aglzVar.ao(6, "generated_timestamp");
                                long j2 = sjnVar.g;
                                valueOf7 = Integer.valueOf(a.bp().c());
                                int intValue5 = valueOf7.intValue();
                                valueOf8 = Integer.valueOf(a.bp().c());
                                int intValue6 = valueOf8.intValue();
                                if (intValue6 < 58840) {
                                    agnc.t("generated_timestamp", intValue6);
                                }
                                if (intValue5 >= 58840) {
                                    sjtVar.a.put("generated_timestamp", Long.valueOf(j2));
                                }
                                Object obj2 = this.b;
                                sjtVar.ag();
                                sjtVar.Z((agpw) obj2);
                                sjtVar.ai(new agni("conversation_classifications_table", "-updateOrInsert-update"));
                                if (sjtVar.a().e() == 0) {
                                    ?? r0 = this.c;
                                    d2 = agnc.d("$primary");
                                    if (agnc.a(d2, "conversation_classifications_table", aglzVar, new skt(r0, 1), new rug(obj, i3)) != -1) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    return Boolean.valueOf(z3);
                                }
                                return true;
                            }
                            Object obj3 = this.a;
                            ?? r2 = this.b;
                            ConversationIdType conversationIdType2 = (ConversationIdType) obj3;
                            r2.at(conversationIdType2);
                            Object obj4 = this.c;
                            rvw rvwVar = (rvw) obj4;
                            armf armfVar = rvwVar.b;
                            long q = r2.q();
                            uhj uhjVar = (uhj) armfVar.b();
                            MessageIdType A = r2.A();
                            String[] strArr = PartsTable.a;
                            uhjVar.j(conversationIdType2, A, "parts");
                            xyl.r(q);
                            String l = Long.toString(q);
                            r2.aN(l);
                            r2.aL(conversationIdType2);
                            rvwVar.a.h(new mla(i2), null, new rah(obj4, r2, i3));
                            return l;
                        }
                        Object obj5 = this.c;
                        return ((rul) this.a).ax((Optional) this.b, (ConversationIdType) obj5, Optional.empty());
                    }
                    sng sngVar = new sng();
                    sngVar.aj("updateConversationSelfId");
                    ?? r22 = this.a;
                    rul rulVar = (rul) this.c;
                    if (rulVar.Y(r22, sngVar)) {
                        return Boolean.valueOf(rulVar.ah((ConversationIdType) this.b, sngVar));
                    }
                    return false;
                }
                tbb f = ParticipantsTable.f();
                f.aj("updateParticipantDisplayDestination");
                f.m((String) this.b);
                f.M(new rbw(this.c, 14));
                int e2 = f.a().e();
                rxq rxqVar = (rxq) ((UpdateRbmBotParticipantAction) this.a).a.b();
                if (e2 != 1) {
                    str = "Failed to update participant's display destination.";
                } else {
                    str = "Successfully updated participants's display destination.";
                }
                rxqVar.m(e2, str);
                if (e2 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
            qwu qwuVar = new qwu();
            ContentValues contentValues = qwuVar.a;
            Object obj6 = this.a;
            qwo qwoVar = (qwo) obj6;
            agnc.r(contentValues, "telephony_phone_number", qwoVar.h());
            qwe e3 = qwoVar.e();
            valueOf = Integer.valueOf(a.bp().c());
            int intValue7 = valueOf.intValue();
            valueOf2 = Integer.valueOf(a.bp().c());
            int intValue8 = valueOf2.intValue();
            if (intValue8 < 59450) {
                agnc.t("my_identity_token", intValue8);
            }
            if (intValue7 >= 59450) {
                if (e3 == null) {
                    qwuVar.a.putNull("my_identity_token");
                } else {
                    qwuVar.a.put("my_identity_token", riw.n(e3));
                }
            }
            Object obj7 = this.b;
            aglz aglzVar2 = (aglz) obj6;
            aglzVar2.ao(4, "my_identity_token_with_foreign_key");
            qwuVar.d(qwoVar.e);
            qwuVar.ag();
            qwuVar.Z((agpw) obj7);
            qwuVar.ai(new agni("subscriptions", "-updateOrInsert-update"));
            if (qwuVar.a().e() == 0) {
                Object obj8 = this.c;
                d = agnc.d("$primary");
                if (agnc.a(d, "subscriptions", aglzVar2, new qsb(obj8, i2), new qab(17)) != -1) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            return true;
        }
        Object obj9 = this.a;
        ?? r3 = this.b;
        Object obj10 = this.c;
        int i4 = 9;
        try {
            if (obj10 != null) {
                InsertNewMessageAction insertNewMessageAction = (InsertNewMessageAction) obj9;
                if (((pde) insertNewMessageAction.g.g.b()).a()) {
                    list = ((rtz) insertNewMessageAction.c.b()).z(r3.ac().flatMap(new qza(i4)), r3.z(), ((rto) obj10).G());
                    Stream map = Collection.EL.stream(list).map(new lch(obj9, r3.ci(), 4));
                    int i5 = alog.d;
                    return (List) map.collect(alls.a);
                }
            }
            if (((InsertNewMessageAction) obj9).g.d.a()) {
                K = ((rtz) ((InsertNewMessageAction) obj9).c.b()).y(r3.ac().flatMap(new qza(i4)), r3.z());
            } else {
                K = ((rtz) ((InsertNewMessageAction) obj9).c.b()).K(r3.z());
            }
            e.close();
            list = K;
            Stream map2 = Collection.EL.stream(list).map(new lch(obj9, r3.ci(), 4));
            int i52 = alog.d;
            return (List) map2.collect(alls.a);
        } finally {
        }
        e = aktp.e("InsertNewMessageAction::getConversationParticipants_dsdrGroupsFlag");
    }

    public /* synthetic */ raa(rul rulVar, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i) {
        this.d = i;
        this.c = rulVar;
        this.a = selfIdentityId;
        this.b = conversationIdType;
    }

    public /* synthetic */ raa(rvw rvwVar, MessagePartCoreData messagePartCoreData, ConversationIdType conversationIdType, int i) {
        this.d = i;
        this.c = rvwVar;
        this.b = messagePartCoreData;
        this.a = conversationIdType;
    }
}
