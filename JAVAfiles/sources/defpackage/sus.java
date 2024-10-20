package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sus extends aglz implements agma {
    public String a;
    public int c;
    public sva d;
    public svb e;
    public MessageIdType b = rvc.a;
    public String f = "";
    public String g = "";

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "MessageLabelsTable [_id: %s,\n  message_id: %s,\n  label: %s,\n  confidence: %s,\n  source: %s,\n  intent: %s,\n  model_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
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
        contentValues.put(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, Integer.valueOf(this.c));
        if (intValue >= 53060) {
            sva svaVar = this.d;
            if (svaVar == null) {
                contentValues.putNull("confidence");
            } else {
                contentValues.put("confidence", Integer.valueOf(svaVar.ordinal()));
            }
        }
        svb svbVar = this.e;
        if (svbVar == null) {
            contentValues.putNull("source");
        } else {
            contentValues.put("source", Integer.valueOf(svbVar.ordinal()));
        }
        if (intValue >= 58590) {
            agnc.r(contentValues, "intent", this.f);
        }
        agnc.r(contentValues, "model_id", this.g);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        suv suvVar = (suv) agmqVar;
        aq();
        this.cJ = suvVar.dx();
        if (suvVar.db(0)) {
            this.a = suvVar.h();
            fE(0);
        }
        if (suvVar.db(1)) {
            this.b = suvVar.e();
            fE(1);
        }
        if (suvVar.db(2)) {
            this.c = suvVar.c();
            fE(2);
        }
        if (suvVar.db(3)) {
            this.d = suvVar.f();
            fE(3);
        }
        if (suvVar.db(4)) {
            this.e = suvVar.g();
            fE(4);
        }
        if (suvVar.db(5)) {
            this.f = suvVar.i();
            fE(5);
        }
        if (suvVar.db(6)) {
            this.g = suvVar.j();
            fE(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sus)) {
            return false;
        }
        sus susVar = (sus) obj;
        if (super.aC(susVar.cJ) && Objects.equals(this.a, susVar.a) && Objects.equals(this.b, susVar.b) && this.c == susVar.c && this.d == susVar.d && this.e == susVar.e && Objects.equals(this.f, susVar.f) && Objects.equals(this.g, susVar.g)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_labels", agnc.j(new String[]{"message_id", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, "confidence", "source", "intent", "model_id"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final int hashCode() {
        aday adayVar;
        int ordinal;
        int ordinal2;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        String str = this.a;
        MessageIdType messageIdType = this.b;
        Integer valueOf = Integer.valueOf(this.c);
        sva svaVar = this.d;
        if (svaVar == null) {
            ordinal = 0;
        } else {
            ordinal = svaVar.ordinal();
        }
        Integer valueOf2 = Integer.valueOf(ordinal);
        svb svbVar = this.e;
        if (svbVar == null) {
            ordinal2 = 0;
        } else {
            ordinal2 = svbVar.ordinal();
        }
        return Objects.hash(adayVar, str, messageIdType, valueOf, valueOf2, Integer.valueOf(ordinal2), this.f, this.g, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "message_labels";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Object obj = new snj(this, 16).get();
        Integer valueOf2 = Integer.valueOf(this.c);
        sva svaVar = this.d;
        Object obj2 = 0;
        if (svaVar == null) {
            valueOf = obj2;
        } else {
            valueOf = String.valueOf(svaVar.ordinal());
        }
        svb svbVar = this.e;
        if (svbVar != null) {
            obj2 = String.valueOf(svbVar.ordinal());
        }
        Object[] objArr = {obj, valueOf2, valueOf, obj2, this.f, this.g};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
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
            return String.format(Locale.US, "%s", "MessageLabelsTable -- REDACTED");
        }
        return a();
    }
}
