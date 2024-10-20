package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class suc extends aglz implements agma {
    public long a;
    public UUID b = uzz.i();
    public tqk c;
    public String d;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "MessageDestinationsTable [_id: %s,\n  message_send_receive_attempt_id: %s,\n  message_destination_type: %s,\n  message_destination_raw: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        UUID uuid = this.b;
        if (uuid != null && !uuid.equals(uzz.i())) {
            contentValues.put("message_send_receive_attempt_id", uzz.h(this.b));
        } else {
            contentValues.putNull("message_send_receive_attempt_id");
        }
        tqk tqkVar = this.c;
        if (tqkVar == null) {
            contentValues.putNull("message_destination_type");
        } else {
            contentValues.put("message_destination_type", Integer.valueOf(tqkVar.ordinal()));
        }
        agnc.r(contentValues, "message_destination_raw", this.d);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sue sueVar = (sue) agmqVar;
        aq();
        this.cJ = sueVar.dx();
        if (sueVar.db(0)) {
            this.a = sueVar.c();
            fE(0);
        }
        if (sueVar.db(1)) {
            this.b = sueVar.g();
            fE(1);
        }
        if (sueVar.db(2)) {
            this.c = sueVar.e();
            fE(2);
        }
        if (sueVar.db(3)) {
            this.d = sueVar.f();
            fE(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof suc)) {
            return false;
        }
        suc sucVar = (suc) obj;
        if (super.aC(sucVar.cJ) && this.a == sucVar.a && Objects.equals(this.b, sucVar.b) && this.c == sucVar.c && Objects.equals(this.d, sucVar.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_destinations", agnc.j(new String[]{"message_send_receive_attempt_id", "message_destination_type", "message_destination_raw"}));
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
        UUID uuid = this.b;
        tqk tqkVar = this.c;
        if (tqkVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqkVar.ordinal();
        }
        return Objects.hash(adayVar, valueOf, uuid, Integer.valueOf(ordinal), this.d, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "message_destinations";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Object obj = new snj(this, 13).get();
        tqk tqkVar = this.c;
        if (tqkVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(tqkVar.ordinal());
        }
        Object[] objArr = {obj, valueOf, this.d};
        sb.append('(');
        for (int i = 0; i < 3; i++) {
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

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "MessageDestinationsTable -- REDACTED");
        }
        return a();
    }
}
