package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class andz implements Runnable {
    final Future a;
    final andy b;

    public andz(Future future, andy andyVar) {
        this.a = future;
        this.b = andyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable i;
        Object obj = this.a;
        if ((obj instanceof anff) && (i = ((anff) obj).i()) != null) {
            this.b.a(i);
            return;
        }
        try {
            this.b.b(albo.bQ(this.a));
        } catch (ExecutionException e) {
            this.b.a(e.getCause());
        } catch (Throwable th) {
            this.b.a(th);
        }
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.a(this.b);
        return aj.toString();
    }
}
