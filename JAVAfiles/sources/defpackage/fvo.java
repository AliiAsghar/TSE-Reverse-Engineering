package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvo {
    public int b;
    public long g;
    public long i;
    public final SparseArray a = new SparseArray();
    public esp c = esp.a;
    public int d = -1;
    public mkk[] j = new mkk[0];
    public long e = -9223372036854775807L;
    public long f = -1;
    public long h = Long.MAX_VALUE;

    public final void a() {
        dzg.e(!this.c.equals(esp.a), "Audio mixer is not configured.");
    }

    public final void b() {
        this.f = Math.min(this.h, this.g + this.d);
    }

    public final boolean c() {
        a();
        long j = this.g;
        if (j >= this.h) {
            return true;
        }
        if (j >= this.i && this.a.size() == 0) {
            return true;
        }
        return false;
    }

    public final atog d(int i) {
        dzg.e(eul.S(this.a, i), "Source not found.");
        return (atog) this.a.get(i);
    }

    public final mkk e(long j) {
        ByteBuffer order = ByteBuffer.allocateDirect(this.d * this.c.e).order(ByteOrder.nativeOrder());
        order.mark();
        return new mkk(order, j, j + this.d);
    }
}
