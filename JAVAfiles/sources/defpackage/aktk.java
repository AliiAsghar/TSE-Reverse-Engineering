package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aktk implements ancr {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public aktk(andq andqVar, ancr ancrVar, int i) {
        this.c = i;
        this.b = andqVar;
        this.a = ancrVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, akry] */
    /* JADX WARN: Type inference failed for: r0v25, types: [ancr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ancr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ancu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [ancr, java.lang.Object] */
    @Override // defpackage.ancr
    public final ListenableFuture a() {
        akru b;
        akry h;
        andc andcVar;
        int i = this.c;
        if (i != 0) {
            final boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (!((andq) this.b).compareAndSet(andp.NOT_RUN, andp.STARTED)) {
                            return albo.bG();
                        }
                        return this.a.a();
                    }
                    Object obj = ((atii) this.b).a;
                    obj.getClass();
                    ancw ancwVar = new ancw();
                    Object obj2 = ((atii) this.b).c;
                    Object obj3 = this.a;
                    try {
                        ahmn ahmnVar = ancwVar.a;
                        akry akryVar = ((akth) obj3).a;
                        ancz anczVar = ((akth) obj3).b;
                        long j = akto.a;
                        ahmnVar.getClass();
                        b = akqj.b();
                        h = akqj.h(b, akryVar);
                        try {
                            akax akaxVar = ((akfi) anczVar).a;
                            andc andcVar2 = ((akfi) anczVar).b;
                            andc andcVar3 = ((akfi) anczVar).c;
                            akfm akfmVar = new akfm(akaxVar);
                            final akfa akfaVar = (akfa) albo.bU(andcVar2, (alog) obj, true);
                            final akfa akfaVar2 = (akfa) albo.bU(andcVar3, (alog) obj, true);
                            if (akfaVar.f() && akfaVar2.f()) {
                                andc andcVar4 = new andc(albo.bI(((akfg) akfmVar.a).a.a(akfaVar.e(), akfaVar2.e())));
                                if (!akfaVar.g() || !akfaVar2.g()) {
                                    z = false;
                                }
                                andcVar = andcVar4.d(akto.g(new ancy() { // from class: akfl
                                    @Override // defpackage.ancy
                                    public final Object a(ahmn ahmnVar2, Object obj4) {
                                        if (z) {
                                            return akfa.a(obj4, (Instant) alzz.bi(akfaVar.d(), akfaVar2.d()));
                                        }
                                        return akfa.b(obj4);
                                    }
                                }), andi.a);
                                akqj.h(b, h);
                                andcVar.g((ancw) obj2);
                                return andcVar.c;
                            }
                            andcVar = new andc(albo.bI(akfa.a));
                            akqj.h(b, h);
                            andcVar.g((ancw) obj2);
                            return andcVar.c;
                        } finally {
                        }
                    } finally {
                        ((ancw) obj2).a(ancwVar, andi.a);
                    }
                } else {
                    ancw ancwVar2 = new ancw();
                    try {
                        andc a = this.a.a(ancwVar2.a);
                        a.g((ancw) this.b);
                        return a.c;
                    } finally {
                        ((ancw) this.b).a(ancwVar2, andi.a);
                    }
                }
            } else {
                return this.a.a();
            }
        } else {
            ?? r0 = this.a;
            b = akqj.b();
            h = akqj.h(b, r0);
            try {
                ListenableFuture a2 = this.b.a();
                akqj.h(b, h);
                a2.getClass();
                return a2;
            } catch (Throwable th) {
                try {
                    akqd.b(th);
                    throw th;
                } finally {
                }
            }
        }
    }

    public final String toString() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return this.a.toString();
                    }
                    return this.a.toString();
                }
                return this.a.toString();
            }
            Object obj = this.a;
            Object obj2 = this.b;
            return obj.toString() + ", input=[" + String.valueOf(obj2) + "]";
        }
        return "propagating=[" + this.b + "]";
    }

    public aktk(atii atiiVar, ancz anczVar, int i) {
        this.c = i;
        this.a = anczVar;
        this.b = atiiVar;
    }

    public aktk(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
