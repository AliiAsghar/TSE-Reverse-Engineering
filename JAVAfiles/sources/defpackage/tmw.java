package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tmw extends aglz implements agma {
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "StickersTable [_id: %s,\n  sticker_set_id: %s,\n  sticker_id: %s,\n  icon_uri_static: %s,\n  icon_uri_animated: %s,\n  display_name: %s,\n  display_order: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "sticker_set_id", this.b);
        agnc.r(contentValues, "sticker_id", this.c);
        agnc.r(contentValues, "icon_uri_static", this.d);
        agnc.r(contentValues, "icon_uri_animated", this.e);
        agnc.r(contentValues, "display_name", this.f);
        contentValues.put("display_order", Integer.valueOf(this.g));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tmz tmzVar = (tmz) agmqVar;
        aq();
        this.cJ = tmzVar.dx();
        if (tmzVar.db(0)) {
            this.a = tmzVar.e();
            fE(0);
        }
        if (tmzVar.db(1)) {
            this.b = tmzVar.j();
            fE(1);
        }
        if (tmzVar.db(2)) {
            this.c = tmzVar.i();
            fE(2);
        }
        if (tmzVar.db(3)) {
            this.d = tmzVar.h();
            fE(3);
        }
        if (tmzVar.db(4)) {
            this.e = tmzVar.g();
            fE(4);
        }
        if (tmzVar.db(5)) {
            this.f = tmzVar.f();
            fE(5);
        }
        if (tmzVar.db(6)) {
            this.g = tmzVar.c();
            fE(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tmw)) {
            return false;
        }
        tmw tmwVar = (tmw) obj;
        if (super.aC(tmwVar.cJ) && this.a == tmwVar.a && Objects.equals(this.b, tmwVar.b) && Objects.equals(this.c, tmwVar.c) && Objects.equals(this.d, tmwVar.d) && Objects.equals(this.e, tmwVar.e) && Objects.equals(this.f, tmwVar.f) && this.g == tmwVar.g) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "stickers", agnc.j(new String[]{"sticker_set_id", "sticker_id", "icon_uri_static", "icon_uri_animated", "display_name", "display_order"}));
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
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, Integer.valueOf(this.g), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "stickers";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.b, this.c, this.d, this.e, this.f, Integer.valueOf(this.g)};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
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
            return String.format(Locale.US, "%s", "StickersTable -- REDACTED");
        }
        return a();
    }
}
