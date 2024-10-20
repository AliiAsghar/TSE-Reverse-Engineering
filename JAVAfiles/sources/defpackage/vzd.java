package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.AddUserToGroupResponse;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupResponse;
import com.google.android.rcs.client.messaging.RevokeMessageRequest;
import com.google.android.rcs.client.messaging.RevokeMessageResponse;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationResponse;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.UpdateGroupResponse;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vzd implements vyx {
    public final RcsMessagingService a;
    private final anen b;
    private final qco c;
    private final /* synthetic */ int d;

    public vzd(RcsMessagingService rcsMessagingService, qco qcoVar, anen anenVar, int i) {
        this.d = i;
        this.a = rcsMessagingService;
        this.c = qcoVar;
        this.b = anenVar;
    }

    public static final qfz n(qeg qegVar, aozb aozbVar) {
        aozy createBuilder = qfz.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qfz qfzVar = (qfz) apagVar;
        qegVar.getClass();
        qfzVar.c = qegVar;
        qfzVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qfz qfzVar2 = (qfz) createBuilder.b;
        aozbVar.getClass();
        qfzVar2.b |= 2;
        qfzVar2.d = aozbVar;
        return (qfz) createBuilder.s();
    }

    public static final qed o(qeg qegVar, aozb aozbVar) {
        aozy createBuilder = qed.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qed qedVar = (qed) apagVar;
        qegVar.getClass();
        qedVar.c = qegVar;
        qedVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qed qedVar2 = (qed) createBuilder.b;
        aozbVar.getClass();
        qedVar2.b |= 2;
        qedVar2.d = aozbVar;
        return (qed) createBuilder.s();
    }

    public static final qgc p(qeg qegVar, aozb aozbVar) {
        aozy createBuilder = qgc.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qgc qgcVar = (qgc) apagVar;
        qegVar.getClass();
        qgcVar.c = qegVar;
        qgcVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qgc qgcVar2 = (qgc) createBuilder.b;
        aozbVar.getClass();
        qgcVar2.b |= 2;
        qgcVar2.d = aozbVar;
        return (qgc) createBuilder.s();
    }

    public static final qgu q(qeg qegVar, aozb aozbVar) {
        aozy createBuilder = qgu.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qgu qguVar = (qgu) apagVar;
        qegVar.getClass();
        qguVar.c = qegVar;
        qguVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qgu qguVar2 = (qgu) createBuilder.b;
        aozbVar.getClass();
        qguVar2.b |= 2;
        qguVar2.d = aozbVar;
        return (qgu) createBuilder.s();
    }

    public static final qgx r(qeg qegVar, aozb aozbVar) {
        aozy createBuilder = qgx.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qgx qgxVar = (qgx) apagVar;
        qegVar.getClass();
        qgxVar.c = qegVar;
        qgxVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qgx qgxVar2 = (qgx) createBuilder.b;
        aozbVar.getClass();
        qgxVar2.b |= 2;
        qgxVar2.d = aozbVar;
        return (qgx) createBuilder.s();
    }

    @Override // defpackage.vyx
    public final /* synthetic */ Intent a(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return new Intent("com.google.android.apps.messaging.messaging_service_update_group_response").putExtra("messaging_service_update_group_extra", ((qgw) obj).e.H());
                    }
                    return new Intent("com.google.android.apps.messaging.messaging_service_trigger_group_notification_response").putExtra("messaging_service_trigger_group_notification_extra", ((qgt) obj).d.H());
                }
                return new Intent("com.google.android.apps.messaging.messaging_service_revoke_message_response").putExtra("messaging_service_revoke_message_response_extra", ((qgb) obj).f.H());
            }
            return new Intent("com.google.android.apps.messaging.messaging_service_add_user_to_group_response").putExtra("messaging_service_add_user_to_group_extra", ((qec) obj).e.H());
        }
        return new Intent("com.google.android.apps.messaging.messaging_service_remove_user_from_group_response").putExtra("messaging_service_remove_user_from_group_extra", ((qfy) obj).e.H());
    }

    @Override // defpackage.vyx
    public final qeg b(Intent intent) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return wam.g(GroupOperationResult.c(intent).a());
                    }
                    return wam.g(GroupOperationResult.c(intent).a());
                }
                return wam.g(MessagingOperationResult.e(intent).a());
            }
            return wam.g(GroupOperationResult.c(intent).a());
        }
        return wam.g(GroupOperationResult.c(intent).a());
    }

    @Override // defpackage.vyx
    public final /* synthetic */ akul c(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return this.c.k((qgx) obj);
                    }
                    return this.c.j((qgu) obj);
                }
                return this.c.h((qgc) obj);
            }
            return this.c.b((qed) obj);
        }
        return this.c.g((qfz) obj);
    }

    @Override // defpackage.vyx
    public final /* synthetic */ akul d(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return aktp.ai(new vze(this, (UpdateGroupRequest) obj, 4), this.b);
                    }
                    return aktp.ai(new vze(this, (TriggerGroupNotificationRequest) obj, 3), this.b);
                }
                return aktp.ai(new vze(this, (RevokeMessageRequest) obj, 0), this.b);
            }
            return aktp.ai(new vmb(this, (AddUserToGroupRequest) obj, 19), this.b);
        }
        return aktp.ai(new vze(this, (RemoveUserFromGroupRequest) obj, 1), this.b);
    }

    @Override // defpackage.vyx
    public final aozb e(Intent intent) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        byte[] byteArrayExtra = intent.getByteArrayExtra("messaging_service_update_group_extra");
                        if (byteArrayExtra != null) {
                            return aozb.w(byteArrayExtra);
                        }
                        throw new IllegalArgumentException("Opaque data is missing from intent");
                    }
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("messaging_service_trigger_group_notification_extra");
                    if (byteArrayExtra2 != null) {
                        return aozb.w(byteArrayExtra2);
                    }
                    throw new IllegalArgumentException("Opaque data is missing from intent");
                }
                byte[] byteArrayExtra3 = intent.getByteArrayExtra("messaging_service_revoke_message_response_extra");
                if (byteArrayExtra3 != null) {
                    return aozb.w(byteArrayExtra3);
                }
                throw new IllegalArgumentException("Opaque data is missing from intent");
            }
            byte[] byteArrayExtra4 = intent.getByteArrayExtra("messaging_service_add_user_to_group_extra");
            if (byteArrayExtra4 != null) {
                return aozb.w(byteArrayExtra4);
            }
            throw new IllegalArgumentException("Opaque data is missing from intent");
        }
        byte[] byteArrayExtra5 = intent.getByteArrayExtra("messaging_service_remove_user_from_group_extra");
        if (byteArrayExtra5 != null) {
            return aozb.w(byteArrayExtra5);
        }
        throw new IllegalArgumentException("Opaque data is missing from intent");
    }

    @Override // defpackage.vyx
    public final /* synthetic */ aozb f(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return ((qgw) obj).e;
                    }
                    return ((qgt) obj).d;
                }
                return ((qgb) obj).f;
            }
            return ((qec) obj).e;
        }
        return ((qfy) obj).e;
    }

    @Override // defpackage.vyx
    public final Optional g(Intent intent) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return vyi.b(intent);
                    }
                    return vyi.b(intent);
                }
                return vyi.c(intent);
            }
            return vyi.b(intent);
        }
        return vyi.b(intent);
    }

    @Override // defpackage.vyx
    public final /* synthetic */ Object h(qeg qegVar, aozb aozbVar) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return r(qegVar, aozbVar);
                    }
                    return q(qegVar, aozbVar);
                }
                return p(qegVar, aozbVar);
            }
            return o(qegVar, aozbVar);
        }
        return n(qegVar, aozbVar);
    }

    @Override // defpackage.vyx
    public final /* synthetic */ Object i(Object obj, aozb aozbVar) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return r(wam.g(((UpdateGroupResponse) obj).a()), aozbVar);
                    }
                    return q(wam.g(((TriggerGroupNotificationResponse) obj).a()), aozbVar);
                }
                return p(wam.g(((RevokeMessageResponse) obj).a()), aozbVar);
            }
            return o(wam.g(((AddUserToGroupResponse) obj).a()), aozbVar);
        }
        return n(wam.g(((RemoveUserFromGroupResponse) obj).a()), aozbVar);
    }

    @Override // defpackage.vyx
    public final /* synthetic */ Object j(qeg qegVar, Intent intent, aozb aozbVar) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return r(qegVar, aozbVar);
                    }
                    return q(qegVar, aozbVar);
                }
                return p(qegVar, aozbVar);
            }
            return o(qegVar, aozbVar);
        }
        return n(qegVar, aozbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vyx
    public final /* synthetic */ Object k(Object obj, PendingIntent pendingIntent) {
        boolean z;
        boolean z2;
        int i = this.d;
        int i2 = 2;
        boolean z3 = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        qgw qgwVar = (qgw) obj;
                        aoad aoadVar = new aoad((byte[]) null, (byte[]) null, (char[]) null);
                        atkm atkmVar = new atkm();
                        qfb qfbVar = qgwVar.c;
                        if (qfbVar == null) {
                            qfbVar = qfb.a;
                        }
                        qei qeiVar = qfbVar.d;
                        if (qeiVar == null) {
                            qeiVar = qei.a;
                        }
                        atkmVar.b(vyv.c(qeiVar));
                        qfb qfbVar2 = qgwVar.c;
                        if (qfbVar2 == null) {
                            qfbVar2 = qfb.a;
                        }
                        atkmVar.c(qfbVar2.c);
                        atkmVar.d(2);
                        aoadVar.E(atkmVar.a());
                        aoadVar.F(pendingIntent);
                        aoadVar.H(qgwVar.d);
                        if (((Boolean) vyw.b.e()).booleanValue()) {
                            aoadVar.G(qgwVar.e);
                        }
                        return aoadVar.D();
                    }
                    qgt qgtVar = (qgt) obj;
                    arbj arbjVar = new arbj((byte[]) null, (short[]) null, (byte[]) null);
                    atkm atkmVar2 = new atkm();
                    qfb qfbVar3 = qgtVar.c;
                    if (qfbVar3 == null) {
                        qfbVar3 = qfb.a;
                    }
                    qei qeiVar2 = qfbVar3.d;
                    if (qeiVar2 == null) {
                        qeiVar2 = qei.a;
                    }
                    atkmVar2.b(vyv.c(qeiVar2));
                    qfb qfbVar4 = qgtVar.c;
                    if (qfbVar4 == null) {
                        qfbVar4 = qfb.a;
                    }
                    atkmVar2.c(qfbVar4.c);
                    atkmVar2.d(2);
                    arbjVar.L(atkmVar2.a());
                    arbjVar.M(pendingIntent);
                    if (((Boolean) vyw.b.e()).booleanValue()) {
                        arbjVar.N(qgtVar.d);
                    }
                    return arbjVar.K();
                }
                qgb qgbVar = (qgb) obj;
                aoad aoadVar2 = new aoad((byte[]) null, (char[]) null, (byte[]) null);
                atkm atkmVar3 = new atkm();
                qei qeiVar3 = qgbVar.c;
                if (qeiVar3 == null) {
                    qeiVar3 = qei.a;
                }
                atkmVar3.b(vyv.c(qeiVar3));
                atkmVar3.c(qgbVar.e);
                qeh qehVar = qeh.GROUP;
                qei qeiVar4 = qgbVar.c;
                if (qeiVar4 == null) {
                    qeiVar4 = qei.a;
                }
                qeh b = qeh.b(qeiVar4.c);
                if (b == null) {
                    b = qeh.UNKNOWN_TYPE;
                }
                if (true != qehVar.equals(b)) {
                    i2 = 1;
                }
                atkmVar3.d(i2);
                aoadVar2.K(atkmVar3.a());
                aoadVar2.M(qgbVar.d);
                aoadVar2.L(pendingIntent);
                if (((Boolean) vyw.b.e()).booleanValue()) {
                    aoadVar2.N(qgbVar.f);
                }
                return aoadVar2.J();
            }
            qec qecVar = (qec) obj;
            if (qecVar.d.size() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            d.t(z2, "AddUserToGroupRequest must add exactly 1 user");
            qeh b2 = qeh.b(((qei) qecVar.d.get(0)).c);
            if (b2 == null) {
                b2 = qeh.UNKNOWN_TYPE;
            }
            if (b2 != qeh.PHONE) {
                z3 = false;
            }
            d.t(z3, "AddUserToGroupRequest must add a ChatEndpoint of type PHONE");
            aoad aoadVar3 = new aoad(null, null, null, null, null);
            atkm atkmVar4 = new atkm();
            qfb qfbVar5 = qecVar.c;
            if (qfbVar5 == null) {
                qfbVar5 = qfb.a;
            }
            qei qeiVar5 = qfbVar5.d;
            if (qeiVar5 == null) {
                qeiVar5 = qei.a;
            }
            atkmVar4.b(vyv.c(qeiVar5));
            qfb qfbVar6 = qecVar.c;
            if (qfbVar6 == null) {
                qfbVar6 = qfb.a;
            }
            atkmVar4.c(qfbVar6.c);
            atkmVar4.d(2);
            aoadVar3.Y(atkmVar4.a());
            aoadVar3.ab(vyv.c((qei) qecVar.d.get(0)));
            aoadVar3.Z(pendingIntent);
            if (((Boolean) vyw.b.e()).booleanValue()) {
                aoadVar3.aa(qecVar.e);
            }
            return aoadVar3.X();
        }
        qfy qfyVar = (qfy) obj;
        if (qfyVar.d.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "RemoveUserFromGroupRequest must add exactly 1 user");
        qeh b3 = qeh.b(((qei) qfyVar.d.get(0)).c);
        if (b3 == null) {
            b3 = qeh.UNKNOWN_TYPE;
        }
        if (b3 != qeh.PHONE) {
            z3 = false;
        }
        d.t(z3, "RemoveUserFromGroupRequest must add a ChatEndpoint of type PHONE");
        aoad aoadVar4 = new aoad((byte[]) null, (byte[]) null, (byte[]) null, (char[]) null);
        atkm atkmVar5 = new atkm();
        qfb qfbVar7 = qfyVar.c;
        if (qfbVar7 == null) {
            qfbVar7 = qfb.a;
        }
        qei qeiVar6 = qfbVar7.d;
        if (qeiVar6 == null) {
            qeiVar6 = qei.a;
        }
        atkmVar5.b(vyv.c(qeiVar6));
        qfb qfbVar8 = qfyVar.c;
        if (qfbVar8 == null) {
            qfbVar8 = qfb.a;
        }
        atkmVar5.c(qfbVar8.c);
        atkmVar5.d(2);
        aoadVar4.P(atkmVar5.a());
        aoadVar4.S(vyv.c((qei) qfyVar.d.get(0)));
        aoadVar4.Q(pendingIntent);
        if (((Boolean) vyw.b.e()).booleanValue()) {
            aoadVar4.R(qfyVar.e);
        }
        return aoadVar4.O();
    }

    @Override // defpackage.vyx
    public final /* synthetic */ String l(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        qfb qfbVar = ((qgw) obj).c;
                        if (qfbVar == null) {
                            qfbVar = qfb.a;
                        }
                        return "RcsConversationId: ".concat(String.valueOf(qfbVar.c));
                    }
                    qfb qfbVar2 = ((qgt) obj).c;
                    if (qfbVar2 == null) {
                        qfbVar2 = qfb.a;
                    }
                    return "RcsConversationId: ".concat(String.valueOf(qfbVar2.c));
                }
                return "RcsMessageId: ".concat(String.valueOf(((qgb) obj).d));
            }
            qfb qfbVar3 = ((qec) obj).c;
            if (qfbVar3 == null) {
                qfbVar3 = qfb.a;
            }
            return "RcsConversationId: ".concat(String.valueOf(qfbVar3.c));
        }
        qfb qfbVar4 = ((qfy) obj).c;
        if (qfbVar4 == null) {
            qfbVar4 = qfb.a;
        }
        return "RcsConversationId: ".concat(String.valueOf(qfbVar4.c));
    }

    @Override // defpackage.vyx
    public final String m() {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return "updateGroup";
                    }
                    return "triggerGroupNotification";
                }
                return "revokeMessage";
            }
            return "addUserToGroup";
        }
        return "removeUserFromGroup";
    }
}
