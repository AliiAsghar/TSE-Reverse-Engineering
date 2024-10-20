package defpackage;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class atmx implements Cloneable, Comparable, Serializable {
    private static final DecimalFormat a;
    public static final /* synthetic */ int j = 0;
    private static final long serialVersionUID = 2694906050116005466L;
    public atmk f;
    protected int g;
    protected int h;
    protected long i;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        a = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public atmx() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String h(byte[] bArr, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        if (z) {
            stringBuffer.append('\"');
        }
        for (byte b : bArr) {
            int i = b & 255;
            if (i >= 32 && i < 127) {
                if (i != 34 && i != 92) {
                    stringBuffer.append((char) i);
                } else {
                    stringBuffer.append('\\');
                    stringBuffer.append((char) i);
                }
            } else {
                stringBuffer.append('\\');
                stringBuffer.append(a.format(i));
            }
        }
        if (z) {
            stringBuffer.append('\"');
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String i(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer("\\# ");
        stringBuffer.append(bArr.length);
        stringBuffer.append(" ");
        stringBuffer.append(atpj.c(bArr));
        return stringBuffer.toString();
    }

    public static final atmx k(atmk atmkVar, int i, int i2, long j2, boolean z) {
        atmx atkzVar;
        if (z) {
            atnt atntVar = atnu.a;
            atnu.b(i);
            atmx atmxVar = (atmx) atntVar.f.get(atnt.b(i));
            if (atmxVar != null) {
                atkzVar = atmxVar.b();
            } else {
                atkzVar = new atnz();
            }
        } else {
            atkzVar = new atkz();
        }
        atkzVar.f = atmkVar;
        atkzVar.g = i;
        atkzVar.h = i2;
        atkzVar.i = j2;
        return atkzVar;
    }

    public static atmx l(atmk atmkVar, int i, int i2) {
        return m(atmkVar, i, i2, 0L);
    }

    public static atmx m(atmk atmkVar, int i, int i2, long j2) {
        if (atmkVar.j()) {
            atnu.b(i);
            atkp.b(i2);
            atow.e(j2);
            return k(atmkVar, i, i2, j2, false);
        }
        throw new atmy(atmkVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void p(atmk atmkVar) {
        if (atmkVar.j()) {
        } else {
            throw new atmy(atmkVar);
        }
    }

    public abstract String a();

    public abstract atmx b();

    public abstract void c(atkt atktVar);

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int length;
        atmx atmxVar = (atmx) obj;
        int i = 0;
        if (this == atmxVar) {
            return 0;
        }
        int compareTo = this.f.compareTo(atmxVar.f);
        if (compareTo != 0) {
            return compareTo;
        }
        int i2 = this.h - atmxVar.h;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.g - atmxVar.g;
        if (i3 != 0) {
            return i3;
        }
        byte[] o = o();
        byte[] o2 = atmxVar.o();
        while (true) {
            length = o.length;
            if (i >= length || i >= o2.length) {
                break;
            }
            int i4 = (o[i] & 255) - (o2[i] & 255);
            if (i4 != 0) {
                return i4;
            }
            i++;
        }
        return length - o2.length;
    }

    public abstract void d(atkv atkvVar, atkn atknVar, boolean z);

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof atmx)) {
            atmx atmxVar = (atmx) obj;
            if (this.g == atmxVar.g && this.h == atmxVar.h && this.f.equals(atmxVar.f)) {
                return Arrays.equals(o(), atmxVar.o());
            }
            return false;
        }
        return false;
    }

    public final int g() {
        int i = this.g;
        if (i == 46) {
            return ((atmt) this).a;
        }
        return i;
    }

    public final int hashCode() {
        atkv atkvVar = new atkv();
        this.f.i(atkvVar);
        atkvVar.d(this.g);
        atkvVar.d(this.h);
        atkvVar.f(0L);
        int i = atkvVar.a;
        atkvVar.d(0);
        d(atkvVar, null, true);
        atkvVar.e((atkvVar.a - i) - 2, i);
        int i2 = 0;
        for (byte b : atkvVar.h()) {
            i2 += (i2 << 3) + (b & 255);
        }
        return i2;
    }

    public atmk hr() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final atmx j() {
        try {
            return (atmx) clone();
        } catch (CloneNotSupportedException unused) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(atkv atkvVar, int i, atkn atknVar) {
        this.f.g(atkvVar, atknVar);
        atkvVar.d(this.g);
        atkvVar.d(this.h);
        if (i == 0) {
            return;
        }
        atkvVar.f(this.i);
        int i2 = atkvVar.a;
        atkvVar.d(0);
        d(atkvVar, atknVar, false);
        atkvVar.e((atkvVar.a - i2) - 2, i2);
    }

    public final byte[] o() {
        atkv atkvVar = new atkv();
        d(atkvVar, null, true);
        return atkvVar.h();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f);
        if (stringBuffer.length() < 8) {
            stringBuffer.append("\t");
        }
        if (stringBuffer.length() < 16) {
            stringBuffer.append("\t");
        }
        stringBuffer.append("\t");
        if (atmp.a("BINDTTL")) {
            long j2 = this.i;
            atow.e(j2);
            StringBuffer stringBuffer2 = new StringBuffer();
            long j3 = j2 % 60;
            long j4 = j2 / 60;
            long j5 = j4 / 60;
            long j6 = j5 / 24;
            long j7 = j6 / 7;
            if (j7 > 0) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append(j7);
                stringBuffer3.append("W");
                stringBuffer2.append(stringBuffer3.toString());
            }
            long j8 = j6 % 7;
            if (j8 > 0) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(j8);
                stringBuffer4.append("D");
                stringBuffer2.append(stringBuffer4.toString());
            }
            long j9 = j5 % 24;
            if (j9 > 0) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append(j9);
                stringBuffer5.append("H");
                stringBuffer2.append(stringBuffer5.toString());
            }
            long j10 = j4 % 60;
            if (j10 > 0) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append(j10);
                stringBuffer6.append("M");
                stringBuffer2.append(stringBuffer6.toString());
            }
            if (j3 > 0 || (j7 == 0 && j8 == 0 && j9 == 0 && j10 == 0)) {
                StringBuffer stringBuffer7 = new StringBuffer();
                stringBuffer7.append(j3);
                stringBuffer7.append("S");
                stringBuffer2.append(stringBuffer7.toString());
            }
            stringBuffer.append(stringBuffer2.toString());
        } else {
            stringBuffer.append(this.i);
        }
        stringBuffer.append("\t");
        if (this.h != 1 || !atmp.a("noPrintIN")) {
            stringBuffer.append(atkp.a(this.h));
            stringBuffer.append("\t");
        }
        stringBuffer.append(atnu.a(this.g));
        String a2 = a();
        if (!a2.equals("")) {
            stringBuffer.append("\t");
            stringBuffer.append(a2);
        }
        return stringBuffer.toString();
    }

    public atmx(atmk atmkVar, int i) {
        if (atmkVar.j()) {
            atnu.b(6);
            atkp.b(i);
            atow.e(0L);
            this.f = atmkVar;
            this.g = 6;
            this.h = i;
            this.i = 0L;
            return;
        }
        throw new atmy(atmkVar);
    }
}
