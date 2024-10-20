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
public final class rki extends aglz implements agma {
    public long a;
    public int c;
    public boolean d;
    public boolean f;
    public ConversationIdType b = ruy.a;
    public qfe e = qfe.b(0);

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "BackupConversationParticipantsTable [_id: %s,\n  conversation_id: %s,\n  participant_id: %s,\n  is_normalized: %s,\n  rcs_group_join_status: %s,\n  is_c2p_only: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        int intValue = rkq.b().intValue();
        contentValues.put("_id", Long.valueOf(this.a));
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
            contentValues.put("conversation_id", Long.valueOf(ruy.a(this.b)));
        } else {
            contentValues.putNull("conversation_id");
        }
        contentValues.put("participant_id", Integer.valueOf(this.c));
        contentValues.put("is_normalized", Boolean.valueOf(this.d));
        qfe qfeVar = this.e;
        if (qfeVar == null) {
            contentValues.putNull("rcs_group_join_status");
        } else {
            contentValues.put("rcs_group_join_status", Integer.valueOf(qfeVar.e));
        }
        if (intValue >= 70) {
            contentValues.put("is_c2p_only", Boolean.valueOf(this.f));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        rkl rklVar = (rkl) agmqVar;
        aq();
        this.cJ = rklVar.dx();
        if (rklVar.db(0)) {
            this.a = rklVar.e();
            fE(0);
        }
        if (rklVar.db(1)) {
            this.b = rklVar.g();
            fE(1);
        }
        if (rklVar.db(2)) {
            this.c = rklVar.c();
            fE(2);
        }
        if (rklVar.db(3)) {
            this.d = rklVar.i();
            fE(3);
        }
        if (rklVar.db(4)) {
            this.e = rklVar.f();
            fE(4);
        }
        if (rklVar.db(5)) {
            this.f = rklVar.h();
            fE(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rki)) {
            return false;
        }
        rki rkiVar = (rki) obj;
        if (super.aC(rkiVar.cJ) && this.a == rkiVar.a && Objects.equals(this.b, rkiVar.b) && this.c == rkiVar.c && this.d == rkiVar.d && this.e == rkiVar.e && this.f == rkiVar.f) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_participants_backup", agnc.j(new String[]{"_id", "conversation_id", "participant_id", "is_normalized", "rcs_group_join_status", "is_c2p_only"}));
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
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, Integer.valueOf(this.c), Boolean.valueOf(this.d), this.e, Boolean.valueOf(this.f), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "conversation_participants_backup";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Long valueOf2 = Long.valueOf(this.a);
        Object obj = new qwn((aglz) this, 12).get();
        Integer valueOf3 = Integer.valueOf(this.c);
        Integer valueOf4 = Integer.valueOf(this.d ? 1 : 0);
        qfe qfeVar = this.e;
        if (qfeVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(qfeVar.e);
        }
        Object[] objArr = {valueOf2, obj, valueOf3, valueOf4, valueOf, Integer.valueOf(this.f ? 1 : 0)};
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

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "BackupConversationParticipantsTable -- REDACTED");
        }
        return a();
    }
}
