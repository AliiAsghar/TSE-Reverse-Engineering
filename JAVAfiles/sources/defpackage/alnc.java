package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alnc extends almx implements Set {
    @Override // defpackage.almx
    protected /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    protected abstract Set c();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj != this && !c().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return c().hashCode();
    }
}
