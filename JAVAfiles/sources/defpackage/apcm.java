package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class apcm implements Iterator {
    final /* synthetic */ apco a;
    private int b = -1;
    private boolean c;
    private Iterator d;

    public apcm(apco apcoVar) {
        this.a = apcoVar;
    }

    private final Iterator a() {
        if (this.d == null) {
            this.d = this.a.c.entrySet().iterator();
        }
        return this.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b + 1;
        apco apcoVar = this.a;
        if (i < apcoVar.b) {
            return true;
        }
        if (!apcoVar.c.isEmpty() && a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.c = true;
        int i = this.b + 1;
        this.b = i;
        apco apcoVar = this.a;
        if (i < apcoVar.b) {
            return (apcl) apcoVar.a[i];
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.c) {
            this.c = false;
            this.a.e();
            int i = this.b;
            apco apcoVar = this.a;
            if (i < apcoVar.b) {
                this.b = i - 1;
                apcoVar.c(i);
                return;
            } else {
                a().remove();
                return;
            }
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
