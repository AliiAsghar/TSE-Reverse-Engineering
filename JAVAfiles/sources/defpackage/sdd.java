package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sdd extends aglz {
    private MessageIdType a = rvc.a;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "MessageIdsQueryWithReactions [messages.messages__id: %s\n]\n", String.valueOf(this.a));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        lbz lbzVar = (lbz) agmqVar;
        aq();
        this.cJ = lbzVar.dx();
        if (lbzVar.db(0)) {
            this.a = new MessageIdType(lbzVar.getLong(lbzVar.cI(0, sdi.a)));
            super.fE(0);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sdd)) {
            return false;
        }
        sdd sddVar = (sdd) obj;
        if (super.aC(sddVar.cJ) && Objects.equals(this.a, sddVar.a)) {
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
        return Objects.hash(adayVar, this.a, null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "MessageIdsQueryWithReactions -- REDACTED");
        }
        return a();
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
    }
}
