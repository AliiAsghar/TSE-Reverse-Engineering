package com.google.gson.internal.bind;

import defpackage.aonx;
import defpackage.aoon;
import defpackage.aooo;
import defpackage.aorn;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TypeAdapters$30 implements aooo {
    final /* synthetic */ Class a;
    final /* synthetic */ Class b;
    final /* synthetic */ aoon c;

    public TypeAdapters$30(Class cls, Class cls2, aoon aoonVar) {
        this.a = cls;
        this.b = cls2;
        this.c = aoonVar;
    }

    @Override // defpackage.aooo
    public final aoon a(aonx aonxVar, aorn aornVar) {
        Class cls = aornVar.a;
        if (cls != this.a && cls != this.b) {
            return null;
        }
        return this.c;
    }

    public final String toString() {
        aoon aoonVar = this.c;
        Class cls = this.a;
        return "Factory[type=" + this.b.getName() + "+" + cls.getName() + ",adapter=" + aoonVar.toString() + "]";
    }
}
