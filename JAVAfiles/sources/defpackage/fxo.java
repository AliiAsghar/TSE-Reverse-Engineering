package defpackage;

import android.util.SparseLongArray;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxo implements fan {
    private final SparseLongArray a = new SparseLongArray();
    private long b;

    @Override // defpackage.fan
    public final long a() {
        return this.b;
    }

    @Override // defpackage.fan
    public final ero b() {
        return ero.a;
    }

    public final void d(int i, long j) {
        long j2 = this.a.get(i, -9223372036854775807L);
        if (j2 == -9223372036854775807L || j > j2) {
            this.a.put(i, j);
            if (j2 != -9223372036854775807L && j2 != this.b) {
                return;
            }
            SparseLongArray sparseLongArray = this.a;
            int i2 = eul.a;
            if (sparseLongArray.size() != 0) {
                long j3 = Long.MAX_VALUE;
                for (int i3 = 0; i3 < sparseLongArray.size(); i3++) {
                    j3 = Math.min(j3, sparseLongArray.valueAt(i3));
                }
                this.b = j3;
                return;
            }
            throw new NoSuchElementException();
        }
    }

    @Override // defpackage.fan
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // defpackage.fan
    public final void c(ero eroVar) {
    }
}
