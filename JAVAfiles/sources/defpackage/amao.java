package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class amao extends alnc {
    private final alhr a;
    private final Set b;
    private final alhr c;

    public amao(Set set, alhr alhrVar, alhr alhrVar2) {
        this.b = set;
        this.a = alhrVar;
        this.c = alhrVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alna
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final Set gV() {
        if (((Boolean) this.a.get()).booleanValue()) {
            return this.b;
        }
        throw new IllegalStateException((String) this.c.get());
    }

    @Override // defpackage.alnc, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.b.hashCode();
    }
}
