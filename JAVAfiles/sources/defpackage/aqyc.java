package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aqyc {
    public static final Logger a = Logger.getLogger(aqyc.class.getName());
    public static final aqam c = new aqam();
    protected final IBinder b;

    /* JADX INFO: Access modifiers changed from: protected */
    public aqyc(IBinder iBinder) {
        this.b = iBinder;
    }

    public static aqyc b(IBinder iBinder, Executor executor) {
        if (iBinder instanceof Binder) {
            return new aqya(iBinder, executor);
        }
        return new aqyb(iBinder);
    }

    public abstract void a(int i, aqyg aqygVar);

    public final boolean c(int i, Parcel parcel) {
        try {
            return this.b.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
