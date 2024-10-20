package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajna {
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;

    public ajna(anmv anmvVar, anmv anmvVar2) {
        this.d = anmvVar;
        this.b = 11;
        this.c = anmvVar2;
        this.a = 12;
    }

    public static alea a(apbt apbtVar, int i, anmv anmvVar, byte[] bArr, aozb aozbVar) {
        byte[] a = anmvVar.a(apbtVar.toByteArray(), bArr);
        aozy createBuilder = alea.a.createBuilder();
        aozb w = aozb.w(a);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((alea) apagVar).d = w;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        ((alea) apagVar2).b = i;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        alea aleaVar = (alea) createBuilder.b;
        aozbVar.getClass();
        aleaVar.c = aozbVar;
        return (alea) createBuilder.s();
    }

    public ajna(ajnb ajnbVar, ktk ktkVar) {
        this.c = new SparseArray();
        this.d = ajnbVar;
        int[] iArr = ajnj.a;
        this.a = ktkVar.n(28, 0);
        this.b = ktkVar.n(52, 0);
    }
}
