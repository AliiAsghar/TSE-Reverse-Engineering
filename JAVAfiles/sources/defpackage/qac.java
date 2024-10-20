package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qac extends aglz implements agma {
    public pyz a = null;
    public qam b;
    public Uri c;
    public qel d;
    public apwj e;
    public String f;
    public qep g;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "FileProcessingTable [processing_id: %s,\n  file_type: %s,\n  file_uri: %s,\n  content_type: %s,\n  encryption_metadata: %s,\n  transfer_handle: %s,\n  upload_result: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        pyz pyzVar = this.a;
        if (pyzVar != null && !pyzVar.equals(null)) {
            contentValues.put("processing_id", pyz.a(this.a));
        } else {
            contentValues.putNull("processing_id");
        }
        qam qamVar = this.b;
        if (qamVar == null) {
            contentValues.putNull("file_type");
        } else {
            contentValues.put("file_type", Integer.valueOf(qamVar.ordinal()));
        }
        Uri uri = this.c;
        if (uri == null) {
            contentValues.putNull("file_uri");
        } else {
            contentValues.put("file_uri", uri.toString());
        }
        qel qelVar = this.d;
        if (qelVar == null) {
            contentValues.putNull("content_type");
        } else {
            contentValues.put("content_type", qelVar.toByteArray());
        }
        apwj apwjVar = this.e;
        if (apwjVar == null) {
            contentValues.putNull("encryption_metadata");
        } else {
            contentValues.put("encryption_metadata", apwjVar.toByteArray());
        }
        agnc.r(contentValues, "transfer_handle", this.f);
        qep qepVar = this.g;
        if (qepVar == null) {
            contentValues.putNull("upload_result");
        } else {
            contentValues.put("upload_result", qepVar.toByteArray());
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        qae qaeVar = (qae) agmqVar;
        aq();
        this.cJ = qaeVar.dx();
        if (qaeVar.db(0)) {
            this.a = qaeVar.e();
            fE(0);
        }
        if (qaeVar.db(1)) {
            this.b = qaeVar.f();
            fE(1);
        }
        if (qaeVar.db(2)) {
            this.c = qaeVar.c();
            fE(2);
        }
        if (qaeVar.db(3)) {
            this.d = qaeVar.g();
            fE(3);
        }
        if (qaeVar.db(4)) {
            this.e = qaeVar.i();
            fE(4);
        }
        if (qaeVar.db(5)) {
            this.f = qaeVar.j();
            fE(5);
        }
        if (qaeVar.db(6)) {
            this.g = qaeVar.h();
            fE(6);
        }
    }

    public final qam d() {
        ao(1, "file_type");
        return this.b;
    }

    public final qep e() {
        ao(6, "upload_result");
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qac)) {
            return false;
        }
        qac qacVar = (qac) obj;
        if (super.aC(qacVar.cJ) && Objects.equals(this.a, qacVar.a) && Objects.equals(this.b, qacVar.b) && Objects.equals(this.c, qacVar.c) && Objects.equals(this.d, qacVar.d) && Objects.equals(this.e, qacVar.e) && Objects.equals(this.f, qacVar.f) && Objects.equals(this.g, qacVar.g)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "file_processing", agnc.j(new String[]{"processing_id", "file_type", "file_uri", "content_type", "encryption_metadata", "transfer_handle", "upload_result"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return null;
    }

    public final boolean h(Function function) {
        Object apply;
        apply = function.apply(new qak());
        return k(new agpw((qak) apply));
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "file_processing";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object valueOf;
        String uri;
        byte[] byteArray;
        byte[] byteArray2;
        Object obj = new ngq((aglz) this, 13).get();
        qam qamVar = this.b;
        if (qamVar == null) {
            valueOf = 0;
        } else {
            valueOf = String.valueOf(qamVar.ordinal());
        }
        Uri uri2 = this.c;
        byte[] bArr = null;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        qel qelVar = this.d;
        if (qelVar == null) {
            byteArray = null;
        } else {
            byteArray = qelVar.toByteArray();
        }
        apwj apwjVar = this.e;
        if (apwjVar == null) {
            byteArray2 = null;
        } else {
            byteArray2 = apwjVar.toByteArray();
        }
        String str = this.f;
        qep qepVar = this.g;
        if (qepVar != null) {
            bArr = qepVar.toByteArray();
        }
        Object[] objArr = {obj, valueOf, uri, byteArray, byteArray2, str, bArr};
        sb.append('(');
        for (int i = 0; i < 7; i++) {
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

    public final boolean k(agpw agpwVar) {
        agnw d;
        d = agnc.d("$primary");
        return ((Boolean) d.r(new mri(this, agpwVar, d, 17, null))).booleanValue();
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "FileProcessingTable -- REDACTED");
        }
        return a();
    }
}
