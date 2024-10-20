package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class swd extends aglz implements agma {
    public UUID a = uzz.i();
    public MessageIdType b = rvc.a;
    public long c;
    public long d;
    public tqs e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "MessageSendReceiveAttemptTable [_id: %s,\n  message_id: %s,\n  timestamp: %s,\n  message_sending_attempt: %s,\n  message_protocol: %s,\n  current_sim_network_country: %s,\n  current_sim_country: %s,\n  current_sim_carrier_country: %s,\n  settings_country: %s,\n  default_sms_sim_country: %s,\n  locale_country: %s,\n  default_sms_sim_network_country: %s,\n  default_sms_sim_carrier_country: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        UUID uuid = this.a;
        if (uuid == null) {
            contentValues.putNull("_id");
        } else {
            contentValues.put("_id", uzz.h(uuid));
        }
        MessageIdType messageIdType = this.b;
        if (messageIdType != null && !messageIdType.equals(rvc.a)) {
            contentValues.put("message_id", Long.valueOf(rvc.a(this.b)));
        } else {
            contentValues.putNull("message_id");
        }
        contentValues.put("timestamp", Long.valueOf(this.c));
        contentValues.put("message_sending_attempt", Long.valueOf(this.d));
        tqs tqsVar = this.e;
        if (tqsVar == null) {
            contentValues.putNull("message_protocol");
        } else {
            contentValues.put("message_protocol", Integer.valueOf(tqsVar.ordinal()));
        }
        agnc.r(contentValues, "current_sim_network_country", this.f);
        agnc.r(contentValues, "current_sim_country", this.g);
        agnc.r(contentValues, "current_sim_carrier_country", this.h);
        agnc.r(contentValues, "settings_country", this.i);
        agnc.r(contentValues, "default_sms_sim_country", this.j);
        agnc.r(contentValues, "locale_country", this.k);
        agnc.r(contentValues, "default_sms_sim_network_country", this.l);
        agnc.r(contentValues, "default_sms_sim_carrier_country", this.m);
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        swg swgVar = (swg) agmqVar;
        aq();
        this.cJ = swgVar.dx();
        if (swgVar.db(0)) {
            this.a = swgVar.p();
            fE(0);
        }
        if (swgVar.db(1)) {
            this.b = swgVar.f();
            fE(1);
        }
        if (swgVar.db(2)) {
            this.c = swgVar.e();
            fE(2);
        }
        if (swgVar.db(3)) {
            this.d = swgVar.c();
            fE(3);
        }
        if (swgVar.db(4)) {
            this.e = swgVar.g();
            fE(4);
        }
        if (swgVar.db(5)) {
            this.f = swgVar.j();
            fE(5);
        }
        if (swgVar.db(6)) {
            this.g = swgVar.i();
            fE(6);
        }
        if (swgVar.db(7)) {
            this.h = swgVar.h();
            fE(7);
        }
        if (swgVar.db(8)) {
            this.i = swgVar.o();
            fE(8);
        }
        if (swgVar.db(9)) {
            this.j = swgVar.l();
            fE(9);
        }
        if (swgVar.db(10)) {
            this.k = swgVar.n();
            fE(10);
        }
        if (swgVar.db(11)) {
            this.l = swgVar.m();
            fE(11);
        }
        if (swgVar.db(12)) {
            this.m = swgVar.k();
            fE(12);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof swd)) {
            return false;
        }
        swd swdVar = (swd) obj;
        if (super.aC(swdVar.cJ) && Objects.equals(this.a, swdVar.a) && Objects.equals(this.b, swdVar.b) && this.c == swdVar.c && this.d == swdVar.d && this.e == swdVar.e && Objects.equals(this.f, swdVar.f) && Objects.equals(this.g, swdVar.g) && Objects.equals(this.h, swdVar.h) && Objects.equals(this.i, swdVar.i) && Objects.equals(this.j, swdVar.j) && Objects.equals(this.k, swdVar.k) && Objects.equals(this.l, swdVar.l) && Objects.equals(this.m, swdVar.m)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_send_receive_attempt", agnc.j(new String[]{"_id", "message_id", "timestamp", "message_sending_attempt", "message_protocol", "current_sim_network_country", "current_sim_country", "current_sim_carrier_country", "settings_country", "default_sms_sim_country", "locale_country", "default_sms_sim_network_country", "default_sms_sim_carrier_country"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
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
        UUID uuid = this.a;
        MessageIdType messageIdType = this.b;
        Long valueOf = Long.valueOf(this.c);
        Long valueOf2 = Long.valueOf(this.d);
        tqs tqsVar = this.e;
        if (tqsVar == null) {
            ordinal = 0;
        } else {
            ordinal = tqsVar.ordinal();
        }
        return Objects.hash(adayVar, uuid, messageIdType, valueOf, valueOf2, Integer.valueOf(ordinal), this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "message_send_receive_attempt";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        String h = uzz.h(this.a);
        Object obj = new swc(this, 0).get();
        Long valueOf2 = Long.valueOf(this.c);
        Long valueOf3 = Long.valueOf(this.d);
        tqs tqsVar = this.e;
        if (tqsVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(tqsVar.ordinal());
        }
        Object[] objArr = {h, obj, valueOf2, valueOf3, valueOf, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m};
        sb.append('(');
        for (int i = 0; i < 13; i++) {
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
                sb.append(',');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "MessageSendReceiveAttemptTable -- REDACTED");
        }
        return a();
    }
}
