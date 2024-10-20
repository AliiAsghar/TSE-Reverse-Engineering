package defpackage;

import com.google.android.ims.rcsservice.chatsession.GroupChatSessionEvent;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.CpmGroupManagement;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupData;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementDeserializer;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequestOrResponse;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementResponse;
import j$.util.Optional;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acty implements acua {
    private final acrm a;

    public acty(acrm acrmVar) {
        this.a = acrmVar;
    }

    @Override // defpackage.acua
    public final void a(adqu adquVar, long j, String str) {
        try {
            CpmGroupManagement parseCpmGroupManagement = GroupManagementDeserializer.parseCpmGroupManagement(adquVar.f);
            String messageId = parseCpmGroupManagement.getMessageId();
            Optional<GroupData> groupData = parseCpmGroupManagement.getGroupData();
            if (groupData.isPresent() && groupData.get().getRequestOrResponse().getKind() == GroupManagementRequestOrResponse.Kind.RESPONSE) {
                GroupManagementResponse response = groupData.get().getRequestOrResponse().response();
                Optional<String> responseText = response.getResponseText();
                advr.c("Sending CHATSESSION_CPM_GROUP_MANAGEMENT_RESPONSE_RECEIVED with sessionId: %d, messageId: %s, responseCode: %d", Long.valueOf(j), messageId, Integer.valueOf(response.getResponseCode()));
                adsh adshVar = new adsh(50048, j, response.getResponseCode());
                adshVar.g = Optional.of(messageId);
                responseText.ifPresent(new acsa(adshVar, 8));
                this.a.c(new GroupChatSessionEvent(adshVar), advy.GROUP_MANAGEMENT_MESSAGE_FILTER);
            }
        } catch (IOException | XmlPullParserException e) {
            advr.s(e, "Error parsing CpmGroupManagement message", new Object[0]);
        }
    }
}
