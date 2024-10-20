package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ssi extends aglz implements agma {
    public long a;
    public String c;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public MessageIdType b = rvc.a;
    public long d = 0;
    public boolean j = false;
    public boolean k = false;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "LinkPreviewTable [_id: %s,\n  message_id: %s,\n  trigger_url: %s,\n  expiration_time_millis: %s,\n  link_title: %s,\n  link_description: %s,\n  link_image_url: %s,\n  link_domain: %s,\n  link_canonical_url: %s,\n  link_preview_prevented: %s,\n  link_preview_failed: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType != null && !messageIdType.equals(rvc.a)) {
            contentValues.put("message_id", Long.valueOf(rvc.a(this.b)));
        } else {
            contentValues.putNull("message_id");
        }
        agnc.r(contentValues, "trigger_url", this.c);
        contentValues.put("expiration_time_millis", Long.valueOf(this.d));
        agnc.r(contentValues, "link_title", this.e);
        agnc.r(contentValues, "link_description", this.f);
        agnc.r(contentValues, "link_image_url", this.g);
        agnc.r(contentValues, "link_domain", this.h);
        agnc.r(contentValues, "link_canonical_url", this.i);
        if (intValue >= 21010) {
            contentValues.put("link_preview_prevented", Boolean.valueOf(this.j));
        }
        if (intValue >= 22020) {
            contentValues.put("link_preview_failed", Boolean.valueOf(this.k));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        ssm ssmVar = (ssm) agmqVar;
        aq();
        this.cJ = ssmVar.dx();
        if (ssmVar.db(0)) {
            this.a = ssmVar.e();
            fE(0);
        }
        if (ssmVar.db(1)) {
            this.b = ssmVar.f();
            fE(1);
        }
        if (ssmVar.db(2)) {
            this.c = ssmVar.l();
            fE(2);
        }
        if (ssmVar.db(3)) {
            this.d = ssmVar.c();
            fE(3);
        }
        if (ssmVar.db(4)) {
            this.e = ssmVar.k();
            fE(4);
        }
        if (ssmVar.db(5)) {
            this.f = ssmVar.h();
            fE(5);
        }
        if (ssmVar.db(6)) {
            this.g = ssmVar.j();
            fE(6);
        }
        if (ssmVar.db(7)) {
            this.h = ssmVar.i();
            fE(7);
        }
        if (ssmVar.db(8)) {
            this.i = ssmVar.g();
            fE(8);
        }
        if (ssmVar.db(9)) {
            this.j = ssmVar.n();
            fE(9);
        }
        if (ssmVar.db(10)) {
            this.k = ssmVar.m();
            fE(10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ssi)) {
            return false;
        }
        ssi ssiVar = (ssi) obj;
        if (super.aC(ssiVar.cJ) && this.a == ssiVar.a && Objects.equals(this.b, ssiVar.b) && Objects.equals(this.c, ssiVar.c) && this.d == ssiVar.d && Objects.equals(this.e, ssiVar.e) && Objects.equals(this.f, ssiVar.f) && Objects.equals(this.g, ssiVar.g) && Objects.equals(this.h, ssiVar.h) && Objects.equals(this.i, ssiVar.i) && this.j == ssiVar.j && this.k == ssiVar.k) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "link_preview", agnc.j(new String[]{"message_id", "trigger_url", "expiration_time_millis", "link_title", "link_description", "link_image_url", "link_domain", "link_canonical_url", "link_preview_prevented", "link_preview_failed"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final long h() {
        ao(3, "expiration_time_millis");
        return this.d;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, this.c, Long.valueOf(this.d), this.e, this.f, this.g, this.h, this.i, Boolean.valueOf(this.j), Boolean.valueOf(this.k), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "link_preview";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {new snj(this, 9).get(), this.c, Long.valueOf(this.d), this.e, this.f, this.g, this.h, this.i, Integer.valueOf(this.j ? 1 : 0), Integer.valueOf(this.k ? 1 : 0)};
        sb.append('(');
        for (int i = 0; i < 10; i++) {
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
                sb.append(',');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final MessageIdType k() {
        ao(1, "message_id");
        return this.b;
    }

    public final String l() {
        ao(8, "link_canonical_url");
        return this.i;
    }

    public final String m() {
        ao(5, "link_description");
        return this.f;
    }

    public final String n() {
        ao(7, "link_domain");
        return this.h;
    }

    public final String o() {
        ao(6, "link_image_url");
        return this.g;
    }

    public final String p() {
        ao(4, "link_title");
        return this.e;
    }

    public final String q() {
        ao(2, "trigger_url");
        return this.c;
    }

    public final boolean r() {
        ao(10, "link_preview_failed");
        return this.k;
    }

    public final boolean s() {
        ao(9, "link_preview_prevented");
        return this.j;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "LinkPreviewTable -- REDACTED");
        }
        return a();
    }
}
