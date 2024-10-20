package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.CpmGroupManagement;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupData;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementDeserializer;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequestOrResponse;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcz extends adqp {
    public final ListenableFuture a = d.m(new uqe(this, 7));
    public final UpdateGroupRequest b;
    public final String c;
    public dtq d;
    private final adrc e;
    private final String f;
    private final aneo g;
    private ListenableFuture h;
    private final addj i;

    public adcz(aneo aneoVar, addj addjVar, UpdateGroupRequest updateGroupRequest, String str, String str2, adrc adrcVar) {
        this.b = updateGroupRequest;
        this.c = str;
        this.f = str2;
        this.e = adrcVar;
        this.g = aneoVar;
        this.i = addjVar;
    }

    @Override // defpackage.adqp, defpackage.adqy
    public final void a(adqu adquVar, int i) {
        MessagingResult messagingResult;
        if (!this.c.equals(adquVar.k)) {
            return;
        }
        if (aczx.s()) {
            messagingResult = this.i.apply(this.e.S);
        } else {
            messagingResult = MessagingResult.f;
        }
        ajur ajurVar = new ajur(null);
        ajurVar.q(this.b.b());
        ajurVar.r(messagingResult);
        s(ajurVar.p());
    }

    @Override // defpackage.adqp, defpackage.adqy
    public final void b(adqu adquVar) {
        if (!this.c.equals(adquVar.k)) {
            return;
        }
        this.h = this.g.schedule(new aaze(this, 5), ((Long) aczx.a().b.k.a()).longValue(), TimeUnit.SECONDS);
    }

    @Override // defpackage.adqp, defpackage.adqy
    public final void c(adqu adquVar) {
        Optional r;
        if (((Boolean) adda.a.a()).booleanValue()) {
            r = p(adquVar);
        } else {
            r = r(adquVar);
        }
        if (!r.isEmpty()) {
            try {
                ListenableFuture listenableFuture = this.h;
                if (listenableFuture != null) {
                    listenableFuture.cancel(true);
                }
                this.e.aP(this);
                Optional<GroupData> groupData = ((CpmGroupManagement) r.get()).getGroupData();
                if (((Boolean) adda.a.a()).booleanValue()) {
                    if (!groupData.isEmpty() && GroupManagementRequestOrResponse.Kind.RESPONSE.equals(groupData.get().getRequestOrResponse().getKind())) {
                        int responseCode = groupData.get().getRequestOrResponse().response().getResponseCode();
                        if (responseCode != 200) {
                            advr.q("%s: CpmGroupManagement request failed with response code %d", this.c, Integer.valueOf(responseCode));
                            ajur ajurVar = new ajur(null);
                            ajurVar.q(this.b.b());
                            ajps d = MessagingResult.d();
                            d.c(15);
                            ajurVar.r(d.a());
                            s(ajurVar.p());
                            return;
                        }
                        ajur ajurVar2 = new ajur(null);
                        ajurVar2.q(this.b.b());
                        ajurVar2.r(MessagingResult.d);
                        s(ajurVar2.p());
                        return;
                    }
                    advr.q("%s: Unexpected response to CpmGroupManagement request", this.c);
                    ajur ajurVar3 = new ajur(null);
                    ajurVar3.q(this.b.b());
                    ajps d2 = MessagingResult.d();
                    d2.c(15);
                    ajurVar3.r(d2.a());
                    s(ajurVar3.p());
                    return;
                }
                if (groupData.isPresent() && groupData.get().getRequestOrResponse().getKind() == GroupManagementRequestOrResponse.Kind.RESPONSE) {
                    ajur ajurVar4 = new ajur(null);
                    ajurVar4.q(this.b.b());
                    ajurVar4.r(MessagingResult.d);
                    s(ajurVar4.p());
                    return;
                }
                return;
            } catch (Throwable th) {
                this.e.aP(this);
                throw th;
            }
        }
        advr.c("Not response of this message %s, ignore it.", this.f);
    }

    final Optional p(adqu adquVar) {
        String str = adquVar.h;
        byte[] bArr = adquVar.f;
        if ("message/cpim".equals(str)) {
            try {
                ajpz j = ajki.j(adquVar.f);
                str = (String) j.c.b().orElse(str);
                bArr = j.c.b.H();
            } catch (IOException unused) {
                return Optional.empty();
            }
        }
        if (!GroupManagementContentType.CPM_GROUP_DATA_CONTENT_TYPE.f(str)) {
            return Optional.empty();
        }
        try {
            CpmGroupManagement parseCpmGroupManagement = GroupManagementDeserializer.parseCpmGroupManagement(bArr);
            if (!this.f.equals(parseCpmGroupManagement.getMessageId())) {
                return Optional.empty();
            }
            return Optional.of(parseCpmGroupManagement);
        } catch (IOException | XmlPullParserException e) {
            advr.s(e, "Error parsing CpmGroupManagement message", new Object[0]);
            return Optional.empty();
        }
    }

    final Optional r(adqu adquVar) {
        if (GroupManagementContentType.CONTENT_TYPE.equals(adquVar.h)) {
            try {
                CpmGroupManagement parseCpmGroupManagement = GroupManagementDeserializer.parseCpmGroupManagement(adquVar.f);
                if (!this.f.equals(parseCpmGroupManagement.getMessageId())) {
                    return Optional.empty();
                }
                return Optional.of(parseCpmGroupManagement);
            } catch (IOException | XmlPullParserException e) {
                advr.s(e, "Error parsing CpmGroupManagement message", new Object[0]);
                return Optional.empty();
            }
        }
        return Optional.empty();
    }

    public final void s(GroupOperationResult groupOperationResult) {
        dtq dtqVar = this.d;
        dtqVar.getClass();
        dtqVar.b(groupOperationResult);
    }
}
