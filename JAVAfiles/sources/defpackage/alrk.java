package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alrk extends alnc {
    final /* synthetic */ Set a;

    public alrk(Set set) {
        this.a = set;
    }

    @Override // defpackage.almx, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.almx, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.alnc, defpackage.almx
    protected final /* synthetic */ Collection b() {
        return this.a;
    }

    @Override // defpackage.alnc
    protected final Set c() {
        return this.a;
    }

    @Override // defpackage.alna
    protected final /* synthetic */ Object gV() {
        return this.a;
    }
}
