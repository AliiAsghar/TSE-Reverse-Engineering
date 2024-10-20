package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adao implements apya {
    private final int a;
    private final /* synthetic */ int b;
    private final Object c;

    public adao(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.a = i;
    }

    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        addp addpVar;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    int i2 = this.a;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            anen u = ((acrh) ((adec) this.c).a).u();
                            u.getClass();
                            return u;
                        }
                        adny p = ((acrh) ((adec) this.c).a).p();
                        p.getClass();
                        return p;
                    }
                    adeq m = ((acrh) ((adec) this.c).a).m();
                    m.getClass();
                    return m;
                }
                switch (this.a) {
                    case 0:
                        return apzg.a(((adar) this.c).e, apyd.a);
                    case 1:
                        Object obj = this.c;
                        acyz acyzVar = adcp.a;
                        SendMessageRequest sendMessageRequest = (SendMessageRequest) ((adar) obj).a;
                        sendMessageRequest.getClass();
                        return sendMessageRequest;
                    case 2:
                        adar adarVar = (adar) this.c;
                        return new addi(adarVar.b, (adov) ((apxx) adarVar.f).a, new ajsc(new ajsg()), new aifa((Context) ((apxx) ((adar) this.c).c).a));
                    case 3:
                        adar adarVar2 = (adar) this.c;
                        addpVar = new addp(adarVar2.c, adarVar2.g, (byte[]) null);
                        break;
                    case 4:
                        return new addj();
                    case 5:
                        ajpe ajpeVar = (ajpe) ((adar) this.c).a;
                        ajpeVar.getClass();
                        return ajpeVar;
                    case 6:
                        adar adarVar3 = (adar) this.c;
                        return new adea((armf) adarVar3.h, (armf) adarVar3.f, (armf) adarVar3.i, (armf) adarVar3.j, (armf) adarVar3.k, (byte[]) null);
                    case 7:
                        ajpw ajpwVar = (ajpw) ((adar) this.c).a;
                        ajpwVar.getClass();
                        return ajpwVar;
                    case 8:
                        AddUserToGroupRequest addUserToGroupRequest = (AddUserToGroupRequest) ((adar) this.c).a;
                        addUserToGroupRequest.getClass();
                        return addUserToGroupRequest;
                    case 9:
                        CreateGroupRequest createGroupRequest = (CreateGroupRequest) ((adar) this.c).a;
                        createGroupRequest.getClass();
                        return createGroupRequest;
                    case 10:
                        RemoveUserFromGroupRequest removeUserFromGroupRequest = (RemoveUserFromGroupRequest) ((adar) this.c).a;
                        removeUserFromGroupRequest.getClass();
                        return removeUserFromGroupRequest;
                    case 11:
                        TriggerGroupNotificationRequest triggerGroupNotificationRequest = (TriggerGroupNotificationRequest) ((adar) this.c).a;
                        triggerGroupNotificationRequest.getClass();
                        return triggerGroupNotificationRequest;
                    case 12:
                        Object obj2 = this.c;
                        int i3 = adda.b;
                        UpdateGroupRequest updateGroupRequest = (UpdateGroupRequest) ((adar) obj2).a;
                        updateGroupRequest.getClass();
                        return updateGroupRequest;
                    default:
                        adar adarVar4 = (adar) this.c;
                        addpVar = new addp((armf) adarVar4.r, (armf) adarVar4.g);
                        break;
                }
                return addpVar;
            }
            int i4 = this.a;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                return new ajsu(new ajtp());
                            }
                            return new ajto();
                        }
                        return new ajtk();
                    }
                    adan adanVar = (adan) this.c;
                    return new adqg(adanVar.b, adanVar.f, adanVar.c);
                }
                Object obj3 = this.c;
                acyz acyzVar2 = adbc.a;
                return ((adan) obj3).a;
            }
            return apzg.a(((adan) this.c).e, apyd.a);
        }
        int i5 = this.a;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 != 5) {
                                adap adapVar = (adap) this.c;
                                return new adqg(adapVar.e, adapVar.n, adapVar.b);
                            }
                            return new ajtc();
                        }
                        return new ajtr();
                    }
                    adap adapVar2 = (adap) this.c;
                    return new adea((armf) adapVar2.j, (armf) adapVar2.h, (armf) adapVar2.i, (armf) adapVar2.k, (armf) adapVar2.l, (byte[]) null);
                }
                adap adapVar3 = (adap) this.c;
                ajsj ajsjVar = adapVar3.c;
                return new addi(adapVar3.b, (adov) ((apxx) adapVar3.h).a, new ajsc(ajsjVar), new aifa(adapVar3.d));
            }
            Object obj4 = this.c;
            advp advpVar = adbs.a;
            return ((adap) obj4).a;
        }
        return apzg.a(((adap) this.c).g, apyd.a);
    }
}
