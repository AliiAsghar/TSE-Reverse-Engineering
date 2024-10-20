package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akka {
    public final Context a;
    public final andr b;
    public ajwt c;
    public final ahlp d;
    public final ahiy e;
    private final apwt f;
    private final Map g;
    private final adef h;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface a {
        asqe ko();

        asqe kp();
    }

    public akka(Context context, apwt apwtVar, adef adefVar, ahiy ahiyVar, ahlp ahlpVar, Map map) {
        context.getClass();
        apwtVar.getClass();
        ahiyVar.getClass();
        this.a = context;
        this.f = apwtVar;
        this.h = adefVar;
        this.e = ahiyVar;
        this.d = ahlpVar;
        this.g = map;
        this.b = new andr();
    }

    public final ListenableFuture a(ahtt ahttVar, aozb aozbVar, String str, String str2) {
        if (aozbVar != null) {
            adef adefVar = this.h;
            Set set = (Set) this.g.get(ahsy.b(str2));
            if (set == null) {
                set = arnx.a;
            }
            adefVar.k(aozbVar, set, str, str2, true, true);
        }
        return ((adef) this.f.b()).f(str2, ahttVar);
    }
}
