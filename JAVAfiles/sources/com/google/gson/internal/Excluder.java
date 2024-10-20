package com.google.gson.internal;

import defpackage.aonq;
import defpackage.aonx;
import defpackage.aoon;
import defpackage.aooo;
import defpackage.aooz;
import defpackage.aorl;
import defpackage.aorn;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class Excluder implements Cloneable, aooo {
    public static final Excluder a = new Excluder();
    public boolean d;
    public final double b = -1.0d;
    public final int c = 136;
    public final List e = Collections.emptyList();
    public final List f = Collections.emptyList();

    @Override // defpackage.aooo
    public final aoon a(aonx aonxVar, aorn aornVar) {
        Class cls = aornVar.a;
        boolean c = c(cls, true);
        boolean c2 = c(cls, false);
        if (!c && !c2) {
            return null;
        }
        return new aooz(this, c2, c, aonxVar, aornVar);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean c(Class cls, boolean z) {
        List list;
        if (!z) {
            if (!Enum.class.isAssignableFrom(cls) && aorl.h(cls)) {
                return true;
            }
            list = this.f;
        } else {
            list = this.e;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((aonq) it.next()).a()) {
                return true;
            }
        }
        return false;
    }
}
