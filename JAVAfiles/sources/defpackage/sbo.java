package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sbo extends aglz {
    public long a;
    private ConversationIdType b = ruy.a;
    private qfe c = qfe.UNKNOWN_STATE;
    private String d;
    private String e;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ConversationToParticipantsRcsGroupJoinStatusQuery [conversation_to_participants.conversation_to_participants_conversation_id: %s,\n  conversation_to_participants.conversation_to_participants_participant_id: %s,\n  conversation_to_participants.conversation_to_participants_rcs_group_join_status: %s,\n  participants.participants__id: %s,\n  participants.participants_normalized_destination: %s\n]\n", String.valueOf(this.b), String.valueOf(this.a), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        lbz lbzVar = (lbz) agmqVar;
        aq();
        this.cJ = lbzVar.dx();
        if (lbzVar.db(0)) {
            this.b = new ConversationIdType(lbzVar.getLong(lbzVar.cI(0, sbs.a)));
            fE(0);
        }
        if (lbzVar.db(1)) {
            this.a = lbzVar.getLong(lbzVar.cI(1, sbs.a));
            fE(1);
        }
        if (lbzVar.db(2)) {
            this.c = qfe.b(lbzVar.getInt(lbzVar.cI(2, sbs.a)));
            fE(2);
        }
        if (lbzVar.db(3)) {
            this.d = lbzVar.getString(lbzVar.cI(3, sbs.a));
            fE(3);
        }
        if (lbzVar.db(4)) {
            this.e = aabr.bb(lbzVar.getString(lbzVar.cI(4, sbs.a)));
            fE(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sbo)) {
            return false;
        }
        sbo sboVar = (sbo) obj;
        if (super.aC(sboVar.cJ) && Objects.equals(this.b, sboVar.b) && this.a == sboVar.a && this.c == sboVar.c && Objects.equals(this.d, sboVar.d) && Objects.equals(this.e, sboVar.e)) {
            return true;
        }
        return false;
    }

    public final qfe f() {
        ao(2, "rcs_group_join_status");
        return this.c;
    }

    public final String g() {
        ao(4, "normalized_destination");
        return this.e;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.b, Long.valueOf(this.a), this.c, this.d, this.e, null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ConversationToParticipantsRcsGroupJoinStatusQuery -- REDACTED");
        }
        return a();
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
    }
}
