package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class prb {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/business/RbmBusinessInfoAndShortCodeUrlCreator");
    public static final pra b = new pra("rbm.goog");
    public final CronetEngine c;
    public final anen d;
    public final yjr e;
    public final Context f;
    public final aplg g;

    public prb(CronetEngine cronetEngine, anen anenVar, yjr yjrVar, Context context, aplg aplgVar) {
        this.c = cronetEngine;
        this.d = anenVar;
        this.e = yjrVar;
        this.f = context;
        this.g = aplgVar;
    }

    public static String a(String str) {
        return str.trim().replace("tel:", "");
    }
}
