package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agfy {
    public final int a;
    public int b;
    public int c;
    private final Object d;

    public agfy(byte[] bArr) {
        this.d = bArr;
        this.a = bArr.length;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arml] */
    private final agfx f() {
        return (agfx) this.d.a();
    }

    public final void a(RecyclerView recyclerView) {
        if (this.a != 0) {
            this.b = recyclerView.getPaddingStart();
            int paddingTop = recyclerView.getPaddingTop();
            this.c = paddingTop;
            int i = this.b;
            if (i == 0) {
                i = this.a;
            }
            if (paddingTop == 0) {
                paddingTop = this.a;
            }
            recyclerView.setPaddingRelative(i, paddingTop, recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
            recyclerView.aJ(f());
        }
    }

    public final void b(RecyclerView recyclerView) {
        if (this.a != 0) {
            recyclerView.setPaddingRelative(this.b, this.c, recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
            recyclerView.aK(f());
        }
    }

    public final int c(int i) {
        int i2 = this.c;
        int i3 = 8 - this.b;
        int i4 = i2 + 1;
        Object obj = this.d;
        int min = Math.min(i, i3);
        int i5 = ((((byte[]) obj)[i2] & 255) >> this.b) & (255 >> (8 - min));
        while (min < i) {
            i5 |= (((byte[]) this.d)[i4] & 255) << min;
            min += 8;
            i4++;
        }
        int i6 = i5 & ((-1) >>> (32 - i));
        d(i);
        return i6;
    }

    public final void d(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.c + i3;
        this.c = i4;
        int i5 = this.b + (i - (i3 * 8));
        this.b = i5;
        if (i5 > 7) {
            i4++;
            this.c = i4;
            i5 -= 8;
            this.b = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.a) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        dzg.d(z);
    }

    public final boolean e() {
        int i = (((byte[]) this.d)[this.c] & 255) >> this.b;
        d(1);
        if (1 == (i & 1)) {
            return true;
        }
        return false;
    }

    public agfy(int i) {
        this.a = i;
        this.d = armd.a(new agef(this, 5));
    }
}
