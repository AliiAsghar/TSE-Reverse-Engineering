package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class swl extends aglz implements agma {
    public long a;
    public MessageIdType b = rvc.a;
    public ConversationIdType c = ruy.a;
    public int d = 0;
    public float e = brg.a;
    public amzp f = amzp.SPAM;
    public String g = "";
    public long h = 0;
    public amzf i = amzf.UNKNOWN_DETECTION_TRIGGER_TYPE;
    public apzk j = apzk.UNKNOWN_SPAM_VERDICT_ENFORCEMENT_ACTION;
    public int k = 0;
    public amzq l = amzq.UNKNOWN_SPAM_ERROR;
    public int m = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "MessageSpamTable [_id: %s,\n  message_id: %s,\n  conversation_id: %s,\n  source: %s,\n  score: %s,\n  outcome: %s,\n  ares_initiated_by: %s,\n  classification_timestamp: %s,\n  trigger: %s,\n  action_type: %s,\n  action_contributors: %s,\n  error_code: %s,\n  reclassification_index: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m));
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
        if (intValue >= 59460) {
            ConversationIdType conversationIdType = this.c;
            if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
                contentValues.put("conversation_id", Long.valueOf(ruy.a(this.c)));
            } else {
                contentValues.putNull("conversation_id");
            }
        }
        contentValues.put("source", Integer.valueOf(this.d));
        if (intValue >= 45040) {
            contentValues.put("score", Float.valueOf(this.e));
        }
        if (intValue >= 58030) {
            amzp amzpVar = this.f;
            if (amzpVar == null) {
                contentValues.putNull("outcome");
            } else {
                contentValues.put("outcome", Integer.valueOf(amzpVar.a()));
            }
        }
        if (intValue >= 58100) {
            agnc.r(contentValues, "ares_initiated_by", this.g);
        }
        if (intValue >= 59190) {
            contentValues.put("classification_timestamp", Long.valueOf(this.h));
        }
        if (intValue >= 59460) {
            amzf amzfVar = this.i;
            if (amzfVar == null) {
                contentValues.putNull("trigger");
            } else {
                contentValues.put("trigger", Integer.valueOf(amzfVar.a()));
            }
        }
        if (intValue >= 59460) {
            apzk apzkVar = this.j;
            if (apzkVar == null) {
                contentValues.putNull("action_type");
            } else {
                contentValues.put("action_type", Integer.valueOf(apzkVar.a()));
            }
        }
        if (intValue >= 59460) {
            contentValues.put("action_contributors", Integer.valueOf(this.k));
        }
        if (intValue >= 59460) {
            amzq amzqVar = this.l;
            if (amzqVar == null) {
                contentValues.putNull("error_code");
            } else {
                contentValues.put("error_code", Integer.valueOf(amzqVar.a()));
            }
        }
        if (intValue >= 59460) {
            contentValues.put("reclassification_index", Integer.valueOf(this.m));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        swq swqVar = (swq) agmqVar;
        aq();
        this.cJ = swqVar.dx();
        if (swqVar.db(0)) {
            this.a = swqVar.i();
            fE(0);
        }
        if (swqVar.db(1)) {
            this.b = swqVar.k();
            fE(1);
        }
        if (swqVar.db(2)) {
            this.c = swqVar.j();
            fE(2);
        }
        if (swqVar.db(3)) {
            this.d = swqVar.g();
            fE(3);
        }
        if (swqVar.db(4)) {
            this.e = swqVar.c();
            fE(4);
        }
        if (swqVar.db(5)) {
            this.f = swqVar.m();
            fE(5);
        }
        if (swqVar.db(6)) {
            this.g = swqVar.p();
            fE(6);
        }
        if (swqVar.db(7)) {
            this.h = swqVar.h();
            fE(7);
        }
        if (swqVar.db(8)) {
            this.i = swqVar.l();
            fE(8);
        }
        if (swqVar.db(9)) {
            this.j = swqVar.o();
            fE(9);
        }
        if (swqVar.db(10)) {
            this.k = swqVar.e();
            fE(10);
        }
        if (swqVar.db(11)) {
            this.l = swqVar.n();
            fE(11);
        }
        if (swqVar.db(12)) {
            this.m = swqVar.f();
            fE(12);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof swl)) {
            return false;
        }
        swl swlVar = (swl) obj;
        if (super.aC(swlVar.cJ) && this.a == swlVar.a && Objects.equals(this.b, swlVar.b) && Objects.equals(this.c, swlVar.c) && this.d == swlVar.d && this.e == swlVar.e && this.f == swlVar.f && Objects.equals(this.g, swlVar.g) && this.h == swlVar.h && this.i == swlVar.i && this.j == swlVar.j && this.k == swlVar.k && this.l == swlVar.l && this.m == swlVar.m) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_spam", agnc.j(new String[]{"message_id", "conversation_id", "source", "score", "outcome", "ares_initiated_by", "classification_timestamp", "trigger", "action_type", "action_contributors", "error_code", "reclassification_index"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final float h() {
        ao(4, "score");
        return this.e;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, this.c, Integer.valueOf(this.d), Float.valueOf(this.e), this.f, this.g, Long.valueOf(this.h), this.i, this.j, Integer.valueOf(this.k), this.l, Integer.valueOf(this.m), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "message_spam";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Object valueOf2;
        Object valueOf3;
        Object obj = new swc(this, 2).get();
        Object obj2 = new swc(this, 3).get();
        Integer valueOf4 = Integer.valueOf(this.d);
        Float valueOf5 = Float.valueOf(this.e);
        amzp amzpVar = this.f;
        Object obj3 = 0;
        if (amzpVar == null) {
            valueOf = obj3;
        } else {
            valueOf = String.valueOf(amzpVar.a());
        }
        String str = this.g;
        Long valueOf6 = Long.valueOf(this.h);
        amzf amzfVar = this.i;
        if (amzfVar == null) {
            valueOf2 = obj3;
        } else {
            valueOf2 = String.valueOf(amzfVar.a());
        }
        apzk apzkVar = this.j;
        if (apzkVar == null) {
            valueOf3 = obj3;
        } else {
            valueOf3 = String.valueOf(apzkVar.a());
        }
        Integer valueOf7 = Integer.valueOf(this.k);
        amzq amzqVar = this.l;
        if (amzqVar != null) {
            obj3 = String.valueOf(amzqVar.a());
        }
        Object[] objArr = {obj, obj2, valueOf4, valueOf5, valueOf, str, valueOf6, valueOf2, valueOf3, valueOf7, obj3, Integer.valueOf(this.m)};
        sb.append('(');
        for (int i = 0; i < 12; i++) {
            Object obj4 = objArr[i];
            if (obj4 instanceof Number) {
                sb.append(String.valueOf(obj4));
            } else {
                if (obj4 instanceof String) {
                    String str2 = (String) obj4;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
                    }
                }
                list.add(obj4);
                sb.append('?');
                sb.append(',');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final int k() {
        ao(3, "source");
        return this.d;
    }

    public final long l() {
        ao(7, "classification_timestamp");
        return this.h;
    }

    public final amzf m() {
        ao(8, "trigger");
        return this.i;
    }

    public final amzp n() {
        ao(5, "outcome");
        return this.f;
    }

    public final amzq o() {
        ao(11, "error_code");
        return this.l;
    }

    public final apzk p() {
        ao(9, "action_type");
        return this.j;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "MessageSpamTable -- REDACTED");
        }
        return a();
    }
}
