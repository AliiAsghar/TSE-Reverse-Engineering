package com.google.android.libraries.jibe.service.locationsharing;

import android.content.Context;
import android.os.Binder;
import com.google.android.ims.rcsservice.locationsharing.ILocationSharing;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.android.ims.rcsservice.locationsharing.LocationSharingResult;
import defpackage.acoc;
import defpackage.actt;
import defpackage.adtw;
import defpackage.aduu;
import defpackage.ahbz;
import defpackage.aozy;
import defpackage.apag;
import defpackage.apfh;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class LocationSharingEngine extends ILocationSharing.Stub {
    private final Context a;
    private final aduu b;
    private final acoc c;
    private ahbz d;

    public LocationSharingEngine(Context context, aduu aduuVar, acoc acocVar) {
        this.a = context;
        this.b = aduuVar;
        this.c = acocVar;
    }

    private final long a() {
        return this.b.c();
    }

    private final void b(Optional optional, String str) {
        aozy createBuilder = apfh.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apfh apfhVar = (apfh) apagVar;
        apfhVar.e = 3;
        apfhVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apfh apfhVar2 = (apfh) createBuilder.b;
        str.getClass();
        apfhVar2.b |= 4;
        apfhVar2.g = str;
        if (optional.isPresent()) {
            String obj = optional.get().toString();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apfh apfhVar3 = (apfh) createBuilder.b;
            apfhVar3.b |= 2;
            apfhVar3.f = obj;
        }
        this.c.e(this.a, (apfh) createBuilder.s());
    }

    public long[] getActiveSessions() {
        ahbz ahbzVar = this.d;
        if (ahbzVar == null) {
            return new long[0];
        }
        return ahbzVar.c();
    }

    @Override // com.google.android.ims.rcsservice.locationsharing.ILocationSharing
    public LocationSharingResult pushLocation(String str, LocationInformation locationInformation, String str2) {
        b(Optional.empty(), str2);
        adtw.d(this.a, Binder.getCallingUid());
        if (this.b.s()) {
            return new LocationSharingResult(-1L, str, 4, null);
        }
        ahbz ahbzVar = this.d;
        if (ahbzVar == null) {
            return new LocationSharingResult(-1L, str, 2, "Provider must not be null!");
        }
        return ahbzVar.a(a(), str, locationInformation, str2);
    }

    @Override // com.google.android.ims.rcsservice.locationsharing.ILocationSharing
    public LocationSharingResult[] pushLocationToGroup(long j, LocationInformation locationInformation, String str) {
        b(Optional.of(Long.valueOf(j)), str);
        adtw.d(this.a, Binder.getCallingUid());
        ahbz ahbzVar = this.d;
        if (ahbzVar == null) {
            return actt.j(2, "Provider must not be null!");
        }
        return ahbzVar.d(j, locationInformation, str);
    }

    public void registerProvider(ahbz ahbzVar) {
        this.d = ahbzVar;
    }

    public long registerSession(ahbz ahbzVar) {
        return a();
    }

    public void unregisterProvider(ahbz ahbzVar) {
        this.d = null;
    }

    public void unregisterSession(long j) {
    }
}
