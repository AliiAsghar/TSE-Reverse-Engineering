package defpackage;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djo {
    public final Layout a;
    private final List b;
    private final List c;
    private final boolean[] d;
    private char[] e;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public final int a;
        public final int b;
        public final boolean c;

        public a(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((this.a * 31) + this.b) * 31) + defpackage.a.v(this.c);
        }

        public final String toString() {
            return "BidiRun(start=" + this.a + ", end=" + this.b + ", isRtl=" + this.c + ')';
        }
    }

    public djo(Layout layout) {
        this.a = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int S = arsd.S(this.a.getText(), '\n', i, 4);
            if (S < 0) {
                i = this.a.getText().length();
            } else {
                i = S + 1;
            }
            arrayList.add(Integer.valueOf(i));
        } while (i < this.a.getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[this.b.size()];
        this.b.size();
    }

    private final float g(int i, boolean z) {
        Layout layout = this.a;
        int s = arrn.s(i, layout.getLineEnd(layout.getLineForOffset(i)));
        if (z) {
            return this.a.getPrimaryHorizontal(s);
        }
        return this.a.getSecondaryHorizontal(s);
    }

    public final float a(int i, boolean z, boolean z2) {
        Bidi bidi;
        boolean z3;
        int i2 = i;
        if (!z2) {
            return g(i, z);
        }
        int a2 = djn.a(this.a, i2);
        int lineStart = this.a.getLineStart(a2);
        int lineEnd = this.a.getLineEnd(a2);
        if (i2 != lineStart && i2 != lineEnd) {
            return g(i, z);
        }
        if (i2 != 0 && i2 != this.a.getText().length()) {
            boolean z4 = true;
            int b = b(i2, true);
            boolean f = f(b);
            int d = d(lineEnd, lineStart);
            int c = c(b);
            int i3 = lineStart - c;
            int i4 = d - c;
            Bidi e = e(b);
            if (e != null) {
                bidi = e.createLineBidi(i3, i4);
            } else {
                bidi = null;
            }
            int i5 = 0;
            if (bidi != null && bidi.getRunCount() != 1) {
                int runCount = bidi.getRunCount();
                a[] aVarArr = new a[runCount];
                for (int i6 = 0; i6 < runCount; i6++) {
                    int runStart = bidi.getRunStart(i6) + lineStart;
                    int runLimit = bidi.getRunLimit(i6) + lineStart;
                    if (bidi.getRunLevel(i6) % 2 == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    aVarArr[i6] = new a(runStart, runLimit, z3);
                }
                int runCount2 = bidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i7 = 0; i7 < runCount2; i7++) {
                    bArr[i7] = (byte) bidi.getRunLevel(i7);
                }
                Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
                if (i2 == lineStart) {
                    int i8 = 0;
                    while (true) {
                        if (i8 < runCount) {
                            if (aVarArr[i8].a == i2) {
                                break;
                            }
                            i8++;
                        } else {
                            i8 = -1;
                            break;
                        }
                    }
                    a aVar = aVarArr[i8];
                    if (z || f == aVar.c) {
                        if (!f) {
                            f = true;
                        } else {
                            f = false;
                        }
                    }
                    if (i8 == 0) {
                        if (f) {
                            return this.a.getLineLeft(a2);
                        }
                    } else {
                        i5 = i8;
                    }
                    if (i5 == aqil.i(aVarArr) && !f) {
                        return this.a.getLineRight(a2);
                    }
                    if (f) {
                        return this.a.getPrimaryHorizontal(aVarArr[i5 - 1].a);
                    }
                    return this.a.getPrimaryHorizontal(aVarArr[i5 + 1].a);
                }
                if (i2 > d) {
                    i2 = d(i2, lineStart);
                }
                int i9 = 0;
                while (true) {
                    if (i9 < runCount) {
                        if (aVarArr[i9].b == i2) {
                            break;
                        }
                        i9++;
                    } else {
                        i9 = -1;
                        break;
                    }
                }
                a aVar2 = aVarArr[i9];
                if (!z && f != aVar2.c) {
                    f = !f;
                }
                if (i9 == 0) {
                    if (f) {
                        return this.a.getLineLeft(a2);
                    }
                } else {
                    i5 = i9;
                }
                if (i5 == aqil.i(aVarArr) && !f) {
                    return this.a.getLineRight(a2);
                }
                if (f) {
                    return this.a.getPrimaryHorizontal(aVarArr[i5 - 1].b);
                }
                return this.a.getPrimaryHorizontal(aVarArr[i5 + 1].b);
            }
            boolean isRtlCharAt = this.a.isRtlCharAt(lineStart);
            if (!z && f != isRtlCharAt) {
                z4 = f;
            } else if (f) {
                z4 = false;
            }
            if (i2 != lineStart ? !z4 : z4) {
                return this.a.getLineLeft(a2);
            }
            return this.a.getLineRight(a2);
        }
        return g(i, z);
    }

    public final int b(int i, boolean z) {
        int i2;
        int H = aqjn.H(this.b, Integer.valueOf(i));
        if (H < 0) {
            i2 = -(H + 1);
        } else {
            i2 = H + 1;
        }
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) this.b.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final int c(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) this.b.get(i - 1)).intValue();
    }

    public final int d(int i, int i2) {
        while (i > i2) {
            int i3 = i - 1;
            char charAt = this.a.getText().charAt(i3);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760) {
                if (arro.a(charAt, 8192) >= 0 && arro.a(charAt, 8202) <= 0) {
                    if (charAt == 8199) {
                        charAt = 8199;
                    } else {
                        continue;
                    }
                }
                if (charAt != 8287 && charAt != 12288) {
                    break;
                }
            }
            i = i3;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r0.getRunCount() == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi e(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.d
            boolean r0 = r0[r12]
            if (r0 == 0) goto Lf
            java.util.List r0 = r11.c
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        Lf:
            r0 = 0
            if (r12 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List r1 = r11.b
            int r2 = r12 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List r2 = r11.b
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.e
            if (r3 == 0) goto L37
            int r4 = r3.length
            if (r4 >= r8) goto L39
        L37:
            char[] r3 = new char[r8]
        L39:
            r10 = r3
            android.text.Layout r3 = r11.a
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L5f
            boolean r9 = r11.f(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r1) goto L60
        L5f:
            r0 = r2
        L60:
            java.util.List r3 = r11.c
            r3.set(r12, r0)
            boolean[] r3 = r11.d
            r3[r12] = r1
            if (r0 == 0) goto L72
            char[] r12 = r11.e
            if (r10 != r12) goto L71
            r10 = r2
            goto L72
        L71:
            r10 = r12
        L72:
            r11.e = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djo.e(int):java.text.Bidi");
    }

    public final boolean f(int i) {
        if (this.a.getParagraphDirection(this.a.getLineForOffset(c(i))) == -1) {
            return true;
        }
        return false;
    }
}
