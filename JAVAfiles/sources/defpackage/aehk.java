package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aehk {
    public static final alvi a = alvi.m("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager");
    public final long b;
    public final Context c;
    public final anen d;
    public final anen e;
    public final apwt f;
    public final Optional g;
    public final Optional h;
    protected final AtomicReference i = new AtomicReference(new HashSet());
    public final vco j;

    public aehk(Context context, Optional optional, long j, Optional optional2, anen anenVar, anen anenVar2, vco vcoVar, apwt apwtVar) {
        this.b = j;
        this.c = context;
        this.g = optional.map(new aegk(3));
        this.h = optional2;
        this.d = anenVar;
        this.e = anenVar2;
        this.j = vcoVar;
        this.f = apwtVar;
    }
}
