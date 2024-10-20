package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sku extends aglz<skx, skz, sla, sku, skw> implements agma<Long> {
    public String a;
    public long c;
    public ConversationIdType b = ruy.a;
    public boolean d = false;
    public qfe e = qfe.UNKNOWN_STATE;
    public rxg f = vcp.m();

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ConversationParticipantsTable [_id: %s,\n  conversation_id: %s,\n  participant_id: %s,\n  is_normalized: %s,\n  rcs_group_join_status: %s,\n  last_modified_by_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
            contentValues.put("conversation_id", Long.valueOf(ruy.a(this.b)));
        } else {
            contentValues.putNull("conversation_id");
        }
        agnc.q(contentValues, "participant_id", this.c);
        if (intValue >= 58090) {
            contentValues.put("is_normalized", Boolean.valueOf(this.d));
        }
        if (intValue >= 58570) {
            qfe qfeVar = this.e;
            if (qfeVar == null) {
                contentValues.putNull("rcs_group_join_status");
            } else {
                contentValues.put("rcs_group_join_status", Integer.valueOf(qfeVar.e));
            }
        }
        if (intValue >= 59440) {
            rxg rxgVar = this.f;
            if (rxgVar == null) {
                contentValues.putNull("last_modified_by_key");
            } else {
                contentValues.put("last_modified_by_key", vcp.n(rxgVar));
            }
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        skx skxVar = (skx) agmqVar;
        aq();
        this.cJ = skxVar.dx();
        if (skxVar.db(0)) {
            this.a = skxVar.h();
            fE(0);
        }
        if (skxVar.db(1)) {
            this.b = skxVar.f();
            fE(1);
        }
        if (skxVar.db(2)) {
            this.c = skxVar.c();
            fE(2);
        }
        if (skxVar.db(3)) {
            this.d = skxVar.i();
            fE(3);
        }
        if (skxVar.db(4)) {
            this.e = skxVar.e();
            fE(4);
        }
        if (skxVar.db(5)) {
            this.f = skxVar.g();
            fE(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sku)) {
            return false;
        }
        sku skuVar = (sku) obj;
        if (super.aC(skuVar.cJ) && Objects.equals(this.a, skuVar.a) && Objects.equals(this.b, skuVar.b) && this.c == skuVar.c && this.d == skuVar.d && this.e == skuVar.e && Objects.equals(this.f, skuVar.f)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_participants", agnc.j(new String[]{"conversation_id", "participant_id", "is_normalized", "rcs_group_join_status", "last_modified_by_key"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final long h() {
        ao(2, "participant_id");
        return this.c;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, this.b, Long.valueOf(this.c), Boolean.valueOf(this.d), this.e, this.f, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "conversation_participants";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Object obj = new rnb((aglz) this, 14).get();
        Long valueOf2 = Long.valueOf(this.c);
        Integer valueOf3 = Integer.valueOf(this.d ? 1 : 0);
        qfe qfeVar = this.e;
        if (qfeVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(qfeVar.e);
        }
        Object[] objArr = {obj, valueOf2, valueOf3, valueOf, vcp.n(this.f)};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
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

    public final qfe k() {
        ao(4, "rcs_group_join_status");
        return this.e;
    }

    public final ConversationIdType l() {
        ao(1, "conversation_id");
        return this.b;
    }

    public final rxg m() {
        ao(5, "last_modified_by_key");
        return this.f;
    }

    public final boolean n() {
        ao(3, "is_normalized");
        return this.d;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ConversationParticipantsTable -- REDACTED");
        }
        return a();
    }
}
