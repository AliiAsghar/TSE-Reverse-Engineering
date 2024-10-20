package defpackage;

import android.content.Intent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wlc {
    public static final xze a = xze.g("Bugle", "BootAndPackageReplacedReceiver");
    public static final alwo b = alwo.o("BugleNotifications");
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final Optional k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final armf o;
    public final armf p;
    public final armf q;
    public final armf r;
    public final armf s;
    public final armf t;
    public final armf u;
    public final armf v;

    public wlc(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, Optional optional, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19) {
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar4;
        this.g = armfVar5;
        this.h = armfVar6;
        this.i = armfVar7;
        this.j = armfVar8;
        this.k = optional;
        this.l = armfVar9;
        this.m = armfVar10;
        this.n = armfVar11;
        this.o = armfVar12;
        this.p = armfVar13;
        this.q = armfVar14;
        this.r = armfVar15;
        this.s = armfVar16;
        this.t = armfVar17;
        this.u = armfVar18;
        this.v = armfVar19;
    }

    public static boolean a(Intent intent) {
        return "android.intent.action.BOOT_COMPLETED".equals(intent.getAction());
    }
}
