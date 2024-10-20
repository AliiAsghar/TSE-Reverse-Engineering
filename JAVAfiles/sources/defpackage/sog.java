package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sog extends aglz implements agma {
    public long a;
    public String b;
    public byte[] h;
    public byte[] l;
    public byte[] m;
    public tqt n;
    public byte[] t;
    public String u;
    public long c = 0;
    public long d = 0;
    public long e = 0;
    public String f = "";
    public boolean g = false;
    public String i = "";
    public String j = "";
    public int k = 0;
    public boolean o = false;
    public String p = "";
    public boolean q = false;
    public tqe r = tqe.WEB;
    public tqm s = tqm.ANONYMOUS;
    public long v = 0;

    @Override // defpackage.aglz
    public final String a() {
        String str;
        String str2;
        String str3;
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        byte[] bArr = this.h;
        if (bArr == null) {
            str = "NULL";
        } else {
            str = String.valueOf(bArr.length);
        }
        String concat = "BLOB".concat(String.valueOf(str));
        String valueOf8 = String.valueOf(this.i);
        String valueOf9 = String.valueOf(this.j);
        String valueOf10 = String.valueOf(this.k);
        byte[] bArr2 = this.l;
        if (bArr2 == null) {
            str2 = "NULL";
        } else {
            str2 = String.valueOf(bArr2.length);
        }
        String concat2 = "BLOB".concat(String.valueOf(str2));
        String str4 = "NULL";
        byte[] bArr3 = this.m;
        if (bArr3 != null) {
            str3 = String.valueOf(bArr3.length);
        } else {
            str3 = str4;
        }
        String concat3 = "BLOB".concat(String.valueOf(str3));
        String valueOf11 = String.valueOf(this.n);
        String valueOf12 = String.valueOf(this.o);
        String valueOf13 = String.valueOf(this.p);
        String valueOf14 = String.valueOf(this.q);
        String valueOf15 = String.valueOf(this.r);
        String valueOf16 = String.valueOf(this.s);
        byte[] bArr4 = this.t;
        if (bArr4 != null) {
            str4 = String.valueOf(bArr4.length);
        }
        return String.format(locale, "DeskTopTable [_id: %s,\n  desktop_id: %s,\n  last_connection_time: %s,\n  last_wakeup_time: %s,\n  wakeup_attempts_count: %s,\n  fingerprint: %s,\n  force_refresh: %s,\n  client_info: %s,\n  operating_system: %s,\n  operating_system_version: %s,\n  browser_type: %s,\n  encryption_key: %s,\n  hmac_key: %s,\n  backend_type: %s,\n  is_active: %s,\n  request_id: %s,\n  is_persistent: %s,\n  desktop_type: %s,\n  pairing_type: %s,\n  destination_registration_id: %s,\n  gaia_email: %s,\n  creation_time: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, concat, valueOf8, valueOf9, valueOf10, concat2, concat3, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, "BLOB".concat(String.valueOf(str4)), "REDACTED", String.valueOf(this.v));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        agnc.r(contentValues, "desktop_id", this.b);
        contentValues.put("last_connection_time", Long.valueOf(this.c));
        contentValues.put("last_wakeup_time", Long.valueOf(this.d));
        contentValues.put("wakeup_attempts_count", Long.valueOf(this.e));
        agnc.r(contentValues, "fingerprint", this.f);
        contentValues.put("force_refresh", Boolean.valueOf(this.g));
        contentValues.put("client_info", this.h);
        if (intValue >= 22040) {
            agnc.r(contentValues, "operating_system", this.i);
        }
        if (intValue >= 22040) {
            agnc.r(contentValues, "operating_system_version", this.j);
        }
        if (intValue >= 18020) {
            contentValues.put("browser_type", Integer.valueOf(this.k));
        }
        if (intValue >= 21030) {
            contentValues.put("encryption_key", this.l);
        }
        if (intValue >= 21030) {
            contentValues.put("hmac_key", this.m);
        }
        if (intValue >= 41010) {
            tqt tqtVar = this.n;
            if (tqtVar == null) {
                contentValues.putNull("backend_type");
            } else {
                contentValues.put("backend_type", Integer.valueOf(tqtVar.ordinal()));
            }
        }
        if (intValue >= 58010) {
            contentValues.put("is_active", Boolean.valueOf(this.o));
        }
        if (intValue >= 58010) {
            agnc.r(contentValues, "request_id", this.p);
        }
        if (intValue >= 58010) {
            contentValues.put("is_persistent", Boolean.valueOf(this.q));
        }
        if (intValue >= 58010) {
            tqe tqeVar = this.r;
            if (tqeVar == null) {
                contentValues.putNull("desktop_type");
            } else {
                contentValues.put("desktop_type", Integer.valueOf(tqeVar.ordinal()));
            }
        }
        if (intValue >= 58960) {
            tqm tqmVar = this.s;
            if (tqmVar == null) {
                contentValues.putNull("pairing_type");
            } else {
                contentValues.put("pairing_type", Integer.valueOf(tqmVar.ordinal()));
            }
        }
        if (intValue >= 59290) {
            contentValues.put("destination_registration_id", this.t);
        }
        if (intValue >= 59560) {
            agnc.r(contentValues, "gaia_email", this.u);
        }
        if (intValue >= 59870) {
            contentValues.put("creation_time", Long.valueOf(this.v));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sol solVar = (sol) agmqVar;
        aq();
        this.cJ = solVar.dx();
        if (solVar.db(0)) {
            this.a = solVar.f();
            fE(0);
        }
        if (solVar.db(1)) {
            this.b = solVar.m();
            fE(1);
        }
        if (solVar.db(2)) {
            this.c = solVar.g();
            fE(2);
        }
        if (solVar.db(3)) {
            this.d = solVar.h();
            fE(3);
        }
        if (solVar.db(4)) {
            this.e = solVar.i();
            fE(4);
        }
        if (solVar.db(5)) {
            this.f = solVar.n();
            fE(5);
        }
        if (solVar.db(6)) {
            this.g = solVar.s();
            fE(6);
        }
        if (solVar.db(7)) {
            this.h = solVar.v();
            fE(7);
        }
        if (solVar.db(8)) {
            this.i = solVar.p();
            fE(8);
        }
        if (solVar.db(9)) {
            this.j = solVar.q();
            fE(9);
        }
        if (solVar.db(10)) {
            this.k = solVar.c();
            fE(10);
        }
        if (solVar.db(11)) {
            this.l = solVar.x();
            fE(11);
        }
        if (solVar.db(12)) {
            this.m = solVar.y();
            fE(12);
        }
        if (solVar.db(13)) {
            this.n = solVar.l();
            fE(13);
        }
        if (solVar.db(14)) {
            this.o = solVar.t();
            fE(14);
        }
        if (solVar.db(15)) {
            this.p = solVar.r();
            fE(15);
        }
        if (solVar.db(16)) {
            this.q = solVar.u();
            fE(16);
        }
        if (solVar.db(17)) {
            this.r = solVar.j();
            fE(17);
        }
        if (solVar.db(18)) {
            this.s = solVar.k();
            fE(18);
        }
        if (solVar.db(19)) {
            this.t = solVar.w();
            fE(19);
        }
        if (solVar.db(20)) {
            this.u = solVar.o();
            fE(20);
        }
        if (solVar.db(21)) {
            this.v = solVar.e();
            fE(21);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sog)) {
            return false;
        }
        sog sogVar = (sog) obj;
        if (super.aC(sogVar.cJ) && this.a == sogVar.a && Objects.equals(this.b, sogVar.b) && this.c == sogVar.c && this.d == sogVar.d && this.e == sogVar.e && Objects.equals(this.f, sogVar.f) && this.g == sogVar.g && Arrays.equals(this.h, sogVar.h) && Objects.equals(this.i, sogVar.i) && Objects.equals(this.j, sogVar.j) && this.k == sogVar.k && Arrays.equals(this.l, sogVar.l) && Arrays.equals(this.m, sogVar.m) && this.n == sogVar.n && this.o == sogVar.o && Objects.equals(this.p, sogVar.p) && this.q == sogVar.q && this.r == sogVar.r && this.s == sogVar.s && Arrays.equals(this.t, sogVar.t) && Objects.equals(this.u, sogVar.u) && this.v == sogVar.v) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "desktop", agnc.j(new String[]{"desktop_id", "last_connection_time", "last_wakeup_time", "wakeup_attempts_count", "fingerprint", "force_refresh", "client_info", "operating_system", "operating_system_version", "browser_type", "encryption_key", "hmac_key", "backend_type", "is_active", "request_id", "is_persistent", "desktop_type", "pairing_type", "destination_registration_id", "gaia_email", "creation_time"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final tqm h() {
        ao(18, "pairing_type");
        return this.s;
    }

    public final int hashCode() {
        aday adayVar;
        int ordinal;
        int ordinal2;
        int ordinal3;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        Long valueOf = Long.valueOf(this.a);
        String str = this.b;
        Long valueOf2 = Long.valueOf(this.c);
        Long valueOf3 = Long.valueOf(this.d);
        Long valueOf4 = Long.valueOf(this.e);
        String str2 = this.f;
        Boolean valueOf5 = Boolean.valueOf(this.g);
        Integer valueOf6 = Integer.valueOf(Arrays.hashCode(this.h));
        String str3 = this.i;
        String str4 = this.j;
        Integer valueOf7 = Integer.valueOf(this.k);
        Integer valueOf8 = Integer.valueOf(Arrays.hashCode(this.l));
        Integer valueOf9 = Integer.valueOf(Arrays.hashCode(this.m));
        tqt tqtVar = this.n;
        if (tqtVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqtVar.ordinal();
        }
        Integer valueOf10 = Integer.valueOf(ordinal);
        Boolean valueOf11 = Boolean.valueOf(this.o);
        String str5 = this.p;
        Boolean valueOf12 = Boolean.valueOf(this.q);
        tqe tqeVar = this.r;
        if (tqeVar == null) {
            ordinal2 = 0;
        } else {
            ordinal2 = tqeVar.ordinal();
        }
        Integer valueOf13 = Integer.valueOf(ordinal2);
        tqm tqmVar = this.s;
        if (tqmVar == null) {
            ordinal3 = 0;
        } else {
            ordinal3 = tqmVar.ordinal();
        }
        return Objects.hash(adayVar, valueOf, str, valueOf2, valueOf3, valueOf4, str2, valueOf5, valueOf6, str3, str4, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, str5, valueOf12, valueOf13, Integer.valueOf(ordinal3), Integer.valueOf(Arrays.hashCode(this.t)), this.u, Long.valueOf(this.v), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "desktop";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Object valueOf2;
        String str = this.b;
        Long valueOf3 = Long.valueOf(this.c);
        Long valueOf4 = Long.valueOf(this.d);
        Long valueOf5 = Long.valueOf(this.e);
        String str2 = this.f;
        Integer valueOf6 = Integer.valueOf(this.g ? 1 : 0);
        byte[] bArr = this.h;
        String str3 = this.i;
        String str4 = this.j;
        Integer valueOf7 = Integer.valueOf(this.k);
        byte[] bArr2 = this.l;
        byte[] bArr3 = this.m;
        tqt tqtVar = this.n;
        if (tqtVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(tqtVar.ordinal());
        }
        Integer valueOf8 = Integer.valueOf(this.o ? 1 : 0);
        String str5 = this.p;
        Integer valueOf9 = Integer.valueOf(this.q ? 1 : 0);
        tqe tqeVar = this.r;
        if (tqeVar == null) {
            valueOf2 = 0;
        } else {
            valueOf2 = String.valueOf(tqeVar.ordinal());
        }
        tqm tqmVar = this.s;
        Object obj = 0;
        if (tqmVar != null) {
            obj = String.valueOf(tqmVar.ordinal());
        }
        Object[] objArr = {str, valueOf3, valueOf4, valueOf5, str2, valueOf6, bArr, str3, str4, valueOf7, bArr2, bArr3, valueOf, valueOf8, str5, valueOf9, valueOf2, obj, this.t, this.u, Long.valueOf(this.v)};
        sb.append('(');
        for (int i = 0; i < 21; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str6 = (String) obj2;
                    if (str6.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str6));
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

    public final String k() {
        ao(1, "desktop_id");
        return this.b;
    }

    public final String l() {
        ao(20, "gaia_email");
        return this.u;
    }

    public final byte[] m() {
        ao(19, "destination_registration_id");
        return this.t;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "DeskTopTable -- REDACTED");
        }
        return a();
    }
}
