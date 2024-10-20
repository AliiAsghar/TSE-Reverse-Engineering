package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agux implements agvb {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/emoji/data/GlobalVariantsPreferences");
    public static volatile agux b;
    public final agvc e;
    public final aguq f;
    public ListenableFuture h;
    public ListenableFuture i;
    public final AtomicReference c = new AtomicReference(agve.a);
    public final Map d = new ConcurrentHashMap();
    public final Executor g = agtj.a().f;

    public agux(Context context) {
        this.f = aguq.e(context);
        this.e = new aguj(context);
    }

    public static agvd f(agve agveVar) {
        return (agvd) Collection.EL.stream(agveVar.b).filter(new adru(8)).findFirst().get();
    }

    public static agvd i(agve agveVar) {
        return (agvd) Collection.EL.stream(agveVar.b).filter(new adru(9)).findFirst().get();
    }

    public static agve j(agvd agvdVar, agvd agvdVar2, agvd agvdVar3) {
        aozy createBuilder = agve.a.createBuilder();
        if (agvdVar != null) {
            createBuilder.ar(agvdVar);
        }
        if (agvdVar2 != null) {
            createBuilder.ar(agvdVar2);
        }
        if (agvdVar3 != null) {
            createBuilder.ar(agvdVar3);
        }
        return (agve) createBuilder.s();
    }

    public final agvd a(String str) {
        if (this.f.a(str) == aguy.SKINTONE_AND_GENDER_DIRECTIONAL) {
            int R = a.R(((this.f.c(this.f.d(str)).indexOf(str) / 6) % 2) + 1);
            if (R != 0) {
                aozy createBuilder = agvd.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                agvd agvdVar = (agvd) createBuilder.b;
                agvdVar.c = Integer.valueOf(R - 1);
                agvdVar.b = 3;
                return (agvd) createBuilder.s();
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.agvb
    public final ListenableFuture b() {
        return this.i;
    }

    @Override // defpackage.agvb
    public final String c(String str) {
        aguq aguqVar = this.f;
        aguy a2 = aguqVar.a(str);
        String d = aguqVar.d(str);
        if (a2 != null && !((agve) this.c.get()).equals(aguq.b)) {
            agvd h = h();
            agvd g = g();
            int ordinal = a2.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                return (String) this.d.get(this.f.d(str));
                            }
                            return null;
                        }
                        if (g != null && h != null) {
                            return k(d, j(h, g, a(str)));
                        }
                        return null;
                    }
                    if (g != null && h != null) {
                        aozy createBuilder = agve.a.createBuilder();
                        createBuilder.ar(h);
                        createBuilder.ar(g);
                        return k(d, (agve) createBuilder.s());
                    }
                    return null;
                }
                if (g != null) {
                    aozy createBuilder2 = agve.a.createBuilder();
                    createBuilder2.ar(g);
                    return k(d, (agve) createBuilder2.s());
                }
                return null;
            }
            if (h != null) {
                aozy createBuilder3 = agve.a.createBuilder();
                createBuilder3.ar(h);
                return k(d, (agve) createBuilder3.s());
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.agvb
    public final boolean d(String str) {
        aguy a2;
        agve b2;
        if (!str.equals(c(str)) && (a2 = this.f.a(str)) != null && (b2 = this.f.b(str)) != null) {
            int ordinal = a2.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                this.d.put(this.f.d(str), str);
                            }
                        } else if (b2.b.size() == 3 && alzz.aT(b2.b, new evp(10)) && alzz.aT(b2.b, new evp(11))) {
                            this.c.set(j(i(b2), f(b2), null));
                        }
                    } else if (b2.b.size() == 2 && alzz.aT(b2.b, new evp(10)) && alzz.aT(b2.b, new evp(11))) {
                        this.c.set(b2);
                    }
                } else if (b2.b.size() == 1 && alzz.aT(b2.b, new evp(10))) {
                    this.c.set(j(h(), f(b2), null));
                }
            } else if (b2.b.size() == 1 && alzz.aT(b2.b, new evp(11))) {
                this.c.set(j(i(b2), g(), null));
            }
            agvc agvcVar = this.e;
            aozy createBuilder = aguw.a.createBuilder();
            agve agveVar = (agve) this.c.get();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aguw aguwVar = (aguw) createBuilder.b;
            agveVar.getClass();
            aguwVar.c = agveVar;
            aguwVar.b |= 1;
            createBuilder.aq(this.d);
            ((aguj) agvcVar).a((aguw) createBuilder.s());
            return true;
        }
        return false;
    }

    @Override // defpackage.agvb
    public final int e() {
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final agvd g() {
        alog n = alog.n(((agve) this.c.get()).b);
        int aH = alzz.aH(n, new evp(10));
        if (aH < 0) {
            return null;
        }
        return (agvd) n.get(aH);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final agvd h() {
        alog n = alog.n(((agve) this.c.get()).b);
        int aH = alzz.aH(n, new evp(11));
        if (aH < 0) {
            return null;
        }
        return (agvd) n.get(aH);
    }

    public final String k(String str, agve agveVar) {
        aguq aguqVar = this.f;
        aguo aguoVar = (aguo) ((alor) aguqVar.g.get()).get(aguqVar.d(str));
        if (aguoVar == null) {
            return str;
        }
        return (String) aguoVar.a.getOrDefault(agveVar, str);
    }
}
