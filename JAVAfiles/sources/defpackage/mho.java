package defpackage;

import android.app.NotificationChannel;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.BackgroundLoadingMessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface mho extends adtj {
    public static final long a = TimeUnit.DAYS.toMillis(1);
    public static final long b = TimeUnit.DAYS.toMillis(7);
    public static final long c = TimeUnit.DAYS.toMillis(28);
    public static final uuf d = uuh.c(uuh.b, "conversation_protocol_full_condition_ratio", 1.0d);
    public static final alhr e = uuh.x(254207979, "enable_message_attachment_size_instrumentation");

    void A(rve rveVar, MessageCoreData messageCoreData, int i, amxo amxoVar);

    void B(rve rveVar, MessageCoreData messageCoreData, int i, amxo amxoVar);

    void C(rve rveVar, MessageCoreData messageCoreData, int i, amxb amxbVar, amxo amxoVar);

    void D(MessageCoreData messageCoreData, amem amemVar);

    void E(MessageCoreData messageCoreData, amem amemVar);

    void F(MessageCoreData messageCoreData, String str);

    void G(MessageCoreData messageCoreData, String str);

    void H(MessageCoreData messageCoreData, Integer num, int i, amgc amgcVar);

    void I(mgn mgnVar);

    void J(MessageCoreData messageCoreData);

    void K(MessageCoreData messageCoreData, int i);

    void L(MessageCoreData messageCoreData, int i, int i2);

    void M(MessageCoreData messageCoreData, int i, amgl amglVar);

    void N(MessageCoreData messageCoreData, int i, long j, mbh mbhVar, amgl amglVar);

    void O(MessageCoreData messageCoreData, int i, int i2, amgj amgjVar);

    void P(int i, int i2, int i3, int i4, long j, int i5, long j2, ConversationIdType conversationIdType);

    void Q(ConversationIdType conversationIdType, int i, long j);

    void R(int i);

    void S(amlw amlwVar, amlx amlxVar);

    @Deprecated
    void T(ConversationIdType conversationIdType, int i, amxo amxoVar, long j);

    @Deprecated
    void U(MessageCoreData messageCoreData);

    void V(mgo mgoVar);

    void W(MessageCoreData messageCoreData, amih amihVar);

    void X(int i, int i2);

    void Y(amrs amrsVar, MessageCoreData messageCoreData, int i);

    @Deprecated
    void Z(String str, int i, String str2);

    @Override // defpackage.adtj
    void a(aphp aphpVar);

    void aA(int i, int i2);

    void aB(int i);

    void aC(ConversationIdType conversationIdType, amfe amfeVar, int i, int i2, boolean z, Boolean bool, boolean z2, boolean z3, int i3, List list, boolean z4, int i4, boolean z5, int i5);

    void aD(ConversationIdType conversationIdType, int i);

    @Deprecated
    void aE(int i);

    void aF(int i, String str, int i2);

    void aG(int i, int i2, int i3);

    void aH(MessageCoreData messageCoreData, int i, int i2, int i3, int i4, int i5, amxb amxbVar, int i6, int i7, Optional optional, Optional optional2, Optional optional3);

    @Deprecated
    void aI(MessageCoreData messageCoreData, int i, int i2, int i3, int i4, amxb amxbVar, int i5, int i6, Optional optional, Optional optional2);

    void aJ(MessageCoreData messageCoreData, int i, long j, boolean z, int i2);

    void aK(amhc amhcVar, int i, List list);

    void aL(int i, int i2, String str);

    @Deprecated
    void aM(int i, String str);

    void aN(int i, amho amhoVar, String str);

    void aO(MessageCoreData messageCoreData, int i, amxo amxoVar, int i2, int i3);

    void aP(int i);

    void aQ(int i, int i2);

    void aR(int i);

    void aS(int i);

    @Deprecated
    void aT(MessageCoreData messageCoreData, int i, int i2, int i3, int i4, Optional optional);

    @Deprecated
    void aU(MessageCoreData messageCoreData, amgu amguVar);

    void aV(MessageCoreData messageCoreData);

    void aW();

    void aX(int i);

    @Deprecated
    void aY();

    void aZ(MessageCoreData messageCoreData, int i, mbh mbhVar, amgl amglVar);

    void aa(amir amirVar, yua yuaVar, long j);

    @Deprecated
    void ab(String str, int i, String str2, String str3, tqr tqrVar);

    void ac(int i);

    void ad(amgj amgjVar, atok atokVar, mbh mbhVar);

    void ae();

    void af(MessageCoreData messageCoreData);

    void ag(int i);

    void ah(boolean z);

    void ai();

    void aj();

    void ak();

    boolean al();

    void am(msh mshVar, tqr tqrVar, String str);

    void an(int i, int i2, int i3, long j, int i4, long j2, ConversationIdType conversationIdType);

    void ao(rve rveVar, amxb amxbVar, amxo amxoVar);

    void ap(MessageCoreData messageCoreData);

    void aq(MessageCoreData messageCoreData, Optional optional, amxo amxoVar, mbh mbhVar);

    void ar(MessageCoreData messageCoreData, Optional optional);

    void as(NotificationChannel notificationChannel, NotificationChannel notificationChannel2);

    void at();

    int au();

    @Deprecated
    void av(int i);

    void aw(String str, int i);

    void ax(int i);

    void ay(int i, int i2);

    void az(int i);

    @Override // defpackage.adtj
    void b(aphq aphqVar);

    void ba(amhc amhcVar);

    void bb(int i);

    lfl bc();

    @Override // defpackage.adtj
    void c(apht aphtVar);

    int e();

    BackgroundLoadingMessageUsageStatisticsData f(Callable callable, amgj amgjVar);

    akul g();

    amio h(long j);

    amio i(String str);

    ListenableFuture j();

    String k(Optional optional);

    void l();

    void m(amen amenVar);

    void n(long j);

    void o(boolean z, boolean z2);

    @Deprecated
    void p(String str, int i, String str2, String str3, tqr tqrVar);

    @Deprecated
    void q(String str, int i, String str2, String str3, tqr tqrVar);

    void r();

    void s(amfh amfhVar, ConversationIdType conversationIdType, amfe amfeVar, tqc tqcVar, tqc tqcVar2);

    void t(ConversationIdType conversationIdType, amfe amfeVar, int i);

    void u(amfh amfhVar, ConversationIdType conversationIdType, amfe amfeVar, boolean z, tqc tqcVar);

    void v(ConversationIdType conversationIdType, amfd amfdVar);

    void w(boolean z, boolean z2);

    void x();

    void y(ConversationIdType conversationIdType, amfu amfuVar);

    void z(rve rveVar, MessageCoreData messageCoreData, int i, amxo amxoVar);
}
