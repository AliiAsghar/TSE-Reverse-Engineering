package j$.util.concurrent;

/* loaded from: classes5.dex */
final class z extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final Object initialValue() {
        return new ThreadLocalRandom(0);
    }
}
