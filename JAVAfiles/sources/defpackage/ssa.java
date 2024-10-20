package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ssa extends aglz implements agma {
    public String a;
    public long b;
    public long c = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "LinkPreviewParticipantsTable [_id: %s,\n  participant_id: %s,\n  manual_link_preview_count: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.q(contentValues, "participant_id", this.b);
        contentValues.put("manual_link_preview_count", Long.valueOf(this.c));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        ssc sscVar = (ssc) agmqVar;
        aq();
        this.cJ = sscVar.dx();
        if (sscVar.db(0)) {
            this.a = sscVar.f();
            fE(0);
        }
        if (sscVar.db(1)) {
            this.b = sscVar.e();
            fE(1);
        }
        if (sscVar.db(2)) {
            this.c = sscVar.c();
            fE(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ssa)) {
            return false;
        }
        ssa ssaVar = (ssa) obj;
        if (super.aC(ssaVar.cJ) && Objects.equals(this.a, ssaVar.a) && this.b == ssaVar.b && this.c == ssaVar.c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "link_preview_participants_table", agnc.j(new String[]{"participant_id", "manual_link_preview_count"}));
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
        return Objects.hash(adayVar, this.a, Long.valueOf(this.b), Long.valueOf(this.c), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "link_preview_participants_table";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {Long.valueOf(this.b), Long.valueOf(this.c)};
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
            return String.format(Locale.US, "%s", "LinkPreviewParticipantsTable -- REDACTED");
        }
        return a();
    }
}
