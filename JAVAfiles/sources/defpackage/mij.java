package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mij {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/analytics/statistics/cobalt/AppInstallCobaltLogger");
    public final Optional b;
    public final abpo c;
    public final oay d;
    private final lpg e;

    public mij(Optional optional, abpo abpoVar, oay oayVar, lpg lpgVar) {
        this.b = optional;
        this.c = abpoVar;
        this.d = oayVar;
        this.e = lpgVar;
    }

    public final alog a() {
        return alog.s(Integer.valueOf(mii.d(this.e.o()) - 1), Integer.valueOf(mii.e(lpg.p()) - 1));
    }
}
