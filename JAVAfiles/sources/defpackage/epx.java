package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epx {
    public static final /* synthetic */ int i = 0;
    public final long a;
    public final int b;

    @Deprecated
    public final Uri[] c;
    public final ere[] d;
    public final int[] e;
    public final long[] f;
    public final long g;
    public final boolean h;

    static {
        eul.M(0);
        eul.M(1);
        eul.M(2);
        eul.M(3);
        eul.M(4);
        eul.M(5);
        eul.M(6);
        eul.M(7);
        eul.M(8);
    }

    public epx(int i2, int[] iArr, ere[] ereVarArr, long[] jArr) {
        boolean z;
        Uri uri;
        int length = iArr.length;
        int length2 = ereVarArr.length;
        int i3 = 0;
        if (length == length2) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        this.a = 0L;
        this.b = i2;
        this.e = iArr;
        this.d = ereVarArr;
        this.f = jArr;
        this.g = 0L;
        this.h = false;
        this.c = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.c;
            if (i3 < uriArr.length) {
                ere ereVar = ereVarArr[i3];
                if (ereVar == null) {
                    uri = null;
                } else {
                    erb erbVar = ereVar.b;
                    dzg.g(erbVar);
                    uri = erbVar.a;
                }
                uriArr[i3] = uri;
                i3++;
            } else {
                return;
            }
        }
    }

    public final int a() {
        return b(-1);
    }

    public final int b(int i2) {
        int i3;
        int i4 = i2 + 1;
        while (true) {
            int[] iArr = this.e;
            if (i4 >= iArr.length || (i3 = iArr[i4]) == 0 || i3 == 1) {
                break;
            }
            i4++;
        }
        return i4;
    }

    public final boolean c() {
        if (this.b == -1) {
            return true;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            int i3 = this.e[i2];
            if (i3 == 0 || i3 == 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            epx epxVar = (epx) obj;
            if (this.b == epxVar.b && Arrays.equals(this.d, epxVar.d) && Arrays.equals(this.e, epxVar.e) && Arrays.equals(this.f, epxVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b * 31) - 1) * 961) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e)) * 31) + Arrays.hashCode(this.f)) * 961;
    }
}
