package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alms extends alnb implements Serializable {
    private static final long serialVersionUID = 0;
    final int a;
    private final Queue b;

    public alms(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        albo.L(z, "maxSize (%s) must >= 0", i);
        this.b = new ArrayDeque(i);
        this.a = i;
    }

    @Override // defpackage.almx, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (this.a == 0) {
            return true;
        }
        if (size() == this.a) {
            this.b.remove();
        }
        this.b.add(obj);
        return true;
    }

    @Override // defpackage.almx, java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean z;
        int size = collection.size();
        if (size >= this.a) {
            clear();
            int i = this.a;
            collection.getClass();
            int i2 = size - i;
            if (i2 >= 0) {
                z = true;
            } else {
                z = false;
            }
            d.t(z, "number to skip cannot be negative");
            return alzz.aS(this, new alql(collection, i2));
        }
        return alzz.aE(this, collection.iterator());
    }

    @Override // defpackage.alnb, defpackage.almx
    /* renamed from: b */
    protected final /* synthetic */ Collection gV() {
        return this.b;
    }

    @Override // defpackage.alnb
    protected final Queue c() {
        return this.b;
    }

    @Override // defpackage.alna
    protected final /* synthetic */ Object gV() {
        return this.b;
    }

    @Override // defpackage.alnb, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}
