package defpackage;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atlq extends atmx {
    private static final NumberFormat a;
    private static final NumberFormat b;
    private static final long serialVersionUID = 9058224788126750409L;
    private long c;
    private long d;
    private long e;
    private long k;
    private long l;
    private long m;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        a = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(2);
        DecimalFormat decimalFormat2 = new DecimalFormat();
        b = decimalFormat2;
        decimalFormat2.setMinimumIntegerDigits(3);
    }

    private static long f(int i) {
        int i2;
        long j = i >> 4;
        if (j <= 9 && (i2 = i & 15) <= 9) {
            for (i2 = i & 15; i2 > 0; i2--) {
                j *= 10;
            }
            return j;
        }
        throw new atoc("Invalid LOC Encoding");
    }

    private static final void q(StringBuffer stringBuffer, NumberFormat numberFormat, long j, long j2) {
        stringBuffer.append(j / j2);
        long j3 = j % j2;
        if (j3 != 0) {
            stringBuffer.append(".");
            stringBuffer.append(numberFormat.format(j3));
        }
    }

    private static final int r(long j) {
        byte b2 = 0;
        while (j > 9) {
            j /= 10;
            b2 = (byte) (b2 + 1);
        }
        return (int) ((j << 4) + b2);
    }

    private static final String s(long j, char c, char c2) {
        StringBuffer stringBuffer = new StringBuffer();
        long j2 = j - 2147483648L;
        if (j2 < 0) {
            j2 = -j2;
            c = c2;
        }
        stringBuffer.append(j2 / 3600000);
        stringBuffer.append(" ");
        long j3 = j2 % 3600000;
        stringBuffer.append(j3 / 60000);
        stringBuffer.append(" ");
        q(stringBuffer, b, j3 % 60000, 1000L);
        stringBuffer.append(" ");
        stringBuffer.append(c);
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(s(this.k, 'N', 'S'));
        stringBuffer.append(" ");
        stringBuffer.append(s(this.l, 'E', 'W'));
        stringBuffer.append(" ");
        NumberFormat numberFormat = a;
        q(stringBuffer, numberFormat, (-10000000) + this.m, 100L);
        stringBuffer.append("m ");
        q(stringBuffer, numberFormat, this.c, 100L);
        stringBuffer.append("m ");
        q(stringBuffer, numberFormat, this.d, 100L);
        stringBuffer.append("m ");
        q(stringBuffer, numberFormat, this.e, 100L);
        stringBuffer.append("m");
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atlq();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        if (atktVar.c() == 0) {
            this.c = f(atktVar.c());
            this.d = f(atktVar.c());
            this.e = f(atktVar.c());
            this.k = atktVar.e();
            this.l = atktVar.e();
            this.m = atktVar.e();
            return;
        }
        throw new atoc("Invalid LOC version");
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.g(0);
        atkvVar.g(r(this.c));
        atkvVar.g(r(this.d));
        atkvVar.g(r(this.e));
        atkvVar.f(this.k);
        atkvVar.f(this.l);
        atkvVar.f(this.m);
    }
}
