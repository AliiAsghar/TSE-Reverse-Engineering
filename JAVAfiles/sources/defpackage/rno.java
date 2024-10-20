package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rno extends aglz implements agma {
    public long a;
    public String c;
    public String e;
    public double h;
    public double i;
    public String j;
    public byte[] k;
    public byte[] l;
    public String m;
    public String n;
    public MessageIdType b = rvc.a;
    public int d = 13;
    public int f = -1;
    public int g = -1;

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
        String valueOf8 = String.valueOf(this.h);
        String valueOf9 = String.valueOf(this.i);
        String valueOf10 = String.valueOf(this.j);
        byte[] bArr = this.k;
        String str2 = "NULL";
        if (bArr == null) {
            str = "NULL";
        } else {
            str = String.valueOf(bArr.length);
        }
        String concat = "BLOB".concat(String.valueOf(str));
        byte[] bArr2 = this.l;
        if (bArr2 != null) {
            str2 = String.valueOf(bArr2.length);
        }
        return String.format(locale, "BackupPartsTable [_id: %s,\n  message_id: %s,\n  content_type: %s,\n  source: %s,\n  text: %s,\n  width: %s,\n  height: %s,\n  longitude: %s,\n  latitude: %s,\n  cms_full_size_blob_id: %s,\n  cms_media_encryption_key: %s,\n  cms_compressed_media_encryption_key: %s,\n  cms_compressed_blob_id: %s,\n  file_name: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, concat, "BLOB".concat(String.valueOf(str2)), String.valueOf(this.m), String.valueOf(this.n));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        int intValue = rnx.b().intValue();
        contentValues.put("_id", Long.valueOf(this.a));
        MessageIdType messageIdType = this.b;
        if (messageIdType != null && !messageIdType.equals(rvc.a)) {
            contentValues.put("message_id", Long.valueOf(rvc.a(this.b)));
        } else {
            contentValues.putNull("message_id");
        }
        agnc.r(contentValues, "content_type", this.c);
        if (intValue >= 10) {
            contentValues.put("source", Integer.valueOf(this.d));
        }
        agnc.r(contentValues, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, this.e);
        contentValues.put("width", Integer.valueOf(this.f));
        contentValues.put("height", Integer.valueOf(this.g));
        contentValues.put("longitude", Double.valueOf(this.h));
        contentValues.put("latitude", Double.valueOf(this.i));
        agnc.r(contentValues, "cms_full_size_blob_id", this.j);
        contentValues.put("cms_media_encryption_key", this.k);
        contentValues.put("cms_compressed_media_encryption_key", this.l);
        agnc.r(contentValues, "cms_compressed_blob_id", this.m);
        if (intValue >= 100) {
            agnc.r(contentValues, "file_name", this.n);
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        rns rnsVar = (rns) agmqVar;
        aq();
        this.cJ = rnsVar.dx();
        if (rnsVar.db(0)) {
            this.a = rnsVar.i();
            fE(0);
        }
        if (rnsVar.db(1)) {
            this.b = rnsVar.j();
            fE(1);
        }
        if (rnsVar.db(2)) {
            this.c = rnsVar.m();
            fE(2);
        }
        if (rnsVar.db(3)) {
            this.d = rnsVar.g();
            fE(3);
        }
        if (rnsVar.db(4)) {
            this.e = rnsVar.o();
            fE(4);
        }
        if (rnsVar.db(5)) {
            this.f = rnsVar.h();
            fE(5);
        }
        if (rnsVar.db(6)) {
            this.g = rnsVar.f();
            fE(6);
        }
        if (rnsVar.db(7)) {
            this.h = rnsVar.e();
            fE(7);
        }
        if (rnsVar.db(8)) {
            this.i = rnsVar.c();
            fE(8);
        }
        if (rnsVar.db(9)) {
            this.j = rnsVar.l();
            fE(9);
        }
        if (rnsVar.db(10)) {
            this.k = rnsVar.q();
            fE(10);
        }
        if (rnsVar.db(11)) {
            this.l = rnsVar.p();
            fE(11);
        }
        if (rnsVar.db(12)) {
            this.m = rnsVar.k();
            fE(12);
        }
        if (rnsVar.db(13)) {
            this.n = rnsVar.n();
            fE(13);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rno)) {
            return false;
        }
        rno rnoVar = (rno) obj;
        if (super.aC(rnoVar.cJ) && this.a == rnoVar.a && Objects.equals(this.b, rnoVar.b) && Objects.equals(this.c, rnoVar.c) && this.d == rnoVar.d && Objects.equals(this.e, rnoVar.e) && this.f == rnoVar.f && this.g == rnoVar.g && this.h == rnoVar.h && this.i == rnoVar.i && Objects.equals(this.j, rnoVar.j) && Arrays.equals(this.k, rnoVar.k) && Arrays.equals(this.l, rnoVar.l) && Objects.equals(this.m, rnoVar.m) && Objects.equals(this.n, rnoVar.n)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "parts_backup", agnc.j(new String[]{"_id", "message_id", "content_type", "source", ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "width", "height", "longitude", "latitude", "cms_full_size_blob_id", "cms_media_encryption_key", "cms_compressed_media_encryption_key", "cms_compressed_blob_id", "file_name"}));
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
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, this.c, Integer.valueOf(this.d), this.e, Integer.valueOf(this.f), Integer.valueOf(this.g), Double.valueOf(this.h), Double.valueOf(this.i), this.j, Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(Arrays.hashCode(this.l)), this.m, this.n, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "parts_backup";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {Long.valueOf(this.a), new rnb((aglz) this, 5).get(), this.c, Integer.valueOf(this.d), this.e, Integer.valueOf(this.f), Integer.valueOf(this.g), Double.valueOf(this.h), Double.valueOf(this.i), this.j, this.k, this.l, this.m, this.n};
        sb.append('(');
        for (int i = 0; i < 14; i++) {
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
                sb.append(',');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "BackupPartsTable -- REDACTED");
        }
        return a();
    }
}
