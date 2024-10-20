package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tkh extends aglz implements agma {
    public String a;
    public String b;
    public String c;
    public int d;
    public int e;
    public String f;
    public int g = 0;
    public String h;
    public String i;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "SelfParticipantsTable [_id: %s,\n  phone_number: %s,\n  sim_serial_number: %s,\n  sim_slot_index: %s,\n  sub_id: %s,\n  subscription_name: %s,\n  subscription_color: %s,\n  participant_id: %s,\n  smsc: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        agnc.r(contentValues, "phone_number", this.b);
        agnc.r(contentValues, "sim_serial_number", this.c);
        contentValues.put("sim_slot_index", Integer.valueOf(this.d));
        contentValues.put("sub_id", Integer.valueOf(this.e));
        agnc.r(contentValues, "subscription_name", this.f);
        contentValues.put("subscription_color", Integer.valueOf(this.g));
        agnc.r(contentValues, "participant_id", this.h);
        if (intValue >= 29080) {
            agnc.r(contentValues, "smsc", this.i);
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tkl tklVar = (tkl) agmqVar;
        aq();
        this.cJ = tklVar.dx();
        if (tklVar.db(0)) {
            this.a = tklVar.g();
            fE(0);
        }
        if (tklVar.db(1)) {
            this.b = tklVar.i();
            fE(1);
        }
        if (tklVar.db(2)) {
            this.c = tklVar.j();
            fE(2);
        }
        if (tklVar.db(3)) {
            this.d = tklVar.c();
            fE(3);
        }
        if (tklVar.db(4)) {
            this.e = tklVar.e();
            fE(4);
        }
        if (tklVar.db(5)) {
            this.f = tklVar.l();
            fE(5);
        }
        if (tklVar.db(6)) {
            this.g = tklVar.f();
            fE(6);
        }
        if (tklVar.db(7)) {
            this.h = tklVar.h();
            fE(7);
        }
        if (tklVar.db(8)) {
            this.i = tklVar.k();
            fE(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tkh)) {
            return false;
        }
        tkh tkhVar = (tkh) obj;
        if (super.aC(tkhVar.cJ) && Objects.equals(this.a, tkhVar.a) && Objects.equals(this.b, tkhVar.b) && Objects.equals(this.c, tkhVar.c) && this.d == tkhVar.d && this.e == tkhVar.e && Objects.equals(this.f, tkhVar.f) && this.g == tkhVar.g && Objects.equals(this.h, tkhVar.h) && Objects.equals(this.i, tkhVar.i)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "self_participants", agnc.j(new String[]{"phone_number", "sim_serial_number", "sim_slot_index", "sub_id", "subscription_name", "subscription_color", "participant_id", "smsc"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final int h() {
        ao(4, "sub_id");
        return this.e;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, this.i, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "self_participants";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, this.i};
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

    public final String k() {
        ao(0, "_id");
        return this.a;
    }

    public final String l() {
        ao(2, "sim_serial_number");
        return this.c;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "SelfParticipantsTable -- REDACTED");
        }
        return a();
    }
}
