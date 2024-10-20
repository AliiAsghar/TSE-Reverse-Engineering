package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcr {
    public Parcel a = Parcel.obtain();

    public final void a(byte b) {
        this.a.writeByte(b);
    }

    public final void b(float f) {
        this.a.writeFloat(f);
    }

    public final void c(int i) {
        this.a.writeInt(i);
    }

    public final void d(long j) {
        long c = drm.c(j);
        byte b = 0;
        if (!a.bB(c, 0L)) {
            if (a.bB(c, 4294967296L)) {
                b = 1;
            } else if (a.bB(c, 8589934592L)) {
                b = 2;
            }
        }
        a(b);
        if (!a.bB(drm.c(j), 0L)) {
            b(drm.a(j));
        }
    }

    public final void e(long j) {
        this.a.writeLong(j);
    }
}
