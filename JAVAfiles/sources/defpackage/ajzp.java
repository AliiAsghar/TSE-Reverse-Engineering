package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajzp implements ancs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ajzp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, akda] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r13v26, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v45, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [armf, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        int i = 18;
        int i2 = 17;
        Object obj2 = null;
        String str = "pseudonymous";
        int i3 = 1;
        switch (this.b) {
            case 0:
                Object obj3 = this.a;
                ((IOException) obj3).addSuppressed((IOException) obj);
                throw ((Throwable) obj3);
            case 1:
                ansy ansyVar = ((ajzq) this.a).a;
                return ansyVar.u(ansyVar.t(true));
            case 2:
                ArrayList arrayList = new ArrayList();
                aluq listIterator = ((alor) obj).entrySet().listIterator();
                while (listIterator.hasNext()) {
                    Object obj4 = this.a;
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    ajzd ajzdVar = new ajzd((ajwt) entry.getKey(), ansy.x((ajzz) entry.getValue()).b);
                    akkd akkdVar = (akkd) obj4;
                    Set set = (Set) akkdVar.h.b();
                    ArrayList arrayList2 = new ArrayList(set.size());
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList2.add(((ajze) it.next()).b(ajzdVar));
                        } catch (Exception e) {
                            arrayList2.add(albo.bH(e));
                        }
                    }
                    arrayList.add(albo.bV(arrayList2).b(akto.c(new ncx(obj4, arrayList2, ajzdVar, 19, (byte[]) null)), akkdVar.e));
                }
                return albo.bX(arrayList).a(new aidu(obj2, i), andi.a);
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    return albo.bI(null);
                }
                Object obj5 = this.a;
                altx altxVar = new altx("pseudonymous");
                d.s(!altxVar.isEmpty());
                aluq listIterator2 = altxVar.listIterator();
                while (listIterator2.hasNext()) {
                    ((String) listIterator2.next()).getClass();
                    d.s(!r3.isEmpty());
                }
                Object obj6 = ((ahiy) obj5).b;
                ancr c = akto.c(new xpx(obj6, altxVar, i));
                ajzk ajzkVar = (ajzk) obj6;
                ListenableFuture b = ((andr) ajzkVar.f).b(c, ajzkVar.g);
                ajzkVar.c(b);
                return b;
            case 4:
                ansy ansyVar2 = (ansy) ((ansy) ((ahiy) this.a).c).a;
                return aktp.Y(((ahiy) ansyVar2.a).y(), new abdo(str, str, 20), ansyVar2.b);
            case 5:
                ajzl ajzlVar = (ajzl) obj;
                int i4 = ajzlVar.b & 1;
                Object obj7 = this.a;
                if (i4 != 0 && Math.abs(((akad) obj7).c.f().toEpochMilli() - ajzlVar.c) < akad.b) {
                    return albo.bI(false);
                }
                return ancj.f(((akad) obj7).e.a(), akto.a(new ajwz(i2)), andi.a);
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    return ((akad) this.a).b();
                }
                return albo.bI(null);
            case 7:
                aogy aogyVar = ((akdi) this.a).d;
                return ancj.f(aogyVar.b.e(), new akdg(3), aogyVar.d);
            case 8:
                return ((akyr) this.a).h((String) obj);
            case 9:
                return d.Y(this.a, obj);
            case 10:
                return d.Y(this.a, obj);
            case 11:
                return d.Y(this.a, obj);
            case 12:
                return ((akyr) this.a).h((String) obj);
            case 13:
                return d.Y(this.a, obj);
            case 14:
                return d.Y(this.a, obj);
            case 15:
                return d.Y(this.a, obj);
            case 16:
                return d.Y(this.a, obj);
            case 17:
                return d.Y(this.a, obj);
            case 18:
                return d.Y(this.a, obj);
            case 19:
                return d.Y(this.a, obj);
            default:
                Map map = (Map) obj;
                ((alvg) ((alvg) akos.a.g()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "syncInternal", 306, "SyncManagerImpl.java")).t("Running synclets: %s", Collection.EL.stream(map.keySet()).map(new ajqy(13)).toArray());
                akos akosVar = (akos) this.a;
                algw algwVar = (algw) ((apxx) akosVar.h).a;
                if (algwVar.f()) {
                }
                if (map.isEmpty()) {
                    return albo.bI(altg.a);
                }
                final akom akomVar = akosVar.f;
                final Set keySet = map.keySet();
                ListenableFuture W = aktp.W(new Callable() { // from class: akoj
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z;
                        java.util.Collection<akot> collection;
                        akom akomVar2 = akom.this;
                        akomVar2.b.writeLock().lock();
                        try {
                            akpk akpkVar = akpk.a;
                            boolean z2 = false;
                            try {
                                akpkVar = akomVar2.a();
                            } catch (IOException e2) {
                                if (!akomVar2.f(e2)) {
                                    ((alvg) ((alvg) ((alvg) akom.a.h()).g(e2)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "prepareForSync", (char) 267, "SyncManagerDataStore.java")).q("Error, could not read or clear store. Aborting sync attempt.");
                                    z = false;
                                }
                            }
                            aozy createBuilder = akpk.a.createBuilder();
                            createBuilder.w(akpkVar);
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            ((akpk) createBuilder.b).d = akpk.emptyProtobufList();
                            long epochMilli = akomVar2.e.f().toEpochMilli();
                            HashSet hashSet = new HashSet();
                            Iterator<E> it2 = akpkVar.d.iterator();
                            while (true) {
                                boolean hasNext = it2.hasNext();
                                collection = keySet;
                                if (!hasNext) {
                                    break;
                                }
                                akpj akpjVar = (akpj) it2.next();
                                akpm akpmVar = akpjVar.c;
                                if (akpmVar == null) {
                                    akpmVar = akpm.a;
                                }
                                if (collection.contains(new akot(akpmVar))) {
                                    akpm akpmVar2 = akpjVar.c;
                                    if (akpmVar2 == null) {
                                        akpmVar2 = akpm.a;
                                    }
                                    hashSet.add(new akot(akpmVar2));
                                    aozy builder = akpjVar.toBuilder();
                                    if (!builder.b.isMutable()) {
                                        builder.u();
                                    }
                                    akpj akpjVar2 = (akpj) builder.b;
                                    akpjVar2.b |= 4;
                                    akpjVar2.e = epochMilli;
                                    createBuilder.aA((akpj) builder.s());
                                } else {
                                    createBuilder.aA(akpjVar);
                                }
                            }
                            for (akot akotVar : collection) {
                                if (!hashSet.contains(akotVar)) {
                                    aozy createBuilder2 = akpj.a.createBuilder();
                                    akpm akpmVar3 = akotVar.a;
                                    if (!createBuilder2.b.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    apag apagVar = createBuilder2.b;
                                    akpj akpjVar3 = (akpj) apagVar;
                                    akpmVar3.getClass();
                                    akpjVar3.c = akpmVar3;
                                    akpjVar3.b |= 1;
                                    long j = akomVar2.g;
                                    if (!apagVar.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    apag apagVar2 = createBuilder2.b;
                                    akpj akpjVar4 = (akpj) apagVar2;
                                    akpjVar4.b |= 2;
                                    akpjVar4.d = j;
                                    if (!apagVar2.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    apag apagVar3 = createBuilder2.b;
                                    akpj akpjVar5 = (akpj) apagVar3;
                                    akpjVar5.b |= 4;
                                    akpjVar5.e = epochMilli;
                                    if (!apagVar3.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    akpj akpjVar6 = (akpj) createBuilder2.b;
                                    akpjVar6.b |= 8;
                                    akpjVar6.f = 0;
                                    createBuilder.aA((akpj) createBuilder2.s());
                                }
                            }
                            if (akpkVar.c < 0) {
                                long j2 = akomVar2.g;
                                if (j2 < 0) {
                                    j2 = akomVar2.e.f().toEpochMilli();
                                    akomVar2.g = j2;
                                }
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                akpk akpkVar2 = (akpk) createBuilder.b;
                                akpkVar2.b |= 1;
                                akpkVar2.c = j2;
                            }
                            try {
                                akomVar2.e((akpk) createBuilder.s());
                                akomVar2.f.set(true);
                                z2 = true;
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                akomVar2.f.set(true);
                                throw th;
                            }
                            z = Boolean.valueOf(z2);
                            return z;
                        } finally {
                            akomVar2.b.writeLock().unlock();
                        }
                    }
                }, akomVar.d);
                ListenableFuture ac = aktp.ac(akosVar.h(W), new akon(akosVar, W, map, i3), akosVar.c);
                akat akatVar = akosVar.e;
                map.getClass();
                ListenableFuture ab = aktp.ab(ac, new aidu(map, i2), akosVar.c);
                akatVar.g(ab);
                return ab;
        }
    }
}
