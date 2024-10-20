package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bte {
    public final AtomicReference a = new AtomicReference(null);
    public final asgm b = new asgm();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bte$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe, Object> {
        Object a;
        Object b;
        Object c;
        int d;
        final /* synthetic */ afd e;
        final /* synthetic */ bte f;
        final /* synthetic */ arqr g;
        private /* synthetic */ Object h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(afd afdVar, bte bteVar, arqr arqrVar, arpe arpeVar) {
            super(2, arpeVar);
            this.e = afdVar;
            this.f = bteVar;
            this.g = arqrVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        @Override // defpackage.arpq
        public final Object b(Object obj) {
            a aVar;
            bte bteVar;
            a aVar2;
            arqr arqrVar;
            Object obj2;
            bte bteVar2;
            Throwable th;
            arpl arplVar = arpl.a;
            ?? r1 = this.d;
            try {
                try {
                    if (r1 != 0) {
                        if (r1 != 1) {
                            bteVar2 = (bte) this.b;
                            obj2 = this.a;
                            aVar2 = (a) this.h;
                            try {
                                aqil.P(obj);
                                defpackage.a.bD(bteVar2.a, aVar2);
                                ((asgm) obj2).d();
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                defpackage.a.bD(bteVar2.a, aVar2);
                                throw th;
                            }
                        }
                        Object obj3 = this.c;
                        arqr arqrVar2 = (arqr) this.b;
                        Object obj4 = this.a;
                        a aVar3 = (a) this.h;
                        aqil.P(obj);
                        bteVar = obj3;
                        obj2 = obj4;
                        arqrVar = arqrVar2;
                        aVar2 = aVar3;
                    } else {
                        aqil.P(obj);
                        arwe arweVar = (arwe) this.h;
                        afd afdVar = this.e;
                        arpg arpgVar = arweVar.b().get(arxm.c);
                        arpgVar.getClass();
                        a aVar4 = new a(afdVar, (arxm) arpgVar);
                        bte bteVar3 = this.f;
                        do {
                            aVar = (a) bteVar3.a.get();
                            if (aVar != null && aVar4.a.compareTo(aVar.a) < 0) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        } while (!defpackage.a.bC(bteVar3.a, aVar, aVar4));
                        if (aVar != null) {
                            aVar.b.v(null);
                        }
                        bteVar = this.f;
                        arqr arqrVar3 = this.g;
                        this.h = aVar4;
                        asgm asgmVar = bteVar.b;
                        this.a = asgmVar;
                        this.b = arqrVar3;
                        this.c = bteVar;
                        this.d = 1;
                        if (asgmVar.b(this) != arplVar) {
                            aVar2 = aVar4;
                            arqrVar = arqrVar3;
                            obj2 = asgmVar;
                        }
                        return arplVar;
                    }
                    this.h = aVar2;
                    this.a = obj2;
                    this.b = bteVar;
                    this.c = null;
                    this.d = 2;
                    Object a = arqrVar.a(this);
                    if (a != arplVar) {
                        bteVar2 = bteVar;
                        obj = a;
                        defpackage.a.bD(bteVar2.a, aVar2);
                        ((asgm) obj2).d();
                        return obj;
                    }
                    return arplVar;
                } catch (Throwable th3) {
                    bteVar2 = bteVar;
                    th = th3;
                    defpackage.a.bD(bteVar2.a, aVar2);
                    throw th;
                }
            } catch (Throwable th4) {
                ((asgm) r1).d();
                throw th4;
            }
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.e, this.f, this.g, arpeVar);
            anonymousClass1.h = obj;
            return anonymousClass1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public final afd a;
        public final arxm b;

        public a(afd afdVar, arxm arxmVar) {
            this.a = afdVar;
            this.b = arxmVar;
        }
    }

    public final Object a(afd afdVar, arqr arqrVar, arpe arpeVar) {
        return arwi.d(new AnonymousClass1(afdVar, this, arqrVar, null), arpeVar);
    }
}
