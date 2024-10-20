package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import defpackage.aglz;
import j$.time.Instant;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sjd extends aglz<sjh, sjj, sjk, sjd, sjf> implements agma<Long> {
    public long a;
    public long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public Uri h;
    public Uri i;
    public String j;
    public String k;
    public Instant l = Instant.EPOCH;
    public String m;
    public String n;
    public long o;
    public long p;
    public String q;
    public String r;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ContactsTable [cp2_id: %s,\n  contact_id: %s,\n  lookup_key: %s,\n  phone_number: %s,\n  display_name: %s,\n  given_name: %s,\n  family_name: %s,\n  photo: %s,\n  thumbnail: %s,\n  birthday: %s,\n  anniversary: %s,\n  last_updated_timestamp: %s,\n  sort_key: %s,\n  phonebook_label: %s,\n  phonebook_bucket: %s,\n  contact_type: %s,\n  type_label: %s,\n  display_destination: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        agnc.q(contentValues, "cp2_id", this.a);
        contentValues.put("contact_id", Long.valueOf(this.b));
        agnc.r(contentValues, "lookup_key", this.c);
        agnc.r(contentValues, "phone_number", this.d);
        agnc.r(contentValues, "display_name", this.e);
        agnc.r(contentValues, "given_name", this.f);
        agnc.r(contentValues, "family_name", this.g);
        Uri uri = this.h;
        if (uri == null) {
            contentValues.putNull("photo");
        } else {
            contentValues.put("photo", uri.toString());
        }
        Uri uri2 = this.i;
        if (uri2 == null) {
            contentValues.putNull("thumbnail");
        } else {
            contentValues.put("thumbnail", uri2.toString());
        }
        agnc.r(contentValues, "birthday", this.j);
        agnc.r(contentValues, "anniversary", this.k);
        Instant instant = this.l;
        if (instant == null) {
            contentValues.putNull("last_updated_timestamp");
        } else {
            contentValues.put("last_updated_timestamp", Long.valueOf(uzz.k(instant)));
        }
        if (intValue >= 59070) {
            agnc.r(contentValues, "sort_key", this.m);
        }
        if (intValue >= 59070) {
            agnc.r(contentValues, "phonebook_label", this.n);
        }
        if (intValue >= 59070) {
            contentValues.put("phonebook_bucket", Long.valueOf(this.o));
        }
        if (intValue >= 59080) {
            contentValues.put("contact_type", Long.valueOf(this.p));
        }
        if (intValue >= 60150) {
            agnc.r(contentValues, "type_label", this.q);
        }
        if (intValue >= 59120) {
            agnc.r(contentValues, "display_destination", this.r);
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sjh sjhVar = (sjh) agmqVar;
        aq();
        this.cJ = sjhVar.dx();
        if (sjhVar.db(0)) {
            this.a = sjhVar.f();
            fE(0);
        }
        if (sjhVar.db(1)) {
            this.b = sjhVar.c();
            fE(1);
        }
        if (sjhVar.db(2)) {
            this.c = sjhVar.q();
            fE(2);
        }
        if (sjhVar.db(3)) {
            this.d = sjhVar.r();
            fE(3);
        }
        if (sjhVar.db(4)) {
            this.e = sjhVar.n();
            fE(4);
        }
        if (sjhVar.db(5)) {
            this.f = sjhVar.p();
            fE(5);
        }
        if (sjhVar.db(6)) {
            this.g = sjhVar.o();
            fE(6);
        }
        if (sjhVar.db(7)) {
            this.h = sjhVar.h();
            fE(7);
        }
        if (sjhVar.db(8)) {
            this.i = sjhVar.i();
            fE(8);
        }
        if (sjhVar.db(9)) {
            this.j = sjhVar.l();
            fE(9);
        }
        if (sjhVar.db(10)) {
            this.k = sjhVar.k();
            fE(10);
        }
        if (sjhVar.db(11)) {
            this.l = sjhVar.j();
            fE(11);
        }
        if (sjhVar.db(12)) {
            this.m = sjhVar.t();
            fE(12);
        }
        if (sjhVar.db(13)) {
            this.n = sjhVar.s();
            fE(13);
        }
        if (sjhVar.db(14)) {
            this.o = sjhVar.g();
            fE(14);
        }
        if (sjhVar.db(15)) {
            this.p = sjhVar.e();
            fE(15);
        }
        if (sjhVar.db(16)) {
            this.q = sjhVar.u();
            fE(16);
        }
        if (sjhVar.db(17)) {
            this.r = sjhVar.m();
            fE(17);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sjd)) {
            return false;
        }
        sjd sjdVar = (sjd) obj;
        if (super.aC(sjdVar.cJ) && this.a == sjdVar.a && this.b == sjdVar.b && Objects.equals(this.c, sjdVar.c) && Objects.equals(this.d, sjdVar.d) && Objects.equals(this.e, sjdVar.e) && Objects.equals(this.f, sjdVar.f) && Objects.equals(this.g, sjdVar.g) && Objects.equals(this.h, sjdVar.h) && Objects.equals(this.i, sjdVar.i) && Objects.equals(this.j, sjdVar.j) && Objects.equals(this.k, sjdVar.k) && Objects.equals(this.l, sjdVar.l) && Objects.equals(this.m, sjdVar.m) && Objects.equals(this.n, sjdVar.n) && this.o == sjdVar.o && this.p == sjdVar.p && Objects.equals(this.q, sjdVar.q) && Objects.equals(this.r, sjdVar.r)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "contacts", agnc.j(new String[]{"cp2_id", "contact_id", "lookup_key", "phone_number", "display_name", "given_name", "family_name", "photo", "thumbnail", "birthday", "anniversary", "last_updated_timestamp", "sort_key", "phonebook_label", "phonebook_bucket", "contact_type", "type_label", "display_destination"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final Uri h() {
        ao(7, "photo");
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
        return Objects.hash(adayVar, Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, Long.valueOf(this.o), Long.valueOf(this.p), this.q, this.r, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "contacts";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        String uri;
        Long valueOf = Long.valueOf(this.a);
        Long valueOf2 = Long.valueOf(this.b);
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        Uri uri2 = this.h;
        String str6 = null;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        Uri uri3 = this.i;
        if (uri3 != null) {
            str6 = uri3.toString();
        }
        Object[] objArr = {valueOf, valueOf2, str, str2, str3, str4, str5, uri, str6, this.j, this.k, Long.valueOf(uzz.k(this.l)), this.m, this.n, Long.valueOf(this.o), Long.valueOf(this.p), this.q, this.r};
        sb.append('(');
        for (int i = 0; i < 18; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str7 = (String) obj;
                    if (str7.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str7));
                    }
                }
                list.add(obj);
                sb.append('?');
                sb.append(',');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ContactsTable -- REDACTED");
        }
        return a();
    }
}
