package com.google.gson.internal.bind;

import defpackage.aonx;
import defpackage.aoon;
import defpackage.aooo;
import defpackage.aopw;
import defpackage.aorn;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ObjectTypeAdapter$1 implements aooo {
    final /* synthetic */ int a;

    public ObjectTypeAdapter$1(int i) {
        this.a = i;
    }

    @Override // defpackage.aooo
    public final aoon a(aonx aonxVar, aorn aornVar) {
        if (aornVar.a == Object.class) {
            return new aopw(aonxVar, this.a);
        }
        return null;
    }
}
