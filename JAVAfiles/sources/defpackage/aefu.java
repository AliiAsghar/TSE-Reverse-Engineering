package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aefu {
    public final abjp a;
    public final Context b;
    public final aefo c;
    public alog d;
    public final alog e;
    public final alor f;
    public final aefs g;
    public final boolean h;
    public final boolean i;

    public aefu(aeft aeftVar) {
        this.a = aeftVar.a;
        Context context = aeftVar.b;
        context.getClass();
        this.b = context;
        aefo aefoVar = aeftVar.c;
        aefoVar.getClass();
        this.c = aefoVar;
        this.d = aeftVar.d;
        this.e = aeftVar.e;
        this.f = alor.j(aeftVar.f);
        this.g = aeftVar.g;
        this.h = aeftVar.h;
        this.i = aeftVar.i;
    }

    public final aefq a(abjr abjrVar) {
        aefq aefqVar = (aefq) this.f.get(abjrVar);
        if (aefqVar == null) {
            return new aefq(abjrVar, 2);
        }
        return aefqVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final alog b() {
        alog alogVar = this.d;
        if (alogVar == null) {
            aday adayVar = new aday(this.b);
            try {
                alogVar = alog.n((List) ancj.f(((aiwu) adayVar.a).a(), new abes(10), adayVar.b).get());
                this.d = alogVar;
                if (alogVar == null) {
                    return alsx.a;
                }
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalArgumentException("Retrieval of recent fix data failed", e);
            }
        }
        return alogVar;
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("entry_point", this.a);
        aj.b("context", this.b);
        aj.b("appDoctorLogger", this.c);
        aj.b("recentFixes", this.d);
        aj.b("fixesExecutedThisIteration", this.e);
        aj.b("fixStatusesExecutedThisIteration", this.f);
        aj.b("currentFixer", this.g);
        aj.h("processRestartNeeded", this.h);
        aj.h("appRestartNeeded", this.i);
        return aj.toString();
    }
}
