package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.time.Instant;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sez extends aglz implements agma {
    public long a;
    public ymx b = ymx.b(0);
    public ymw c = ymw.b(0);
    public Instant d = Instant.EPOCH;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "A2pConversationSubscriptionsTable [participant_id: %s,\n  conversation_toolstone_state: %s,\n  conversation_subscription_state: %s,\n  last_action_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.q(contentValues, "participant_id", this.a);
        ymx ymxVar = this.b;
        if (ymxVar == null) {
            contentValues.putNull("conversation_toolstone_state");
        } else {
            contentValues.put("conversation_toolstone_state", Integer.valueOf(ymxVar.a()));
        }
        ymw ymwVar = this.c;
        if (ymwVar == null) {
            contentValues.putNull("conversation_subscription_state");
        } else {
            contentValues.put("conversation_subscription_state", Integer.valueOf(ymwVar.a()));
        }
        Instant instant = this.d;
        if (instant == null) {
            contentValues.putNull("last_action_timestamp");
        } else {
            contentValues.put("last_action_timestamp", Long.valueOf(uzz.k(instant)));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sfb sfbVar = (sfb) agmqVar;
        aq();
        this.cJ = sfbVar.dx();
        if (sfbVar.db(0)) {
            this.a = sfbVar.c();
            fE(0);
        }
        if (sfbVar.db(1)) {
            this.b = sfbVar.f();
            fE(1);
        }
        if (sfbVar.db(2)) {
            this.c = sfbVar.e();
            fE(2);
        }
        if (sfbVar.db(3)) {
            this.d = sfbVar.g();
            fE(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sez)) {
            return false;
        }
        sez sezVar = (sez) obj;
        if (super.aC(sezVar.cJ) && this.a == sezVar.a && this.b == sezVar.b && this.c == sezVar.c && Objects.equals(this.d, sezVar.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "a2p_conversation_subscriptions", agnc.j(new String[]{"participant_id", "conversation_toolstone_state", "conversation_subscription_state", "last_action_timestamp"}));
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
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, this.c, this.d, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "a2p_conversation_subscriptions";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Long valueOf2 = Long.valueOf(this.a);
        ymx ymxVar = this.b;
        Object obj = 0;
        if (ymxVar == null) {
            valueOf = obj;
        } else {
            valueOf = String.valueOf(ymxVar.a());
        }
        ymw ymwVar = this.c;
        if (ymwVar != null) {
            obj = String.valueOf(ymwVar.a());
        }
        Object[] objArr = {valueOf2, valueOf, obj, Long.valueOf(uzz.k(this.d))};
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

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "A2pConversationSubscriptionsTable -- REDACTED");
        }
        return a();
    }
}
