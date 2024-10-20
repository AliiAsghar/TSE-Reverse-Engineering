package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akqi extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        akru akruVar = new akru(aiut.g());
        Thread currentThread = Thread.currentThread();
        synchronized (akqj.b) {
            akqj.b.put(currentThread, akruVar);
        }
        return akruVar;
    }
}
