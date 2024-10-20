package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.AddUserToGroupResponse;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupResponse;
import com.google.android.rcs.client.messaging.GetGroupNotificationsRequest;
import com.google.android.rcs.client.messaging.GetGroupNotificationsResponse;
import com.google.android.rcs.client.messaging.GetMessagesRequest;
import com.google.android.rcs.client.messaging.GetMessagesResponse;
import com.google.android.rcs.client.messaging.IMessaging;
import com.google.android.rcs.client.messaging.JoinGroupRequest;
import com.google.android.rcs.client.messaging.JoinGroupResponse;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupResponse;
import com.google.android.rcs.client.messaging.RevokeMessageRequest;
import com.google.android.rcs.client.messaging.RevokeMessageResponse;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.SendMessageResponse;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationResponse;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.UpdateGroupResponse;
import defpackage.adom;
import defpackage.adud;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ForwardingMessagingBinder extends IMessaging.Stub implements adud<IMessaging> {
    private IMessaging a;
    private final Context b;

    public ForwardingMessagingBinder(Context context) {
        this.b = context;
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest addUserToGroupRequest) {
        return ((IMessaging) getDelegate()).addUserToGroup(addUserToGroupRequest);
    }

    @Override // defpackage.adud
    public synchronized void clear() {
        this.a = null;
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public CreateGroupResponse createGroup(CreateGroupRequest createGroupRequest) {
        return ((IMessaging) getDelegate()).createGroup(createGroupRequest);
    }

    @Override // defpackage.adud
    public Context getContext() {
        return this.b;
    }

    public /* synthetic */ IInterface getDelegate() {
        return adom.v(this);
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public GetGroupNotificationsResponse getGroupNotifications(GetGroupNotificationsRequest getGroupNotificationsRequest) {
        return ((IMessaging) getDelegate()).getGroupNotifications(getGroupNotificationsRequest);
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public GetMessagesResponse getMessages(GetMessagesRequest getMessagesRequest) {
        return ((IMessaging) getDelegate()).getMessages(getMessagesRequest);
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public int getServiceVersion() {
        return ((IMessaging) getDelegate()).getServiceVersion();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public JoinGroupResponse joinGroup(JoinGroupRequest joinGroupRequest) {
        return ((IMessaging) getDelegate()).joinGroup(joinGroupRequest);
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest removeUserFromGroupRequest) {
        return ((IMessaging) getDelegate()).removeUserFromGroup(removeUserFromGroupRequest);
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public RevokeMessageResponse revokeMessage(RevokeMessageRequest revokeMessageRequest) {
        return ((IMessaging) getDelegate()).revokeMessage(revokeMessageRequest);
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public SendMessageResponse sendMessage(SendMessageRequest sendMessageRequest) {
        return ((IMessaging) getDelegate()).sendMessage(sendMessageRequest);
    }

    @Override // defpackage.adud
    public synchronized void set(IBinder iBinder) {
        this.a = (IMessaging) iBinder;
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public TriggerGroupNotificationResponse triggerGroupNotification(TriggerGroupNotificationRequest triggerGroupNotificationRequest) {
        return ((IMessaging) getDelegate()).triggerGroupNotification(triggerGroupNotificationRequest);
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public UpdateGroupResponse updateGroup(UpdateGroupRequest updateGroupRequest) {
        return ((IMessaging) getDelegate()).updateGroup(updateGroupRequest);
    }

    @Override // defpackage.adud
    public synchronized IMessaging getInterface() {
        return this.a;
    }
}
