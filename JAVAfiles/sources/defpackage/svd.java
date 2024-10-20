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
public final class svd extends aglz implements agma {
    public MessageIdType a = rvc.a;
    public voe b;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "MessagePhotosSharingTable [message_id: %s,\n  sharing_state: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.a;
        if (messageIdType != null && !messageIdType.equals(rvc.a)) {
            contentValues.put("message_id", Long.valueOf(rvc.a(this.a)));
        } else {
            contentValues.putNull("message_id");
        }
        voe voeVar = this.b;
        if (voeVar == null) {
            contentValues.putNull("sharing_state");
        } else {
            contentValues.put("sharing_state", voeVar.toByteArray());
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        svf svfVar = (svf) agmqVar;
        aq();
        this.cJ = svfVar.dx();
        if (svfVar.db(0)) {
            this.a = svfVar.c();
            fE(0);
        }
        if (svfVar.db(1)) {
            this.b = svfVar.e();
            fE(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof svd)) {
            return false;
        }
        svd svdVar = (svd) obj;
        if (super.aC(svdVar.cJ) && Objects.equals(this.a, svdVar.a) && Objects.equals(this.b, svdVar.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_photos_sharing", agnc.j(new String[]{"message_id", "sharing_state"}));
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
        return "message_photos_sharing";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        byte[] byteArray;
        Object obj = new snj(this, 17).get();
        voe voeVar = this.b;
        if (voeVar == null) {
            byteArray = null;
        } else {
            byteArray = voeVar.toByteArray();
        }
        Object[] objArr = {obj, byteArray};
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
            return String.format(Locale.US, "%s", "MessagePhotosSharingTable -- REDACTED");
        }
        return a();
    }
}
