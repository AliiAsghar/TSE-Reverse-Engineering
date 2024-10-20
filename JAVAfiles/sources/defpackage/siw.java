package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class siw extends aglz implements agma {
    public byte[] b;
    public String d;
    public String e;
    public int a = 0;
    public int c = 0;

    @Override // defpackage.aglz
    public final String a() {
        String str;
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        byte[] bArr = this.b;
        if (bArr != null) {
            str = String.valueOf(bArr.length);
        } else {
            str = "NULL";
        }
        return String.format(locale, "CmsTable [key_index: %s,\n  encryption_key: %s,\n  key_type: %s,\n  cms_correlation_id: %s,\n  cms_id: %s\n]\n", valueOf, "BLOB".concat(String.valueOf(str)), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        contentValues.put("key_index", Integer.valueOf(this.a));
        contentValues.put("encryption_key", this.b);
        contentValues.put("key_type", Integer.valueOf(this.c));
        if (intValue >= 42060) {
            agnc.r(contentValues, "cms_correlation_id", this.d);
        }
        if (intValue >= 35020) {
            agnc.r(contentValues, "cms_id", this.e);
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        siz sizVar = (siz) agmqVar;
        aq();
        this.cJ = sizVar.dx();
        if (sizVar.db(0)) {
            this.a = sizVar.c();
            fE(0);
        }
        if (sizVar.db(1)) {
            this.b = sizVar.h();
            fE(1);
        }
        if (sizVar.db(2)) {
            this.c = sizVar.e();
            fE(2);
        }
        if (sizVar.db(3)) {
            this.d = sizVar.f();
            fE(3);
        }
        if (sizVar.db(4)) {
            this.e = sizVar.g();
            fE(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof siw)) {
            return false;
        }
        siw siwVar = (siw) obj;
        if (super.aC(siwVar.cJ) && this.a == siwVar.a && Arrays.equals(this.b, siwVar.b) && this.c == siwVar.c && Objects.equals(this.d, siwVar.d) && Objects.equals(this.e, siwVar.e)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "cms", agnc.j(new String[]{"key_index", "encryption_key", "key_type", "cms_correlation_id", "cms_id"}));
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
        return Objects.hash(adayVar, Integer.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(this.c), this.d, this.e, null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "cms";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {Integer.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, this.e};
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
            return String.format(Locale.US, "%s", "CmsTable -- REDACTED");
        }
        return a();
    }
}
