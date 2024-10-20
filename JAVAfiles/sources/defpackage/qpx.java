package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qpx extends aglz {
    private ConversationIdType a = ruy.a;
    private int b = 0;
    private boolean c = false;
    private long[] d;
    private long[] e;
    private String f;
    private String[] g;
    private String[] h;
    private long[] i;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ConversationsWithParticipantsFromConversationToParticipantsQuery [conversations.conversations__id: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversation_to_participants.conversation_to_participants_participant_id: %s,\n  conversation_to_participants.conversation_to_participants_rowid: %s,\n  participants.participants__id: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_send_destination: %s,\n  participants.participants_rowid: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), ay(this.d), ay(this.e), String.valueOf(this.f), aA(this.g), aA(this.h), ay(this.i));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(d.P().W().c());
        valueOf.intValue();
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        qqg qqgVar = (qqg) agmqVar;
        aq();
        this.cJ = qqgVar.dx();
        boolean z = false;
        if (qqgVar.db(0)) {
            this.a = qqgVar.c();
            fE(0);
        }
        if (qqgVar.db(1)) {
            this.b = qqgVar.getInt(qqgVar.cI(1, qqc.a));
            fE(1);
        }
        if (qqgVar.db(2)) {
            if (qqgVar.getInt(qqgVar.cI(2, qqc.a)) == 1) {
                z = true;
            }
            this.c = z;
            fE(2);
        }
        if (qqgVar.db(3)) {
            this.d = agnc.y(null, qqg.dl(qqgVar.getString(qqgVar.cI(3, qqc.a))));
            fE(3);
        }
        if (qqgVar.db(4)) {
            this.e = agnc.y(null, qqg.dl(qqgVar.getString(qqgVar.cI(4, qqc.a))));
            fE(4);
        }
        if (qqgVar.db(5)) {
            this.f = qqgVar.getString(qqgVar.cI(5, qqc.a));
            fE(5);
        }
        if (qqgVar.db(6)) {
            this.g = qqgVar.e();
            fE(6);
        }
        if (qqgVar.db(7)) {
            this.h = qqgVar.f();
            fE(7);
        }
        if (qqgVar.db(8)) {
            this.i = agnc.y(null, qqg.dl(qqgVar.getString(qqgVar.cI(8, qqc.a))));
            fE(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qpx)) {
            return false;
        }
        qpx qpxVar = (qpx) obj;
        if (super.aC(qpxVar.cJ) && Objects.equals(this.a, qpxVar.a) && this.b == qpxVar.b && this.c == qpxVar.c && Arrays.equals(this.d, qpxVar.d) && Arrays.equals(this.e, qpxVar.e) && Objects.equals(this.f, qpxVar.f) && Arrays.equals(this.g, qpxVar.g) && Arrays.equals(this.h, qpxVar.h) && Arrays.equals(this.i, qpxVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e)), this.f, Integer.valueOf(Arrays.hashCode(this.g)), Integer.valueOf(Arrays.hashCode(this.h)), Integer.valueOf(Arrays.hashCode(this.i)), null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ConversationsWithParticipantsFromConversationToParticipantsQuery -- REDACTED");
        }
        return a();
    }
}
