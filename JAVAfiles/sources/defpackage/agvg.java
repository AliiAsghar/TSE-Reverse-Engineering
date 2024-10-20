package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agvg implements agvb {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/emoji/data/StickyVariantsPreferences");
    public static volatile agvg b;
    public final aguq c;
    public final Map d = new ConcurrentHashMap();
    public final Executor e = agtj.a().f;
    public final agvc f;
    public ListenableFuture g;
    public ListenableFuture h;

    public agvg(Context context) {
        this.c = aguq.e(context);
        this.f = new aguk(context);
    }

    public final agut a() {
        aozy createBuilder = agut.a.createBuilder();
        createBuilder.ap(this.d);
        return (agut) createBuilder.s();
    }

    @Override // defpackage.agvb
    public final ListenableFuture b() {
        return this.g;
    }

    @Override // defpackage.agvb
    public final String c(String str) {
        throw null;
    }

    @Override // defpackage.agvb
    public final boolean d(String str) {
        aguq aguqVar = this.c;
        Map map = this.d;
        String d = aguqVar.d(str);
        if (!str.equals((String) map.get(d))) {
            this.d.put(d, str);
            ((aguk) this.f).b(a());
            return true;
        }
        return false;
    }

    @Override // defpackage.agvb
    public final int e() {
        return 1;
    }
}
