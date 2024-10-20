package com.google.android.apps.messaging.startchat.viewmodel;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import defpackage.armf;
import defpackage.arpe;
import defpackage.arwe;
import defpackage.eor;
import defpackage.ljt;
import defpackage.okf;
import defpackage.qjh;
import defpackage.wio;
import defpackage.xze;
import defpackage.yzd;
import defpackage.zeo;
import defpackage.zeq;
import defpackage.zez;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StartChatViewModel extends eor {
    private static final xze d = xze.g("BugleContacts", "StartChatViewModel");
    public final armf a;
    public final armf b;
    public final armf c;
    private final armf e;
    private final armf f;
    private final armf g;

    public StartChatViewModel(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, arwe arweVar, armf armfVar7) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        arweVar.getClass();
        armfVar7.getClass();
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.g = armfVar6;
        k(new ljt(this, 2));
        Object b = armfVar7.b();
        b.getClass();
        Iterator it = ((Iterable) b).iterator();
        while (it.hasNext()) {
            ((yzd) it.next()).a();
        }
    }

    public final void a(boolean z) {
        d.o("onCreate with splitview: " + z + "}");
        ((zeq) this.e.b()).a = z;
        if (((okf) this.g.b()).a()) {
            zeo zeoVar = (zeo) this.f.b();
            if (!zeoVar.d.getAndSet(true)) {
                qjh.l(zeoVar.b, null, new wio(zeoVar, (arpe) null, 7), 3);
            }
        }
    }

    public final void b(boolean z, SelfIdentityId selfIdentityId) {
        d.h().H("onCreate with splitview: %s and selfIdentityId: %s", z, selfIdentityId.a());
        ((zeq) this.e.b()).a = z;
        zeo zeoVar = (zeo) this.f.b();
        qjh.l(zeoVar.b, null, new zez(zeoVar, selfIdentityId, (arpe) null, 1), 3);
    }
}
