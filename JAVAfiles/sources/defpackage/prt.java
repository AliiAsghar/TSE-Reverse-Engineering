package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class prt {
    public static final xze a = xze.g("Bugle", "RbmBusinessInfoUpdateHelper");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/business/RbmBusinessInfoUpdateHelper");
    public final ContentResolver c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;

    public prt(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8) {
        this.c = context.getContentResolver();
        this.d = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
        this.i = armfVar6;
        this.j = armfVar7;
        this.k = armfVar8;
    }

    public static void b(String str, String str2) {
        xyo e = a.e();
        e.H(str2);
        e.z("botId", str);
        e.q();
    }

    public final void a(String str, Iterable iterable, String str2) {
        ((mho) this.e.b()).aM(11, str);
        xyo b2 = a.b();
        b2.H(str2);
        b2.z("botId", str);
        b2.M("canonical address", iterable);
        b2.q();
    }
}
