package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
final class alqr implements Iterator {
    public static final alqr a;
    private static final /* synthetic */ alqr[] b;

    static {
        alqr alqrVar = new alqr();
        a = alqrVar;
        b = new alqr[]{alqrVar};
    }

    private alqr() {
    }

    public static alqr[] values() {
        return (alqr[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        albo.w(false);
    }
}
