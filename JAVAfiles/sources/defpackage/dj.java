package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dj {
    int a;
    cg b;
    boolean c;
    int d;
    int e;
    int f;
    int g;
    eng h;
    eng i;

    public dj() {
    }

    public dj(int i, cg cgVar) {
        this.a = i;
        this.b = cgVar;
        this.c = false;
        eng engVar = eng.RESUMED;
        this.h = engVar;
        this.i = engVar;
    }

    public dj(int i, cg cgVar, byte[] bArr) {
        this.a = i;
        this.b = cgVar;
        this.c = true;
        eng engVar = eng.RESUMED;
        this.h = engVar;
        this.i = engVar;
    }

    public dj(cg cgVar, eng engVar) {
        this.a = 10;
        this.b = cgVar;
        this.c = false;
        this.h = cgVar.Y;
        this.i = engVar;
    }
}
