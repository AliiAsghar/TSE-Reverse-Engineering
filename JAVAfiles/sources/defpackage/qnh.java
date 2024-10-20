package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qnh implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ qnh(ahrr ahrrVar, Context context, apwt apwtVar, Executor executor, ahru ahruVar, armf armfVar, int i) {
        this.g = i;
        this.f = ahrrVar;
        this.a = context;
        this.c = apwtVar;
        this.d = executor;
        this.b = ahruVar;
        this.e = armfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [ahrr] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v29, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v23, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [qya] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    Context context = (Context) this.a;
                    boolean e = agqa.e(context);
                    ?? r3 = this.c;
                    Object obj = this.f;
                    int i2 = 4;
                    if (e) {
                        ((ahrr) obj).a(r3);
                    } else {
                        agqa.b(context, new adub(obj, (Object) r3, this.d, i2));
                    }
                    ahrr ahrrVar = (ahrr) obj;
                    if (ahrrVar.b) {
                        ?? r1 = this.e;
                        Object obj2 = this.b;
                        if (r1 == 0) {
                            aozy createBuilder = asja.a.createBuilder();
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            asja asjaVar = (asja) createBuilder.b;
                            asjaVar.d = 2;
                            asjaVar.b |= 4;
                            ahrrVar.a = ((ahru) obj2).a((asja) createBuilder.s());
                            return;
                        }
                        try {
                            ((ahrr) obj).a = ((ahru) obj2).a((asja) r1.b());
                            return;
                        } catch (Throwable th) {
                            ((alvg) ((alvg) ((alvg) ahkh.a.i()).g(th)).h("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchSamplingParameters", '}', "Sampler.java")).q("Couldn't get sampling strategy");
                            aozy createBuilder2 = asja.a.createBuilder();
                            if (!createBuilder2.b.isMutable()) {
                                createBuilder2.u();
                            }
                            apag apagVar = createBuilder2.b;
                            asja asjaVar2 = (asja) apagVar;
                            asjaVar2.b = 2 | asjaVar2.b;
                            asjaVar2.c = 1L;
                            if (!apagVar.isMutable()) {
                                createBuilder2.u();
                            }
                            asja asjaVar3 = (asja) createBuilder2.b;
                            asjaVar3.d = 3;
                            asjaVar3.b |= 4;
                            ahrrVar.a = ((ahru) obj2).a((asja) createBuilder2.s());
                            return;
                        }
                    }
                    return;
                }
                Object obj3 = this.a;
                Object obj4 = this.d;
                if (obj3 != null) {
                    obj4 = ((qei) obj3).d;
                }
                Object obj5 = this.e;
                Object obj6 = this.b;
                Object obj7 = this.c;
                Object obj8 = this.f;
                int i3 = alog.d;
                alog alogVar = alsx.a;
                tmc c = thu.c();
                String str = (String) obj4;
                c.h(str);
                tvr tvrVar = (tvr) obj8;
                c.g(tvrVar.b.f());
                Instant instant = (Instant) obj7;
                c.f(instant);
                c.e().l();
                thi thiVar = new thi();
                thiVar.aj("setEncryptableRegistrationId");
                thiVar.a.put("identity_key", ((aozb) obj6).H());
                thiVar.f(tvrVar.b.f());
                thiVar.c(instant);
                thj thjVar = new thj();
                String str2 = (String) obj5;
                thjVar.b(str2);
                if (!thiVar.ae(new agpw(thjVar), "remote_registrations_table-buildAndUpdateForTachyonRegistrationId")) {
                    tvr.a.o("Inserted an entry for the remote registration.");
                    vcb vcbVar = tvrVar.e;
                    vtk vtkVar = new vtk();
                    vtkVar.e(vbe.ETOUFFEE);
                    vcbVar.f(str, str2, vtkVar.d(), Optional.of(obj6), null, instant);
                    return;
                }
                tvr.a.o("Updated an entry for the remote registration.");
                return;
            }
            ?? r0 = this.f;
            r0.getClass();
            ?? r5 = this.b;
            r5.getClass();
            ?? r6 = this.c;
            r6.getClass();
            ?? r7 = this.d;
            r7.getClass();
            arsb arsbVar = (arsb) this.e;
            List list = (List) arsbVar.a;
            ArrayList arrayList = new ArrayList(aqjn.J(r0, 10));
            Iterator it = r0.iterator();
            while (it.hasNext()) {
                arrayList.add(((ParticipantsTable.BindData) it.next()).M());
            }
            list.addAll(nfl.j(arrayList, 1));
            List list2 = (List) arsbVar.a;
            ArrayList arrayList2 = new ArrayList(aqjn.J(r5, 10));
            Iterator it2 = r5.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ParticipantsTable.BindData) it2.next()).M());
            }
            list2.addAll(nfl.j(arrayList2, 2));
            List list3 = (List) arsbVar.a;
            ArrayList arrayList3 = new ArrayList(aqjn.J(r6, 10));
            Iterator it3 = r6.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((ParticipantsTable.BindData) it3.next()).M());
            }
            list3.addAll(nfl.j(arrayList3, 3));
            ArrayList<tap> arrayList4 = new ArrayList(aqjn.J(r7, 10));
            Iterator it4 = r7.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((ParticipantsTable.BindData) it4.next()).z());
            }
            ArrayList arrayList5 = new ArrayList(aqjn.J(arrayList4, 10));
            for (tap tapVar : arrayList4) {
                Object obj9 = this.a;
                ((lru) ((nfl) obj9).b.b()).i(tapVar);
                tbb f = ParticipantsTable.f();
                f.aj("updateContactInfo");
                f.M(new nfc(tapVar, 0));
                f.f(tapVar.t);
                f.e(tapVar.s);
                f.n(tapVar.u);
                f.ah();
                arrayList5.add(Integer.valueOf(f.a().e()));
            }
            return;
        }
        alwo alwoVar = qnn.a;
        Object obj10 = this.a;
        obj10.getClass();
        ?? r2 = this.d;
        r2.getClass();
        ?? r32 = this.e;
        r32.getClass();
        qya.h(this.b);
        qnn qnnVar = (qnn) obj10;
        qnnVar.e.g(this.c);
        Object b = qnnVar.d.b();
        b.getClass();
        if (((Boolean) b).booleanValue()) {
            r32 = new ArrayList(aqjn.J(r2, 10));
            Iterator it5 = r2.iterator();
            while (it5.hasNext()) {
                r32.add(Long.valueOf(((qll) it5.next()).a));
            }
        }
        Object obj11 = this.f;
        qya.h(r32);
        qnnVar.b.m(new qlf(new qin(obj11, 6), 7));
    }

    public /* synthetic */ qnh(arsb arsbVar, nfl nflVar, List list, List list2, List list3, List list4, int i) {
        this.g = i;
        this.e = arsbVar;
        this.a = nflVar;
        this.f = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
    }

    public /* synthetic */ qnh(qnn qnnVar, List list, List list2, List list3, List list4, apct apctVar, int i) {
        this.g = i;
        this.a = qnnVar;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = apctVar;
    }

    public /* synthetic */ qnh(tvr tvrVar, qei qeiVar, String str, Instant instant, aozb aozbVar, String str2, int i) {
        this.g = i;
        this.f = tvrVar;
        this.a = qeiVar;
        this.d = str;
        this.c = instant;
        this.b = aozbVar;
        this.e = str2;
    }
}
