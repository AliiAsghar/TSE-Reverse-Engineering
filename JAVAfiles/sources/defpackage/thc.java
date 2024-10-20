package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class thc extends aglz implements agma {
    public String a;
    public byte[] f;
    public boolean b = false;
    public boolean c = false;
    public rvd d = new rvd(0);
    public Instant e = uzz.l(0);
    public long g = 0;
    public Instant h = uzz.l(0);
    public boolean i = false;

    @Override // defpackage.aglz
    public final String a() {
        String str;
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        byte[] bArr = this.f;
        if (bArr != null) {
            str = String.valueOf(bArr.length);
        } else {
            str = "NULL";
        }
        return String.format(locale, "RemoteRegistrationsTable [tachyon_registration_id: %s,\n  etouffee: %s,\n  better_etouffee: %s,\n  messages_feature_hash: %s,\n  last_modified_timestamp: %s,\n  identity_key: %s,\n  updated_at_hash: %s,\n  guaranteed_fresh_as_of_timestamp: %s,\n  is_updated_at_hash_valid: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, "BLOB".concat(String.valueOf(str)), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        agnc.r(contentValues, "tachyon_registration_id", this.a);
        contentValues.put("etouffee", Boolean.valueOf(this.b));
        if (intValue >= 46000) {
            contentValues.put("better_etouffee", Boolean.valueOf(this.c));
        }
        if (intValue >= 58800) {
            rvd rvdVar = this.d;
            if (rvdVar == null) {
                contentValues.putNull("messages_feature_hash");
            } else {
                contentValues.put("messages_feature_hash", Long.valueOf(rvdVar.a));
            }
        }
        Instant instant = this.e;
        if (instant == null) {
            contentValues.putNull("last_modified_timestamp");
        } else {
            contentValues.put("last_modified_timestamp", Long.valueOf(uzz.k(instant)));
        }
        contentValues.put("identity_key", this.f);
        contentValues.put("updated_at_hash", Long.valueOf(this.g));
        Instant instant2 = this.h;
        if (instant2 == null) {
            contentValues.putNull("guaranteed_fresh_as_of_timestamp");
        } else {
            contentValues.put("guaranteed_fresh_as_of_timestamp", Long.valueOf(uzz.k(instant2)));
        }
        contentValues.put("is_updated_at_hash_valid", Boolean.valueOf(this.i));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        thf thfVar = (thf) agmqVar;
        aq();
        this.cJ = thfVar.dx();
        if (thfVar.db(0)) {
            this.a = thfVar.h();
            fE(0);
        }
        if (thfVar.db(1)) {
            this.b = thfVar.i();
            fE(1);
        }
        if (thfVar.db(2)) {
            this.c = thfVar.j();
            fE(2);
        }
        if (thfVar.db(3)) {
            this.d = thfVar.e();
            fE(3);
        }
        if (thfVar.db(4)) {
            this.e = thfVar.g();
            fE(4);
        }
        if (thfVar.db(5)) {
            this.f = thfVar.l();
            fE(5);
        }
        if (thfVar.db(6)) {
            this.g = thfVar.c();
            fE(6);
        }
        if (thfVar.db(7)) {
            this.h = thfVar.f();
            fE(7);
        }
        if (thfVar.db(8)) {
            this.i = thfVar.k();
            fE(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof thc)) {
            return false;
        }
        thc thcVar = (thc) obj;
        if (super.aC(thcVar.cJ) && Objects.equals(this.a, thcVar.a) && this.b == thcVar.b && this.c == thcVar.c && Objects.equals(this.d, thcVar.d) && Objects.equals(this.e, thcVar.e) && Arrays.equals(this.f, thcVar.f) && this.g == thcVar.g && Objects.equals(this.h, thcVar.h) && this.i == thcVar.i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "remote_registrations_table", agnc.j(new String[]{"tachyon_registration_id", "etouffee", "better_etouffee", "messages_feature_hash", "last_modified_timestamp", "identity_key", "updated_at_hash", "guaranteed_fresh_as_of_timestamp", "is_updated_at_hash_valid"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final Instant h() {
        ao(7, "guaranteed_fresh_as_of_timestamp");
        return this.h;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, this.e, Integer.valueOf(Arrays.hashCode(this.f)), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "remote_registrations_table";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.a, Integer.valueOf(this.b ? 1 : 0), Integer.valueOf(this.c ? 1 : 0), Long.valueOf(this.d.a), Long.valueOf(uzz.k(this.e)), this.f, Long.valueOf(this.g), Long.valueOf(uzz.k(this.h)), Integer.valueOf(this.i ? 1 : 0)};
        sb.append('(');
        for (int i = 0; i < 9; i++) {
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

    public final Instant k() {
        ao(4, "last_modified_timestamp");
        return this.e;
    }

    public final String l() {
        ao(0, "tachyon_registration_id");
        return this.a;
    }

    public final boolean m() {
        ao(1, "etouffee");
        return this.b;
    }

    public final boolean n() {
        ao(2, "better_etouffee");
        return this.c;
    }

    public final byte[] o() {
        ao(5, "identity_key");
        return this.f;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "RemoteRegistrationsTable -- REDACTED");
        }
        return a();
    }
}
