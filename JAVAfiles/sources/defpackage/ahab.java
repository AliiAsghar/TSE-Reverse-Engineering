package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahab {
    public static final alor a;
    public final Executor b;
    final boolean c;
    public final ArrayDeque d = new ArrayDeque(1);

    static {
        alok alokVar = new alok();
        c(alokVar, agtz.b);
        c(alokVar, agtz.a);
        a = alokVar.g();
    }

    public ahab(Executor executor, boolean z) {
        this.b = executor;
        this.c = z;
    }

    private static void c(alok alokVar, Executor executor) {
        alokVar.h(executor, new ahab(executor, true));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, Class cls, agzu agzuVar, agzz agzzVar) {
        ahbe b = agzy.b(String.valueOf(str).concat(".enqueue"));
        try {
            synchronized (this.d) {
                agzuVar.a();
                this.d.offerLast(new aiim(str, cls, agzuVar, agzzVar));
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.b.execute(new agqd(this, 11));
    }
}
