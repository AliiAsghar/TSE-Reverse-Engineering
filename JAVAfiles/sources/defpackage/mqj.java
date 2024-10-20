package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqj extends aglz {
    private String b;
    private long[] f;
    private long[] g;
    private String h;
    private String[] i;
    private String[] j;
    private String[] k;
    private long[] l;
    private ConversationIdType a = ruy.a;
    private tqh c = tqh.NAME_IS_AUTOMATIC;
    private long d = 0;
    private int e = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ConversationsWithParticipantsFromConversationToParticipantsQuery [conversations.conversations__id: %s,\n  conversations.conversations_name: %s,\n  conversations.conversations_name_is_automatic: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversations.conversations_conv_type: %s,\n  conversation_to_participants.conversation_to_participants_participant_id: %s,\n  conversation_to_participants.conversation_to_participants_rowid: %s,\n  participants.participants__id: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_send_destination: %s,\n  participants.participants_comparable_destination: %s,\n  participants.participants_rowid: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), ay(this.f), ay(this.g), String.valueOf(this.h), aA(this.i), aA(this.j), aA(this.k), ay(this.l));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(d.P().W().c());
        valueOf.intValue();
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        mqt mqtVar = (mqt) agmqVar;
        aq();
        this.cJ = mqtVar.dx();
        if (mqtVar.db(0)) {
            this.a = mqtVar.d();
            fE(0);
        }
        if (mqtVar.db(1)) {
            this.b = mqtVar.f();
            fE(1);
        }
        if (mqtVar.db(2)) {
            this.c = mqtVar.e();
            fE(2);
        }
        if (mqtVar.db(3)) {
            this.d = mqtVar.getLong(mqtVar.cI(3, mqp.a));
            fE(3);
        }
        if (mqtVar.db(4)) {
            this.e = mqtVar.c();
            fE(4);
        }
        if (mqtVar.db(5)) {
            this.f = mqtVar.g();
            fE(5);
        }
        if (mqtVar.db(6)) {
            this.g = agnc.y(null, mqt.dl(mqtVar.getString(mqtVar.cI(6, mqp.a))));
            fE(6);
        }
        if (mqtVar.db(7)) {
            this.h = mqtVar.getString(mqtVar.cI(7, mqp.a));
            fE(7);
        }
        if (mqtVar.db(8)) {
            this.i = mqtVar.i();
            fE(8);
        }
        if (mqtVar.db(9)) {
            this.j = mqtVar.j();
            fE(9);
        }
        if (mqtVar.db(10)) {
            this.k = mqtVar.h();
            fE(10);
        }
        if (mqtVar.db(11)) {
            this.l = agnc.y(null, mqt.dl(mqtVar.getString(mqtVar.cI(11, mqp.a))));
            fE(11);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mqj)) {
            return false;
        }
        mqj mqjVar = (mqj) obj;
        if (super.aC(mqjVar.cJ) && Objects.equals(this.a, mqjVar.a) && Objects.equals(this.b, mqjVar.b) && this.c == mqjVar.c && this.d == mqjVar.d && this.e == mqjVar.e && Arrays.equals(this.f, mqjVar.f) && Arrays.equals(this.g, mqjVar.g) && Objects.equals(this.h, mqjVar.h) && Arrays.equals(this.i, mqjVar.i) && Arrays.equals(this.j, mqjVar.j) && Arrays.equals(this.k, mqjVar.k) && Arrays.equals(this.l, mqjVar.l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        aday adayVar;
        int ordinal;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        ConversationIdType conversationIdType = this.a;
        String str = this.b;
        tqh tqhVar = this.c;
        if (tqhVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqhVar.ordinal();
        }
        return Objects.hash(adayVar, conversationIdType, str, Integer.valueOf(ordinal), Long.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g)), this.h, Integer.valueOf(Arrays.hashCode(this.i)), Integer.valueOf(Arrays.hashCode(this.j)), Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(Arrays.hashCode(this.l)), null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ConversationsWithParticipantsFromConversationToParticipantsQuery -- REDACTED");
        }
        return a();
    }
}
