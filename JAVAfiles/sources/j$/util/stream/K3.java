package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes5.dex */
final class K3 extends AbstractC0153i3 {
    @Override // j$.util.stream.AbstractC0153i3
    final void d() {
        Y2 y2 = new Y2();
        this.h = y2;
        this.e = this.b.S(new C0109a(9, y2));
        this.f = new C0109a(10, this);
    }

    @Override // j$.util.stream.AbstractC0153i3
    final AbstractC0153i3 e(Spliterator spliterator) {
        return new AbstractC0153i3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h == null && !this.i) {
            consumer.getClass();
            c();
            C0109a c0109a = new C0109a(11, consumer);
            this.b.R(this.d, c0109a);
            this.i = true;
            return;
        }
        do {
        } while (tryAdvance(consumer));
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        consumer.getClass();
        boolean a = a();
        if (a) {
            Y2 y2 = (Y2) this.h;
            long j = this.g;
            if (y2.c == 0) {
                if (j < y2.b) {
                    obj = y2.e[(int) j];
                } else {
                    throw new IndexOutOfBoundsException(Long.toString(j));
                }
            } else {
                if (j < y2.count()) {
                    for (int i = 0; i <= y2.c; i++) {
                        long j2 = y2.d[i];
                        Object[] objArr = y2.f[i];
                        if (j < objArr.length + j2) {
                            obj = objArr[(int) (j - j2)];
                        }
                    }
                    throw new IndexOutOfBoundsException(Long.toString(j));
                }
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            consumer.accept(obj);
        }
        return a;
    }
}
