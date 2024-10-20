package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tfh extends aglz implements agma {
    public String a;
    public Uri b;
    public String c;
    public int d;
    public int e;
    public long f;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "RecentExpressiveStickersTable [name: %s,\n  content_uri: %s,\n  content_type: %s,\n  width: %s,\n  height: %s,\n  last_used_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "name", this.a);
        Uri uri = this.b;
        if (uri == null) {
            contentValues.putNull("content_uri");
        } else {
            contentValues.put("content_uri", uri.toString());
        }
        agnc.r(contentValues, "content_type", this.c);
        contentValues.put("width", Integer.valueOf(this.d));
        contentValues.put("height", Integer.valueOf(this.e));
        contentValues.put("last_used_timestamp", Long.valueOf(this.f));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tfk tfkVar = (tfk) agmqVar;
        aq();
        this.cJ = tfkVar.dx();
        if (tfkVar.db(0)) {
            this.a = tfkVar.i();
            fE(0);
        }
        if (tfkVar.db(1)) {
            this.b = tfkVar.g();
            fE(1);
        }
        if (tfkVar.db(2)) {
            this.c = tfkVar.h();
            fE(2);
        }
        if (tfkVar.db(3)) {
            this.d = tfkVar.e();
            fE(3);
        }
        if (tfkVar.db(4)) {
            this.e = tfkVar.c();
            fE(4);
        }
        if (tfkVar.db(5)) {
            this.f = tfkVar.f();
            fE(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tfh)) {
            return false;
        }
        tfh tfhVar = (tfh) obj;
        if (super.aC(tfhVar.cJ) && Objects.equals(this.a, tfhVar.a) && Objects.equals(this.b, tfhVar.b) && Objects.equals(this.c, tfhVar.c) && this.d == tfhVar.d && this.e == tfhVar.e && this.f == tfhVar.f) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "recent_expressive_stickers", agnc.j(new String[]{"name", "content_uri", "content_type", "width", "height", "last_used_timestamp"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final Uri h() {
        ao(1, "content_uri");
        return this.b;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), Long.valueOf(this.f), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "recent_expressive_stickers";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        String uri;
        String str = this.a;
        Uri uri2 = this.b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        Object[] objArr = {str, uri, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), Long.valueOf(this.f)};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
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
        ao(0, "name");
        return this.a;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "RecentExpressiveStickersTable -- REDACTED");
        }
        return a();
    }
}
