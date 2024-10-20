package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asgb extends asga {
    public final Runnable a;

    public asgb(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        String str;
        Runnable runnable = this.a;
        String a = arwi.a(runnable);
        String b = arwi.b(runnable);
        long j = this.g;
        boolean z = this.h;
        String str2 = asgc.a;
        if (true != z) {
            str = "Non-blocking";
        } else {
            str = "Blocking";
        }
        return "Task[" + a + "@" + b + ", " + j + ", " + str + "]";
    }
}
