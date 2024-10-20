package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aror extends aroq implements Iterator, arse {
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aror(aros arosVar, int i, byte[] bArr) {
        super(arosVar);
        this.d = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.d != 0) {
            a();
            int i = this.b;
            aros arosVar = this.a;
            if (i < arosVar.e) {
                this.b = i + 1;
                this.c = i;
                Object obj = arosVar.b[i];
                b();
                return obj;
            }
            throw new NoSuchElementException();
        }
        a();
        int i2 = this.b;
        aros arosVar2 = this.a;
        if (i2 < arosVar2.e) {
            this.b = i2 + 1;
            this.c = i2;
            Object[] objArr = arosVar2.c;
            objArr.getClass();
            Object obj2 = objArr[i2];
            b();
            return obj2;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aror(aros arosVar, int i) {
        super(arosVar);
        this.d = i;
    }
}
