package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aslv implements Iterable, arse {
    private final String[] a;

    public aslv(String[] strArr) {
        this.a = strArr;
    }

    public final int a() {
        return this.a.length >> 1;
    }

    public final String b(String str) {
        String[] strArr = this.a;
        int length = strArr.length - 2;
        int e = arhi.e(length, 0, -2);
        if (e > length) {
            return null;
        }
        while (!arsd.x(str, strArr[length], true)) {
            if (length == e) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String c(int i) {
        return this.a[i + i];
    }

    public final String d(int i) {
        return this.a[i + i + 1];
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection, java.lang.Object] */
    public final asuo e() {
        asuo asuoVar = new asuo((char[]) null);
        ?? r1 = asuoVar.a;
        String[] strArr = this.a;
        strArr.getClass();
        r1.addAll(aqil.c(strArr));
        return asuoVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof aslv) && Arrays.equals(this.a, ((aslv) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator<armo<String, String>> iterator() {
        int a = a();
        armo[] armoVarArr = new armo[a];
        for (int i = 0; i < a; i++) {
            armoVarArr[i] = new armo(c(i), d(i));
        }
        return arrj.a(armoVarArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int a = a();
        for (int i = 0; i < a; i++) {
            String c = c(i);
            String d = d(i);
            sb.append(c);
            sb.append(": ");
            if (true == asmt.v(c)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        return sb.toString();
    }
}
