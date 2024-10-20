package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aff {
    public final AtomicReference a = new AtomicReference(null);
    public final asgm b = new asgm();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aff$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe, Object> {
        Object a;
        Object b;
        Object c;
        Object d;
        int e;
        final /* synthetic */ afd f;
        final /* synthetic */ aff g;
        final /* synthetic */ arqv h;
        final /* synthetic */ Object i;
        private /* synthetic */ Object j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(afd afdVar, aff affVar, arqv arqvVar, Object obj, arpe arpeVar) {
            super(2, arpeVar);
            this.f = afdVar;
            this.g = affVar;
            this.h = arqvVar;
            this.i = obj;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        @Override // defpackage.arpq
        public final Object b(Object obj) {
            aff affVar;
            Object obj2;
            a aVar;
            arqv arqvVar;
            Object obj3;
            aff affVar2;
            Throwable th;
            arpl arplVar = arpl.a;
            ?? r1 = this.e;
            try {
                try {
                    if (r1 != 0) {
                        if (r1 != 1) {
                            affVar2 = (aff) this.b;
                            obj3 = this.a;
                            aVar = (a) this.j;
                            try {
                                aqil.P(obj);
                                defpackage.a.bD(affVar2.a, aVar);
                                ((asgm) obj3).d();
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                defpackage.a.bD(affVar2.a, aVar);
                                throw th;
                            }
                        }
                        Object obj4 = this.d;
                        Object obj5 = this.c;
                        arqvVar = (arqv) this.b;
                        Object obj6 = this.a;
                        a aVar2 = (a) this.j;
                        aqil.P(obj);
                        affVar = obj4;
                        obj3 = obj6;
                        obj2 = obj5;
                        aVar = aVar2;
                    } else {
                        aqil.P(obj);
                        arwe arweVar = (arwe) this.j;
                        afd afdVar = this.f;
                        arpg arpgVar = arweVar.b().get(arxm.c);
                        arpgVar.getClass();
                        a aVar3 = new a(afdVar, (arxm) arpgVar);
                        this.g.b(aVar3);
                        affVar = this.g;
                        arqv arqvVar2 = this.h;
                        obj2 = this.i;
                        this.j = aVar3;
                        asgm asgmVar = affVar.b;
                        this.a = asgmVar;
                        this.b = arqvVar2;
                        this.c = obj2;
                        this.d = affVar;
                        this.e = 1;
                        if (asgmVar.b(this) != arplVar) {
                            aVar = aVar3;
                            arqvVar = arqvVar2;
                            obj3 = asgmVar;
                        }
                        return arplVar;
                    }
                    this.j = aVar;
                    this.a = obj3;
                    this.b = affVar;
                    this.c = null;
                    this.d = null;
                    this.e = 2;
                    Object a = arqvVar.a(obj2, this);
                    if (a != arplVar) {
                        affVar2 = affVar;
                        obj = a;
                        defpackage.a.bD(affVar2.a, aVar);
                        ((asgm) obj3).d();
                        return obj;
                    }
                    return arplVar;
                } catch (Throwable th3) {
                    affVar2 = affVar;
                    th = th3;
                    defpackage.a.bD(affVar2.a, aVar);
                    throw th;
                }
            } catch (Throwable th4) {
                ((asgm) r1).d();
                throw th4;
            }
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f, this.g, this.h, this.i, arpeVar);
            anonymousClass1.j = obj;
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

    public final Object a(Object obj, afd afdVar, arqv arqvVar, arpe arpeVar) {
        return arwi.d(new AnonymousClass1(afdVar, this, arqvVar, obj, null), arpeVar);
    }

    public final void b(a aVar) {
        a aVar2;
        do {
            aVar2 = (a) this.a.get();
            if (aVar2 != null && aVar.a.compareTo(aVar2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!defpackage.a.bC(this.a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b.v(new afe());
        }
    }
}
