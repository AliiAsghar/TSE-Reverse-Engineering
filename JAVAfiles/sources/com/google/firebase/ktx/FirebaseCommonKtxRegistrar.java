package com.google.firebase.ktx;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.aodj;
import defpackage.aodq;
import defpackage.aodr;
import defpackage.aods;
import defpackage.aodt;
import defpackage.aoem;
import defpackage.aoen;
import defpackage.aoev;
import defpackage.aofg;
import defpackage.aqjn;
import defpackage.armg;
import defpackage.arwb;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
@armg
/* loaded from: classes4.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<aoen<?>> getComponents() {
        aoem a = aoen.a(new aofg(aodq.class, arwb.class));
        a.b(new aoev(new aofg(aodq.class, Executor.class), 1, 0));
        a.c = aodj.e;
        aoem a2 = aoen.a(new aofg(aods.class, arwb.class));
        a2.b(new aoev(new aofg(aods.class, Executor.class), 1, 0));
        a2.c = aodj.f;
        aoem a3 = aoen.a(new aofg(aodr.class, arwb.class));
        a3.b(new aoev(new aofg(aodr.class, Executor.class), 1, 0));
        a3.c = aodj.g;
        aoem a4 = aoen.a(new aofg(aodt.class, arwb.class));
        a4.b(new aoev(new aofg(aodt.class, Executor.class), 1, 0));
        a4.c = aodj.h;
        return aqjn.B(a.a(), a2.a(), a3.a(), a4.a());
    }
}
