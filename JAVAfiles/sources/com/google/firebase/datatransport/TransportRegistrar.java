package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.abil;
import defpackage.abio;
import defpackage.aode;
import defpackage.aoem;
import defpackage.aoen;
import defpackage.aoeo;
import defpackage.aoev;
import defpackage.aofg;
import defpackage.aofs;
import defpackage.aofu;
import defpackage.aofv;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ abil lambda$getComponents$0(aoeo aoeoVar) {
        abio.b((Context) aoeoVar.e(Context.class));
        return abio.a().c();
    }

    public static /* synthetic */ abil lambda$getComponents$1(aoeo aoeoVar) {
        abio.b((Context) aoeoVar.e(Context.class));
        return abio.a().c();
    }

    public static /* synthetic */ abil lambda$getComponents$2(aoeo aoeoVar) {
        abio.b((Context) aoeoVar.e(Context.class));
        return abio.a().c();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<aoen<?>> getComponents() {
        aoem b = aoen.b(abil.class);
        b.a = LIBRARY_NAME;
        b.b(new aoev(Context.class, 1, 0));
        b.c = new aofs(4);
        aoem a = aoen.a(new aofg(aofu.class, abil.class));
        a.b(new aoev(Context.class, 1, 0));
        a.c = new aofs(5);
        aoem a2 = aoen.a(new aofg(aofv.class, abil.class));
        a2.b(new aoev(Context.class, 1, 0));
        a2.c = new aofs(6);
        return Arrays.asList(b.a(), a.a(), a2.a(), aode.ad(LIBRARY_NAME, "19.0.0_1p"));
    }
}
