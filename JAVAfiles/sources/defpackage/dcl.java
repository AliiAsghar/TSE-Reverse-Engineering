package defpackage;

import defpackage.cee;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcl implements cee {
    public final arqg a;
    private final /* synthetic */ cee b;

    public dcl(cee ceeVar, arqg arqgVar) {
        this.a = arqgVar;
        this.b = ceeVar;
    }

    @Override // defpackage.cee
    public final cee.a b(String str, arqg arqgVar) {
        return this.b.b(str, arqgVar);
    }

    @Override // defpackage.cee
    public final Object c(String str) {
        return this.b.c(str);
    }

    @Override // defpackage.cee
    public final Map d() {
        throw null;
    }

    @Override // defpackage.cee
    public final boolean g(Object obj) {
        return this.b.g(obj);
    }
}
