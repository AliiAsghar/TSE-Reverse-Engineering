package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class too extends aglz implements agma {
    public String a;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "VerifiedSmsBlacklistedSendersTable [sender_id: %s\n]\n", String.valueOf(this.a));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "sender_id", this.a);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tos tosVar = (tos) agmqVar;
        aq();
        this.cJ = tosVar.dx();
        if (tosVar.db(0)) {
            this.a = tosVar.c();
            super.fE(0);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof too)) {
            return false;
        }
        too tooVar = (too) obj;
        if (super.aC(tooVar.cJ) && Objects.equals(this.a, tooVar.a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "verified_sms_blacklisted_senders", agnc.j(new String[]{"sender_id"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
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

    @Override // defpackage.agma
    public final String i() {
        return "verified_sms_blacklisted_senders";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.a};
        sb.append('(');
        for (int i = 0; i <= 0; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
                    }
                }
                list.add(obj);
                sb.append('?');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "VerifiedSmsBlacklistedSendersTable -- REDACTED");
        }
        return a();
    }
}
