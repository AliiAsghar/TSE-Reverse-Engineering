package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alhl implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ anna b;

    public alhl(anna annaVar, CharSequence charSequence) {
        this.a = charSequence;
        this.b = annaVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return this.b.b(this.a);
    }

    public final String toString() {
        algs algsVar = new algs(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        algsVar.h(sb, this);
        sb.append(']');
        return sb.toString();
    }
}
