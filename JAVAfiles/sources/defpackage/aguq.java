package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aguq implements aguz {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantDataProvider");
    public static final agve b;
    public static final alog c;
    public static final alog d;
    public static final alor e;
    private static volatile aguq l;
    public final AtomicReference f = new AtomicReference(altc.a);
    public final AtomicReference g = new AtomicReference(altc.a);
    public final AtomicReference h = new AtomicReference(altc.a);
    public final AtomicReference i = new AtomicReference(almq.a);
    public final AtomicReference j = new AtomicReference(almq.a);
    public ListenableFuture k;
    private final Executor m;

    static {
        aozy createBuilder = agve.a.createBuilder();
        aozy createBuilder2 = agvd.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        agvd agvdVar = (agvd) createBuilder2.b;
        agvdVar.c = 0;
        agvdVar.b = 1;
        createBuilder.ar((agvd) createBuilder2.s());
        aozy createBuilder3 = agvd.a.createBuilder();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        agvd agvdVar2 = (agvd) createBuilder3.b;
        agvdVar2.c = 0;
        agvdVar2.b = 2;
        createBuilder.ar((agvd) createBuilder3.s());
        b = (agve) createBuilder.s();
        Integer valueOf = Integer.valueOf(R.raw.emoji_category_emotions);
        c = alog.s(valueOf, Integer.valueOf(R.raw.emoji_category_people_gender_inclusive));
        d = alog.s(valueOf, Integer.valueOf(R.raw.emoji_category_people));
        aozy createBuilder4 = agve.a.createBuilder();
        aozy createBuilder5 = agvd.a.createBuilder();
        if (!createBuilder5.b.isMutable()) {
            createBuilder5.u();
        }
        agvd agvdVar3 = (agvd) createBuilder5.b;
        agvdVar3.c = 1;
        agvdVar3.b = 2;
        createBuilder4.ar((agvd) createBuilder5.s());
        agve agveVar = (agve) createBuilder4.s();
        aozy createBuilder6 = agve.a.createBuilder();
        aozy createBuilder7 = agvd.a.createBuilder();
        if (!createBuilder7.b.isMutable()) {
            createBuilder7.u();
        }
        agvd agvdVar4 = (agvd) createBuilder7.b;
        agvdVar4.c = 3;
        agvdVar4.b = 2;
        createBuilder6.ar((agvd) createBuilder7.s());
        agve agveVar2 = (agve) createBuilder6.s();
        aozy createBuilder8 = agve.a.createBuilder();
        aozy createBuilder9 = agvd.a.createBuilder();
        if (!createBuilder9.b.isMutable()) {
            createBuilder9.u();
        }
        agvd agvdVar5 = (agvd) createBuilder9.b;
        agvdVar5.c = 2;
        agvdVar5.b = 2;
        createBuilder8.ar((agvd) createBuilder9.s());
        e = alor.l("👯", alog.t(agveVar, agveVar2, (agve) createBuilder8.s()));
    }

    private aguq(Executor executor) {
        this.m = executor;
    }

    public static aguq e(Context context) {
        aguq aguqVar = l;
        if (aguqVar == null) {
            synchronized (aguq.class) {
                aguqVar = l;
                if (aguqVar == null) {
                    final aguq aguqVar2 = new aguq(agtj.a().e);
                    ListenableFuture f = ancj.f(albo.bM(new aaze(context, 14), aguqVar2.m), new algk() { // from class: agup
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:29:0x02b4  */
                        /* JADX WARN: Removed duplicated region for block: B:32:0x02c6 A[SYNTHETIC] */
                        @Override // defpackage.algk
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object apply(java.lang.Object r23) {
                            /*
                                Method dump skipped, instructions count: 939
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.agup.apply(java.lang.Object):java.lang.Object");
                        }
                    }, aguqVar2.m);
                    aguqVar2.k = f;
                    albo.bR(f, new pum(15), aguqVar2.m);
                    l = aguqVar2;
                    aguqVar = aguqVar2;
                }
            }
        }
        return aguqVar;
    }

    public final aguy a(String str) {
        return (aguy) ((alor) this.f.get()).get(d(str));
    }

    public final agve b(String str) {
        return (agve) ((alor) this.h.get()).get(str);
    }

    @Override // defpackage.aguz
    public final alog c(String str) {
        if (!agkx.j(this.k)) {
            int i = alog.d;
            return alsx.a;
        }
        alog a2 = ((aloi) this.i.get()).a(d(str));
        if (a2 != null) {
            return a2;
        }
        int i2 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.aguz
    public final String d(String str) {
        String str2;
        if (agkx.j(this.k) && (str2 = (String) alzz.aQ(((aloi) this.j.get()).a(str), null)) != null) {
            return str2;
        }
        return str;
    }
}
