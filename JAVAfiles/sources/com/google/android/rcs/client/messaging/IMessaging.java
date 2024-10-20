package com.google.android.rcs.client.messaging;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IMessaging extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static abstract class Stub extends BaseStub implements IMessaging {
        static final int TRANSACTION_addUserToGroup = 7;
        static final int TRANSACTION_createGroup = 5;
        static final int TRANSACTION_getGroupNotifications = 9;
        static final int TRANSACTION_getMessages = 4;
        static final int TRANSACTION_getServiceVersion = 1;
        static final int TRANSACTION_joinGroup = 6;
        static final int TRANSACTION_removeUserFromGroup = 8;
        static final int TRANSACTION_revokeMessage = 3;
        static final int TRANSACTION_sendMessage = 2;
        static final int TRANSACTION_triggerGroupNotification = 11;
        static final int TRANSACTION_updateGroup = 10;

        /* compiled from: PG */
        /* loaded from: classes4.dex */
        public static class Proxy extends BaseProxy implements IMessaging {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.rcs.client.messaging.IMessaging");
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest addUserToGroupRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, addUserToGroupRequest);
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
                AddUserToGroupResponse addUserToGroupResponse = (AddUserToGroupResponse) iax.a(transactAndReadException, AddUserToGroupResponse.CREATOR);
                transactAndReadException.recycle();
                return addUserToGroupResponse;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public CreateGroupResponse createGroup(CreateGroupRequest createGroupRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, createGroupRequest);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                CreateGroupResponse createGroupResponse = (CreateGroupResponse) iax.a(transactAndReadException, CreateGroupResponse.CREATOR);
                transactAndReadException.recycle();
                return createGroupResponse;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public GetGroupNotificationsResponse getGroupNotifications(GetGroupNotificationsRequest getGroupNotificationsRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getGroupNotificationsRequest);
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
                GetGroupNotificationsResponse getGroupNotificationsResponse = (GetGroupNotificationsResponse) iax.a(transactAndReadException, GetGroupNotificationsResponse.CREATOR);
                transactAndReadException.recycle();
                return getGroupNotificationsResponse;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public GetMessagesResponse getMessages(GetMessagesRequest getMessagesRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getMessagesRequest);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                GetMessagesResponse getMessagesResponse = (GetMessagesResponse) iax.a(transactAndReadException, GetMessagesResponse.CREATOR);
                transactAndReadException.recycle();
                return getMessagesResponse;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public int getServiceVersion() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public JoinGroupResponse joinGroup(JoinGroupRequest joinGroupRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, joinGroupRequest);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                JoinGroupResponse joinGroupResponse = (JoinGroupResponse) iax.a(transactAndReadException, JoinGroupResponse.CREATOR);
                transactAndReadException.recycle();
                return joinGroupResponse;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest removeUserFromGroupRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, removeUserFromGroupRequest);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                RemoveUserFromGroupResponse removeUserFromGroupResponse = (RemoveUserFromGroupResponse) iax.a(transactAndReadException, RemoveUserFromGroupResponse.CREATOR);
                transactAndReadException.recycle();
                return removeUserFromGroupResponse;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public RevokeMessageResponse revokeMessage(RevokeMessageRequest revokeMessageRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, revokeMessageRequest);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                RevokeMessageResponse revokeMessageResponse = (RevokeMessageResponse) iax.a(transactAndReadException, RevokeMessageResponse.CREATOR);
                transactAndReadException.recycle();
                return revokeMessageResponse;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public SendMessageResponse sendMessage(SendMessageRequest sendMessageRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, sendMessageRequest);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                SendMessageResponse sendMessageResponse = (SendMessageResponse) iax.a(transactAndReadException, SendMessageResponse.CREATOR);
                transactAndReadException.recycle();
                return sendMessageResponse;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public TriggerGroupNotificationResponse triggerGroupNotification(TriggerGroupNotificationRequest triggerGroupNotificationRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, triggerGroupNotificationRequest);
                Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken);
                TriggerGroupNotificationResponse triggerGroupNotificationResponse = (TriggerGroupNotificationResponse) iax.a(transactAndReadException, TriggerGroupNotificationResponse.CREATOR);
                transactAndReadException.recycle();
                return triggerGroupNotificationResponse;
            }

            @Override // com.google.android.rcs.client.messaging.IMessaging
            public UpdateGroupResponse updateGroup(UpdateGroupRequest updateGroupRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, updateGroupRequest);
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
                UpdateGroupResponse updateGroupResponse = (UpdateGroupResponse) iax.a(transactAndReadException, UpdateGroupResponse.CREATOR);
                transactAndReadException.recycle();
                return updateGroupResponse;
            }
        }

        public Stub() {
            super("com.google.android.rcs.client.messaging.IMessaging");
        }

        public static IMessaging asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.rcs.client.messaging.IMessaging");
            if (queryLocalInterface instanceof IMessaging) {
                return (IMessaging) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    int serviceVersion = getServiceVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(serviceVersion);
                    return true;
                case 2:
                    SendMessageRequest sendMessageRequest = (SendMessageRequest) iax.a(parcel, SendMessageRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    SendMessageResponse sendMessage = sendMessage(sendMessageRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, sendMessage);
                    return true;
                case 3:
                    RevokeMessageRequest revokeMessageRequest = (RevokeMessageRequest) iax.a(parcel, RevokeMessageRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    RevokeMessageResponse revokeMessage = revokeMessage(revokeMessageRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, revokeMessage);
                    return true;
                case 4:
                    GetMessagesRequest getMessagesRequest = (GetMessagesRequest) iax.a(parcel, GetMessagesRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    GetMessagesResponse messages = getMessages(getMessagesRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, messages);
                    return true;
                case 5:
                    CreateGroupRequest createGroupRequest = (CreateGroupRequest) iax.a(parcel, CreateGroupRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    CreateGroupResponse createGroup = createGroup(createGroupRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, createGroup);
                    return true;
                case 6:
                    JoinGroupRequest joinGroupRequest = (JoinGroupRequest) iax.a(parcel, JoinGroupRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    JoinGroupResponse joinGroup = joinGroup(joinGroupRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, joinGroup);
                    return true;
                case 7:
                    AddUserToGroupRequest addUserToGroupRequest = (AddUserToGroupRequest) iax.a(parcel, AddUserToGroupRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    AddUserToGroupResponse addUserToGroup = addUserToGroup(addUserToGroupRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, addUserToGroup);
                    return true;
                case 8:
                    RemoveUserFromGroupRequest removeUserFromGroupRequest = (RemoveUserFromGroupRequest) iax.a(parcel, RemoveUserFromGroupRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    RemoveUserFromGroupResponse removeUserFromGroup = removeUserFromGroup(removeUserFromGroupRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, removeUserFromGroup);
                    return true;
                case 9:
                    GetGroupNotificationsRequest getGroupNotificationsRequest = (GetGroupNotificationsRequest) iax.a(parcel, GetGroupNotificationsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    GetGroupNotificationsResponse groupNotifications = getGroupNotifications(getGroupNotificationsRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, groupNotifications);
                    return true;
                case 10:
                    UpdateGroupRequest updateGroupRequest = (UpdateGroupRequest) iax.a(parcel, UpdateGroupRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    UpdateGroupResponse updateGroup = updateGroup(updateGroupRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, updateGroup);
                    return true;
                case 11:
                    TriggerGroupNotificationRequest triggerGroupNotificationRequest = (TriggerGroupNotificationRequest) iax.a(parcel, TriggerGroupNotificationRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    TriggerGroupNotificationResponse triggerGroupNotification = triggerGroupNotification(triggerGroupNotificationRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, triggerGroupNotification);
                    return true;
                default:
                    return false;
            }
        }
    }

    AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest addUserToGroupRequest);

    CreateGroupResponse createGroup(CreateGroupRequest createGroupRequest);

    GetGroupNotificationsResponse getGroupNotifications(GetGroupNotificationsRequest getGroupNotificationsRequest);

    GetMessagesResponse getMessages(GetMessagesRequest getMessagesRequest);

    int getServiceVersion();

    JoinGroupResponse joinGroup(JoinGroupRequest joinGroupRequest);

    RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest removeUserFromGroupRequest);

    RevokeMessageResponse revokeMessage(RevokeMessageRequest revokeMessageRequest);

    SendMessageResponse sendMessage(SendMessageRequest sendMessageRequest);

    TriggerGroupNotificationResponse triggerGroupNotification(TriggerGroupNotificationRequest triggerGroupNotificationRequest);

    UpdateGroupResponse updateGroup(UpdateGroupRequest updateGroupRequest);
}
