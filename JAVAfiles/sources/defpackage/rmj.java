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
public final class rmj extends aglz implements agma {
    public MessageIdType a;
    public MessageIdType b;
    public ltm c;
    public rve d;

    /* JADX INFO: Access modifiers changed from: protected */
    public rmj() {
        MessageIdType messageIdType = rvc.a;
        this.a = messageIdType;
        this.b = messageIdType;
        this.c = ltm.b(0);
        this.d = rve.a;
    }

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "BackupMessageRepliesTable [message_id: %s,\n  replied_to_message_id: %s,\n  replied_to_message_id_null_reason: %s,\n  replied_to_rcs_message_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.a;
        if (messageIdType != null && !messageIdType.equals(rvc.a)) {
            contentValues.put("message_id", Long.valueOf(rvc.a(this.a)));
        } else {
            contentValues.putNull("message_id");
        }
        MessageIdType messageIdType2 = this.b;
        if (messageIdType2 != null && !messageIdType2.equals(rvc.a)) {
            contentValues.put("replied_to_message_id", Long.valueOf(rvc.a(this.b)));
        } else {
            contentValues.putNull("replied_to_message_id");
        }
        ltm ltmVar = this.c;
        if (ltmVar == null) {
            contentValues.putNull("replied_to_message_id_null_reason");
        } else {
            contentValues.put("replied_to_message_id_null_reason", Integer.valueOf(ltmVar.a()));
        }
        rve rveVar = this.d;
        if (rveVar == null) {
            contentValues.putNull("replied_to_rcs_message_id");
        } else {
            contentValues.put("replied_to_rcs_message_id", rve.d(rveVar));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        rml rmlVar = (rml) agmqVar;
        aq();
        this.cJ = rmlVar.dx();
        if (rmlVar.db(0)) {
            this.a = rmlVar.e();
            fE(0);
        }
        if (rmlVar.db(1)) {
            this.b = rmlVar.f();
            fE(1);
        }
        if (rmlVar.db(2)) {
            this.c = rmlVar.c();
            fE(2);
        }
        if (rmlVar.db(3)) {
            this.d = rmlVar.g();
            fE(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rmj)) {
            return false;
        }
        rmj rmjVar = (rmj) obj;
        if (super.aC(rmjVar.cJ) && Objects.equals(this.a, rmjVar.a) && Objects.equals(this.b, rmjVar.b) && this.c == rmjVar.c && Objects.equals(this.d, rmjVar.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_replies_backup", agnc.j(new String[]{"message_id", "replied_to_message_id", "replied_to_message_id_null_reason", "replied_to_rcs_message_id"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, this.b, this.c, this.d, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "message_replies_backup";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Object obj = new qwn((aglz) this, 19).get();
        Object obj2 = new qwn((aglz) this, 20).get();
        ltm ltmVar = this.c;
        if (ltmVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(ltmVar.a());
        }
        Object[] objArr = {obj, obj2, valueOf, rve.d(this.d)};
        sb.append('(');
        for (int i = 0; i < 4; i++) {
            Object obj3 = objArr[i];
            if (obj3 instanceof Number) {
                sb.append(String.valueOf(obj3));
            } else {
                if (obj3 instanceof String) {
                    String str = (String) obj3;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
                    }
                }
                list.add(obj3);
                sb.append('?');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "BackupMessageRepliesTable -- REDACTED");
        }
        return a();
    }
}
