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
public final class rlx extends aglz implements agma {
    public long a;
    public MessageIdType b;
    public wks c;
    public MessageIdType d;
    public wky e;
    public wku f;

    /* JADX INFO: Access modifiers changed from: protected */
    public rlx() {
        MessageIdType messageIdType = rvc.a;
        this.b = messageIdType;
        this.d = messageIdType;
        this.e = wky.b(0);
    }

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "BackupMessageReactionsTable [_id: %s,\n  message_id: %s,\n  reactions_data: %s,\n  reacted_message_id: %s,\n  reaction: %s,\n  applied_reaction: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.b;
        if (messageIdType != null && !messageIdType.equals(rvc.a)) {
            contentValues.put("message_id", Long.valueOf(rvc.a(this.b)));
        } else {
            contentValues.putNull("message_id");
        }
        wks wksVar = this.c;
        if (wksVar == null) {
            contentValues.putNull("reactions_data");
        } else {
            contentValues.put("reactions_data", wksVar.toByteArray());
        }
        MessageIdType messageIdType2 = this.d;
        if (messageIdType2 != null && !messageIdType2.equals(rvc.a)) {
            contentValues.put("reacted_message_id", Long.valueOf(rvc.a(this.d)));
        } else {
            contentValues.putNull("reacted_message_id");
        }
        wky wkyVar = this.e;
        if (wkyVar == null) {
            contentValues.putNull("reaction");
        } else {
            contentValues.put("reaction", Integer.valueOf(wkyVar.a()));
        }
        wku wkuVar = this.f;
        if (wkuVar == null) {
            contentValues.putNull("applied_reaction");
        } else {
            contentValues.put("applied_reaction", wkuVar.toByteArray());
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        rmb rmbVar = (rmb) agmqVar;
        aq();
        this.cJ = rmbVar.dx();
        if (rmbVar.db(0)) {
            this.a = rmbVar.c();
            fE(0);
        }
        if (rmbVar.db(1)) {
            this.b = rmbVar.e();
            fE(1);
        }
        if (rmbVar.db(2)) {
            this.c = rmbVar.g();
            fE(2);
        }
        if (rmbVar.db(3)) {
            this.d = rmbVar.f();
            fE(3);
        }
        if (rmbVar.db(4)) {
            this.e = rmbVar.i();
            fE(4);
        }
        if (rmbVar.db(5)) {
            this.f = rmbVar.h();
            fE(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rlx)) {
            return false;
        }
        rlx rlxVar = (rlx) obj;
        if (super.aC(rlxVar.cJ) && this.a == rlxVar.a && Objects.equals(this.b, rlxVar.b) && Objects.equals(this.c, rlxVar.c) && Objects.equals(this.d, rlxVar.d) && this.e == rlxVar.e && Objects.equals(this.f, rlxVar.f)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_reactions_backup", agnc.j(new String[]{"message_id", "reactions_data", "reacted_message_id", "reaction", "applied_reaction"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "message_reactions_backup";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        byte[] byteArray;
        Object valueOf;
        Object obj = new qwn((aglz) this, 17).get();
        wks wksVar = this.c;
        byte[] bArr = null;
        if (wksVar == null) {
            byteArray = null;
        } else {
            byteArray = wksVar.toByteArray();
        }
        Object obj2 = new qwn((aglz) this, 18).get();
        wky wkyVar = this.e;
        if (wkyVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(wkyVar.a());
        }
        wku wkuVar = this.f;
        if (wkuVar != null) {
            bArr = wkuVar.toByteArray();
        }
        Object[] objArr = {obj, byteArray, obj2, valueOf, bArr};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
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
            return String.format(Locale.US, "%s", "BackupMessageReactionsTable -- REDACTED");
        }
        return a();
    }
}
