package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ara<T> {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a<T> {
        public final int a;
        public final int b;
        public final Object c;

        public a(int i, int i2, Object obj) {
            this.a = i;
            this.b = i2;
            this.c = obj;
            if (i < 0) {
                aju.c("startIndex should be >= 0");
            }
            if (i2 > 0) {
                return;
            }
            aju.c("size should be > 0");
        }
    }

    a a(int i);
}
