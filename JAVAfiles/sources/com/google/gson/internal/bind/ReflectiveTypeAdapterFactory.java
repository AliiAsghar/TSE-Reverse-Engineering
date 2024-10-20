package com.google.gson.internal.bind;

import com.google.gson.internal.Excluder;
import defpackage.aonq;
import defpackage.aonx;
import defpackage.aooe;
import defpackage.aoon;
import defpackage.aooo;
import defpackage.aoop;
import defpackage.aooy;
import defpackage.aopx;
import defpackage.aoqa;
import defpackage.aoqc;
import defpackage.aorl;
import defpackage.aorn;
import defpackage.aotl;
import defpackage.hht;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ReflectiveTypeAdapterFactory implements aooo {
    private final aooy a;
    private final Excluder b;
    private final JsonAdapterAnnotationTypeAdapterFactory c;
    private final List d;
    private final int e;

    public ReflectiveTypeAdapterFactory(aooy aooyVar, int i, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.a = aooyVar;
        this.e = i;
        this.b = excluder;
        this.c = jsonAdapterAnnotationTypeAdapterFactory;
        this.d = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (true == Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (aotl.t(accessibleObject, obj)) {
        } else {
            throw new aooe(aorl.e(accessibleObject, true).concat(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d8  */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.aoqb c(defpackage.aonx r36, defpackage.aorn r37, java.lang.Class r38, boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c(aonx, aorn, java.lang.Class, boolean, boolean):aoqb");
    }

    private static IllegalArgumentException d(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + aorl.d(field) + " and " + aorl.d(field2) + "\nSee " + aotl.q("duplicate-fields"));
    }

    private final boolean e(Field field, boolean z) {
        List list;
        Excluder excluder = this.b;
        int i = excluder.c;
        if ((field.getModifiers() & 136) == 0) {
            double d = excluder.b;
            if (!field.isSynthetic()) {
                if (excluder.d) {
                    aoop aoopVar = (aoop) field.getAnnotation(aoop.class);
                    if (aoopVar != null) {
                        if (z) {
                            if (!aoopVar.b()) {
                                return false;
                            }
                        } else if (!aoopVar.a()) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
                if (!excluder.c(field.getType(), z)) {
                    if (z) {
                        list = excluder.e;
                    } else {
                        list = excluder.f;
                    }
                    if (!list.isEmpty()) {
                        field.getClass();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((aonq) it.next()).b()) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.aooo
    public final aoon a(aonx aonxVar, aorn aornVar) {
        boolean z;
        Class cls = aornVar.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        if (aorl.h(cls)) {
            return new aopx();
        }
        int u = aotl.u(this.d);
        if (u != 4) {
            if (u == 3) {
                z = true;
            } else {
                z = false;
            }
            if (aorl.a.c(cls)) {
                return new aoqc(cls, c(aonxVar, aornVar, cls, z, true), z);
            }
            return new aoqa(this.a.a(aornVar), c(aonxVar, aornVar, cls, z, false));
        }
        throw new aooe(hht.b(cls, "ReflectionAccessFilter does not permit using reflection for ", ". Register a TypeAdapter for this type or adjust the access filter."));
    }
}
