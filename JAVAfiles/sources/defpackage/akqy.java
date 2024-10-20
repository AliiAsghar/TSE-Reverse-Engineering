package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akqy extends PhantomReference {
    public final akqx a;

    public akqy(Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.a = new akqx(this);
    }
}
