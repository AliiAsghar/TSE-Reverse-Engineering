package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tla extends aglz implements agma {
    public long a;
    public String b;
    public String c;
    public byte[] d;
    public long e = 0;

    @Override // defpackage.aglz
    public final String a() {
        String str;
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        byte[] bArr = this.d;
        if (bArr != null) {
            str = String.valueOf(bArr.length);
        } else {
            str = "NULL";
        }
        return String.format(locale, "SettingsTable [_id: %s,\n  key: %s,\n  sub_key: %s,\n  data: %s,\n  last_modified_timestamp: %s\n]\n", valueOf, valueOf2, valueOf3, "BLOB".concat(String.valueOf(str)), String.valueOf(this.e));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        agnc.r(contentValues, "key", this.b);
        agnc.r(contentValues, "sub_key", this.c);
        contentValues.put(GroupManagementRequest.DATA_TAG, this.d);
        contentValues.put("last_modified_timestamp", Long.valueOf(this.e));
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        tld tldVar = (tld) agmqVar;
        aq();
        this.cJ = tldVar.dx();
        if (tldVar.db(0)) {
            this.a = tldVar.c();
            fE(0);
        }
        if (tldVar.db(1)) {
            this.b = tldVar.f();
            fE(1);
        }
        if (tldVar.db(2)) {
            this.c = tldVar.g();
            fE(2);
        }
        if (tldVar.db(3)) {
            this.d = tldVar.h();
            fE(3);
        }
        if (tldVar.db(4)) {
            this.e = tldVar.e();
            fE(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tla)) {
            return false;
        }
        tla tlaVar = (tla) obj;
        if (super.aC(tlaVar.cJ) && this.a == tlaVar.a && Objects.equals(this.b, tlaVar.b) && Objects.equals(this.c, tlaVar.c) && Arrays.equals(this.d, tlaVar.d) && this.e == tlaVar.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "settings", agnc.j(new String[]{"key", "sub_key", GroupManagementRequest.DATA_TAG, "last_modified_timestamp"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final String h() {
        ao(2, "sub_key");
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
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d)), Long.valueOf(this.e), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "settings";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        Object[] objArr = {this.b, this.c, this.d, Long.valueOf(this.e)};
        sb.append('(');
        for (int i = 0; i < 4; i++) {
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

    public final byte[] k() {
        ao(3, GroupManagementRequest.DATA_TAG);
        return this.d;
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "SettingsTable -- REDACTED");
        }
        return a();
    }
}
