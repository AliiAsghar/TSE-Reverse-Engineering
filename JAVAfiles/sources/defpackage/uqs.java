package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uqs extends aglz implements agma {
    public String a;
    public Optional b = rvg.a;
    public Date c = rva.a;
    public Date d = rva.a;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "WorkQueueWorkManagerTable [queue: %s,\n  workmanager_id: %s,\n  scheduled_at_time: %s,\n  minimum_start_time: %s,\n  requires_network_type: %s,\n  requires_charging: %s,\n  requires_device_idle: %s,\n  requires_battery_not_low: %s,\n  requires_storage_not_low: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "queue", this.a);
        Optional optional = this.b;
        if (optional == null) {
            contentValues.putNull("workmanager_id");
        } else {
            contentValues.put("workmanager_id", rvg.b(optional));
        }
        Date date = this.c;
        if (date == null) {
            contentValues.putNull("scheduled_at_time");
        } else {
            contentValues.put("scheduled_at_time", Long.valueOf(rva.a(date)));
        }
        Date date2 = this.d;
        if (date2 == null) {
            contentValues.putNull("minimum_start_time");
        } else {
            contentValues.put("minimum_start_time", Long.valueOf(rva.a(date2)));
        }
        contentValues.put("requires_network_type", Integer.valueOf(this.e));
        contentValues.put("requires_charging", Boolean.valueOf(this.f));
        contentValues.put("requires_device_idle", Boolean.valueOf(this.g));
        contentValues.put("requires_battery_not_low", Boolean.valueOf(this.h));
        contentValues.put("requires_storage_not_low", Boolean.valueOf(this.i));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        uqx uqxVar = (uqx) agmqVar;
        aq();
        this.cJ = uqxVar.dx();
        if (uqxVar.db(0)) {
            this.a = uqxVar.f();
            fE(0);
        }
        if (uqxVar.db(1)) {
            this.b = uqxVar.e();
            fE(1);
        }
        if (uqxVar.db(2)) {
            this.c = uqxVar.h();
            fE(2);
        }
        if (uqxVar.db(3)) {
            this.d = uqxVar.g();
            fE(3);
        }
        if (uqxVar.db(4)) {
            this.e = uqxVar.c();
            fE(4);
        }
        if (uqxVar.db(5)) {
            this.f = uqxVar.j();
            fE(5);
        }
        if (uqxVar.db(6)) {
            this.g = uqxVar.k();
            fE(6);
        }
        if (uqxVar.db(7)) {
            this.h = uqxVar.i();
            fE(7);
        }
        if (uqxVar.db(8)) {
            this.i = uqxVar.l();
            fE(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uqs)) {
            return false;
        }
        uqs uqsVar = (uqs) obj;
        if (super.aC(uqsVar.cJ) && Objects.equals(this.a, uqsVar.a) && Objects.equals(this.b, uqsVar.b) && Objects.equals(this.c, uqsVar.c) && Objects.equals(this.d, uqsVar.d) && this.e == uqsVar.e && this.f == uqsVar.f && this.g == uqsVar.g && this.h == uqsVar.h && this.i == uqsVar.i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "work_queue_work_manager_ids", agnc.j(new String[]{"queue", "workmanager_id", "scheduled_at_time", "minimum_start_time", "requires_network_type", "requires_charging", "requires_device_idle", "requires_battery_not_low", "requires_storage_not_low"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final Optional h() {
        ao(1, "workmanager_id");
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
        return Objects.hash(adayVar, this.a, this.b, this.c, this.d, Integer.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "work_queue_work_manager_ids";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.a, rvg.b(this.b), Long.valueOf(rva.a(this.c)), Long.valueOf(rva.a(this.d)), Integer.valueOf(this.e), Integer.valueOf(this.f ? 1 : 0), Integer.valueOf(this.g ? 1 : 0), Integer.valueOf(this.h ? 1 : 0), Integer.valueOf(this.i ? 1 : 0)};
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

    public final String k() {
        ao(0, "queue");
        return this.a;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "WorkQueueWorkManagerTable -- REDACTED");
        }
        return a();
    }
}
