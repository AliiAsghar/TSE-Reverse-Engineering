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
public final class szn extends aglz implements agma {
    public String a;
    public aqcz d;
    public MessageIdType b = rvc.a;
    public long c = 0;
    public aqbc e = aqbc.UNKNOWN_SUGGESTION_TYPE;
    public aqba f = aqba.UNKNOWN_STATUS;
    public aqbb g = aqbb.UNCONSUMED;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "P2pSuggestionsTable [_id: %s,\n  target_message_id: %s,\n  generated_timestamp: %s,\n  suggestion: %s,\n  smart_suggestion_type: %s,\n  suggestion_status: %s,\n  consumption_state: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        byte[] byteArray;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType != null && !messageIdType.equals(rvc.a)) {
            contentValues.put("target_message_id", Long.valueOf(rvc.a(this.b)));
        } else {
            contentValues.putNull("target_message_id");
        }
        contentValues.put("generated_timestamp", Long.valueOf(this.c));
        aqcz aqczVar = this.d;
        if (aqczVar == null) {
            byteArray = null;
        } else {
            byteArray = aqczVar.toByteArray();
        }
        contentValues.put("suggestion", byteArray);
        aqbc aqbcVar = this.e;
        if (aqbcVar == null) {
            contentValues.putNull("smart_suggestion_type");
        } else {
            contentValues.put("smart_suggestion_type", Integer.valueOf(aqbcVar.a()));
        }
        aqba aqbaVar = this.f;
        if (aqbaVar == null) {
            contentValues.putNull("suggestion_status");
        } else {
            contentValues.put("suggestion_status", Integer.valueOf(aqbaVar.a()));
        }
        if (intValue >= 53080) {
            aqbb aqbbVar = this.g;
            if (aqbbVar == null) {
                contentValues.putNull("consumption_state");
            } else {
                contentValues.put("consumption_state", Integer.valueOf(aqbbVar.a()));
            }
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        szp szpVar = (szp) agmqVar;
        aq();
        this.cJ = szpVar.dx();
        if (szpVar.db(0)) {
            this.a = szpVar.j();
            fE(0);
        }
        if (szpVar.db(1)) {
            this.b = szpVar.e();
            fE(1);
        }
        if (szpVar.db(2)) {
            this.c = szpVar.c();
            fE(2);
        }
        if (szpVar.db(3)) {
            this.d = szpVar.i();
            fE(3);
        }
        if (szpVar.db(4)) {
            this.e = szpVar.h();
            fE(4);
        }
        if (szpVar.db(5)) {
            this.f = szpVar.f();
            fE(5);
        }
        if (szpVar.db(6)) {
            this.g = szpVar.g();
            fE(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof szn)) {
            return false;
        }
        szn sznVar = (szn) obj;
        if (super.aC(sznVar.cJ) && Objects.equals(this.a, sznVar.a) && Objects.equals(this.b, sznVar.b) && this.c == sznVar.c && Objects.equals(this.d, sznVar.d) && this.e == sznVar.e && this.f == sznVar.f && this.g == sznVar.g) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "p2p_suggestions", agnc.j(new String[]{"target_message_id", "generated_timestamp", "suggestion", "smart_suggestion_type", "suggestion_status", "consumption_state"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final aqba h() {
        ao(5, "suggestion_status");
        return this.f;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "p2p_suggestions";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        byte[] byteArray;
        Object valueOf;
        Object valueOf2;
        Object valueOf3;
        Object obj = new swc(this, 16).get();
        Long valueOf4 = Long.valueOf(this.c);
        aqcz aqczVar = this.d;
        if (aqczVar == null) {
            byteArray = null;
        } else {
            byteArray = aqczVar.toByteArray();
        }
        aqbc aqbcVar = this.e;
        if (aqbcVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(aqbcVar.a());
        }
        aqba aqbaVar = this.f;
        if (aqbaVar == null) {
            valueOf2 = 0;
        } else {
            valueOf2 = String.valueOf(aqbaVar.a());
        }
        aqbb aqbbVar = this.g;
        if (aqbbVar == null) {
            valueOf3 = 0;
        } else {
            valueOf3 = String.valueOf(aqbbVar.a());
        }
        Object[] objArr = {obj, valueOf4, byteArray, valueOf, valueOf2, valueOf3};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
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

    public final aqcz k() {
        ao(3, "suggestion");
        return this.d;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "P2pSuggestionsTable -- REDACTED");
        }
        return a();
    }
}
