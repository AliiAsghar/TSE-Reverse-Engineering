package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duq implements Comparable {
    public static int a = 1;
    public boolean b;
    public float f;
    int n;
    public int c = -1;
    int d = -1;
    public int e = 0;
    public boolean g = false;
    final float[] h = new float[9];
    final float[] i = new float[9];
    dum[] j = new dum[16];
    int k = 0;
    public int l = 0;
    boolean m = false;

    public duq(int i) {
        this.n = i;
    }

    public final void a(dum dumVar) {
        int i = 0;
        while (true) {
            int i2 = this.k;
            if (i < i2) {
                if (this.j[i] == dumVar) {
                    return;
                } else {
                    i++;
                }
            } else {
                dum[] dumVarArr = this.j;
                int length = dumVarArr.length;
                if (i2 >= length) {
                    this.j = (dum[]) Arrays.copyOf(dumVarArr, length + length);
                }
                dum[] dumVarArr2 = this.j;
                int i3 = this.k;
                dumVarArr2[i3] = dumVar;
                this.k = i3 + 1;
                return;
            }
        }
    }

    public final void b(dum dumVar) {
        int i = this.k;
        int i2 = 0;
        while (i2 < i) {
            if (this.j[i2] == dumVar) {
                while (i2 < i - 1) {
                    dum[] dumVarArr = this.j;
                    int i3 = i2 + 1;
                    dumVarArr[i2] = dumVarArr[i3];
                    i2 = i3;
                }
                this.k--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.n = 5;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = brg.a;
        this.g = false;
        this.m = false;
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.l = 0;
        this.b = false;
        Arrays.fill(this.i, brg.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.c - ((duq) obj).c;
    }

    public final void d(dun dunVar, float f) {
        this.f = f;
        this.g = true;
        this.m = false;
        int i = this.k;
        this.d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].c(dunVar, this, false);
        }
        this.k = 0;
    }

    public final void e(dun dunVar, dum dumVar) {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].d(dunVar, dumVar, false);
        }
        this.k = 0;
    }

    public final String toString() {
        return "" + this.c;
    }
}
