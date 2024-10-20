package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantCoreColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface rtz {
    alog A();

    alog B(alog alogVar);

    alog C(alog alogVar);

    alor D(alog alogVar);

    alpt E(String str);

    Optional F(ConversationIdType conversationIdType);

    Optional G(ConversationIdType conversationIdType);

    Optional H(ConversationIdType conversationIdType);

    String I(ConversationIdType conversationIdType);

    @Deprecated
    ArrayList J(xaz xazVar, int i);

    List K(ConversationIdType conversationIdType);

    @Deprecated
    List L(xhv xhvVar);

    void M(ConversationIdType conversationIdType);

    void N();

    void O(ConversationIdType conversationIdType);

    void P(String str);

    void Q(ArrayList arrayList);

    void R(ConversationIdType conversationIdType);

    void S(ConversationIdType conversationIdType, MessageCoreData messageCoreData, boolean z);

    void T(ConversationIdType conversationIdType, String str, int i, boolean z);

    void U(ConversationIdType conversationIdType, sng sngVar);

    void V(String str, ParticipantCoreColor participantCoreColor);

    void W(Set set, String str, String str2);

    void X(Set set, ParticipantsTable.BindData bindData);

    boolean Y(SelfIdentityId selfIdentityId, sng sngVar);

    boolean Z(Optional optional, ParticipantsTable.BindData bindData, rux ruxVar, ConversationIdType conversationIdType, boolean z, boolean z2);

    int a(ConversationIdType conversationIdType);

    boolean aa(ConversationIdType conversationIdType);

    boolean ab(ConversationIdType conversationIdType);

    boolean ac(long j);

    boolean ad(String str);

    boolean ae(ConversationIdType conversationIdType, String str);

    boolean af(ConversationIdType conversationIdType);

    boolean ag(ParticipantsTable.BindData bindData, ConversationIdType conversationIdType, boolean z);

    boolean ah(ConversationIdType conversationIdType, sng sngVar);

    boolean ai(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId);

    boolean aj(ConversationIdType conversationIdType, String str, rux ruxVar);

    boolean ak(ParticipantsTable.BindData bindData, ConversationIdType conversationIdType);

    void al(List list, ConversationIdType conversationIdType, boolean z);

    boolean am(Optional optional, List list, ConversationIdType conversationIdType, boolean z);

    @Deprecated
    ConversationIdType an(long j, tqc tqcVar, List list, int i, String str, long j2);

    @Deprecated
    ConversationIdType ao(long j, tqc tqcVar, List list);

    @Deprecated
    rut ap(wxs wxsVar, long j, tqc tqcVar, List list, long j2);

    List aq(ConversationIdType conversationIdType);

    void ar(List list, ConversationIdType conversationIdType);

    int b(ConversationIdType conversationIdType);

    int c(ConversationIdType conversationIdType);

    int d(ConversationIdType conversationIdType);

    int e(List list, boolean z);

    long f(ConversationIdType conversationIdType);

    long g(ConversationIdType conversationIdType);

    SelfIdentityId h(ConversationIdType conversationIdType);

    rut i(ruv ruvVar);

    rut j(ruv ruvVar, boolean z);

    ConversationIdType k(ruv ruvVar);

    @Deprecated
    ConversationIdType l(long j);

    ConversationIdType m(xhv xhvVar);

    @Deprecated
    ConversationIdType n(wxs wxsVar, long j);

    ConversationIdType o(wxs wxsVar, xhv xhvVar);

    ConversationIdType p(long j);

    smr q(ConversationIdType conversationIdType);

    tqc r(ConversationIdType conversationIdType);

    xxw s(ConversationIdType conversationIdType);

    alog t();

    alog u(xhv xhvVar);

    alog v(wxs wxsVar, xhv xhvVar);

    alog w(ConversationIdType conversationIdType);

    alog x(ConversationIdType conversationIdType);

    @Deprecated
    alog y(Optional optional, ConversationIdType conversationIdType);

    alog z(Optional optional, ConversationIdType conversationIdType, int i);
}
