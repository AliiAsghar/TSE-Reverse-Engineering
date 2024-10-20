package defpackage;

import android.os.Parcel;
import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dci {
    public final Parcel a;

    public dci(String str) {
        Parcel obtain = Parcel.obtain();
        this.a = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    public final byte a() {
        return this.a.readByte();
    }

    public final float b() {
        return this.a.readFloat();
    }

    public final int c() {
        return this.a.dataAvail();
    }

    public final int d() {
        return this.a.readInt();
    }

    public final long e() {
        long j;
        byte a = a();
        if (a == 1) {
            j = 4294967296L;
        } else if (a == 2) {
            j = 8589934592L;
        } else {
            j = 0;
        }
        if (a.bB(j, 0L)) {
            return drm.a;
        }
        return drn.d(j, b());
    }

    public final long f() {
        return this.a.readLong();
    }
}
