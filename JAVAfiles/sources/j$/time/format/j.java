package j$.time.format;

import j$.time.temporal.TemporalField;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class j implements InterfaceC0086f {
    static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    final TemporalField a;
    final int b;
    final int c;
    private final G d;
    final int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(TemporalField temporalField, int i, int i2, G g) {
        this.a = temporalField;
        this.b = i;
        this.c = i2;
        this.d = g;
        this.e = 0;
    }

    long b(z zVar, long j) {
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(w wVar) {
        int i = this.e;
        if (i != -1 && (i <= 0 || this.b != this.c || this.d != G.NOT_NEGATIVE)) {
            return false;
        }
        return true;
    }

    int d(w wVar, long j, int i, int i2) {
        return wVar.o(this.a, j, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j e() {
        if (this.e == -1) {
            return this;
        }
        return new j(this.a, this.b, this.c, this.d, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j f(int i) {
        int i2 = this.e + i;
        return new j(this.a, this.b, this.c, this.d, i2);
    }

    @Override // j$.time.format.InterfaceC0086f
    public boolean n(z zVar, StringBuilder sb) {
        String l;
        TemporalField temporalField = this.a;
        Long e = zVar.e(temporalField);
        if (e == null) {
            return false;
        }
        long b = b(zVar, e.longValue());
        D b2 = zVar.b();
        if (b == Long.MIN_VALUE) {
            l = "9223372036854775808";
        } else {
            l = Long.toString(Math.abs(b));
        }
        int length = l.length();
        int i = this.c;
        if (length <= i) {
            b2.getClass();
            int i2 = this.b;
            G g = this.d;
            if (b >= 0) {
                int i3 = AbstractC0083c.a[g.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        sb.append('+');
                    }
                } else if (i2 < 19 && b >= f[i2]) {
                    sb.append('+');
                }
            } else {
                int i4 = AbstractC0083c.a[g.ordinal()];
                if (i4 != 1 && i4 != 2 && i4 != 3) {
                    if (i4 == 4) {
                        throw new RuntimeException("Field " + String.valueOf(temporalField) + " cannot be printed as the value " + b + " cannot be negative according to the SignStyle");
                    }
                } else {
                    sb.append('-');
                }
            }
            for (int i5 = 0; i5 < i2 - l.length(); i5++) {
                sb.append('0');
            }
            sb.append(l);
            return true;
        }
        throw new RuntimeException("Field " + String.valueOf(temporalField) + " cannot be printed as the value " + b + " exceeds the maximum print width of " + i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0101, code lost:
    
        r5 = r13;
        r1 = r16;
        r9 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0171  */
    @Override // j$.time.format.InterfaceC0086f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int t(j$.time.format.w r21, java.lang.CharSequence r22, int r23) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.j.t(j$.time.format.w, java.lang.CharSequence, int):int");
    }

    public String toString() {
        TemporalField temporalField = this.a;
        G g = this.d;
        int i = this.c;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && g == G.NORMAL) {
            return "Value(" + String.valueOf(temporalField) + ")";
        }
        if (i2 == i && g == G.NOT_NEGATIVE) {
            return "Value(" + String.valueOf(temporalField) + "," + i2 + ")";
        }
        return "Value(" + String.valueOf(temporalField) + "," + i2 + "," + i + "," + String.valueOf(g) + ")";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j(TemporalField temporalField, int i, int i2, G g, int i3) {
        this.a = temporalField;
        this.b = i;
        this.c = i2;
        this.d = g;
        this.e = i3;
    }
}
