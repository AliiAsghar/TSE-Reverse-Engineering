package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tmp extends aglz implements agma {
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "StickersLocalizationTable [sticker_set_id: %s,\n  sticker_id: %s,\n  locale: %s,\n  display_name: %s,\n  sticker_local_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "sticker_set_id", this.a);
        agnc.r(contentValues, "sticker_id", this.b);
        agnc.r(contentValues, "locale", this.c);
        agnc.r(contentValues, "display_name", this.d);
        agnc.q(contentValues, "sticker_local_id", this.e);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tms tmsVar = (tms) agmqVar;
        aq();
        this.cJ = tmsVar.dx();
        if (tmsVar.db(0)) {
            this.a = tmsVar.h();
            fE(0);
        }
        if (tmsVar.db(1)) {
            this.b = tmsVar.g();
            fE(1);
        }
        if (tmsVar.db(2)) {
            this.c = tmsVar.f();
            fE(2);
        }
        if (tmsVar.db(3)) {
            this.d = tmsVar.e();
            fE(3);
        }
        if (tmsVar.db(4)) {
            this.e = tmsVar.c();
            fE(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tmp)) {
            return false;
        }
        tmp tmpVar = (tmp) obj;
        if (super.aC(tmpVar.cJ) && Objects.equals(this.a, tmpVar.a) && Objects.equals(this.b, tmpVar.b) && Objects.equals(this.c, tmpVar.c) && Objects.equals(this.d, tmpVar.d) && this.e == tmpVar.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "stickers_localization", agnc.j(new String[]{"sticker_set_id", "sticker_id", "locale", "display_name", "sticker_local_id"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, this.b, this.c, this.d, Long.valueOf(this.e), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "stickers_localization";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.a, this.b, this.c, this.d, Long.valueOf(this.e)};
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

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "StickersLocalizationTable -- REDACTED");
        }
        return a();
    }
}
