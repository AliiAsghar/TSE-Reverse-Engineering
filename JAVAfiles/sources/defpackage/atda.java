package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.ASN1Encodable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atda implements Iterator {
    private int a = -1;
    private final /* synthetic */ int b;
    private final Object c;

    public atda(abto abtoVar, int i) {
        this.b = i;
        this.c = abtoVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [abto, java.lang.Object] */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b != 0) {
            if (this.a < this.c.c() - 1) {
                return true;
            }
            return false;
        }
        if (this.a < ((ASN1Encodable[]) this.c).length) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [abto, java.lang.Object] */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.b != 0) {
            if (hasNext()) {
                ?? r0 = this.c;
                int i = this.a + 1;
                this.a = i;
                return r0.d(i);
            }
            throw new NoSuchElementException("Cannot advance the iterator beyond " + this.a);
        }
        int i2 = this.a;
        ASN1Encodable[] aSN1EncodableArr = (ASN1Encodable[]) this.c;
        if (i2 != aSN1EncodableArr.length) {
            this.a = i2 + 1;
            return aSN1EncodableArr[i2];
        }
        throw new NoSuchElementException(a.bV(i2, "Out of elements: "));
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.b != 0) {
            throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
        }
        throw new UnsupportedOperationException("Cannot remove element from an Array.");
    }

    public atda(Object[] objArr, int i) {
        this.b = i;
        this.c = objArr;
    }
}
