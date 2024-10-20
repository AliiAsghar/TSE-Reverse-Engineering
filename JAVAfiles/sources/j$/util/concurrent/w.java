package j$.util.concurrent;

import com.android.vcard.VCardConfig;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes5.dex */
final class w implements Spliterator {
    ConcurrentLinkedQueue.Node a;
    int b;
    boolean c;
    final /* synthetic */ ConcurrentLinkedQueue d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.d = concurrentLinkedQueue;
    }

    private ConcurrentLinkedQueue.Node a() {
        ConcurrentLinkedQueue.Node node = this.a;
        if (node == null && !this.c) {
            node = this.d.b();
            this.a = node;
            if (node == null) {
                this.c = true;
            }
        }
        return node;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4368;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return Long.MAX_VALUE;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        ConcurrentLinkedQueue.Node a = a();
        if (a != null) {
            this.a = null;
            this.c = true;
            this.d.c(consumer, a);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        E e;
        consumer.getClass();
        ConcurrentLinkedQueue.Node a = a();
        if (a == null) {
            return false;
        }
        do {
            e = a.item;
            ConcurrentLinkedQueue.Node node = a.next;
            if (a == node) {
                a = this.d.b();
            } else {
                a = node;
            }
            if (e != 0) {
                break;
            }
        } while (a != null);
        this.a = a;
        if (a == null) {
            this.c = true;
        }
        if (e != 0) {
            consumer.accept(e);
            return true;
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        ConcurrentLinkedQueue.Node node;
        ConcurrentLinkedQueue.Node a = a();
        if (a == null || (node = a.next) == null) {
            return null;
        }
        int min = Math.min(this.b + 1, VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING);
        this.b = min;
        Object[] objArr = null;
        int i = 0;
        do {
            Object obj = a.item;
            if (obj != null) {
                if (objArr == null) {
                    objArr = new Object[min];
                }
                objArr[i] = obj;
                i++;
            }
            if (a == node) {
                a = this.d.b();
            } else {
                a = node;
            }
            if (a == null || (node = a.next) == null) {
                break;
            }
        } while (i < min);
        this.a = a;
        if (a == null) {
            this.c = true;
        }
        if (i == 0) {
            return null;
        }
        return Spliterators.l(objArr, 0, i, 4368);
    }
}
