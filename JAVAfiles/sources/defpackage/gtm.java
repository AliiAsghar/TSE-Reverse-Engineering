package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gtm {
    public abstract gtd a(String str);

    public abstract gtd b(String str);

    public abstract gtd c(UUID uuid);

    public abstract gtd d(List list);

    public abstract gtd e(String str, gso gsoVar, List list);

    public abstract gtd f();

    public abstract gti g(String str, gso gsoVar, List list);

    public abstract ListenableFuture h(ico icoVar);

    public final gtd i(kkc kkcVar) {
        return d(aqjn.y(kkcVar));
    }

    public abstract gtd j(String str, int i, kkc kkcVar);

    public final gti k(String str, gso gsoVar, kkc kkcVar) {
        gsoVar.getClass();
        return g(str, gsoVar, aqjn.y(kkcVar));
    }

    public final void l(String str, gso gsoVar, kkc kkcVar) {
        str.getClass();
        gsoVar.getClass();
        e(str, gsoVar, aqjn.y(kkcVar));
    }
}
