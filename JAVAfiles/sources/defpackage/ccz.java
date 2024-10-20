package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccz<K, V> extends ccv<K, V, Map.Entry<K, V>> {
    private final ccj c;

    public ccz(ccj ccjVar) {
        this.c = ccjVar;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 2;
        Object[] objArr = this.a;
        return new ccd(this.c, objArr[i], objArr[i + 1]);
    }
}
