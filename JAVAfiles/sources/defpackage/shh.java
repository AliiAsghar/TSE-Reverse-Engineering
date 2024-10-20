package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class shh extends aglz implements agma {
    public long a;
    public long b;
    public long c;
    public shs d = shs.a;
    public long e;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "CmsDeletedMessagesBufferTable [_id: %s,\n  message_id: %s,\n  conversation_id: %s,\n  message_deletion_reason: %s,\n  deletion_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        contentValues.put("message_id", Long.valueOf(this.b));
        contentValues.put("conversation_id", Long.valueOf(this.c));
        shs shsVar = this.d;
        if (shsVar == null) {
            contentValues.putNull("message_deletion_reason");
        } else {
            contentValues.put("message_deletion_reason", Integer.valueOf(shsVar.ordinal()));
        }
        contentValues.put("deletion_timestamp", Long.valueOf(this.e));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        shk shkVar = (shk) agmqVar;
        aq();
        this.cJ = shkVar.dx();
        if (shkVar.db(0)) {
            this.a = shkVar.f();
            fE(0);
        }
        if (shkVar.db(1)) {
            this.b = shkVar.g();
            fE(1);
        }
        if (shkVar.db(2)) {
            this.c = shkVar.c();
            fE(2);
        }
        if (shkVar.db(3)) {
            this.d = shkVar.h();
            fE(3);
        }
        if (shkVar.db(4)) {
            this.e = shkVar.e();
            fE(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof shh)) {
            return false;
        }
        shh shhVar = (shh) obj;
        if (super.aC(shhVar.cJ) && this.a == shhVar.a && this.b == shhVar.b && this.c == shhVar.c && this.d == shhVar.d && this.e == shhVar.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms_deleted_messages_buffer", agnc.j(new String[]{"message_id", "conversation_id", "message_deletion_reason", "deletion_timestamp"}));
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
        Long valueOf2 = Long.valueOf(this.b);
        Long valueOf3 = Long.valueOf(this.c);
        shs shsVar = this.d;
        if (shsVar == null) {
            ordinal = 0;
        } else {
            ordinal = shsVar.ordinal();
        }
        return Objects.hash(adayVar, valueOf, valueOf2, valueOf3, Integer.valueOf(ordinal), Long.valueOf(this.e), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "cms_deleted_messages_buffer";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Long valueOf2 = Long.valueOf(this.b);
        Long valueOf3 = Long.valueOf(this.c);
        shs shsVar = this.d;
        if (shsVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(shsVar.ordinal());
        }
        Object[] objArr = {valueOf2, valueOf3, valueOf, Long.valueOf(this.e)};
        sb.append('(');
        for (int i = 0; i < 4; i++) {
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
            return String.format(Locale.US, "%s", "CmsDeletedMessagesBufferTable -- REDACTED");
        }
        return a();
    }
}
