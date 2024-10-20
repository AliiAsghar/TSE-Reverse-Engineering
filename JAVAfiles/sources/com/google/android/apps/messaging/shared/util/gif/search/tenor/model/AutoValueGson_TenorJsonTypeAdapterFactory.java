package com.google.android.apps.messaging.shared.util.gif.search.tenor.model;

import defpackage.aonx;
import defpackage.aoon;
import defpackage.aorn;
import defpackage.yef;
import defpackage.yeg;
import defpackage.yeh;
import defpackage.yei;
import defpackage.yej;
import defpackage.yek;
import defpackage.yel;
import defpackage.yem;
import defpackage.yen;
import defpackage.yeo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AutoValueGson_TenorJsonTypeAdapterFactory extends TenorJsonTypeAdapterFactory {
    @Override // defpackage.aooo
    public final aoon a(aonx aonxVar, aorn aornVar) {
        Class cls = aornVar.a;
        if (yek.class.isAssignableFrom(cls)) {
            return new yef(aonxVar);
        }
        if (yel.class.isAssignableFrom(cls)) {
            return new yeg(aonxVar);
        }
        if (yem.class.isAssignableFrom(cls)) {
            return new yeh(aonxVar);
        }
        if (yen.class.isAssignableFrom(cls)) {
            return new yei(aonxVar);
        }
        if (yeo.class.isAssignableFrom(cls)) {
            return new yej(aonxVar);
        }
        return null;
    }
}
