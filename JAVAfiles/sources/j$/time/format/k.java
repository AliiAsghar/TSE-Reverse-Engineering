package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class k implements InterfaceC0086f {
    static final String[] d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};
    static final k e = new k("+HH:MM:ss", "Z");
    static final k f = new k("+HH:MM:ss", "0");
    private final String a;
    private final int b;
    private final int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(String str, String str2) {
        Objects.a(str, "pattern");
        int i = 0;
        while (true) {
            String[] strArr = d;
            if (i < 22) {
                if (strArr[i].equals(str)) {
                    this.b = i;
                    this.c = i % 11;
                    this.a = str2;
                    return;
                }
                i++;
            } else {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
        }
    }

    private static void a(boolean z, int i, StringBuilder sb) {
        String str;
        if (z) {
            str = ":";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    private static boolean b(CharSequence charSequence, boolean z, int i, int[] iArr) {
        int i2 = iArr[0];
        if (i2 < 0) {
            return true;
        }
        if (z && i != 1) {
            int i3 = i2 + 1;
            if (i3 > charSequence.length() || charSequence.charAt(i2) != ':') {
                return false;
            }
            i2 = i3;
        }
        int i4 = i2 + 2;
        if (i4 > charSequence.length()) {
            return false;
        }
        int i5 = i2 + 1;
        char charAt = charSequence.charAt(i2);
        char charAt2 = charSequence.charAt(i5);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            int i6 = (charAt2 - '0') + ((charAt - '0') * 10);
            if (i6 >= 0 && i6 <= 59) {
                iArr[i] = i6;
                iArr[0] = i4;
                return true;
            }
        }
        return false;
    }

    private static void c(CharSequence charSequence, boolean z, int[] iArr) {
        if (z) {
            if (!b(charSequence, false, 1, iArr)) {
                iArr[0] = ~iArr[0];
                return;
            }
            return;
        }
        e(charSequence, 1, 2, iArr);
    }

    private static void d(CharSequence charSequence, boolean z, boolean z2, int[] iArr) {
        if (!b(charSequence, z, 2, iArr) && z2) {
            iArr[0] = ~iArr[0];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r12[0] = ~r12[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(java.lang.CharSequence r9, int r10, int r11, int[] r12) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.k.e(java.lang.CharSequence, int, int, int[]):void");
    }

    @Override // j$.time.format.InterfaceC0086f
    public final boolean n(z zVar, StringBuilder sb) {
        String str;
        boolean z;
        Long e2 = zVar.e(ChronoField.OFFSET_SECONDS);
        boolean z2 = false;
        if (e2 == null) {
            return false;
        }
        int f2 = j$.nio.channels.c.f(e2.longValue());
        String str2 = this.a;
        if (f2 == 0) {
            sb.append(str2);
        } else {
            int abs = Math.abs((f2 / 3600) % 100);
            int abs2 = Math.abs((f2 / 60) % 60);
            int abs3 = Math.abs(f2 % 60);
            int length = sb.length();
            if (f2 < 0) {
                str = "-";
            } else {
                str = "+";
            }
            sb.append(str);
            if (this.b < 11 || abs >= 10) {
                a(false, abs, sb);
            } else {
                sb.append((char) (abs + 48));
            }
            int i = this.c;
            if ((i >= 3 && i <= 8) || ((i >= 9 && abs3 > 0) || (i >= 1 && abs2 > 0))) {
                if (i > 0 && i % 2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                a(z, abs2, sb);
                abs += abs2;
                if (i == 7 || i == 8 || (i >= 5 && abs3 > 0)) {
                    if (i > 0 && i % 2 == 0) {
                        z2 = true;
                    }
                    a(z2, abs3, sb);
                    abs += abs3;
                }
            }
            if (abs == 0) {
                sb.setLength(length);
                sb.append(str2);
            }
        }
        return true;
    }

    @Override // j$.time.format.InterfaceC0086f
    public final int t(w wVar, CharSequence charSequence, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int length = charSequence.length();
        int length2 = this.a.length();
        if (length2 == 0) {
            if (i == length) {
                return wVar.o(ChronoField.OFFSET_SECONDS, 0L, i, i);
            }
        } else {
            if (i == length) {
                return ~i;
            }
            if (wVar.s(charSequence, i, this.a, 0, length2)) {
                return wVar.o(ChronoField.OFFSET_SECONDS, 0L, i, i + length2);
            }
        }
        char charAt = charSequence.charAt(i);
        if (charAt == '+' || charAt == '-') {
            if (charAt == '-') {
                i2 = -1;
            } else {
                i2 = 1;
            }
            int i7 = this.c;
            if (i7 > 0 && i7 % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            int i8 = this.b;
            if (i8 < 11) {
                z2 = true;
            } else {
                z2 = false;
            }
            int[] iArr = new int[4];
            iArr[0] = i + 1;
            if (!wVar.l()) {
                if (z2) {
                    if (!z && (i8 != 0 || length <= (i6 = i + 3) || charSequence.charAt(i6) != ':')) {
                        i8 = 9;
                    } else {
                        i8 = 10;
                        z = true;
                    }
                } else if (!z && (i8 != 11 || length <= (i5 = i + 3) || (charSequence.charAt(i + 2) != ':' && charSequence.charAt(i5) != ':'))) {
                    i8 = 20;
                } else {
                    i8 = 21;
                    z = true;
                }
            }
            switch (i8) {
                case 0:
                case 11:
                    c(charSequence, z2, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    c(charSequence, z2, iArr);
                    d(charSequence, z, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    c(charSequence, z2, iArr);
                    d(charSequence, z, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    c(charSequence, z2, iArr);
                    d(charSequence, z, true, iArr);
                    b(charSequence, z, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    c(charSequence, z2, iArr);
                    d(charSequence, z, true, iArr);
                    if (!b(charSequence, z, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                        break;
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    c(charSequence, z2, iArr);
                    if (b(charSequence, z, 2, iArr)) {
                        b(charSequence, z, 3, iArr);
                        break;
                    }
                    break;
                case 12:
                    e(charSequence, 1, 4, iArr);
                    break;
                case 14:
                    e(charSequence, 3, 4, iArr);
                    break;
                case 16:
                    e(charSequence, 3, 6, iArr);
                    break;
                case 18:
                    e(charSequence, 5, 6, iArr);
                    break;
                case 20:
                    e(charSequence, 1, 6, iArr);
                    break;
            }
            int i9 = iArr[0];
            if (i9 > 0) {
                int i10 = iArr[1];
                if (i10 <= 23 && (i3 = iArr[2]) <= 59 && (i4 = iArr[3]) <= 59) {
                    return wVar.o(ChronoField.OFFSET_SECONDS, ((i3 * 60) + (i10 * 3600) + i4) * i2, i, i9);
                }
                throw new RuntimeException("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
            }
        }
        if (length2 == 0) {
            return wVar.o(ChronoField.OFFSET_SECONDS, 0L, i, i);
        }
        return ~i;
    }

    public final String toString() {
        String replace = this.a.replace("'", "''");
        return "Offset(" + d[this.b] + ",'" + replace + "')";
    }
}
