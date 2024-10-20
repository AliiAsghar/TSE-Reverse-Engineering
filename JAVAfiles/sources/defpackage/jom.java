package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jom implements jof {
    private final Set a = new LinkedHashSet();

    @Override // defpackage.jof
    public final void a(jgz jgzVar) {
        jgzVar.getClass();
        this.a.remove(jgzVar);
    }

    @Override // defpackage.jof
    public final Object b(jgz jgzVar) {
        this.a.add(jgzVar);
        return arnb.a;
    }
}
