package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aopz {
    final String a;
    public final Field b;
    final String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ Method e;
    final /* synthetic */ aoon f;
    final /* synthetic */ aoon g;
    final /* synthetic */ boolean h;
    final /* synthetic */ boolean i;

    public aopz(String str, Field field, boolean z, Method method, aoon aoonVar, aoon aoonVar2, boolean z2, boolean z3) {
        this.d = z;
        this.e = method;
        this.f = aoonVar;
        this.g = aoonVar2;
        this.h = z2;
        this.i = z3;
        this.a = str;
        this.b = field;
        this.c = field.getName();
    }
}
