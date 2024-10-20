package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbv<T> extends cbp<T> {
    private final Object[] c;
    private final cbz d;

    public cbv(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.c = objArr2;
        int b = cca.b(i2);
        this.d = new cbz(objArr, arrn.s(i, b), b, i3);
    }

    @Override // defpackage.cbp, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        cbz cbzVar = this.d;
        if (cbzVar.hasNext()) {
            this.a++;
            return cbzVar.next();
        }
        Object[] objArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return objArr[i - cbzVar.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        int i = this.a;
        int i2 = i - 1;
        cbz cbzVar = this.d;
        int i3 = cbzVar.b;
        if (i > i3) {
            Object[] objArr = this.c;
            this.a = i2;
            return objArr[i2 - i3];
        }
        this.a = i2;
        return cbzVar.previous();
    }
}
