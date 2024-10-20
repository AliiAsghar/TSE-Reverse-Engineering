package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acyx extends aczc {
    public final ConcurrentMap a;
    public final boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acyx() {
        super("cslib_phenotype__");
        acyw acywVar = acyy.a;
        this.a = new ConcurrentHashMap();
        acyw acywVar2 = acyw.OFF;
        this.b = acywVar.c;
    }

    @Override // defpackage.aczc
    protected final alog b() {
        return alog.n(this.a.values());
    }
}
