package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ros extends aglz implements agma {
    public long a;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public int l;
    public String m;
    public String q;
    public xxw r;
    public qwe b = null;
    public int n = -1;
    public int o = 0;
    public int p = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "BackupParticipantsTable [_id: %s,\n  my_identity_token_foreign_key: %s,\n  normalized_destination: %s,\n  send_destination: %s,\n  display_destination: %s,\n  first_name: %s,\n  full_name: %s,\n  is_self: %s,\n  blocked: %s,\n  participant_type: %s,\n  is_spam: %s,\n  is_spam_source: %s,\n  country_code: %s,\n  color_palette_index: %s,\n  color_type: %s,\n  extended_color: %s,\n  cms_id: %s,\n  cms_life_cycle: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        int intValue = rpb.b().intValue();
        contentValues.put("_id", Long.valueOf(this.a));
        if (intValue >= 110) {
            qwe qweVar = this.b;
            if (qweVar != null && !qweVar.equals(null)) {
                contentValues.put("my_identity_token_foreign_key", riw.n(this.b));
            } else {
                contentValues.putNull("my_identity_token_foreign_key");
            }
        }
        agnc.r(contentValues, "normalized_destination", this.c);
        agnc.r(contentValues, "send_destination", this.d);
        agnc.r(contentValues, "display_destination", this.e);
        agnc.r(contentValues, "first_name", this.f);
        agnc.r(contentValues, "full_name", this.g);
        contentValues.put("is_self", Boolean.valueOf(this.h));
        contentValues.put("blocked", Boolean.valueOf(this.i));
        contentValues.put("participant_type", Integer.valueOf(this.j));
        contentValues.put("is_spam", Boolean.valueOf(this.k));
        contentValues.put("is_spam_source", Integer.valueOf(this.l));
        agnc.r(contentValues, "country_code", this.m);
        contentValues.put("color_palette_index", Integer.valueOf(this.n));
        contentValues.put("color_type", Integer.valueOf(this.o));
        contentValues.put("extended_color", Integer.valueOf(this.p));
        agnc.r(contentValues, "cms_id", this.q);
        xxw xxwVar = this.r;
        if (xxwVar == null) {
            contentValues.putNull("cms_life_cycle");
        } else {
            contentValues.put("cms_life_cycle", Integer.valueOf(xxwVar.ordinal()));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        row rowVar = (row) agmqVar;
        aq();
        this.cJ = rowVar.dx();
        if (rowVar.db(0)) {
            this.a = rowVar.i();
            fE(0);
        }
        if (rowVar.db(1)) {
            this.b = rowVar.j();
            fE(1);
        }
        if (rowVar.db(2)) {
            this.c = rowVar.q();
            fE(2);
        }
        if (rowVar.db(3)) {
            this.d = rowVar.r();
            fE(3);
        }
        if (rowVar.db(4)) {
            this.e = rowVar.n();
            fE(4);
        }
        if (rowVar.db(5)) {
            this.f = rowVar.o();
            fE(5);
        }
        if (rowVar.db(6)) {
            this.g = rowVar.p();
            fE(6);
        }
        if (rowVar.db(7)) {
            this.h = rowVar.t();
            fE(7);
        }
        if (rowVar.db(8)) {
            this.i = rowVar.s();
            fE(8);
        }
        if (rowVar.db(9)) {
            this.j = rowVar.h();
            fE(9);
        }
        if (rowVar.db(10)) {
            this.k = rowVar.u();
            fE(10);
        }
        if (rowVar.db(11)) {
            this.l = rowVar.g();
            fE(11);
        }
        if (rowVar.db(12)) {
            this.m = rowVar.m();
            fE(12);
        }
        if (rowVar.db(13)) {
            this.n = rowVar.c();
            fE(13);
        }
        if (rowVar.db(14)) {
            this.o = rowVar.e();
            fE(14);
        }
        if (rowVar.db(15)) {
            this.p = rowVar.f();
            fE(15);
        }
        if (rowVar.db(16)) {
            this.q = rowVar.l();
            fE(16);
        }
        if (rowVar.db(17)) {
            this.r = rowVar.k();
            fE(17);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ros)) {
            return false;
        }
        ros rosVar = (ros) obj;
        if (super.aC(rosVar.cJ) && this.a == rosVar.a && Objects.equals(this.b, rosVar.b) && Objects.equals(this.c, rosVar.c) && Objects.equals(this.d, rosVar.d) && Objects.equals(this.e, rosVar.e) && Objects.equals(this.f, rosVar.f) && Objects.equals(this.g, rosVar.g) && this.h == rosVar.h && this.i == rosVar.i && this.j == rosVar.j && this.k == rosVar.k && this.l == rosVar.l && Objects.equals(this.m, rosVar.m) && this.n == rosVar.n && this.o == rosVar.o && this.p == rosVar.p && Objects.equals(this.q, rosVar.q) && this.r == rosVar.r) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "participants_backup", agnc.j(new String[]{"_id", "my_identity_token_foreign_key", "normalized_destination", "send_destination", "display_destination", "first_name", "full_name", "is_self", "blocked", "participant_type", "is_spam", "is_spam_source", "country_code", "color_palette_index", "color_type", "extended_color", "cms_id", "cms_life_cycle"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final int hashCode() {
        aday adayVar;
        int ordinal;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        Long valueOf = Long.valueOf(this.a);
        qwe qweVar = this.b;
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        Boolean valueOf2 = Boolean.valueOf(this.h);
        Boolean valueOf3 = Boolean.valueOf(this.i);
        Integer valueOf4 = Integer.valueOf(this.j);
        Boolean valueOf5 = Boolean.valueOf(this.k);
        Integer valueOf6 = Integer.valueOf(this.l);
        String str6 = this.m;
        Integer valueOf7 = Integer.valueOf(this.n);
        Integer valueOf8 = Integer.valueOf(this.o);
        Integer valueOf9 = Integer.valueOf(this.p);
        String str7 = this.q;
        xxw xxwVar = this.r;
        if (xxwVar == null) {
            ordinal = 0;
        } else {
            ordinal = xxwVar.ordinal();
        }
        return Objects.hash(adayVar, valueOf, qweVar, str, str2, str3, str4, str5, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, str6, valueOf7, valueOf8, valueOf9, str7, Integer.valueOf(ordinal), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "participants_backup";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Long valueOf2 = Long.valueOf(this.a);
        Object obj = new rnb((aglz) this, 6).get();
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        Integer valueOf3 = Integer.valueOf(this.h ? 1 : 0);
        Integer valueOf4 = Integer.valueOf(this.i ? 1 : 0);
        Integer valueOf5 = Integer.valueOf(this.j);
        Integer valueOf6 = Integer.valueOf(this.k ? 1 : 0);
        Integer valueOf7 = Integer.valueOf(this.l);
        String str6 = this.m;
        Integer valueOf8 = Integer.valueOf(this.n);
        Integer valueOf9 = Integer.valueOf(this.o);
        Integer valueOf10 = Integer.valueOf(this.p);
        String str7 = this.q;
        xxw xxwVar = this.r;
        if (xxwVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(xxwVar.ordinal());
        }
        Object[] objArr = {valueOf2, obj, str, str2, str3, str4, str5, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, str6, valueOf8, valueOf9, valueOf10, str7, valueOf};
        sb.append('(');
        for (int i = 0; i < 18; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str8 = (String) obj2;
                    if (str8.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str8));
                    }
                }
                list.add(obj2);
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
            return String.format(Locale.US, "%s", "BackupParticipantsTable -- REDACTED");
        }
        return a();
    }
}
