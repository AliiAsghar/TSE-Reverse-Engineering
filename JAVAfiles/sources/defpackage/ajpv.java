package defpackage;

import android.os.Parcelable;
import com.google.android.rcs.client.messaging.RevokeMessageRequest;
import com.google.android.rcs.client.messaging.RevokeMessageResponse;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.SendMessageResponse;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationResponse;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.UpdateGroupResponse;
import com.google.android.rcs.client.messaging.data.BasicTextMessage;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.android.rcs.client.messaging.data.GroupEvent;
import com.google.android.rcs.client.messaging.data.GroupInformation;
import com.google.android.rcs.client.messaging.data.GroupMember;
import com.google.android.rcs.client.messaging.data.GroupNotification;
import com.google.android.rcs.client.messaging.data.GroupRemoteCapabilities;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import com.google.android.rcs.client.messaging.data.LocationInformation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajpv implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ajpv(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 546
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajpv.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new RevokeMessageResponse[0];
            case 1:
                return new RevokeMessageRequest[0];
            case 2:
                return new SendMessageRequest[0];
            case 3:
                return new SendMessageResponse[0];
            case 4:
                return new TriggerGroupNotificationRequest[i];
            case 5:
                return new TriggerGroupNotificationResponse[i];
            case 6:
                return new UpdateGroupRequest[0];
            case 7:
                return new UpdateGroupResponse[i];
            case 8:
                return new BasicTextMessage[0];
            case 9:
                return new ChatMessage[i];
            case 10:
                return new ContentType[i];
            case 11:
                return new Conversation[i];
            case 12:
                return new FileInformation[i];
            case 13:
                return new FileTransferInformation[i];
            case 14:
                return new GroupEvent[i];
            case 15:
                return new GroupInformation[i];
            case 16:
                return new GroupMember[i];
            case 17:
                return new GroupNotification[i];
            case 18:
                return new GroupRemoteCapabilities[i];
            case 19:
                return new IsComposingMessage[i];
            default:
                return new LocationInformation[i];
        }
    }
}
