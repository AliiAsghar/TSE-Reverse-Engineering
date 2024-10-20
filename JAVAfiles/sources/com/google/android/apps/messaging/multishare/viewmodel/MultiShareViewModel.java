package com.google.android.apps.messaging.multishare.viewmodel;

import defpackage.armf;
import defpackage.eor;
import defpackage.lgf;
import defpackage.ljt;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MultiShareViewModel extends eor {
    public final armf a;
    public final armf b;

    public MultiShareViewModel(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.a = armfVar;
        this.b = armfVar2;
        k(new ljt(this, 0));
        Object b = armfVar3.b();
        b.getClass();
        Iterator it = ((Iterable) b).iterator();
        while (it.hasNext()) {
            ((lgf) it.next()).a();
        }
    }
}
