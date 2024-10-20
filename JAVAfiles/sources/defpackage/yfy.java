package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yfy implements yga {
    private final List a;

    public yfy(List list) {
        this.a = list;
    }

    public static final yga b(List list) {
        list.getClass();
        if (((alsx) list).c == 1) {
            return (yga) list.get(0);
        }
        return new yfy(list);
    }

    @Override // defpackage.yga
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((yga) it.next()).a();
        }
    }

    @Override // defpackage.yga, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        yyb.aJ(this);
    }
}
