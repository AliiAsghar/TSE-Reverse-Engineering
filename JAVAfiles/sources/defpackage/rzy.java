package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class rzy {
    public String a;
    public int b;
    public List c;
    public int d;
    public int e;
    public int i;
    private String j;
    private boolean k = false;
    public int f = 0;
    public boolean g = false;
    public String h = "_id";

    public final String a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        String concat;
        String bV;
        String str6;
        String str7;
        String str8;
        String d = rzx.d(this.b);
        xyl.l(d);
        List list = this.c;
        if (list != null) {
            b((String) Collection.EL.stream(list).map(new rzq(8)).collect(Collectors.joining(" OR ")));
        }
        int i2 = this.b;
        int i3 = this.i;
        String t = vom.t(i3);
        if (i3 != 0) {
            int i4 = this.d;
            String e = rzx.e(i2, t);
            String ag = albo.ag(this.a);
            int i5 = this.i;
            String t2 = vom.t(i5);
            if (i4 != 32) {
                str = "";
            } else {
                str = "_bk";
            }
            String concat2 = e.concat(str);
            if (i5 != 0) {
                String str9 = " ";
                if (!TextUtils.isEmpty(this.j)) {
                    str9 = " WHEN " + this.j + " ";
                }
                String[] strArr = srm.a;
                boolean z = this.k;
                if (true != z) {
                    str2 = "";
                } else {
                    str2 = ",account_id";
                }
                int i6 = this.f;
                if (true != this.g) {
                    str3 = "";
                } else {
                    str3 = ",trigger_name";
                }
                int i7 = this.d;
                int i8 = this.e;
                if (i8 == 0) {
                    i8 = this.b;
                }
                int i9 = this.i;
                String str10 = this.h;
                if (!z) {
                    concat = "";
                    str4 = concat;
                    i = i9;
                    str5 = str10;
                } else {
                    str4 = "";
                    str5 = str10;
                    i = i9;
                    concat = ",".concat("IFNULL((SELECT " + stb.d.a.toString() + " FROM linked_account WHERE " + stb.d.a.toString() + " IS NOT NULL LIMIT 1),-1)");
                }
                int i10 = this.f;
                if (i10 == 0) {
                    bV = str4;
                } else {
                    bV = a.bV(i10, ",");
                }
                boolean z2 = this.g;
                String concat3 = concat2.concat(ag);
                if (z2) {
                    str6 = a.bW(concat3, ",'", "'");
                } else {
                    str6 = str4;
                }
                StringBuilder sb = new StringBuilder("CREATE TRIGGER ");
                sb.append(concat3);
                sb.append(" AFTER ");
                sb.append(t2);
                sb.append(" ON ");
                sb.append(d);
                sb.append(str9);
                sb.append("BEGIN INSERT INTO generic_worker_queue (worker_type,enqueued_timestamp,item_table_type,item_id");
                sb.append(str2);
                if (i6 == 0) {
                    str7 = str4;
                } else {
                    str7 = ",flags";
                }
                sb.append(str7);
                sb.append(str3);
                sb.append(") SELECT ");
                sb.append(i7);
                sb.append(",CURRENT_TIMESTAMP,");
                sb.append(i8);
                sb.append(",");
                if (i == 1) {
                    str8 = "NEW";
                } else {
                    str8 = "OLD";
                }
                sb.append(str8);
                sb.append(".");
                sb.append(str5);
                sb.append(concat);
                sb.append(bV);
                sb.append(str6);
                sb.append("; END");
                return sb.toString();
            }
            throw null;
        }
        throw null;
    }

    public final void b(String str) {
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(this.j)) {
            this.j = str;
            return;
        }
        String str2 = this.j;
        str2.getClass();
        this.j = str2.concat(a.bW(str, " AND (", ")"));
    }

    public final void c() {
        this.k = true;
    }
}
