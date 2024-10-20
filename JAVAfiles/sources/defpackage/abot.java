package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.auth.account.data.IGoogleAuthService;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.IClearcutLoggerService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.service.IClientTelemetryService;
import com.google.android.gms.kids.TrustedContactsRequest;
import com.google.android.gms.kids.internal.AbstractKidsCallbacks;
import com.google.android.gms.kids.internal.IParentalControlsService;
import com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService;
import com.google.android.gms.phenotype.internal.IPhenotypeService;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.android.gms.search.queries.internal.ISearchQueriesService;
import com.google.android.gms.search.queries.internal.SearchQueriesCallbacks;
import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;
import defpackage.abhb;
import defpackage.aqjn;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abot implements abtf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ abot(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v10, types: [com.google.android.gms.kids.internal.IParentalControlsListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [com.google.android.gms.kids.internal.IParentalControlsListener, java.lang.Object] */
    @Override // defpackage.abtf
    public final void a(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((IClearcutLoggerService) ((aboz) obj).w()).logError(new abov((acit) obj2), (BatchedLogErrorParcelable) this.a);
                return;
            case 1:
                ((IGoogleAuthService) ((abkz) obj).w()).clearToken(new ablc((acit) obj2), (ClearTokenRequest) this.a);
                return;
            case 2:
                int i = abux.a;
                ((IClientTelemetryService) ((abuy) obj).w()).recordData((TelemetryData) this.a);
                ((acit) obj2).b(null);
                return;
            case 3:
                final List<Uri> ax = aqjn.ax(this.a);
                final acit acitVar = (acit) obj2;
                ((IParentalControlsService) ((accf) obj).w()).areAllowed(ax, new AbstractKidsCallbacks() { // from class: com.google.android.gms.kids.internal.InternalParentalControlsClient$areAllowed$1$1$1
                    @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
                    public void onBooleanList(Status status, List<Boolean> list) {
                        status.getClass();
                        list.getClass();
                        abhb.d(status, aqjn.q(aqjn.aA(ax, list)), acitVar);
                    }
                });
                return;
            case 4:
                final acit acitVar2 = (acit) obj2;
                ((IParentalControlsService) ((accf) obj).w()).registerParentalControlsListener(this.a, new AbstractKidsCallbacks() { // from class: com.google.android.gms.kids.internal.InternalParentalControlsClient$registerParentalControlsListener$1$registrationMethods$1$1
                    @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
                    public void onStatus(Status status) {
                        status.getClass();
                        abhb.c(status, acitVar2);
                    }
                });
                return;
            case 5:
                final acit acitVar3 = (acit) obj2;
                ((IParentalControlsService) ((accf) obj).w()).unregisterParentalControlsListener(this.a, new AbstractKidsCallbacks() { // from class: com.google.android.gms.kids.internal.InternalParentalControlsClient$registerParentalControlsListener$1$registrationMethods$2$1
                    @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
                    public void onBoolean(Status status, boolean z) {
                        status.getClass();
                        onStatus(status);
                    }

                    @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
                    public void onStatus(Status status) {
                        status.getClass();
                        abhb.d(status, true, acitVar3);
                    }
                });
                return;
            case 6:
                final acit acitVar4 = (acit) obj2;
                ((IParentalControlsService) ((accf) obj).w()).requestTrustedContactsPendingIntent((TrustedContactsRequest) this.a, new AbstractKidsCallbacks() { // from class: com.google.android.gms.kids.internal.InternalParentalControlsClient$requestTrustedContactsPendingIntent$1$1$1
                    @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
                    public void onPendingIntent(Status status, PendingIntent pendingIntent) {
                        status.getClass();
                        abhb.d(status, pendingIntent, acitVar4);
                    }
                });
                return;
            case 7:
                try {
                    ((IContactsSyncThirdPartyService) ((acfq) obj).w()).getDeviceContactsSyncSettingAction(new acfw((Context) this.a, (acit) obj2));
                    return;
                } catch (RemoteException e) {
                    ((acit) obj2).c(e);
                    return;
                }
            case 8:
                ((IContactsSyncThirdPartyService) ((acfq) obj).w()).addDeviceContactsSyncSettingChangedListener(new acfu((absy) this.a));
                return;
            case 9:
                ((IPhenotypeService) ((acgq) obj).w()).getExperimentsForLogging(new acgk((acit) obj2), (String) this.a, null);
                return;
            case 10:
                ((IPhenotypeService) ((acgq) obj).w()).unRegister(new acgk((acit) obj2), (String) this.a);
                return;
            case 11:
                ((IPhenotypeService) ((acgq) obj).w()).commitToConfiguration(new acgk((acit) obj2), (String) this.a);
                return;
            case 12:
                ((IPhenotypeService) ((acgq) obj).w()).commitToConfigurationV2(new acgk((acit) obj2), ((aoyj) this.a).toByteArray());
                return;
            case 13:
                achq achqVar = (achq) obj;
                ((ISearchQueriesService) achqVar.w()).query((QueryCall$Request) this.a, new SearchQueriesCallbacks(achqVar, (acit) obj2));
                return;
            default:
                abrc abrcVar = (abrc) this.a;
                ((UsageReportingClientImpl) obj).K(((acjg) abrcVar.e).a, null, new acjd(abrcVar, (acit) obj2));
                return;
        }
    }
}
