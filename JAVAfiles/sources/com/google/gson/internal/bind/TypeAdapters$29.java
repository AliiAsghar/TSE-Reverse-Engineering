package com.google.gson.internal.bind;

import defpackage.aonx;
import defpackage.aoon;
import defpackage.aooo;
import defpackage.aorn;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TypeAdapters$29 implements aooo {
    final /* synthetic */ Class a;
    final /* synthetic */ aoon b;

    public TypeAdapters$29(Class cls, aoon aoonVar) {
        this.a = cls;
        this.b = aoonVar;
    }

    @Override // defpackage.aooo
    public final aoon a(aonx aonxVar, aorn aornVar) {
        if (aornVar.a == this.a) {
            return this.b;
        }
        return null;
    }

    public final String toString() {
        aoon aoonVar = this.b;
        return "Factory[type=" + this.a.getName() + ",adapter=" + aoonVar.toString() + "]";
    }
}
