package defpackage;

import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.ConnectionStateEventParcelable;
import com.google.android.gms.wearable.internal.ConsentResponse;
import com.google.android.gms.wearable.internal.IRpcResponseCallback;
import com.google.android.gms.wearable.internal.IWearableListener;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeMigratedEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import com.google.android.gms.wearable.internal.RestoreCompletedEventParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ackn extends IWearableListener.Stub {
    public final /* synthetic */ acko a;
    private volatile int b = -1;

    public ackn(acko ackoVar) {
        this.a = ackoVar;
    }

    public static final void a(IRpcResponseCallback iRpcResponseCallback, boolean z, byte[] bArr) {
        try {
            iRpcResponseCallback.onResponse(z, bArr);
        } catch (RemoteException e) {
            Log.e("WearableLS", "Failed to send a response back", e);
        }
    }

    private final boolean b(Runnable runnable, String str, Object obj) {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", String.format("%s: %s %s", str, this.a.F.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.b) {
            if (acly.a(this.a).b() && abvk.l(this.a, callingUid, "com.google.android.wearable.app.cn")) {
                this.b = callingUid;
            } else if (abvk.k(this.a, callingUid)) {
                this.b = callingUid;
            } else {
                Log.e("WearableLS", a.bV(callingUid, "Caller is not GooglePlayServices; caller UID: "));
                return false;
            }
        }
        synchronized (this.a.I) {
            acko ackoVar = this.a;
            if (ackoVar.J) {
                return false;
            }
            ackoVar.G.post(runnable);
            return true;
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onChannelEvent(ChannelEventParcelable channelEventParcelable) {
        b(new acaj(this, channelEventParcelable, 14, (char[]) null), "onChannelEvent", channelEventParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onConnectedCapabilityChanged(CapabilityInfoParcelable capabilityInfoParcelable) {
        b(new zth(10), "onConnectedCapabilityChanged", capabilityInfoParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onConnectedNodes(List<NodeParcelable> list) {
        b(new zth(9), "onConnectedNodes", list);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onDataChanged(DataHolder dataHolder) {
        try {
            if (!b(new acaj(this, dataHolder, 12), "onDataItemChanged", String.valueOf(dataHolder) + ", rows=" + dataHolder.h)) {
            }
        } finally {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onEntityUpdate(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
        b(new zth(12), "onEntityUpdate", amsEntityUpdateParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onMessageReceived(MessageEventParcelable messageEventParcelable) {
        b(new acaj(this, messageEventParcelable, 13, (char[]) null), "onMessageReceived", messageEventParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onNodeMigrated(NodeMigratedEventParcelable nodeMigratedEventParcelable) {
        if (!b(new acbq(nodeMigratedEventParcelable, 5), "onNodeMigrated", "DataHolder[rows=" + nodeMigratedEventParcelable.b.h + "]")) {
            nodeMigratedEventParcelable.b.close();
        }
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onNotificationReceived(AncsNotificationParcelable ancsNotificationParcelable) {
        b(new zth(11), "onNotificationReceived", ancsNotificationParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onPeerConnected(NodeParcelable nodeParcelable) {
        b(new zth(7), "onPeerConnected", nodeParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onPeerDisconnected(NodeParcelable nodeParcelable) {
        b(new zth(8), "onPeerDisconnected", nodeParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onRequestReceived(MessageEventParcelable messageEventParcelable, IRpcResponseCallback iRpcResponseCallback) {
        b(new aauq(this, messageEventParcelable, iRpcResponseCallback, 10, (char[]) null), "onRequestReceived", messageEventParcelable);
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onConnectionStateChanged(ConnectionStateEventParcelable connectionStateEventParcelable) {
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onConsentChanged(ConsentResponse consentResponse) {
    }

    @Override // com.google.android.gms.wearable.internal.IWearableListener
    public final void onRestoreCompleted(RestoreCompletedEventParcelable restoreCompletedEventParcelable) {
    }
}
