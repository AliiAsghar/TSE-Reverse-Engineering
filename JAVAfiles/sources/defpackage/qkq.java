package defpackage;

import j$.time.Duration;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qkq {
    public static final asai a(asai asaiVar, long j, int i, arqv arqvVar) {
        asaiVar.getClass();
        return new asaa(new qkm(asaiVar, i, j, arqvVar, null));
    }

    public static /* synthetic */ asai b(asai asaiVar, long j, arqw arqwVar) {
        return new asaa(new qkp(asaiVar, j, arqwVar, null));
    }

    public static final asai c(asai asaiVar, asai asaiVar2, asai asaiVar3, asai asaiVar4, arwe arweVar, long j, arqy arqyVar) {
        asaiVar4.getClass();
        asai[] asaiVarArr = {asaiVar, asaiVar2, asaiVar3, asaiVar4};
        boolean[] zArr = new boolean[4];
        for (int i = 0; i < 4; i++) {
            zArr[i] = false;
        }
        ArrayList arrayList = new ArrayList(4);
        int i2 = 0;
        int i3 = 0;
        while (i2 < 4) {
            arrayList.add(new akee(asaiVarArr[i2], new jmk(zArr, i3, (arpe) null, 7, (byte[][]) null), 10));
            i2++;
            i3++;
        }
        return new akee((arqv) new jmo(arweVar, j, asaiVarArr, zArr, (arpe) null, 3, (short[]) null), (asai) new kdp((asai[]) aqjn.ax(arrayList).toArray(new asai[0]), arqyVar, 20), 4);
    }

    public static final asai d(asai asaiVar, asai asaiVar2, arwe arweVar, long j, arqw arqwVar) {
        asai[] asaiVarArr = {asaiVar, asaiVar2};
        boolean[] zArr = new boolean[2];
        for (int i = 0; i < 2; i++) {
            zArr[i] = false;
        }
        ArrayList arrayList = new ArrayList(2);
        int i2 = 0;
        int i3 = 0;
        while (i2 < 2) {
            arrayList.add(new akee(asaiVarArr[i2], new jmk(zArr, i3, (arpe) null, 9, (short[][]) null), 10));
            i2++;
            i3++;
        }
        return new akee((arqv) new jmo(arweVar, j, asaiVarArr, zArr, (arpe) null, 3, (short[]) null), (asai) new qkk((asai[]) aqjn.ax(arrayList).toArray(new asai[0]), arqwVar, 0), 4);
    }

    public static /* synthetic */ asai e(asai asaiVar, asai asaiVar2, asai asaiVar3, asai asaiVar4, asai asaiVar5, asai asaiVar6, arwe arweVar, arra arraVar) {
        long j = arut.a;
        long o = arsd.o(10, aruv.d);
        asai[] asaiVarArr = {asaiVar, asaiVar2, asaiVar3, asaiVar4, asaiVar5, asaiVar6};
        boolean[] zArr = new boolean[6];
        for (int i = 0; i < 6; i++) {
            zArr[i] = false;
        }
        ArrayList arrayList = new ArrayList(6);
        int i2 = 0;
        int i3 = 0;
        while (i3 < 6) {
            arrayList.add(new akee(asaiVarArr[i3], new jmk(zArr, i2, (arpe) null, 3, (short[]) null), 10));
            i3++;
            i2++;
        }
        return new akee((arqv) new jmo(arweVar, o, asaiVarArr, zArr, (arpe) null, 3, (short[]) null), (asai) new kdp((asai[]) aqjn.ax(arrayList).toArray(new asai[0]), arraVar, 16), 4);
    }

    public static /* synthetic */ asai f(asai asaiVar, asai asaiVar2, asai asaiVar3, arwe arweVar, arqx arqxVar) {
        long j = arut.a;
        long o = arsd.o(10, aruv.d);
        asai[] asaiVarArr = {asaiVar, asaiVar2, asaiVar3};
        boolean[] zArr = new boolean[3];
        for (int i = 0; i < 3; i++) {
            zArr[i] = false;
        }
        ArrayList arrayList = new ArrayList(3);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 3; i3 < i4; i4 = 3) {
            arrayList.add(new akee(asaiVarArr[i3], new jmk(zArr, i2, (arpe) null, 6, (float[]) null), 10));
            i3++;
            i2++;
        }
        return new akee((arqv) new jmo(arweVar, o, asaiVarArr, zArr, (arpe) null, 3, (short[]) null), (asai) new kdp((asai[]) aqjn.ax(arrayList).toArray(new asai[0]), arqxVar, 19), 4);
    }

    public static /* synthetic */ asai g(asai asaiVar, asai asaiVar2, asai asaiVar3, asai asaiVar4, arwe arweVar, arqy arqyVar) {
        long j = arut.a;
        return c(asaiVar, asaiVar2, asaiVar3, asaiVar4, arweVar, arsd.o(10, aruv.d), arqyVar);
    }

    public static /* synthetic */ asai h(asai asaiVar, asai asaiVar2, arwe arweVar, arqw arqwVar) {
        long j = arut.a;
        return d(asaiVar, asaiVar2, arweVar, arsd.o(10, aruv.d), arqwVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final asai i(asai asaiVar) {
        akee akeeVar = new akee(asaiVar, new qkj(asaiVar, (arpe) null, 0), 10);
        if (asaiVar instanceof qke) {
            return qkf.a(akeeVar, ((qke) asaiVar).a.concat("+LogEmissions"));
        }
        return akeeVar;
    }

    public static final qkg j(ascv ascvVar) {
        ascvVar.getClass();
        if (ascvVar instanceof qjr) {
            return new qjp(new kdy(ascvVar, 2));
        }
        return new qki(ascvVar, 0);
    }

    public static int k(int i) {
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    return 0;
                }
            }
            return i2;
        }
        return 3;
    }

    public static final /* synthetic */ qfd l(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (qfd) s;
    }

    public static final void m(boolean z, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        qfd qfdVar = (qfd) aozyVar.b;
        qfd qfdVar2 = qfd.a;
        qfdVar.b |= 1;
        qfdVar.c = z;
    }

    public static pvp n() {
        pvm pvmVar = new pvm();
        pvmVar.c(Duration.ZERO);
        pvmVar.b(puw.a);
        return pvmVar.a();
    }

    public static boolean o() {
        return anfi.a("bugle.log_remote_transport_type_on_sending", "bugle");
    }
}
