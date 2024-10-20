package defpackage;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface tqx {
    MessageCoreData a();

    MessageCoreData b(Parcel parcel);

    MessageCoreData c(String str, ConversationIdType conversationIdType, String str2, SelfIdentityId selfIdentityId, String str3, String str4, long j, long j2, boolean z, boolean z2, int i, String str5);

    MessageCoreData d(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str, qei qeiVar);

    MessageCoreData e(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, MessageCoreData messageCoreData);

    MessageCoreData f(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str, String str2, boolean z);

    MessageCoreData g(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str);

    MessageCoreData h(int i, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId);

    MessageCoreData i(String str, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, boolean z, int i, String str3, String str4, int i2, String str5, boolean z2, boolean z3, long j, int i3, long j2, long j3, long j4, String str6, tqr tqrVar, long j5);

    MessageCoreData j(Uri uri, ConversationIdType conversationIdType, String str, SelfIdentityId selfIdentityId, String str2, String str3, long j, long j2, boolean z, boolean z2, long j3);

    MessageCoreData k(String str);

    MessageCoreData l(String str, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, boolean z, boolean z2, long j, long j2, String str3);

    MessageCoreData m(String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, long j, String str2);

    MessageCoreData n(ConversationIdType conversationIdType, int i, long j);

    MessageCoreData o(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, qei qeiVar, String str, String str2);

    MessageCoreData p(String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, long j, long j2, String str2, ruz ruzVar);

    MessageCoreData q(String str, Uri uri, long j, long j2, rve rveVar, long j3, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, String str3, int i, boolean z, long j4, long j5, String str4, String str5);

    MessageCoreData r(rve rveVar, String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, String str2, int i, int i2, String str3, boolean z, boolean z2, long j, long j2);

    MessageCoreData t(SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, long j, wrj wrjVar, ruz ruzVar);

    MessageCoreData u(SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, long j, String str, ruz ruzVar);

    MessageCoreData v(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str);
}
