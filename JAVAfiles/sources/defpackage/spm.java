package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import defpackage.aglz;
import j$.time.Instant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class spm extends aglz implements agma {
    public byte[] b;
    public byte[] c;
    public int d;
    public byte[] e;
    public byte[] f;
    public int g;
    public Uri i;
    public String j;
    public byte[] k;
    public byte[] l;
    public String m;
    public String o;
    public String p;
    public String q;
    public rve a = rve.a;
    public Instant h = uzz.l(0);
    public Instant n = Instant.EPOCH;

    @Override // defpackage.aglz
    public final String a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        byte[] bArr = this.b;
        String str6 = "NULL";
        if (bArr == null) {
            str = "NULL";
        } else {
            str = String.valueOf(bArr.length);
        }
        String concat = "BLOB".concat(String.valueOf(str));
        byte[] bArr2 = this.c;
        if (bArr2 == null) {
            str2 = "NULL";
        } else {
            str2 = String.valueOf(bArr2.length);
        }
        String concat2 = "BLOB".concat(String.valueOf(str2));
        String valueOf2 = String.valueOf(this.d);
        byte[] bArr3 = this.e;
        if (bArr3 == null) {
            str3 = "NULL";
        } else {
            str3 = String.valueOf(bArr3.length);
        }
        String concat3 = "BLOB".concat(String.valueOf(str3));
        byte[] bArr4 = this.f;
        if (bArr4 == null) {
            str4 = "NULL";
        } else {
            str4 = String.valueOf(bArr4.length);
        }
        String concat4 = "BLOB".concat(String.valueOf(str4));
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.h);
        String valueOf5 = String.valueOf(this.i);
        String valueOf6 = String.valueOf(this.j);
        byte[] bArr5 = this.k;
        if (bArr5 == null) {
            str5 = "NULL";
        } else {
            str5 = String.valueOf(bArr5.length);
        }
        String concat5 = "BLOB".concat(String.valueOf(str5));
        byte[] bArr6 = this.l;
        if (bArr6 != null) {
            str6 = String.valueOf(bArr6.length);
        }
        return String.format(locale, "EtouffeeRcsMetadataTable [rcs_message_id: %s,\n  preview_etouffee: %s,\n  preview_summary: %s,\n  preview_version: %s,\n  attachment_etouffee: %s,\n  attachment_summary: %s,\n  attachment_version: %s,\n  creation_timestamp: %s,\n  attachment_uri: %s,\n  custom_delivery_receipt_mime_type: %s,\n  custom_delivery_receipt_content: %s,\n  file_uploaded_xml_from_content_server: %s,\n  file_uploaded_fallback_uri: %s,\n  file_uploaded_expiry: %s,\n  plaintext_attachment_name: %s,\n  plaintext_attachment_content_type: %s,\n  plaintext_thumbnail_content_type: %s\n]\n", valueOf, concat, concat2, valueOf2, concat3, concat4, valueOf3, valueOf4, valueOf5, valueOf6, concat5, "BLOB".concat(String.valueOf(str6)), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        rve rveVar = this.a;
        if (rveVar != null && !rveVar.equals(rve.a)) {
            contentValues.put("rcs_message_id", rve.d(this.a));
        } else {
            contentValues.putNull("rcs_message_id");
        }
        contentValues.put("preview_etouffee", this.b);
        contentValues.put("preview_summary", this.c);
        contentValues.put("preview_version", Integer.valueOf(this.d));
        contentValues.put("attachment_etouffee", this.e);
        contentValues.put("attachment_summary", this.f);
        contentValues.put("attachment_version", Integer.valueOf(this.g));
        Instant instant = this.h;
        if (instant == null) {
            contentValues.putNull("creation_timestamp");
        } else {
            contentValues.put("creation_timestamp", Long.valueOf(uzz.k(instant)));
        }
        if (intValue >= 35060) {
            Uri uri = this.i;
            if (uri == null) {
                contentValues.putNull("attachment_uri");
            } else {
                contentValues.put("attachment_uri", uri.toString());
            }
        }
        if (intValue >= 37020) {
            agnc.r(contentValues, "custom_delivery_receipt_mime_type", this.j);
        }
        if (intValue >= 37020) {
            contentValues.put("custom_delivery_receipt_content", this.k);
        }
        if (intValue >= 48010) {
            contentValues.put("file_uploaded_xml_from_content_server", this.l);
        }
        if (intValue >= 48010) {
            agnc.r(contentValues, "file_uploaded_fallback_uri", this.m);
        }
        if (intValue >= 48010) {
            Instant instant2 = this.n;
            if (instant2 == null) {
                contentValues.putNull("file_uploaded_expiry");
            } else {
                contentValues.put("file_uploaded_expiry", Long.valueOf(uzz.k(instant2)));
            }
        }
        if (intValue >= 56020) {
            agnc.r(contentValues, "plaintext_attachment_name", this.o);
        }
        if (intValue >= 56020) {
            agnc.r(contentValues, "plaintext_attachment_content_type", this.p);
        }
        if (intValue >= 56020) {
            agnc.r(contentValues, "plaintext_thumbnail_content_type", this.q);
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        spr sprVar = (spr) agmqVar;
        aq();
        this.cJ = sprVar.dx();
        if (sprVar.db(0)) {
            this.a = sprVar.g();
            fE(0);
        }
        if (sprVar.db(1)) {
            this.b = sprVar.t();
            fE(1);
        }
        if (sprVar.db(2)) {
            this.c = sprVar.s();
            fE(2);
        }
        if (sprVar.db(3)) {
            this.d = sprVar.e();
            fE(3);
        }
        if (sprVar.db(4)) {
            this.e = sprVar.p();
            fE(4);
        }
        if (sprVar.db(5)) {
            this.f = sprVar.o();
            fE(5);
        }
        if (sprVar.db(6)) {
            this.g = sprVar.c();
            fE(6);
        }
        if (sprVar.db(7)) {
            this.h = sprVar.h();
            fE(7);
        }
        if (sprVar.db(8)) {
            this.i = sprVar.f();
            fE(8);
        }
        if (sprVar.db(9)) {
            this.j = sprVar.j();
            fE(9);
        }
        if (sprVar.db(10)) {
            this.k = sprVar.q();
            fE(10);
        }
        if (sprVar.db(11)) {
            this.l = sprVar.r();
            fE(11);
        }
        if (sprVar.db(12)) {
            this.m = sprVar.k();
            fE(12);
        }
        if (sprVar.db(13)) {
            this.n = sprVar.i();
            fE(13);
        }
        if (sprVar.db(14)) {
            this.o = sprVar.m();
            fE(14);
        }
        if (sprVar.db(15)) {
            this.p = sprVar.l();
            fE(15);
        }
        if (sprVar.db(16)) {
            this.q = sprVar.n();
            fE(16);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof spm)) {
            return false;
        }
        spm spmVar = (spm) obj;
        if (super.aC(spmVar.cJ) && Objects.equals(this.a, spmVar.a) && Arrays.equals(this.b, spmVar.b) && Arrays.equals(this.c, spmVar.c) && this.d == spmVar.d && Arrays.equals(this.e, spmVar.e) && Arrays.equals(this.f, spmVar.f) && this.g == spmVar.g && Objects.equals(this.h, spmVar.h) && Objects.equals(this.i, spmVar.i) && Objects.equals(this.j, spmVar.j) && Arrays.equals(this.k, spmVar.k) && Arrays.equals(this.l, spmVar.l) && Objects.equals(this.m, spmVar.m) && Objects.equals(this.n, spmVar.n) && Objects.equals(this.o, spmVar.o) && Objects.equals(this.p, spmVar.p) && Objects.equals(this.q, spmVar.q)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "etouffee_rcs_metadata", agnc.j(new String[]{"rcs_message_id", "preview_etouffee", "preview_summary", "preview_version", "attachment_etouffee", "attachment_summary", "attachment_version", "creation_timestamp", "attachment_uri", "custom_delivery_receipt_mime_type", "custom_delivery_receipt_content", "file_uploaded_xml_from_content_server", "file_uploaded_fallback_uri", "file_uploaded_expiry", "plaintext_attachment_name", "plaintext_attachment_content_type", "plaintext_thumbnail_content_type"}));
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
        return Objects.hash(adayVar, this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(this.g), this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(Arrays.hashCode(this.l)), this.m, this.n, this.o, this.p, this.q, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "etouffee_rcs_metadata";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        String uri;
        Object obj = new snj(this, 3).get();
        byte[] bArr = this.b;
        byte[] bArr2 = this.c;
        Integer valueOf = Integer.valueOf(this.d);
        byte[] bArr3 = this.e;
        byte[] bArr4 = this.f;
        Integer valueOf2 = Integer.valueOf(this.g);
        Long valueOf3 = Long.valueOf(uzz.k(this.h));
        Uri uri2 = this.i;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        Object[] objArr = {obj, bArr, bArr2, valueOf, bArr3, bArr4, valueOf2, valueOf3, uri, this.j, this.k, this.l, this.m, Long.valueOf(uzz.k(this.n)), this.o, this.p, this.q};
        sb.append('(');
        for (int i = 0; i < 17; i++) {
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
                sb.append(',');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "EtouffeeRcsMetadataTable -- REDACTED");
        }
        return a();
    }
}
