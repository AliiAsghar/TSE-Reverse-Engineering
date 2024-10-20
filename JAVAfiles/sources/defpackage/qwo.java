package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qwo extends aglz implements agma {
    public int a;
    public String b;
    public String c;
    public qwe d = null;
    public qwe e = null;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "SubscriptionsTable [sub_id: %s,\n  sim_serial_number: %s,\n  telephony_phone_number: %s,\n  my_identity_token: %s,\n  my_identity_token_with_foreign_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        contentValues.put("sub_id", Integer.valueOf(this.a));
        agnc.r(contentValues, "sim_serial_number", this.b);
        agnc.r(contentValues, "telephony_phone_number", this.c);
        if (intValue >= 59450) {
            qwe qweVar = this.d;
            if (qweVar == null) {
                contentValues.putNull("my_identity_token");
            } else {
                contentValues.put("my_identity_token", riw.n(qweVar));
            }
        }
        if (intValue >= 60160) {
            qwe qweVar2 = this.e;
            if (qweVar2 != null && !qweVar2.equals(null)) {
                contentValues.put("my_identity_token_with_foreign_key", riw.n(this.e));
            } else {
                contentValues.putNull("my_identity_token_with_foreign_key");
            }
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        qwr qwrVar = (qwr) agmqVar;
        aq();
        this.cJ = qwrVar.dx();
        if (qwrVar.db(0)) {
            this.a = qwrVar.c();
            fE(0);
        }
        if (qwrVar.db(1)) {
            this.b = qwrVar.g();
            fE(1);
        }
        if (qwrVar.db(2)) {
            this.c = qwrVar.h();
            fE(2);
        }
        if (qwrVar.db(3)) {
            this.d = qwrVar.e();
            fE(3);
        }
        if (qwrVar.db(4)) {
            this.e = qwrVar.f();
            fE(4);
        }
    }

    public final int d() {
        ao(0, "sub_id");
        return this.a;
    }

    public final qwe e() {
        ao(3, "my_identity_token");
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qwo)) {
            return false;
        }
        qwo qwoVar = (qwo) obj;
        if (super.aC(qwoVar.cJ) && this.a == qwoVar.a && Objects.equals(this.b, qwoVar.b) && Objects.equals(this.c, qwoVar.c) && Objects.equals(this.d, qwoVar.d) && Objects.equals(this.e, qwoVar.e)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "subscriptions", agnc.j(new String[]{"sub_id", "sim_serial_number", "telephony_phone_number", "my_identity_token", "my_identity_token_with_foreign_key"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final String h() {
        ao(2, "telephony_phone_number");
        return this.c;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, Integer.valueOf(this.a), this.b, this.c, this.d, this.e, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "subscriptions";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {Integer.valueOf(this.a), this.b, this.c, riw.n(this.d), new qwn((aglz) this, 0).get()};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
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

    public final boolean k(Function function) {
        Object apply;
        agnw d;
        apply = function.apply(new qwv());
        agpw agpwVar = new agpw((qwv) apply);
        d = agnc.d("$primary");
        return ((Boolean) d.r(new raa(this, agpwVar, d, 1))).booleanValue();
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "SubscriptionsTable -- REDACTED");
        }
        return a();
    }
}
