package defpackage;

import android.os.Parcel;
import java.io.Closeable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqyg implements Closeable {
    private Parcel a;

    public aqyg(Parcel parcel) {
        this.a = parcel;
    }

    public static aqyg c() {
        return new aqyg(Parcel.obtain());
    }

    public final Parcel a() {
        boolean z;
        if (this.a != null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "get() after close()/release()");
        return this.a;
    }

    public final Parcel b() {
        Parcel a = a();
        this.a = null;
        return a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Parcel parcel = this.a;
        if (parcel != null) {
            parcel.recycle();
            this.a = null;
        }
    }
}
