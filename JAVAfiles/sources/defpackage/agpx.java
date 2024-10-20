package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class agpx {
    public final List a = new ArrayList();

    public static final Iterable X(Iterable iterable) {
        return alzz.aL(iterable, new abes(14));
    }

    public static final Iterable Y(int[] iArr) {
        return alzz.as(agnc.m(iArr, Integer.class), new abes(13));
    }

    public static final Iterable Z(String... strArr) {
        return alzz.as(Arrays.asList(strArr), new abes(12));
    }

    public final void U(agpy agpyVar) {
        this.a.add(agpyVar);
    }

    public final void V(agpx... agpxVarArr) {
        U(new agop(agpxVarArr));
    }

    public final void W(agpj agpjVar) {
        U(new agoc(agpjVar));
    }

    public abstract agpw a();
}
