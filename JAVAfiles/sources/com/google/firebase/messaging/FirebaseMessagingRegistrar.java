package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.abil;
import defpackage.aode;
import defpackage.aodi;
import defpackage.aoem;
import defpackage.aoen;
import defpackage.aoeo;
import defpackage.aoev;
import defpackage.aofs;
import defpackage.aogn;
import defpackage.aogs;
import defpackage.aohe;
import defpackage.aohi;
import defpackage.aojm;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(aoeo aoeoVar) {
        return new FirebaseMessaging((aodi) aoeoVar.e(aodi.class), (aohe) aoeoVar.e(aohe.class), aoeoVar.b(aojm.class), aoeoVar.b(aogs.class), (aohi) aoeoVar.e(aohi.class), (abil) aoeoVar.e(abil.class), (aogn) aoeoVar.e(aogn.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<aoen<?>> getComponents() {
        aoem b = aoen.b(FirebaseMessaging.class);
        b.a = LIBRARY_NAME;
        b.b(new aoev(aodi.class, 1, 0));
        b.b(new aoev(aohe.class, 0, 0));
        b.b(new aoev(aojm.class, 0, 1));
        b.b(new aoev(aogs.class, 0, 1));
        b.b(new aoev(abil.class, 0, 0));
        b.b(new aoev(aohi.class, 1, 0));
        b.b(new aoev(aogn.class, 1, 0));
        b.c = new aofs(10);
        b.c();
        return Arrays.asList(b.a(), aode.ad(LIBRARY_NAME, "23.3.2_1p"));
    }
}
