package com.google.android.ims.messaging;

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
import com.google.android.rcs.client.messaging.MessagingResult;
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
import com.google.android.rcs.client.messaging.data.GroupNotification;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import defpackage.acof;
import defpackage.adbb;
import defpackage.addk;
import defpackage.addp;
import defpackage.adea;
import defpackage.adec;
import defpackage.adef;
import defpackage.adei;
import defpackage.adej;
import defpackage.adek;
import defpackage.adqg;
import defpackage.advp;
import defpackage.advr;
import defpackage.ajur;
import defpackage.albo;
import defpackage.alob;
import defpackage.alog;
import defpackage.anen;
import defpackage.aodz;
import defpackage.armf;
import defpackage.atok;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MessagingEngine extends IMessaging.Stub {
    private static final advp a = new advp("MessagingEngine");
    private final anen b;
    private final armf c;
    private final addp d;
    private final armf e;
    private final acof f;
    private final addk g;
    private final adei h;
    private final adec i;
    private final adea j;
    private final adef k;
    private final adek l;
    private final adej m;

    public MessagingEngine(anen anenVar, armf<adqg> armfVar, addp addpVar, adei adeiVar, adec adecVar, adea adeaVar, adef adefVar, adek adekVar, adej adejVar, armf<adbb> armfVar2, acof acofVar, addk addkVar) {
        this.b = anenVar;
        this.c = armfVar;
        this.d = addpVar;
        this.e = armfVar2;
        this.f = acofVar;
        this.h = adeiVar;
        this.i = adecVar;
        this.j = adeaVar;
        this.k = adefVar;
        this.l = adekVar;
        this.m = adejVar;
        this.g = addkVar;
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest addUserToGroupRequest) {
        advr.l(a, "addUserToGroup, conversationId:{%s}", addUserToGroupRequest.b().b());
        albo.bR(((adbb) this.e.b()).a(addUserToGroupRequest), this.j.a(addUserToGroupRequest), this.b);
        aodz aodzVar = new aodz((char[]) null);
        aodzVar.C(MessagingResult.e);
        return aodzVar.B();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public CreateGroupResponse createGroup(CreateGroupRequest createGroupRequest) {
        advr.l(a, "createGroup, conversationId:{%s}", createGroupRequest.d());
        albo.bR(((adbb) this.e.b()).b(createGroupRequest), this.i.a(createGroupRequest), this.b);
        aodz aodzVar = new aodz((char[]) null);
        aodzVar.A(MessagingResult.e);
        return aodzVar.z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.lang.Iterable] */
    @Override // com.google.android.rcs.client.messaging.IMessaging
    public GetGroupNotificationsResponse getGroupNotifications(GetGroupNotificationsRequest getGroupNotificationsRequest) {
        alog g;
        advr.l(a, "getGroupNotifications, limit:{%s}", Integer.valueOf(getGroupNotificationsRequest.a()));
        ajur ajurVar = new ajur(null);
        ajurVar.x(MessagingResult.d);
        int a2 = getGroupNotificationsRequest.a();
        alob alobVar = new alob();
        addp addpVar = this.d;
        if (a2 <= 0) {
            synchronized (addpVar.a) {
                advr.c("Group notifications queue: pop operation, popCount:{%s}, queueSize:{0}", Integer.valueOf(addpVar.b.size()));
                alobVar.j(addpVar.b);
                addpVar.b.clear();
                g = alobVar.g();
            }
        } else {
            synchronized (addpVar.a) {
                int i = 0;
                while (i < a2) {
                    GroupNotification groupNotification = (GroupNotification) addpVar.b.poll();
                    if (groupNotification == null) {
                        break;
                    }
                    alobVar.h(groupNotification);
                    i++;
                }
                advr.c("Group notifications queue: pop operation, popCount:{%s}, queueSize:{%s}", Integer.valueOf(i), Integer.valueOf(addpVar.b.size()));
            }
            g = alobVar.g();
        }
        ajurVar.w(g);
        return ajurVar.v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.lang.Iterable] */
    @Override // com.google.android.rcs.client.messaging.IMessaging
    public GetMessagesResponse getMessages(GetMessagesRequest getMessagesRequest) {
        alog g;
        advr.l(a, "getMessages, limit:{%s}", Integer.valueOf(getMessagesRequest.a()));
        ajur ajurVar = new ajur(null);
        ajurVar.u(MessagingResult.d);
        adqg adqgVar = (adqg) this.c.b();
        int a2 = getMessagesRequest.a();
        alob alobVar = new alob();
        if (a2 < 0) {
            synchronized (adqgVar.b) {
                advr.c("Messages queue: pop operation, popCount:{%s}, queueSize:{0}.", Integer.valueOf(adqgVar.d.size()));
                alobVar.j(adqgVar.d);
                adqgVar.d.clear();
            }
            g = alobVar.g();
        } else {
            synchronized (adqgVar.b) {
                int i = 0;
                while (i < a2) {
                    MessageNotification messageNotification = (MessageNotification) adqgVar.d.poll();
                    if (messageNotification == null) {
                        break;
                    }
                    alobVar.h(messageNotification);
                    i++;
                }
                advr.c("Messages queue: pop operation, popCount:{%s}, queueSize:{%s}.", Integer.valueOf(i), Integer.valueOf(adqgVar.d.size()));
            }
            g = alobVar.g();
        }
        ajurVar.t(g);
        return ajurVar.s();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public int getServiceVersion() {
        return 1;
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public JoinGroupResponse joinGroup(JoinGroupRequest joinGroupRequest) {
        advr.l(a, "joinGroup, conversationId:{%s}", joinGroupRequest.b().b());
        aodz aodzVar = new aodz((char[]) null);
        aodzVar.y(MessagingResult.d);
        return aodzVar.x();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest removeUserFromGroupRequest) {
        advr.l(a, "removeUserFromGroup, conversationId:{%s}", removeUserFromGroupRequest.b().b());
        albo.bR(((adbb) this.e.b()).c(removeUserFromGroupRequest), this.k.a(removeUserFromGroupRequest), this.b);
        aodz aodzVar = new aodz((char[]) null);
        aodzVar.w(MessagingResult.e);
        return aodzVar.v();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public RevokeMessageResponse revokeMessage(RevokeMessageRequest revokeMessageRequest) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public SendMessageResponse sendMessage(SendMessageRequest sendMessageRequest) {
        String h = sendMessageRequest.c().h();
        advr.l(a, "sendMessage, messageId:{%s}, messageClass:{%s}", h, sendMessageRequest.d());
        if (((Boolean) acof.b.a()).booleanValue()) {
            this.f.f((atok) this.g.fu(sendMessageRequest.h()), h, 5);
        }
        albo.bR(((adbb) this.e.b()).d(sendMessageRequest), this.h.a(sendMessageRequest), this.b);
        if (((Boolean) acof.b.a()).booleanValue()) {
            this.f.f((atok) this.g.fu(sendMessageRequest.h()), h, 6);
        }
        aodz aodzVar = new aodz((char[]) null);
        aodzVar.u(MessagingResult.e);
        return aodzVar.t();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public TriggerGroupNotificationResponse triggerGroupNotification(TriggerGroupNotificationRequest triggerGroupNotificationRequest) {
        advr.l(a, "triggerGroupNotification, conversationId:{%s}", triggerGroupNotificationRequest.b().b());
        albo.bR(((adbb) this.e.b()).e(triggerGroupNotificationRequest), this.m.a(triggerGroupNotificationRequest), this.b);
        aodz aodzVar = new aodz((char[]) null);
        aodzVar.s(MessagingResult.e);
        return aodzVar.r();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public UpdateGroupResponse updateGroup(UpdateGroupRequest updateGroupRequest) {
        advr.l(a, "updateGroup, conversationId:{%s}", updateGroupRequest.b().b());
        albo.bR(((adbb) this.e.b()).f(updateGroupRequest), this.l.a(updateGroupRequest), this.b);
        aodz aodzVar = new aodz((char[]) null);
        aodzVar.q(MessagingResult.e);
        return aodzVar.p();
    }
}
