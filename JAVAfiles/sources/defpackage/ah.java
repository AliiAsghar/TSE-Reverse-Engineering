package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ah {
    public final ktk h;
    private final ai i;
    public int a = 0;
    private int j = 8;
    public int[] b = new int[8];
    public int[] c = new int[8];
    public float[] d = new float[8];
    public int e = -1;
    public int f = -1;
    public boolean g = false;

    public ah(ai aiVar, ktk ktkVar) {
        this.i = aiVar;
        this.h = ktkVar;
    }

    public final float a(al alVar) {
        int i = this.e;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.b[i] == alVar.a) {
                return this.d[i];
            }
            i = this.c[i];
        }
        return brg.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float b(int i) {
        int i2 = this.e;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.d[i2];
            }
            i2 = this.c[i2];
        }
        return brg.a;
    }

    public final float c(al alVar) {
        int i = this.e;
        if (i != -1) {
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.a) {
                int i4 = this.b[i];
                if (i4 == alVar.a) {
                    if (i == this.e) {
                        this.e = this.c[i];
                    } else {
                        int[] iArr = this.c;
                        iArr[i3] = iArr[i];
                    }
                    ((al[]) this.h.c)[i4].a(this.i);
                    this.a--;
                    this.b[i] = -1;
                    if (this.g) {
                        this.f = i;
                    }
                    return this.d[i];
                }
                i2++;
                i3 = i;
                i = this.c[i];
            }
            return brg.a;
        }
        return brg.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final al d(int i) {
        int i2 = this.e;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return ((al[]) this.h.c)[this.b[i2]];
            }
            i2 = this.c[i2];
        }
        return null;
    }

    public final void e(al alVar, float f) {
        if (f != brg.a) {
            int i = this.e;
            if (i == -1) {
                this.e = 0;
                this.d[0] = f;
                this.b[0] = alVar.a;
                this.c[0] = -1;
                this.a++;
                if (!this.g) {
                    this.f++;
                    return;
                }
                return;
            }
            int i2 = -1;
            for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
                int i4 = this.b[i];
                int i5 = alVar.a;
                if (i4 == i5) {
                    float[] fArr = this.d;
                    float f2 = fArr[i] + f;
                    fArr[i] = f2;
                    if (f2 == brg.a) {
                        if (i == this.e) {
                            this.e = this.c[i];
                        } else {
                            int[] iArr = this.c;
                            iArr[i2] = iArr[i];
                        }
                        ((al[]) this.h.c)[i4].a(this.i);
                        if (this.g) {
                            this.f = i;
                        }
                        this.a--;
                        return;
                    }
                    return;
                }
                if (i4 < i5) {
                    i2 = i;
                }
                i = this.c[i];
            }
            int i6 = this.f;
            int i7 = i6 + 1;
            if (this.g) {
                int[] iArr2 = this.b;
                if (iArr2[i6] != -1) {
                    i6 = iArr2.length;
                }
            } else {
                i6 = i7;
            }
            int length = this.b.length;
            if (i6 >= length && this.a < length) {
                int i8 = 0;
                while (true) {
                    int[] iArr3 = this.b;
                    if (i8 >= iArr3.length) {
                        break;
                    }
                    if (iArr3[i8] == -1) {
                        i6 = i8;
                        break;
                    }
                    i8++;
                }
            }
            int length2 = this.b.length;
            if (i6 >= length2) {
                int i9 = this.j;
                int i10 = i9 + i9;
                this.j = i10;
                this.g = false;
                this.f = length2 - 1;
                this.d = Arrays.copyOf(this.d, i10);
                this.b = Arrays.copyOf(this.b, this.j);
                this.c = Arrays.copyOf(this.c, this.j);
                i6 = length2;
            }
            int[] iArr4 = this.b;
            iArr4[i6] = alVar.a;
            this.d[i6] = f;
            if (i2 != -1) {
                int[] iArr5 = this.c;
                iArr5[i6] = iArr5[i2];
                iArr5[i2] = i6;
            } else {
                this.c[i6] = this.e;
                this.e = i6;
            }
            this.a++;
            if (!this.g) {
                this.f++;
            }
            int i11 = this.f;
            int length3 = iArr4.length;
            if (i11 >= length3) {
                this.g = true;
                this.f = length3 - 1;
            }
        }
    }

    public final void f(al alVar, float f) {
        if (f == brg.a) {
            c(alVar);
            return;
        }
        int i = this.e;
        if (i == -1) {
            this.e = 0;
            this.d[0] = f;
            this.b[0] = alVar.a;
            this.c[0] = -1;
            this.a++;
            if (!this.g) {
                this.f++;
                return;
            }
            return;
        }
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
            int i4 = this.b[i];
            int i5 = alVar.a;
            if (i4 == i5) {
                this.d[i] = f;
                return;
            }
            if (i4 < i5) {
                i2 = i;
            }
            i = this.c[i];
        }
        int i6 = this.f;
        int i7 = i6 + 1;
        if (this.g) {
            int[] iArr = this.b;
            if (iArr[i6] != -1) {
                i6 = iArr.length;
            }
        } else {
            i6 = i7;
        }
        int length = this.b.length;
        if (i6 >= length && this.a < length) {
            int i8 = 0;
            while (true) {
                int[] iArr2 = this.b;
                if (i8 >= iArr2.length) {
                    break;
                }
                if (iArr2[i8] == -1) {
                    i6 = i8;
                    break;
                }
                i8++;
            }
        }
        int length2 = this.b.length;
        if (i6 >= length2) {
            int i9 = this.j;
            int i10 = i9 + i9;
            this.j = i10;
            this.g = false;
            this.f = length2 - 1;
            this.d = Arrays.copyOf(this.d, i10);
            this.b = Arrays.copyOf(this.b, this.j);
            this.c = Arrays.copyOf(this.c, this.j);
            i6 = length2;
        }
        int[] iArr3 = this.b;
        iArr3[i6] = alVar.a;
        this.d[i6] = f;
        if (i2 != -1) {
            int[] iArr4 = this.c;
            iArr4[i6] = iArr4[i2];
            iArr4[i2] = i6;
        } else {
            this.c[i6] = this.e;
            this.e = i6;
        }
        int i11 = this.a + 1;
        this.a = i11;
        if (!this.g) {
            this.f++;
        }
        if (i11 >= iArr3.length) {
            this.g = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(ai aiVar, ai aiVar2) {
        int i = this.e;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
                int i3 = this.b[i];
                al alVar = aiVar2.a;
                if (i3 == alVar.a) {
                    float f = this.d[i];
                    c(alVar);
                    ah ahVar = aiVar2.d;
                    int i4 = ahVar.e;
                    for (int i5 = 0; i4 != -1 && i5 < ahVar.a; i5++) {
                        e(((al[]) this.h.c)[ahVar.b[i4]], ahVar.d[i4] * f);
                        i4 = ahVar.c[i4];
                    }
                    aiVar.b += aiVar2.b * f;
                    aiVar2.a.a(aiVar);
                    i = this.e;
                } else {
                    i = this.c[i];
                }
            }
            return;
        }
    }

    public final String toString() {
        int i = this.e;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            String str2 = str.concat(" -> ") + this.d[i] + " : ";
            al alVar = ((al[]) this.h.c)[this.b[i]];
            Objects.toString(alVar);
            str = str2.concat(String.valueOf(alVar));
            i = this.c[i];
        }
        return str;
    }
}
