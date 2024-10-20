package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tie extends aglz implements agma {
    public long a;
    public lwp g;
    public long h;
    public Optional b = rvg.a;
    public lwz c = lwz.b(0);
    public lwr d = lwr.b(0);
    public Instant e = Instant.EPOCH;
    public Instant f = Instant.EPOCH;
    public Instant i = Instant.EPOCH;
    public Instant j = Instant.EPOCH;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "RestoreWorkflowExecutionsTable [_id: %s,\n  session_id: %s,\n  feature: %s,\n  status: %s,\n  start_time: %s,\n  finish_time: %s,\n  backup_database_metadata: %s,\n  initial_messages_version: %s,\n  status_timestamp: %s,\n  last_attachment_request_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        Optional optional = this.b;
        if (optional == null) {
            contentValues.putNull("session_id");
        } else {
            contentValues.put("session_id", rvg.b(optional));
        }
        lwz lwzVar = this.c;
        if (lwzVar == null) {
            contentValues.putNull("feature");
        } else {
            contentValues.put("feature", Integer.valueOf(lwzVar.d));
        }
        lwr lwrVar = this.d;
        if (lwrVar == null) {
            contentValues.putNull("status");
        } else {
            contentValues.put("status", Integer.valueOf(lwrVar.p));
        }
        Instant instant = this.e;
        if (instant == null) {
            contentValues.putNull("start_time");
        } else {
            contentValues.put("start_time", Long.valueOf(uzz.k(instant)));
        }
        Instant instant2 = this.f;
        if (instant2 == null) {
            contentValues.putNull("finish_time");
        } else {
            contentValues.put("finish_time", Long.valueOf(uzz.k(instant2)));
        }
        lwp lwpVar = this.g;
        if (lwpVar == null) {
            contentValues.putNull("backup_database_metadata");
        } else {
            contentValues.put("backup_database_metadata", lwpVar.toByteArray());
        }
        if (intValue >= 60110) {
            contentValues.put("initial_messages_version", Long.valueOf(this.h));
        }
        if (intValue >= 60220) {
            Instant instant3 = this.i;
            if (instant3 == null) {
                contentValues.putNull("status_timestamp");
            } else {
                contentValues.put("status_timestamp", Long.valueOf(uzz.k(instant3)));
            }
        }
        if (intValue >= 60330) {
            Instant instant4 = this.j;
            if (instant4 == null) {
                contentValues.putNull("last_attachment_request_timestamp");
            } else {
                contentValues.put("last_attachment_request_timestamp", Long.valueOf(uzz.k(instant4)));
            }
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tij tijVar = (tij) agmqVar;
        aq();
        this.cJ = tijVar.dx();
        if (tijVar.db(0)) {
            this.a = tijVar.c();
            fE(0);
        }
        if (tijVar.db(1)) {
            this.b = tijVar.m();
            fE(1);
        }
        if (tijVar.db(2)) {
            this.c = tijVar.h();
            fE(2);
        }
        if (tijVar.db(3)) {
            this.d = tijVar.g();
            fE(3);
        }
        if (tijVar.db(4)) {
            this.e = tijVar.k();
            fE(4);
        }
        if (tijVar.db(5)) {
            this.f = tijVar.i();
            fE(5);
        }
        if (tijVar.db(6)) {
            this.g = tijVar.f();
            fE(6);
        }
        if (tijVar.db(7)) {
            this.h = tijVar.e();
            fE(7);
        }
        if (tijVar.db(8)) {
            this.i = tijVar.l();
            fE(8);
        }
        if (tijVar.db(9)) {
            this.j = tijVar.j();
            fE(9);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tie)) {
            return false;
        }
        tie tieVar = (tie) obj;
        if (super.aC(tieVar.cJ) && this.a == tieVar.a && Objects.equals(this.b, tieVar.b) && this.c == tieVar.c && this.d == tieVar.d && Objects.equals(this.e, tieVar.e) && Objects.equals(this.f, tieVar.f) && Objects.equals(this.g, tieVar.g) && this.h == tieVar.h && Objects.equals(this.i, tieVar.i) && Objects.equals(this.j, tieVar.j)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "restore_workflow_executions", agnc.j(new String[]{"session_id", "feature", "status", "start_time", "finish_time", "backup_database_metadata", "initial_messages_version", "status_timestamp", "last_attachment_request_timestamp"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final long h() {
        ao(0, "_id");
        return this.a;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, Long.valueOf(this.h), this.i, this.j, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "restore_workflow_executions";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        byte[] byteArray;
        String b = rvg.b(this.b);
        lwz lwzVar = this.c;
        Object obj = 0;
        if (lwzVar == null) {
            valueOf = obj;
        } else {
            valueOf = String.valueOf(lwzVar.d);
        }
        lwr lwrVar = this.d;
        if (lwrVar != null) {
            obj = String.valueOf(lwrVar.p);
        }
        Long valueOf2 = Long.valueOf(uzz.k(this.e));
        Long valueOf3 = Long.valueOf(uzz.k(this.f));
        lwp lwpVar = this.g;
        if (lwpVar == null) {
            byteArray = null;
        } else {
            byteArray = lwpVar.toByteArray();
        }
        Object[] objArr = {b, valueOf, obj, valueOf2, valueOf3, byteArray, Long.valueOf(this.h), Long.valueOf(uzz.k(this.i)), Long.valueOf(uzz.k(this.j))};
        sb.append('(');
        for (int i = 0; i < 9; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
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

    public final lwp k() {
        ao(6, "backup_database_metadata");
        return this.g;
    }

    public final lwr l() {
        ao(3, "status");
        return this.d;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "RestoreWorkflowExecutionsTable -- REDACTED");
        }
        return a();
    }
}
