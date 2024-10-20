package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.function.BiConsumer$CC;
import java.util.concurrent.ExecutionException;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ytp {
    public static final alor a = alor.o(yua.C11N, anmm.C11N, yua.RCS, anmm.RCS, yua.NOT_YET_KNOWN, anmm.NOT_YET_KNOWN, yua.C11N_RCS, anmm.C11N_RCS);
    public static final xze b = xze.g("Bugle", "VerifiedSmsInvestigativeRpcService");
    public final yuu c;
    public final xnv d;
    public final yjy e;
    public final Context f;
    public final anen g;
    public final anen h;
    public final vjs i;

    public ytp(yuu yuuVar, vjs vjsVar, xnv xnvVar, yjy yjyVar, Context context, anen anenVar, anen anenVar2) {
        this.c = yuuVar;
        this.i = vjsVar;
        this.d = xnvVar;
        this.e = yjyVar;
        this.f = context;
        this.g = anenVar;
        this.h = anenVar2;
    }

    public static String a(String str, int i) {
        if (i == 3) {
            return str;
        }
        return str.hashCode() + "-redacted";
    }

    public static void b(final aozy aozyVar, akul akulVar, akul akulVar2, akul akulVar3, final int i) {
        String str;
        yuf yufVar;
        yuf yufVar2 = yuf.a;
        final alor alorVar = altc.a;
        try {
            yufVar = (yuf) albo.bQ(akulVar);
            str = "";
        } catch (ExecutionException e) {
            str = String.valueOf(e.getClass()) + ": " + e.getMessage();
            yufVar = yufVar2;
        }
        try {
            alorVar = (alor) albo.bQ(akulVar2);
        } catch (ExecutionException e2) {
            str = str + ";keys: " + String.valueOf(e2.getClass()) + ": " + e2.getMessage();
        }
        alor alorVar2 = altc.a;
        try {
            alorVar2 = ((yut) albo.bQ(akulVar3)).a;
        } catch (ExecutionException e3) {
            str = str + ";evicted-keys: " + String.valueOf(e3.getClass()) + ": " + e3.getMessage();
        }
        int size = yufVar.d.size();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        anmo anmoVar = (anmo) aozyVar.b;
        anmo anmoVar2 = anmo.a;
        anmoVar.f = size;
        apct apctVar = yufVar.i;
        if (apctVar == null) {
            apctVar = apct.a;
        }
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        anmo anmoVar3 = (anmo) aozyVar.b;
        apctVar.getClass();
        anmoVar3.n = apctVar;
        anmoVar3.b |= 4;
        yty ytyVar = yufVar.j;
        if (ytyVar == null) {
            ytyVar = yty.a;
        }
        boolean z = ytyVar.b;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        apag apagVar = aozyVar.b;
        ((anmo) apagVar).o = z;
        yty ytyVar2 = yufVar.j;
        if (ytyVar2 == null) {
            ytyVar2 = yty.a;
        }
        boolean z2 = ytyVar2.c;
        if (!apagVar.isMutable()) {
            aozyVar.u();
        }
        apag apagVar2 = aozyVar.b;
        ((anmo) apagVar2).p = z2;
        yty ytyVar3 = yufVar.j;
        if (ytyVar3 == null) {
            ytyVar3 = yty.a;
        }
        apax apaxVar = ytyVar3.d;
        if (!apagVar2.isMutable()) {
            aozyVar.u();
        }
        anmo anmoVar4 = (anmo) aozyVar.b;
        apax apaxVar2 = anmoVar4.w;
        if (!apaxVar2.c()) {
            anmoVar4.w = apag.mutableCopy(apaxVar2);
        }
        aoyj.addAll(apaxVar, anmoVar4.w);
        yty ytyVar4 = yufVar.j;
        if (ytyVar4 == null) {
            ytyVar4 = yty.a;
        }
        apax apaxVar3 = ytyVar4.e;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        anmo anmoVar5 = (anmo) aozyVar.b;
        apax apaxVar4 = anmoVar5.x;
        if (!apaxVar4.c()) {
            anmoVar5.x = apag.mutableCopy(apaxVar4);
        }
        aoyj.addAll(apaxVar3, anmoVar5.x);
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        apag apagVar3 = aozyVar.b;
        ((anmo) apagVar3).u = str;
        long j = yufVar.k;
        if (!apagVar3.isMutable()) {
            aozyVar.u();
        }
        ((anmo) aozyVar.b).v = j;
        Map.EL.forEach(DesugarCollections.unmodifiableMap(yufVar.e), new BiConsumer() { // from class: yto
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String str2 = (String) obj;
                yub yubVar = (yub) obj2;
                String a2 = ytp.a(str2, i);
                aozy createBuilder = anmn.a.createBuilder();
                aozb aozbVar = yubVar.d;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar4 = createBuilder.b;
                aozbVar.getClass();
                ((anmn) apagVar4).e = aozbVar;
                String str3 = yubVar.e;
                if (!apagVar4.isMutable()) {
                    createBuilder.u();
                }
                anmn anmnVar = (anmn) createBuilder.b;
                str3.getClass();
                anmnVar.f = str3;
                apct b2 = apds.b(yubVar.c);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                anmn anmnVar2 = (anmn) createBuilder.b;
                b2.getClass();
                anmnVar2.d = b2;
                anmnVar2.b |= 1;
                alor alorVar3 = ytp.a;
                yua b3 = yua.b(yubVar.f);
                if (b3 == null) {
                    b3 = yua.UNRECOGNIZED;
                }
                anmm anmmVar = (anmm) alorVar3.getOrDefault(b3, anmm.UNKNOWN_TYPE);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                alor alorVar4 = alorVar;
                ((anmn) createBuilder.b).g = anmmVar.a();
                int i2 = alog.d;
                Iterable iterable = (Iterable) alorVar4.getOrDefault(str2, alsx.a);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                anmn anmnVar3 = (anmn) createBuilder.b;
                apax apaxVar5 = anmnVar3.c;
                if (!apaxVar5.c()) {
                    anmnVar3.c = apag.mutableCopy(apaxVar5);
                }
                aoyj.addAll(iterable, anmnVar3.c);
                Iterable iterable2 = (Iterable) Collection.EL.stream(yubVar.b).map(new yug(1)).collect(alls.a);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                anmn anmnVar4 = (anmn) createBuilder.b;
                apax apaxVar6 = anmnVar4.h;
                if (!apaxVar6.c()) {
                    anmnVar4.h = apag.mutableCopy(apaxVar6);
                }
                aozy aozyVar2 = aozy.this;
                aoyj.addAll(iterable2, anmnVar4.h);
                anmn anmnVar5 = (anmn) createBuilder.s();
                a2.getClass();
                anmnVar5.getClass();
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                anmo anmoVar6 = (anmo) aozyVar2.b;
                anmo anmoVar7 = anmo.a;
                apbo apboVar = anmoVar6.c;
                if (!apboVar.b) {
                    anmoVar6.c = apboVar.a();
                }
                anmoVar6.c.put(a2, anmnVar5);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        Map.EL.forEach(alorVar2, new ytn(aozyVar, i, 0));
    }
}
