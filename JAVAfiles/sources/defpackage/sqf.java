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
public final class sqf extends aglz implements agma {
    public long a;
    public tqg c;
    public long d;
    public MessageIdType b = rvc.a;
    public boolean e = false;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "FlaggedMessagesTable [_id: %s,\n  flagged_message_id: %s,\n  flagging_reason: %s,\n  flagged_message_timestamp: %s,\n  flagged_message_notified: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType != null && !messageIdType.equals(rvc.a)) {
            contentValues.put("flagged_message_id", Long.valueOf(rvc.a(this.b)));
        } else {
            contentValues.putNull("flagged_message_id");
        }
        tqg tqgVar = this.c;
        if (tqgVar == null) {
            contentValues.putNull("flagging_reason");
        } else {
            contentValues.put("flagging_reason", Integer.valueOf(tqgVar.ordinal()));
        }
        if (intValue >= 39030) {
            contentValues.put("flagged_message_timestamp", Long.valueOf(this.d));
        }
        if (intValue >= 46030) {
            contentValues.put("flagged_message_notified", Boolean.valueOf(this.e));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sqj sqjVar = (sqj) agmqVar;
        aq();
        this.cJ = sqjVar.dx();
        if (sqjVar.db(0)) {
            this.a = sqjVar.e();
            fE(0);
        }
        if (sqjVar.db(1)) {
            this.b = sqjVar.f();
            fE(1);
        }
        if (sqjVar.db(2)) {
            this.c = sqjVar.g();
            fE(2);
        }
        if (sqjVar.db(3)) {
            this.d = sqjVar.c();
            fE(3);
        }
        if (sqjVar.db(4)) {
            this.e = sqjVar.h();
            fE(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sqf)) {
            return false;
        }
        sqf sqfVar = (sqf) obj;
        if (super.aC(sqfVar.cJ) && this.a == sqfVar.a && Objects.equals(this.b, sqfVar.b) && this.c == sqfVar.c && this.d == sqfVar.d && this.e == sqfVar.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "flagged_messages", agnc.j(new String[]{"flagged_message_id", "flagging_reason", "flagged_message_timestamp", "flagged_message_notified"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final MessageIdType h() {
        ao(1, "flagged_message_id");
        return this.b;
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
        MessageIdType messageIdType = this.b;
        tqg tqgVar = this.c;
        if (tqgVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqgVar.ordinal();
        }
        return Objects.hash(adayVar, valueOf, messageIdType, Integer.valueOf(ordinal), Long.valueOf(this.d), Boolean.valueOf(this.e), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "flagged_messages";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Object obj = new snj(this, 4).get();
        tqg tqgVar = this.c;
        if (tqgVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(tqgVar.ordinal());
        }
        Object[] objArr = {obj, valueOf, Long.valueOf(this.d), Integer.valueOf(this.e ? 1 : 0)};
        sb.append('(');
        for (int i = 0; i < 4; i++) {
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

    public final tqg k() {
        ao(2, "flagging_reason");
        return this.c;
    }

    public final boolean l() {
        ao(4, "flagged_message_notified");
        return this.e;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "FlaggedMessagesTable -- REDACTED");
        }
        return a();
    }
}
