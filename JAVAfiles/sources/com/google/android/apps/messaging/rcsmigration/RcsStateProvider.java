package com.google.android.apps.messaging.rcsmigration;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.ims.rcsmigration.IRcsStateProvider;
import com.google.android.ims.rcsmigration.RcsState;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.service.JibeService;
import defpackage.aaoc;
import defpackage.abit;
import defpackage.abiv;
import defpackage.abjc;
import defpackage.acxv;
import defpackage.aday;
import defpackage.adom;
import defpackage.adtl;
import defpackage.adup;
import defpackage.aduv;
import defpackage.advr;
import defpackage.adwi;
import defpackage.agqh;
import defpackage.aktp;
import defpackage.alpt;
import defpackage.aluq;
import defpackage.anen;
import defpackage.armf;
import defpackage.kut;
import defpackage.qiu;
import defpackage.uuc;
import defpackage.uvl;
import defpackage.vpv;
import defpackage.wui;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RcsStateProvider extends IRcsStateProvider.Stub {
    private final Context a;
    private final armf b;
    private final anen c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;

    public RcsStateProvider(Context context, armf<wui> armfVar, anen anenVar, armf<adtl> armfVar2, uuc uucVar, armf<uvl> armfVar3, armf<vpv> armfVar4, armf<acxv> armfVar5, armf<aday> armfVar6) {
        uucVar.a();
        armfVar3.b();
        this.a = context;
        this.b = armfVar;
        this.c = anenVar;
        this.d = armfVar2;
        this.e = armfVar4;
        this.f = armfVar5;
        this.g = armfVar6;
        abjc.j(context);
    }

    public void allowOrThrow() {
        if (((vpv) this.e.b()).a(Binder.getCallingUid())) {
        } else {
            throw new RemoteException("Caller not google signed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        if (((defpackage.aday) r7.b()).i().getBoolean("provisioning_engine_carrier_consent_key", false) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
    
        if (((defpackage.aday) r7.b()).v() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0095, code lost:
    
        if (defpackage.adnu.g(r4) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0072, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0070, code lost:
    
        if (defpackage.adnu.d(r4).getBoolean("provisioning_engine_carrier_consent_key", false) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.ims.rcsmigration.RcsState buildRcsState() {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.rcsmigration.RcsStateProvider.buildRcsState():com.google.android.ims.rcsmigration.RcsState");
    }

    @Override // com.google.android.ims.rcsmigration.IRcsStateProvider
    public RcsState getRcsState() {
        allowOrThrow();
        return buildRcsState();
    }

    /* renamed from: lambda$onMigrationComplete$0$com-google-android-apps-messaging-rcsmigration-RcsStateProvider, reason: not valid java name */
    public /* synthetic */ void m190x2b266856() {
        Boolean bool = true;
        aduv.g.e(bool);
        abiv abivVar = (abiv) adup.a;
        aaoc aaocVar = abivVar.b;
        ContentResolver contentResolver = abjc.d;
        String str = abivVar.a;
        Bundle bundle = new Bundle();
        bool.getClass();
        bundle.putBoolean(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, true);
        bundle.putString("key", "migration_complete");
        bundle.putString(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, "boolean");
        aluq listIterator = ((alpt) aaocVar.b).listIterator();
        while (listIterator.hasNext()) {
            ((agqh) listIterator.next()).a();
        }
        if (contentResolver.call((Uri) aaocVar.a, "put", (String) aaocVar.c, bundle) == null) {
            Log.e("PreferenceFileAccessor", abit.a("call() returned null result; replacing with EMPTY", new Object[0]));
        }
        if (adwi.a(this.a) == 2) {
            advr.k("Rcs Engine should be running in cs.apk. Stopping JibeService.", new Object[0]);
            ((wui) this.b.b()).m();
            advr.k("JibeService stopped: %b", Boolean.valueOf(this.a.stopService(new Intent(this.a, (Class<?>) JibeService.class))));
            ((wui) this.b.b()).l();
            adom.A().y(this.a, (adtl) this.d.b());
        }
    }

    @Override // com.google.android.ims.rcsmigration.IRcsStateProvider
    public void onMigrationComplete() {
        allowOrThrow();
        advr.k("Migration complete.", new Object[0]);
        qiu.h(aktp.ah(new kut(this, 8), this.c));
    }
}
