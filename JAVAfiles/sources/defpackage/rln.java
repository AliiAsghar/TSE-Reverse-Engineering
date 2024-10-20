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
public final class rln extends aglz implements agma {
    public long a;
    public String c;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public MessageIdType b = rvc.a;
    public long d = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "BackupLinkPreviewTable [_id: %s,\n  message_id: %s,\n  trigger_url: %s,\n  expiration_time_millis: %s,\n  link_title: %s,\n  link_description: %s,\n  link_image_url: %s,\n  link_domain: %s,\n  link_canonical_url: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
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
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        rlq rlqVar = (rlq) agmqVar;
        aq();
        this.cJ = rlqVar.dx();
        if (rlqVar.db(0)) {
            this.a = rlqVar.e();
            fE(0);
        }
        if (rlqVar.db(1)) {
            this.b = rlqVar.f();
            fE(1);
        }
        if (rlqVar.db(2)) {
            this.c = rlqVar.l();
            fE(2);
        }
        if (rlqVar.db(3)) {
            this.d = rlqVar.c();
            fE(3);
        }
        if (rlqVar.db(4)) {
            this.e = rlqVar.k();
            fE(4);
        }
        if (rlqVar.db(5)) {
            this.f = rlqVar.h();
            fE(5);
        }
        if (rlqVar.db(6)) {
            this.g = rlqVar.j();
            fE(6);
        }
        if (rlqVar.db(7)) {
            this.h = rlqVar.i();
            fE(7);
        }
        if (rlqVar.db(8)) {
            this.i = rlqVar.g();
            fE(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rln)) {
            return false;
        }
        rln rlnVar = (rln) obj;
        if (super.aC(rlnVar.cJ) && this.a == rlnVar.a && Objects.equals(this.b, rlnVar.b) && Objects.equals(this.c, rlnVar.c) && this.d == rlnVar.d && Objects.equals(this.e, rlnVar.e) && Objects.equals(this.f, rlnVar.f) && Objects.equals(this.g, rlnVar.g) && Objects.equals(this.h, rlnVar.h) && Objects.equals(this.i, rlnVar.i)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "link_preview_backup", agnc.j(new String[]{"message_id", "trigger_url", "expiration_time_millis", "link_title", "link_description", "link_image_url", "link_domain", "link_canonical_url"}));
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
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, this.c, Long.valueOf(this.d), this.e, this.f, this.g, this.h, this.i, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "link_preview_backup";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {new qwn((aglz) this, 16).get(), this.c, Long.valueOf(this.d), this.e, this.f, this.g, this.h, this.i};
        sb.append('(');
        for (int i = 0; i < 8; i++) {
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
            return String.format(Locale.US, "%s", "BackupLinkPreviewTable -- REDACTED");
        }
        return a();
    }
}
