package defpackage;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euc {
    public int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public euc(an anVar) {
        this.e = new ArrayList();
        this.b = anVar.w;
        this.d = anVar.x;
        this.c = anVar.h();
        this.a = anVar.d();
        ArrayList arrayList = anVar.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            am amVar = (am) arrayList.get(i);
            ((ArrayList) this.e).add(new aq(amVar));
        }
    }

    public final long a() {
        if (this.c != 0) {
            return ((long[]) this.e)[this.a];
        }
        throw new NoSuchElementException();
    }

    public final long b() {
        int i = this.c;
        if (i != 0) {
            Object obj = this.e;
            int i2 = this.a;
            long j = ((long[]) obj)[i2];
            this.a = this.d & (i2 + 1);
            this.c = i - 1;
            return j;
        }
        throw new NoSuchElementException();
    }

    public final void c(long j) {
        int i = this.c;
        Object obj = this.e;
        int length = ((long[]) obj).length;
        if (i == length) {
            int i2 = length + length;
            if (i2 >= 0) {
                long[] jArr = new long[i2];
                int i3 = this.a;
                int i4 = length - i3;
                System.arraycopy(obj, i3, jArr, 0, i4);
                System.arraycopy(this.e, 0, jArr, i4, i3);
                this.a = 0;
                this.b = this.c - 1;
                this.e = jArr;
                this.d = jArr.length - 1;
                obj = jArr;
            } else {
                throw new IllegalStateException();
            }
        }
        int i5 = (this.b + 1) & this.d;
        this.b = i5;
        ((long[]) obj)[i5] = j;
        this.c++;
    }

    public final void d() {
        this.a = 0;
        this.b = -1;
        this.c = 0;
    }

    public euc() {
        this(16);
    }

    public euc(int i) {
        d.s(true);
        i = i == 0 ? 1 : i;
        if (Integer.bitCount(i) != 1) {
            int highestOneBit = Integer.highestOneBit(i - 1);
            i = highestOneBit + highestOneBit;
        }
        this.a = 0;
        this.b = -1;
        this.c = 0;
        this.e = new long[i];
        this.d = r3.length - 1;
    }
}
