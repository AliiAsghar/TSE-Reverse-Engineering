package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class artn implements artx {
    private final AtomicReference a;

    public artn(artx artxVar) {
        this.a = new AtomicReference(artxVar);
    }

    @Override // defpackage.artx
    public final Iterator a() {
        artx artxVar = (artx) this.a.getAndSet(null);
        if (artxVar != null) {
            return artxVar.a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
