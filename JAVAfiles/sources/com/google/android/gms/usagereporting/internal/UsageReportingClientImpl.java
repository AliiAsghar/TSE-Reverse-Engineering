package com.google.android.gms.usagereporting.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.ElCapitanOptions;
import com.google.android.gms.usagereporting.SafetyOptions;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks;
import com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener;
import com.google.android.gms.usagereporting.internal.IUsageReportingService;
import defpackage.abre;
import defpackage.abrf;
import defpackage.abrz;
import defpackage.absy;
import defpackage.abua;
import defpackage.abug;
import defpackage.acft;
import defpackage.acja;
import defpackage.acji;
import defpackage.acjl;
import defpackage.acjn;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class UsageReportingClientImpl extends abug {
    private final AtomicReference a;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static class AbstractCallbacks extends IUsageReportingCallbacks.Stub {
        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onCanLog(Status status, boolean z, ConsentInformation consentInformation) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onCheckConsents(Status status, ConsentInformation consentInformation) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onGetAppWhitelist(Status status, List<String> list) {
            throw new IllegalStateException("Not implemented.");
        }

        public void onGetCheckboxSettingsPendingIntent(PendingIntent pendingIntent) {
            throw new IllegalStateException("Not implemented");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onGetElCapitanOptions(Status status, ElCapitanOptions elCapitanOptions) {
            throw new IllegalStateException("Not implemented.");
        }

        public void onGetOptInOptions(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onGetPassedWhitelists(Status status, ConsentInformation consentInformation) {
            throw new IllegalStateException("Not implemented");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onGetSafetyOptions(Status status, SafetyOptions safetyOptions) {
            throw new IllegalStateException("Not implemented.");
        }

        public void onRegisterOptInOptionsChangedListener(Status status) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onSetAppWhitelist(Status status) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onSetElCapitanOptions(Status status) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onSetOptInOptions(Status status) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onSetSafetyOptions(Status status) {
            throw new IllegalStateException("Not implemented.");
        }

        public void onUnregisterOptInOptionsChangedListener(Status status) {
            throw new IllegalStateException("Not implemented.");
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static class CanLogCallbacks extends AbstractCallbacks {
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static final class UsageReportingOptInOptionsChangedListener extends IUsageReportingOptInOptionsChangedListener.Stub {
        private final absy a;

        public UsageReportingOptInOptionsChangedListener(absy<acji> absyVar) {
            this.a = absyVar;
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener
        public void onOptInOptionsChanged() {
            this.a.b(new acft(3));
        }
    }

    public UsageReportingClientImpl(Context context, Looper looper, abua abuaVar, abre abreVar, abrf abrfVar) {
        super(context, looper, 41, abuaVar, abreVar, abrfVar);
        this.a = new AtomicReference();
    }

    public final void K(UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener, UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener2, abrz abrzVar) {
        acjn acjnVar = new acjn((IUsageReportingService) w(), abrzVar, usageReportingOptInOptionsChangedListener2);
        if (usageReportingOptInOptionsChangedListener != null) {
            ((IUsageReportingService) w()).unregisterOptInOptionsChangedListenerConnectionless(usageReportingOptInOptionsChangedListener, acjnVar);
        } else if (usageReportingOptInOptionsChangedListener2 == null) {
            abrzVar.c(Status.a);
        } else {
            ((IUsageReportingService) w()).registerOptInOptionsChangedListener(usageReportingOptInOptionsChangedListener2, acjnVar);
        }
    }

    @Override // defpackage.abug, com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final int a() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IUsageReportingService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gn() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] go() {
        return acja.f;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.abqz
    public final void n() {
        try {
            UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener = (UsageReportingOptInOptionsChangedListener) this.a.getAndSet(null);
            if (usageReportingOptInOptionsChangedListener != null) {
                ((IUsageReportingService) w()).unregisterOptInOptionsChangedListener(usageReportingOptInOptionsChangedListener, new acjl());
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.n();
    }
}
