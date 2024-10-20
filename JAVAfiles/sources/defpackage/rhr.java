package defpackage;

import android.os.Bundle;
import android.os.PersistableBundle;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationEncryptionStatusAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rhr implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ rhr(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        PersistableBundle readFromStream;
        String o;
        String o2;
        Object apply;
        switch (this.a) {
            case 0:
                return new PersistableBundle((PersistableBundle) obj);
            case 1:
                xze xzeVar = UpdateConversationEncryptionStatusAction.a;
                return (qei) ((apdj) obj).a(qei.a, aozs.a());
            case 2:
                return (ActionParameters) rik.a((String) obj, ActionParameters.class, ActionParameters.class.getName());
            case 3:
                return ((ActionParameters) obj).g();
            case 4:
                return new Bundle((Bundle) obj);
            case 5:
                PersistableBundle persistableBundle = (PersistableBundle) obj;
                if (!yhx.d) {
                    return Optional.empty();
                }
                aoza aozaVar = new aoza();
                try {
                    persistableBundle.writeToStream(aozaVar);
                    return Optional.of(aozaVar.b().H());
                } catch (IOException e) {
                    xyo e2 = rib.a.e();
                    e2.H("IOException serializing PersistableBundle");
                    e2.r(e);
                    return Optional.empty();
                }
            case 6:
                return ((PersistableBundle) obj).getPersistableBundle("persistable_bundle_action_params");
            case 7:
                return new rhs((PersistableBundle) obj);
            case 8:
                byte[] bArr = (byte[]) obj;
                if (yhx.d) {
                    try {
                        readFromStream = PersistableBundle.readFromStream(aozb.w(bArr).m());
                        return Optional.of(readFromStream);
                    } catch (IOException e3) {
                        xyo e4 = rib.a.e();
                        e4.H("IOException deserializing PersistableBundle");
                        e4.r(e3);
                        return Optional.empty();
                    }
                }
                return Optional.empty();
            case 9:
                return ((ndr) ((Recipient) obj)).i();
            case 10:
                return a.aC(obj);
            case 11:
                return Boolean.valueOf(!tvu.e(((smr) obj).h()));
            case 12:
                return lqn.n((msh) obj);
            case 13:
                o = ((msh) obj).o(((Boolean) msw.d.e()).booleanValue());
                return o;
            case 14:
                sxo sxoVar = (sxo) obj;
                return new sxp[]{sxoVar.k, sxoVar.g, sxoVar.i};
            case 15:
                o2 = ((msh) obj).o(((Boolean) msw.d.e()).booleanValue());
                return o2;
            case 16:
                return a.aZ(obj);
            case 17:
                sfy sfyVar = (sfy) obj;
                sfyVar.g();
                return sfyVar;
            case 18:
                rkp rkpVar = (rkp) obj;
                int intValue = rkq.b().intValue();
                if (intValue < 70) {
                    agnc.t("is_c2p_only", intValue);
                }
                rkpVar.U(new agmg("conversation_participants_backup.is_c2p_only", 5));
                return rkpVar;
            case 19:
                rkp rkpVar2 = (rkp) obj;
                int intValue2 = rkq.b().intValue();
                if (intValue2 < 70) {
                    agnc.t("is_c2p_only", intValue2);
                }
                rkpVar2.U(new agoi("conversation_participants_backup.is_c2p_only", 1, 0));
                return rkpVar2;
            default:
                rkp rkpVar3 = (rkp) obj;
                Function[] functionArr = {new rhr(18), new rhr(19)};
                rkp[] rkpVarArr = new rkp[2];
                for (int i = 0; i < 2; i++) {
                    apply = functionArr[i].apply(new rkp());
                    rkpVarArr[i] = (rkp) apply;
                }
                rkpVar3.V(rkpVarArr);
                return rkpVar3;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
