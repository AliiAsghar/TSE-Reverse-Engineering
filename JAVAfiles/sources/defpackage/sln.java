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
public final class sln extends aglz implements agma {
    public long a;
    public MessageIdType b = rvc.a;
    public int c = 0;
    public String d;
    public String e;
    public String f;
    public rve g;
    public rve h;
    public boolean i;
    public long j;

    /* JADX INFO: Access modifiers changed from: protected */
    public sln() {
        rve rveVar = rve.a;
        this.g = rveVar;
        this.h = rveVar;
        this.i = false;
        this.j = 0L;
    }

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ConversationSuggestionsTable [_id: %s,\n  message_id: %s,\n  conversation_suggestion_type: %s,\n  properties: %s,\n  post_back_data: %s,\n  post_back_encoding: %s,\n  rcs_message_id: %s,\n  target_rcs_message_id: %s,\n  read: %s,\n  received_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType != null && !messageIdType.equals(rvc.a)) {
            contentValues.put("message_id", Long.valueOf(rvc.a(this.b)));
        } else {
            contentValues.putNull("message_id");
        }
        contentValues.put("conversation_suggestion_type", Integer.valueOf(this.c));
        agnc.r(contentValues, "properties", this.d);
        agnc.r(contentValues, "post_back_data", this.e);
        agnc.r(contentValues, "post_back_encoding", this.f);
        if (intValue >= 11001) {
            rve rveVar = this.g;
            if (rveVar == null) {
                contentValues.putNull("rcs_message_id");
            } else {
                contentValues.put("rcs_message_id", rve.d(rveVar));
            }
        }
        if (intValue >= 12000) {
            rve rveVar2 = this.h;
            if (rveVar2 == null) {
                contentValues.putNull("target_rcs_message_id");
            } else {
                contentValues.put("target_rcs_message_id", rve.d(rveVar2));
            }
        }
        if (intValue >= 12000) {
            contentValues.put("read", Boolean.valueOf(this.i));
        }
        if (intValue >= 12000) {
            contentValues.put("received_timestamp", Long.valueOf(this.j));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sls slsVar = (sls) agmqVar;
        aq();
        this.cJ = slsVar.dx();
        if (slsVar.db(0)) {
            this.a = slsVar.e();
            fE(0);
        }
        if (slsVar.db(1)) {
            this.b = slsVar.g();
            fE(1);
        }
        if (slsVar.db(2)) {
            this.c = slsVar.c();
            fE(2);
        }
        if (slsVar.db(3)) {
            this.d = slsVar.l();
            fE(3);
        }
        if (slsVar.db(4)) {
            this.e = slsVar.j();
            fE(4);
        }
        if (slsVar.db(5)) {
            this.f = slsVar.k();
            fE(5);
        }
        if (slsVar.db(6)) {
            this.g = slsVar.h();
            fE(6);
        }
        if (slsVar.db(7)) {
            this.h = slsVar.i();
            fE(7);
        }
        if (slsVar.db(8)) {
            this.i = slsVar.m();
            fE(8);
        }
        if (slsVar.db(9)) {
            this.j = slsVar.f();
            fE(9);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sln)) {
            return false;
        }
        sln slnVar = (sln) obj;
        if (super.aC(slnVar.cJ) && this.a == slnVar.a && Objects.equals(this.b, slnVar.b) && this.c == slnVar.c && Objects.equals(this.d, slnVar.d) && Objects.equals(this.e, slnVar.e) && Objects.equals(this.f, slnVar.f) && Objects.equals(this.g, slnVar.g) && Objects.equals(this.h, slnVar.h) && this.i == slnVar.i && this.j == slnVar.j) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_suggestions", agnc.j(new String[]{"message_id", "conversation_suggestion_type", "properties", "post_back_data", "post_back_encoding", "rcs_message_id", "target_rcs_message_id", "read", "received_timestamp"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final MessageIdType h() {
        ao(1, "message_id");
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
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "conversation_suggestions";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {new rnb((aglz) this, 16).get(), Integer.valueOf(this.c), this.d, this.e, this.f, rve.d(this.g), rve.d(this.h), Integer.valueOf(this.i ? 1 : 0), Long.valueOf(this.j)};
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

    public final rve k() {
        ao(7, "target_rcs_message_id");
        return this.h;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ConversationSuggestionsTable -- REDACTED");
        }
        return a();
    }
}
