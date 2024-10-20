package defpackage;

import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.FallbackToXmsAction;
import com.google.android.apps.messaging.shared.datamodel.action.NoConfirmationMessageSendAction;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveP2pSuggestionsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qwn implements Supplier {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ Object a;
    private final /* synthetic */ int c;

    public qwn(aglz aglzVar, int i) {
        this.c = i;
        this.a = aglzVar;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.List, java.lang.Object] */
    @Override // java.util.function.Supplier
    public final Object get() {
        int i = 12;
        switch (this.c) {
            case 0:
                qwe qweVar = ((qwo) this.a).e;
                if (qweVar == null || qweVar.equals(null)) {
                    return null;
                }
                return riw.n(((qwo) this.a).e);
            case 1:
                qss qssVar = ((qua) this.a).a;
                if (qssVar == null || qssVar.equals(null)) {
                    return null;
                }
                return qta.e(((qua) this.a).a);
            case 2:
                alvw i2 = FallbackToXmsAction.b.i();
                i2.X(alwp.a, "BugleDataModel");
                ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/datamodel/action/FallbackToXmsAction", "getSubscriptionIdLegacy", 236, "FallbackToXmsAction.java")).t("Missing self identity mapping for selfId %s; using -1 instead", this.a);
                return -1;
            case 3:
                return new IllegalStateException(String.format("Rcs identifier of remote user %s doesn't exist.", this.a));
            case 4:
                Parcelable.Creator<Action<Void>> creator = NoConfirmationMessageSendAction.CREATOR;
                return Integer.valueOf(((ykb) this.a.get(0)).a());
            case 5:
                alvw i3 = rbk.a.i();
                i3.X(alwp.a, "BugleDataModel");
                ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "handleNotReadyToSendRcsMessage", 1537, "PendingMessagesProcessor.java")).q("SelfIdentityChatEndpoint not present on MessageCoreData");
                return ((rbk) this.a).c.c();
            case 6:
                return (List) Collection.EL.stream(((ReceiveP2pSuggestionsAction) this.a).u.m("rcs.intent.extra.messageClassifications")).map(new rbs(4)).collect(Collectors.toCollection(new qxs(i)));
            case 7:
                return (List) Collection.EL.stream(((ReceiveP2pSuggestionsAction) this.a).u.m("rcs.intent.extra.conversationTags")).map(new rbs(6)).collect(Collectors.toCollection(new qxs(i)));
            case 8:
                throw null;
            case 9:
                return (List) Collection.EL.stream(((ReceiveP2pSuggestionsAction) this.a).u.m("rcs.intent.extra.messageClassifications")).map(new rbs(7)).collect(Collectors.toCollection(new qxs(i)));
            case 10:
                return (List) Collection.EL.stream(((ReceiveP2pSuggestionsAction) this.a).u.m("rcs.intent.extra.conversationTags")).map(new rbs(3)).collect(Collectors.toCollection(new qxs(i)));
            case 11:
                gsi gsiVar = (gsi) this.a;
                return Optional.ofNullable((ActionParameters) rik.a((String) Optional.ofNullable(gsiVar.d("bundle_action_params")).orElse(gsiVar.d("bundle_action_serialized_params")), ActionParameters.class, "ActionParameters"));
            case 12:
                ConversationIdType conversationIdType = ((rki) this.a).b;
                if (conversationIdType == null || conversationIdType.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((rki) this.a).b));
            case 13:
                ConversationIdType conversationIdType2 = ((rkt) this.a).b;
                if (conversationIdType2 == null || conversationIdType2.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((rkt) this.a).b));
            case 14:
                ConversationIdType conversationIdType3 = ((rlb) this.a).a;
                if (conversationIdType3 == null || conversationIdType3.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((rlb) this.a).a));
            case 15:
                qwe qweVar2 = ((rlb) this.a).b;
                if (qweVar2 == null || qweVar2.equals(null)) {
                    return null;
                }
                return riw.n(((rlb) this.a).b);
            case 16:
                MessageIdType messageIdType = ((rln) this.a).b;
                if (messageIdType == null || messageIdType.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((rln) this.a).b));
            case 17:
                MessageIdType messageIdType2 = ((rlx) this.a).b;
                if (messageIdType2 == null || messageIdType2.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((rlx) this.a).b));
            case 18:
                MessageIdType messageIdType3 = ((rlx) this.a).d;
                if (messageIdType3 == null || messageIdType3.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((rlx) this.a).d));
            case 19:
                MessageIdType messageIdType4 = ((rmj) this.a).a;
                if (messageIdType4 == null || messageIdType4.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((rmj) this.a).a));
            default:
                MessageIdType messageIdType5 = ((rmj) this.a).b;
                if (messageIdType5 == null || messageIdType5.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((rmj) this.a).b));
        }
    }

    public /* synthetic */ qwn(Object obj, int i) {
        this.c = i;
        this.a = obj;
    }
}
