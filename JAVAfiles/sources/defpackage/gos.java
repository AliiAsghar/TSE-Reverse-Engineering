package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gos extends got {
    private final Object a;
    private final String b;
    private final String c;
    private final gox d;
    private final int e;

    public gos(Object obj, String str, String str2, int i) {
        Collection collection;
        this.a = obj;
        this.b = str;
        this.c = str2;
        this.e = i;
        gox goxVar = new gox(c(obj, str2));
        StackTraceElement[] stackTrace = goxVar.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length;
        int r = arrn.r(length - 2, 0);
        if (r >= 0) {
            if (r == 0) {
                collection = arnv.a;
            } else if (r >= length) {
                collection = aqil.p(stackTrace);
            } else if (r == 1) {
                collection = aqjn.y(stackTrace[length - 1]);
            } else {
                ArrayList arrayList = new ArrayList(r);
                for (int i2 = length - r; i2 < length; i2++) {
                    arrayList.add(stackTrace[i2]);
                }
                collection = arrayList;
            }
            goxVar.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
            this.d = goxVar;
            return;
        }
        throw new IllegalArgumentException(a.cb(r, "Requested element count ", " is less than zero."));
    }

    @Override // defpackage.got
    public final Object b() {
        int i = this.e - 1;
        if (i != 0) {
            if (i == 1) {
                Log.d(this.b, c(this.a, this.c));
                return null;
            }
            return null;
        }
        throw this.d;
    }

    @Override // defpackage.got
    public final got a(String str, arqr arqrVar) {
        return this;
    }
}
