package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.group.GroupInfo;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface vqu extends utv, vgy {
    public static final alhr a = uuh.w("migrate_telephony_methods_to_rcs_telephony_access");
    public static final uuf b = uuh.i(uuh.b, "enable_error_if_e164_phone_number_lookup_failed", false);

    static {
        uuh.i(uuh.b, "enable_failure_for_sending_reports_to_non_normalized_numbers", false);
    }

    void A();

    @Deprecated
    void B(acun acunVar);

    void C();

    boolean D(ConversationIdType conversationIdType);

    @Deprecated
    boolean E();

    boolean F(vqt vqtVar);

    boolean G(Intent intent);

    boolean H();

    boolean I(ConversationIdType conversationIdType);

    boolean J(int i);

    boolean K();

    boolean L();

    boolean M(MessageCoreData messageCoreData, int i, int i2, long j, boolean z, boolean z2);

    boolean N(MessageCoreData messageCoreData, int i, long j);

    @Deprecated
    boolean O();

    boolean P(int i);

    boolean Q(MessageCoreData messageCoreData);

    @Deprecated
    ConversationIdType R(long j, xhv xhvVar, GroupInfo groupInfo, int i, Optional optional, boolean z, int i2);

    void S(Bundle bundle);

    int T();

    gqg U(MessageCoreData messageCoreData);

    int d();

    int e(boolean z);

    int f(Optional optional);

    qwm g();

    vqt h();

    vqt i(rve rveVar);

    @Deprecated
    xaz j(long j, String str, String str2);

    @Deprecated
    acun k();

    @Deprecated
    akul l(MessageCoreData messageCoreData, msh mshVar);

    Optional m(msh mshVar);

    Optional n(ParticipantsTable.BindData bindData);

    @Deprecated
    Optional o();

    Optional p();

    @Deprecated
    String q(String str, String str2);

    String r(ConversationIdType conversationIdType);

    String s();

    @Deprecated
    String t();

    void u();

    void v();

    void w();

    void x(apfw apfwVar);

    void y(long j);

    @Deprecated
    void z();
}
