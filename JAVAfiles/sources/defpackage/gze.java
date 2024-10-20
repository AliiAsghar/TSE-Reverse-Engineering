package defpackage;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gze implements Callable {
    final /* synthetic */ gih a;
    final /* synthetic */ gzn b;

    public gze(gzn gznVar, gih gihVar) {
        this.b = gznVar;
        this.a = gihVar;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean call() {
        boolean z;
        boolean z2 = false;
        Cursor bC = gvf.bC(this.b.a, this.a, false);
        try {
            if (bC.moveToFirst()) {
                if (bC.getInt(0) != 0) {
                    z2 = true;
                }
                z = Boolean.valueOf(z2);
            } else {
                z = false;
            }
            return z;
        } finally {
            bC.close();
        }
    }

    protected final void finalize() {
        this.a.j();
    }
}
