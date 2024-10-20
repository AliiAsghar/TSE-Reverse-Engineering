package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akka;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akiq implements ancr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public akiq(arqr arqrVar, akka akkaVar, int i) {
        this.c = i;
        this.b = arqrVar;
        this.a = akkaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, aokc] */
    /* JADX WARN: Type inference failed for: r1v0, types: [byte[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ancs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r2v11, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.ancr
    public final ListenableFuture a() {
        ListenableFuture a;
        ListenableFuture listenableFuture;
        ancr b;
        ListenableFuture X;
        ListenableFuture listenableFuture2;
        ancr a2;
        ?? r1 = 0;
        r1 = 0;
        switch (this.c) {
            case 0:
                Object obj = this.b;
                obj.getClass();
                return this.a.a(obj);
            case 1:
                String a3 = akac.a((ajwt) this.a);
                ArrayList arrayList = new ArrayList();
                ansy ansyVar = (ansy) this.b;
                aluq listIterator = ((aohs) ansyVar.b).z().listIterator();
                while (listIterator.hasNext()) {
                    arrayList.add(ansyVar.r(new File((File) listIterator.next(), a3)));
                }
                return albo.bX(arrayList).a(new aidu(r1, 18), andi.a);
            case 2:
                adef adefVar = (adef) this.b;
                Object obj2 = adefVar.b;
                akiy akiyVar = (akiy) this.a;
                if (((atqq) obj2).h(akiyVar.a).a) {
                    a = ((ahtx) adefVar.c.b()).b(akiyVar.b);
                } else {
                    a = ((ahtx) adefVar.c.b()).a(akiyVar.b.c);
                }
                return aktp.T(a, ahty.class, new akez(agdl.o, 8), andi.a);
            case 3:
                Object obj3 = this.b;
                return ancj.g(((akjb) obj3).m.c(), akto.d(new ahsi(obj3, this.a, 13, r1)), andi.a);
            case 4:
                adef adefVar2 = ((akjh) this.a).j;
                String h = ((asqc) adefVar2.d).h((String) this.b);
                ancr ancrVar = (ancr) ((Map) adefVar2.e.b()).get(h);
                akjk akjkVar = (akjk) ((Map) adefVar2.c.b()).get(h);
                if (ancrVar != null) {
                    X = aktp.X(ancrVar, adefVar2.a);
                } else if (akjkVar != null && (b = akjkVar.b()) != null) {
                    X = aktp.X(b, adefVar2.a);
                } else {
                    listenableFuture = null;
                    if (akjkVar != null && (a2 = akjkVar.a()) != null) {
                        r1 = aktp.Y(aktp.X(a2, adefVar2.a), new akez(akje.a, 12), andi.a);
                    }
                    listenableFuture2 = r1;
                    if (listenableFuture != null && listenableFuture2 == null) {
                        return aneh.a;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    aqil.H(new ListenableFuture[]{listenableFuture, listenableFuture2}, linkedHashSet);
                    return aktp.aq(linkedHashSet).n(new mtz(adefVar2, h, listenableFuture, listenableFuture2, 10), andi.a);
                }
                listenableFuture = X;
                if (akjkVar != null) {
                    r1 = aktp.Y(aktp.X(a2, adefVar2.a), new akez(akje.a, 12), andi.a);
                }
                listenableFuture2 = r1;
                if (listenableFuture != null) {
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                aqil.H(new ListenableFuture[]{listenableFuture, listenableFuture2}, linkedHashSet2);
                return aktp.aq(linkedHashSet2).n(new mtz(adefVar2, h, listenableFuture, listenableFuture2, 10), andi.a);
            case 5:
                akka akkaVar = (akka) this.b;
                ajwt ajwtVar = akkaVar.c;
                Object obj4 = this.a;
                if (!d.F(obj4, ajwtVar)) {
                    ajwt ajwtVar2 = (ajwt) obj4;
                    akkaVar.c = ajwtVar2;
                    akka.a aVar = (akka.a) akec.x(akkaVar.a, akka.a.class, ajwtVar2);
                    ListenableFuture C = akkaVar.e.C(ajwtVar2);
                    List p = aVar.kp().p();
                    List p2 = aVar.ko().p();
                    List y = aqjn.y(C);
                    List aq = aqjn.aq(p, p2);
                    ArrayList arrayList2 = new ArrayList(aqjn.J(aq, 10));
                    Iterator it = aq.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((asqe) it.next()).c);
                    }
                    return aktp.aq(aqjn.aq(y, arrayList2)).n(akto.c(new mtz(p, p2, akkaVar, C, 11)), andi.a);
                }
                return albo.bI(null);
            case 6:
                return this.b.a(((akka) this.a).c);
            case 7:
                Object obj5 = this.a;
                akdj akdjVar = new akdj(obj5, 15);
                akos akosVar = (akos) this.b;
                return albo.bP(ancj.f(aktp.X(akdjVar, akosVar.d), new algm(null), andi.a), ((akob) obj5).a().b, TimeUnit.MILLISECONDS, akosVar.c);
            case 8:
                return ((akoy) this.b).b.q(((WorkerParameters) this.a).a);
            case 9:
                return ((akpa) this.b).f.q(((WorkerParameters) this.a).a);
            case 10:
                akpd akpdVar = (akpd) this.a;
                albo.bQ(akpdVar.b);
                ((Long) albo.bQ(this.b)).longValue();
                return akpdVar.a.b();
            default:
                ?? r0 = this.b;
                Object obj6 = this.a;
                akrh e = aktp.e("FrameworkChannel#getTransportChannel");
                try {
                    ListenableFuture bI = albo.bI(r0.a((aokb) obj6));
                    e.close();
                    return bI;
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
        }
    }

    public /* synthetic */ akiq(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ akiq(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
