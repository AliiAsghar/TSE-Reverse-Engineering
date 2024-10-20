package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class spw extends aglz implements agma {
    public long a;
    public long b = 0;
    public mej c = mej.b(0);
    public String d;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "EventsTable [_id: %s,\n  timestamp: %s,\n  event: %s,\n  data: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        contentValues.put("timestamp", Long.valueOf(this.b));
        mej mejVar = this.c;
        if (mejVar == null) {
            contentValues.putNull("event");
        } else {
            contentValues.put("event", Integer.valueOf(mejVar.p));
        }
        agnc.r(contentValues, GroupManagementRequest.DATA_TAG, this.d);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        spy spyVar = (spy) agmqVar;
        aq();
        this.cJ = spyVar.dx();
        if (spyVar.db(0)) {
            this.a = spyVar.c();
            fE(0);
        }
        if (spyVar.db(1)) {
            this.b = spyVar.e();
            fE(1);
        }
        if (spyVar.db(2)) {
            this.c = spyVar.f();
            fE(2);
        }
        if (spyVar.db(3)) {
            this.d = spyVar.g();
            fE(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof spw)) {
            return false;
        }
        spw spwVar = (spw) obj;
        if (super.aC(spwVar.cJ) && this.a == spwVar.a && this.b == spwVar.b && this.c == spwVar.c && Objects.equals(this.d, spwVar.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "events", agnc.j(new String[]{"timestamp", "event", GroupManagementRequest.DATA_TAG}));
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
        return Objects.hash(adayVar, Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "events";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Long valueOf2 = Long.valueOf(this.b);
        mej mejVar = this.c;
        if (mejVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(mejVar.p);
        }
        Object[] objArr = {valueOf2, valueOf, this.d};
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
            return String.format(Locale.US, "%s", "EventsTable -- REDACTED");
        }
        return a();
    }
}
