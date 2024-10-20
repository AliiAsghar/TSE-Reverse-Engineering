package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aruv {
    public static final aruv a;
    public static final aruv b;
    public static final aruv c;
    public static final aruv d;
    public static final aruv e;
    public static final aruv f;
    public static final aruv g;
    private static final /* synthetic */ aruv[] i;
    public final TimeUnit h;

    static {
        aruv aruvVar = new aruv("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        a = aruvVar;
        aruv aruvVar2 = new aruv("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        b = aruvVar2;
        aruv aruvVar3 = new aruv("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        c = aruvVar3;
        aruv aruvVar4 = new aruv("SECONDS", 3, TimeUnit.SECONDS);
        d = aruvVar4;
        aruv aruvVar5 = new aruv("MINUTES", 4, TimeUnit.MINUTES);
        e = aruvVar5;
        aruv aruvVar6 = new aruv("HOURS", 5, TimeUnit.HOURS);
        f = aruvVar6;
        aruv aruvVar7 = new aruv("DAYS", 6, TimeUnit.DAYS);
        g = aruvVar7;
        aruv[] aruvVarArr = {aruvVar, aruvVar2, aruvVar3, aruvVar4, aruvVar5, aruvVar6, aruvVar7};
        i = aruvVarArr;
        arhi.f(aruvVarArr);
    }

    private aruv(String str, int i2, TimeUnit timeUnit) {
        this.h = timeUnit;
    }

    public static aruv[] values() {
        return (aruv[]) i.clone();
    }
}
