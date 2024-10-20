package defpackage;

import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkr {
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;

    public hkr(int i, List list, int i2, InputStream inputStream) {
        this.a = i;
        this.c = list;
        this.b = i2;
        this.d = inputStream;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final List a() {
        return DesugarCollections.unmodifiableList(this.c);
    }

    public hkr(gbb gbbVar, Object obj, int i, int i2) {
        gbbVar.getClass();
        this.d = gbbVar;
        this.c = obj;
        this.b = i;
        this.a = i2;
        if (gbbVar != gbb.REFRESH && obj == null) {
            throw new IllegalArgumentException("Key must be non-null for prepend/append");
        }
    }
}
