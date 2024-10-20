package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arns extends arnj implements RandomAccess {
    final /* synthetic */ long[] a;

    public arns(long[] jArr) {
        this.a = jArr;
    }

    @Override // defpackage.arne
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.arne, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Long)) {
            return false;
        }
        if (aqil.j(this.a, ((Number) obj).longValue()) < 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.arnj, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Long.valueOf(this.a[i]);
    }

    @Override // defpackage.arnj, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        return aqil.j(this.a, ((Number) obj).longValue());
    }

    @Override // defpackage.arne, java.util.Collection
    public final boolean isEmpty() {
        if (this.a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.arnj, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Number) obj).longValue();
        long[] jArr = this.a;
        int length = jArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (longValue == jArr[length]) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }
}
