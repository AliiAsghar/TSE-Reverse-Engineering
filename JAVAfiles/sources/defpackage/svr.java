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
public final class svr extends aglz implements agma {
    public MessageIdType a;
    public MessageIdType b;
    public ltm c;
    public rve d;

    /* JADX INFO: Access modifiers changed from: protected */
    public svr() {
        MessageIdType messageIdType = rvc.a;
        this.a = messageIdType;
        this.b = messageIdType;
        this.c = ltm.b(0);
        this.d = rve.a;
    }

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "MessageRepliesTable [message_id: %s,\n  replied_to_message_id: %s,\n  replied_to_message_id_null_reason: %s,\n  replied_to_rcs_message_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
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
        svu svuVar = (svu) agmqVar;
        aq();
        this.cJ = svuVar.dx();
        if (svuVar.db(0)) {
            this.a = svuVar.e();
            fE(0);
        }
        if (svuVar.db(1)) {
            this.b = svuVar.f();
            fE(1);
        }
        if (svuVar.db(2)) {
            this.c = svuVar.c();
            fE(2);
        }
        if (svuVar.db(3)) {
            this.d = svuVar.g();
            fE(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof svr)) {
            return false;
        }
        svr svrVar = (svr) obj;
        if (super.aC(svrVar.cJ) && Objects.equals(this.a, svrVar.a) && Objects.equals(this.b, svrVar.b) && this.c == svrVar.c && Objects.equals(this.d, svrVar.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_replies", agnc.j(new String[]{"message_id", "replied_to_message_id", "replied_to_message_id_null_reason", "replied_to_rcs_message_id"}));
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
        return "message_replies";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Object obj = new snj(this, 20).get();
        Object obj2 = new swc(this, 1).get();
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
            return String.format(Locale.US, "%s", "MessageRepliesTable -- REDACTED");
        }
        return a();
    }
}
