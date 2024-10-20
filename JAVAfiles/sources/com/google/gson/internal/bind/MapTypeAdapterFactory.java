package com.google.gson.internal.bind;

import defpackage.aonx;
import defpackage.aoon;
import defpackage.aooo;
import defpackage.aoov;
import defpackage.aooy;
import defpackage.aopu;
import defpackage.aorg;
import defpackage.aorn;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MapTypeAdapterFactory implements aooo {
    private final aooy a;

    public MapTypeAdapterFactory(aooy aooyVar) {
        this.a = aooyVar;
    }

    @Override // defpackage.aooo
    public final aoon a(aonx aonxVar, aorn aornVar) {
        Type[] typeArr;
        aoon aoonVar;
        Class cls = aornVar.a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        Type type = aornVar.b;
        if (type == Properties.class) {
            typeArr = new Type[]{String.class, String.class};
        } else {
            Type d = aoov.d(type, cls, Map.class);
            if (d instanceof ParameterizedType) {
                typeArr = ((ParameterizedType) d).getActualTypeArguments();
            } else {
                typeArr = new Type[]{Object.class, Object.class};
            }
        }
        Type type2 = typeArr[0];
        if (type2 != Boolean.TYPE && type2 != Boolean.class) {
            aoonVar = aonxVar.a(new aorn(type2));
        } else {
            aoonVar = aorg.f;
        }
        return new aopu(aonxVar, typeArr[0], aoonVar, typeArr[1], aonxVar.a(new aorn(typeArr[1])), this.a.a(aornVar));
    }
}
