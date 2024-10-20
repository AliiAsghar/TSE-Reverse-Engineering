package defpackage;

import android.content.Context;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl");
    public final akbm b;
    public final arwe c;
    public final xnv d;
    public final ojd e;
    public final yyt f;
    private final yhl g;
    private final ydk h;
    private final ojc i;
    private final yyt j;

    public yhp(Context context, akbm akbmVar, arwe arweVar, yhl yhlVar, xnv xnvVar, ydk ydkVar, ygb ygbVar, yyt yytVar, yyt yytVar2, ojc ojcVar, ojd ojdVar) {
        context.getClass();
        akbmVar.getClass();
        arweVar.getClass();
        xnvVar.getClass();
        ydkVar.getClass();
        ygbVar.getClass();
        yytVar.getClass();
        this.b = akbmVar;
        this.c = arweVar;
        this.g = yhlVar;
        this.d = xnvVar;
        this.h = ydkVar;
        this.f = yytVar;
        this.j = yytVar2;
        this.i = ojcVar;
        this.e = ojdVar;
    }

    public final Duration a(long j) {
        if (this.i.a()) {
            return Duration.between(Instant.ofEpochMilli(j), Instant.ofEpochMilli(this.d.a()));
        }
        return Duration.between(Instant.ofEpochMilli(this.d.a()), Instant.ofEpochMilli(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.yhd r38, defpackage.arpe r39) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yhp.b(yhd, arpe):java.lang.Object");
    }
}
