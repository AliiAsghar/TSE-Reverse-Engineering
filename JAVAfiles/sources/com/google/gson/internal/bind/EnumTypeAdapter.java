package com.google.gson.internal.bind;

import defpackage.aonx;
import defpackage.aoon;
import defpackage.aooo;
import defpackage.aoor;
import defpackage.aorn;
import defpackage.aoro;
import defpackage.aorp;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class EnumTypeAdapter extends aoon {
    public static final aooo a = new aooo() { // from class: com.google.gson.internal.bind.EnumTypeAdapter.1
        @Override // defpackage.aooo
        public final aoon a(aonx aonxVar, aorn aornVar) {
            Class cls = aornVar.a;
            if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
                if (!cls.isEnum()) {
                    cls = cls.getSuperclass();
                }
                return new EnumTypeAdapter(cls);
            }
            return null;
        }
    };
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final Map d = new HashMap();

    public EnumTypeAdapter(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String name = r4.name();
                String str = r4.toString();
                aoor aoorVar = (aoor) field2.getAnnotation(aoor.class);
                if (aoorVar != null) {
                    name = aoorVar.a();
                    for (String str2 : aoorVar.b()) {
                        this.b.put(str2, r4);
                    }
                }
                this.b.put(name, r4);
                this.c.put(str, r4);
                this.d.put(r4, name);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        String j = aoroVar.j();
        Enum r0 = (Enum) this.b.get(j);
        if (r0 != null) {
            return r0;
        }
        return (Enum) this.c.get(j);
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        String str;
        Enum r3 = (Enum) obj;
        if (r3 == null) {
            str = null;
        } else {
            str = (String) this.d.get(r3);
        }
        aorpVar.m(str);
    }
}
