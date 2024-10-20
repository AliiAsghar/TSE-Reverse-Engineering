package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tnu extends aglz {
    private long a;
    private ConversationIdType b = ruy.a;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "UpdateConversationSuggestionsFromConversationIdSelection [conversation_suggestions.conversation_suggestions__id: %s,\n  messages.messages_conversation_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sea seaVar = (sea) agmqVar;
        aq();
        this.cJ = seaVar.dx();
        if (seaVar.db(0)) {
            this.a = seaVar.getLong(seaVar.cI(0, tnz.a));
            fE(0);
        }
        if (seaVar.db(1)) {
            this.b = new ConversationIdType(seaVar.getLong(seaVar.cI(1, tnz.a)));
            fE(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tnu)) {
            return false;
        }
        tnu tnuVar = (tnu) obj;
        if (super.aC(tnuVar.cJ) && this.a == tnuVar.a && Objects.equals(this.b, tnuVar.b)) {
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
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "UpdateConversationSuggestionsFromConversationIdSelection -- REDACTED");
        }
        return a();
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
    }
}
