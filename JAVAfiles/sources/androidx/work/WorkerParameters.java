package androidx.work;

import defpackage.arpi;
import defpackage.gpx;
import defpackage.gsi;
import defpackage.gsq;
import defpackage.gto;
import defpackage.mka;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkerParameters {
    public final UUID a;
    public final gsi b;
    public final Set c;
    public final int d;
    public final Executor e;
    public final arpi f;
    public final gto g;
    public final gsq h;
    public final gpx i;
    public final mka j;

    public WorkerParameters(UUID uuid, gsi gsiVar, Collection collection, mka mkaVar, int i, Executor executor, arpi arpiVar, gpx gpxVar, gto gtoVar, gsq gsqVar) {
        this.a = uuid;
        this.b = gsiVar;
        this.c = new HashSet(collection);
        this.j = mkaVar;
        this.d = i;
        this.e = executor;
        this.f = arpiVar;
        this.i = gpxVar;
        this.g = gtoVar;
        this.h = gsqVar;
    }
}
