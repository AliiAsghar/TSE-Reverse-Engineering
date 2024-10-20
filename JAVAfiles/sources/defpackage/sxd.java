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
public final class sxd extends aglz implements agma {
    public long a;
    public String b;
    public long c = 0;
    public int d = 0;
    public mem e;
    public String f;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "MessageStatusTable [_id: %s,\n  message_id: %s,\n  timestamp: %s,\n  status: %s,\n  custom_status: %s,\n  data: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "message_id", this.b);
        contentValues.put("timestamp", Long.valueOf(this.c));
        contentValues.put("status", Integer.valueOf(this.d));
        mem memVar = this.e;
        if (memVar == null) {
            contentValues.putNull("custom_status");
        } else {
            contentValues.put("custom_status", Integer.valueOf(memVar.ordinal()));
        }
        agnc.r(contentValues, GroupManagementRequest.DATA_TAG, this.f);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sxg sxgVar = (sxg) agmqVar;
        aq();
        this.cJ = sxgVar.dx();
        if (sxgVar.db(0)) {
            this.a = sxgVar.e();
            fE(0);
        }
        if (sxgVar.db(1)) {
            this.b = sxgVar.i();
            fE(1);
        }
        if (sxgVar.db(2)) {
            this.c = sxgVar.f();
            fE(2);
        }
        if (sxgVar.db(3)) {
            this.d = sxgVar.c();
            fE(3);
        }
        if (sxgVar.db(4)) {
            this.e = sxgVar.g();
            fE(4);
        }
        if (sxgVar.db(5)) {
            this.f = sxgVar.h();
            fE(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sxd)) {
            return false;
        }
        sxd sxdVar = (sxd) obj;
        if (super.aC(sxdVar.cJ) && this.a == sxdVar.a && Objects.equals(this.b, sxdVar.b) && this.c == sxdVar.c && this.d == sxdVar.d && this.e == sxdVar.e && Objects.equals(this.f, sxdVar.f)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_status", agnc.j(new String[]{"message_id", "timestamp", "status", "custom_status", GroupManagementRequest.DATA_TAG}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final int hashCode() {
        aday adayVar;
        int ordinal;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        Long valueOf = Long.valueOf(this.a);
        String str = this.b;
        Long valueOf2 = Long.valueOf(this.c);
        Integer valueOf3 = Integer.valueOf(this.d);
        mem memVar = this.e;
        if (memVar == null) {
            ordinal = 0;
        } else {
            ordinal = memVar.ordinal();
        }
        return Objects.hash(adayVar, valueOf, str, valueOf2, valueOf3, Integer.valueOf(ordinal), this.f, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "message_status";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        String str = this.b;
        Long valueOf2 = Long.valueOf(this.c);
        Integer valueOf3 = Integer.valueOf(this.d);
        mem memVar = this.e;
        if (memVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(memVar.ordinal());
        }
        Object[] objArr = {str, valueOf2, valueOf3, valueOf, this.f};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
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

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "MessageStatusTable -- REDACTED");
        }
        return a();
    }
}
