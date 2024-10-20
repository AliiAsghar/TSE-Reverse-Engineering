package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tfb extends aglz implements agma {
    public rve a = rve.a;
    public String b;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ReceivedMessagePhoneNumbersTable [rcs_message_id: %s,\n  self_msisdn: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        rve rveVar = this.a;
        if (rveVar != null && !rveVar.equals(rve.a)) {
            contentValues.put("rcs_message_id", rve.d(this.a));
        } else {
            contentValues.putNull("rcs_message_id");
        }
        agnc.r(contentValues, "self_msisdn", this.b);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tfd tfdVar = (tfd) agmqVar;
        aq();
        this.cJ = tfdVar.dx();
        if (tfdVar.db(0)) {
            this.a = tfdVar.c();
            fE(0);
        }
        if (tfdVar.db(1)) {
            this.b = tfdVar.e();
            fE(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tfb)) {
            return false;
        }
        tfb tfbVar = (tfb) obj;
        if (super.aC(tfbVar.cJ) && Objects.equals(this.a, tfbVar.a) && Objects.equals(this.b, tfbVar.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "received_message_phone_numbers", agnc.j(new String[]{"rcs_message_id", "self_msisdn"}));
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
        return Objects.hash(adayVar, this.a, this.b, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "received_message_phone_numbers";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {new tbv((aglz) this, 3).get(), this.b};
        sb.append('(');
        for (int i = 0; i < 2; i++) {
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
            return String.format(Locale.US, "%s", "ReceivedMessagePhoneNumbersTable -- REDACTED");
        }
        return a();
    }
}
