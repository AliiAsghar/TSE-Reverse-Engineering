package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mds implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mds(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r0v84, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v29, types: [xyt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v93, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [armf, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        amxo amxoVar;
        int i = 4;
        int i2 = 6;
        int i3 = 3;
        int i4 = 16;
        int i5 = 0;
        int i6 = 1;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                int i7 = mdt.d;
                aozy builder = ((mdn) obj).toBuilder();
                apct j = aotl.j((Instant) obj2);
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                mdn mdnVar = (mdn) builder.b;
                j.getClass();
                mdnVar.m = j;
                mdnVar.b |= 2048;
                return (mdn) builder.s();
            case 1:
                int i8 = mdt.d;
                aozy builder2 = ((mdn) obj).toBuilder();
                long longValue = ((Long) this.a).longValue();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                mdn mdnVar2 = (mdn) builder2.b;
                mdnVar2.b |= 16;
                mdnVar2.g = longValue;
                return (mdn) builder2.s();
            case 2:
                Long l = (Long) obj;
                if (l != null) {
                    return ((mfo) this.a).m.h(l.longValue());
                }
                return amio.UNKNOWN_EVENT_AGE;
            case 3:
                ((yyq) ((mfo) this.a).C.b()).n(new mcv(((Integer) obj).intValue(), i3));
                return null;
            case 4:
                ijp ijpVar = (ijp) ((mfo) this.a).M.b();
                int intValue = ((Integer) obj).intValue();
                aozy createBuilder = amqs.a.createBuilder();
                if (intValue >= 0 && intValue < 10) {
                    i = 2;
                } else if (intValue >= 10 && intValue < 100) {
                    i = 3;
                } else if (intValue < 100 || intValue >= 500) {
                    if (intValue >= 500 && intValue < 1000) {
                        i = 5;
                    } else if (intValue >= 1000 && intValue < 5000) {
                        i = 6;
                    } else if (intValue >= 5000) {
                        i = 7;
                    } else {
                        i = 1;
                    }
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amqs amqsVar = (amqs) createBuilder.b;
                amqsVar.c = i - 1;
                amqsVar.b |= 1;
                apag s = createBuilder.s();
                s.getClass();
                ijpVar.b(new gsh((amqs) s, 13));
                return null;
            case 5:
                aozy aozyVar = (aozy) obj;
                xze xzeVar = mfo.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                Object obj3 = this.a;
                ameq ameqVar = (ameq) aozyVar.b;
                ameq ameqVar2 = ameq.a;
                obj3.getClass();
                ameqVar.g = (amhf) obj3;
                ameqVar.b |= 16;
                return (ameq) aozyVar.s();
            case 6:
                return ((vrn) ((lig) this.a).e.a()).c();
            case 7:
                int i9 = mie.d;
                if (((qry) obj).c(vbe.TACHYGRAM.name())) {
                    amxoVar = amxo.RCS_TACHYGRAM;
                } else {
                    amxoVar = amxo.UNKNOWN_RCS_TYPE;
                }
                Object obj4 = this.a;
                aozy aozyVar2 = (aozy) obj4;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                amgu amguVar = (amgu) ((amgl) obj4).b;
                amgu amguVar2 = amgu.a;
                amguVar.ab = amxoVar.h;
                amguVar.c |= 4194304;
                return null;
            case 8:
                alog alogVar = (alog) obj;
                if (alogVar.size() != 1) {
                    return Optional.empty();
                }
                return Optional.of(((msk) ((mie) this.a).b.b()).q((ParticipantsTable.BindData) alogVar.get(0)));
            case 9:
                nfw nfwVar = (nfw) ((Optional) obj).orElse(null);
                mlx mlxVar = (mlx) this.a;
                mlxVar.e = nfwVar;
                return mlxVar.a();
            case 10:
                Optional findFirst = Collection.EL.stream((alog) obj).findFirst();
                Object obj5 = this.a;
                findFirst.ifPresent(new mpv(obj5, i6));
                return ((mlx) obj5).a();
            case 11:
                mll mllVar = (mll) obj;
                alwo alwoVar = mlv.a;
                boolean q = mllVar.q();
                Object obj6 = this.a;
                if (q) {
                    alwl alwlVar = (alwl) mlv.a.i();
                    alwlVar.X(ydl.q, obj6);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "isConversationLatched", 123, "BugleConversationUnlatcher.java")).q("Unlatcher: Ignoring deleted conversation.");
                    return false;
                }
                if (mllVar.r() != 0) {
                    alwl alwlVar2 = (alwl) mlv.a.g();
                    alwlVar2.X(ydl.q, obj6);
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "isConversationLatched", 131, "BugleConversationUnlatcher.java")).t("Unlatcher: Ignoring conversation type %s.", tvu.b(mllVar.r()));
                    return false;
                }
                if (mllVar.x() == amjj.SEND_MODE_XMS_LATCH) {
                    return true;
                }
                alwl alwlVar3 = (alwl) mlv.a.g();
                alwlVar3.X(ydl.q, obj6);
                ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "isConversationLatched", 141, "BugleConversationUnlatcher.java")).t("Unlatcher: Ignoring unlatched conversation. SendMode: %s.", mllVar.x());
                return false;
            case 12:
                vus vusVar = (vus) obj;
                alwo alwoVar2 = mmg.a;
                if (vusVar == vus.SUCCESS) {
                    return true;
                }
                ((alwl) ((alwl) mmg.a.i()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "renameConversation", 668, "DefaultConversationRepository.java")).D("group renaming on conversation id = %s failed, reason: %s", this.a.b(), vusVar.name());
                return false;
            case 13:
                return ((mnh) this.a).b((alog) obj);
            case 14:
                mpe mpeVar = (mpe) this.a;
                return mpeVar.b.j((BugleConversation) ((Conversation) obj), (miw) mpeVar.a.b());
            case 15:
                int ordinal = ((mps) ((mll) obj)).b.ordinal();
                Object obj7 = this.a;
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        RbmConversation rbmConversation = (RbmConversation) obj7;
                        ((qxr) rbmConversation.d.b()).p(4, ruy.b(rbmConversation.a.b()));
                    }
                } else {
                    RbmConversation rbmConversation2 = (RbmConversation) obj7;
                    ((qxr) rbmConversation2.d.b()).n(ruy.b(rbmConversation2.a.b()));
                }
                return null;
            case 16:
                Collection.EL.stream((alog) obj).filter(new mmd(i2)).findFirst().ifPresent(new mpv(this.a, i5));
                return null;
            case 17:
                alog alogVar2 = (alog) obj;
                kor korVar = (kor) this.a;
                ndi ndiVar = (ndi) korVar.a.b();
                ndiVar.getClass();
                alogVar2.getClass();
                return new ifs(ndiVar, korVar.b, alogVar2);
            case 18:
                return (miz) Collection.EL.stream((alog) obj).filter(new isg(this.a, i4)).findFirst().orElse(null);
            case 19:
                alog alogVar3 = (alog) obj;
                if (!alogVar3.isEmpty()) {
                    String P = ((MessagesTable.BindData) alogVar3.get(0)).P();
                    P.getClass();
                    return P;
                }
                throw new muy(this.a);
            default:
                Boolean bool = (Boolean) obj;
                alwl alwlVar4 = (alwl) DefaultRecipient.a.g();
                alwlVar4.X(ydl.C, ((DefaultRecipient) this.a).q());
                ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/api/messaging/recipient/DefaultRecipient", "isRcsGroupChatEnabled", 483, "DefaultRecipient.java")).t("isRcsGroupChatEnabled = %b.", bool);
                return bool;
        }
    }
}
