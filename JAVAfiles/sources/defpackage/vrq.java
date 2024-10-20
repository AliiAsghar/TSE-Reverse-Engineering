package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vrq {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/rcs/availability/RcsUpdateNotifier");
    public final Context b;
    public final anen c;
    public final anen d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;

    public vrq(Context context, anen anenVar, anen anenVar2, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        this.b = context;
        this.e = armfVar;
        this.f = armfVar2;
        this.c = anenVar;
        this.d = anenVar2;
        this.g = armfVar3;
        this.h = armfVar4;
        this.i = armfVar5;
        this.j = armfVar6;
        this.k = armfVar7;
    }

    public static void a(Exception exc) {
        ((alvg) ((alvg) ((alvg) a.i()).g(exc)).h("com/google/android/apps/messaging/shared/rcs/availability/RcsUpdateNotifier", "onUpdateFailure", 'l', "RcsUpdateNotifier.java")).q("failed to update RCS success notification state");
    }
}
