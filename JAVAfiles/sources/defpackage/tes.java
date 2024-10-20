package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aglz;
import j$.util.Objects;
import j$.util.Optional;
import java.util.BitSet;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tes extends aglz implements agma {
    public String a;
    public long c;
    public MessageIdType b = rvc.a;
    public long d = 0;
    public long e = 0;
    public Optional f = uxi.g(-1);

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ReadReportsTable [_id: %s,\n  message_id: %s,\n  participant_id: %s,\n  receive_time: %s,\n  read_time: %s,\n  ftd_time: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
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
        agnc.q(contentValues, "participant_id", this.c);
        contentValues.put("receive_time", Long.valueOf(this.d));
        contentValues.put("read_time", Long.valueOf(this.e));
        if (intValue >= 58880) {
            Optional optional = this.f;
            if (optional == null) {
                contentValues.putNull("ftd_time");
            } else {
                contentValues.put("ftd_time", Long.valueOf(uxi.f(optional)));
            }
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tev tevVar = (tev) agmqVar;
        aq();
        this.cJ = tevVar.dx();
        if (tevVar.db(0)) {
            this.a = tevVar.i();
            fE(0);
        }
        if (tevVar.db(1)) {
            this.b = tevVar.g();
            fE(1);
        }
        if (tevVar.db(2)) {
            this.c = tevVar.c();
            fE(2);
        }
        if (tevVar.db(3)) {
            this.d = tevVar.f();
            fE(3);
        }
        if (tevVar.db(4)) {
            this.e = tevVar.e();
            fE(4);
        }
        if (tevVar.db(5)) {
            this.f = tevVar.h();
            fE(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tes)) {
            return false;
        }
        tes tesVar = (tes) obj;
        if (super.aC(tesVar.cJ) && Objects.equals(this.a, tesVar.a) && Objects.equals(this.b, tesVar.b) && this.c == tesVar.c && this.d == tesVar.d && this.e == tesVar.e && Objects.equals(this.f, tesVar.f)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "read_reports", agnc.j(new String[]{"message_id", "participant_id", "receive_time", "read_time", "ftd_time"}));
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
        return Objects.hash(adayVar, this.a, this.b, Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), this.f, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "read_reports";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {new tbv((aglz) this, 2).get(), Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(uxi.f(this.f))};
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

    public final long k() {
        ao(4, "read_time");
        return this.e;
    }

    public final MessageIdType l() {
        ao(1, "message_id");
        return this.b;
    }

    public final tet m() {
        BitSet bitSet;
        int i = tdb.a;
        tet tetVar = new tet();
        BitSet bitSet2 = this.cE;
        if (bitSet2 == null) {
            bitSet = null;
        } else {
            bitSet = (BitSet) bitSet2.clone();
        }
        tetVar.ax = bitSet;
        BitSet bitSet3 = tetVar.ax;
        if (bitSet3 == null || bitSet3.get(0)) {
            ao(0, "_id");
            tetVar.a = this.a;
        }
        BitSet bitSet4 = tetVar.ax;
        if (bitSet4 == null || bitSet4.get(1)) {
            tetVar.e = l();
        }
        BitSet bitSet5 = tetVar.ax;
        if (bitSet5 == null || bitSet5.get(2)) {
            tetVar.b = h();
        }
        BitSet bitSet6 = tetVar.ax;
        if (bitSet6 == null || bitSet6.get(3)) {
            ao(3, "receive_time");
            tetVar.c = this.d;
        }
        BitSet bitSet7 = tetVar.ax;
        if (bitSet7 == null || bitSet7.get(4)) {
            tetVar.d = k();
        }
        BitSet bitSet8 = tetVar.ax;
        if (bitSet8 == null || bitSet8.get(5)) {
            tetVar.f = n();
        }
        return tetVar;
    }

    public final Optional n() {
        ao(5, "ftd_time");
        return this.f;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ReadReportsTable -- REDACTED");
        }
        return a();
    }
}
