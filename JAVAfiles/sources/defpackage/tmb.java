package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tmb extends aglz implements agma {
    public String a;
    public String b;
    public String c;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "StickerSetsLocalizationTable [sticker_set_id: %s,\n  locale: %s,\n  display_name: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "sticker_set_id", this.a);
        agnc.r(contentValues, "locale", this.b);
        agnc.r(contentValues, "display_name", this.c);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tme tmeVar = (tme) agmqVar;
        aq();
        this.cJ = tmeVar.dx();
        if (tmeVar.db(0)) {
            this.a = tmeVar.f();
            fE(0);
        }
        if (tmeVar.db(1)) {
            this.b = tmeVar.e();
            fE(1);
        }
        if (tmeVar.db(2)) {
            this.c = tmeVar.c();
            fE(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tmb)) {
            return false;
        }
        tmb tmbVar = (tmb) obj;
        if (super.aC(tmbVar.cJ) && Objects.equals(this.a, tmbVar.a) && Objects.equals(this.b, tmbVar.b) && Objects.equals(this.c, tmbVar.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "sticker_sets_localization", agnc.j(new String[]{"sticker_set_id", "locale", "display_name"}));
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
        return Objects.hash(adayVar, this.a, this.b, this.c, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "sticker_sets_localization";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.a, this.b, this.c};
        sb.append('(');
        for (int i = 0; i < 3; i++) {
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
            return String.format(Locale.US, "%s", "StickerSetsLocalizationTable -- REDACTED");
        }
        return a();
    }
}
