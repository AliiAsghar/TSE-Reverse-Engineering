package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tgc extends aglz implements agma {
    public long a;
    public String b;
    public long c = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "RecentStickersTable [_id: %s,\n  sticker_id: %s,\n  last_used_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "sticker_id", this.b);
        contentValues.put("last_used_timestamp", Long.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tgf tgfVar = (tgf) agmqVar;
        aq();
        this.cJ = tgfVar.dx();
        if (tgfVar.db(0)) {
            this.a = tgfVar.c();
            fE(0);
        }
        if (tgfVar.db(1)) {
            this.b = tgfVar.f();
            fE(1);
        }
        if (tgfVar.db(2)) {
            this.c = tgfVar.e();
            fE(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tgc)) {
            return false;
        }
        tgc tgcVar = (tgc) obj;
        if (super.aC(tgcVar.cJ) && this.a == tgcVar.a && Objects.equals(this.b, tgcVar.b) && this.c == tgcVar.c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "recent_stickers", agnc.j(new String[]{"sticker_id", "last_used_timestamp"}));
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
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, Long.valueOf(this.c), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "recent_stickers";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.b, Long.valueOf(this.c)};
        sb.append('(');
        for (int i = 0; i < 2; i++) {
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
            return String.format(Locale.US, "%s", "RecentStickersTable -- REDACTED");
        }
        return a();
    }
}
