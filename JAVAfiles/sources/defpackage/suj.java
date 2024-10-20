package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aglz;
import j$.time.Instant;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class suj extends aglz implements agma {
    public MessageIdType a;
    public MessageIdType b;
    public rve c;
    public Instant d;
    public Instant e;

    /* JADX INFO: Access modifiers changed from: protected */
    public suj() {
        MessageIdType messageIdType = rvc.a;
        this.a = messageIdType;
        this.b = messageIdType;
        this.c = rve.a;
        this.d = Instant.EPOCH;
        this.e = Instant.EPOCH;
    }

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "MessageEditsTable [message_id: %s,\n  latest_message_id: %s,\n  original_rcs_message_id: %s,\n  edited_at_timestamp_ms: %s,\n  received_at_timestamp_ms: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.a;
        if (messageIdType != null && !messageIdType.equals(rvc.a)) {
            contentValues.put("message_id", Long.valueOf(rvc.a(this.a)));
        } else {
            contentValues.putNull("message_id");
        }
        MessageIdType messageIdType2 = this.b;
        if (messageIdType2 != null && !messageIdType2.equals(rvc.a)) {
            contentValues.put("latest_message_id", Long.valueOf(rvc.a(this.b)));
        } else {
            contentValues.putNull("latest_message_id");
        }
        rve rveVar = this.c;
        if (rveVar == null) {
            contentValues.putNull("original_rcs_message_id");
        } else {
            contentValues.put("original_rcs_message_id", rve.d(rveVar));
        }
        Instant instant = this.d;
        if (instant == null) {
            contentValues.putNull("edited_at_timestamp_ms");
        } else {
            contentValues.put("edited_at_timestamp_ms", Long.valueOf(uzz.k(instant)));
        }
        Instant instant2 = this.e;
        if (instant2 == null) {
            contentValues.putNull("received_at_timestamp_ms");
        } else {
            contentValues.put("received_at_timestamp_ms", Long.valueOf(uzz.k(instant2)));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        sun sunVar = (sun) agmqVar;
        aq();
        this.cJ = sunVar.dx();
        if (sunVar.db(0)) {
            this.a = sunVar.e();
            fE(0);
        }
        if (sunVar.db(1)) {
            this.b = sunVar.c();
            fE(1);
        }
        if (sunVar.db(2)) {
            this.c = sunVar.f();
            fE(2);
        }
        if (sunVar.db(3)) {
            this.d = sunVar.g();
            fE(3);
        }
        if (sunVar.db(4)) {
            this.e = sunVar.h();
            fE(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof suj)) {
            return false;
        }
        suj sujVar = (suj) obj;
        if (super.aC(sujVar.cJ) && Objects.equals(this.a, sujVar.a) && Objects.equals(this.b, sujVar.b) && Objects.equals(this.c, sujVar.c) && Objects.equals(this.d, sujVar.d) && Objects.equals(this.e, sujVar.e)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_edits", agnc.j(new String[]{"message_id", "latest_message_id", "original_rcs_message_id", "edited_at_timestamp_ms", "received_at_timestamp_ms"}));
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
        return Objects.hash(adayVar, this.a, this.b, this.c, this.d, this.e, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "message_edits";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {new snj(this, 14).get(), new snj(this, 15).get(), rve.d(this.c), Long.valueOf(uzz.k(this.d)), Long.valueOf(uzz.k(this.e))};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
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

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "MessageEditsTable -- REDACTED");
        }
        return a();
    }
}
