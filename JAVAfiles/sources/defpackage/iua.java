package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iua extends aglz {
    private MessageIdType a = rvc.a;
    private long b;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "OutgoingReactionsQuery [messages.messages__id: %s,\n  message_reactions.message_reactions__id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        lbz lbzVar = (lbz) agmqVar;
        aq();
        this.cJ = lbzVar.dx();
        if (lbzVar.db(0)) {
            this.a = new MessageIdType(lbzVar.getLong(lbzVar.cI(0, iue.a)));
            fE(0);
        }
        if (lbzVar.db(1)) {
            this.b = lbzVar.getLong(lbzVar.cI(1, iue.a));
            fE(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iua)) {
            return false;
        }
        iua iuaVar = (iua) obj;
        if (super.aC(iuaVar.cJ) && Objects.equals(this.a, iuaVar.a) && this.b == iuaVar.b) {
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
        return Objects.hash(adayVar, this.a, Long.valueOf(this.b), null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "OutgoingReactionsQuery -- REDACTED");
        }
        return a();
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
    }
}
