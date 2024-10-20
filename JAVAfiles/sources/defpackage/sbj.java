package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sbj extends aglz {
    public long a;
    public String c;
    private String e;
    private ConversationIdType d = ruy.a;
    public qfe b = qfe.UNKNOWN_STATE;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ConversationParticipantsRcsGroupJoinStatusQuery [conversation_participants.conversation_participants_conversation_id: %s,\n  conversation_participants.conversation_participants_participant_id: %s,\n  conversation_participants.conversation_participants_rcs_group_join_status: %s,\n  participants.participants__id: %s,\n  participants.participants_normalized_destination: %s\n]\n", String.valueOf(this.d), String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.e), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(d.P().W().c());
        valueOf.intValue();
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        lbz lbzVar = (lbz) agmqVar;
        aq();
        this.cJ = lbzVar.dx();
        if (lbzVar.db(0)) {
            this.d = new ConversationIdType(lbzVar.getLong(lbzVar.cI(0, sbn.a)));
            fE(0);
        }
        if (lbzVar.db(1)) {
            this.a = lbzVar.getLong(lbzVar.cI(1, sbn.a));
            fE(1);
        }
        if (lbzVar.db(2)) {
            this.b = qfe.b(lbzVar.getInt(lbzVar.cI(2, sbn.a)));
            fE(2);
        }
        if (lbzVar.db(3)) {
            this.e = lbzVar.getString(lbzVar.cI(3, sbn.a));
            fE(3);
        }
        if (lbzVar.db(4)) {
            this.c = aabr.bb(lbzVar.getString(lbzVar.cI(4, sbn.a)));
            fE(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sbj)) {
            return false;
        }
        sbj sbjVar = (sbj) obj;
        if (super.aC(sbjVar.cJ) && Objects.equals(this.d, sbjVar.d) && this.a == sbjVar.a && this.b == sbjVar.b && Objects.equals(this.e, sbjVar.e) && Objects.equals(this.c, sbjVar.c)) {
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
        return Objects.hash(adayVar, this.d, Long.valueOf(this.a), this.b, this.e, this.c, null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ConversationParticipantsRcsGroupJoinStatusQuery -- REDACTED");
        }
        return a();
    }
}
