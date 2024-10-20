package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcs extends aglz {
    private ConversationIdType a = ruy.a;
    private long b = 0;
    private boolean c;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "SuperSortInnerQuery [conversations.conversations__id: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversation_pin.conversation_pin_pin_status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        lbz lbzVar = (lbz) agmqVar;
        aq();
        this.cJ = lbzVar.dx();
        boolean z = false;
        if (lbzVar.db(0)) {
            this.a = new ConversationIdType(lbzVar.getLong(lbzVar.cI(0, lcz.a)));
            fE(0);
        }
        if (lbzVar.db(1)) {
            this.b = lbzVar.getLong(lbzVar.cI(1, lcz.a));
            fE(1);
        }
        if (lbzVar.db(2)) {
            if (lbzVar.getInt(lbzVar.cI(2, lcz.a)) == 1) {
                z = true;
            }
            this.c = z;
            fE(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lcs)) {
            return false;
        }
        lcs lcsVar = (lcs) obj;
        if (super.aC(lcsVar.cJ) && Objects.equals(this.a, lcsVar.a) && this.b == lcsVar.b && this.c == lcsVar.c) {
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
        return Objects.hash(adayVar, this.a, Long.valueOf(this.b), Boolean.valueOf(this.c), null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "SuperSortInnerQuery -- REDACTED");
        }
        return a();
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
    }
}
