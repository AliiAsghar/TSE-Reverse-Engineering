package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.IRpcResponseCallback;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IWearableListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IWearableListener {
        static final int TRANSACTION_onChannelEvent = 7;
        static final int TRANSACTION_onConnectedCapabilityChanged = 8;
        static final int TRANSACTION_onConnectedNodes = 5;
        static final int TRANSACTION_onConnectionStateChanged = 15;
        static final int TRANSACTION_onConsentChanged = 14;
        static final int TRANSACTION_onDataChanged = 1;
        static final int TRANSACTION_onEntityUpdate = 9;
        static final int TRANSACTION_onMessageReceived = 2;
        static final int TRANSACTION_onNodeMigrated = 16;
        static final int TRANSACTION_onNotificationReceived = 6;
        static final int TRANSACTION_onPeerConnected = 3;
        static final int TRANSACTION_onPeerDisconnected = 4;
        static final int TRANSACTION_onRequestReceived = 13;
        static final int TRANSACTION_onRestoreCompleted = 17;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IWearableListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wearable.internal.IWearableListener");
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onChannelEvent(ChannelEventParcelable channelEventParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, channelEventParcelable);
                transactOneway(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onConnectedCapabilityChanged(CapabilityInfoParcelable capabilityInfoParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, capabilityInfoParcelable);
                transactOneway(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onConnectedNodes(List<NodeParcelable> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onConnectionStateChanged(ConnectionStateEventParcelable connectionStateEventParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, connectionStateEventParcelable);
                transactOneway(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onConsentChanged(ConsentResponse consentResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, consentResponse);
                transactOneway(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onDataChanged(DataHolder dataHolder) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, dataHolder);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onEntityUpdate(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, amsEntityUpdateParcelable);
                transactOneway(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onMessageReceived(MessageEventParcelable messageEventParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, messageEventParcelable);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onNodeMigrated(NodeMigratedEventParcelable nodeMigratedEventParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, nodeMigratedEventParcelable);
                transactOneway(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onNotificationReceived(AncsNotificationParcelable ancsNotificationParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, ancsNotificationParcelable);
                transactOneway(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onPeerConnected(NodeParcelable nodeParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, nodeParcelable);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onPeerDisconnected(NodeParcelable nodeParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, nodeParcelable);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onRequestReceived(MessageEventParcelable messageEventParcelable, IRpcResponseCallback iRpcResponseCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, messageEventParcelable);
                iax.f(obtainAndWriteInterfaceToken, iRpcResponseCallback);
                transactOneway(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableListener
            public void onRestoreCompleted(RestoreCompletedEventParcelable restoreCompletedEventParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, restoreCompletedEventParcelable);
                transactOneway(17, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.wearable.internal.IWearableListener");
        }

        public static IWearableListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (queryLocalInterface instanceof IWearableListener) {
                return (IWearableListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    DataHolder dataHolder = (DataHolder) iax.a(parcel, DataHolder.CREATOR);
                    enforceNoDataAvail(parcel);
                    onDataChanged(dataHolder);
                    return true;
                case 2:
                    MessageEventParcelable messageEventParcelable = (MessageEventParcelable) iax.a(parcel, MessageEventParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onMessageReceived(messageEventParcelable);
                    return true;
                case 3:
                    NodeParcelable nodeParcelable = (NodeParcelable) iax.a(parcel, NodeParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPeerConnected(nodeParcelable);
                    return true;
                case 4:
                    NodeParcelable nodeParcelable2 = (NodeParcelable) iax.a(parcel, NodeParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPeerDisconnected(nodeParcelable2);
                    return true;
                case 5:
                    ArrayList createTypedArrayList = parcel.createTypedArrayList(NodeParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onConnectedNodes(createTypedArrayList);
                    return true;
                case 6:
                    AncsNotificationParcelable ancsNotificationParcelable = (AncsNotificationParcelable) iax.a(parcel, AncsNotificationParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onNotificationReceived(ancsNotificationParcelable);
                    return true;
                case 7:
                    ChannelEventParcelable channelEventParcelable = (ChannelEventParcelable) iax.a(parcel, ChannelEventParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onChannelEvent(channelEventParcelable);
                    return true;
                case 8:
                    CapabilityInfoParcelable capabilityInfoParcelable = (CapabilityInfoParcelable) iax.a(parcel, CapabilityInfoParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onConnectedCapabilityChanged(capabilityInfoParcelable);
                    return true;
                case 9:
                    AmsEntityUpdateParcelable amsEntityUpdateParcelable = (AmsEntityUpdateParcelable) iax.a(parcel, AmsEntityUpdateParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onEntityUpdate(amsEntityUpdateParcelable);
                    return true;
                case 10:
                case 11:
                case 12:
                default:
                    return false;
                case 13:
                    MessageEventParcelable messageEventParcelable2 = (MessageEventParcelable) iax.a(parcel, MessageEventParcelable.CREATOR);
                    IRpcResponseCallback asInterface = IRpcResponseCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    onRequestReceived(messageEventParcelable2, asInterface);
                    return true;
                case 14:
                    ConsentResponse consentResponse = (ConsentResponse) iax.a(parcel, ConsentResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onConsentChanged(consentResponse);
                    return true;
                case 15:
                    ConnectionStateEventParcelable connectionStateEventParcelable = (ConnectionStateEventParcelable) iax.a(parcel, ConnectionStateEventParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onConnectionStateChanged(connectionStateEventParcelable);
                    return true;
                case 16:
                    NodeMigratedEventParcelable nodeMigratedEventParcelable = (NodeMigratedEventParcelable) iax.a(parcel, NodeMigratedEventParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onNodeMigrated(nodeMigratedEventParcelable);
                    return true;
                case 17:
                    RestoreCompletedEventParcelable restoreCompletedEventParcelable = (RestoreCompletedEventParcelable) iax.a(parcel, RestoreCompletedEventParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRestoreCompleted(restoreCompletedEventParcelable);
                    return true;
            }
        }
    }

    void onChannelEvent(ChannelEventParcelable channelEventParcelable);

    void onConnectedCapabilityChanged(CapabilityInfoParcelable capabilityInfoParcelable);

    void onConnectedNodes(List<NodeParcelable> list);

    void onConnectionStateChanged(ConnectionStateEventParcelable connectionStateEventParcelable);

    void onConsentChanged(ConsentResponse consentResponse);

    void onDataChanged(DataHolder dataHolder);

    void onEntityUpdate(AmsEntityUpdateParcelable amsEntityUpdateParcelable);

    void onMessageReceived(MessageEventParcelable messageEventParcelable);

    void onNodeMigrated(NodeMigratedEventParcelable nodeMigratedEventParcelable);

    void onNotificationReceived(AncsNotificationParcelable ancsNotificationParcelable);

    void onPeerConnected(NodeParcelable nodeParcelable);

    void onPeerDisconnected(NodeParcelable nodeParcelable);

    void onRequestReceived(MessageEventParcelable messageEventParcelable, IRpcResponseCallback iRpcResponseCallback);

    void onRestoreCompleted(RestoreCompletedEventParcelable restoreCompletedEventParcelable);
}
