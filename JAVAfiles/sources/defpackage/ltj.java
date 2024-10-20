package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ltj {
    private final String a;
    private final Uri b;
    private final String c;
    private final String d;
    private final long e;

    public ltj(PartsTable.BindData bindData) {
        bindData.getClass();
        String B = bindData.B();
        Uri n = bindData.n();
        String x = bindData.x();
        String y = bindData.y();
        long l = bindData.l();
        this.a = B;
        this.b = n;
        this.c = x;
        this.d = y;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltj)) {
            return false;
        }
        ltj ltjVar = (ltj) obj;
        if (d.F(this.a, ltjVar.a) && d.F(this.b, ltjVar.b) && d.F(this.c, ltjVar.c) && d.F(this.d, ltjVar.d) && this.e == ltjVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        Uri uri = this.b;
        if (uri == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = uri.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + hashCode3) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((i3 + i) * 31) + a.A(this.e);
    }

    public final String toString() {
        return "Part(text=" + this.a + ", contentUri=" + this.b + ", contentType=" + this.c + ", fileName=" + this.d + ", durationMs=" + this.e + ")";
    }
}
