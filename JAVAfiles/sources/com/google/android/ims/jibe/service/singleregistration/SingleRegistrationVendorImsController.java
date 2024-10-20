package com.google.android.ims.jibe.service.singleregistration;

import android.telephony.ims.ImsException;
import com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController;
import com.google.android.ims.rcs.singleregistration.SingleRegistrationVendorImsServiceResult;
import defpackage.adij;
import defpackage.adtl;
import defpackage.advr;
import defpackage.apgi;
import defpackage.aphf;
import defpackage.apuv;
import defpackage.zbk;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SingleRegistrationVendorImsController extends ISingleRegistrationVendorImsController.Stub {
    private final adtl a;
    private final adij b;
    private final Map c = new ConcurrentHashMap();

    public SingleRegistrationVendorImsController(adtl adtlVar, adij adijVar) {
        this.a = adtlVar;
        this.b = adijVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [adtm, java.lang.Object] */
    @Override // com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController
    public SingleRegistrationVendorImsServiceResult setupVendorIms(int i) {
        int code;
        Optional i2 = this.a.a.i(i);
        if (i2.isEmpty()) {
            advr.q("[SR]: SimId was not found in SimInfoProvider for subId: %d", Integer.valueOf(i));
            return new SingleRegistrationVendorImsServiceResult(28);
        }
        Map map = this.c;
        Integer valueOf = Integer.valueOf(i);
        zbk zbkVar = (zbk) map.get(valueOf);
        Object obj = i2.get();
        if (zbkVar == null) {
            zbkVar = this.b.a((String) obj, i);
        }
        try {
            zbkVar.j(new apuv(this.c, i, zbkVar));
            this.c.put(valueOf, zbkVar);
            advr.k("[SR]: Vendor IMS was setup successfully for subId: %d", valueOf);
            return new SingleRegistrationVendorImsServiceResult(0);
        } catch (ImsException e) {
            advr.i(e, "[SR]: Failed to setup Vendor IMS for subId: %d", Integer.valueOf(i));
            code = e.getCode();
            return new SingleRegistrationVendorImsServiceResult(30, apgi.b(code));
        } catch (SecurityException e2) {
            advr.i(e2, "[SR]: Failed to setup Vendor IMS for subId: %d", Integer.valueOf(i));
            return new SingleRegistrationVendorImsServiceResult(30, aphf.FAILURE_REASON_SECURITY_EXCEPTION);
        }
    }

    @Override // com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController
    public SingleRegistrationVendorImsServiceResult terminateVendorIms(int i) {
        int code;
        Map map = this.c;
        Integer valueOf = Integer.valueOf(i);
        zbk zbkVar = (zbk) map.remove(valueOf);
        if (zbkVar != null) {
            try {
                zbkVar.i();
                advr.k("[SR]: Vendor IMS was setup for subId: %d. Terminated the callback.", valueOf);
            } catch (ImsException e) {
                advr.i(e, "[SR]: Failed to terminate Vendor IMS for subId: %d", Integer.valueOf(i));
                code = e.getCode();
                return new SingleRegistrationVendorImsServiceResult(30, apgi.b(code));
            } catch (SecurityException e2) {
                advr.i(e2, "[SR]: Failed to terminate Vendor IMS for subId: %d", Integer.valueOf(i));
                return new SingleRegistrationVendorImsServiceResult(30, aphf.FAILURE_REASON_SECURITY_EXCEPTION);
            }
        } else {
            advr.k("[SR]: Vendor IMS was not setup for subId: %d.", valueOf);
        }
        return new SingleRegistrationVendorImsServiceResult(0);
    }
}
