package com.google.android.rcs.client.messaging;

import android.content.Context;
import android.os.RemoteException;
import defpackage.ajnv;
import defpackage.ajny;
import defpackage.ajoa;
import defpackage.ajpt;
import defpackage.xzb;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RcsMessagingService extends ajnv<IMessaging> {
    public RcsMessagingService(Context context, ajoa ajoaVar) {
        super(IMessaging.class, context, ajoaVar, 1, Optional.empty());
    }

    public AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest addUserToGroupRequest) {
        b();
        try {
            return g().addUserToGroup(addUserToGroupRequest);
        } catch (RemoteException | IllegalStateException e) {
            xzb.g("RcsClientLib", "Error while calling addUserToGroup: ".concat(String.valueOf(e.getMessage())));
            throw new ajpt("Error while calling addUserToGroup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajnv
    public final void b() {
        try {
            super.b();
        } catch (ajny e) {
            throw new ajpt(e.getMessage(), e);
        }
    }

    public CreateGroupResponse createGroup(CreateGroupRequest createGroupRequest) {
        b();
        try {
            return g().createGroup(createGroupRequest);
        } catch (RemoteException | IllegalStateException e) {
            xzb.g("RcsClientLib", "Error while calling createGroup: ".concat(String.valueOf(e.getMessage())));
            throw new ajpt("Error while calling createGroup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    protected final IMessaging g() {
        try {
            return (IMessaging) super.a();
        } catch (ajny e) {
            throw new ajpt(e.getMessage(), e);
        }
    }

    public GetGroupNotificationsResponse getGroupNotifications(GetGroupNotificationsRequest getGroupNotificationsRequest) {
        b();
        try {
            return g().getGroupNotifications(getGroupNotificationsRequest);
        } catch (RemoteException | IllegalStateException e) {
            xzb.g("RcsClientLib", "Error while calling getGroupNotifications: ".concat(String.valueOf(e.getMessage())));
            throw new ajpt("Error while calling getGroupNotifications: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public GetMessagesResponse getMessages(GetMessagesRequest getMessagesRequest) {
        b();
        try {
            return g().getMessages(getMessagesRequest);
        } catch (RemoteException | IllegalStateException e) {
            xzb.g("RcsClientLib", "Error while calling getMessages: ".concat(String.valueOf(e.getMessage())));
            throw new ajpt("Error while calling getMessages: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.ajnv
    public String getRcsServiceMetaDataKey() {
        return "MessagingSessionServiceVersions";
    }

    public JoinGroupResponse joinGroup(JoinGroupRequest joinGroupRequest) {
        b();
        try {
            return g().joinGroup(joinGroupRequest);
        } catch (RemoteException | IllegalStateException e) {
            xzb.g("RcsClientLib", "Error while calling joinGroup: ".concat(String.valueOf(e.getMessage())));
            throw new ajpt("Error while calling joinGroup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest removeUserFromGroupRequest) {
        b();
        try {
            return g().removeUserFromGroup(removeUserFromGroupRequest);
        } catch (RemoteException | IllegalStateException e) {
            xzb.g("RcsClientLib", "Error while calling removeUserFromGroup: ".concat(String.valueOf(e.getMessage())));
            throw new ajpt("Error while calling removeUserFromGroup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public RevokeMessageResponse revokeMessage(RevokeMessageRequest revokeMessageRequest) {
        b();
        try {
            return g().revokeMessage(revokeMessageRequest);
        } catch (RemoteException | IllegalStateException e) {
            xzb.g("RcsClientLib", "Error while calling revokeMessage: ".concat(String.valueOf(e.getMessage())));
            throw new ajpt("Error while calling revokeMessage: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public SendMessageResponse sendMessage(SendMessageRequest sendMessageRequest) {
        b();
        try {
            return g().sendMessage(sendMessageRequest);
        } catch (RemoteException | IllegalStateException e) {
            xzb.g("RcsClientLib", "Error while calling sendMessage: ".concat(String.valueOf(e.getMessage())));
            throw new ajpt("Error while calling sendMessage: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public TriggerGroupNotificationResponse triggerGroupNotification(TriggerGroupNotificationRequest triggerGroupNotificationRequest) {
        b();
        try {
            return g().triggerGroupNotification(triggerGroupNotificationRequest);
        } catch (RemoteException | IllegalStateException e) {
            xzb.g("RcsClientLib", "Error while calling triggerGroupNotification: ".concat(String.valueOf(e.getMessage())));
            throw new ajpt("Error while calling triggerGroupNotification: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public UpdateGroupResponse updateGroup(UpdateGroupRequest updateGroupRequest) {
        b();
        try {
            return g().updateGroup(updateGroupRequest);
        } catch (RemoteException | IllegalStateException e) {
            xzb.g("RcsClientLib", "Error while calling updateGroup: ".concat(String.valueOf(e.getMessage())));
            throw new ajpt("Error while calling updateGroup: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
