package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gaq extends arnj {
    public final int a;
    public final List b;
    private final int c;

    public gaq(int i, int i2, List list) {
        this.a = i;
        this.c = i2;
        this.b = list;
    }

    @Override // defpackage.arne
    public final int a() {
        return this.a + this.b.size() + this.c;
    }

    @Override // defpackage.arnj, java.util.List
    public final Object get(int i) {
        if (i >= 0 && i < this.a) {
            return null;
        }
        int i2 = this.a;
        if (i < this.b.size() + i2 && i2 <= i) {
            return this.b.get(i - this.a);
        }
        int size = this.a + this.b.size();
        if (i < a() && size <= i) {
            return null;
        }
        throw new IndexOutOfBoundsException("Illegal attempt to access index " + i + " in ItemSnapshotList of size " + a());
    }
}
