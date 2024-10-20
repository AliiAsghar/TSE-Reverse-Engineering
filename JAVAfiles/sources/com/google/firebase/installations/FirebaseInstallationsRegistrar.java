package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.aode;
import defpackage.aodi;
import defpackage.aoem;
import defpackage.aoen;
import defpackage.aoeo;
import defpackage.aoev;
import defpackage.aofs;
import defpackage.aogp;
import defpackage.aogq;
import defpackage.aogr;
import defpackage.aohh;
import defpackage.aohi;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    public static /* synthetic */ aohi lambda$getComponents$0(aoeo aoeoVar) {
        return new aohh((aodi) aoeoVar.e(aodi.class), aoeoVar.b(aogr.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<aoen<?>> getComponents() {
        aoem b = aoen.b(aohi.class);
        b.b(new aoev(aodi.class, 1, 0));
        b.b(new aoev(aogr.class, 0, 1));
        b.c = new aofs(9);
        return Arrays.asList(b.a(), aoen.d(new aogq(), aogp.class), aode.ad("fire-installations", "17.0.2_1p"));
    }
}
