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
public final class sze extends aglz implements agma {
    public String a;
    public MessageIdType b = rvc.a;
    public long c = 0;
    public amhh d = amhh.b(0);
    public ammr e = ammr.b(0);
    public aqay f = aqay.b(0);
    public aqax g = aqax.b(0);
    public int h;
    public int i;
    public String j;
    public String k;
    public String l;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "P2pConversationSuggestionEventTable [id: %s,\n  message_id: %s,\n  timestamp: %s,\n  event_type: %s,\n  reply_mode: %s,\n  rejection_reason: %s,\n  action_source: %s,\n  num_of_items: %s,\n  click_index: %s,\n  impression_id: %s,\n  suggestion_types: %s,\n  model_output_label: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue >= 51030) {
            MessageIdType messageIdType = this.b;
            if (messageIdType != null && !messageIdType.equals(rvc.a)) {
                contentValues.put("message_id", Long.valueOf(rvc.a(this.b)));
            } else {
                contentValues.putNull("message_id");
            }
        }
        contentValues.put("timestamp", Long.valueOf(this.c));
        amhh amhhVar = this.d;
        if (amhhVar == null) {
            contentValues.putNull("event_type");
        } else {
            contentValues.put("event_type", Integer.valueOf(amhhVar.i));
        }
        ammr ammrVar = this.e;
        if (ammrVar == null) {
            contentValues.putNull("reply_mode");
        } else {
            contentValues.put("reply_mode", Integer.valueOf(ammrVar.d));
        }
        aqay aqayVar = this.f;
        if (aqayVar == null) {
            contentValues.putNull("rejection_reason");
        } else {
            contentValues.put("rejection_reason", Integer.valueOf(aqayVar.a()));
        }
        aqax aqaxVar = this.g;
        if (aqaxVar == null) {
            contentValues.putNull("action_source");
        } else {
            contentValues.put("action_source", Integer.valueOf(aqaxVar.a()));
        }
        contentValues.put("num_of_items", Integer.valueOf(this.h));
        contentValues.put("click_index", Integer.valueOf(this.i));
        agnc.r(contentValues, "impression_id", this.j);
        agnc.r(contentValues, "suggestion_types", this.k);
        if (intValue >= 42030) {
            agnc.r(contentValues, "model_output_label", this.l);
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        szi sziVar = (szi) agmqVar;
        aq();
        this.cJ = sziVar.dx();
        if (sziVar.db(0)) {
            this.a = sziVar.l();
            fE(0);
        }
        if (sziVar.db(1)) {
            this.b = sziVar.g();
            fE(1);
        }
        if (sziVar.db(2)) {
            this.c = sziVar.f();
            fE(2);
        }
        if (sziVar.db(3)) {
            this.d = sziVar.h();
            fE(3);
        }
        if (sziVar.db(4)) {
            this.e = sziVar.i();
            fE(4);
        }
        if (sziVar.db(5)) {
            this.f = sziVar.k();
            fE(5);
        }
        if (sziVar.db(6)) {
            this.g = sziVar.j();
            fE(6);
        }
        if (sziVar.db(7)) {
            this.h = sziVar.e();
            fE(7);
        }
        if (sziVar.db(8)) {
            this.i = sziVar.c();
            fE(8);
        }
        if (sziVar.db(9)) {
            this.j = sziVar.m();
            fE(9);
        }
        if (sziVar.db(10)) {
            this.k = sziVar.o();
            fE(10);
        }
        if (sziVar.db(11)) {
            this.l = sziVar.n();
            fE(11);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sze)) {
            return false;
        }
        sze szeVar = (sze) obj;
        if (super.aC(szeVar.cJ) && Objects.equals(this.a, szeVar.a) && Objects.equals(this.b, szeVar.b) && this.c == szeVar.c && this.d == szeVar.d && this.e == szeVar.e && this.f == szeVar.f && this.g == szeVar.g && this.h == szeVar.h && this.i == szeVar.i && Objects.equals(this.j, szeVar.j) && Objects.equals(this.k, szeVar.k) && Objects.equals(this.l, szeVar.l)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "p2p_conversation_suggestion_event", agnc.j(new String[]{"message_id", "timestamp", "event_type", "reply_mode", "rejection_reason", "action_source", "num_of_items", "click_index", "impression_id", "suggestion_types", "model_output_label"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "id";
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k, this.l, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "p2p_conversation_suggestion_event";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Object valueOf2;
        Object valueOf3;
        Object obj = new swc(this, 15).get();
        Long valueOf4 = Long.valueOf(this.c);
        amhh amhhVar = this.d;
        Object obj2 = 0;
        if (amhhVar == null) {
            valueOf = obj2;
        } else {
            valueOf = String.valueOf(amhhVar.i);
        }
        ammr ammrVar = this.e;
        if (ammrVar == null) {
            valueOf2 = obj2;
        } else {
            valueOf2 = String.valueOf(ammrVar.d);
        }
        aqay aqayVar = this.f;
        if (aqayVar == null) {
            valueOf3 = obj2;
        } else {
            valueOf3 = String.valueOf(aqayVar.a());
        }
        aqax aqaxVar = this.g;
        if (aqaxVar != null) {
            obj2 = String.valueOf(aqaxVar.a());
        }
        Object[] objArr = {obj, valueOf4, valueOf, valueOf2, valueOf3, obj2, Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k, this.l};
        sb.append('(');
        for (int i = 0; i < 11; i++) {
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
                sb.append(',');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "P2pConversationSuggestionEventTable -- REDACTED");
        }
        return a();
    }
}
