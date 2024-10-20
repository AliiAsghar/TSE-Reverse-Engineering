package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyc {
    public int a;
    public int b;
    public int c;

    public abyc() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public final fxt a() {
        dzg.e(true, "Bitrate can not be set if enabling high quality targeting.");
        dzg.e(true, "Bitrate mode must be VBR if enabling high quality targeting.");
        return new fxt(this.a, this.c, this.b);
    }

    public final void b(int i, int i2) {
        this.c = i;
        this.b = i2;
    }

    public final void c(euf eufVar) {
        this.a = eufVar.f();
        this.c = eufVar.f();
        this.b = 0;
    }

    public abyc(fxt fxtVar) {
        this.a = fxtVar.b;
        this.c = fxtVar.d;
        this.b = fxtVar.e;
    }

    public abyc(byte[] bArr) {
        this.a = -1;
        this.c = -1;
        this.b = -1;
    }

    public abyc(byte[] bArr, byte[] bArr2) {
    }
}
