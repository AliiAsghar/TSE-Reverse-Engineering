package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.IWearableListener;
import defpackage.abhg;
import defpackage.absy;
import defpackage.acdz;
import defpackage.acft;
import defpackage.acjv;
import defpackage.acjx;
import defpackage.acjz;
import defpackage.ackh;
import defpackage.acko;
import defpackage.aclx;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WearableListenerStubImpl<T> extends IWearableListener.Stub {
    private absy a;
    private absy b;
    private absy c;
    private absy d;
    private absy e;
    private absy f;
    private absy g;
    private absy h;
    private absy i;
    private absy j;
    private absy k;
    private absy l;
    private absy m;
    private final IntentFilter[] n;
    private final String o;

    /* renamed from: -$$Nest$smsendNullResponse */
    public static /* bridge */ /* synthetic */ void m205$$Nest$smsendNullResponse(IRpcResponseCallback iRpcResponseCallback) {
        b(iRpcResponseCallback, false, null);
    }

    /* renamed from: -$$Nest$smsendResponse */
    public static /* bridge */ /* synthetic */ void m206$$Nest$smsendResponse(IRpcResponseCallback iRpcResponseCallback, boolean z, byte[] bArr) {
        b(iRpcResponseCallback, z, bArr);
    }

    private WearableListenerStubImpl(IntentFilter[] intentFilterArr, String str) {
        abhg.m(intentFilterArr);
        this.n = intentFilterArr;
        this.o = str;
    }

    private static void a(absy absyVar) {
        if (absyVar != null) {
            absyVar.a();
        }
    }

    public static void b(IRpcResponseCallback iRpcResponseCallback, boolean z, byte[] bArr) {
        try {
            iRpcResponseCallback.onResponse(z, bArr);
        } catch (RemoteException e) {
            Log.e("WearableListenerStub", "Failed to send a response back", e);
        }
    }

    public static WearableListenerStubImpl<acko> forAms(absy<? extends acko> absyVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<acko> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        abhg.m(absyVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).a = absyVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<acko> forAncs(absy<? extends acko> absyVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<acko> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        abhg.m(absyVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).b = absyVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<acko> forCapability(absy<? extends acko> absyVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<acko> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        abhg.m(absyVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).i = absyVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<acjv> forChannel(absy<? extends acjv> absyVar, String str, IntentFilter[] intentFilterArr) {
        abhg.m(str);
        WearableListenerStubImpl<acjv> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, str);
        abhg.m(absyVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).h = absyVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<acjx> forConnectionStateChange(absy<? extends acjx> absyVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<acjx> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        abhg.m(absyVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).k = absyVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<acjz> forConsent(absy<? extends acjz> absyVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<acjz> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        abhg.m(absyVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).j = absyVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<acko> forData(absy<? extends acko> absyVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<acko> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        abhg.m(absyVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).c = absyVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<acko> forMessage(absy<? extends acko> absyVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<acko> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        abhg.m(absyVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).d = absyVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<acko> forNode(absy<? extends acko> absyVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<acko> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        abhg.m(absyVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).f = absyVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<acko> forNodeMigrated(absy<? extends acko> absyVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<acko> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        abhg.m(absyVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).l = absyVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<acko> forOnConnectedNodes(absy<? extends acko> absyVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<acko> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        abhg.m(absyVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).g = absyVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<acko> forRequest(absy<? extends acko> absyVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<acko> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        abhg.m(absyVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).e = absyVar;
        return wearableListenerStubImpl;
    }

    public static WearableListenerStubImpl<ackh> forRestoreCompleted(absy<? extends ackh> absyVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<ackh> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        abhg.m(absyVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).m = absyVar;
        return wearableListenerStubImpl;
    }

    public void clear() {
        a(this.a);
        this.a = null;
        a(this.b);
        this.b = null;
        a(this.c);
        this.c = null;
        a(this.d);
        this.d = null;
        a(this.e);
        this.e = null;
        a(this.f);
        this.f = null;
        a(this.g);
        this.g = null;
        a(this.h);
        this.h = null;
        a(this.i);
        this.i = null;
        a(this.j);
        this.j = null;
        a(this.k);
        this.k = null;
        a(this.l);
        this.l = null;
        a(this.m);
        this.m = null;
    }

    public String getChannelToken() {
        return this.o;
    }

    public IntentFilter[] getFilters() {
        return this.n;
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onChannelEvent(ChannelEventParcelable channelEventParcelable) {
        absy absyVar = this.h;
        if (absyVar != null) {
            absyVar.b(new acdz(channelEventParcelable, 8));
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onConnectedCapabilityChanged(CapabilityInfoParcelable capabilityInfoParcelable) {
        absy absyVar = this.i;
        if (absyVar != null) {
            absyVar.b(new acft(4));
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onConnectedNodes(List<NodeParcelable> list) {
        absy absyVar = this.g;
        if (absyVar != null) {
            absyVar.b(new acft(12));
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onConnectionStateChanged(ConnectionStateEventParcelable connectionStateEventParcelable) {
        absy absyVar = this.k;
        if (absyVar != null) {
            absyVar.b(new acft(6));
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onConsentChanged(ConsentResponse consentResponse) {
        absy absyVar = this.j;
        if (absyVar != null) {
            absyVar.b(new acft(5));
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onDataChanged(DataHolder dataHolder) {
        absy absyVar = this.c;
        if (absyVar != null) {
            absyVar.b(new acdz(dataHolder, 6));
        } else {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onEntityUpdate(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
        absy absyVar = this.a;
        if (absyVar != null) {
            absyVar.b(new acft(9));
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onMessageReceived(MessageEventParcelable messageEventParcelable) {
        absy absyVar = this.d;
        if (absyVar != null) {
            absyVar.b(new acdz(messageEventParcelable, 7));
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onNodeMigrated(NodeMigratedEventParcelable nodeMigratedEventParcelable) {
        absy absyVar = this.l;
        if (absyVar != null) {
            String str = nodeMigratedEventParcelable.a;
            absyVar.b(new acdz(nodeMigratedEventParcelable.b, 5));
        } else {
            nodeMigratedEventParcelable.b.close();
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onNotificationReceived(AncsNotificationParcelable ancsNotificationParcelable) {
        absy absyVar = this.b;
        if (absyVar != null) {
            absyVar.b(new acft(8));
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onPeerConnected(NodeParcelable nodeParcelable) {
        absy absyVar = this.f;
        if (absyVar != null) {
            absyVar.b(new acft(10));
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onPeerDisconnected(NodeParcelable nodeParcelable) {
        absy absyVar = this.f;
        if (absyVar != null) {
            absyVar.b(new acft(11));
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onRequestReceived(MessageEventParcelable messageEventParcelable, IRpcResponseCallback iRpcResponseCallback) {
        absy absyVar = this.e;
        if (absyVar != null) {
            absyVar.b(new aclx(messageEventParcelable, iRpcResponseCallback));
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public void onRestoreCompleted(RestoreCompletedEventParcelable restoreCompletedEventParcelable) {
        absy absyVar = this.m;
        if (absyVar != null) {
            absyVar.b(new acft(7));
        }
    }

    public static WearableListenerStubImpl<acjv> forChannel(absy<? extends acjv> absyVar, IntentFilter[] intentFilterArr) {
        WearableListenerStubImpl<acjv> wearableListenerStubImpl = new WearableListenerStubImpl<>(intentFilterArr, null);
        abhg.m(absyVar);
        ((WearableListenerStubImpl) wearableListenerStubImpl).h = absyVar;
        return wearableListenerStubImpl;
    }
}
