package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class atim implements atjg, atje {
    protected final int a;
    protected final int b;
    private final atfy c;

    /* JADX INFO: Access modifiers changed from: protected */
    public atim(atfy atfyVar, int i, int i2) {
        this.c = atfyVar;
        this.a = i;
        this.b = i2 > 18 ? 18 : i2;
    }

    @Override // defpackage.atje
    public final int a() {
        return this.b;
    }

    @Override // defpackage.atjg
    public final int b() {
        return this.b;
    }

    @Override // defpackage.atje
    public final int c(atja atjaVar, CharSequence charSequence, int i) {
        atfw a = this.c.a(atjaVar.a);
        int min = Math.min(this.b, charSequence.length() - i);
        long c = a.q().c() * 10;
        int i2 = 0;
        long j = 0;
        while (i2 < min) {
            char charAt = charSequence.charAt(i + i2);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            c /= 10;
            j += (charAt - '0') * c;
            i2++;
        }
        long j2 = j / 10;
        if (i2 != 0 && j2 <= 2147483647L) {
            int i3 = i + i2;
            atjaVar.c().c(new athz(atfy.x, athx.a, a.q()), (int) j2);
            return i3;
        }
        return ~i;
    }

    @Override // defpackage.atjg
    public final void d(Appendable appendable, long j, atfu atfuVar, int i, atgc atgcVar, Locale locale) {
        long j2;
        String l;
        atfw a = this.c.a(atfuVar);
        int i2 = this.a;
        try {
            long f = a.f(j);
            if (f == 0) {
                while (true) {
                    i2--;
                    if (i2 >= 0) {
                        appendable.append('0');
                    } else {
                        return;
                    }
                }
            } else {
                long c = a.q().c();
                int i3 = this.b;
                while (true) {
                    switch (i3) {
                        case 1:
                            j2 = 10;
                            break;
                        case 2:
                            j2 = 100;
                            break;
                        case 3:
                            j2 = 1000;
                            break;
                        case 4:
                            j2 = 10000;
                            break;
                        case 5:
                            j2 = 100000;
                            break;
                        case 6:
                            j2 = 1000000;
                            break;
                        case 7:
                            j2 = 10000000;
                            break;
                        case 8:
                            j2 = 100000000;
                            break;
                        case 9:
                            j2 = 1000000000;
                            break;
                        case 10:
                            j2 = 10000000000L;
                            break;
                        case 11:
                            j2 = 100000000000L;
                            break;
                        case 12:
                            j2 = 1000000000000L;
                            break;
                        case 13:
                            j2 = 10000000000000L;
                            break;
                        case 14:
                            j2 = 100000000000000L;
                            break;
                        case 15:
                            j2 = 1000000000000000L;
                            break;
                        case 16:
                            j2 = 10000000000000000L;
                            break;
                        case 17:
                            j2 = 100000000000000000L;
                            break;
                        case 18:
                            j2 = 1000000000000000000L;
                            break;
                        default:
                            j2 = 1;
                            break;
                    }
                    if ((c * j2) / j2 == c) {
                        long j3 = (f * j2) / c;
                        long j4 = i3;
                        long j5 = new long[]{j3, j4}[0];
                        if ((2147483647L & j5) == j5) {
                            l = Integer.toString((int) j5);
                        } else {
                            l = Long.toString(j5);
                        }
                        int i4 = (int) j4;
                        int length = l.length();
                        while (length < i4) {
                            appendable.append('0');
                            i2--;
                            i4--;
                        }
                        if (i2 < i4) {
                            while (i2 < i4 && length > 1) {
                                int i5 = length - 1;
                                if (l.charAt(i5) == '0') {
                                    i4--;
                                    length = i5;
                                }
                            }
                            if (length < l.length()) {
                                for (int i6 = 0; i6 < length; i6++) {
                                    appendable.append(l.charAt(i6));
                                }
                                return;
                            }
                        }
                        appendable.append(l);
                        return;
                    }
                    i3--;
                }
            }
        } catch (RuntimeException unused) {
            atix.b(appendable, i2);
        }
    }
}
