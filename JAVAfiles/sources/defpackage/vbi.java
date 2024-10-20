package defpackage;

import android.text.TextUtils;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vbi implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ vbi(int i) {
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
        Object e;
        Object obj2;
        Object e2;
        switch (this.a) {
            case 0:
                xze xzeVar = vbm.a;
                return ((rtw) obj).a;
            case 1:
                return ((aoug) obj).name();
            case 2:
                xze xzeVar2 = vbm.a;
                return ((msh) obj).F().a;
            case 3:
                xze xzeVar3 = vbm.a;
                return Boolean.valueOf(((psv) obj).f());
            case 4:
                xze xzeVar4 = vbm.a;
                return ((sxo) obj).c;
            case 5:
                xze xzeVar5 = vbm.a;
                return ((rrx) obj).a;
            case 6:
                return ((msh) obj).g();
            case 7:
                return ((msh) obj).m();
            case 8:
                e = ((msh) obj).e();
                return e;
            case 9:
                return ((thm) obj).k();
            case 10:
                obj2 = ((qei) obj).d;
                return obj2;
            case 11:
                return Optional.of((qei) obj);
            case 12:
                return ((vcq) obj).b;
            case 13:
                angp angpVar = ((ango) obj).c;
                if (angpVar == null) {
                    angpVar = angp.a;
                }
                return angpVar.d;
            case 14:
                angp angpVar2 = ((ango) obj).c;
                if (angpVar2 == null) {
                    angpVar2 = angp.a;
                }
                return angpVar2.d;
            case 15:
                return ((nfw) obj).i();
            case 16:
                return (msh) ((Optional) obj).get();
            case 17:
                return ((nfw) obj).i();
            case 18:
                e2 = ((msh) obj).e();
                return e2;
            case 19:
                return (qei) ((msh) obj).e().get();
            default:
                alvi alviVar = vfa.a;
                ImsConfiguration imsConfiguration = ((Configuration) obj).mImsConfiguration;
                if (imsConfiguration == null) {
                    alvw i = vfa.a.i();
                    i.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "getIsJibe", 408, "RegisterPhoneRpcHandler.java")).q("Null IMS config");
                    return Optional.empty();
                }
                String str = imsConfiguration.mPcscfAddress;
                if (TextUtils.isEmpty(str)) {
                    alvw i2 = vfa.a.i();
                    i2.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "getIsJibe", 414, "RegisterPhoneRpcHandler.java")).q("Empty PCSCF address");
                    return Optional.empty();
                }
                boolean matches = ((Pattern) vfa.e.get()).matcher(str).matches();
                alvw d = vfa.a.d();
                d.X(alwp.a, "BugleNetwork");
                alvg alvgVar = (alvg) d;
                alvgVar.X(ydl.P, str);
                alvg alvgVar2 = (alvg) alvgVar.h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "getIsJibe", 422, "RegisterPhoneRpcHandler.java");
                Boolean valueOf = Boolean.valueOf(matches);
                alvgVar2.t("Backend isJibe:%b", valueOf);
                return Optional.of(valueOf);
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
