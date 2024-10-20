package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class asfz extends arxe {
    private final String a;
    private final asfw b;

    public asfz(int i, int i2, long j, String str) {
        this.a = str;
        this.b = new asfw(i, i2, j, str);
    }

    @Override // defpackage.arwb
    public final void a(arpi arpiVar, Runnable runnable) {
        asfw.e(this.b, runnable, false, 6);
    }

    public final void c(Runnable runnable, boolean z) {
        this.b.a(runnable, true, z);
    }

    public void close() {
        this.b.close();
    }

    @Override // defpackage.arxe
    public final Executor g() {
        return this.b;
    }

    @Override // defpackage.arwb
    public final void h(arpi arpiVar, Runnable runnable) {
        asfw.e(this.b, runnable, true, 2);
    }
}
