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
public final class tgs extends aglz implements agma {
    public String a;
    public String b;
    public String d;
    public byte[] f;
    public boolean c = false;
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
        return String.format(locale, "RemoteInstancesTable [_id: %s,\n  remote_instance_id: %s,\n  etouffee: %s,\n  tachyon_id: %s,\n  last_modified_timestamp: %s,\n  identity_key: %s,\n  updated_at_hash: %s,\n  guaranteed_fresh_as_of_timestamp: %s,\n  is_updated_at_hash_valid: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, "BLOB".concat(String.valueOf(str)), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        agnc.r(contentValues, "remote_instance_id", this.b);
        contentValues.put("etouffee", Boolean.valueOf(this.c));
        agnc.r(contentValues, "tachyon_id", this.d);
        if (intValue >= 35040) {
            Instant instant = this.e;
            if (instant == null) {
                contentValues.putNull("last_modified_timestamp");
            } else {
                contentValues.put("last_modified_timestamp", Long.valueOf(uzz.k(instant)));
            }
        }
        if (intValue >= 38010) {
            contentValues.put("identity_key", this.f);
        }
        if (intValue >= 39040) {
            contentValues.put("updated_at_hash", Long.valueOf(this.g));
        }
        if (intValue >= 40010) {
            Instant instant2 = this.h;
            if (instant2 == null) {
                contentValues.putNull("guaranteed_fresh_as_of_timestamp");
            } else {
                contentValues.put("guaranteed_fresh_as_of_timestamp", Long.valueOf(uzz.k(instant2)));
            }
        }
        if (intValue >= 40030) {
            contentValues.put("is_updated_at_hash_valid", Boolean.valueOf(this.i));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tgw tgwVar = (tgw) agmqVar;
        aq();
        this.cJ = tgwVar.dx();
        if (tgwVar.db(0)) {
            this.a = tgwVar.g();
            fE(0);
        }
        if (tgwVar.db(1)) {
            this.b = tgwVar.h();
            fE(1);
        }
        if (tgwVar.db(2)) {
            this.c = tgwVar.j();
            fE(2);
        }
        if (tgwVar.db(3)) {
            this.d = tgwVar.i();
            fE(3);
        }
        if (tgwVar.db(4)) {
            this.e = tgwVar.f();
            fE(4);
        }
        if (tgwVar.db(5)) {
            this.f = tgwVar.l();
            fE(5);
        }
        if (tgwVar.db(6)) {
            this.g = tgwVar.c();
            fE(6);
        }
        if (tgwVar.db(7)) {
            this.h = tgwVar.e();
            fE(7);
        }
        if (tgwVar.db(8)) {
            this.i = tgwVar.k();
            fE(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tgs)) {
            return false;
        }
        tgs tgsVar = (tgs) obj;
        if (super.aC(tgsVar.cJ) && Objects.equals(this.a, tgsVar.a) && Objects.equals(this.b, tgsVar.b) && this.c == tgsVar.c && Objects.equals(this.d, tgsVar.d) && Objects.equals(this.e, tgsVar.e) && Arrays.equals(this.f, tgsVar.f) && this.g == tgsVar.g && Objects.equals(this.h, tgsVar.h) && this.i == tgsVar.i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "remote_instances", agnc.j(new String[]{"remote_instance_id", "etouffee", "tachyon_id", "last_modified_timestamp", "identity_key", "updated_at_hash", "guaranteed_fresh_as_of_timestamp", "is_updated_at_hash_valid"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, this.b, Boolean.valueOf(this.c), this.d, this.e, Integer.valueOf(Arrays.hashCode(this.f)), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "remote_instances";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.b, Integer.valueOf(this.c ? 1 : 0), this.d, Long.valueOf(uzz.k(this.e)), this.f, Long.valueOf(this.g), Long.valueOf(uzz.k(this.h)), Integer.valueOf(this.i ? 1 : 0)};
        sb.append('(');
        for (int i = 0; i < 8; i++) {
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
            return String.format(Locale.US, "%s", "RemoteInstancesTable -- REDACTED");
        }
        return a();
    }
}
