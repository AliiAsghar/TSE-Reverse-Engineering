package com.google.gson.internal.bind;

import defpackage.aonx;
import defpackage.aoon;
import defpackage.aooo;
import defpackage.aoov;
import defpackage.aooy;
import defpackage.aops;
import defpackage.aorn;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class CollectionTypeAdapterFactory implements aooo {
    private final aooy a;

    public CollectionTypeAdapterFactory(aooy aooyVar) {
        this.a = aooyVar;
    }

    @Override // defpackage.aooo
    public final aoon a(aonx aonxVar, aorn aornVar) {
        Type type;
        Class cls = aornVar.a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type d = aoov.d(aornVar.b, cls, Collection.class);
        if (d instanceof ParameterizedType) {
            type = ((ParameterizedType) d).getActualTypeArguments()[0];
        } else {
            type = Object.class;
        }
        return new aops(aonxVar, type, aonxVar.a(new aorn(type)), this.a.a(aornVar));
    }
}
