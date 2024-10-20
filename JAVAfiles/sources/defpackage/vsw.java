package defpackage;

import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult;
import com.google.android.rcs.client.messaging.GetGroupNotificationsRequest;
import com.google.android.rcs.client.messaging.GetMessagesRequest;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vsw implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ vsw(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        int i = 4;
        int i2 = 3;
        switch (this.a) {
            case 0:
                vsz.a.n("RcsServiceConnectionException was raised while waiting to connect to RcsEngineLifecycleServiceV2", (ylp) obj);
                return new RcsEngineLifecycleServiceResult(1);
            case 1:
                vsz.a.n("SecurityException was raised while waiting to connect to RcsEngineLifecycleServiceV2", (SecurityException) obj);
                return new RcsEngineLifecycleServiceResult(1);
            case 2:
                vsz.a.n("TimeoutException was raised while waiting to connect to RcsEngineLifecycleServiceV2", (TimeoutException) obj);
                return new RcsEngineLifecycleServiceResult(14);
            case 3:
                StringBuilder sb = new StringBuilder("Section: rcs_psd\n");
                Collection.EL.stream((List) obj).sorted(Comparator.CC.comparing(new vrx(9), String.CASE_INSENSITIVE_ORDER)).forEach(new vra(sb, 18));
                return sb.toString();
            case 4:
                List list = (List) obj;
                list.add(new FileTeleporter(aczf.o().j().getBytes(), "CsLibSettings"));
                list.add(new FileTeleporter(aczm.a().j().getBytes(), "MultiSimSettings"));
                list.add(new FileTeleporter(aczy.a().j().getBytes(), "SimStateTrackerSettings"));
                list.add(new FileTeleporter(acyy.a().j().getBytes(), "CsLibAllowSwitchFlags"));
                return list;
            case 5:
                return upm.b();
            case 6:
                vuo.a.r("Failed to log group name change timeout.", (Exception) obj);
                return null;
            case 7:
                vuo.a.r("Failed to log group name change response.", (Exception) obj);
                return null;
            case 8:
                vuo.a.r("Failed to log group rename notify event.", (Exception) obj);
                return null;
            case 9:
                qef b = qef.b(((qeg) obj).c);
                if (b == null) {
                    b = qef.UNKNOWN_STATUS;
                }
                int ordinal = b.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    return vus.SERVER_RETURNED_UNSUCCESSFUL;
                                }
                            } else {
                                return vus.CLIENT_FAILED_TO_SEND_REQUEST;
                            }
                        }
                    } else {
                        return vus.SUCCESS;
                    }
                }
                return vus.UNKNOWN_RESULT;
            case 10:
                alwo alwoVar = vwv.b;
                return (qei) ((Optional) obj).orElseThrow(new vtc(i2));
            case 11:
                alwo alwoVar2 = vwv.b;
                return (qei) ((Optional) obj).orElseThrow(new vtc(i));
            case 12:
                xyo e = vyd.a.e();
                e.H("Cannot get recipient limbo message count because OnlineStatus query failed");
                e.r((psx) obj);
                return 0;
            case 13:
                return null;
            case 14:
                return new gsw();
            case 15:
                return ((RcsMessagingService) obj).getMessages(GetMessagesRequest.a);
            case 16:
                return ((RcsMessagingService) obj).getGroupNotifications(GetGroupNotificationsRequest.a);
            case 17:
                upm upmVar = (upm) obj;
                if (upmVar.a) {
                    xyo a = vyp.a.a();
                    a.H("GetMessagesMethod processing done.");
                    a.q();
                } else {
                    xyo e2 = vyp.a.e();
                    e2.H("GetMessagesMethod processing failed");
                    e2.A("isRetryable", upmVar.b);
                    e2.q();
                }
                return null;
            case 18:
                return vzo.e((qeg) obj);
            case 19:
                return vzo.e((qeg) obj);
            default:
                return vzo.f((qeg) obj);
        }
    }
}
