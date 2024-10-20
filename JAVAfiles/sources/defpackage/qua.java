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
public final class qua extends aglz implements agma {
    public qtz b;
    public String c;
    public String d;
    public String e;
    public byte[] g;
    public qss a = null;
    public qtn f = qtn.a;
    public vtm h = new vtm(0);
    public Instant i = uzz.l(0);

    @Override // defpackage.aglz
    public final String a() {
        String str;
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        byte[] bArr = this.g;
        if (bArr != null) {
            str = String.valueOf(bArr.length);
        } else {
            str = "NULL";
        }
        return String.format(locale, "GroupsTable [token: %s,\n  group_type: %s,\n  rcs_conference_uri: %s,\n  name: %s,\n  rcs_icon_url: %s,\n  rcs_group_state: %s,\n  tachygram_group_routing_token: %s,\n  rcs_group_capabilities: %s,\n  rcs_group_last_sync_timestamp: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, "BLOB".concat(String.valueOf(str)), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        qss qssVar = this.a;
        if (qssVar != null && !qssVar.equals(null)) {
            contentValues.put("token", qta.e(this.a));
        } else {
            contentValues.putNull("token");
        }
        qtz qtzVar = this.b;
        if (qtzVar == null) {
            contentValues.putNull("group_type");
        } else {
            contentValues.put("group_type", Integer.valueOf(qtzVar.ordinal()));
        }
        agnc.r(contentValues, "rcs_conference_uri", this.c);
        agnc.r(contentValues, "name", this.d);
        agnc.r(contentValues, "rcs_icon_url", this.e);
        qtn qtnVar = this.f;
        if (qtnVar == null) {
            contentValues.putNull("rcs_group_state");
        } else {
            contentValues.put("rcs_group_state", Integer.valueOf(qtnVar.ordinal()));
        }
        contentValues.put("tachygram_group_routing_token", this.g);
        vtm vtmVar = this.h;
        if (vtmVar == null) {
            contentValues.putNull("rcs_group_capabilities");
        } else {
            contentValues.put("rcs_group_capabilities", Long.valueOf(vtmVar.a));
        }
        Instant instant = this.i;
        if (instant == null) {
            contentValues.putNull("rcs_group_last_sync_timestamp");
        } else {
            contentValues.put("rcs_group_last_sync_timestamp", Long.valueOf(uzz.k(instant)));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        qud qudVar = (qud) agmqVar;
        aq();
        this.cJ = qudVar.dx();
        if (qudVar.db(0)) {
            this.a = qudVar.c();
            fE(0);
        }
        if (qudVar.db(1)) {
            this.b = qudVar.f();
            fE(1);
        }
        if (qudVar.db(2)) {
            this.c = qudVar.j();
            fE(2);
        }
        if (qudVar.db(3)) {
            this.d = qudVar.i();
            fE(3);
        }
        if (qudVar.db(4)) {
            this.e = qudVar.k();
            fE(4);
        }
        if (qudVar.db(5)) {
            this.f = qudVar.e();
            fE(5);
        }
        if (qudVar.db(6)) {
            this.g = qudVar.l();
            fE(6);
        }
        if (qudVar.db(7)) {
            this.h = qudVar.g();
            fE(7);
        }
        if (qudVar.db(8)) {
            this.i = qudVar.h();
            fE(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qua)) {
            return false;
        }
        qua quaVar = (qua) obj;
        if (super.aC(quaVar.cJ) && Objects.equals(this.a, quaVar.a) && this.b == quaVar.b && Objects.equals(this.c, quaVar.c) && Objects.equals(this.d, quaVar.d) && Objects.equals(this.e, quaVar.e) && this.f == quaVar.f && Arrays.equals(this.g, quaVar.g) && Objects.equals(this.h, quaVar.h) && Objects.equals(this.i, quaVar.i)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "groups", agnc.j(new String[]{"token", "group_type", "rcs_conference_uri", "name", "rcs_icon_url", "rcs_group_state", "tachygram_group_routing_token", "rcs_group_capabilities", "rcs_group_last_sync_timestamp"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final int hashCode() {
        aday adayVar;
        int ordinal;
        int ordinal2;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        qss qssVar = this.a;
        qtz qtzVar = this.b;
        if (qtzVar == null) {
            ordinal = 0;
        } else {
            ordinal = qtzVar.ordinal();
        }
        Integer valueOf = Integer.valueOf(ordinal);
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        qtn qtnVar = this.f;
        if (qtnVar == null) {
            ordinal2 = 0;
        } else {
            ordinal2 = qtnVar.ordinal();
        }
        return Objects.hash(adayVar, qssVar, valueOf, str, str2, str3, Integer.valueOf(ordinal2), Integer.valueOf(Arrays.hashCode(this.g)), this.h, this.i, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "groups";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Object obj = new qwn((aglz) this, 1).get();
        qtz qtzVar = this.b;
        Object obj2 = 0;
        if (qtzVar == null) {
            valueOf = obj2;
        } else {
            valueOf = String.valueOf(qtzVar.ordinal());
        }
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        qtn qtnVar = this.f;
        if (qtnVar != null) {
            obj2 = String.valueOf(qtnVar.ordinal());
        }
        Object[] objArr = {obj, valueOf, str, str2, str3, obj2, this.g, Long.valueOf(this.h.a), Long.valueOf(uzz.k(this.i))};
        sb.append('(');
        for (int i = 0; i < 9; i++) {
            Object obj3 = objArr[i];
            if (obj3 instanceof Number) {
                sb.append(String.valueOf(obj3));
            } else {
                if (obj3 instanceof String) {
                    String str4 = (String) obj3;
                    if (str4.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str4));
                    }
                }
                list.add(obj3);
                sb.append('?');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "GroupsTable -- REDACTED");
        }
        return a();
    }
}
