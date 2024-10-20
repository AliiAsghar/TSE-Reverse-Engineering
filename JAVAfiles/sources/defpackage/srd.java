package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class srd extends aglz implements agma {
    public String a;
    public int c;
    public String d;
    public String j;
    public int b = 3;
    public int e = -1;
    public boolean f = false;
    public int g = 0;
    public int h = 0;
    public long i = 0;
    public long k = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "GenericWorkerQueueTable [_id: %s,\n  worker_type: %s,\n  item_table_type: %s,\n  item_id: %s,\n  account_id: %s,\n  in_flight: %s,\n  retry_count: %s,\n  flags: %s,\n  next_execute_timestamp: %s,\n  trigger_name: %s,\n  enqueued_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        contentValues.put("worker_type", Integer.valueOf(this.b));
        contentValues.put("item_table_type", Integer.valueOf(this.c));
        agnc.r(contentValues, "item_id", this.d);
        if (intValue >= 39020) {
            contentValues.put("account_id", Integer.valueOf(this.e));
        }
        contentValues.put("in_flight", Boolean.valueOf(this.f));
        contentValues.put("retry_count", Integer.valueOf(this.g));
        if (intValue >= 32000) {
            contentValues.put("flags", Integer.valueOf(this.h));
        }
        if (intValue >= 34000) {
            contentValues.put("next_execute_timestamp", Long.valueOf(this.i));
        }
        if (intValue >= 59700) {
            agnc.r(contentValues, "trigger_name", this.j);
        }
        if (intValue >= 59970) {
            contentValues.put("enqueued_timestamp", Long.valueOf(this.k));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        srg srgVar = (srg) agmqVar;
        aq();
        this.cJ = srgVar.dx();
        if (srgVar.db(0)) {
            this.a = srgVar.k();
            fE(0);
        }
        if (srgVar.db(1)) {
            this.b = srgVar.h();
            fE(1);
        }
        if (srgVar.db(2)) {
            this.c = srgVar.f();
            fE(2);
        }
        if (srgVar.db(3)) {
            this.d = srgVar.l();
            fE(3);
        }
        if (srgVar.db(4)) {
            this.e = srgVar.c();
            fE(4);
        }
        if (srgVar.db(5)) {
            this.f = srgVar.n();
            fE(5);
        }
        if (srgVar.db(6)) {
            this.g = srgVar.g();
            fE(6);
        }
        if (srgVar.db(7)) {
            this.h = srgVar.e();
            fE(7);
        }
        if (srgVar.db(8)) {
            this.i = srgVar.j();
            fE(8);
        }
        if (srgVar.db(9)) {
            this.j = srgVar.m();
            fE(9);
        }
        if (srgVar.db(10)) {
            this.k = srgVar.i();
            fE(10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof srd)) {
            return false;
        }
        srd srdVar = (srd) obj;
        if (super.aC(srdVar.cJ) && Objects.equals(this.a, srdVar.a) && this.b == srdVar.b && this.c == srdVar.c && Objects.equals(this.d, srdVar.d) && this.e == srdVar.e && this.f == srdVar.f && this.g == srdVar.g && this.h == srdVar.h && this.i == srdVar.i && Objects.equals(this.j, srdVar.j) && this.k == srdVar.k) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "generic_worker_queue", agnc.j(new String[]{"worker_type", "item_table_type", "item_id", "account_id", "in_flight", "retry_count", "flags", "next_execute_timestamp", "trigger_name", "enqueued_timestamp"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final int h() {
        ao(7, "flags");
        return this.h;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), Boolean.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Long.valueOf(this.i), this.j, Long.valueOf(this.k), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "generic_worker_queue";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), Integer.valueOf(this.f ? 1 : 0), Integer.valueOf(this.g), Integer.valueOf(this.h), Long.valueOf(this.i), this.j, Long.valueOf(this.k)};
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
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final int k() {
        ao(2, "item_table_type");
        return this.c;
    }

    public final int l() {
        ao(6, "retry_count");
        return this.g;
    }

    public final int m() {
        ao(1, "worker_type");
        return this.b;
    }

    public final long n() {
        ao(10, "enqueued_timestamp");
        return this.k;
    }

    public final String o() {
        ao(0, "_id");
        return this.a;
    }

    public final String p() {
        ao(3, "item_id");
        return this.d;
    }

    public final String q() {
        ao(9, "trigger_name");
        return this.j;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "GenericWorkerQueueTable -- REDACTED");
        }
        return a();
    }
}
