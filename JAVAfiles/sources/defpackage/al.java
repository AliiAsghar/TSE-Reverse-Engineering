package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class al {
    public float d;
    public int h;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public final float[] e = new float[6];
    ai[] f = new ai[8];
    int g = 0;

    public al(int i) {
        this.h = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ai aiVar) {
        int i = 0;
        for (int i2 = 0; i2 < this.g; i2++) {
            if (this.f[i2] == aiVar) {
                while (true) {
                    int i3 = this.g;
                    if (i < (i3 - i2) - 1) {
                        ai[] aiVarArr = this.f;
                        int i4 = i2 + i;
                        aiVarArr[i4] = aiVarArr[i4 + 1];
                        i++;
                    } else {
                        this.g = i3 - 1;
                        return;
                    }
                }
            }
        }
    }

    public final void b() {
        this.h = 5;
        this.c = 0;
        this.a = -1;
        this.b = -1;
        this.d = brg.a;
        this.g = 0;
    }

    public final String toString() {
        return "null";
    }
}
