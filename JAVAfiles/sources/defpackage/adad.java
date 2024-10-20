package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.android.ims.rcsservice.locationsharing.LocationSharingResult;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adad implements ahbz, adjr {
    public final Context a;
    public final acno b;
    public final adta c;
    final acua d;
    private final Map e = new HashMap();
    private final adqs f;
    private final aduo g;
    private final aduu h;
    private final adae i;

    public adad(Context context, adqs adqsVar, aduo aduoVar, acno acnoVar, aduu aduuVar, adta adtaVar, adae adaeVar) {
        this.a = context;
        this.f = adqsVar;
        this.g = aduoVar;
        this.b = acnoVar;
        this.h = aduuVar;
        this.c = adtaVar;
        this.i = adaeVar;
        acnl acnlVar = new acnl(this, 6);
        this.d = acnlVar;
        acnoVar.w("application/vnd.gsma.rcspushlocation+xml", acnlVar);
    }

    @Override // defpackage.ahbz
    public final LocationSharingResult a(long j, String str, LocationInformation locationInformation, String str2) {
        advr.c("Pushing location via chat, request ID = %d", Long.valueOf(j));
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = agkx.ah();
            }
            return new LocationSharingResult(j, str, this.b.e(str, b(locationInformation), "application/vnd.gsma.rcspushlocation+xml", str2).getCode(), null, str2);
        } catch (IOException e) {
            String str3 = str2;
            advr.i(e, "Error while pushing location information", new Object[0]);
            return new LocationSharingResult(j, str, 1, null, str3);
        }
    }

    final byte[] b(LocationInformation locationInformation) {
        return this.i.a(this.f.a(), locationInformation);
    }

    @Override // defpackage.ahbz
    public final long[] c() {
        return adom.p(this.e.keySet());
    }

    @Override // defpackage.ahbz
    public final LocationSharingResult[] d(long j, LocationInformation locationInformation, String str) {
        String str2;
        advr.c("Push location to group via chat, session ID = %d", Long.valueOf(j));
        if (this.g.a(j).isEmpty()) {
            return actt.j(9, "Session does not exist or is not a group chat session");
        }
        try {
            if (TextUtils.isEmpty(str)) {
                str2 = agkx.ah();
            } else {
                str2 = str;
            }
            return new LocationSharingResult[]{new LocationSharingResult(this.h.c(), " ", this.b.d(j, str2, "application/vnd.gsma.rcspushlocation+xml", b(locationInformation)).getCode(), null, str2)};
        } catch (IOException e) {
            advr.i(e, "Error while pushing location information", new Object[0]);
            return actt.j(1, e.getMessage());
        }
    }

    @Override // defpackage.adjr
    public final /* synthetic */ void u(Configuration configuration) {
    }
}
