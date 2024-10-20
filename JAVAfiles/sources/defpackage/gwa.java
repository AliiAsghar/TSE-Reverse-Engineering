package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwa implements Runnable {
    private final int a;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object d;

    public gwa(gwd gwdVar, Intent intent, int i, int i2) {
        this.b = i2;
        this.c = gwdVar;
        this.d = intent;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            ?? r0 = this.c;
            int i = this.a;
            int size = r0.size();
            int i2 = 0;
            if (i != 1) {
                while (i2 < size) {
                    ((dyl) this.c.get(i2)).d((Throwable) this.d);
                    i2++;
                }
                return;
            } else {
                while (i2 < size) {
                    ((dyl) this.c.get(i2)).e();
                    i2++;
                }
                return;
            }
        }
        Object obj = this.c;
        gwd gwdVar = (gwd) obj;
        gwdVar.d((Intent) this.d, this.a);
    }

    public gwa(Collection collection, int i, Throwable th, int i2) {
        this.b = i2;
        d.aC(collection, "initCallbacks cannot be null");
        this.c = new ArrayList(collection);
        this.a = i;
        this.d = th;
    }
}
