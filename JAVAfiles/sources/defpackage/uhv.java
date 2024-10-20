package defpackage;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uhv {
    public static final xze a = xze.g("Bugle", "SharedStorageInteractor");
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;

    public uhv(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9) {
        this.c = armfVar2;
        this.b = armfVar;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.g = armfVar6;
        this.h = armfVar7;
        this.i = armfVar8;
        this.j = armfVar9;
        ylv ylvVar = new ylv();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.UID_REMOVED");
        intentFilter.addDataScheme("package");
        context.registerReceiver(ylvVar, intentFilter);
    }
}
