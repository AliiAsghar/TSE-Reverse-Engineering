package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.time.Instant;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ptp extends aglz implements agma {
    public String a;
    public Instant b = Instant.EPOCH;
    public ptz c;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "RcsRemoteCapabilitiesCacheTable [msisdn: %s,\n  last_refresh_timestamp: %s,\n  rcs_capabilities: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "msisdn", this.a);
        Instant instant = this.b;
        if (instant == null) {
            contentValues.putNull("last_refresh_timestamp");
        } else {
            contentValues.put("last_refresh_timestamp", Long.valueOf(uzz.k(instant)));
        }
        ptz ptzVar = this.c;
        if (ptzVar == null) {
            contentValues.putNull("rcs_capabilities");
        } else {
            contentValues.put("rcs_capabilities", ptzVar.toByteArray());
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        ptr ptrVar = (ptr) agmqVar;
        aq();
        this.cJ = ptrVar.dx();
        if (ptrVar.db(0)) {
            this.a = ptrVar.f();
            fE(0);
        }
        if (ptrVar.db(1)) {
            this.b = ptrVar.e();
            fE(1);
        }
        if (ptrVar.db(2)) {
            this.c = ptrVar.c();
            fE(2);
        }
    }

    public final ptz d() {
        ao(2, "rcs_capabilities");
        return this.c;
    }

    public final Instant e() {
        ao(1, "last_refresh_timestamp");
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ptp)) {
            return false;
        }
        ptp ptpVar = (ptp) obj;
        if (super.aC(ptpVar.cJ) && Objects.equals(this.a, ptpVar.a) && Objects.equals(this.b, ptpVar.b) && Objects.equals(this.c, ptpVar.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "rcs_remote_capabilities_cache", agnc.j(new String[]{"msisdn", "last_refresh_timestamp", "rcs_capabilities"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final String h() {
        ao(0, "msisdn");
        return this.a;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, this.b, this.c, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "rcs_remote_capabilities_cache";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        byte[] byteArray;
        String str = this.a;
        Long valueOf = Long.valueOf(uzz.k(this.b));
        ptz ptzVar = this.c;
        if (ptzVar == null) {
            byteArray = null;
        } else {
            byteArray = ptzVar.toByteArray();
        }
        Object[] objArr = {str, valueOf, byteArray};
        sb.append('(');
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
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
            return String.format(Locale.US, "%s", "RcsRemoteCapabilitiesCacheTable -- REDACTED");
        }
        return a();
    }
}
