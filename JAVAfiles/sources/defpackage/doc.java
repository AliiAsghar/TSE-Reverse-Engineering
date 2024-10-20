package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class doc {
    public String a;
    public dnk b;
    public int c = -1;
    public int d = -1;

    public doc(String str) {
        this.a = str;
    }

    public final int a() {
        dnk dnkVar = this.b;
        if (dnkVar == null) {
            return this.a.length();
        }
        return (this.a.length() - (this.d - this.c)) + dnkVar.b();
    }

    public final void b(int i, int i2, String str) {
        if (i > i2) {
            doz.b(a.bU(i2, i, "start index must be less than or equal to end index: ", " > "));
        }
        if (i < 0) {
            doz.b(a.bV(i, "start must be non-negative, but was "));
        }
        dnk dnkVar = this.b;
        if (dnkVar == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(this.a.length() - i2, 64);
            int i3 = i - min;
            dnm.a(this.a, cArr, 0, i3, i);
            int i4 = max - min2;
            int i5 = min2 + i2;
            dnm.a(this.a, cArr, i4, i2, i5);
            dnl.a(str, cArr, min);
            this.b = new dnk(cArr, min + str.length(), i4);
            this.c = i3;
            this.d = i5;
            return;
        }
        int i6 = this.c;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 >= 0 && i8 <= dnkVar.b()) {
            int length = str.length() - (i8 - i7);
            if (length > dnkVar.a()) {
                int a = length - dnkVar.a();
                int i9 = dnkVar.a;
                do {
                    i9 += i9;
                } while (i9 - dnkVar.a < a);
                char[] cArr2 = new char[i9];
                aqil.v(dnkVar.b, cArr2, 0, 0, dnkVar.c);
                int i10 = dnkVar.a;
                int i11 = dnkVar.d;
                int i12 = i10 - i11;
                int i13 = i9 - i12;
                aqil.v(dnkVar.b, cArr2, i13, i11, i12 + i11);
                dnkVar.b = cArr2;
                dnkVar.a = i9;
                dnkVar.d = i13;
            }
            int i14 = dnkVar.c;
            if (i7 < i14 && i8 <= i14) {
                char[] cArr3 = dnkVar.b;
                int i15 = i14 - i8;
                aqil.v(cArr3, cArr3, dnkVar.d - i15, i8, i14);
                dnkVar.c = i7;
                dnkVar.d -= i15;
            } else if (i7 < i14 && i8 >= i14) {
                dnkVar.d = i8 + dnkVar.a();
                dnkVar.c = i7;
            } else {
                int a2 = i7 + dnkVar.a();
                int a3 = i8 + dnkVar.a();
                int i16 = dnkVar.d;
                char[] cArr4 = dnkVar.b;
                aqil.v(cArr4, cArr4, i14, i16, a2);
                i7 = dnkVar.c + (a2 - i16);
                dnkVar.c = i7;
                dnkVar.d = a3;
            }
            dnl.a(str, dnkVar.b, i7);
            dnkVar.c += str.length();
            return;
        }
        this.a = toString();
        this.b = null;
        this.c = -1;
        this.d = -1;
        b(i, i2, str);
    }

    public final String toString() {
        dnk dnkVar = this.b;
        if (dnkVar == null) {
            return this.a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.a, 0, this.c);
        sb.append(dnkVar.b, 0, dnkVar.c);
        char[] cArr = dnkVar.b;
        int i = dnkVar.d;
        sb.append(cArr, i, dnkVar.a - i);
        String str = this.a;
        sb.append((CharSequence) str, this.d, str.length());
        return sb.toString();
    }
}
