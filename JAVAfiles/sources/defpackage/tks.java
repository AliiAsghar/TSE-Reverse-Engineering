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
public final class tks extends aglz implements agma {
    public long a;
    public String c;
    public Uri d;
    public qwe b = null;
    public boolean e = true;
    public boolean f = false;
    public long g = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "SelfProfilesTable [_id: %s,\n  my_identity_token: %s,\n  limited_profile_display_name: %s,\n  photo_uri: %s,\n  is_self_profile_shareable: %s,\n  belongs_to_self_gaia: %s,\n  update_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        qwe qweVar = this.b;
        if (qweVar != null && !qweVar.equals(null)) {
            contentValues.put("my_identity_token", riw.n(this.b));
        } else {
            contentValues.putNull("my_identity_token");
        }
        agnc.r(contentValues, "limited_profile_display_name", this.c);
        Uri uri = this.d;
        if (uri == null) {
            contentValues.putNull("photo_uri");
        } else {
            contentValues.put("photo_uri", uri.toString());
        }
        if (intValue >= 60400) {
            contentValues.put("is_self_profile_shareable", Boolean.valueOf(this.e));
        }
        contentValues.put("belongs_to_self_gaia", Boolean.valueOf(this.f));
        contentValues.put("update_timestamp", Long.valueOf(this.g));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tkv tkvVar = (tkv) agmqVar;
        aq();
        this.cJ = tkvVar.dx();
        if (tkvVar.db(0)) {
            this.a = tkvVar.c();
            fE(0);
        }
        if (tkvVar.db(1)) {
            this.b = tkvVar.g();
            fE(1);
        }
        if (tkvVar.db(2)) {
            this.c = tkvVar.h();
            fE(2);
        }
        if (tkvVar.db(3)) {
            this.d = tkvVar.f();
            fE(3);
        }
        if (tkvVar.db(4)) {
            this.e = tkvVar.j();
            fE(4);
        }
        if (tkvVar.db(5)) {
            this.f = tkvVar.i();
            fE(5);
        }
        if (tkvVar.db(6)) {
            this.g = tkvVar.e();
            fE(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tks)) {
            return false;
        }
        tks tksVar = (tks) obj;
        if (super.aC(tksVar.cJ) && this.a == tksVar.a && Objects.equals(this.b, tksVar.b) && Objects.equals(this.c, tksVar.c) && Objects.equals(this.d, tksVar.d) && this.e == tksVar.e && this.f == tksVar.f && this.g == tksVar.g) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "self_profiles", agnc.j(new String[]{"my_identity_token", "limited_profile_display_name", "photo_uri", "is_self_profile_shareable", "belongs_to_self_gaia", "update_timestamp"}));
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
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f), Long.valueOf(this.g), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "self_profiles";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        String uri;
        Object obj = new tbv((aglz) this, 7).get();
        String str = this.c;
        Uri uri2 = this.d;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        Object[] objArr = {obj, str, uri, Integer.valueOf(this.e ? 1 : 0), Integer.valueOf(this.f ? 1 : 0), Long.valueOf(this.g)};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
                    }
                }
                list.add(obj2);
                sb.append('?');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "SelfProfilesTable -- REDACTED");
        }
        return a();
    }
}
