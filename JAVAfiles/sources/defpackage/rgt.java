package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageToConversationOrParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.UploadAttachmentsToBlobstoreAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rgt implements ancs {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Action b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ rgt(SendMessageToConversationOrParticipantsAction sendMessageToConversationOrParticipantsAction, boolean z, ConversationIdType conversationIdType, String str, int i) {
        this.e = i;
        this.b = sendMessageToConversationOrParticipantsAction;
        this.a = z;
        this.d = conversationIdType;
        this.c = str;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        Optional empty;
        akul h;
        Optional empty2;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                String str = (String) obj;
                ArrayList arrayList = new ArrayList();
                Action action = this.b;
                Collection.EL.forEach(this.c, new iqp(action, str, arrayList, 9, (char[]) null));
                if (((Boolean) uwg.a.e()).booleanValue()) {
                    empty2 = ((UploadAttachmentsToBlobstoreAction) action).d;
                } else {
                    empty2 = Optional.empty();
                }
                Optional optional = empty2;
                UploadAttachmentsToBlobstoreAction uploadAttachmentsToBlobstoreAction = (UploadAttachmentsToBlobstoreAction) action;
                vby vbyVar = uploadAttachmentsToBlobstoreAction.b;
                return uploadAttachmentsToBlobstoreAction.a.a(arrayList, this.a, (String) this.d, vbyVar, optional);
            }
            Optional optional2 = (Optional) obj;
            SendMessageToConversationOrParticipantsAction sendMessageToConversationOrParticipantsAction = (SendMessageToConversationOrParticipantsAction) this.b;
            Optional j = sendMessageToConversationOrParticipantsAction.j(optional2);
            if (j.isEmpty()) {
                return aktp.ag(Optional.empty());
            }
            Object obj2 = this.c;
            Object obj3 = this.d;
            boolean z = this.a;
            SelfIdentityId selfIdentityId = (SelfIdentityId) optional2.get();
            int intValue = ((Integer) j.get()).intValue();
            if (z) {
                h = aktp.ai(new rfz(sendMessageToConversationOrParticipantsAction, (ConversationIdType) obj3, selfIdentityId, (String) obj2, sendMessageToConversationOrParticipantsAction.i.f().toEpochMilli(), 1), sendMessageToConversationOrParticipantsAction.o);
            } else {
                String str2 = (String) obj2;
                h = sendMessageToConversationOrParticipantsAction.h((ConversationIdType) obj3, selfIdentityId, intValue, str2, Collections.singletonList(sendMessageToConversationOrParticipantsAction.m.c(str2)));
            }
            return h.h(new qyv(18), sendMessageToConversationOrParticipantsAction.o);
        }
        String str3 = (String) obj;
        ArrayList arrayList2 = new ArrayList();
        Action action2 = this.b;
        Collection.EL.forEach(this.c, new iqp(action2, str3, arrayList2, 8, (char[]) null));
        if (((Boolean) uwg.a.e()).booleanValue()) {
            empty = ((UploadAttachmentsToBlobstoreAction) action2).d;
        } else {
            empty = Optional.empty();
        }
        Optional optional3 = empty;
        UploadAttachmentsToBlobstoreAction uploadAttachmentsToBlobstoreAction2 = (UploadAttachmentsToBlobstoreAction) action2;
        vby vbyVar2 = uploadAttachmentsToBlobstoreAction2.b;
        return uploadAttachmentsToBlobstoreAction2.a.a(arrayList2, this.a, (String) this.d, vbyVar2, optional3);
    }

    public /* synthetic */ rgt(UploadAttachmentsToBlobstoreAction uploadAttachmentsToBlobstoreAction, List list, boolean z, String str, int i) {
        this.e = i;
        this.b = uploadAttachmentsToBlobstoreAction;
        this.c = list;
        this.a = z;
        this.d = str;
    }
}
