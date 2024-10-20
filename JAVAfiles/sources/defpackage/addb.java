package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementSerializer;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class addb extends apyn {
    private final apyi b;
    private final apyi c;
    private final apyi d;
    private final apyi e;
    private final apyi f;
    private final apyi g;

    public addb(armf armfVar, armf armfVar2, apyi apyiVar, apyi apyiVar2, apyi apyiVar3, apyi apyiVar4, apyi apyiVar5, apyi apyiVar6) {
        super(armfVar2, new apyv(addb.class), armfVar);
        this.b = apys.c(apyiVar);
        this.c = apys.c(apyiVar2);
        this.d = apys.c(apyiVar3);
        this.e = apys.c(apyiVar4);
        this.f = apys.c(apyiVar5);
        this.g = apys.c(apyiVar6);
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [armf, java.lang.Object] */
    @Override // defpackage.apyn
    public final /* synthetic */ ListenableFuture b(Object obj) {
        byte[] createGroupSubjectChangeXml;
        List list = (List) obj;
        UpdateGroupRequest updateGroupRequest = (UpdateGroupRequest) list.get(0);
        addt addtVar = (addt) list.get(1);
        addi addiVar = (addi) list.get(2);
        yjr yjrVar = (yjr) list.get(3);
        addj addjVar = (addj) list.get(4);
        addp addpVar = (addp) list.get(5);
        Optional optional = addtVar.a;
        int i = adda.b;
        if (optional.isEmpty()) {
            MessagingResult messagingResult = MessagingResult.f;
            if (aczx.s()) {
                Optional map = addtVar.d.map(addjVar);
                ajps d = MessagingResult.d();
                d.c(16);
                messagingResult = (MessagingResult) map.orElse(d.a());
            }
            ajur ajurVar = new ajur(null);
            ajurVar.r(messagingResult);
            ajurVar.q(updateGroupRequest.b());
            return albo.bI(ajurVar.p());
        }
        Object obj2 = addtVar.a.get();
        String ah = agkx.ah();
        String l = Long.toString(new Random().nextInt(Integer.MAX_VALUE));
        if (!updateGroupRequest.d().isEmpty()) {
            String str = (String) updateGroupRequest.d().get();
            if (str.isEmpty()) {
                createGroupSubjectChangeXml = GroupManagementSerializer.createGroupSubjectDeleteXml(l);
            } else {
                createGroupSubjectChangeXml = GroupManagementSerializer.createGroupSubjectChangeXml(l, str);
            }
            String o = adwf.o(((adrh) ((adoz) obj2).i).r(), yjrVar);
            ajqn i2 = Message.i();
            i2.f(ah);
            ajur ajurVar2 = new ajur(null);
            ajurVar2.m(aozb.w(createGroupSubjectChangeXml));
            ajurVar2.n(ContentType.d(GroupManagementContentType.CONTENT_TYPE));
            i2.b(ajki.i(ajurVar2.l()));
            atkv atkvVar = new atkv((byte[]) null);
            atkvVar.k(1);
            atkvVar.j(o);
            i2.i(atkvVar.i());
            adqu b = addiVar.b(updateGroupRequest.b(), i2.a(), Optional.empty(), ajqw.MESSAGING_METHOD_CHAT);
            aneo aneoVar = (aneo) ((apxx) addpVar.b).a;
            addj addjVar2 = (addj) addpVar.a.b();
            updateGroupRequest.getClass();
            l.getClass();
            adrc adrcVar = (adrc) obj2;
            adcz adczVar = new adcz(aneoVar, addjVar2, updateGroupRequest, ah, l, adrcVar);
            adrcVar.aG(adczVar);
            adrcVar.aQ(b);
            return adczVar.a;
        }
        throw new IllegalArgumentException("Only subject modification allowed");
    }

    @Override // defpackage.apyn
    protected final ListenableFuture c() {
        apyi apyiVar = this.g;
        apyi apyiVar2 = this.f;
        apyi apyiVar3 = this.e;
        apyi apyiVar4 = this.d;
        return albo.bF(this.b.d(), this.c.d(), apyiVar4.d(), apyiVar3.d(), apyiVar2.d(), apyiVar.d());
    }
}
