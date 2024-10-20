package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aswl {
    public final int a;
    public final int b;
    public final int c;
    private final int d;

    public aswl(int i) {
        new asti(128);
        new asti(256);
        if (i != 2) {
            if (i != 3) {
                if (i == 5) {
                    this.b = 8;
                    this.c = 7;
                    this.d = 524288;
                    this.a = 96;
                } else {
                    throw new IllegalArgumentException(a.cb(i, "The mode ", "is not supported by Crystals Dilithium!"));
                }
            } else {
                this.b = 6;
                this.c = 5;
                this.d = 524288;
                this.a = 128;
            }
        } else {
            this.b = 4;
            this.c = 4;
            this.d = 131072;
            this.a = 96;
        }
        new aotl((char[]) null);
        int i2 = this.d;
        if (i2 == 131072 || i2 == 524288) {
        } else {
            throw new RuntimeException("Wrong Dilithium Gamma1!");
        }
    }
}
