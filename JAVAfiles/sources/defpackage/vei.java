package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vei implements ancs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ vei(Object obj, int i, Object obj2, int i2) {
        this.d = i2;
        this.b = obj;
        this.a = i;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List, java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        int i = this.d;
        byte[] bArr = null;
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    int i3 = 6;
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                int i4 = this.a;
                                ArrayList arrayList = new ArrayList(i4);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if (((Boolean) albo.bQ((Future) this.c.get(i5))).booleanValue()) {
                                        aiwp aiwpVar = (aiwp) ((aiwk) this.b).a.get(i5);
                                        a.bz().booleanValue();
                                        arrayList.add(albo.bM(new aidu(aiwpVar, i3), aiwpVar.b));
                                    }
                                }
                                return albo.bX(arrayList).a(new aidu(bArr, 18), andi.a);
                            }
                            apbt apbtVar = (apbt) obj;
                            ?? r4 = this.c;
                            int i6 = this.a;
                            aiwk aiwkVar = (aiwk) this.b;
                            return albo.bV(r4).b(akto.c(new rep(aiwkVar, apbtVar, i6, (List) r4, 2)), aiwkVar.b);
                        }
                        final alog g = ((alob) this.c).g();
                        aiea aieaVar = (aiea) this.b;
                        final long j = aieaVar.d;
                        final int i7 = aieaVar.c;
                        final int i8 = this.a;
                        return akul.g(aieaVar.g.c.f(new aixt() { // from class: aidb
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.aixt
                            public final void a(agrk agrkVar) {
                                agcp am;
                                alsx alsxVar;
                                StringBuilder sb = new StringBuilder();
                                ArrayList arrayList2 = new ArrayList();
                                sb.append("day_index < ?");
                                arrayList2.add(String.valueOf(i8));
                                agrkVar.G(ahmc.am("AggregateStore", sb, arrayList2));
                                StringBuilder sb2 = new StringBuilder();
                                ArrayList arrayList3 = new ArrayList();
                                alog alogVar = g;
                                if (!alogVar.isEmpty() && !Collection.EL.stream(alogVar).flatMap(new agnz(15)).findAny().isEmpty()) {
                                    long j2 = j;
                                    int i9 = i7;
                                    sb2.append("customer_id != ? OR project_id != ? OR metric_id NOT IN (?");
                                    arrayList3.add(String.valueOf(i9));
                                    arrayList3.add(String.valueOf(j2));
                                    arrayList3.add(String.valueOf(((aidk) alogVar.get(0)).a));
                                    int i10 = 1;
                                    while (true) {
                                        alsxVar = (alsx) alogVar;
                                        if (i10 >= alsxVar.c) {
                                            break;
                                        }
                                        sb2.append(", ?");
                                        arrayList3.add(String.valueOf(((aidk) alogVar.get(i10)).a));
                                        i10++;
                                    }
                                    sb2.append(")");
                                    int i11 = alsxVar.c;
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        aidk aidkVar = (aidk) alogVar.get(i12);
                                        sb2.append(" OR (metric_id = ?");
                                        arrayList3.add(String.valueOf(aidkVar.a));
                                        if (!aidkVar.b.isEmpty()) {
                                            sb2.append(" AND report_id NOT IN (?");
                                            arrayList3.add(aidkVar.b.get(0).toString());
                                            for (int i13 = 1; i13 < ((alsx) aidkVar.b).c; i13++) {
                                                sb2.append(", ?");
                                                arrayList3.add(aidkVar.b.get(i13).toString());
                                            }
                                            sb2.append(")");
                                        }
                                        sb2.append(")");
                                    }
                                    am = ahmc.am("Reports", sb2, arrayList3);
                                } else {
                                    am = ahmc.am("Reports", sb2, arrayList3);
                                }
                                agrkVar.G(am);
                                StringBuilder sb3 = new StringBuilder();
                                ArrayList arrayList4 = new ArrayList();
                                sb3.append("system_profile_hash NOT IN (SELECT DISTINCT system_profile_hash FROM AggregateStore)");
                                agrkVar.G(ahmc.am("SystemProfiles", sb3, arrayList4));
                            }
                        }));
                    }
                    amso amsoVar = (amso) obj;
                    aozy createBuilder = amoq.a.createBuilder();
                    ampo ampoVar = ampo.a;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amoq amoqVar = (amoq) createBuilder.b;
                    ampoVar.getClass();
                    amoqVar.f = ampoVar;
                    amoqVar.e = 209;
                    aozy createBuilder2 = ampp.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    ampp amppVar = (ampp) createBuilder2.b;
                    amppVar.c = 5;
                    amppVar.b |= 1;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    Object obj2 = this.c;
                    Object obj3 = this.b;
                    amoq amoqVar2 = (amoq) createBuilder.b;
                    ampp amppVar2 = (ampp) createBuilder2.s();
                    amppVar2.getClass();
                    amoqVar2.d = amppVar2;
                    amoqVar2.c = 103;
                    amoq amoqVar3 = (amoq) createBuilder.s();
                    int ordinal = ((wkv) obj2).ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                i2 = 6;
                            }
                        } else {
                            i2 = 3;
                        }
                    } else {
                        i2 = 2;
                    }
                    return ((mci) ((znj) obj3).b).j(i2, amoqVar3, -1, amsoVar);
                }
                zap zapVar = ((vuo) this.b).f;
                return zapVar.p().h(new ikg(this.c, this.a, 10), zapVar.a).i(new vfj(zapVar, (String) obj, 7, bArr), zapVar.a).i(new vek(zapVar, 12), zapVar.a);
            }
            Object obj4 = this.c;
            return ((lta) this.b).b(this.a, aphh.OPERATION_TYPE_TERMINATE_VENDOR_IMS, (aphg) obj4);
        }
        vee veeVar = (vee) obj;
        AtomicReference atomicReference = (AtomicReference) this.c;
        if (atomicReference.get() != null) {
            ved b = ved.b(((vee) atomicReference.get()).i);
            if (b == null) {
                b = ved.UNRECOGNIZED;
            }
            ved b2 = ved.b(veeVar.i);
            if (b2 == null) {
                b2 = ved.UNRECOGNIZED;
            }
            int i9 = this.a;
            vel velVar = (vel) this.b;
            velVar.q(b, b2, i9);
            ved b3 = ved.b(((vee) atomicReference.get()).i);
            if (b3 == null) {
                b3 = ved.UNRECOGNIZED;
            }
            ved b4 = ved.b(veeVar.i);
            if (b4 == null) {
                b4 = ved.UNRECOGNIZED;
            }
            return velVar.p(b3, b4, i9);
        }
        return aktp.ag(null);
    }

    public /* synthetic */ vei(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    public /* synthetic */ vei(znj znjVar, int i, wkv wkvVar, int i2) {
        this.d = i2;
        this.b = znjVar;
        this.a = 6;
        this.c = wkvVar;
    }
}
