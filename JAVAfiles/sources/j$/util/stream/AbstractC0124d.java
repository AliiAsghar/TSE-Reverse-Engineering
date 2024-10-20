package j$.util.stream;

/* renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC0124d {
    protected final int a;
    protected int b;
    protected int c;
    protected long[] d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0124d() {
        this.a = 4;
    }

    public abstract void clear();

    public final long count() {
        int i = this.c;
        if (i == 0) {
            return this.b;
        }
        return this.d[i] + this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0124d(int i) {
        if (i >= 0) {
            this.a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
    }
}
