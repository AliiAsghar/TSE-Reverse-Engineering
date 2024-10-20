package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjw implements Runnable {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;
    private final Object d;

    public hjw(Handler handler, Callable callable, ecd ecdVar, int i) {
        this.a = i;
        this.d = callable;
        this.c = ecdVar;
        this.b = handler;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        hkh hkhVar;
        atal atalVar;
        if (this.a != 0) {
            try {
                atalVar = ((ebs) this.d).call();
            } catch (Exception unused) {
                atalVar = null;
            }
            ((Handler) this.b).post(new bn(this.c, atalVar, 17, (char[]) null));
            return;
        }
        if (((hkd) this.b).i()) {
            ((hkd) this.b).f("canceled-at-delivery");
            return;
        }
        akju akjuVar = (akju) this.c;
        if (akjuVar.b()) {
            ((hkd) this.b).e(akjuVar.d);
        } else {
            Object obj = this.b;
            synchronized (((hkd) obj).d) {
                hkhVar = ((hkd) obj).e;
            }
            if (hkhVar != null) {
                hkhVar.a((hkl) akjuVar.b);
            }
        }
        if (((akju) this.c).a) {
            ((hkd) this.b).c("intermediate-response");
        } else {
            ((hkd) this.b).f("done");
        }
        ?? r0 = this.d;
        if (r0 != 0) {
            r0.run();
        }
    }

    public hjw(hkd hkdVar, akju akjuVar, Runnable runnable, int i) {
        this.a = i;
        this.b = hkdVar;
        this.c = akjuVar;
        this.d = runnable;
    }
}
