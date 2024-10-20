package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccj<K, V> implements Iterator<Map.Entry<K, V>>, arse {
    public final cch a;

    public ccj(ccg ccgVar) {
        ccv[] ccvVarArr = new ccv[8];
        for (int i = 0; i < 8; i++) {
            ccvVarArr[i] = new ccz(this);
        }
        this.a = new cch(ccgVar, ccvVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (Map.Entry) this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
