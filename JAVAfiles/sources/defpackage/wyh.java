package defpackage;

import android.content.ContentUris;
import android.database.Cursor;
import android.provider.Telephony;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wyh extends wyg {
    private static String[] n;
    public final armf a;
    public String b;
    public msh c;
    public String d;
    public String e;
    public long f;
    public long g;
    public int h;
    public long i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    private final xii o;
    private final ogn p;
    private long q;

    public wyh(armf armfVar, ogn ognVar, xii xiiVar) {
        this.o = xiiVar;
        this.p = ognVar;
        if (ognVar.a()) {
            this.a = xiiVar.a;
        } else {
            this.a = armfVar;
        }
    }

    public static String[] g(wzs wzsVar) {
        String[] strArr;
        if (n == null) {
            if (qno.k()) {
                strArr = new String[]{"_id", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, "address", "body", "date", "thread_id", "status", "read", "seen", "date_sent", "sub_id", "subject"};
            } else {
                strArr = new String[]{"_id", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, "address", "body", "date", "thread_id", "status", "read", "seen", "date_sent", "sub_id"};
            }
            if (!wzsVar.S()) {
                strArr[9] = "date";
            }
            n = strArr;
        }
        return n;
    }

    @Override // defpackage.wyb
    public final int a() {
        return 0;
    }

    @Override // defpackage.wyb
    public final int b() {
        return this.j;
    }

    @Override // defpackage.wyb
    public final long c() {
        return this.f;
    }

    @Override // defpackage.wyb
    public final String d() {
        return this.b;
    }

    @Override // defpackage.wyg
    public final long e() {
        return this.i;
    }

    public final void f(Cursor cursor, int i) {
        boolean z;
        boolean z2 = false;
        this.q = cursor.getLong(0);
        int i2 = cursor.getInt(10);
        if (i2 >= 0) {
            i = i2;
        }
        this.m = i;
        ogn ognVar = this.p;
        String string = cursor.getString(2);
        int i3 = 3;
        if (ognVar.a()) {
            this.c = this.o.a(string, this.m, new vhf(this, string, i3));
        } else {
            this.c = ((msk) this.a.b()).v(((msk) this.a.b()).t(string, this.m));
        }
        this.d = string;
        this.e = cursor.getString(3);
        this.f = cursor.getLong(4);
        this.g = cursor.getLong(9);
        this.h = cursor.getInt(1);
        this.i = cursor.getLong(5);
        this.j = cursor.getInt(6);
        if (cursor.getInt(7) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.k = z;
        if (cursor.getInt(8) != 0) {
            z2 = true;
        }
        this.l = z2;
        this.b = ContentUris.withAppendedId(Telephony.Sms.CONTENT_URI, this.q).toString();
        if (qno.k()) {
            cursor.getString(11);
        }
    }
}
