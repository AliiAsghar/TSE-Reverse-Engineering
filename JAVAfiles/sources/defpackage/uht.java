package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers.RetrieveBrandPublicKeysWork;
import io.grpc.Status;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uht implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ uht(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        String str = "Bugle.VerifiedSms.KeyRotation.Failure";
        long j = 0;
        boolean z = false;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                ((Bundle) obj2).putBoolean("result_success_key", true);
                return obj2;
            case 1:
                ((uhg) this.a).b((alog) obj);
                return null;
            case 2:
                Object obj3 = this.a;
                Bundle bundle = (Bundle) obj3;
                bundle.putBoolean("result_success_key", true);
                bundle.putInt("preference_key", ((Integer) obj).intValue());
                return obj3;
            case 3:
                Object obj4 = this.a;
                Bundle bundle2 = (Bundle) obj4;
                bundle2.putBoolean("result_success_key", true);
                bundle2.putString("preference_key", (String) obj);
                return obj4;
            case 4:
                Long l = (Long) obj;
                Object obj5 = this.a;
                Bundle bundle3 = (Bundle) obj5;
                bundle3.putBoolean("result_success_key", true);
                if (l != null) {
                    j = l.longValue();
                }
                bundle3.putLong("preference_key", j);
                return obj5;
            case 5:
                Long l2 = (Long) obj;
                if (l2 != null) {
                    z = true;
                }
                Object obj6 = this.a;
                Bundle bundle4 = (Bundle) obj6;
                bundle4.putBoolean("result_success_key", z);
                if (l2 != null) {
                    j = l2.longValue();
                }
                bundle4.putLong("preference_key", j);
                return obj6;
            case 6:
                String str2 = (String) obj;
                if (TextUtils.isEmpty(str2)) {
                    xyo c = uhv.a.c();
                    c.H("Could not retrieve current RCS msisdn for TachyonPhoneDataService from RcsApplicationDataService.");
                    c.q();
                    return Optional.empty();
                }
                return Optional.of(((wyp) ((uhv) this.a).g.b()).D(str2));
            case 7:
                Object obj7 = this.a;
                ((Bundle) obj7).putBoolean("result_success_key", true);
                return obj7;
            case 8:
                Object obj8 = this.a;
                ((Bundle) obj8).putBoolean("result_success_key", true);
                return obj8;
            case 9:
                String str3 = (String) obj;
                if (TextUtils.isEmpty(str3)) {
                    xyo b = uhv.a.b();
                    b.H("Could mot retrieve current RCS msisdn for TachyonPhoneDataService from RcsApplicationDataService.");
                    b.q();
                    return Optional.empty();
                }
                return Optional.of(((wyp) ((uhv) this.a).g.b()).D(str3));
            case 10:
                Object obj9 = this.a;
                ((Bundle) obj9).putBoolean("result_success_key", true);
                return obj9;
            case 11:
                Optional map = ((Optional) obj).map(new ugo(19));
                Object obj10 = this.a;
                if (obj10 == null) {
                    obj10 = "";
                }
                return (String) map.orElse(obj10);
            case 12:
                Object obj11 = this.a;
                ((Bundle) obj11).putBoolean("result_success_key", true);
                return obj11;
            case 13:
                Object obj12 = this.a;
                Bundle bundle5 = (Bundle) obj12;
                bundle5.putBoolean("result_success_key", true);
                bundle5.putBoolean("preference_key", ((Boolean) obj).booleanValue());
                return obj12;
            case 14:
                Object obj13 = this.a;
                ((Bundle) obj13).putBoolean("result_success_key", true);
                return obj13;
            case 15:
                Bundle bundle6 = new Bundle();
                uim uimVar = (uim) this.a;
                bundle6.putCharArray("output_uri", uimVar.b.toString().toCharArray());
                bundle6.putInt("status", a.ao(uimVar.c()));
                String str4 = uimVar.e;
                if (str4 == null) {
                    str4 = "*/*";
                }
                bundle6.putCharArray("content_type", str4.toCharArray());
                upl a = upm.a();
                a.b(true);
                a.c(false);
                a.d(false);
                a.b = bundle6;
                return a.a();
            case 16:
                Boolean bool = (Boolean) obj;
                akrh e = aktp.e("ResizingJob::onFinished");
                try {
                    boolean booleanValue = bool.booleanValue();
                    Object obj14 = this.a;
                    if (booleanValue) {
                        ((uim) obj14).g = tql.SUCCEEDED;
                    } else {
                        uhl.j(((uim) obj14).f, ((uim) obj14).b);
                    }
                    alvw g = uim.a.g();
                    g.X(alwp.a, "BugleResizing");
                    ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingJob", "run", 74, "ResizingJob.java")).K("Finished %s, status: %s, contentUri: %s, outputUri: %s", obj14.getClass().getName(), ((uim) obj14).g, ((uim) obj14).c, ((uim) obj14).b);
                    e.close();
                    return bool;
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 17:
                Throwable th3 = (Throwable) obj;
                Object obj15 = this.a;
                gsi f = ((gsx) obj15).f();
                if (Status.c(th3).getCode() == Status.Code.NOT_FOUND) {
                    String d = f.d("vsms_retrieve_brand_keys_sender_id_key");
                    xyo e2 = ukd.a.e();
                    e2.H("Brand keys were not found for sender. Sanitizing sender and cancelling dependent work");
                    e2.L("sender id", d);
                    e2.r(th3);
                    if (!TextUtils.isEmpty(d)) {
                        ukh ukhVar = ((RetrieveBrandPublicKeysWork) obj15).e.b;
                        if (TextUtils.isEmpty(d)) {
                            ukh.a.q("Cannot sanitize sender for empty sender id");
                        } else {
                            sep a2 = ukhVar.f.a(d);
                            if (a2 == null) {
                                ukh.a.q("Sender ID is not VSMS brand.");
                            } else {
                                ukhVar.c.d(new rvz((Object) ukhVar, (Object) d, (Object) a2.a.k(), 16, (byte[]) null));
                            }
                        }
                    }
                    return new gsu();
                }
                ukd.a.r("Error in retrieving vsms brand keys", th3);
                ukd.a.o("Marking retrieve brand public keys work as retry.");
                return new gsv();
            case 18:
                if (true == Boolean.TRUE.equals((Boolean) obj)) {
                    str = "Bugle.VerifiedSms.KeyRotation.Success";
                }
                ((uki) this.a).e.c(str);
                return new gsw();
            case 19:
                Throwable th4 = (Throwable) obj;
                boolean contains = uki.b.contains(Status.c(th4).getCode());
                Object obj16 = this.a;
                if (contains) {
                    ((uki) obj16).e.c("Bugle.VerifiedSms.KeyRotation.Failure.Retriable");
                    uki.a.r("Error in the vSms Register gRPC. Scheduling a retry.", th4);
                    return new gsv();
                }
                uki.a.r("Error in the vSms Register gRPC. Scheduling failed with:", th4);
                uki ukiVar = (uki) obj16;
                ukiVar.e.c("Bugle.VerifiedSms.KeyRotation.Failure");
                ukiVar.e.c("Bugle.VerifiedSms.KeyRotation.FailureWRetries");
                return new gsu();
            default:
                return new gsw((gsi) this.a);
        }
    }
}
