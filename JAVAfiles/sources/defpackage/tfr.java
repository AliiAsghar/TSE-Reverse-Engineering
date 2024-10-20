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
public final class tfr extends aglz implements agma {
    public Uri a;
    public Uri b;
    public String c;
    public String d;
    public int e;
    public int f;
    public long g;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "RecentGifsTable [original_image_url: %s,\n  content_uri: %s,\n  domain: %s,\n  image_search_url: %s,\n  width: %s,\n  height: %s,\n  last_used_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Uri uri = this.a;
        if (uri == null) {
            contentValues.putNull("original_image_url");
        } else {
            contentValues.put("original_image_url", uri.toString());
        }
        Uri uri2 = this.b;
        if (uri2 == null) {
            contentValues.putNull("content_uri");
        } else {
            contentValues.put("content_uri", uri2.toString());
        }
        agnc.r(contentValues, "domain", this.c);
        agnc.r(contentValues, "image_search_url", this.d);
        contentValues.put("width", Integer.valueOf(this.e));
        contentValues.put("height", Integer.valueOf(this.f));
        contentValues.put("last_used_timestamp", Long.valueOf(this.g));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tfv tfvVar = (tfv) agmqVar;
        aq();
        this.cJ = tfvVar.dx();
        if (tfvVar.db(0)) {
            this.a = tfvVar.h();
            fE(0);
        }
        if (tfvVar.db(1)) {
            this.b = tfvVar.g();
            fE(1);
        }
        if (tfvVar.db(2)) {
            this.c = tfvVar.i();
            fE(2);
        }
        if (tfvVar.db(3)) {
            this.d = tfvVar.j();
            fE(3);
        }
        if (tfvVar.db(4)) {
            this.e = tfvVar.e();
            fE(4);
        }
        if (tfvVar.db(5)) {
            this.f = tfvVar.c();
            fE(5);
        }
        if (tfvVar.db(6)) {
            this.g = tfvVar.f();
            fE(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tfr)) {
            return false;
        }
        tfr tfrVar = (tfr) obj;
        if (super.aC(tfrVar.cJ) && Objects.equals(this.a, tfrVar.a) && Objects.equals(this.b, tfrVar.b) && Objects.equals(this.c, tfrVar.c) && Objects.equals(this.d, tfrVar.d) && this.e == tfrVar.e && this.f == tfrVar.f && this.g == tfrVar.g) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "recent_gifs", agnc.j(new String[]{"original_image_url", "content_uri", "domain", "image_search_url", "width", "height", "last_used_timestamp"}));
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
        return Objects.hash(adayVar, this.a, this.b, this.c, this.d, Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.g), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "recent_gifs";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        String uri;
        Uri uri2 = this.a;
        String str = null;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        Uri uri3 = this.b;
        if (uri3 != null) {
            str = uri3.toString();
        }
        Object[] objArr = {uri, str, this.c, this.d, Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.g)};
        sb.append('(');
        for (int i = 0; i < 7; i++) {
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

    public final Uri k() {
        ao(0, "original_image_url");
        return this.a;
    }

    public final String l() {
        ao(2, "domain");
        return this.c;
    }

    public final String m() {
        ao(3, "image_search_url");
        return this.d;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "RecentGifsTable -- REDACTED");
        }
        return a();
    }
}
