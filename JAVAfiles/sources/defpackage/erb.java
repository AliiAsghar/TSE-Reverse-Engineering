package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erb {
    public final Uri a;
    public final String b;
    public final eqy c;
    public final List e;
    public final alog g;
    public final Object h;
    public final long i;
    public final eqt d = null;
    public final String f = null;

    static {
        dze.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public erb(Uri uri, String str, eqy eqyVar, List list, alog alogVar, long j) {
        this.a = uri;
        this.b = erl.e(str);
        this.c = eqyVar;
        this.e = list;
        this.g = alogVar;
        alob alobVar = new alob();
        if (((alsx) alogVar).c <= 0) {
            alobVar.g();
            this.h = null;
            this.i = j;
            return;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erb)) {
            return false;
        }
        erb erbVar = (erb) obj;
        if (this.a.equals(erbVar.a) && Objects.equals(this.b, erbVar.b) && Objects.equals(this.c, erbVar.c)) {
            eqt eqtVar = erbVar.d;
            if (Objects.equals(null, null) && this.e.equals(erbVar.e)) {
                String str = erbVar.f;
                if (Objects.equals(null, null) && alzz.at(this.g, erbVar.g)) {
                    Object obj2 = erbVar.h;
                    if (Objects.equals(null, null) && Objects.equals(Long.valueOf(this.i), Long.valueOf(erbVar.i))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        eqy eqyVar = this.c;
        if (eqyVar != null) {
            i = eqyVar.hashCode();
        }
        return (int) (((((((i2 + i) * 961) + this.e.hashCode()) * 961) + this.g.hashCode()) * 31 * 31) + this.i);
    }
}
