package com.google.firebase.iid;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.aode;
import defpackage.aodi;
import defpackage.aoem;
import defpackage.aoen;
import defpackage.aoeo;
import defpackage.aoev;
import defpackage.aofs;
import defpackage.aogs;
import defpackage.aogu;
import defpackage.aogz;
import defpackage.aoha;
import defpackage.aohe;
import defpackage.aohi;
import defpackage.aojm;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class Registrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseInstanceId lambda$getComponents$0(aoeo aoeoVar) {
        aodi aodiVar = (aodi) aoeoVar.e(aodi.class);
        return new FirebaseInstanceId(aodiVar, new aogz(aodiVar.a()), aogu.a(), aogu.a(), aoeoVar.b(aojm.class), aoeoVar.b(aogs.class), (aohi) aoeoVar.e(aohi.class));
    }

    public static /* synthetic */ aohe lambda$getComponents$1(aoeo aoeoVar) {
        return new aoha((FirebaseInstanceId) aoeoVar.e(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<aoen<?>> getComponents() {
        aoem b = aoen.b(FirebaseInstanceId.class);
        b.b(new aoev(aodi.class, 1, 0));
        b.b(new aoev(aojm.class, 0, 1));
        b.b(new aoev(aogs.class, 0, 1));
        b.b(new aoev(aohi.class, 1, 0));
        b.c = new aofs(7);
        b.c();
        aoen a = b.a();
        aoem b2 = aoen.b(aohe.class);
        b2.b(new aoev(FirebaseInstanceId.class, 1, 0));
        b2.c = new aofs(8);
        return Arrays.asList(a, b2.a(), aode.ad("fire-iid", "21.1.1"));
    }
}
