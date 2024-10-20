package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0087g extends j {
    private final boolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0087g(ChronoField chronoField, int i, int i2, boolean z) {
        this(chronoField, i, i2, z, 0);
        Objects.a(chronoField, "field");
        if (!chronoField.n().g()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: ".concat(String.valueOf(chronoField)));
        }
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.j
    public final boolean c(w wVar) {
        if (wVar.l() && this.b == this.c && !this.g) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.j
    public final j e() {
        if (this.e == -1) {
            return this;
        }
        return new C0087g(this.a, this.b, this.c, this.g, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.j
    public final j f(int i) {
        return new C0087g(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC0086f
    public final boolean n(z zVar, StringBuilder sb) {
        BigDecimal stripTrailingZeros;
        TemporalField temporalField = this.a;
        Long e = zVar.e(temporalField);
        if (e == null) {
            return false;
        }
        D b = zVar.b();
        long longValue = e.longValue();
        j$.time.temporal.p n = temporalField.n();
        n.b(longValue, temporalField);
        BigDecimal valueOf = BigDecimal.valueOf(n.e());
        BigDecimal add = BigDecimal.valueOf(n.d()).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            if (divide.signum() == 0) {
                stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
            } else {
                stripTrailingZeros = divide.stripTrailingZeros();
            }
            bigDecimal = stripTrailingZeros;
        }
        int scale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (scale == 0) {
            if (i > 0) {
                if (z) {
                    b.getClass();
                    sb.append('.');
                }
                for (int i2 = 0; i2 < i; i2++) {
                    b.getClass();
                    sb.append('0');
                }
                return true;
            }
            return true;
        }
        String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2);
        b.getClass();
        if (z) {
            sb.append('.');
        }
        sb.append(substring);
        return true;
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC0086f
    public final int t(w wVar, CharSequence charSequence, int i) {
        int i2;
        int i3;
        if (!wVar.l() && !c(wVar)) {
            i2 = 0;
        } else {
            i2 = this.b;
        }
        if (!wVar.l() && !c(wVar)) {
            i3 = 9;
        } else {
            i3 = this.c;
        }
        int length = charSequence.length();
        if (i == length) {
            if (i2 > 0) {
                return ~i;
            }
            return i;
        }
        if (this.g) {
            char charAt = charSequence.charAt(i);
            wVar.g().getClass();
            if (charAt != '.') {
                if (i2 > 0) {
                    return ~i;
                }
                return i;
            }
            i++;
        }
        int i4 = i;
        int i5 = i2 + i4;
        if (i5 > length) {
            return ~i4;
        }
        int min = Math.min(i3 + i4, length);
        int i6 = i4;
        int i7 = 0;
        while (true) {
            if (i6 >= min) {
                break;
            }
            int i8 = i6 + 1;
            int a = wVar.g().a(charSequence.charAt(i6));
            if (a < 0) {
                if (i8 < i5) {
                    return ~i4;
                }
            } else {
                i7 = (i7 * 10) + a;
                i6 = i8;
            }
        }
        BigDecimal movePointLeft = new BigDecimal(i7).movePointLeft(i6 - i4);
        j$.time.temporal.p n = this.a.n();
        BigDecimal valueOf = BigDecimal.valueOf(n.e());
        return wVar.o(this.a, movePointLeft.multiply(BigDecimal.valueOf(n.d()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact(), i4, i6);
    }

    @Override // j$.time.format.j
    public final String toString() {
        String str;
        if (this.g) {
            str = ",DecimalPoint";
        } else {
            str = "";
        }
        return "Fraction(" + String.valueOf(this.a) + "," + this.b + "," + this.c + str + ")";
    }

    C0087g(TemporalField temporalField, int i, int i2, boolean z, int i3) {
        super(temporalField, i, i2, G.NOT_NEGATIVE, i3);
        this.g = z;
    }
}
