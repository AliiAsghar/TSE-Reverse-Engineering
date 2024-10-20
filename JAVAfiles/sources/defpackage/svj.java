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
public final class svj extends aglz implements agma {
    public long a;
    public MessageIdType b;
    public wks c;
    public MessageIdType d;
    public wky e;
    public wku f;
    public wku g;

    /* JADX INFO: Access modifiers changed from: protected */
    public svj() {
        MessageIdType messageIdType = rvc.a;
        this.b = messageIdType;
        this.d = messageIdType;
        this.e = wky.b(0);
    }

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "MessageReactionsTable [_id: %s,\n  message_id: %s,\n  reactions_data: %s,\n  reacted_message_id: %s,\n  reaction: %s,\n  applied_reaction: %s,\n  animation_effect: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
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
        wks wksVar = this.c;
        if (wksVar == null) {
            contentValues.putNull("reactions_data");
        } else {
            contentValues.put("reactions_data", wksVar.toByteArray());
        }
        if (intValue >= 46020) {
            MessageIdType messageIdType2 = this.d;
            if (messageIdType2 != null && !messageIdType2.equals(rvc.a)) {
                contentValues.put("reacted_message_id", Long.valueOf(rvc.a(this.d)));
            } else {
                contentValues.putNull("reacted_message_id");
            }
        }
        if (intValue >= 48000) {
            wky wkyVar = this.e;
            if (wkyVar == null) {
                contentValues.putNull("reaction");
            } else {
                contentValues.put("reaction", Integer.valueOf(wkyVar.a()));
            }
        }
        if (intValue >= 59060) {
            wku wkuVar = this.f;
            if (wkuVar == null) {
                contentValues.putNull("applied_reaction");
            } else {
                contentValues.put("applied_reaction", wkuVar.toByteArray());
            }
        }
        if (intValue >= 59520) {
            wku wkuVar2 = this.g;
            if (wkuVar2 == null) {
                contentValues.putNull("animation_effect");
            } else {
                contentValues.put("animation_effect", wkuVar2.toByteArray());
            }
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        svl svlVar = (svl) agmqVar;
        aq();
        this.cJ = svlVar.dx();
        if (svlVar.db(0)) {
            this.a = svlVar.c();
            fE(0);
        }
        if (svlVar.db(1)) {
            this.b = svlVar.e();
            fE(1);
        }
        if (svlVar.db(2)) {
            this.c = svlVar.g();
            fE(2);
        }
        if (svlVar.db(3)) {
            this.d = svlVar.f();
            fE(3);
        }
        if (svlVar.db(4)) {
            this.e = svlVar.j();
            fE(4);
        }
        if (svlVar.db(5)) {
            this.f = svlVar.i();
            fE(5);
        }
        if (svlVar.db(6)) {
            this.g = svlVar.h();
            fE(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof svj)) {
            return false;
        }
        svj svjVar = (svj) obj;
        if (super.aC(svjVar.cJ) && this.a == svjVar.a && Objects.equals(this.b, svjVar.b) && Objects.equals(this.c, svjVar.c) && Objects.equals(this.d, svjVar.d) && this.e == svjVar.e && Objects.equals(this.f, svjVar.f) && Objects.equals(this.g, svjVar.g)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_reactions", agnc.j(new String[]{"message_id", "reactions_data", "reacted_message_id", "reaction", "applied_reaction", "animation_effect"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "message_reactions";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        byte[] byteArray;
        Object valueOf;
        byte[] byteArray2;
        Object obj = new snj(this, 18).get();
        wks wksVar = this.c;
        byte[] bArr = null;
        if (wksVar == null) {
            byteArray = null;
        } else {
            byteArray = wksVar.toByteArray();
        }
        Object obj2 = new snj(this, 19).get();
        wky wkyVar = this.e;
        if (wkyVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(wkyVar.a());
        }
        wku wkuVar = this.f;
        if (wkuVar == null) {
            byteArray2 = null;
        } else {
            byteArray2 = wkuVar.toByteArray();
        }
        wku wkuVar2 = this.g;
        if (wkuVar2 != null) {
            bArr = wkuVar2.toByteArray();
        }
        Object[] objArr = {obj, byteArray, obj2, valueOf, byteArray2, bArr};
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
            return String.format(Locale.US, "%s", "MessageReactionsTable -- REDACTED");
        }
        return a();
    }
}
