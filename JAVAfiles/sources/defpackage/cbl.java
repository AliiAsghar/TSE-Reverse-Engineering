package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface cbl<E> extends List<E>, Collection<E>, arse {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a<E> extends arnj<E> implements j$.util.List<E>, cbl {
        private final cbl a;
        private final int b;
        private final int c;
        private final int d;

        public a(cbl cblVar, int i, int i2) {
            this.a = cblVar;
            this.b = i;
            this.c = i2;
            defpackage.a.P(i, i2, cblVar.size());
            this.d = i2 - i;
        }

        @Override // defpackage.arne
        public final int a() {
            return this.d;
        }

        @Override // defpackage.arnj, java.util.List
        public final Object get(int i) {
            defpackage.a.N(i, this.d);
            return this.a.get(this.b + i);
        }

        @Override // defpackage.arnj, java.util.List
        public final /* synthetic */ List subList(int i, int i2) {
            defpackage.a.P(i, i2, this.d);
            cbl cblVar = this.a;
            int i3 = this.b;
            return new a(cblVar, i + i3, i3 + i2);
        }
    }
}
