package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xow extends aglz implements agma {
    public MessageIdType a = rvc.a;
    public String b;
    public xpg c;
    public qeq d;
    public qep e;
    public qep f;
    public String g;
    public byte[] h;

    @Override // defpackage.aglz
    public final String a() {
        String str;
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        byte[] bArr = this.h;
        if (bArr != null) {
            str = String.valueOf(bArr.length);
        } else {
            str = "NULL";
        }
        return String.format(locale, "FileTransferTable [message_id: %s,\n  transfer_id: %s,\n  transfer_type: %s,\n  attachment_upload_response: %s,\n  file_information: %s,\n  thumbnail_information: %s,\n  transfer_handle: %s,\n  opaque_data: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, "BLOB".concat(String.valueOf(str)));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        MessageIdType messageIdType = this.a;
        if (messageIdType != null && !messageIdType.equals(rvc.a)) {
            contentValues.put("message_id", Long.valueOf(rvc.a(this.a)));
        } else {
            contentValues.putNull("message_id");
        }
        agnc.r(contentValues, "transfer_id", this.b);
        xpg xpgVar = this.c;
        if (xpgVar == null) {
            contentValues.putNull("transfer_type");
        } else {
            contentValues.put("transfer_type", Integer.valueOf(xpgVar.ordinal()));
        }
        qeq qeqVar = this.d;
        if (qeqVar == null) {
            contentValues.putNull("attachment_upload_response");
        } else {
            contentValues.put("attachment_upload_response", qeqVar.toByteArray());
        }
        if (intValue >= 55030) {
            qep qepVar = this.e;
            if (qepVar == null) {
                contentValues.putNull("file_information");
            } else {
                contentValues.put("file_information", qepVar.toByteArray());
            }
        }
        if (intValue >= 59910) {
            qep qepVar2 = this.f;
            if (qepVar2 == null) {
                contentValues.putNull("thumbnail_information");
            } else {
                contentValues.put("thumbnail_information", qepVar2.toByteArray());
            }
        }
        if (intValue >= 55030) {
            agnc.r(contentValues, "transfer_handle", this.g);
        }
        if (intValue >= 56040) {
            contentValues.put("opaque_data", this.h);
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        xoz xozVar = (xoz) agmqVar;
        aq();
        this.cJ = xozVar.dx();
        if (xozVar.db(0)) {
            this.a = xozVar.g();
            fE(0);
        }
        if (xozVar.db(1)) {
            this.b = xozVar.j();
            fE(1);
        }
        if (xozVar.db(2)) {
            this.c = xozVar.h();
            fE(2);
        }
        if (xozVar.db(3)) {
            this.d = xozVar.f();
            fE(3);
        }
        if (xozVar.db(4)) {
            this.e = xozVar.c();
            fE(4);
        }
        if (xozVar.db(5)) {
            this.f = xozVar.e();
            fE(5);
        }
        if (xozVar.db(6)) {
            this.g = xozVar.i();
            fE(6);
        }
        if (xozVar.db(7)) {
            this.h = xozVar.k();
            fE(7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xow)) {
            return false;
        }
        xow xowVar = (xow) obj;
        if (super.aC(xowVar.cJ) && Objects.equals(this.a, xowVar.a) && Objects.equals(this.b, xowVar.b) && this.c == xowVar.c && Objects.equals(this.d, xowVar.d) && Objects.equals(this.e, xowVar.e) && Objects.equals(this.f, xowVar.f) && Objects.equals(this.g, xowVar.g) && Arrays.equals(this.h, xowVar.h)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "file_transfer", agnc.j(new String[]{"message_id", "transfer_id", "transfer_type", "attachment_upload_response", "file_information", "thumbnail_information", "transfer_handle", "opaque_data"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final qep h() {
        ao(4, "file_information");
        return this.e;
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
        MessageIdType messageIdType = this.a;
        String str = this.b;
        xpg xpgVar = this.c;
        if (xpgVar == null) {
            ordinal = 0;
        } else {
            ordinal = xpgVar.ordinal();
        }
        return Objects.hash(adayVar, messageIdType, str, Integer.valueOf(ordinal), this.d, this.e, this.f, this.g, Integer.valueOf(Arrays.hashCode(this.h)), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "file_transfer";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        byte[] byteArray;
        byte[] byteArray2;
        Object obj = new wxx((aglz) this, 8).get();
        String str = this.b;
        xpg xpgVar = this.c;
        if (xpgVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(xpgVar.ordinal());
        }
        qeq qeqVar = this.d;
        byte[] bArr = null;
        if (qeqVar == null) {
            byteArray = null;
        } else {
            byteArray = qeqVar.toByteArray();
        }
        qep qepVar = this.e;
        if (qepVar == null) {
            byteArray2 = null;
        } else {
            byteArray2 = qepVar.toByteArray();
        }
        qep qepVar2 = this.f;
        if (qepVar2 != null) {
            bArr = qepVar2.toByteArray();
        }
        Object[] objArr = {obj, str, valueOf, byteArray, byteArray2, bArr, this.g, this.h};
        sb.append('(');
        for (int i = 0; i < 8; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
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

    public final qep k() {
        ao(5, "thumbnail_information");
        return this.f;
    }

    public final qeq l() {
        ao(3, "attachment_upload_response");
        return this.d;
    }

    public final MessageIdType m() {
        ao(0, "message_id");
        return this.a;
    }

    public final xpg n() {
        ao(2, "transfer_type");
        return this.c;
    }

    public final String o() {
        ao(6, "transfer_handle");
        return this.g;
    }

    public final String p() {
        ao(1, "transfer_id");
        return this.b;
    }

    public final byte[] q() {
        ao(7, "opaque_data");
        return this.h;
    }

    public final boolean s(agpw agpwVar) {
        agnw d;
        d = agnc.d("$primary");
        return ((Boolean) d.r(new tdw((aglz) this, agpwVar, d, 13))).booleanValue();
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "FileTransferTable -- REDACTED");
        }
        return a();
    }
}
