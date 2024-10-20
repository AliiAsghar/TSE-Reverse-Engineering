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
public final class tka extends aglz implements agma {
    public MessageIdType a = rvc.a;
    public wrh b = wrh.HELP_NOT_LONGER_NEED;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "SatelliteEmergencyDetailsTable [message_id: %s,\n  help_state: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.a;
        if (messageIdType != null && !messageIdType.equals(rvc.a)) {
            contentValues.put("message_id", Long.valueOf(rvc.a(this.a)));
        } else {
            contentValues.putNull("message_id");
        }
        wrh wrhVar = this.b;
        if (wrhVar == null) {
            contentValues.putNull("help_state");
        } else {
            contentValues.put("help_state", Integer.valueOf(wrhVar.a()));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tkc tkcVar = (tkc) agmqVar;
        aq();
        this.cJ = tkcVar.dx();
        if (tkcVar.db(0)) {
            this.a = tkcVar.c();
            fE(0);
        }
        if (tkcVar.db(1)) {
            this.b = tkcVar.e();
            fE(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tka)) {
            return false;
        }
        tka tkaVar = (tka) obj;
        if (super.aC(tkaVar.cJ) && Objects.equals(this.a, tkaVar.a) && this.b == tkaVar.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "satellite_emergency_details", agnc.j(new String[]{"message_id", "help_state"}));
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
        return Objects.hash(adayVar, this.a, this.b, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "satellite_emergency_details";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        Object obj = new tbv((aglz) this, 6).get();
        wrh wrhVar = this.b;
        if (wrhVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(wrhVar.a());
        }
        Object[] objArr = {obj, valueOf};
        sb.append('(');
        for (int i = 0; i < 2; i++) {
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
            return String.format(Locale.US, "%s", "SatelliteEmergencyDetailsTable -- REDACTED");
        }
        return a();
    }
}
