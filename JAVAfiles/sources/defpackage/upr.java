package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.aglz;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class upr extends aglz implements agma {
    public long a;
    public String b;
    public byte[] c;
    public int d;
    public long e;
    public String f;
    public String g;
    public boolean h;
    public Optional i = rvg.a;
    public Date j = rva.a;
    public String k;

    @Override // defpackage.aglz
    public final String a() {
        String str;
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        byte[] bArr = this.c;
        if (bArr != null) {
            str = String.valueOf(bArr.length);
        } else {
            str = "NULL";
        }
        return String.format(locale, "WorkQueueTable [_id: %s,\n  type: %s,\n  rawdata: %s,\n  attempts: %s,\n  timestamp: %s,\n  queue: %s,\n  deduplication_tag: %s,\n  scheduled_in_workmanager: %s,\n  workmanager_id: %s,\n  minimum_start_time: %s,\n  cancellation_tag: %s\n]\n", valueOf, valueOf2, "BLOB".concat(String.valueOf(str)), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        agnc.r(contentValues, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, this.b);
        contentValues.put("rawdata", this.c);
        contentValues.put("attempts", Integer.valueOf(this.d));
        contentValues.put("timestamp", Long.valueOf(this.e));
        if (intValue >= 41030) {
            agnc.r(contentValues, "queue", this.f);
        }
        if (intValue >= 42050) {
            agnc.r(contentValues, "deduplication_tag", this.g);
        }
        if (intValue >= 45030) {
            contentValues.put("scheduled_in_workmanager", Boolean.valueOf(this.h));
        }
        if (intValue >= 46060) {
            Optional optional = this.i;
            if (optional == null) {
                contentValues.putNull("workmanager_id");
            } else {
                contentValues.put("workmanager_id", rvg.b(optional));
            }
        }
        if (intValue >= 46070) {
            Date date = this.j;
            if (date == null) {
                contentValues.putNull("minimum_start_time");
            } else {
                contentValues.put("minimum_start_time", Long.valueOf(rva.a(date)));
            }
        }
        if (intValue >= 48020) {
            agnc.r(contentValues, "cancellation_tag", this.k);
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        upv upvVar = (upv) agmqVar;
        aq();
        this.cJ = upvVar.dx();
        if (upvVar.db(0)) {
            this.a = upvVar.e();
            super.fE(0);
        }
        if (upvVar.db(1)) {
            this.b = upvVar.k();
            super.fE(1);
        }
        if (upvVar.db(2)) {
            this.c = upvVar.n();
            super.fE(2);
        }
        if (upvVar.db(3)) {
            this.d = upvVar.c();
            super.fE(3);
        }
        if (upvVar.db(4)) {
            this.e = upvVar.f();
            super.fE(4);
        }
        if (upvVar.db(5)) {
            this.f = upvVar.j();
            super.fE(5);
        }
        if (upvVar.db(6)) {
            this.g = upvVar.i();
            super.fE(6);
        }
        if (upvVar.db(7)) {
            this.h = upvVar.m();
            super.fE(7);
        }
        if (upvVar.db(8)) {
            this.i = upvVar.g();
            super.fE(8);
        }
        if (upvVar.db(9)) {
            this.j = upvVar.l();
            super.fE(9);
        }
        if (upvVar.db(10)) {
            this.k = upvVar.h();
            super.fE(10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof upr)) {
            return false;
        }
        upr uprVar = (upr) obj;
        if (super.aC(uprVar.cJ) && this.a == uprVar.a && Objects.equals(this.b, uprVar.b) && Arrays.equals(this.c, uprVar.c) && this.d == uprVar.d && this.e == uprVar.e && Objects.equals(this.f, uprVar.f) && Objects.equals(this.g, uprVar.g) && this.h == uprVar.h && Objects.equals(this.i, uprVar.i) && Objects.equals(this.j, uprVar.j) && Objects.equals(this.k, uprVar.k)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "work_queue", agnc.j(new String[]{BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, "rawdata", "attempts", "timestamp", "queue", "deduplication_tag", "scheduled_in_workmanager", "workmanager_id", "minimum_start_time", "cancellation_tag"}));
    }

    @Override // defpackage.aglz
    public final void fE(int i) {
        super.fE(0);
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final int h() {
        ao(3, "attempts");
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
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(this.d), Long.valueOf(this.e), this.f, this.g, Boolean.valueOf(this.h), this.i, this.j, this.k, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "work_queue";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.b, this.c, Integer.valueOf(this.d), Long.valueOf(this.e), this.f, this.g, Integer.valueOf(this.h ? 1 : 0), rvg.b(this.i), Long.valueOf(rva.a(this.j)), this.k};
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

    public final long k() {
        ao(0, "_id");
        return this.a;
    }

    public final long l() {
        ao(4, "timestamp");
        return this.e;
    }

    public final String m() {
        ao(10, "cancellation_tag");
        return this.k;
    }

    public final String n() {
        ao(6, "deduplication_tag");
        return this.g;
    }

    public final String o() {
        ao(5, "queue");
        return this.f;
    }

    public final String p() {
        ao(1, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        return this.b;
    }

    public final Date q() {
        ao(9, "minimum_start_time");
        return this.j;
    }

    public final byte[] s() {
        ao(2, "rawdata");
        return this.c;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "WorkQueueTable -- REDACTED");
        }
        return a();
    }
}
