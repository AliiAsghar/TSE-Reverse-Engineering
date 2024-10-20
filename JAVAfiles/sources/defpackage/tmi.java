package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tmi extends aglz implements agma {
    public long a;
    public String b;
    public String e;
    public String f;
    public String g;
    public String j;
    public int c = -1;
    public int d = 4;
    public long h = -1;
    public int i = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "StickerSetsTable [_id: %s,\n  sticker_set_id: %s,\n  local_version: %s,\n  download_state: %s,\n  icon_uri: %s,\n  display_name: %s,\n  preview_image_uri: %s,\n  requested_timestamp: %s,\n  display_order: %s,\n  author: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "sticker_set_id", this.b);
        contentValues.put("local_version", Integer.valueOf(this.c));
        contentValues.put("download_state", Integer.valueOf(this.d));
        agnc.r(contentValues, "icon_uri", this.e);
        agnc.r(contentValues, "display_name", this.f);
        agnc.r(contentValues, "preview_image_uri", this.g);
        contentValues.put("requested_timestamp", Long.valueOf(this.h));
        contentValues.put("display_order", Integer.valueOf(this.i));
        agnc.r(contentValues, "author", this.j);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tml tmlVar = (tml) agmqVar;
        aq();
        this.cJ = tmlVar.dx();
        if (tmlVar.db(0)) {
            this.a = tmlVar.g();
            fE(0);
        }
        if (tmlVar.db(1)) {
            this.b = tmlVar.m();
            fE(1);
        }
        if (tmlVar.db(2)) {
            this.c = tmlVar.f();
            fE(2);
        }
        if (tmlVar.db(3)) {
            this.d = tmlVar.e();
            fE(3);
        }
        if (tmlVar.db(4)) {
            this.e = tmlVar.k();
            fE(4);
        }
        if (tmlVar.db(5)) {
            this.f = tmlVar.j();
            fE(5);
        }
        if (tmlVar.db(6)) {
            this.g = tmlVar.l();
            fE(6);
        }
        if (tmlVar.db(7)) {
            this.h = tmlVar.h();
            fE(7);
        }
        if (tmlVar.db(8)) {
            this.i = tmlVar.c();
            fE(8);
        }
        if (tmlVar.db(9)) {
            this.j = tmlVar.i();
            fE(9);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tmi)) {
            return false;
        }
        tmi tmiVar = (tmi) obj;
        if (super.aC(tmiVar.cJ) && this.a == tmiVar.a && Objects.equals(this.b, tmiVar.b) && this.c == tmiVar.c && this.d == tmiVar.d && Objects.equals(this.e, tmiVar.e) && Objects.equals(this.f, tmiVar.f) && Objects.equals(this.g, tmiVar.g) && this.h == tmiVar.h && this.i == tmiVar.i && Objects.equals(this.j, tmiVar.j)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "sticker_sets", agnc.j(new String[]{"sticker_set_id", "local_version", "download_state", "icon_uri", "display_name", "preview_image_uri", "requested_timestamp", "display_order", "author"}));
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
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f, this.g, Long.valueOf(this.h), Integer.valueOf(this.i), this.j, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "sticker_sets";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f, this.g, Long.valueOf(this.h), Integer.valueOf(this.i), this.j};
        sb.append('(');
        for (int i = 0; i < 9; i++) {
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
            return String.format(Locale.US, "%s", "StickerSetsTable -- REDACTED");
        }
        return a();
    }
}
