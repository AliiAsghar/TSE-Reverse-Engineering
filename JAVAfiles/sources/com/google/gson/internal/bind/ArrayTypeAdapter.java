package com.google.gson.internal.bind;

import defpackage.aonx;
import defpackage.aoon;
import defpackage.aooo;
import defpackage.aoov;
import defpackage.aoqf;
import defpackage.aorn;
import defpackage.aoro;
import defpackage.aorp;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ArrayTypeAdapter extends aoon {
    public static final aooo a = new aooo() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // defpackage.aooo
        public final aoon a(aonx aonxVar, aorn aornVar) {
            Type genericComponentType;
            Type type = aornVar.b;
            if (!(type instanceof GenericArrayType)) {
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    if (cls.isArray()) {
                        genericComponentType = cls.getComponentType();
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            }
            return new ArrayTypeAdapter(aonxVar, aonxVar.a(new aorn(genericComponentType)), aoov.a(genericComponentType));
        }
    };
    private final Class b;
    private final aoon c;

    public ArrayTypeAdapter(aonx aonxVar, aoon aoonVar, Class cls) {
        this.c = new aoqf(aonxVar, aoonVar, cls);
        this.b = cls;
    }

    @Override // defpackage.aoon
    public final Object a(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aoroVar.l();
        while (aoroVar.r()) {
            arrayList.add(this.c.a(aoroVar));
        }
        aoroVar.n();
        int size = arrayList.size();
        if (this.b.isPrimitive()) {
            Object newInstance = Array.newInstance((Class<?>) this.b, size);
            for (int i = 0; i < size; i++) {
                Array.set(newInstance, i, arrayList.get(i));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.b, size));
    }

    @Override // defpackage.aoon
    public final void b(aorp aorpVar, Object obj) {
        if (obj == null) {
            aorpVar.j();
            return;
        }
        aorpVar.e();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.c.b(aorpVar, Array.get(obj, i));
        }
        aorpVar.g();
    }
}
